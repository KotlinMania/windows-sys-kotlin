@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ACCESS_ALLOWED_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class ACCESS_ALLOWED_CALLBACK_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class ACCESS_ALLOWED_CALLBACK_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class ACCESS_ALLOWED_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class ACCESS_DENIED_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class ACCESS_DENIED_CALLBACK_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class ACCESS_DENIED_CALLBACK_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class ACCESS_DENIED_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class ACCESS_REASONS(public var Data: UIntArray = UIntArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACCESS_REASONS) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class ACE_HEADER(
    public var AceType: UByte = 0u,
    public var AceFlags: UByte = 0u,
    public var AceSize: UShort = 0u,
)

public data class ACL(
    public var AclRevision: UByte = 0u,
    public var Sbz1: UByte = 0u,
    public var AclSize: UShort = 0u,
    public var AceCount: UShort = 0u,
    public var Sbz2: UShort = 0u,
)

public data class ACL_REVISION_INFORMATION(public var AclRevision: UInt = 0u)

public data class ACL_SIZE_INFORMATION(
    public var AceCount: UInt = 0u,
    public var AclBytesInUse: UInt = 0u,
    public var AclBytesFree: UInt = 0u,
)

public data class CLAIM_SECURITY_ATTRIBUTES_INFORMATION(
    public var Version: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var AttributeCount: UInt = 0u,
    public var Attribute: CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0 = CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0(),
)

public data class CLAIM_SECURITY_ATTRIBUTES_INFORMATION_0(public var pAttributeV1: Long = 0L)

public data class CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE(public var Version: ULong = 0uL, public var Name: PWSTR = 0L)

public data class CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE(public var pValue: Long = 0L, public var ValueLength: UInt = 0u)

public data class CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1(
    public var Name: UInt = 0u,
    public var ValueType: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 0u,
    public var ValueCount: UInt = 0u,
    public var Values: CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0 = CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0(),
)

public data class CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0(
    public var pInt64: UIntArray = UIntArray(1),
    public var pUint64: UIntArray = UIntArray(1),
    public var ppString: UIntArray = UIntArray(1),
    public var pFqbn: UIntArray = UIntArray(1),
    public var pOctetString: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1_0) return false
        if (!this.pInt64.contentEquals(other.pInt64)) return false
        if (!this.pUint64.contentEquals(other.pUint64)) return false
        if (!this.ppString.contentEquals(other.ppString)) return false
        if (!this.pFqbn.contentEquals(other.pFqbn)) return false
        if (!this.pOctetString.contentEquals(other.pOctetString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pInt64.contentHashCode()
        result = 31 * result + this.pUint64.contentHashCode()
        result = 31 * result + this.ppString.contentHashCode()
        result = 31 * result + this.pFqbn.contentHashCode()
        result = 31 * result + this.pOctetString.contentHashCode()
        return result
    }
}

public data class CLAIM_SECURITY_ATTRIBUTE_V1(
    public var Name: PWSTR = 0L,
    public var ValueType: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var ValueCount: UInt = 0u,
    public var Values: CLAIM_SECURITY_ATTRIBUTE_V1_0 = CLAIM_SECURITY_ATTRIBUTE_V1_0(),
)

public data class CLAIM_SECURITY_ATTRIBUTE_V1_0(
    public var pInt64: Long = 0L,
    public var pUint64: Long = 0L,
    public var ppString: Long = 0L,
    public var pFqbn: Long = 0L,
    public var pOctetString: Long = 0L,
)

public data class GENERIC_MAPPING(
    public var GenericRead: UInt = 0u,
    public var GenericWrite: UInt = 0u,
    public var GenericExecute: UInt = 0u,
    public var GenericAll: UInt = 0u,
)

public data class LLFILETIME(public var Anonymous: LLFILETIME_0 = LLFILETIME_0())

public data class LLFILETIME_0(public var ll: Long = 0L, public var ft: Foundation.FILETIME = Foundation.FILETIME())

public data class LUID_AND_ATTRIBUTES(public var Luid: Foundation.LUID = Foundation.LUID(), public var Attributes: TOKEN_PRIVILEGES_ATTRIBUTES = 0u)

public data class OBJECT_TYPE_LIST(
    public var Level: UShort = 0u,
    public var Sbz: UShort = 0u,
    public var ObjectType: Long = 0L,
)

public data class PRIVILEGE_SET(
    public var PrivilegeCount: UInt = 0u,
    public var Control: UInt = 0u,
    public var Privilege: List<LUID_AND_ATTRIBUTES> = List(1) { LUID_AND_ATTRIBUTES() },
)

public data class QUOTA_LIMITS(
    public var PagedPoolLimit: ULong = 0uL,
    public var NonPagedPoolLimit: ULong = 0uL,
    public var MinimumWorkingSetSize: ULong = 0uL,
    public var MaximumWorkingSetSize: ULong = 0uL,
    public var PagefileLimit: ULong = 0uL,
    public var TimeLimit: Long = 0L,
)

