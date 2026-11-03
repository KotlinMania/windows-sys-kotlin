package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface DBGPRINTFn {
    public operator fun invoke(format: PCSTR): UInt
}

public typealias DBGPRINT = DBGPRINTFn?

public fun interface DEREFERENCECONNECTIONFn {
    public operator fun invoke(primaryconnection: Long, connectiontodereference: Long): UInt
}

public typealias DEREFERENCECONNECTION = DEREFERENCECONNECTIONFn?

public typealias LDAP_RETCODE = Int

public fun interface NOTIFYOFNEWCONNECTIONFn {
    public operator fun invoke(primaryconnection: Long, referralfromconnection: Long, newdn: PCWSTR, hostname: PCSTR, newconnection: Long, portnumber: UInt, secauthidentity: Long, currentuser: Long, errorcodefrombind: UInt): Boolean
}

public typealias NOTIFYOFNEWCONNECTION = NOTIFYOFNEWCONNECTIONFn?

public typealias PLDAPSearch = Long

public fun interface QUERYCLIENTCERTFn {
    public operator fun invoke(connection: Long, trusted_cas: Long, ppcertificate: Long): Boolean
}

public typealias QUERYCLIENTCERT = QUERYCLIENTCERTFn?

public fun interface QUERYFORCONNECTIONFn {
    public operator fun invoke(primaryconnection: Long, referralfromconnection: Long, newdn: PCWSTR, hostname: PCSTR, portnumber: UInt, secauthidentity: Long, currentusertoken: Long, connectiontouse: Long): UInt
}

public typealias QUERYFORCONNECTION = QUERYFORCONNECTIONFn?

public fun interface VERIFYSERVERCERTFn {
    public operator fun invoke(connection: Long, pservercert: Long): Boolean
}

public typealias VERIFYSERVERCERT = VERIFYSERVERCERTFn?
