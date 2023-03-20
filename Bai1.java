class ChuyenXe{
	public void MaSoChuyen(){
		System.out.println("Ma so chuyen xe : ");
	}
	public void HovaTen(){
		System.out.println("Ho va Ten Tai Xe:");
	}
public void Soxe(){
		System.out.println("So xe : ");
	}
	public void Doanhthu(){
		System.out.println("Doanh thu:");
	}
}
class ChuyenXeNoiThanh extends ChuyenXe{
	public void SoTuyen(){
		System.out.println("Tuyen TanBinh-BinhTan");
    }
	public void Sokmdiduoc(){
		System.out.println("So km can di: 7km!");
	}
 @Override
	public void Doanhthu(){
		System.out.println(" Doanh thu cua chuyen xe noi thanh: 200.000");
	}
}
class ChuyenXeNgoaiThanh extends ChuyenXe{
	public void NoiDen(){
		System.out.println("Sai Gon-BenTre");
	}
	public void SoNgay(){
		System.out.println("2");
	}
	 @Override 
	public void Doanhthu(){
		System.out.println(" Doanh thu la : 2.000.000 !");
	}
}
public class Bai1{
	public static void main (String [] args) {
		ChuyenXe cx = new ChuyenXe();
	
	System.out.println("===Chuyen xe Noi Thanh=== ");
		ChuyenXeNoiThanh cxt = new ChuyenXeNoiThanh();
		cxt.SoTuyen();
		cxt.Sokmdiduoc();
		cx = new ChuyenXeNoiThanh();
		cx.Doanhthu();

System.out.println("===Chuyen xe Ngoai Thanh ===");
		ChuyenXeNgoaiThanh cxn = new ChuyenXeNgoaiThanh();
		cxn.NoiDen();
		cxn.SoNgay();
		cx = new ChuyenXeNgoaiThanh();
		cx.Doanhthu(); 
	}
} 
    
