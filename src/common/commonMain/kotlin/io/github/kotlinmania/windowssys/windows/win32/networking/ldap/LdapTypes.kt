package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextIssuerListInfoEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public fun interface DbgprintFn {
    public operator fun invoke(format: Pcstr): UInt
}

public typealias Dbgprint = DbgprintFn?

public fun interface DereferenceconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr<Ldap>, connectiontodereference: MutPtr<Ldap>): UInt
}

public typealias Dereferenceconnection = DereferenceconnectionFn?

public typealias LdapRetcode = Int

public fun interface NotifyofnewconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr<Ldap>, referralfromconnection: MutPtr<Ldap>, newdn: Pcwstr, hostname: Pcstr, newconnection: MutPtr<Ldap>, portnumber: UInt, secauthidentity: MutPtr<CVoid>, currentuser: MutPtr<CVoid>, errorcodefrombind: UInt): Boolean
}

public typealias Notifyofnewconnection = NotifyofnewconnectionFn?

public typealias PLDAPSearch = Long

public fun interface QueryclientcertFn {
    public operator fun invoke(connection: MutPtr<Ldap>, trustedCas: MutPtr<SecPkgContextIssuerListInfoEx>, ppcertificate: MutPtr<MutPtr<CertContext>>): Boolean
}

public typealias Queryclientcert = QueryclientcertFn?

public fun interface QueryforconnectionFn {
    public operator fun invoke(primaryconnection: MutPtr<Ldap>, referralfromconnection: MutPtr<Ldap>, newdn: Pcwstr, hostname: Pcstr, portnumber: UInt, secauthidentity: MutPtr<CVoid>, currentusertoken: MutPtr<CVoid>, connectiontouse: MutPtr<MutPtr<Ldap>>): UInt
}

public typealias Queryforconnection = QueryforconnectionFn?

public fun interface VerifyservercertFn {
    public operator fun invoke(connection: MutPtr<Ldap>, pservercert: MutPtr<MutPtr<CertContext>>): Boolean
}

public typealias Verifyservercert = VerifyservercertFn?
