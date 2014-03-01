package home.example.bookshop;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "book", catalog = "bookstore", schema = "")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByBookNo", query = "SELECT b FROM Book b WHERE b.bookNo = :bookNo"),
    @NamedQuery(name = "Book.findByBookTitle", query = "SELECT b FROM Book b WHERE b.bookTitle = :bookTitle"),
    @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Book.findByAuthorFirstName", query = "SELECT b FROM Book b WHERE b.authorFirstName = :authorFirstName"),
    @NamedQuery(name = "Book.findByAuthorSurname", query = "SELECT b FROM Book b WHERE b.authorSurname = :authorSurname")})

public class Book implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Book_No")
    private Integer bookNo;
    @Basic(optional = false)
    @Column(name = "Book_Title")
    private String bookTitle;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private int isbn;
    @Basic(optional = false)
    @Column(name = "Author_FirstName")
    private String authorFirstName;
    @Basic(optional = false)
    @Column(name = "Author_Surname")
    
    private String authorSurname;

    public Book() {
    }

    public Book(Integer bookNo) {
        this.bookNo = bookNo;
    }

    public Book(Integer bookNo, String bookTitle, int isbn, String authorFirstName, String authorSurname) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.isbn = isbn;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
    }

    public Integer getBookNo() {
        return bookNo;
    }

    public void setBookNo(Integer bookNo) {
        Integer oldBookNo = this.bookNo;
        this.bookNo = bookNo;
        changeSupport.firePropertyChange("bookNo", oldBookNo, bookNo);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        String oldBookTitle = this.bookTitle;
        this.bookTitle = bookTitle;
        changeSupport.firePropertyChange("bookTitle", oldBookTitle, bookTitle);
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        int oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        String oldAuthorFirstName = this.authorFirstName;
        this.authorFirstName = authorFirstName;
        changeSupport.firePropertyChange("authorFirstName", oldAuthorFirstName, authorFirstName);
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        String oldAuthorSurname = this.authorSurname;
        this.authorSurname = authorSurname;
        changeSupport.firePropertyChange("authorSurname", oldAuthorSurname, authorSurname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookNo != null ? bookNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.bookNo == null && other.bookNo != null) || (this.bookNo != null && !this.bookNo.equals(other.bookNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "home.example.bookshop.Book[ bookNo=" + bookNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}