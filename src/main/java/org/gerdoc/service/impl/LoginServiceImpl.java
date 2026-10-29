rpackage org.gerdoc.service.impl;

import org.gerdoc.dao.LoginDao;
import org.gerdoc.dao.impl.LoginDaoImpl;
import org.gerdoc.model.Login;
import org.gerdoc.service.LoginService;

import java.util.List;

public class LoginServiceImpl implements LoginService
{
    private LoginDao loginDao;

    public LoginServiceImpl( )
    {
        this.loginDao = new LoginDaoImpl( );
    }

    @Override
    public List<Login> findAll()
    {
        return loginDao.findAll( );
    }

    @Override
    public Login findById(Long id)
    {
        return loginDao.findById( id );
    }

    @Override
    public void save(Login login)
    {
        loginDao.save( login );
    }

    @Override
    public void deleteById(Long id)
    {
        loginDao.deleteById( id );
    }

    @Override
    public void update(Login login)
    {
        loginDao.update( login );
    }
}
