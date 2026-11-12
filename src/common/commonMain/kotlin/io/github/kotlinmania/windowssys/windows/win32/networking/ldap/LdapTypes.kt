package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public fun interface DbgprintFn {
    public operator fun invoke(format: Pcstr): UInt
}

public typealias Dbgprint = DbgprintFn?

public fun interface DereferenceconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr, connectiontodereference: MutPtr): UInt
}

public typealias Dereferenceconnection = DereferenceconnectionFn?

public typealias LdapRetcode = Int

public fun interface NotifyofnewconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr, referralfromconnection: MutPtr, newdn: Pcwstr, hostname: Pcstr, newconnection: MutPtr, portnumber: UInt, secauthidentity: MutPtr, currentuser: MutPtr, errorcodefrombind: UInt): Boolean
}

public typealias Notifyofnewconnection = NotifyofnewconnectionFn?

public typealias PLDAPSearch = Long

public fun interface QueryclientcertFn {
    public operator fun invoke(connection: MutPtr, trustedCas: MutPtr, ppcertificate: MutPtr): Boolean
}

public typealias Queryclientcert = QueryclientcertFn?

public fun interface QueryforconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr, referralfromconnection: MutPtr, newdn: Pcwstr, hostname: Pcstr, portnumber: UInt, secauthidentity: MutPtr, currentusertoken: MutPtr, connectiontouse: MutPtr): UInt
}

public typealias Queryforconnection = QueryforconnectionFn?

public fun interface VerifyservercertFn {
    public operator fun invoke(connection: MutPtr, pservercert: MutPtr): Boolean
}

public typealias Verifyservercert = VerifyservercertFn?
