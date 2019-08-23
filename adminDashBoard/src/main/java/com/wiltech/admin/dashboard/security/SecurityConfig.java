package com.wiltech.admin.dashboard.security;

/**
 * Created by BhupendraKumar on 7/12/18.
 */
//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

    //    @Autowired
    //    private LoginSuccessHandler loginSuccessHandler;
    //
    //    @Autowired
    //    private LoginAccessDeniedHandler loginAccessDeniedHandler;
    //
    //    @Override
    //    protected void configure(final HttpSecurity http) throws Exception {
    //        http.authorizeRequests()
    //                .antMatchers("/", "/**").permitAll()
    //                .anyRequest().authenticated()
    //                .and()
    //                .formLogin().successHandler(loginSuccessHandler)
    //                .loginPage("/login")
    //                .permitAll()
    //                .and()
    //                .logout().invalidateHttpSession(true)
    //                .clearAuthentication(true)
    //                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
    //                .logoutSuccessUrl("/login?logout")
    //                .permitAll()
    //                .and()
    //                .exceptionHandling().accessDeniedHandler(loginAccessDeniedHandler).and().csrf().disable()
    //        ;
    //    }
    //
    //    @Override
    //    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
    //        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
    //                .and()
    //                .withUser("admin").password("{noop}nimda").roles("ADMIN");
    //    }
}
