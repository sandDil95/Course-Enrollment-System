
package nsbmenrolmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class javadbconnection {
    String url="jdbc:mysql://localhost:3306/nsbmenrolsystem"; //access database
    String username="root";
    String password="";
    Connection conn=null;
    PreparedStatement pst=null;
    String eUsername;
    String ePassword;
    String name;
    
    javadbconnection(){
        
    }
    
    javadbconnection(String eUsername,String ePassword){
        this.eUsername=eUsername;
        this.ePassword=ePassword;
    }
    private static int count = 0;
    
    boolean checking(){//checking the logging person is suitable or not
        
        boolean flag=false;
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password); //create connection with database
            String query="SELECT username,password FROM studentlogin";
            pst=conn.prepareStatement(query);
            ResultSet res=pst.executeQuery(query);//execute query
            
            while(res.next()){//point to next record
                String dbUsername=res.getString("username");//get data from username column , students table,nsbm database
                String dbPassword=res.getString("password");//get data from password column , students table,nsbm database
            
                if(eUsername.equals(dbUsername)&&ePassword.equals(dbPassword)){//check entered username and password matching with data in database
                    flag=true;
                }
            }  
        }catch(Exception e){
            flag=false;
            return flag;
        }finally{
            try{
                if(pst!=null){
                    pst.close();//close the statement
                }
                if(conn!=null){
                    conn.close();//close the connection
                }
            }catch(Exception e){}
        } 
        return flag;
    }
    
    boolean addUndergraduateStudent(studentDetails stdDe){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO undergraduate VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            
            pst.setString(1,stdDe.getUsername());
            pst.setInt(2,stdDe.getRegNo());//add values to sql query
            pst.setString(3,stdDe.getName());
            pst.setString(4,stdDe.getFaculty());
            pst.setString(5,stdDe.getNic());
            pst.setString(6,stdDe.getDob());
            pst.setString(7,stdDe.getGender());
            pst.setInt(8,stdDe.getpNo());
            pst.setString(9,stdDe.getAddress());
            pst.setInt(10,stdDe.getRegYear());
            pst.setString(11,stdDe.getRegMonth());
            pst.setString(12,stdDe.getSubject1());
            pst.setString(13,stdDe.getSubject1Res());
            pst.setString(14,stdDe.getSubject2());
            pst.setString(15,stdDe.getSubject2Res());
            pst.setString(16,stdDe.getSubject3());
            pst.setString(17,stdDe.getSubject3Res());
            pst.setInt(18,stdDe.getIslandRank());
            pst.setFloat(19,stdDe.getzScore());
            pst.setString(20,stdDe.geteMail());
            
            pst.executeUpdate();//execute sql query and insert value to database
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
        }finally{
            try{
               if(pst!=null){
                   pst.close();
               }
               if(conn!=null){
                   conn.close();
               }
            }catch(Exception e){
               
            }
        }
    }
    
    boolean addPostgraduateStudent(pstudentDetails pstd){
       try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO postgraduate VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setInt(1,pstd.getRegNo());//add values to sql query
            pst.setString(2,pstd.getUsername());
            pst.setString(3,pstd.getName());
            pst.setString(4,pstd.getFaculty());
            pst.setString(5,pstd.getGender());
            pst.setString(6,pstd.getDob());
            pst.setInt(7,pstd.getpNo());
            pst.setString(8,pstd.geteMail());
            pst.setInt(9,pstd.getRegYear());
            pst.setString(10,pstd.getRegMonth());
            pst.setString(11,pstd.getAddress());
            pst.setString(12,pstd.getQualification());
            pst.setString(13,pstd.getNic());
            
            pst.executeUpdate();//execute sql query and insert value to database
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
        }finally{
            try{
               if(pst!=null){
                   pst.close();
               }
               if(conn!=null){
                   conn.close();
               }
            }catch(Exception e){
               
            }
        } 
    }
    
    boolean addComputingSubject(computingSubDetails c){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO socsub VALUES (?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setString(1,c.getUsername());
            pst.setString(2,c.getSub1());
            pst.setString(3,c.getSub2());
            pst.setString(4,c.getSub3());
            pst.setString(5,c.getSub4());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }finally{
            try{
               if(pst!=null){
                   pst.close();
               }
               if(conn!=null){
                   conn.close();
               }
            }catch(Exception e){
               
            }
        } 
    }
    boolean paddcomputingsubject(pcomputingSubDetails c){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO socsubp VALUES (?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setString(1, c.getUsername());
            pst.setString(2, c.getFsub1());
            pst.setString(3, c.getFsub2());
            pst.setString(4, c.getFsub3());
            pst.setString(5, c.getFsub4());
            pst.setString(6, c.getSsub1());
            pst.setString(7, c.getSsub2());
            pst.setString(8, c.getSsub3());
            pst.setString(9, c.getSsub4());
            
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
        }finally{
            try{
               if(pst!=null){
                   pst.close();
               }
               if(conn!=null){
                   conn.close();
               }
            }catch(Exception e){
               
            }
        }
    }
    boolean paymentcost(financeworks f){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO finance VALUES (?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setString(1,f.getName());
            pst.setDouble(2,f.getPayment());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    boolean resultenterin(resultentering r){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO socresult VALUES (?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setString(1,r.getName());
            pst.setString(2,r.getProgramming());
            pst.setString(3,r.getDsa());
            pst.setString(4,r.getDbase());
            pst.setString(5,r.getSub1());
            pst.setString(6,r.getSub2());
            pst.setString(7,r.getSub3());
            pst.setString(8,r.getSub4());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    boolean resultenterin1(resultentering1 r){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO socresult1 VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            
            pst.setString(1,r.getName());
            pst.setString(2,r.getProgramming());
            pst.setString(3,r.getDsa());
            pst.setString(4,r.getDbase());
            pst.setString(5,r.getFsub1());
            pst.setString(6,r.getFsub2());
            pst.setString(7,r.getFsub3());
            pst.setString(8,r.getFsub4());
            pst.setString(9,r.getApro());
            pst.setString(10,r.getAdstruct());
            pst.setString(11,r.getSdevelop());
            pst.setString(12,r.getSsub1());
            pst.setString(13,r.getSsub2());
            pst.setString(14,r.getSsub3());
            pst.setString(15,r.getSsub4());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    boolean addlec(lecture l){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO lecturer VALUES (?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setInt(1,l.getRegno());
            pst.setString(2,l.getName());
            pst.setInt(3,l.getPno());
            pst.setString(4,l.getEmail());
            pst.setString(5,l.getAddress());
            pst.setString(6,l.getSubject());
            pst.setString(7,l.getNic());
            pst.setString(8,l.getGender());
            pst.setString(9,l.getEdqual());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    boolean addinstructor(instructr l){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO instructor VALUES (?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setInt(1,l.getRegno());
            pst.setString(2,l.getName());
            pst.setInt(3,l.getPno());
            pst.setString(4,l.getEmail());
            pst.setString(5,l.getAddress());
            pst.setString(6,l.getSubject());
            pst.setString(7,l.getNic());
            pst.setString(8,l.getGender());
            pst.setString(9,l.getQual());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    boolean cozeadding(courseadding a){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO subjects VALUES (?,?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setString(1,a.getName());
            pst.setString(2,a.getCode());
            pst.setDouble(3,a.getPayment());
            pst.setInt(4,a.getCredit());
            pst.executeUpdate();
            return true;
            
        }catch(Exception e){
            return false;
        }
    }
    boolean addpayment(paymentset p){
        try{
            conn=DriverManager.getConnection(url, username, password);
            String query="INSERT INTO finance VALUES (?,?,?)";
            pst=conn.prepareStatement(query);
            pst.setString(1,p.getName());
            pst.setDouble(2,p.getPayment());
            pst.setString(3,p.getPaid());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
