@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SystemAuditObjectAceFlags

public data class ActrlAccessa(public var cEntries: UInt = 0u, public var pPropertyAccessList: ActrlPropertyEntrya? = null)

public data class ActrlAccessw(public var cEntries: UInt = 0u, public var pPropertyAccessList: ActrlPropertyEntryw? = null)

public data class ActrlAccessEntrya(
    public var trustee: TrusteeA = TrusteeA(),
    public var fAccessFlags: ActrlAccessEntryAccessFlags = 0u,
    public var access: UInt = 0u,
    public var provSpecificAccess: UInt = 0u,
    public var inheritance: AceFlags = 0u,
    public var lpInheritProperty: Pstr = null,
)

public data class ActrlAccessEntryw(
    public var trustee: TrusteeW = TrusteeW(),
    public var fAccessFlags: ActrlAccessEntryAccessFlags = 0u,
    public var access: UInt = 0u,
    public var provSpecificAccess: UInt = 0u,
    public var inheritance: AceFlags = 0u,
    public var lpInheritProperty: Pwstr = null,
)

public data class ActrlAccessEntryLista(public var cEntries: UInt = 0u, public var pAccessList: ActrlAccessEntrya? = null)

public data class ActrlAccessEntryListw(public var cEntries: UInt = 0u, public var pAccessList: ActrlAccessEntryw? = null)

public data class ActrlAccessInfoa(public var fAccessPermission: UInt = 0u, public var lpAccessPermissionName: Pstr = null)

public data class ActrlAccessInfow(public var fAccessPermission: UInt = 0u, public var lpAccessPermissionName: Pwstr = null)

public data class ActrlControlInfoa(public var lpControlId: Pstr = null, public var lpControlName: Pstr = null)

public data class ActrlControlInfow(public var lpControlId: Pwstr = null, public var lpControlName: Pwstr = null)

public data class ActrlOverlapped(
    public var anonymous: ActrlOverlapped0 = ActrlOverlapped0(),
    public var reserved2: UInt = 0u,
    public var hEvent: Handle = null,
)

public data class ActrlOverlapped0(public var provider: COpaquePointer? = null, public var reserved1: UInt = 0u)

public data class ActrlPropertyEntrya(
    public var lpProperty: Pstr = null,
    public var pAccessEntryList: ActrlAccessEntryLista? = null,
    public var fListFlags: UInt = 0u,
)

public data class ActrlPropertyEntryw(
    public var lpProperty: Pwstr = null,
    public var pAccessEntryList: ActrlAccessEntryListw? = null,
    public var fListFlags: UInt = 0u,
)

public data class AuditIpAddress(public var pIpAddress: UByteArray = UByteArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuditIpAddress) return false
        if (!this.pIpAddress.contentEquals(other.pIpAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.pIpAddress.contentHashCode()
    }
}

public data class AuditObjectType(
    public var objectType: Guid = Guid(),
    public var flags: UShort = 0u,
    public var level: UShort = 0u,
    public var accessMask: UInt = 0u,
)

public data class AuditObjectTypes(
    public var count: UShort = 0u,
    public var flags: UShort = 0u,
    public var pObjectTypes: AuditObjectType? = null,
)

public data class AuditParam(
    public var type: AuditParamType = 0,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var anonymous1: AuditParam0 = AuditParam0(),
    public var anonymous2: AuditParam1 = AuditParam1(),
)

public data class AuditParam0(
    public var data0: Int = 0,
    public var string: Pwstr = null,
    public var u: Int = 0,
    public var psid: Sid? = null,
    public var pguid: Guid? = null,
    public var logonIdLowPart: UInt = 0u,
    public var pObjectTypes: AuditObjectTypes? = null,
    public var pIpAddress: AuditIpAddress? = null,
)

public data class AuditParam1(public var data1: Int = 0, public var logonIdHighPart: Int = 0)

public data class AuditParams(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var count: UShort = 0u,
    public var parameters: AuditParam? = null,
)

public data class AuthzAccessReply(
    public var resultListLength: UInt = 0u,
    public var grantedAccessMask: UInt? = null,
    public var saclEvaluationResults: UInt? = null,
    public var error: UInt? = null,
)

public data class AuthzAccessRequest(
    public var desiredAccess: UInt = 0u,
    public var principalSelfSid: Psid = null,
    public var objectTypeList: ObjectTypeList? = null,
    public var objectTypeListLength: UInt = 0u,
    public var optionalArguments: COpaquePointer? = null,
)

public data class AuthzAuditEventTypeLegacy(
    public var categoryId: UShort = 0u,
    public var auditId: UShort = 0u,
    public var parameterCount: UShort = 0u,
)

public data class AuthzAuditEventTypeOld(
    public var version: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var refCount: Int = 0,
    public var hAudit: Int = 0,
    public var linkId: Luid = Luid(),
    public var u: AuthzAuditEventTypeUnion = AuthzAuditEventTypeUnion(),
)

public data class AuthzAuditEventTypeUnion(public var legacy: AuthzAuditEventTypeLegacy = AuthzAuditEventTypeLegacy())

public data class AuthzInitInfo(
    public var version: UShort = 0u,
    public var szResourceManagerName: Pcwstr = null,
    public var pfnDynamicAccessCheck: PfnAuthzDynamicAccessCheck = null,
    public var pfnComputeDynamicGroups: PfnAuthzComputeDynamicGroups = null,
    public var pfnFreeDynamicGroups: PfnAuthzFreeDynamicGroups = null,
    public var pfnGetCentralAccessPolicy: PfnAuthzGetCentralAccessPolicy = null,
    public var pfnFreeCentralAccessPolicy: PfnAuthzFreeCentralAccessPolicy = null,
)

