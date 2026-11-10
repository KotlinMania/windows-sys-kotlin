package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ABSENT: Appstate = 0

public val ADMXCOMMENTS_EXTENSION_GUID: Guid = Guid.fromU128(U128(0x6c5a2a869eb342b9uL, 0xaa83a7371ba011b9uL))

public val APPNAME: Installspectype = 1

public val ASSIGNED: Appstate = 1

public val CLSID_GPE_SNAP_IN: Guid = Guid.fromU128(U128(0x8fc0b734a0e111d1uL, 0xa7d30000f87571e3uL))

public val CLSID_GROUP_POLICY_OBJECT: Guid = Guid.fromU128(U128(0xea502722a23d11d1uL, 0xa7d30000f87571e3uL))

public val CLSID_RSOP_SNAP_IN: Guid = Guid.fromU128(U128(0x6dc3804b7212458duL, 0xadb09a07e2ae1fa2uL))

public val COMCLASS: Installspectype = 4

public val FILEEXT: Installspectype = 2

public val FLAG_ASSUME_COMP_WQLFILTER_TRUE: UInt = 33554432u

public val FLAG_ASSUME_SLOW_LINK: UInt = 536870912u

public val FLAG_ASSUME_USER_WQLFILTER_TRUE: UInt = 67108864u

public val FLAG_FORCE_CREATENAMESPACE: UInt = 4u

public val FLAG_LOOPBACK_MERGE: UInt = 268435456u

public val FLAG_LOOPBACK_REPLACE: UInt = 134217728u

public val FLAG_NO_COMPUTER: UInt = 2u

public val FLAG_NO_CSE_INVOKE: UInt = 1073741824u

public val FLAG_NO_GPO_FILTER: UInt = 2147483648u

public val FLAG_NO_USER: UInt = 1u

public val FLAG_PLANNING_MODE: UInt = 16777216u

public val GPC_BLOCK_POLICY: UInt = 1u

public val GP_HINT_DOMAIN: GroupPolicyHintType = 3

public val GP_HINT_MACHINE: GroupPolicyHintType = 1

public val GP_HINT_ORGANIZATIONAL_UNIT: GroupPolicyHintType = 4

public val GP_HINT_SITE: GroupPolicyHintType = 2

public val GP_HINT_UNKNOWN: GroupPolicyHintType = 0

public val GP_LINK_DOMAIN: GpoLink = 3

public val GP_LINK_MACHINE: GpoLink = 1

public val GP_LINK_ORGANIZATIONAL_UNIT: GpoLink = 4

public val GP_LINK_SITE: GpoLink = 2

public val GP_LINK_UNKNOWN: GpoLink = 0

public val GPM: Guid = Guid.fromU128(U128(0xf569470888fe4b35uL, 0xbabfe56162d5fbc8uL))

public val GPM_ASYNC_CANCEL: Guid = Guid.fromU128(U128(0x372796a976ec479duL, 0xad6c556318ed5f9duL))

public val GPM_BACKUP: Guid = Guid.fromU128(U128(0xed1a54b85efa482auL, 0x93c08ad86f0d68c3uL))

public val GPM_BACKUP_COLLECTION: Guid = Guid.fromU128(U128(0xeb8f035b70db4a9fuL, 0x967637c25994e9dcuL))

public val GPM_BACKUP_DIR: Guid = Guid.fromU128(U128(0xfce4a59d0f214afauL, 0xb859e6d0c62cd10cuL))

public val GPM_BACKUP_DIR_EX: Guid = Guid.fromU128(U128(0xe8c0988acf034c5buL, 0x8be22aa9ad32aadauL))

public val GPMCSE_COLLECTION: Guid = Guid.fromU128(U128(0xcf92b8282d444b61uL, 0xb10ab327afd42da8uL))

public val GPM_CLIENT_SIDE_EXTENSION: Guid = Guid.fromU128(U128(0xc1a2e70e659c4b1auL, 0x940bf88b0af9c8a4uL))

public val GPM_CONSTANTS: Guid = Guid.fromU128(U128(0x3855e880cd9e4d0cuL, 0x9eaf1579283a1888uL))

public val GPM_DOMAIN: Guid = Guid.fromU128(U128(0x710901be10504cb1uL, 0x838ac5cff259e183uL))

public val GPMGPO: Guid = Guid.fromU128(U128(0xd2ce299459b54064uL, 0xb5814d68486a16c4uL))

public val GPMGPO_COLLECTION: Guid = Guid.fromU128(U128(0x7a057325832d4de3uL, 0xa41fc780436a4e09uL))

