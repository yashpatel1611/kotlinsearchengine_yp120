package websearch

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val html =
        """
            <html>
              <body>
                <p>this is a.,., simple document</p>
              </body>
            </html>"""

    val htmlDocument: Document = Jsoup.parse(html)

    val webPage = WebPage(htmlDocument)
    print(webPage.extractWords())
    var se = SearchEngine(mapOf(URL("www.test.come") to webPage))
    print(se.compileIndex())
}

class URL(var url: String) {
    override fun toString(): String {
        return url
    }
}

class WebPage(var doc: Document) {
    fun extractWords(): List<String> {
        val allWords = doc.text().split("[., ]".toRegex())
        return allWords.filter { it !in ".," }
    }
}