public data class SECURITY_ATTRIBUTES(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: Long = 0L,
    public var bInheritHandle: BOOL = 0,
)

public data class SECURITY_CAPABILITIES(
    public var AppContainerSid: PSID = 0L,
    public var Capabilities: Long = 0L,
    public var CapabilityCount: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class SECURITY_DESCRIPTOR(
    public var Revision: UByte = 0u,
    public var Sbz1: UByte = 0u,
    public var Control: SECURITY_DESCRIPTOR_CONTROL = 0u,
    public var Owner: PSID = 0L,
    public var Group: PSID = 0L,
    public var Sacl: Long = 0L,
    public var Dacl: Long = 0L,
)

public data class SECURITY_DESCRIPTOR_RELATIVE(
    public var Revision: UByte = 0u,
    public var Sbz1: UByte = 0u,
    public var Control: SECURITY_DESCRIPTOR_CONTROL = 0u,
    public var Owner: UInt = 0u,
    public var Group: UInt = 0u,
    public var Sacl: UInt = 0u,
    public var Dacl: UInt = 0u,
)

public data class SECURITY_QUALITY_OF_SERVICE(
    public var Length: UInt = 0u,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var ContextTrackingMode: UByte = 0u,
    public var EffectiveOnly: Boolean = false,
)

public data class SE_ACCESS_REPLY(
    public var Size: UInt = 0u,
    public var ResultListCount: UInt = 0u,
    public var GrantedAccess: Long = 0L,
    public var AccessStatus: Long = 0L,
    public var AccessReason: Long = 0L,
    public var Privileges: Long = 0L,
)

public data class SE_ACCESS_REQUEST(
    public var Size: UInt = 0u,
    public var SeSecurityDescriptor: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var PreviouslyGrantedAccess: UInt = 0u,
    public var PrincipalSelfSid: PSID = 0L,
    public var GenericMapping: Long = 0L,
    public var ObjectTypeListCount: UInt = 0u,
    public var ObjectTypeList: Long = 0L,
)

public data class SE_IMPERSONATION_STATE(
    public var Token: Long = 0L,
    public var CopyOnOpen: Boolean = false,
    public var EffectiveOnly: Boolean = false,
    public var Level: SECURITY_IMPERSONATION_LEVEL = 0,
)

public data class SE_SECURITY_DESCRIPTOR(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
)

public data class SE_SID(public var Sid: SID = SID(), public var Buffer: UByteArray = UByteArray(68)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SE_SID) return false
        if (this.Sid != other.Sid) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Sid.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class SID(
    public var Revision: UByte = 0u,
    public var SubAuthorityCount: UByte = 0u,
    public var IdentifierAuthority: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(),
    public var SubAuthority: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SID) return false
        if (this.Revision != other.Revision) return false
        if (this.SubAuthorityCount != other.SubAuthorityCount) return false
        if (this.IdentifierAuthority != other.IdentifierAuthority) return false
        if (!this.SubAuthority.contentEquals(other.SubAuthority)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Revision.hashCode()
        result = 31 * result + this.SubAuthorityCount.hashCode()
        result = 31 * result + this.IdentifierAuthority.hashCode()
        result = 31 * result + this.SubAuthority.contentHashCode()
        return result
    }
}

public data class SID_AND_ATTRIBUTES(public var Sid: PSID = 0L, public var Attributes: UInt = 0u)

public data class SID_AND_ATTRIBUTES_HASH(
    public var SidCount: UInt = 0u,
    public var SidAttr: Long = 0L,
    public var Hash: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SID_AND_ATTRIBUTES_HASH) return false
        if (this.SidCount != other.SidCount) return false
        if (this.SidAttr != other.SidAttr) return false
        if (!this.Hash.contentEquals(other.Hash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SidCount.hashCode()
        result = 31 * result + this.SidAttr.hashCode()
        result = 31 * result + this.Hash.contentHashCode()
        return result
    }
}

public data class SID_IDENTIFIER_AUTHORITY(public var Value: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SID_IDENTIFIER_AUTHORITY) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Value.contentHashCode()
    }
}