public val GPMGPO_LINK: Guid = Guid.fromU128(U128(0xc1df9880530342c6uL, 0x8a3c0488e1bf7364uL))

public val GPMGPO_LINKS_COLLECTION: Guid = Guid.fromU128(U128(0xf6ed581a49a547e2uL, 0xb771fd8dc02b6259uL))

public val GPM_MAP_ENTRY: Guid = Guid.fromU128(U128(0x8c97525354314471uL, 0xb35d0626c928258auL))

public val GPM_MAP_ENTRY_COLLECTION: Guid = Guid.fromU128(U128(0xcf75d5ba3a14c55uL, 0xb4fe9e149c41f66duL))

public val GPM_MIGRATION_TABLE: Guid = Guid.fromU128(U128(0x55af40432a064f72uL, 0xabef631b44079c76uL))

public val GPM_PERMISSION: Guid = Guid.fromU128(U128(0x5871a40ae9c046ecuL, 0x913e944ef9225a94uL))

public val GPMRSOP: Guid = Guid.fromU128(U128(0x489b0caf9ec24eb7uL, 0x91f5b6f71d43da8cuL))

public val GPM_RESULT: Guid = Guid.fromU128(U128(0x92101ac092874206uL, 0xa3b24bdb73d225f6uL))

public val GPMSOM: Guid = Guid.fromU128(U128(0x32d93fac450e44cfuL, 0x829c8b22ff6bdae1uL))

public val GPMSOM_COLLECTION: Guid = Guid.fromU128(U128(0x24c1f14737204f5buL, 0xa9c306b4e4f931d2uL))

public val GPM_SEARCH_CRITERIA: Guid = Guid.fromU128(U128(0x17aaca265ce044fauL, 0x8cc05259e6483566uL))

public val GPM_SECURITY_INFO: Guid = Guid.fromU128(U128(0x547a5e8f91624516uL, 0xa4df9ddb9686d846uL))

public val GPM_SITES_CONTAINER: Guid = Guid.fromU128(U128(0x229f5c42852c4b30uL, 0x945fc522be9bd386uL))

public val GPM_STARTER_GPO_BACKUP: Guid = Guid.fromU128(U128(0x389e400ad8ef455buL, 0xa8615f9ca34a6a02uL))

public val GPM_STARTER_GPO_BACKUP_COLLECTION: Guid = Guid.fromU128(U128(0xe75ea59d1aeb4cb5uL, 0xa78a281daa582406uL))

public val GPM_STARTER_GPO_COLLECTION: Guid = Guid.fromU128(U128(0x82f8aa8b49ba43b2uL, 0x956e3397f9b94c3auL))

public val GPM_STATUS_MESSAGE: Guid = Guid.fromU128(U128(0x4b77cc94d255409buL, 0xbc62370881715a19uL))

public val GPM_STATUS_MSG_COLLECTION: Guid = Guid.fromU128(U128(0x2824e4be4bcc4cacuL, 0x9e600e3ed7f12496uL))

public val GPM_TEMPLATE: Guid = Guid.fromU128(U128(0xecf1d45471da4e2fuL, 0xa8c08185465911d9uL))

public val GPM_TRUSTEE: Guid = Guid.fromU128(U128(0xc54a700d19b64211uL, 0xbcb0e8e2475e471euL))

public val GPMWMI_FILTER: Guid = Guid.fromU128(U128(0x626745d80dea4062uL, 0xbf60cfc5b1ca1286uL))

public val GPMWMI_FILTER_COLLECTION: Guid = Guid.fromU128(U128(0x74dc6d28e82047d6uL, 0xa0b8f08d93d7fa33uL))

public val GPM_DONOTUSE_W2KDC: UInt = 2u

public val GPM_DONOT_VALIDATEDC: UInt = 1u

public val GPM_MIGRATIONTABLE_ONLY: UInt = 1u

public val GPM_PROCESS_SECURITY: UInt = 2u

public val GPM_USE_ANYDC: UInt = 1u

public val GPM_USE_PDC: UInt = 0u

public val GPO_TYPE_DS: GroupPolicyObjectType = 2

public val GPO_TYPE_LOCAL: GroupPolicyObjectType = 0

public val GPO_TYPE_LOCAL_GROUP: GroupPolicyObjectType = 4

public val GPO_TYPE_LOCAL_USER: GroupPolicyObjectType = 3

public val GPO_TYPE_REMOTE: GroupPolicyObjectType = 1

