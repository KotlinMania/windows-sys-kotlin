@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid

public data class AccessAllowedAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class AccessAllowedCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class AccessAllowedCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessAllowedObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessDeniedObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class AccessReasons(
    public var data: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessReasons) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()
}

public data class AceHeader(
    public var aceType: UByte = 0u,
    public var aceFlags: UByte = 0u,
    public var aceSize: UShort = 0u,
)

public data class Acl(
    public var aclRevision: UByte = 0u,
    public var sbz1: UByte = 0u,
    public var aclSize: UShort = 0u,
    public var aceCount: UShort = 0u,
    public var sbz2: UShort = 0u,
)

public data class AclRevisionInformation(
    public var aclRevision: UInt = 0u,
)

public data class AclSizeInformation(
    public var aceCount: UInt = 0u,
    public var aclBytesInUse: UInt = 0u,
    public var aclBytesFree: UInt = 0u,
)

public data class ClaimSecurityAttributesInformation(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var attributeCount: UInt = 0u,
    public var attribute: ClaimSecurityAttributesInformation0 = ClaimSecurityAttributesInformation0(),
)

public data class ClaimSecurityAttributesInformation0(
    public var pAttributeV1: ClaimSecurityAttributeV1? = null,
)

public data class ClaimSecurityAttributeFqbnValue(
    public var version: ULong = 0uL,
    public var name: Pwstr = null,
)

public data class ClaimSecurityAttributeOctetStringValue(
    public var pValue: COpaquePointer? = null,
    public var valueLength: UInt = 0u,
)

public data class ClaimSecurityAttributeRelativeV1(
    public var name: UInt = 0u,
    public var valueType: ClaimSecurityAttributeValueType = 0u,
    public var reserved: UShort = 0u,
    public var flags: ClaimSecurityAttributeFlags = 0u,
    public var valueCount: UInt = 0u,
    public var values: ClaimSecurityAttributeRelativeV10 = ClaimSecurityAttributeRelativeV10(),
)

public data class ClaimSecurityAttributeRelativeV10(
    public var pInt64: UIntArray = UIntArray(1),
    public var pUint64: UIntArray = UIntArray(1),
    public var ppString: UIntArray = UIntArray(1),
    public var pFqbn: UIntArray = UIntArray(1),
    public var pOctetString: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClaimSecurityAttributeRelativeV10) return false
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

public data class ClaimSecurityAttributeV1(
    public var name: Pwstr = null,
    public var valueType: ClaimSecurityAttributeValueType = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var valueCount: UInt = 0u,
    public var values: ClaimSecurityAttributeV10 = ClaimSecurityAttributeV10(),
)

public data class ClaimSecurityAttributeV10(
    public var pInt64: Long? = null,
    public var pUint64: ULong? = null,
    public var ppString: Pwstr? = null,
    public var pFqbn: ClaimSecurityAttributeFqbnValue? = null,
    public var pOctetString: ClaimSecurityAttributeOctetStringValue? = null,
)

public data class GenericMapping(
    public var genericRead: UInt = 0u,
    public var genericWrite: UInt = 0u,
    public var genericExecute: UInt = 0u,
    public var genericAll: UInt = 0u,
)

public data class Llfiletime(
    public var anonymous: Llfiletime0 = Llfiletime0(),
)

public data class Llfiletime0(
    public var ll: Long = 0L,
    public var ft: Filetime = Filetime(),
)

public data class LuidAndAttributes(
    public var luid: Luid = Luid(),
    public var attributes: TokenPrivilegesAttributes = 0u,
)

public data class ObjectTypeList(
    public var level: UShort = 0u,
    public var sbz: UShort = 0u,
    public var objectType: Guid? = null,
)

public data class PrivilegeSet(
    public var privilegeCount: UInt = 0u,
    public var control: UInt = 0u,
    public var privilege: List<LuidAndAttributes> = List(1) { LuidAndAttributes() },
)

public data class QuotaLimits(
    public var pagedPoolLimit: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var minimumWorkingSetSize: Int = 0,
    public var maximumWorkingSetSize: Int = 0,
    public var pagefileLimit: Int = 0,
    public var timeLimit: Long = 0L,
)

