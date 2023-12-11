public abstract class Application {
    private ICreateDocument documentFactory;

    public Application(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        IDocument document = documentFactory.createNew();
        // Реализация создания нового документа
    }

    public void openDocument() {
        IDocument document = documentFactory.createOpen();
        // Реализация открытия существующего документа
    }
}