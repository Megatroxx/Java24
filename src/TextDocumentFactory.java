public class TextDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        // Реализация открытия существующего текстового документа
        return new TextDocument();
    }
}