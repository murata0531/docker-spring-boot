@Controller
@RequestMapping("users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping(path = "list")
    String list(Model model) {
        List<Users> users = usersService.findAll();
        model.addAttribute("users", users);
        return "users/list";
    }
}