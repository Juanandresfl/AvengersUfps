package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Clasificacion;
import entities.Estado;
import entities.Genero;
import entities.Heroe;
import entities.Pelicula;
import services.ClasificacionDao;
import services.EstadoDao;
import services.GeneroDao;
import services.HeroeDao;
import services.PeliculaDao;

/**
 * Servlet implementation class EditarPeliculaController
 */
@WebServlet("/EditarPeliculaController")
public class EditarPeliculaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarPeliculaController() {
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
		doGet(request, response);
		
	  	
      	int id=Integer.parseInt(request.getParameter("id"));    	
		String nombre=request.getParameter("nombre");
		int fechaL=Integer.parseInt(request.getParameter("fechaL"));
		int fechaS=Integer.parseInt(request.getParameter("fechaS"));
		String sinopsis=request.getParameter("sinopsis");
		String clasificacion=request.getParameter("clasificacion");

		ClasificacionDao cDao=new ClasificacionDao();
		Clasificacion c=cDao.find(clasificacion);
		
		PeliculaDao pDao=new PeliculaDao();		
		if(pDao.find(id)!=null) {
		Pelicula p=pDao.find(id);
		p.setNombre(nombre);
		p.setAnolanzamiento(fechaL);
		p.setAnosecuencia(fechaS);
		p.setSinopsis(sinopsis);
		p.setClasificacionBean(c);
		
		pDao.update(p);		
		response.sendRedirect("index.jsp");
	}

}
}
