@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.ACE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SYSTEM_AUDIT_OBJECT_ACE_FLAGS

public data class ACTRL_ACCESSA(public var cEntries: UInt = 0u, public var pPropertyAccessList: Long = 0L)

public data class ACTRL_ACCESSW(public var cEntries: UInt = 0u, public var pPropertyAccessList: Long = 0L)

public data class ACTRL_ACCESS_ENTRYA(
    public var Trustee: TRUSTEE_A = TRUSTEE_A(),
    public var fAccessFlags: ACTRL_ACCESS_ENTRY_ACCESS_FLAGS = 0u,
    public var Access: UInt = 0u,
    public var ProvSpecificAccess: UInt = 0u,
    public var Inheritance: ACE_FLAGS = 0u,
    public var lpInheritProperty: PSTR = 0L,
)

public data class ACTRL_ACCESS_ENTRYW(
    public var Trustee: TRUSTEE_W = TRUSTEE_W(),
    public var fAccessFlags: ACTRL_ACCESS_ENTRY_ACCESS_FLAGS = 0u,
    public var Access: UInt = 0u,
    public var ProvSpecificAccess: UInt = 0u,
    public var Inheritance: ACE_FLAGS = 0u,
    public var lpInheritProperty: PWSTR = 0L,
)

public data class ACTRL_ACCESS_ENTRY_LISTA(public var cEntries: UInt = 0u, public var pAccessList: Long = 0L)

public data class ACTRL_ACCESS_ENTRY_LISTW(public var cEntries: UInt = 0u, public var pAccessList: Long = 0L)

public data class ACTRL_ACCESS_INFOA(public var fAccessPermission: UInt = 0u, public var lpAccessPermissionName: PSTR = 0L)

public data class ACTRL_ACCESS_INFOW(public var fAccessPermission: UInt = 0u, public var lpAccessPermissionName: PWSTR = 0L)

public data class ACTRL_CONTROL_INFOA(public var lpControlId: PSTR = 0L, public var lpControlName: PSTR = 0L)

public data class ACTRL_CONTROL_INFOW(public var lpControlId: PWSTR = 0L, public var lpControlName: PWSTR = 0L)

