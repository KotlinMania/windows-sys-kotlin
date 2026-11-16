package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public typealias NcryptDescriptorHandle = MutPtr

public typealias NcryptStreamHandle = MutPtr

public typealias ObjectSecurityInformation = UInt

public fun interface PlsaApCallPackageUntrustedFn {
    public operator fun invoke(clientrequest: ConstPtr, protocolsubmitbuffer: ConstPtr, clientbufferbase: ConstPtr, submitbufferlength: UInt, protocolreturnbuffer: MutPtr, returnbufferlength: MutPtr, protocolstatus: MutPtr): Ntstatus
}

public typealias PlsaApCallPackageUntrusted = PlsaApCallPackageUntrustedFn?

public typealias PsecurityDescriptor = MutPtr

public typealias Psid = MutPtr

public typealias SaferLevelHandle = MutPtr

public typealias SecurityAutoInheritFlags = UInt

public typealias SecurityDescriptorControl = UShort

public typealias SecurityImpersonationLevel = Int

public fun interface SecThreadStartFn {
    public operator fun invoke(lpthreadparameter: MutPtr): UInt
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