public val GPO_BROWSE_DISABLENEW: UInt = 1u

public val GPO_BROWSE_INITTOALL: UInt = 16u

public val GPO_BROWSE_NOCOMPUTERS: UInt = 2u

public val GPO_BROWSE_NODSGPOS: UInt = 4u

public val GPO_BROWSE_NOUSERGPOS: UInt = 32u

public val GPO_BROWSE_OPENBUTTON: UInt = 8u

public val GPO_BROWSE_SENDAPPLYONEDIT: UInt = 64u

public val GPO_FLAG_DISABLE: UInt = 1u

public val GPO_FLAG_FORCE: UInt = 2u

public val GPO_INFO_FLAG_ASYNC_FOREGROUND: UInt = 4096u

public val GPO_INFO_FLAG_BACKGROUND: UInt = 16u

public val GPO_INFO_FLAG_FORCED_REFRESH: UInt = 1024u

public val GPO_INFO_FLAG_LINKTRANSITION: UInt = 256u

public val GPO_INFO_FLAG_LOGRSOP_TRANSITION: UInt = 512u

public val GPO_INFO_FLAG_MACHINE: UInt = 1u

public val GPO_INFO_FLAG_NOCHANGES: UInt = 128u

public val GPO_INFO_FLAG_SAFEMODE_BOOT: UInt = 2048u

public val GPO_INFO_FLAG_SLOWLINK: UInt = 32u

public val GPO_INFO_FLAG_VERBOSE: UInt = 64u

public val GPO_LIST_FLAG_MACHINE: UInt = 1u

public val GPO_LIST_FLAG_NO_SECURITYFILTERS: UInt = 8u

public val GPO_LIST_FLAG_NO_WMIFILTERS: UInt = 4u

public val GPO_LIST_FLAG_SITEONLY: UInt = 2u

public val GPO_OPEN_LOAD_REGISTRY: GpoOpenFlags = 1u

public val GPO_OPEN_READ_ONLY: GpoOpenFlags = 2u

public val GPO_OPTION_DISABLE_MACHINE: GpoOptions = 2u

public val GPO_OPTION_DISABLE_USER: GpoOptions = 1u

public val GPO_SECTION_MACHINE: GpoSection = 2u

public val GPO_SECTION_ROOT: GpoSection = 0u

public val GPO_SECTION_USER: GpoSection = 1u

public val GP_DLLNAME: Pcwstr = w("DllName")

public val GP_ENABLEASYNCHRONOUSPROCESSING: Pcwstr = w("EnableAsynchronousProcessing")

public val GP_MAXNOGPOLISTCHANGESINTERVAL: Pcwstr = w("MaxNoGPOListChangesInterval")

public val GP_NOBACKGROUNDPOLICY: Pcwstr = w("NoBackgroundPolicy")

public val GP_NOGPOLISTCHANGES: Pcwstr = w("NoGPOListChanges")

public val GP_NOMACHINEPOLICY: Pcwstr = w("NoMachinePolicy")

public val GP_NOSLOWLINK: Pcwstr = w("NoSlowLink")

public val GP_NOTIFYLINKTRANSITION: Pcwstr = w("NotifyLinkTransition")

public val GP_NOUSERPOLICY: Pcwstr = w("NoUserPolicy")

public val GP_PERUSERLOCALSETTINGS: Pcwstr = w("PerUserLocalSettings")

public val GP_PROCESSGROUPPOLICY: Pcwstr = w("ProcessGroupPolicy")

public val GP_REQUIRESSUCCESSFULREGISTRY: Pcwstr = w("RequiresSuccessfulRegistry")

public val GROUP_POLICY_TRIGGER_EVENT_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xbd2f42525e1e49fcuL, 0x9a30f3978ad89ee2uL))

public val LOCALSTATE_ASSIGNED: UInt = 1u

public val LOCALSTATE_ORPHANED: UInt = 32u

public val LOCALSTATE_POLICYREMOVE_ORPHAN: UInt = 8u

public val LOCALSTATE_POLICYREMOVE_UNINSTALL: UInt = 16u

public val LOCALSTATE_PUBLISHED: UInt = 2u

public val LOCALSTATE_UNINSTALLED: UInt = 64u

public val LOCALSTATE_UNINSTALL_UNMANAGED: UInt = 4u

public val MACHINE_POLICY_PRESENT_TRIGGER_GUID: Guid = Guid.fromU128(U128(0x659fcae65bdb4da9uL, 0xb1ffca2a178d46e0uL))