public data class SecurityAttributes(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: COpaquePointer? = null,
    public var bInheritHandle: Bool = 0,
)

public data class SecurityCapabilities(
    public var appContainerSid: Psid = null,
    public var capabilities: SidAndAttributes? = null,
    public var capabilityCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class SecurityDescriptor(
    public var revision: UByte = 0u,
    public var sbz1: UByte = 0u,
    public var control: SecurityDescriptorControl = 0u,
    public var owner: Psid = null,
    public var group: Psid = null,
    public var sacl: Acl? = null,
    public var dacl: Acl? = null,
)

public data class SecurityDescriptorRelative(
    public var revision: UByte = 0u,
    public var sbz1: UByte = 0u,
    public var control: SecurityDescriptorControl = 0u,
    public var owner: UInt = 0u,
    public var group: UInt = 0u,
    public var sacl: UInt = 0u,
    public var dacl: UInt = 0u,
)

public data class SecurityQualityOfService(
    public var length: UInt = 0u,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var contextTrackingMode: UByte = 0u,
    public var effectiveOnly: Boolean = false,
)

public data class SeAccessReply(
    public var size: UInt = 0u,
    public var resultListCount: UInt = 0u,
    public var grantedAccess: UInt? = null,
    public var accessStatus: UInt? = null,
    public var accessReason: AccessReasons? = null,
    public var privileges: COpaquePointer? = null,
)

public data class SeAccessRequest(
    public var size: UInt = 0u,
    public var seSecurityDescriptor: SeSecurityDescriptor? = null,
    public var desiredAccess: UInt = 0u,
    public var previouslyGrantedAccess: UInt = 0u,
    public var principalSelfSid: Psid = null,
    public var genericMapping: GenericMapping? = null,
    public var objectTypeListCount: UInt = 0u,
    public var objectTypeList: ObjectTypeList? = null,
)

public data class SeImpersonationState(
    public var token: COpaquePointer? = null,
    public var copyOnOpen: Boolean = false,
    public var effectiveOnly: Boolean = false,
    public var level: SecurityImpersonationLevel = 0,
)

public data class SeSecurityDescriptor(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var securityDescriptor: PsecurityDescriptor = null,
)

public data class SeSid(
    public var sid: Sid = Sid(),
    public var buffer: UByteArray = UByteArray(68),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeSid) return false
        if (this.sid != other.sid) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class Sid(
    public var revision: UByte = 0u,
    public var subAuthorityCount: UByte = 0u,
    public var identifierAuthority: SidIdentifierAuthority = SidIdentifierAuthority(),
    public var subAuthority: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sid) return false
        if (this.revision != other.revision) return false
        if (this.subAuthorityCount != other.subAuthorityCount) return false
        if (this.identifierAuthority != other.identifierAuthority) return false
        if (!this.subAuthority.contentEquals(other.subAuthority)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.subAuthorityCount.hashCode()
        result = 31 * result + this.identifierAuthority.hashCode()
        result = 31 * result + this.subAuthority.contentHashCode()
        return result
    }
}

public data class SidAndAttributes(
    public var sid: Psid = null,
    public var attributes: UInt = 0u,
)

public data class SidAndAttributesHash(
    public var sidCount: UInt = 0u,
    public var sidAttr: SidAndAttributes? = null,
    public var hash: IntArray = IntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SidAndAttributesHash) return false
        if (this.sidCount != other.sidCount) return false
        if (this.sidAttr != other.sidAttr) return false
        if (!this.hash.contentEquals(other.hash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sidCount.hashCode()
        result = 31 * result + this.sidAttr.hashCode()
        result = 31 * result + this.hash.contentHashCode()
        return result
    }
}

public data class SidIdentifierAuthority(
    public var value: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SidIdentifierAuthority) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class SystemAccessFilterAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemAlarmAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemAlarmCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemAlarmCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAlarmObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: UInt = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAuditAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemAuditCallbackAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemAuditCallbackObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemAuditObjectAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var flags: SystemAuditObjectAceFlags = 0u,
    public var objectType: Guid = Guid(),
    public var inheritedObjectType: Guid = Guid(),
    public var sidStart: UInt = 0u,
)

