package Service;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import model.vo.Student;
public interface StudentService {
	public void WriteTxt(String fileName) throws IOException;
	public List<Student> ReadFromTxt(String fileName) throws IOException;
	public ResultSet queryForCondition(String[] data);
	public boolean deleteStudentController(String sid);
}
