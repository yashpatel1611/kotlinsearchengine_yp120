package websearch

class SearchEngine(var map: Map<URL, WebPage>) {
    private var index: Map<String, List<SearchResult>> = mapOf()

    fun compileIndex() {
        for (pair in map){
            var page = pair.value
            var url = pair.key

        }
    }

    fun searchFor(query: String) {
        TODO()
    }
}

class SearchResult() {}

class SearchResultsSummary() {

}
