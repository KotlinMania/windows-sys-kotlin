package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public fun interface DbgprintFn {
    public operator fun invoke(format: Pcstr): UInt
}

public typealias Dbgprint = DbgprintFn?

public fun interface DereferenceconnectionFn {
    public operator fun invoke(primaryconnection: COpaquePointer?, connectiontodereference: COpaquePointer?): UInt
}

public typealias Dereferenceconnection = DereferenceconnectionFn?

public typealias LdapRetcode = Int

public fun interface NotifyofnewconnectionFn {
    public operator fun invoke(primaryconnection: COpaquePointer?, referralfromconnection: COpaquePointer?, newdn: Pcwstr, hostname: Pcstr, newconnection: COpaquePointer?, portnumber: UInt, secauthidentity: COpaquePointer?, currentuser: COpaquePointer?, errorcodefrombind: UInt): Boolean
}

public typealias Notifyofnewconnection = NotifyofnewconnectionFn?

public typealias PLDAPSearch = Long

public fun interface QueryclientcertFn {
    public operator fun invoke(connection: COpaquePointer?, trustedCas: COpaquePointer?, ppcertificate: COpaquePointer?): Boolean
}

public typealias Queryclientcert = QueryclientcertFn?

public fun interface QueryforconnectionFn {
    public operator fun invoke(primaryconnection: COpaquePointer?, referralfromconnection: COpaquePointer?, newdn: Pcwstr, hostname: Pcstr, portnumber: UInt, secauthidentity: COpaquePointer?, currentusertoken: COpaquePointer?, connectiontouse: COpaquePointer?): UInt
}

public typealias Queryforconnection = QueryforconnectionFn?

public fun interface VerifyservercertFn {
    public operator fun invoke(connection: COpaquePointer?, pservercert: COpaquePointer?): Boolean
}

public typealias Verifyservercert = VerifyservercertFn?
