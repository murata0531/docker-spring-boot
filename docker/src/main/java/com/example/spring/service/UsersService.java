@Service
@Transactional
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}