public data class SystemMandatoryLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemProcessTrustLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemResourceAttributeAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SystemScopedPolicyIdAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class TokenAccessInformation(
    public var sidHash: SidAndAttributesHash? = null,
    public var restrictedSidHash: SidAndAttributesHash? = null,
    public var privileges: TokenPrivileges? = null,
    public var authenticationId: Luid = Luid(),
    public var tokenType: TokenType = 0,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var mandatoryPolicy: TokenMandatoryPolicy = TokenMandatoryPolicy(),
    public var flags: UInt = 0u,
    public var appContainerNumber: UInt = 0u,
    public var packageSid: Psid = null,
    public var capabilitiesHash: SidAndAttributesHash? = null,
    public var trustLevelSid: Psid = null,
    public var securityAttributes: COpaquePointer? = null,
)

public data class TokenAppcontainerInformation(
    public var tokenAppContainer: Psid = null,
)

public data class TokenAuditPolicy(
    public var perUserPolicy: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenAuditPolicy) return false
        if (!this.perUserPolicy.contentEquals(other.perUserPolicy)) return false
        return true
    }

    override fun hashCode(): Int = this.perUserPolicy.contentHashCode()
}

public data class TokenControl(
    public var tokenId: Luid = Luid(),
    public var authenticationId: Luid = Luid(),
    public var modifiedId: Luid = Luid(),
    public var tokenSource: TokenSource = TokenSource(),
)

public data class TokenDefaultDacl(
    public var defaultDacl: Acl? = null,
)

public data class TokenDeviceClaims(
    public var deviceClaims: COpaquePointer? = null,
)

public data class TokenElevation(
    public var tokenIsElevated: UInt = 0u,
)

public data class TokenGroups(
    public var groupCount: UInt = 0u,
    public var groups: List<SidAndAttributes> = List(1) { SidAndAttributes() },
)

public data class TokenGroupsAndPrivileges(
    public var sidCount: UInt = 0u,
    public var sidLength: UInt = 0u,
    public var sids: SidAndAttributes? = null,
    public var restrictedSidCount: UInt = 0u,
    public var restrictedSidLength: UInt = 0u,
    public var restrictedSids: SidAndAttributes? = null,
    public var privilegeCount: UInt = 0u,
    public var privilegeLength: UInt = 0u,
    public var privileges: LuidAndAttributes? = null,
    public var authenticationId: Luid = Luid(),
)

public data class TokenLinkedToken(
    public var linkedToken: Handle = null,
)

public data class TokenMandatoryLabel(
    public var label: SidAndAttributes = SidAndAttributes(),
)

public data class TokenMandatoryPolicy(
    public var policy: TokenMandatoryPolicyId = 0u,
)

public data class TokenOrigin(
    public var originatingLogonSession: Luid = Luid(),
)

public data class TokenOwner(
    public var owner: Psid = null,
)

public data class TokenPrimaryGroup(
    public var primaryGroup: Psid = null,
)

public data class TokenPrivileges(
    public var privilegeCount: UInt = 0u,
    public var privileges: List<LuidAndAttributes> = List(1) { LuidAndAttributes() },
)

public data class TokenSource(
    public var sourceName: ByteArray = ByteArray(8),
    public var sourceIdentifier: Luid = Luid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenSource) return false
        if (!this.sourceName.contentEquals(other.sourceName)) return false
        if (this.sourceIdentifier != other.sourceIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceName.contentHashCode()
        result = 31 * result + this.sourceIdentifier.hashCode()
        return result
    }
}

public data class TokenStatistics(
    public var tokenId: Luid = Luid(),
    public var authenticationId: Luid = Luid(),
    public var expirationTime: Long = 0L,
    public var tokenType: TokenType = 0,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var dynamicCharged: UInt = 0u,
    public var dynamicAvailable: UInt = 0u,
    public var groupCount: UInt = 0u,
    public var privilegeCount: UInt = 0u,
    public var modifiedId: Luid = Luid(),
)

public data class TokenUser(
    public var user: SidAndAttributes = SidAndAttributes(),
)

public data class TokenUserClaims(
    public var userClaims: COpaquePointer? = null,
)
