package adapterPattern;

    public class librarySystemAdapter implements schoolManagementApp {

        private librarySystem books;

        public librarySystemAdapter(librarySystem books){
            this.books = books;
        }
        @Override
        public String integrateSystem(){
            return books.manageBooks();
        }
    }