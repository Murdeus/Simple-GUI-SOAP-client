
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetColumns_QNAME = new QName("http://server/", "getColumns");
    private final static QName _AddContent_QNAME = new QName("http://server/", "addContent");
    private final static QName _DeleteContent_QNAME = new QName("http://server/", "deleteContent");
    private final static QName _GetContentResponse_QNAME = new QName("http://server/", "getContentResponse");
    private final static QName _GetContent_QNAME = new QName("http://server/", "getContent");
    private final static QName _ChangeContent_QNAME = new QName("http://server/", "changeContent");
    private final static QName _AddContentResponse_QNAME = new QName("http://server/", "addContentResponse");
    private final static QName _ChangeContentResponse_QNAME = new QName("http://server/", "changeContentResponse");
    private final static QName _DeleteContentResponse_QNAME = new QName("http://server/", "deleteContentResponse");
    private final static QName _GetColumnsResponse_QNAME = new QName("http://server/", "getColumnsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddContentResponse }
     * 
     */
    public AddContentResponse createAddContentResponse() {
        return new AddContentResponse();
    }

    /**
     * Create an instance of {@link ChangeContentResponse }
     * 
     */
    public ChangeContentResponse createChangeContentResponse() {
        return new ChangeContentResponse();
    }

    /**
     * Create an instance of {@link DeleteContentResponse }
     * 
     */
    public DeleteContentResponse createDeleteContentResponse() {
        return new DeleteContentResponse();
    }

    /**
     * Create an instance of {@link GetColumnsResponse }
     * 
     */
    public GetColumnsResponse createGetColumnsResponse() {
        return new GetColumnsResponse();
    }

    /**
     * Create an instance of {@link ChangeContent }
     * 
     */
    public ChangeContent createChangeContent() {
        return new ChangeContent();
    }

    /**
     * Create an instance of {@link GetContent }
     * 
     */
    public GetContent createGetContent() {
        return new GetContent();
    }

    /**
     * Create an instance of {@link GetContentResponse }
     * 
     */
    public GetContentResponse createGetContentResponse() {
        return new GetContentResponse();
    }

    /**
     * Create an instance of {@link AddContent }
     * 
     */
    public AddContent createAddContent() {
        return new AddContent();
    }

    /**
     * Create an instance of {@link DeleteContent }
     * 
     */
    public DeleteContent createDeleteContent() {
        return new DeleteContent();
    }

    /**
     * Create an instance of {@link GetColumns }
     * 
     */
    public GetColumns createGetColumns() {
        return new GetColumns();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetColumns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getColumns")
    public JAXBElement<GetColumns> createGetColumns(GetColumns value) {
        return new JAXBElement<GetColumns>(_GetColumns_QNAME, GetColumns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addContent")
    public JAXBElement<AddContent> createAddContent(AddContent value) {
        return new JAXBElement<AddContent>(_AddContent_QNAME, AddContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteContent")
    public JAXBElement<DeleteContent> createDeleteContent(DeleteContent value) {
        return new JAXBElement<DeleteContent>(_DeleteContent_QNAME, DeleteContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getContentResponse")
    public JAXBElement<GetContentResponse> createGetContentResponse(GetContentResponse value) {
        return new JAXBElement<GetContentResponse>(_GetContentResponse_QNAME, GetContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getContent")
    public JAXBElement<GetContent> createGetContent(GetContent value) {
        return new JAXBElement<GetContent>(_GetContent_QNAME, GetContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "changeContent")
    public JAXBElement<ChangeContent> createChangeContent(ChangeContent value) {
        return new JAXBElement<ChangeContent>(_ChangeContent_QNAME, ChangeContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addContentResponse")
    public JAXBElement<AddContentResponse> createAddContentResponse(AddContentResponse value) {
        return new JAXBElement<AddContentResponse>(_AddContentResponse_QNAME, AddContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "changeContentResponse")
    public JAXBElement<ChangeContentResponse> createChangeContentResponse(ChangeContentResponse value) {
        return new JAXBElement<ChangeContentResponse>(_ChangeContentResponse_QNAME, ChangeContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteContentResponse")
    public JAXBElement<DeleteContentResponse> createDeleteContentResponse(DeleteContentResponse value) {
        return new JAXBElement<DeleteContentResponse>(_DeleteContentResponse_QNAME, DeleteContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetColumnsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getColumnsResponse")
    public JAXBElement<GetColumnsResponse> createGetColumnsResponse(GetColumnsResponse value) {
        return new JAXBElement<GetColumnsResponse>(_GetColumnsResponse_QNAME, GetColumnsResponse.class, null, value);
    }

}
