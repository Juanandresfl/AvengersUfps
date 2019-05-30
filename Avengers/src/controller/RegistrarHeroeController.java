package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Estado;
import entities.Genero;
import entities.Heroe;
import services.EstadoDao;
import services.GeneroDao;
import services.HeroeDao;

/**
 * Servlet implementation class RegistrarHeroeController
 */
@WebServlet("/RegistrarHeroeController")
public class RegistrarHeroeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarHeroeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		
		
		String nombre=request.getParameter("nombre");
		String heroe=request.getParameter("heroe");
		String genero=request.getParameter("genero");
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		String arma=request.getParameter("arma");
		SimpleDateFormat fecha1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat fecha2 = new SimpleDateFormat("yyyy-MM-dd");
		
			
		try {
			
			Date fechaNac = fecha1.parse(request.getParameter("fechaNac"));
			Date fechaAp=fecha2.parse(request.getParameter("fechaAp"));
			
			Heroe h= new Heroe();
			GeneroDao gDao =new GeneroDao();
			EstadoDao eDao=new EstadoDao();
			
			Genero g= gDao.find(genero);
			Estado e= eDao.find(estado);
			
			h.setNombre(nombre);
			h.setHeroe(heroe);
			h.setGeneroBean(g);
			h.setEstadoBean(e);
			h.setDescripcion("MATAR GENTE");
			h.setArma("bolillo");
			h.setFechanacimiento(fechaNac);
			h.setFechaaparicion(fechaAp);
			
			HeroeDao hDao= new HeroeDao();
			hDao.insert(h);
			
			response.sendRedirect("index.jsp");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