public data class AuthzRegistrationObjectTypeNameOffset(public var szObjectTypeName: Pwstr = null, public var dwOffset: UInt = 0u)

public data class AuthzRpcInitInfoClient(
    public var version: UShort = 0u,
    public var objectUuid: Pwstr = null,
    public var protSeq: Pwstr = null,
    public var networkAddr: Pwstr = null,
    public var endpoint: Pwstr = null,
    public var options: Pwstr = null,
    public var serverSpn: Pwstr = null,
)

public data class AuthzSecurityAttributesInformation(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var attributeCount: UInt = 0u,
    public var attribute: AuthzSecurityAttributesInformation0 = AuthzSecurityAttributesInformation0(),
)

public data class AuthzSecurityAttributesInformation0(public var pAttributeV1: AuthzSecurityAttributeV1? = null)

public data class AuthzSecurityAttributeFqbnValue(public var version: ULong = 0uL, public var pName: Pwstr = null)

public data class AuthzSecurityAttributeOctetStringValue(public var pValue: COpaquePointer? = null, public var valueLength: UInt = 0u)

public data class AuthzSecurityAttributeV1(
    public var pName: Pwstr = null,
    public var valueType: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: AuthzSecurityAttributeFlags = 0u,
    public var valueCount: UInt = 0u,
    public var values: AuthzSecurityAttributeV10 = AuthzSecurityAttributeV10(),
)

public data class AuthzSecurityAttributeV10(
    public var pInt64: Long? = null,
    public var pUint64: ULong? = null,
    public var ppString: Pwstr? = null,
    public var pFqbn: AuthzSecurityAttributeFqbnValue? = null,
    public var pOctetString: AuthzSecurityAttributeOctetStringValue? = null,
)

public data class AuthzSourceSchemaRegistration(
    public var dwFlags: UInt = 0u,
    public var szEventSourceName: Pwstr = null,
    public var szEventMessageFile: Pwstr = null,
    public var szEventSourceXmlSchemaFile: Pwstr = null,
    public var szEventAccessStringsFile: Pwstr = null,
    public var szExecutableImagePath: Pwstr = null,
    public var anonymous: AuthzSourceSchemaRegistration0 = AuthzSourceSchemaRegistration0(),
    public var dwObjectTypeNameCount: UInt = 0u,
    public var objectTypeNames: List<AuthzRegistrationObjectTypeNameOffset> = List(1) { AuthzRegistrationObjectTypeNameOffset() },
)

public data class AuthzSourceSchemaRegistration0(public var pReserved: COpaquePointer? = null, public var pProviderGuid: Guid? = null)

public data class ExplicitAccessA(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: AccessMode = 0,
    public var grfInheritance: AceFlags = 0u,
    public var trustee: TrusteeA = TrusteeA(),
)

public data class ExplicitAccessW(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: AccessMode = 0,
    public var grfInheritance: AceFlags = 0u,
    public var trustee: TrusteeW = TrusteeW(),
)

public data class FnObjectMgrFuncts(public var sampleValue: UInt = 0u)

public data class InheritedFroma(public var generationGap: Int = 0, public var ancestorName: Pstr = null)

public data class InheritedFromw(public var generationGap: Int = 0, public var ancestorName: Pwstr = null)

public data class ObjectsAndNameA(
    public var objectsPresent: SystemAuditObjectAceFlags = 0u,
    public var objectType: SeObjectType = 0,
    public var objectTypeName: Pstr = null,
    public var inheritedObjectTypeName: Pstr = null,
    public var ptstrName: Pstr = null,
)

public data class ObjectsAndNameW(
    public var objectsPresent: SystemAuditObjectAceFlags = 0u,
    public var objectType: SeObjectType = 0,
    public var objectTypeName: Pwstr = null,
    public var inheritedObjectTypeName: Pwstr = null,
    public var ptstrName: Pwstr = null,
)

public data class ObjectsAndSid(
    public var objectsPresent: SystemAuditObjectAceFlags = 0u,
    public var objectTypeGuid: Guid = Guid(),
    public var inheritedObjectTypeGuid: Guid = Guid(),
    public var pSid: Sid? = null,
)

public data class TrusteeA(
    public var pMultipleTrustee: TrusteeA? = null,
    public var multipleTrusteeOperation: MultipleTrusteeOperation = 0,
    public var trusteeForm: TrusteeForm = 0,
    public var trusteeType: TrusteeType = 0,
    public var ptstrName: Pstr = null,
)

public data class TrusteeAccessa(
    public var lpProperty: Pstr = null,
    public var access: UInt = 0u,
    public var fAccessFlags: UInt = 0u,
    public var fReturnedAccess: UInt = 0u,
)

public data class TrusteeAccessw(
    public var lpProperty: Pwstr = null,
    public var access: UInt = 0u,
    public var fAccessFlags: UInt = 0u,
    public var fReturnedAccess: UInt = 0u,
)

public data class TrusteeW(
    public var pMultipleTrustee: TrusteeW? = null,
    public var multipleTrusteeOperation: MultipleTrusteeOperation = 0,
    public var trusteeForm: TrusteeForm = 0,
    public var trusteeType: TrusteeType = 0,
    public var ptstrName: Pwstr = null,
)
