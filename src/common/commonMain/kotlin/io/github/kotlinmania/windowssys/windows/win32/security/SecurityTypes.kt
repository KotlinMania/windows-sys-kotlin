package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public typealias NcryptDescriptorHandle = MutPtr<CVoid>

public typealias NcryptStreamHandle = MutPtr<CVoid>

public typealias ObjectSecurityInformation = UInt

public fun interface PlsaApCallPackageUntrustedFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaApCallPackageUntrusted = PlsaApCallPackageUntrustedFn?

public typealias PsecurityDescriptor = MutPtr<CVoid>

public typealias Psid = MutPtr<CVoid>

public typealias SaferLevelHandle = MutPtr<CVoid>

public typealias SecurityAutoInheritFlags = UInt

public typealias SecurityDescriptorControl = UShort

public typealias SecurityImpersonationLevel = Int

public fun interface SecThreadStartFn {
    public operator fun invoke(lpthreadparameter: MutPtr<CVoid>): UInt
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
