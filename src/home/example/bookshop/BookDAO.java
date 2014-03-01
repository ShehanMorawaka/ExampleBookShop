package home.example.bookshop;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
//import java.text.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class BookDAO 
{
    public Connection conn = null;
    public Statement stmnt = null;
    
    String selectAllQuery = null;
    String insertQuery = null;
    String updateQuery = null;
    String deleteQuery = null;
    
    public List<Book> getAllBooks()
    {
      ArrayList<Book> allBookList = new ArrayList<Book>();
      MyConnection myCon = new MyConnection();
      conn = myCon.getConnection();
      try
        {
            stmnt = conn.createStatement();
        } 
        catch (SQLException ex) 
        {
            System.err.println("Create Statement Error!");
        }
      
        selectAllQuery = "SELECT * FROM bookstore.book";
        ResultSet resultSet = null;
        try 
        {
           resultSet  = stmnt.executeQuery(selectAllQuery);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Statement Execution Error!");
        }
        try {
            while(resultSet.next())
            {
                int b_No = resultSet.getInt("Book_No");
                String b_Title = resultSet.getString("Book_Title");
                int b_ISBN = resultSet.getInt("ISBN");
                String b_Au_FN = resultSet.getString("Author_FirstName");
                String b_Au_SN = resultSet.getString("Author_Surname");
                
                Book book = new Book(b_No, b_Title, b_ISBN, b_Au_FN, b_Au_SN);
                allBookList.add(book);
            }
        } 
        catch (SQLException ex) 
        {
            System.err.println("While loop makes an Error!");
        }
        
        finally
        {
            if (conn != null)
            {
                try 
                {
                    conn.close();
                }
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Connection!");
                }
            }
            
            if (stmnt != null)
            {
                try 
                {
                    stmnt.close();
                } 
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Statement!");
                }
            }
        }
        
        return allBookList;
    }
    
    public void insertBook(String t, int isbn, String au_FN, String au_SN)
    {
        insertQuery = "INSERT INTO `bookstore`.`book` "
                + "(`Book_Title`, `ISBN`, `Author_FirstName`, `Author_Surname`) "
                + "VALUES ('"+t+"', '"+isbn+"', '"+au_FN+"', '"+au_SN+"');";
        
        MyConnection myCon = new MyConnection();
        conn = myCon.getConnection();
        try
        {
            stmnt = conn.createStatement();
        } 
        catch (SQLException ex) 
        {
            System.err.println("Create Statement Error!");
        }
        try 
        {
            int result = 0;
            result = stmnt.executeUpdate(insertQuery);
//            stmnt.executeUpdate(insertQuery);
            
            if (result != 0)
            {
                JOptionPane.showMessageDialog(null, "Insertion Succeed!", "Good", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Insertion Failed!", "Bad", 0);
            }
        }
        catch (SQLException ex)
        {
            System.err.println("Error in execution of the Insert Query! \n "+ex.getMessage()+"");
        }
        
        finally
        {
            if (conn != null)
            {
                try 
                {
                    conn.close();
                }
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Connection!");
                }
            }
            
            if (stmnt != null)
            {
                try 
                {
                    stmnt.close();
                } 
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Statement!");
                }
            }
        }
    }
    
    public void updateBook(String t, int isbn, String au_FN, String au_SN)
    {
        updateQuery = "UPDATE `book` SET `ISBN`= '"+isbn+"' ,`Author_FirstName`= '"+au_FN+"',`Author_Surname`= '"+au_SN+"' WHERE `Book_Title`='"+t+"'";
        
        MyConnection myCon = new MyConnection();
        conn = myCon.getConnection();
        try
        {
            stmnt = conn.createStatement();
        } 
        catch (SQLException ex) 
        {
            System.err.println("Create Statement Error!");
        }
        try 
        {
            int result = 0;
            result = stmnt.executeUpdate(updateQuery);
            
            if (result != 0)
            {
                JOptionPane.showMessageDialog(null, "Update Succeed!", "Good", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Update Failed!", "Bad", 0);
            }
        }
        catch (SQLException ex)
        {
            System.err.println("Error in execution of the Update Query! \n "+ex.getMessage()+"");
        }
        
        finally
        {
            if (conn != null)
            {
                try 
                {
                    conn.close();
                }
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Connection!");
                }
            }
            
            if (stmnt != null)
            {
                try 
                {
                    stmnt.close();
                } 
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Statement!");
                }
            }
        }
    }
    
    public void deleteBook(int b_No)
    {
        int mesgResult = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (mesgResult == 0)
        {
//            System.err.println("OK Clicked!");
            deleteQuery = "DELETE FROM `book` WHERE `Book_No`= "+b_No+"";

            MyConnection myCon = new MyConnection();
            conn = myCon.getConnection();
            try
            {
                stmnt = conn.createStatement();
            } 
            catch (SQLException ex) 
            {
                System.err.println("Create Statement Error!");
            }
            try 
            {
                int result = stmnt.executeUpdate(deleteQuery);
                if (result != 0)
                {
                    JOptionPane.showMessageDialog(null, "Delete Succeed!", "Good", 1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Delete Failed!", "Bad", 0);
                }
            }
            catch (SQLException ex)
            {
                System.err.println("Error in execution of the Delete Query! \n "+ex.getMessage()+"");
            }

            finally
            {
                if (conn != null)
                {
                    try 
                    {
                        conn.close();
                    }
                    catch (SQLException ex)
                    {
                        System.err.println("Error in closing the Connection!");
                    }
                }

                if (stmnt != null)
                {
                    try 
                    {
                        stmnt.close();
                    } 
                    catch (SQLException ex)
                    {
                        System.err.println("Error in closing the Statement!");
                    }
                }
            }
        }
        else
        {
            if (mesgResult == 1)
            {
                System.err.println("NO Clicked!");
            }
            else
            {
                System.err.println("CANCEL Clicked!");
            }
        }
    }
    
    public Book getBookFromTitle(String getBookQuery)
    {
        Book book = new Book();
        
        MyConnection myCon = new MyConnection();
        conn = myCon.getConnection();
        try
          {
              stmnt = conn.createStatement();
          } 
          catch (SQLException ex) 
          {
              System.err.println("Create Statement Error!");
          }

          ResultSet resultSet = null;
          try 
          {
             resultSet  = stmnt.executeQuery(getBookQuery);
          } 
          catch (SQLException ex) 
          {
              System.err.println("Statement Execution Error!\n"+ex.getMessage());
          }
          try {
              while(resultSet.next())
              {
                  int b_No = resultSet.getInt("Book_No");
                  int b_ISBN = resultSet.getInt("ISBN");
                  String b_Au_FN = resultSet.getString("Author_FirstName");
                  String b_Au_SN = resultSet.getString("Author_Surname");

                  book.setBookNo(b_No);
                  book.setBookTitle(null);
                  book.setIsbn(b_ISBN);
                  book.setAuthorFirstName(b_Au_FN);
                  book.setAuthorSurname(b_Au_SN);
              }
          } 
          catch (SQLException ex) 
          {
              System.err.println("While loop makes an Error!\n"+ex.getMessage());
          }

          finally
          {
              if (conn != null)
              {
                  try 
                  {
                      conn.close();
                  }
                  catch (SQLException ex)
                  {
                      System.err.println("Error in closing the Connection!");
                  }
              }

              if (stmnt != null)
              {
                  try 
                  {
                      stmnt.close();
                  } 
                  catch (SQLException ex)
                  {
                      System.err.println("Error in closing the Statement!");
                  }
              }
          }


          return book;
    }
    
    public String[] getBookTitles()
    {
        String[] bookTitles = new String[30];
        int index = 0;
        
        MyConnection myCon = new MyConnection();
        conn = myCon.getConnection();
        try
        {
            stmnt = conn.createStatement();
        } 
        catch (SQLException ex) 
        {
            System.err.println("Create Statement Error!");
        }

        selectAllQuery = "SELECT `Book_Title` FROM `book`";
        ResultSet resultSet = null;
        try 
        {
           resultSet  = stmnt.executeQuery(selectAllQuery);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Statement Execution Error!\n"+ex.getMessage());
        }
        try 
        {
            while(resultSet.next())
            {                
                String b_Title = resultSet.getString("Book_Title");
                
                bookTitles[index] = b_Title;
                index++;
            }
        } 
        catch (SQLException ex) 
        {
            System.err.println("While loop makes an Error!\n"+ex.getMessage());
        }

        finally
        {
            if (conn != null)
            {
                try 
                {
                    conn.close();
                }
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Connection!");
                }
            }

            if (stmnt != null)
            {
                try 
                {
                    stmnt.close();
                } 
                catch (SQLException ex)
                {
                    System.err.println("Error in closing the Statement!");
                }
            }
        }
        
        return bookTitles;
    }
}
