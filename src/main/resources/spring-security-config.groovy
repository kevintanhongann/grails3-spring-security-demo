grails.plugin.springsecurity.interceptUrlMap = [
        '/':                  ['permitAll'],
        '/admin/*':           ['ROLE_ADMIN']
]

grails.plugin.springsecurity.active=false