public data class ACTRL_OVERLAPPED(
    public var Anonymous: ACTRL_OVERLAPPED_0 = ACTRL_OVERLAPPED_0(),
    public var Reserved2: UInt = 0u,
    public var hEvent: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class ACTRL_OVERLAPPED_0(public var Provider: Long = 0L, public var Reserved1: UInt = 0u)

public data class ACTRL_PROPERTY_ENTRYA(
    public var lpProperty: PSTR = 0L,
    public var pAccessEntryList: Long = 0L,
    public var fListFlags: UInt = 0u,
)

public data class ACTRL_PROPERTY_ENTRYW(
    public var lpProperty: PWSTR = 0L,
    public var pAccessEntryList: Long = 0L,
    public var fListFlags: UInt = 0u,
)

public data class AUDIT_IP_ADDRESS(public var pIpAddress: UByteArray = UByteArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUDIT_IP_ADDRESS) return false
        if (!this.pIpAddress.contentEquals(other.pIpAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.pIpAddress.contentHashCode()
    }
}

public data class AUDIT_OBJECT_TYPE(
    public var ObjectType: GUID = GUID(),
    public var Flags: UShort = 0u,
    public var Level: UShort = 0u,
    public var AccessMask: UInt = 0u,
)

public data class AUDIT_OBJECT_TYPES(
    public var Count: UShort = 0u,
    public var Flags: UShort = 0u,
    public var pObjectTypes: Long = 0L,
)

public data class AUDIT_PARAM(
    public var Type: AUDIT_PARAM_TYPE = 0,
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Anonymous1: AUDIT_PARAM_0 = AUDIT_PARAM_0(),
    public var Anonymous2: AUDIT_PARAM_1 = AUDIT_PARAM_1(),
)

public data class AUDIT_PARAM_0(
    public var Data0: ULong = 0uL,
    public var String: PWSTR = 0L,
    public var u: ULong = 0uL,
    public var psid: Long = 0L,
    public var pguid: Long = 0L,
    public var LogonId_LowPart: UInt = 0u,
    public var pObjectTypes: Long = 0L,
    public var pIpAddress: Long = 0L,
)

public data class AUDIT_PARAM_1(public var Data1: ULong = 0uL, public var LogonId_HighPart: Int = 0)

public data class AUDIT_PARAMS(
    public var Length: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Count: UShort = 0u,
    public var Parameters: Long = 0L,
)

public data class AUTHZ_ACCESS_REPLY(
    public var ResultListLength: UInt = 0u,
    public var GrantedAccessMask: Long = 0L,
    public var SaclEvaluationResults: Long = 0L,
    public var Error: Long = 0L,
)

public data class AUTHZ_ACCESS_REQUEST(
    public var DesiredAccess: UInt = 0u,
    public var PrincipalSelfSid: PSID = 0L,
    public var ObjectTypeList: Long = 0L,
    public var ObjectTypeListLength: UInt = 0u,
    public var OptionalArguments: Long = 0L,
)

public data class AUTHZ_AUDIT_EVENT_TYPE_LEGACY(
    public var CategoryId: UShort = 0u,
    public var AuditId: UShort = 0u,
    public var ParameterCount: UShort = 0u,
)

public data class AUTHZ_AUDIT_EVENT_TYPE_OLD(
    public var Version: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var RefCount: Int = 0,
    public var hAudit: ULong = 0uL,
    public var LinkId: Foundation.LUID = Foundation.LUID(),
    public var u: AUTHZ_AUDIT_EVENT_TYPE_UNION = AUTHZ_AUDIT_EVENT_TYPE_UNION(),
)

public data class AUTHZ_AUDIT_EVENT_TYPE_UNION(public var Legacy: AUTHZ_AUDIT_EVENT_TYPE_LEGACY = AUTHZ_AUDIT_EVENT_TYPE_LEGACY())

public data class AUTHZ_INIT_INFO(
    public var version: UShort = 0u,
    public var szResourceManagerName: PCWSTR = 0L,
    public var pfnDynamicAccessCheck: PFN_AUTHZ_DYNAMIC_ACCESS_CHECK = null,
    public var pfnComputeDynamicGroups: PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS = null,
    public var pfnFreeDynamicGroups: PFN_AUTHZ_FREE_DYNAMIC_GROUPS = null,
    public var pfnGetCentralAccessPolicy: PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY = null,
    public var pfnFreeCentralAccessPolicy: PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY = null,
)

public data class AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET(public var szObjectTypeName: PWSTR = 0L, public var dwOffset: UInt = 0u)

public data class AUTHZ_RPC_INIT_INFO_CLIENT(
    public var version: UShort = 0u,
    public var ObjectUuid: PWSTR = 0L,
    public var ProtSeq: PWSTR = 0L,
    public var NetworkAddr: PWSTR = 0L,
    public var Endpoint: PWSTR = 0L,
    public var Options: PWSTR = 0L,
    public var ServerSpn: PWSTR = 0L,
)

public data class AUTHZ_SECURITY_ATTRIBUTES_INFORMATION(
    public var Version: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var AttributeCount: UInt = 0u,
    public var Attribute: AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0 = AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0(),
)

public data class AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_0(public var pAttributeV1: Long = 0L)

public data class AUTHZ_SECURITY_ATTRIBUTE_FQBN_VALUE(public var Version: ULong = 0uL, public var pName: PWSTR = 0L)

public data class AUTHZ_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE(public var pValue: Long = 0L, public var ValueLength: UInt = 0u)

public data class AUTHZ_SECURITY_ATTRIBUTE_V1(
    public var pName: PWSTR = 0L,
    public var ValueType: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: AUTHZ_SECURITY_ATTRIBUTE_FLAGS = 0u,
    public var ValueCount: UInt = 0u,
    public var Values: AUTHZ_SECURITY_ATTRIBUTE_V1_0 = AUTHZ_SECURITY_ATTRIBUTE_V1_0(),
)

public data class AUTHZ_SECURITY_ATTRIBUTE_V1_0(
    public var pInt64: Long = 0L,
    public var pUint64: Long = 0L,
    public var ppString: Long = 0L,
    public var pFqbn: Long = 0L,
    public var pOctetString: Long = 0L,
)

public data class AUTHZ_SOURCE_SCHEMA_REGISTRATION(
    public var dwFlags: UInt = 0u,
    public var szEventSourceName: PWSTR = 0L,
    public var szEventMessageFile: PWSTR = 0L,
    public var szEventSourceXmlSchemaFile: PWSTR = 0L,
    public var szEventAccessStringsFile: PWSTR = 0L,
    public var szExecutableImagePath: PWSTR = 0L,
    public var Anonymous: AUTHZ_SOURCE_SCHEMA_REGISTRATION_0 = AUTHZ_SOURCE_SCHEMA_REGISTRATION_0(),
    public var dwObjectTypeNameCount: UInt = 0u,
    public var ObjectTypeNames: List<AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET> = List(1) { AUTHZ_REGISTRATION_OBJECT_TYPE_NAME_OFFSET() },
)

public data class AUTHZ_SOURCE_SCHEMA_REGISTRATION_0(public var pReserved: Long = 0L, public var pProviderGuid: Long = 0L)

public data class EXPLICIT_ACCESS_A(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: ACCESS_MODE = 0,
    public var grfInheritance: ACE_FLAGS = 0u,
    public var Trustee: TRUSTEE_A = TRUSTEE_A(),
)

public data class EXPLICIT_ACCESS_W(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: ACCESS_MODE = 0,
    public var grfInheritance: ACE_FLAGS = 0u,
    public var Trustee: TRUSTEE_W = TRUSTEE_W(),
)

public data class FN_OBJECT_MGR_FUNCTS(public var sampleValue: UInt = 0u)

public data class INHERITED_FROMA(public var GenerationGap: Int = 0, public var AncestorName: PSTR = 0L)

public data class INHERITED_FROMW(public var GenerationGap: Int = 0, public var AncestorName: PWSTR = 0L)

public data class OBJECTS_AND_NAME_A(
    public var ObjectsPresent: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: SE_OBJECT_TYPE = 0,
    public var ObjectTypeName: PSTR = 0L,
    public var InheritedObjectTypeName: PSTR = 0L,
    public var ptstrName: PSTR = 0L,
)

public data class OBJECTS_AND_NAME_W(
    public var ObjectsPresent: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectType: SE_OBJECT_TYPE = 0,
    public var ObjectTypeName: PWSTR = 0L,
    public var InheritedObjectTypeName: PWSTR = 0L,
    public var ptstrName: PWSTR = 0L,
)

public data class OBJECTS_AND_SID(
    public var ObjectsPresent: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 0u,
    public var ObjectTypeGuid: GUID = GUID(),
    public var InheritedObjectTypeGuid: GUID = GUID(),
    public var pSid: Long = 0L,
)

public data class TRUSTEE_A(
    public var pMultipleTrustee: Long = 0L,
    public var MultipleTrusteeOperation: MULTIPLE_TRUSTEE_OPERATION = 0,
    public var TrusteeForm: TRUSTEE_FORM = 0,
    public var TrusteeType: TRUSTEE_TYPE = 0,
    public var ptstrName: PSTR = 0L,
)

public data class TRUSTEE_ACCESSA(
    public var lpProperty: PSTR = 0L,
    public var Access: UInt = 0u,
    public var fAccessFlags: UInt = 0u,
    public var fReturnedAccess: UInt = 0u,
)

public data class TRUSTEE_ACCESSW(
    public var lpProperty: PWSTR = 0L,
    public var Access: UInt = 0u,
    public var fAccessFlags: UInt = 0u,
    public var fReturnedAccess: UInt = 0u,
)

public data class TRUSTEE_W(
    public var pMultipleTrustee: Long = 0L,
    public var MultipleTrusteeOperation: MULTIPLE_TRUSTEE_OPERATION = 0,
    public var TrusteeForm: TRUSTEE_FORM = 0,
    public var TrusteeType: TRUSTEE_TYPE = 0,
    public var ptstrName: PWSTR = 0L,
)
