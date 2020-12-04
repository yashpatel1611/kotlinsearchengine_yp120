package websearch

class SearchEngine(var map: Map<URL, WebPage>) {
    private var index: Map<String, List<SearchResult>> = mapOf()

    fun compileIndex(): List<Pair<String, URL>> {
        var wordUrlMap = listOf<Pair<String, URL>>()
        for (pair in map) {
            var page = pair.value
            var url = pair.key
            var words = page.extractWords()
            wordUrlMap = words.map { it to url }
        }
    }

    fun searchFor(query: String) {
        TODO()
    }
}

class SearchResult()

class SearchResultsSummary()