public val MANAGED_APPS_FROMCATEGORY: UInt = 2u

public val MANAGED_APPS_INFOLEVEL_DEFAULT: UInt = 65536u

public val MANAGED_APPS_USERAPPLICATIONS: UInt = 1u

public val MANAGED_APPTYPE_SETUPEXE: UInt = 2u

public val MANAGED_APPTYPE_UNSUPPORTED: UInt = 3u

public val MANAGED_APPTYPE_WINDOWSINSTALLER: UInt = 1u

public val NODEID_MACHINE: Guid = Guid.fromU128(U128(0x8fc0b737a0e111d1uL, 0xa7d30000f87571e3uL))

public val NODEID_MACHINE_SW_SETTINGS: Guid = Guid.fromU128(U128(0x8fc0b73aa0e111d1uL, 0xa7d30000f87571e3uL))

public val NODEID_RSOP_MACHINE: Guid = Guid.fromU128(U128(0xbd4c1a2e0b7a4a62uL, 0xa6b0c0577539c97euL))

public val NODEID_RSOP_MACHINE_SW_SETTINGS: Guid = Guid.fromU128(U128(0x6a76273eeb8e45dbuL, 0x94c525663a5f2c1auL))

public val NODEID_RSOP_USER: Guid = Guid.fromU128(U128(0xab87364f0cec4cd8uL, 0x9bf8898f34628fb8uL))

public val NODEID_RSOP_USER_SW_SETTINGS: Guid = Guid.fromU128(U128(0xe52c5ce3fd274402uL, 0x84ded9a5f2858910uL))

public val NODEID_USER: Guid = Guid.fromU128(U128(0x8fc0b738a0e111d1uL, 0xa7d30000f87571e3uL))

public val NODEID_USER_SW_SETTINGS: Guid = Guid.fromU128(U128(0x8fc0b73ca0e111d1uL, 0xa7d30000f87571e3uL))

public val PI_APPLYPOLICY: UInt = 2u

public val PI_NOUI: UInt = 1u

public val PROGID: Installspectype = 3

public val PT_MANDATORY: UInt = 4u

public val PT_ROAMING: UInt = 2u

public val PT_ROAMING_PREEXISTING: UInt = 8u

public val PT_TEMPORARY: UInt = 1u

public val PUBLISHED: Appstate = 2

public val REGISTRY_EXTENSION_GUID: Guid = Guid.fromU128(U128(0x35378eac683f11d2uL, 0xa89a00c04fbbcfa2uL))

public val RP_FORCE: UInt = 1u

public val RP_SYNC: UInt = 2u

public val RSOP_APPLIED: Settingstatus = 1

public val RSOP_FAILED: Settingstatus = 3

public val RSOP_IGNORED: Settingstatus = 2

public val RSOP_SUBSETTING_FAILED: Settingstatus = 4

public val RSOP_UNSPECIFIED: Settingstatus = 0

public val RSOP_COMPUTER_ACCESS_DENIED: UInt = 2u

public val RSOP_INFO_FLAG_DIAGNOSTIC_MODE: UInt = 1u

public val RSOP_NO_COMPUTER: UInt = 65536u

public val RSOP_NO_USER: UInt = 131072u

public val RSOP_PLANNING_ASSUME_COMP_WQLFILTER_TRUE: UInt = 16u

public val RSOP_PLANNING_ASSUME_LOOPBACK_MERGE: UInt = 2u

public val RSOP_PLANNING_ASSUME_LOOPBACK_REPLACE: UInt = 4u

public val RSOP_PLANNING_ASSUME_SLOW_LINK: UInt = 1u

public val RSOP_PLANNING_ASSUME_USER_WQLFILTER_TRUE: UInt = 8u

public val RSOP_TEMPNAMESPACE_EXISTS: UInt = 4u

public val RSOP_USER_ACCESS_DENIED: UInt = 1u

public val USER_POLICY_PRESENT_TRIGGER_GUID: Guid = Guid.fromU128(U128(0x54fb46c8f089464cuL, 0xb1fd59d1b62c3b50uL))

public val BACKUP_MOST_RECENT: GPMSearchProperty = 9

public val GPO_COMPUTER_EXTENSIONS: GPMSearchProperty = 5

public val GPO_DISPLAY_NAME: GPMSearchProperty = 2

public val GPO_DOMAIN: GPMSearchProperty = 8

public val GPO_EFFECTIVE_PERMISSIONS: GPMSearchProperty = 1

public val GPO_ID: GPMSearchProperty = 4