public data class SYSTEM_ACCESS_FILTER_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_ALARM_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_ALARM_CALLBACK_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_ALARM_CALLBACK_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_ALARM_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_AUDIT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_AUDIT_CALLBACK_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_AUDIT_CALLBACK_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_AUDIT_OBJECT_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var Flags: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: GUID = GUID(),
    public var InheritedObjectType: GUID = GUID(),
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_MANDATORY_LABEL_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_PROCESS_TRUST_LABEL_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_RESOURCE_ATTRIBUTE_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SYSTEM_SCOPED_POLICY_ID_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class TOKEN_ACCESS_INFORMATION(
    public var SidHash: Long = 0L,
    public var RestrictedSidHash: Long = 0L,
    public var Privileges: Long = 0L,
    public var AuthenticationId: Foundation.LUID = Foundation.LUID(),
    public var TokenType: TOKEN_TYPE = 0,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var MandatoryPolicy: TOKEN_MANDATORY_POLICY = TOKEN_MANDATORY_POLICY(),
    public var Flags: UInt = 0u,
    public var AppContainerNumber: UInt = 0u,
    public var PackageSid: PSID = 0L,
    public var CapabilitiesHash: Long = 0L,
    public var TrustLevelSid: PSID = 0L,
    public var SecurityAttributes: Long = 0L,
)

public data class TOKEN_APPCONTAINER_INFORMATION(public var TokenAppContainer: PSID = 0L)

public data class TOKEN_AUDIT_POLICY(public var PerUserPolicy: UByteArray = UByteArray(30)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TOKEN_AUDIT_POLICY) return false
        if (!this.PerUserPolicy.contentEquals(other.PerUserPolicy)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PerUserPolicy.contentHashCode()
    }
}

public data class TOKEN_CONTROL(
    public var TokenId: Foundation.LUID = Foundation.LUID(),
    public var AuthenticationId: Foundation.LUID = Foundation.LUID(),
    public var ModifiedId: Foundation.LUID = Foundation.LUID(),
    public var TokenSource: TOKEN_SOURCE = TOKEN_SOURCE(),
)

public data class TOKEN_DEFAULT_DACL(public var DefaultDacl: Long = 0L)

public data class TOKEN_DEVICE_CLAIMS(public var DeviceClaims: Long = 0L)

public data class TOKEN_ELEVATION(public var TokenIsElevated: UInt = 0u)

public data class TOKEN_GROUPS(public var GroupCount: UInt = 0u, public var Groups: List<SID_AND_ATTRIBUTES> = List(1) { SID_AND_ATTRIBUTES() })

public data class TOKEN_GROUPS_AND_PRIVILEGES(
    public var SidCount: UInt = 0u,
    public var SidLength: UInt = 0u,
    public var Sids: Long = 0L,
    public var RestrictedSidCount: UInt = 0u,
    public var RestrictedSidLength: UInt = 0u,
    public var RestrictedSids: Long = 0L,
    public var PrivilegeCount: UInt = 0u,
    public var PrivilegeLength: UInt = 0u,
    public var Privileges: Long = 0L,
    public var AuthenticationId: Foundation.LUID = Foundation.LUID(),
)

public data class TOKEN_LINKED_TOKEN(public var LinkedToken: Foundation.HANDLE = Foundation.HANDLE())

public data class TOKEN_MANDATORY_LABEL(public var Label: SID_AND_ATTRIBUTES = SID_AND_ATTRIBUTES())

public data class TOKEN_MANDATORY_POLICY(public var Policy: TOKEN_MANDATORY_POLICY_ID = 0u)

public data class TOKEN_ORIGIN(public var OriginatingLogonSession: Foundation.LUID = Foundation.LUID())

public data class TOKEN_OWNER(public var Owner: PSID = 0L)

public data class TOKEN_PRIMARY_GROUP(public var PrimaryGroup: PSID = 0L)

public data class TOKEN_PRIVILEGES(public var PrivilegeCount: UInt = 0u, public var Privileges: List<LUID_AND_ATTRIBUTES> = List(1) { LUID_AND_ATTRIBUTES() })

public data class TOKEN_SOURCE(public var SourceName: ByteArray = ByteArray(8), public var SourceIdentifier: Foundation.LUID = Foundation.LUID()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TOKEN_SOURCE) return false
        if (!this.SourceName.contentEquals(other.SourceName)) return false
        if (this.SourceIdentifier != other.SourceIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SourceName.contentHashCode()
        result = 31 * result + this.SourceIdentifier.hashCode()
        return result
    }
}

public data class TOKEN_STATISTICS(
    public var TokenId: Foundation.LUID = Foundation.LUID(),
    public var AuthenticationId: Foundation.LUID = Foundation.LUID(),
    public var ExpirationTime: Long = 0L,
    public var TokenType: TOKEN_TYPE = 0,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var DynamicCharged: UInt = 0u,
    public var DynamicAvailable: UInt = 0u,
    public var GroupCount: UInt = 0u,
    public var PrivilegeCount: UInt = 0u,
    public var ModifiedId: Foundation.LUID = Foundation.LUID(),
)

public data class TOKEN_USER(public var User: SID_AND_ATTRIBUTES = SID_AND_ATTRIBUTES())

public data class TOKEN_USER_CLAIMS(public var UserClaims: Long = 0L)
