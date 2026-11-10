package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public typealias AceFlags = UInt

public typealias AceRevision = UInt

public typealias AclInformationClass = Int

public typealias AuditEventType = Int

public typealias ClaimSecurityAttributeFlags = UInt

public typealias ClaimSecurityAttributeValueType = UShort

public typealias CreateRestrictedTokenFlags = UInt

public typealias EnumPeriod = Int

public typealias Logon32Logon = UInt

public typealias Logon32Provider = UInt

public typealias MandatoryLevel = Int

public typealias NcryptDescriptorHandle = COpaquePointer?

public typealias NcryptStreamHandle = COpaquePointer?

public typealias ObjectSecurityInformation = UInt

public fun interface PlsaApCallPackageUntrustedFn {
    public operator fun invoke(clientrequest: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaApCallPackageUntrusted = PlsaApCallPackageUntrustedFn?

public typealias PsecurityDescriptor = COpaquePointer?

public typealias Psid = COpaquePointer?

public typealias SaferLevelHandle = COpaquePointer?

public typealias SecurityAutoInheritFlags = UInt

public typealias SecurityDescriptorControl = UShort

public typealias SecurityImpersonationLevel = Int

public fun interface SecThreadStartFn {
    public operator fun invoke(lpthreadparameter: COpaquePointer?): UInt
}

public typealias SecThreadStart = SecThreadStartFn?

public typealias SidNameUse = Int

public typealias SystemAuditObjectAceFlags = UInt

public typealias TokenAccessMask = UInt

public typealias TokenElevationType = Int

public typealias TokenInformationClass = Int

public typealias TokenMandatoryPolicyId = UInt

public typealias TokenPrivilegesAttributes = UInt

public typealias TokenType = Int

public typealias WellKnownSidType = Int