public val GPO_PERMISSIONS: GPMSearchProperty = 0

public val GPO_USER_EXTENSIONS: GPMSearchProperty = 6

public val GPO_WMI_FILTER: GPMSearchProperty = 3

public val OP_CONTAINS: GPMSearchOperation = 1

public val OP_DESTINATION_BY_RELATIVE_NAME: GPMDestinationOption = 2

public val OP_DESTINATION_NONE: GPMDestinationOption = 1

public val OP_DESTINATION_SAME_AS_SOURCE: GPMDestinationOption = 0

public val OP_DESTINATION_SET: GPMDestinationOption = 3

public val OP_EQUALS: GPMSearchOperation = 0

public val OP_NOT_CONTAINS: GPMSearchOperation = 2

public val OP_NOT_EQUALS: GPMSearchOperation = 3

public val OP_REPORT_COMMENTS: GPMReportingOptions = 1

public val OP_REPORT_LEGACY: GPMReportingOptions = 0

public val PERM_GPO_APPLY: GPMPermissionType = 65536

public val PERM_GPO_CUSTOM: GPMPermissionType = 65795

public val PERM_GPO_EDIT: GPMPermissionType = 65793

public val PERM_GPO_EDIT_SECURITY_AND_DELETE: GPMPermissionType = 65794

public val PERM_GPO_READ: GPMPermissionType = 65792

public val PERM_SOMGPO_CREATE: GPMPermissionType = 1049600

public val PERM_SOM_LINK: GPMPermissionType = 1835008

public val PERM_SOM_LOGGING: GPMPermissionType = 1573120

public val PERM_SOM_PLANNING: GPMPermissionType = 1573376

public val PERM_SOM_STARTER_GPO_CREATE: GPMPermissionType = 1049856

public val PERM_SOMWMI_CREATE: GPMPermissionType = 1049344

public val PERM_SOMWMI_FULL_CONTROL: GPMPermissionType = 1049345

public val PERM_STARTER_GPO_CUSTOM: GPMPermissionType = 197891

public val PERM_STARTER_GPO_EDIT: GPMPermissionType = 197889

public val PERM_STARTER_GPO_FULL_CONTROL: GPMPermissionType = 197890

public val PERM_STARTER_GPO_READ: GPMPermissionType = 197888

public val PERM_WMI_FILTER_CUSTOM: GPMPermissionType = 131074

public val PERM_WMI_FILTER_EDIT: GPMPermissionType = 131072

public val PERM_WMI_FILTER_FULL_CONTROL: GPMPermissionType = 131073

public val REP_CLIENT_HEALTH_REFRESH_XML: GPMReportType = 5

public val REP_CLIENT_HEALTH_XML: GPMReportType = 4

public val REP_HTML: GPMReportType = 1

public val REP_INFRA_REFRESH_XML: GPMReportType = 3

public val REP_INFRA_XML: GPMReportType = 2

public val REP_XML: GPMReportType = 0

public val RSOP_LOGGING: GPMRSOPMode = 2

public val RSOP_PLANNING: GPMRSOPMode = 1

public val RSOP_UNKNOWN: GPMRSOPMode = 0

public val SOM_DOMAIN: GPMSOMType = 1

public val SOM_LINKS: GPMSearchProperty = 7

public val SOM_OU: GPMSOMType = 2

public val SOM_SITE: GPMSOMType = 0

public val STARTER_GPO_DISPLAY_NAME: GPMSearchProperty = 12

public val STARTER_GPO_DOMAIN: GPMSearchProperty = 14

public val STARTER_GPO_EFFECTIVE_PERMISSIONS: GPMSearchProperty = 11

public val STARTER_GPOID: GPMSearchProperty = 13

public val STARTER_GPO_PERMISSIONS: GPMSearchProperty = 10

public val TYPE_COMPUTER: GPMEntryType = 1

public val TYPE_CUSTOM: GPMStarterGPOType = 1

public val TYPE_GPO: GPMBackupType = 0

public val TYPE_GLOBAL_GROUP: GPMEntryType = 3

public val TYPE_LOCAL_GROUP: GPMEntryType = 2

public val TYPE_STARTER_GPO: GPMBackupType = 1

public val TYPE_SYSTEM: GPMStarterGPOType = 0

public val TYPE_UNC_PATH: GPMEntryType = 5

public val TYPE_UNIVERSAL_GROUP: GPMEntryType = 4

public val TYPE_UNKNOWN: GPMEntryType = 6

public val TYPE_USER: GPMEntryType = 0
