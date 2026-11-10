package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACTRL_DS_CONTROL_ACCESS: UInt = 256u

public val ACTRL_DS_CREATE_CHILD: UInt = 1u

public val ACTRL_DS_DELETE_CHILD: UInt = 2u

public val ACTRL_DS_DELETE_TREE: UInt = 64u

public val ACTRL_DS_LIST: UInt = 4u

public val ACTRL_DS_LIST_OBJECT: UInt = 128u

public val ACTRL_DS_OPEN: UInt = 0u

public val ACTRL_DS_READ_PROP: UInt = 16u

public val ACTRL_DS_SELF: UInt = 8u

public val ACTRL_DS_WRITE_PROP: UInt = 32u

public val ADAM_REPL_AUTHENTICATION_MODE_MUTUAL_AUTH_REQUIRED: UInt = 2u

public val ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE: UInt = 1u

public val ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE_PASS_THROUGH: UInt = 0u

public val ADAM_SCP_FSMO_NAMING_STRING: Pcstr = s("naming")

public val ADAM_SCP_FSMO_NAMING_STRING_W: Pcwstr = w("naming")

public val ADAM_SCP_FSMO_SCHEMA_STRING: Pcstr = s("schema")

public val ADAM_SCP_FSMO_SCHEMA_STRING_W: Pcwstr = w("schema")

public val ADAM_SCP_FSMO_STRING: Pcstr = s("fsmo:")

public val ADAM_SCP_FSMO_STRING_W: Pcwstr = w("fsmo:")

public val ADAM_SCP_INSTANCE_NAME_STRING: Pcstr = s("instance:")

public val ADAM_SCP_INSTANCE_NAME_STRING_W: Pcwstr = w("instance:")

public val ADAM_SCP_PARTITION_STRING: Pcstr = s("partition:")

public val ADAM_SCP_PARTITION_STRING_W: Pcwstr = w("partition:")

public val ADAM_SCP_SITE_NAME_STRING: Pcstr = s("site:")

public val ADAM_SCP_SITE_NAME_STRING_W: Pcwstr = w("site:")

public val ADSIPROP_ADSIFLAG: AdsPreferencesEnum = 12

public val ADSIPROP_ASYNCHRONOUS: AdsPreferencesEnum = 0

public val ADSIPROP_ATTRIBTYPES_ONLY: AdsPreferencesEnum = 4

public val ADSIPROP_CACHE_RESULTS: AdsPreferencesEnum = 11

public val ADSIPROP_CHASE_REFERRALS: AdsPreferencesEnum = 9

public val ADSIPROP_DEREF_ALIASES: AdsPreferencesEnum = 1

public val ADSIPROP_PAGED_TIME_LIMIT: AdsPreferencesEnum = 8

public val ADSIPROP_PAGESIZE: AdsPreferencesEnum = 7

public val ADSIPROP_SEARCH_SCOPE: AdsPreferencesEnum = 5

public val ADSIPROP_SIZE_LIMIT: AdsPreferencesEnum = 2

public val ADSIPROP_SORT_ON: AdsPreferencesEnum = 10

public val ADSIPROP_TIMEOUT: AdsPreferencesEnum = 6

public val ADSIPROP_TIME_LIMIT: AdsPreferencesEnum = 3

public val ADSI_DIALECT_LDAP: AdsiDialectEnum = 0

public val ADSI_DIALECT_SQL: AdsiDialectEnum = 1

public val ADSTYPE_BACKLINK: Adstype = 18

public val ADSTYPE_BOOLEAN: Adstype = 6

public val ADSTYPE_CASEIGNORE_LIST: Adstype = 13

public val ADSTYPE_CASE_EXACT_STRING: Adstype = 2

public val ADSTYPE_CASE_IGNORE_STRING: Adstype = 3

public val ADSTYPE_DN_STRING: Adstype = 1

public val ADSTYPE_DN_WITH_BINARY: Adstype = 27

public val ADSTYPE_DN_WITH_STRING: Adstype = 28

public val ADSTYPE_EMAIL: Adstype = 24

public val ADSTYPE_FAXNUMBER: Adstype = 23

public val ADSTYPE_HOLD: Adstype = 20

public val ADSTYPE_INTEGER: Adstype = 7

public val ADSTYPE_INVALID: Adstype = 0

public val ADSTYPE_LARGE_INTEGER: Adstype = 10

public val ADSTYPE_NETADDRESS: Adstype = 21

public val ADSTYPE_NT_SECURITY_DESCRIPTOR: Adstype = 25

public val ADSTYPE_NUMERIC_STRING: Adstype = 5

public val ADSTYPE_OBJECT_CLASS: Adstype = 12

public val ADSTYPE_OCTET_LIST: Adstype = 14

public val ADSTYPE_OCTET_STRING: Adstype = 8

public val ADSTYPE_PATH: Adstype = 15

public val ADSTYPE_POSTALADDRESS: Adstype = 16

public val ADSTYPE_PRINTABLE_STRING: Adstype = 4

public val ADSTYPE_PROV_SPECIFIC: Adstype = 11

public val ADSTYPE_REPLICAPOINTER: Adstype = 22

public val ADSTYPE_TIMESTAMP: Adstype = 17

public val ADSTYPE_TYPEDNAME: Adstype = 19

public val ADSTYPE_UNKNOWN: Adstype = 26

public val ADSTYPE_UTC_TIME: Adstype = 9

public val ADS_ACEFLAG_FAILED_ACCESS: AdsAceflagEnum = 128

public val ADS_ACEFLAG_INHERITED_ACE: AdsAceflagEnum = 16

public val ADS_ACEFLAG_INHERIT_ACE: AdsAceflagEnum = 2

public val ADS_ACEFLAG_INHERIT_ONLY_ACE: AdsAceflagEnum = 8

public val ADS_ACEFLAG_NO_PROPAGATE_INHERIT_ACE: AdsAceflagEnum = 4

public val ADS_ACEFLAG_SUCCESSFUL_ACCESS: AdsAceflagEnum = 64

public val ADS_ACEFLAG_VALID_INHERIT_FLAGS: AdsAceflagEnum = 31

public val ADS_ACETYPE_ACCESS_ALLOWED: AdsAcetypeEnum = 0

public val ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK: AdsAcetypeEnum = 9

public val ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK_OBJECT: AdsAcetypeEnum = 11

public val ADS_ACETYPE_ACCESS_ALLOWED_OBJECT: AdsAcetypeEnum = 5

public val ADS_ACETYPE_ACCESS_DENIED: AdsAcetypeEnum = 1

public val ADS_ACETYPE_ACCESS_DENIED_CALLBACK: AdsAcetypeEnum = 10

public val ADS_ACETYPE_ACCESS_DENIED_CALLBACK_OBJECT: AdsAcetypeEnum = 12

public val ADS_ACETYPE_ACCESS_DENIED_OBJECT: AdsAcetypeEnum = 6

public val ADS_ACETYPE_SYSTEM_ALARM_CALLBACK: AdsAcetypeEnum = 14

public val ADS_ACETYPE_SYSTEM_ALARM_CALLBACK_OBJECT: AdsAcetypeEnum = 16

public val ADS_ACETYPE_SYSTEM_ALARM_OBJECT: AdsAcetypeEnum = 8

public val ADS_ACETYPE_SYSTEM_AUDIT: AdsAcetypeEnum = 2

public val ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK: AdsAcetypeEnum = 13

public val ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK_OBJECT: AdsAcetypeEnum = 15

public val ADS_ACETYPE_SYSTEM_AUDIT_OBJECT: AdsAcetypeEnum = 7

public val ADS_ATTR_APPEND: UInt = 3u

public val ADS_ATTR_CLEAR: UInt = 1u

public val ADS_ATTR_DELETE: UInt = 4u

public val ADS_ATTR_UPDATE: UInt = 2u

public val ADS_AUTH_RESERVED: AdsAuthenticationEnum = 2147483648u

public val ADS_CHASE_REFERRALS_ALWAYS: AdsChaseReferralsEnum = 96

public val ADS_CHASE_REFERRALS_EXTERNAL: AdsChaseReferralsEnum = 64

public val ADS_CHASE_REFERRALS_NEVER: AdsChaseReferralsEnum = 0

public val ADS_CHASE_REFERRALS_SUBORDINATE: AdsChaseReferralsEnum = 32

public val ADS_DEREF_ALWAYS: AdsDerefenum = 3

public val ADS_DEREF_FINDING: AdsDerefenum = 2

public val ADS_DEREF_NEVER: AdsDerefenum = 0

public val ADS_DEREF_SEARCHING: AdsDerefenum = 1

public val ADS_DISPLAY_FULL: AdsDisplayEnum = 1

public val ADS_DISPLAY_VALUE_ONLY: AdsDisplayEnum = 2

public val ADS_ESCAPEDMODE_DEFAULT: AdsEscapeModeEnum = 1

public val ADS_ESCAPEDMODE_OFF: AdsEscapeModeEnum = 3

public val ADS_ESCAPEDMODE_OFF_EX: AdsEscapeModeEnum = 4

public val ADS_ESCAPEDMODE_ON: AdsEscapeModeEnum = 2

public val ADS_EXT_INITCREDENTIALS: UInt = 1u

public val ADS_EXT_INITIALIZE_COMPLETE: UInt = 2u

public val ADS_EXT_MAXEXTDISPID: UInt = 16777215u

public val ADS_EXT_MINEXTDISPID: UInt = 1u

public val ADS_FAST_BIND: AdsAuthenticationEnum = 32u

public val ADS_FLAG_INHERITED_OBJECT_TYPE_PRESENT: AdsFlagtypeEnum = 2

public val ADS_FLAG_OBJECT_TYPE_PRESENT: AdsFlagtypeEnum = 1

public val ADS_FORMAT_LEAF: AdsFormatEnum = 11

public val ADS_FORMAT_PROVIDER: AdsFormatEnum = 10

public val ADS_FORMAT_SERVER: AdsFormatEnum = 9

public val ADS_FORMAT_WINDOWS: AdsFormatEnum = 1

public val ADS_FORMAT_WINDOWS_DN: AdsFormatEnum = 3

public val ADS_FORMAT_WINDOWS_NO_SERVER: AdsFormatEnum = 2

public val ADS_FORMAT_WINDOWS_PARENT: AdsFormatEnum = 4

public val ADS_FORMAT_X500: AdsFormatEnum = 5

public val ADS_FORMAT_X500_DN: AdsFormatEnum = 7

public val ADS_FORMAT_X500_NO_SERVER: AdsFormatEnum = 6

public val ADS_FORMAT_X500_PARENT: AdsFormatEnum = 8

public val ADS_GROUP_TYPE_DOMAIN_LOCAL_GROUP: AdsGroupTypeEnum = 4

public val ADS_GROUP_TYPE_GLOBAL_GROUP: AdsGroupTypeEnum = 2

public val ADS_GROUP_TYPE_LOCAL_GROUP: AdsGroupTypeEnum = 4

public val ADS_GROUP_TYPE_SECURITY_ENABLED: AdsGroupTypeEnum = -2147483648.toInt()

public val ADS_GROUP_TYPE_UNIVERSAL_GROUP: AdsGroupTypeEnum = 8

public val ADS_NAME_INITTYPE_DOMAIN: AdsNameInittypeEnum = 1

public val ADS_NAME_INITTYPE_GC: AdsNameInittypeEnum = 3

public val ADS_NAME_INITTYPE_SERVER: AdsNameInittypeEnum = 2

public val ADS_NAME_TYPE_1779: AdsNameTypeEnum = 1

public val ADS_NAME_TYPE_CANONICAL: AdsNameTypeEnum = 2

public val ADS_NAME_TYPE_CANONICAL_EX: AdsNameTypeEnum = 10

public val ADS_NAME_TYPE_DISPLAY: AdsNameTypeEnum = 4

public val ADS_NAME_TYPE_DOMAIN_SIMPLE: AdsNameTypeEnum = 5

public val ADS_NAME_TYPE_ENTERPRISE_SIMPLE: AdsNameTypeEnum = 6

public val ADS_NAME_TYPE_GUID: AdsNameTypeEnum = 7

public val ADS_NAME_TYPE_NT4: AdsNameTypeEnum = 3

public val ADS_NAME_TYPE_SERVICE_PRINCIPAL_NAME: AdsNameTypeEnum = 11

public val ADS_NAME_TYPE_SID_OR_SID_HISTORY_NAME: AdsNameTypeEnum = 12

public val ADS_NAME_TYPE_UNKNOWN: AdsNameTypeEnum = 8

public val ADS_NAME_TYPE_USER_PRINCIPAL_NAME: AdsNameTypeEnum = 9

public val ADS_NO_AUTHENTICATION: AdsAuthenticationEnum = 16u

public val ADS_NO_REFERRAL_CHASING: AdsAuthenticationEnum = 1024u

public val ADS_OPTION_ACCUMULATIVE_MODIFICATION: AdsOptionEnum = 8

public val ADS_OPTION_MUTUAL_AUTH_STATUS: AdsOptionEnum = 4

public val ADS_OPTION_PAGE_SIZE: AdsOptionEnum = 2

public val ADS_OPTION_PASSWORD_METHOD: AdsOptionEnum = 7

public val ADS_OPTION_PASSWORD_PORTNUMBER: AdsOptionEnum = 6

public val ADS_OPTION_QUOTA: AdsOptionEnum = 5

public val ADS_OPTION_REFERRALS: AdsOptionEnum = 1

public val ADS_OPTION_SECURITY_MASK: AdsOptionEnum = 3

public val ADS_OPTION_SERVERNAME: AdsOptionEnum = 0

public val ADS_OPTION_SKIP_SID_LOOKUP: AdsOptionEnum = 9

public val ADS_PASSWORD_ENCODE_CLEAR: AdsPasswordEncodingEnum = 1

public val ADS_PASSWORD_ENCODE_REQUIRE_SSL: AdsPasswordEncodingEnum = 0

public val ADS_PATH_FILE: AdsPathtypeEnum = 1

public val ADS_PATH_FILESHARE: AdsPathtypeEnum = 2

public val ADS_PATH_REGISTRY: AdsPathtypeEnum = 3

public val ADS_PROMPT_CREDENTIALS: AdsAuthenticationEnum = 8u

public val ADS_PROPERTY_APPEND: AdsPropertyOperationEnum = 3

public val ADS_PROPERTY_CLEAR: AdsPropertyOperationEnum = 1

public val ADS_PROPERTY_DELETE: AdsPropertyOperationEnum = 4

public val ADS_PROPERTY_UPDATE: AdsPropertyOperationEnum = 2

public val ADS_READONLY_SERVER: AdsAuthenticationEnum = 4u

public val ADS_RIGHT_ACCESS_SYSTEM_SECURITY: AdsRightsEnum = 16777216

public val ADS_RIGHT_ACTRL_DS_LIST: AdsRightsEnum = 4

public val ADS_RIGHT_DELETE: AdsRightsEnum = 65536

public val ADS_RIGHT_DS_CONTROL_ACCESS: AdsRightsEnum = 256

public val ADS_RIGHT_DS_CREATE_CHILD: AdsRightsEnum = 1

public val ADS_RIGHT_DS_DELETE_CHILD: AdsRightsEnum = 2

public val ADS_RIGHT_DS_DELETE_TREE: AdsRightsEnum = 64

public val ADS_RIGHT_DS_LIST_OBJECT: AdsRightsEnum = 128

public val ADS_RIGHT_DS_READ_PROP: AdsRightsEnum = 16

public val ADS_RIGHT_DS_SELF: AdsRightsEnum = 8

public val ADS_RIGHT_DS_WRITE_PROP: AdsRightsEnum = 32

public val ADS_RIGHT_GENERIC_ALL: AdsRightsEnum = 268435456

public val ADS_RIGHT_GENERIC_EXECUTE: AdsRightsEnum = 536870912

public val ADS_RIGHT_GENERIC_READ: AdsRightsEnum = -2147483648.toInt()

public val ADS_RIGHT_GENERIC_WRITE: AdsRightsEnum = 1073741824

public val ADS_RIGHT_READ_CONTROL: AdsRightsEnum = 131072

public val ADS_RIGHT_SYNCHRONIZE: AdsRightsEnum = 1048576

public val ADS_RIGHT_WRITE_DAC: AdsRightsEnum = 262144

public val ADS_RIGHT_WRITE_OWNER: AdsRightsEnum = 524288

public val ADS_SCOPE_BASE: AdsScopeenum = 0

public val ADS_SCOPE_ONELEVEL: AdsScopeenum = 1

public val ADS_SCOPE_SUBTREE: AdsScopeenum = 2

public val ADS_SD_CONTROL_SE_DACL_AUTO_INHERITED: AdsSdControlEnum = 1024

public val ADS_SD_CONTROL_SE_DACL_AUTO_INHERIT_REQ: AdsSdControlEnum = 256

public val ADS_SD_CONTROL_SE_DACL_DEFAULTED: AdsSdControlEnum = 8

public val ADS_SD_CONTROL_SE_DACL_PRESENT: AdsSdControlEnum = 4

public val ADS_SD_CONTROL_SE_DACL_PROTECTED: AdsSdControlEnum = 4096

public val ADS_SD_CONTROL_SE_GROUP_DEFAULTED: AdsSdControlEnum = 2

public val ADS_SD_CONTROL_SE_OWNER_DEFAULTED: AdsSdControlEnum = 1

public val ADS_SD_CONTROL_SE_SACL_AUTO_INHERITED: AdsSdControlEnum = 2048

public val ADS_SD_CONTROL_SE_SACL_AUTO_INHERIT_REQ: AdsSdControlEnum = 512

public val ADS_SD_CONTROL_SE_SACL_DEFAULTED: AdsSdControlEnum = 32

public val ADS_SD_CONTROL_SE_SACL_PRESENT: AdsSdControlEnum = 16

public val ADS_SD_CONTROL_SE_SACL_PROTECTED: AdsSdControlEnum = 8192

public val ADS_SD_CONTROL_SE_SELF_RELATIVE: AdsSdControlEnum = 32768

public val ADS_SD_FORMAT_HEXSTRING: AdsSdFormatEnum = 3

public val ADS_SD_FORMAT_IID: AdsSdFormatEnum = 1

public val ADS_SD_FORMAT_RAW: AdsSdFormatEnum = 2

public val ADS_SD_REVISION_DS: AdsSdRevisionEnum = 4

public val ADS_SEARCHPREF_ASYNCHRONOUS: AdsSearchprefEnum = 0

public val ADS_SEARCHPREF_ATTRIBTYPES_ONLY: AdsSearchprefEnum = 4

public val ADS_SEARCHPREF_ATTRIBUTE_QUERY: AdsSearchprefEnum = 15

public val ADS_SEARCHPREF_CACHE_RESULTS: AdsSearchprefEnum = 11

public val ADS_SEARCHPREF_CHASE_REFERRALS: AdsSearchprefEnum = 9

public val ADS_SEARCHPREF_DEREF_ALIASES: AdsSearchprefEnum = 1

public val ADS_SEARCHPREF_DIRSYNC: AdsSearchprefEnum = 12

public val ADS_SEARCHPREF_DIRSYNC_FLAG: AdsSearchprefEnum = 17

public val ADS_SEARCHPREF_EXTENDED_DN: AdsSearchprefEnum = 18

public val ADS_SEARCHPREF_PAGED_TIME_LIMIT: AdsSearchprefEnum = 8

public val ADS_SEARCHPREF_PAGESIZE: AdsSearchprefEnum = 7

public val ADS_SEARCHPREF_SEARCH_SCOPE: AdsSearchprefEnum = 5

public val ADS_SEARCHPREF_SECURITY_MASK: AdsSearchprefEnum = 16

public val ADS_SEARCHPREF_SIZE_LIMIT: AdsSearchprefEnum = 2

public val ADS_SEARCHPREF_SORT_ON: AdsSearchprefEnum = 10

public val ADS_SEARCHPREF_TIMEOUT: AdsSearchprefEnum = 6

public val ADS_SEARCHPREF_TIME_LIMIT: AdsSearchprefEnum = 3

public val ADS_SEARCHPREF_TOMBSTONE: AdsSearchprefEnum = 13

public val ADS_SEARCHPREF_VLV: AdsSearchprefEnum = 14

public val ADS_SECURE_AUTHENTICATION: AdsAuthenticationEnum = 1u

public val ADS_SECURITY_INFO_DACL: AdsSecurityInfoEnum = 4

public val ADS_SECURITY_INFO_GROUP: AdsSecurityInfoEnum = 2

public val ADS_SECURITY_INFO_OWNER: AdsSecurityInfoEnum = 1

public val ADS_SECURITY_INFO_SACL: AdsSecurityInfoEnum = 8

public val ADS_SERVER_BIND: AdsAuthenticationEnum = 512u

public val ADS_SETTYPE_DN: AdsSettypeEnum = 4

public val ADS_SETTYPE_FULL: AdsSettypeEnum = 1

public val ADS_SETTYPE_PROVIDER: AdsSettypeEnum = 2

public val ADS_SETTYPE_SERVER: AdsSettypeEnum = 3

public val ADS_STATUS_INVALID_SEARCHPREF: AdsStatusenum = 1

public val ADS_STATUS_INVALID_SEARCHPREFVALUE: AdsStatusenum = 2

public val ADS_STATUS_S_OK: AdsStatusenum = 0

public val ADS_SYSTEMFLAG_ATTR_IS_CONSTRUCTED: AdsSystemflagEnum = 4

public val ADS_SYSTEMFLAG_ATTR_NOT_REPLICATED: AdsSystemflagEnum = 1

public val ADS_SYSTEMFLAG_CONFIG_ALLOW_LIMITED_MOVE: AdsSystemflagEnum = 268435456

public val ADS_SYSTEMFLAG_CONFIG_ALLOW_MOVE: AdsSystemflagEnum = 536870912

public val ADS_SYSTEMFLAG_CONFIG_ALLOW_RENAME: AdsSystemflagEnum = 1073741824

public val ADS_SYSTEMFLAG_CR_NTDS_DOMAIN: AdsSystemflagEnum = 2

public val ADS_SYSTEMFLAG_CR_NTDS_NC: AdsSystemflagEnum = 1

public val ADS_SYSTEMFLAG_DISALLOW_DELETE: AdsSystemflagEnum = -2147483648.toInt()

public val ADS_SYSTEMFLAG_DOMAIN_DISALLOW_MOVE: AdsSystemflagEnum = 67108864

public val ADS_SYSTEMFLAG_DOMAIN_DISALLOW_RENAME: AdsSystemflagEnum = 134217728

public val ADS_UF_ACCOUNTDISABLE: AdsUserFlagEnum = 2

public val ADS_UF_DONT_EXPIRE_PASSWD: AdsUserFlagEnum = 65536

public val ADS_UF_DONT_REQUIRE_PREAUTH: AdsUserFlagEnum = 4194304

public val ADS_UF_ENCRYPTED_TEXT_PASSWORD_ALLOWED: AdsUserFlagEnum = 128

public val ADS_UF_HOMEDIR_REQUIRED: AdsUserFlagEnum = 8

public val ADS_UF_INTERDOMAIN_TRUST_ACCOUNT: AdsUserFlagEnum = 2048

public val ADS_UF_LOCKOUT: AdsUserFlagEnum = 16

public val ADS_UF_MNS_LOGON_ACCOUNT: AdsUserFlagEnum = 131072

public val ADS_UF_NORMAL_ACCOUNT: AdsUserFlagEnum = 512

public val ADS_UF_NOT_DELEGATED: AdsUserFlagEnum = 1048576

public val ADS_UF_PASSWD_CANT_CHANGE: AdsUserFlagEnum = 64

public val ADS_UF_PASSWD_NOTREQD: AdsUserFlagEnum = 32

public val ADS_UF_PASSWORD_EXPIRED: AdsUserFlagEnum = 8388608

public val ADS_UF_SCRIPT: AdsUserFlagEnum = 1

public val ADS_UF_SERVER_TRUST_ACCOUNT: AdsUserFlagEnum = 8192

public val ADS_UF_SMARTCARD_REQUIRED: AdsUserFlagEnum = 262144

public val ADS_UF_TEMP_DUPLICATE_ACCOUNT: AdsUserFlagEnum = 256

public val ADS_UF_TRUSTED_FOR_DELEGATION: AdsUserFlagEnum = 524288

public val ADS_UF_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION: AdsUserFlagEnum = 16777216

public val ADS_UF_USE_DES_KEY_ONLY: AdsUserFlagEnum = 2097152

public val ADS_UF_WORKSTATION_TRUST_ACCOUNT: AdsUserFlagEnum = 4096

public val ADS_USE_DELEGATION: AdsAuthenticationEnum = 256u

public val ADS_USE_ENCRYPTION: AdsAuthenticationEnum = 2u

public val ADS_USE_SEALING: AdsAuthenticationEnum = 128u

public val ADS_USE_SIGNING: AdsAuthenticationEnum = 64u

public val ADS_USE_SSL: AdsAuthenticationEnum = 2u

public val AD_SYSTEM_INFO: Guid = Guid.fromU128(U128(0x50b6327fafd111d2uL, 0x9cb90000f87a369euL))

public val A_DS_SECURITY_UTILITY: Guid = Guid.fromU128(U128(0xf270c64affb84ae4uL, 0x85fe3a75e5347966uL))

public val ACCESS_CONTROL_ENTRY: Guid = Guid.fromU128(U128(0xb75ac0009bdd11d0uL, 0x852c00c04fd8d503uL))

public val ACCESS_CONTROL_LIST: Guid = Guid.fromU128(U128(0xb85ea0529bdd11d0uL, 0x852c00c04fd8d503uL))

public val BACK_LINK: Guid = Guid.fromU128(U128(0xfcbf906f408011d1uL, 0xa3ac00c04fb950dcuL))

public val CFSTR_DSDISPLAYSPECOPTIONS: Pcwstr = w("DsDisplaySpecOptions")

public val CFSTR_DSOBJECTNAMES: Pcwstr = w("DsObjectNames")

public val CFSTR_DSOP_DS_SELECTION_LIST: Pcwstr = w("CFSTR_DSOP_DS_SELECTION_LIST")

public val CFSTR_DSPROPERTYPAGEINFO: Pcwstr = w("DsPropPageInfo")

public val CFSTR_DSQUERYPARAMS: Pcwstr = w("DsQueryParameters")

public val CFSTR_DSQUERYSCOPE: Pcwstr = w("DsQueryScope")

public val CFSTR_DS_DISPLAY_SPEC_OPTIONS: Pcwstr = w("DsDisplaySpecOptions")

public val CLSID_COMMON_QUERY: Guid = Guid.fromU128(U128(0x83bc5ec06f2a11d0uL, 0xa1c400aa00c16e65uL))

public val CLSID_DS_ADMIN_CREATE_OBJ: Guid = Guid.fromU128(U128(0xe301a009f90111d2uL, 0x82b900c04f68928buL))

public val CLSID_DS_DISPLAY_SPECIFIER: Guid = Guid.fromU128(U128(0x1ab4a8c06a0b11d2uL, 0xad4900c04fa31a86uL))

public val CLSID_DS_DOMAIN_TREE_BROWSER: Guid = Guid.fromU128(U128(0x1698790ae2b411d0uL, 0xb0b100c04fd8dca6uL))

public val CLSID_DS_FIND_ADVANCED: Guid = Guid.fromU128(U128(0x83ee3fe357d911d0uL, 0xb93200a024ab2dbbuL))

public val CLSID_DS_FIND_COMPUTER: Guid = Guid.fromU128(U128(0x1600670087ad11d0uL, 0x914000aa00c16e65uL))

public val CLSID_DS_FIND_CONTAINER: Guid = Guid.fromU128(U128(0xc1b3cbf2886a11d0uL, 0x914000aa00c16e65uL))

public val CLSID_DS_FIND_DOMAIN_CONTROLLER: Guid = Guid.fromU128(U128(0x538c7b7ed25e11d0uL, 0x974200a0c906af45uL))

public val CLSID_DS_FIND_FRS_MEMBERS: Guid = Guid.fromU128(U128(0x94ce4b18b3d311d1uL, 0xb9b400c04fd8d5b0uL))

public val CLSID_DS_FIND_OBJECTS: Guid = Guid.fromU128(U128(0x83ee3fe157d911d0uL, 0xb93200a024ab2dbbuL))

public val CLSID_DS_FIND_PEOPLE: Guid = Guid.fromU128(U128(0x83ee3fe257d911d0uL, 0xb93200a024ab2dbbuL))

public val CLSID_DS_FIND_PRINTER: Guid = Guid.fromU128(U128(0xb577f0707ee211d0uL, 0x913f00aa00c16e65uL))

public val CLSID_DS_FIND_VOLUME: Guid = Guid.fromU128(U128(0xc1b3cbf1886a11d0uL, 0x914000aa00c16e65uL))

public val CLSID_DS_FIND_WRITEABLE_DOMAIN_CONTROLLER: Guid = Guid.fromU128(U128(0x7cbef079aa84444buL, 0xbc7068e41283eabcuL))

public val CLSID_DS_FOLDER_PROPERTIES: Guid = Guid.fromU128(U128(0x9e51e0d06e0f11d2uL, 0x960100c04fa31a86uL))

public val CLSID_DS_OBJECT_PICKER: Guid = Guid.fromU128(U128(0x17d6ccd83b7b11d2uL, 0xb9e000c04fd8dbf7uL))

public val CLSID_DS_PROPERTY_PAGES: Guid = Guid.fromU128(U128(0xd45d530764b11d0uL, 0xa1ca00aa00c16e65uL))

public val CLSID_DS_QUERY: Guid = Guid.fromU128(U128(0x8a23e65e31c211d0uL, 0x891c00a024ab2dbbuL))

public val CLSID_MICROSOFT_DS: Guid = Guid.fromU128(U128(0xfe1290f0cfbd11cfuL, 0xa33000aa00c16e65uL))

public val CQFF_ISOPTIONAL: UInt = 2u

public val CQFF_NOGLOBALPAGES: UInt = 1u

public val CQPM_CLEARFORM: UInt = 6u

public val CQPM_ENABLE: UInt = 3u

public val CQPM_GETPARAMETERS: UInt = 5u

public val CQPM_HANDLERSPECIFIC: UInt = 268435456u

public val CQPM_HELP: UInt = 8u

public val CQPM_INITIALIZE: UInt = 1u

public val CQPM_PERSIST: UInt = 7u

public val CQPM_RELEASE: UInt = 2u

public val CQPM_SETDEFAULTPARAMETERS: UInt = 9u

public val CASE_IGNORE_LIST: Guid = Guid.fromU128(U128(0x15f88a55468011d1uL, 0xa3b400c04fb950dcuL))

public val DBDTF_RETURNEXTERNAL: UInt = 4u

public val DBDTF_RETURNFQDN: UInt = 1u

public val DBDTF_RETURNINBOUND: UInt = 8u

public val DBDTF_RETURNINOUTBOUND: UInt = 16u

public val DBDTF_RETURNMIXEDDOMAINS: UInt = 2u

public val DN_WITH_BINARY: Guid = Guid.fromU128(U128(0x7e99c0a3f93511d2uL, 0xba9600c04fb6d0d1uL))

public val DN_WITH_STRING: Guid = Guid.fromU128(U128(0x334857ccf93411d2uL, 0xba9600c04fb6d0d1uL))

public val DSA_NEWOBJ_CTX_CLEANUP: UInt = 4u

public val DSA_NEWOBJ_CTX_COMMIT: UInt = 2u

public val DSA_NEWOBJ_CTX_POSTCOMMIT: UInt = 3u

public val DSA_NEWOBJ_CTX_PRECOMMIT: UInt = 1u

public val DSA_NOTIFY_DEL: UInt = 1u

public val DSA_NOTIFY_FLAG_ADDITIONAL_DATA: UInt = 2u

public val DSA_NOTIFY_FLAG_FORCE_ADDITIONAL_DATA: UInt = 1u

public val DSA_NOTIFY_MOV: UInt = 4u

public val DSA_NOTIFY_PROP: UInt = 8u

public val DSA_NOTIFY_REN: UInt = 2u

public val DSBF_DISPLAYNAME: UInt = 4u

public val DSBF_ICONLOCATION: UInt = 2u

public val DSBF_STATE: UInt = 1u

public val DSBID_BANNER: UInt = 256u

public val DSBID_CONTAINERLIST: UInt = 257u

public val DSBI_CHECKBOXES: UInt = 256u

public val DSBI_DONTSIGNSEAL: UInt = 33554432u

public val DSBI_ENTIREDIRECTORY: UInt = 589824u

public val DSBI_EXPANDONOPEN: UInt = 262144u

public val DSBI_HASCREDENTIALS: UInt = 2097152u

public val DSBI_IGNORETREATASLEAF: UInt = 4194304u

public val DSBI_INCLUDEHIDDEN: UInt = 131072u

public val DSBI_NOBUTTONS: UInt = 1u

public val DSBI_NOLINES: UInt = 2u

public val DSBI_NOLINESATROOT: UInt = 4u

public val DSBI_NOROOT: UInt = 65536u

public val DSBI_RETURNOBJECTCLASS: UInt = 16777216u

public val DSBI_RETURN_FORMAT: UInt = 1048576u

public val DSBI_SIMPLEAUTHENTICATE: UInt = 8388608u

public val DSBM_CHANGEIMAGESTATE: UInt = 102u

public val DSBM_CONTEXTMENU: UInt = 104u

public val DSBM_HELP: UInt = 103u

public val DSBM_QUERYINSERT: UInt = 100u

public val DSBM_QUERYINSERTA: UInt = 101u

public val DSBM_QUERYINSERTW: UInt = 100u

public val DSBS_CHECKED: UInt = 1u

public val DSBS_HIDDEN: UInt = 2u

public val DSBS_ROOT: UInt = 4u

public val DSB_MAX_DISPLAYNAME_CHARS: UInt = 64u

public val DSCCIF_HASWIZARDDIALOG: UInt = 1u

public val DSCCIF_HASWIZARDPRIMARYPAGE: UInt = 2u

public val DSDSOF_DONTSIGNSEAL: UInt = 4u

public val DSDSOF_DSAVAILABLE: UInt = 1073741824u

public val DSDSOF_HASUSERANDSERVERINFO: UInt = 1u

public val DSDSOF_SIMPLEAUTHENTICATE: UInt = 2u

public val DSECAF_NOTLISTED: UInt = 1u

public val DSGIF_DEFAULTISCONTAINER: UInt = 32u

public val DSGIF_GETDEFAULTICON: UInt = 16u

public val DSGIF_ISDISABLED: UInt = 2u

public val DSGIF_ISMASK: UInt = 15u

public val DSGIF_ISNORMAL: UInt = 0u

public val DSGIF_ISOPEN: UInt = 1u

public val DSICCF_IGNORETREATASLEAF: UInt = 1u

public val DSOBJECT_ISCONTAINER: UInt = 1u

public val DSOBJECT_READONLYPAGES: UInt = 2147483648u

public val DSOP_DOWNLEVEL_FILTER_ALL_APP_PACKAGES: UInt = 2281701376u

public val DSOP_DOWNLEVEL_FILTER_ALL_WELLKNOWN_SIDS: UInt = 2147614720u

public val DSOP_DOWNLEVEL_FILTER_ANONYMOUS: UInt = 2147483712u

public val DSOP_DOWNLEVEL_FILTER_AUTHENTICATED_USER: UInt = 2147483680u

public val DSOP_DOWNLEVEL_FILTER_BATCH: UInt = 2147483776u

public val DSOP_DOWNLEVEL_FILTER_COMPUTERS: UInt = 2147483656u

public val DSOP_DOWNLEVEL_FILTER_CREATOR_GROUP: UInt = 2147484160u

public val DSOP_DOWNLEVEL_FILTER_CREATOR_OWNER: UInt = 2147483904u

public val DSOP_DOWNLEVEL_FILTER_DIALUP: UInt = 2147484672u

public val DSOP_DOWNLEVEL_FILTER_EXCLUDE_BUILTIN_GROUPS: UInt = 2147516416u

public val DSOP_DOWNLEVEL_FILTER_GLOBAL_GROUPS: UInt = 2147483652u

public val DSOP_DOWNLEVEL_FILTER_IIS_APP_POOL: UInt = 2214592512u

public val DSOP_DOWNLEVEL_FILTER_INTERACTIVE: UInt = 2147485696u

public val DSOP_DOWNLEVEL_FILTER_INTERNET_USER: UInt = 2149580800u

public val DSOP_DOWNLEVEL_FILTER_LOCAL_ACCOUNTS: UInt = 2415919104u

public val DSOP_DOWNLEVEL_FILTER_LOCAL_GROUPS: UInt = 2147483650u

public val DSOP_DOWNLEVEL_FILTER_LOCAL_LOGON: UInt = 2164260864u

public val DSOP_DOWNLEVEL_FILTER_LOCAL_SERVICE: UInt = 2147745792u

public val DSOP_DOWNLEVEL_FILTER_NETWORK: UInt = 2147487744u

public val DSOP_DOWNLEVEL_FILTER_NETWORK_SERVICE: UInt = 2148007936u

public val DSOP_DOWNLEVEL_FILTER_OWNER_RIGHTS: UInt = 2151677952u

public val DSOP_DOWNLEVEL_FILTER_REMOTE_LOGON: UInt = 2148532224u

public val DSOP_DOWNLEVEL_FILTER_SERVICE: UInt = 2147491840u

public val DSOP_DOWNLEVEL_FILTER_SERVICES: UInt = 2155872256u

public val DSOP_DOWNLEVEL_FILTER_SYSTEM: UInt = 2147500032u

public val DSOP_DOWNLEVEL_FILTER_TERMINAL_SERVER: UInt = 2147549184u

public val DSOP_DOWNLEVEL_FILTER_THIS_ORG_CERT: UInt = 2181038080u

public val DSOP_DOWNLEVEL_FILTER_USERS: UInt = 2147483649u

public val DSOP_DOWNLEVEL_FILTER_WORLD: UInt = 2147483664u

public val DSOP_FILTER_BUILTIN_GROUPS: UInt = 4u

public val DSOP_FILTER_COMPUTERS: UInt = 2048u

public val DSOP_FILTER_CONTACTS: UInt = 1024u

public val DSOP_FILTER_DOMAIN_LOCAL_GROUPS_DL: UInt = 256u

public val DSOP_FILTER_DOMAIN_LOCAL_GROUPS_SE: UInt = 512u

public val DSOP_FILTER_GLOBAL_GROUPS_DL: UInt = 64u

public val DSOP_FILTER_GLOBAL_GROUPS_SE: UInt = 128u

public val DSOP_FILTER_INCLUDE_ADVANCED_VIEW: UInt = 1u

public val DSOP_FILTER_PASSWORDSETTINGS_OBJECTS: UInt = 8192u

public val DSOP_FILTER_SERVICE_ACCOUNTS: UInt = 4096u

public val DSOP_FILTER_UNIVERSAL_GROUPS_DL: UInt = 16u

public val DSOP_FILTER_UNIVERSAL_GROUPS_SE: UInt = 32u

public val DSOP_FILTER_USERS: UInt = 2u

public val DSOP_FILTER_WELL_KNOWN_PRINCIPALS: UInt = 8u

public val DSOP_FLAG_MULTISELECT: UInt = 1u

public val DSOP_FLAG_SKIP_TARGET_COMPUTER_DC_CHECK: UInt = 2u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_COMPUTERS: UInt = 256u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_CONTACTS: UInt = 512u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_GROUPS: UInt = 128u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_PASSWORDSETTINGS_OBJECTS: UInt = 2048u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_SERVICE_ACCOUNTS: UInt = 1024u

public val DSOP_SCOPE_FLAG_DEFAULT_FILTER_USERS: UInt = 64u

public val DSOP_SCOPE_FLAG_STARTING_SCOPE: UInt = 1u

public val DSOP_SCOPE_FLAG_WANT_DOWNLEVEL_BUILTIN_PATH: UInt = 32u

public val DSOP_SCOPE_FLAG_WANT_PROVIDER_GC: UInt = 8u

public val DSOP_SCOPE_FLAG_WANT_PROVIDER_LDAP: UInt = 4u

public val DSOP_SCOPE_FLAG_WANT_PROVIDER_WINNT: UInt = 2u

public val DSOP_SCOPE_FLAG_WANT_SID_PATH: UInt = 16u

public val DSOP_SCOPE_TYPE_DOWNLEVEL_JOINED_DOMAIN: UInt = 4u

public val DSOP_SCOPE_TYPE_ENTERPRISE_DOMAIN: UInt = 8u

public val DSOP_SCOPE_TYPE_EXTERNAL_DOWNLEVEL_DOMAIN: UInt = 64u

public val DSOP_SCOPE_TYPE_EXTERNAL_UPLEVEL_DOMAIN: UInt = 32u

public val DSOP_SCOPE_TYPE_GLOBAL_CATALOG: UInt = 16u

public val DSOP_SCOPE_TYPE_TARGET_COMPUTER: UInt = 1u

public val DSOP_SCOPE_TYPE_UPLEVEL_JOINED_DOMAIN: UInt = 2u

public val DSOP_SCOPE_TYPE_USER_ENTERED_DOWNLEVEL_SCOPE: UInt = 512u

public val DSOP_SCOPE_TYPE_USER_ENTERED_UPLEVEL_SCOPE: UInt = 256u

public val DSOP_SCOPE_TYPE_WORKGROUP: UInt = 128u

public val DSPROP_ATTRCHANGED_MSG: Pcwstr = w("DsPropAttrChanged")

public val DSPROVIDER_ADVANCED: UInt = 16u

public val DSPROVIDER_AD_LDS: UInt = 32u

public val DSPROVIDER_UNUSED_0: UInt = 1u

public val DSPROVIDER_UNUSED_1: UInt = 2u

public val DSPROVIDER_UNUSED_2: UInt = 4u

public val DSPROVIDER_UNUSED_3: UInt = 8u

public val DSQPF_ENABLEADMINFEATURES: UInt = 8u

public val DSQPF_ENABLEADVANCEDFEATURES: UInt = 16u

public val DSQPF_HASCREDENTIALS: UInt = 32u

public val DSQPF_NOCHOOSECOLUMNS: UInt = 64u

public val DSQPF_NOSAVE: UInt = 1u

public val DSQPF_SAVELOCATION: UInt = 2u

public val DSQPF_SHOWHIDDENOBJECTS: UInt = 4u

public val DSQPM_GETCLASSLIST: UInt = 268435456u

public val DSQPM_HELPTOPICS: UInt = 268435457u

public val DSROLE_PRIMARY_DOMAIN_GUID_PRESENT: UInt = 16777216u

public val DSROLE_PRIMARY_DS_MIXED_MODE: UInt = 2u

public val DSROLE_PRIMARY_DS_READONLY: UInt = 8u

public val DSROLE_PRIMARY_DS_RUNNING: UInt = 1u

public val DSROLE_UPGRADE_IN_PROGRESS: UInt = 4u

public val DSSSF_DONTSIGNSEAL: UInt = 2u

public val DSSSF_DSAVAILABLE: UInt = 2147483648u

public val DSSSF_SIMPLEAUTHENTICATE: UInt = 1u

public val DS_AVOID_SELF: UInt = 16384u

public val DS_BACKGROUND_ONLY: UInt = 256u

public val DS_BEHAVIOR_LONGHORN: UInt = 3u

public val DS_BEHAVIOR_WIN2000: UInt = 0u

public val DS_BEHAVIOR_WIN2003: UInt = 2u

public val DS_BEHAVIOR_WIN2003_WITH_MIXED_DOMAINS: UInt = 1u

public val DS_BEHAVIOR_WIN2008: UInt = 3u

public val DS_BEHAVIOR_WIN2008R2: UInt = 4u

public val DS_BEHAVIOR_WIN2012: UInt = 5u

public val DS_BEHAVIOR_WIN2012R2: UInt = 6u

public val DS_BEHAVIOR_WIN2016: UInt = 7u

public val DS_BEHAVIOR_WIN7: UInt = 4u

public val DS_BEHAVIOR_WIN8: UInt = 5u

public val DS_BEHAVIOR_WINBLUE: UInt = 6u

public val DS_BEHAVIOR_WINTHRESHOLD: UInt = 7u

public val DS_CANONICAL_NAME: DsNameFormat = 7

public val DS_CANONICAL_NAME_EX: DsNameFormat = 9

public val DS_CLOSEST_FLAG: UInt = 128u

public val DS_DIRECTORY_SERVICE_10_REQUIRED: UInt = 8388608u

public val DS_DIRECTORY_SERVICE_6_REQUIRED: UInt = 524288u

public val DS_DIRECTORY_SERVICE_8_REQUIRED: UInt = 2097152u

public val DS_DIRECTORY_SERVICE_9_REQUIRED: UInt = 4194304u

public val DS_DIRECTORY_SERVICE_PREFERRED: UInt = 32u

public val DS_DIRECTORY_SERVICE_REQUIRED: UInt = 16u

public val DS_DISPLAY_NAME: DsNameFormat = 3

public val DS_DNS_CONTROLLER_FLAG: UInt = 536870912u

public val DS_DNS_DOMAIN_FLAG: UInt = 1073741824u

public val DS_DNS_DOMAIN_NAME: DsNameFormat = 12

public val DS_DNS_FOREST_FLAG: UInt = 2147483648u

public val DS_DOMAIN_DIRECT_INBOUND: UInt = 32u

public val DS_DOMAIN_DIRECT_OUTBOUND: UInt = 2u

public val DS_DOMAIN_IN_FOREST: UInt = 1u

public val DS_DOMAIN_NATIVE_MODE: UInt = 16u

public val DS_DOMAIN_PRIMARY: UInt = 8u

public val DS_DOMAIN_TREE_ROOT: UInt = 4u

public val DS_DS_10_FLAG: UInt = 65536u

public val DS_DS_8_FLAG: UInt = 16384u

public val DS_DS_9_FLAG: UInt = 32768u

public val DS_DS_FLAG: UInt = 16u

public val DS_EXIST_ADVISORY_MODE: UInt = 1u

public val DS_FORCE_REDISCOVERY: UInt = 1u

public val DS_FQDN_1779_NAME: DsNameFormat = 1

public val DS_FULL_SECRET_DOMAIN_6_FLAG: UInt = 4096u

public val DS_GC_FLAG: UInt = 4u

public val DS_GC_SERVER_REQUIRED: UInt = 64u

public val DS_GFTI_UPDATE_TDO: UInt = 1u

public val DS_GFTI_VALID_FLAGS: UInt = 1u

public val DS_GOOD_TIMESERV_FLAG: UInt = 512u

public val DS_GOOD_TIMESERV_PREFERRED: UInt = 8192u

public val DS_INSTANCETYPE_IS_NC_HEAD: UInt = 1u

public val DS_INSTANCETYPE_NC_COMING: UInt = 16u

public val DS_INSTANCETYPE_NC_GOING: UInt = 32u

public val DS_INSTANCETYPE_NC_IS_WRITEABLE: UInt = 4u

public val DS_IP_REQUIRED: UInt = 512u

public val DS_IS_DNS_NAME: UInt = 131072u

public val DS_IS_FLAT_NAME: UInt = 65536u

public val DS_KCC_FLAG_ASYNC_OP: UInt = 1u

public val DS_KCC_FLAG_DAMPED: UInt = 2u

public val DS_KCC_TASKID_UPDATE_TOPOLOGY: DsKccTaskid = 0

public val DS_KDC_FLAG: UInt = 32u

public val DS_KDC_REQUIRED: UInt = 1024u

public val DS_KEY_LIST_FLAG: UInt = 131072u

public val DS_KEY_LIST_SUPPORT_REQUIRED: UInt = 16777216u

public val DS_LDAP_FLAG: UInt = 8u

public val DS_LIST_ACCOUNT_OBJECT_FOR_SERVER: UInt = 2u

public val DS_LIST_DNS_HOST_NAME_FOR_SERVER: UInt = 1u

public val DS_LIST_DSA_OBJECT_FOR_SERVER: UInt = 0u

public val DS_MANGLE_OBJECT_RDN_FOR_DELETION: DsMangleFor = 1

public val DS_MANGLE_OBJECT_RDN_FOR_NAME_CONFLICT: DsMangleFor = 2

public val DS_MANGLE_UNKNOWN: DsMangleFor = 0

public val DS_NAME_ERROR_DOMAIN_ONLY: DsNameError = 5

public val DS_NAME_ERROR_NOT_FOUND: DsNameError = 2

public val DS_NAME_ERROR_NOT_UNIQUE: DsNameError = 3

public val DS_NAME_ERROR_NO_MAPPING: DsNameError = 4

public val DS_NAME_ERROR_NO_SYNTACTICAL_MAPPING: DsNameError = 6

public val DS_NAME_ERROR_RESOLVING: DsNameError = 1

public val DS_NAME_ERROR_TRUST_REFERRAL: DsNameError = 7

public val DS_NAME_FLAG_EVAL_AT_DC: DsNameFlags = 2

public val DS_NAME_FLAG_GCVERIFY: DsNameFlags = 4

public val DS_NAME_FLAG_SYNTACTICAL_ONLY: DsNameFlags = 1

public val DS_NAME_FLAG_TRUST_REFERRAL: DsNameFlags = 8

public val DS_NAME_NO_ERROR: DsNameError = 0

public val DS_NAME_NO_FLAGS: DsNameFlags = 0

public val DS_NDNC_FLAG: UInt = 1024u

public val DS_NOTIFY_AFTER_SITE_RECORDS: UInt = 2u

public val DS_NT4_ACCOUNT_NAME: DsNameFormat = 2

public val DS_ONLY_DO_SITE_NAME: UInt = 1u

public val DS_ONLY_LDAP_NEEDED: UInt = 32768u

public val DS_PDC_FLAG: UInt = 1u

public val DS_PDC_REQUIRED: UInt = 128u

public val DS_PING_FLAGS: UInt = 1048575u

public val DS_PROP_ADMIN_PREFIX: Pcwstr = w("admin")

public val DS_PROP_SHELL_PREFIX: Pcwstr = w("shell")

public val DS_REPADD_ASYNCHRONOUS_OPERATION: UInt = 1u

public val DS_REPADD_ASYNCHRONOUS_REPLICA: UInt = 32u

public val DS_REPADD_CRITICAL: UInt = 2048u

public val DS_REPADD_DISABLE_NOTIFICATION: UInt = 64u

public val DS_REPADD_DISABLE_PERIODIC: UInt = 128u

public val DS_REPADD_INITIAL: UInt = 4u

public val DS_REPADD_INTERSITE_MESSAGING: UInt = 16u

public val DS_REPADD_NEVER_NOTIFY: UInt = 512u

public val DS_REPADD_NONGC_RO_REPLICA: UInt = 16777216u

public val DS_REPADD_PERIODIC: UInt = 8u

public val DS_REPADD_SELECT_SECRETS: UInt = 4096u

public val DS_REPADD_TWO_WAY: UInt = 1024u

public val DS_REPADD_USE_COMPRESSION: UInt = 256u

public val DS_REPADD_WRITEABLE: UInt = 2u

public val DS_REPDEL_ASYNCHRONOUS_OPERATION: UInt = 1u

public val DS_REPDEL_IGNORE_ERRORS: UInt = 8u

public val DS_REPDEL_INTERSITE_MESSAGING: UInt = 4u

public val DS_REPDEL_LOCAL_ONLY: UInt = 16u

public val DS_REPDEL_NO_SOURCE: UInt = 32u

public val DS_REPDEL_REF_OK: UInt = 64u

public val DS_REPDEL_WRITEABLE: UInt = 2u

public val DS_REPL_INFO_CURSORS_2_FOR_NC: DsReplInfoType = 7

public val DS_REPL_INFO_CURSORS_3_FOR_NC: DsReplInfoType = 8

public val DS_REPL_INFO_CURSORS_FOR_NC: DsReplInfoType = 1

public val DS_REPL_INFO_FLAG_IMPROVE_LINKED_ATTRS: UInt = 1u

public val DS_REPL_INFO_KCC_DSA_CONNECT_FAILURES: DsReplInfoType = 3

public val DS_REPL_INFO_KCC_DSA_LINK_FAILURES: DsReplInfoType = 4

public val DS_REPL_INFO_METADATA_2_FOR_ATTR_VALUE: DsReplInfoType = 10

public val DS_REPL_INFO_METADATA_2_FOR_OBJ: DsReplInfoType = 9

public val DS_REPL_INFO_METADATA_EXT_FOR_ATTR_VALUE: DsReplInfoType = 11

public val DS_REPL_INFO_METADATA_FOR_ATTR_VALUE: DsReplInfoType = 6

public val DS_REPL_INFO_METADATA_FOR_OBJ: DsReplInfoType = 2

public val DS_REPL_INFO_NEIGHBORS: DsReplInfoType = 0

public val DS_REPL_INFO_PENDING_OPS: DsReplInfoType = 5

public val DS_REPL_INFO_TYPE_MAX: DsReplInfoType = 12

public val DS_REPL_NBR_COMPRESS_CHANGES: UInt = 268435456u

public val DS_REPL_NBR_DISABLE_SCHEDULED_SYNC: UInt = 134217728u

public val DS_REPL_NBR_DO_SCHEDULED_SYNCS: UInt = 64u

public val DS_REPL_NBR_FULL_SYNC_IN_PROGRESS: UInt = 65536u

public val DS_REPL_NBR_FULL_SYNC_NEXT_PACKET: UInt = 131072u

public val DS_REPL_NBR_GCSPN: UInt = 1048576u

public val DS_REPL_NBR_IGNORE_CHANGE_NOTIFICATIONS: UInt = 67108864u

public val DS_REPL_NBR_NEVER_SYNCED: UInt = 2097152u

public val DS_REPL_NBR_NONGC_RO_REPLICA: UInt = 1024u

public val DS_REPL_NBR_NO_CHANGE_NOTIFICATIONS: UInt = 536870912u

public val DS_REPL_NBR_PARTIAL_ATTRIBUTE_SET: UInt = 1073741824u

public val DS_REPL_NBR_PREEMPTED: UInt = 16777216u

public val DS_REPL_NBR_RETURN_OBJECT_PARENTS: UInt = 2048u

public val DS_REPL_NBR_SELECT_SECRETS: UInt = 4096u

public val DS_REPL_NBR_SYNC_ON_STARTUP: UInt = 32u

public val DS_REPL_NBR_TWO_WAY_SYNC: UInt = 512u

public val DS_REPL_NBR_USE_ASYNC_INTERSITE_TRANSPORT: UInt = 128u

public val DS_REPL_NBR_WRITEABLE: UInt = 16u

public val DS_REPL_OP_TYPE_ADD: DsReplOpType = 1

public val DS_REPL_OP_TYPE_DELETE: DsReplOpType = 2

public val DS_REPL_OP_TYPE_MODIFY: DsReplOpType = 3

public val DS_REPL_OP_TYPE_SYNC: DsReplOpType = 0

public val DS_REPL_OP_TYPE_UPDATE_REFS: DsReplOpType = 4

public val DS_REPMOD_ASYNCHRONOUS_OPERATION: UInt = 1u

public val DS_REPMOD_UPDATE_ADDRESS: UInt = 2u

public val DS_REPMOD_UPDATE_FLAGS: UInt = 1u

public val DS_REPMOD_UPDATE_INSTANCE: UInt = 2u

public val DS_REPMOD_UPDATE_RESULT: UInt = 8u

public val DS_REPMOD_UPDATE_SCHEDULE: UInt = 4u

public val DS_REPMOD_UPDATE_TRANSPORT: UInt = 16u

public val DS_REPMOD_WRITEABLE: UInt = 2u

public val DS_REPSYNCALL_ABORT_IF_SERVER_UNAVAILABLE: UInt = 1u

public val DS_REPSYNCALL_CROSS_SITE_BOUNDARIES: UInt = 64u

public val DS_REPSYNCALL_DO_NOT_SYNC: UInt = 8u

public val DS_REPSYNCALL_EVENT_ERROR: DsRepsyncallEvent = 0

public val DS_REPSYNCALL_EVENT_FINISHED: DsRepsyncallEvent = 3

public val DS_REPSYNCALL_EVENT_SYNC_COMPLETED: DsRepsyncallEvent = 2

public val DS_REPSYNCALL_EVENT_SYNC_STARTED: DsRepsyncallEvent = 1

public val DS_REPSYNCALL_ID_SERVERS_BY_DN: UInt = 4u

public val DS_REPSYNCALL_NO_OPTIONS: UInt = 0u

public val DS_REPSYNCALL_PUSH_CHANGES_OUTWARD: UInt = 32u

public val DS_REPSYNCALL_SERVER_UNREACHABLE: DsRepsyncallError = 2

public val DS_REPSYNCALL_SKIP_INITIAL_CHECK: UInt = 16u

public val DS_REPSYNCALL_SYNC_ADJACENT_SERVERS_ONLY: UInt = 2u

public val DS_REPSYNCALL_WIN32_ERROR_CONTACTING_SERVER: DsRepsyncallError = 0

public val DS_REPSYNCALL_WIN32_ERROR_REPLICATING: DsRepsyncallError = 1

public val DS_REPSYNC_ABANDONED: UInt = 32768u

public val DS_REPSYNC_ADD_REFERENCE: UInt = 512u

public val DS_REPSYNC_ASYNCHRONOUS_OPERATION: UInt = 1u

public val DS_REPSYNC_ASYNCHRONOUS_REPLICA: UInt = 1048576u

public val DS_REPSYNC_CRITICAL: UInt = 2097152u

public val DS_REPSYNC_FORCE: UInt = 256u

public val DS_REPSYNC_FULL: UInt = 32u

public val DS_REPSYNC_FULL_IN_PROGRESS: UInt = 4194304u

public val DS_REPSYNC_INITIAL: UInt = 8192u

public val DS_REPSYNC_INITIAL_IN_PROGRESS: UInt = 65536u

public val DS_REPSYNC_INTERSITE_MESSAGING: UInt = 8u

public val DS_REPSYNC_NEVER_COMPLETED: UInt = 1024u

public val DS_REPSYNC_NEVER_NOTIFY: UInt = 4096u

public val DS_REPSYNC_NONGC_RO_REPLICA: UInt = 16777216u

public val DS_REPSYNC_NOTIFICATION: UInt = 524288u

public val DS_REPSYNC_NO_DISCARD: UInt = 128u

public val DS_REPSYNC_PARTIAL_ATTRIBUTE_SET: UInt = 131072u

public val DS_REPSYNC_PERIODIC: UInt = 4u

public val DS_REPSYNC_PREEMPTED: UInt = 8388608u

public val DS_REPSYNC_REQUEUE: UInt = 262144u

public val DS_REPSYNC_SELECT_SECRETS: UInt = 32768u

public val DS_REPSYNC_TWO_WAY: UInt = 2048u

public val DS_REPSYNC_URGENT: UInt = 64u

public val DS_REPSYNC_USE_COMPRESSION: UInt = 16384u

public val DS_REPSYNC_WRITEABLE: UInt = 2u

public val DS_REPUPD_ADD_REFERENCE: UInt = 4u

public val DS_REPUPD_ASYNCHRONOUS_OPERATION: UInt = 1u

public val DS_REPUPD_DELETE_REFERENCE: UInt = 8u

public val DS_REPUPD_REFERENCE_GCSPN: UInt = 16u

public val DS_REPUPD_WRITEABLE: UInt = 2u

public val DS_RETURN_DNS_NAME: UInt = 1073741824u

public val DS_RETURN_FLAT_NAME: UInt = 2147483648u

public val DS_ROLE_DOMAIN_OWNER: UInt = 1u

public val DS_ROLE_INFRASTRUCTURE_OWNER: UInt = 4u

public val DS_ROLE_PDC_OWNER: UInt = 2u

public val DS_ROLE_RID_OWNER: UInt = 3u

public val DS_ROLE_SCHEMA_OWNER: UInt = 0u

public val DS_SCHEMA_GUID_ATTR: UInt = 1u

public val DS_SCHEMA_GUID_ATTR_SET: UInt = 2u

public val DS_SCHEMA_GUID_CLASS: UInt = 3u

public val DS_SCHEMA_GUID_CONTROL_RIGHT: UInt = 4u

public val DS_SCHEMA_GUID_NOT_FOUND: UInt = 0u

public val DS_SELECT_SECRET_DOMAIN_6_FLAG: UInt = 2048u

public val DS_SERVICE_PRINCIPAL_NAME: DsNameFormat = 10

public val DS_SID_OR_SID_HISTORY_NAME: DsNameFormat = 11

public val DS_SPN_ADD_SPN_OP: DsSpnWriteOp = 0

public val DS_SPN_DELETE_SPN_OP: DsSpnWriteOp = 2

public val DS_SPN_DNS_HOST: DsSpnNameType = 0

public val DS_SPN_DN_HOST: DsSpnNameType = 1

public val DS_SPN_DOMAIN: DsSpnNameType = 3

public val DS_SPN_NB_DOMAIN: DsSpnNameType = 4

public val DS_SPN_NB_HOST: DsSpnNameType = 2

public val DS_SPN_REPLACE_SPN_OP: DsSpnWriteOp = 1

public val DS_SPN_SERVICE: DsSpnNameType = 5

public val DS_SYNCED_EVENT_NAME: Pcstr = s("NTDSInitialSyncsCompleted")

public val DS_SYNCED_EVENT_NAME_W: Pcwstr = w("NTDSInitialSyncsCompleted")

public val DS_TIMESERV_FLAG: UInt = 64u

public val DS_TIMESERV_REQUIRED: UInt = 2048u

public val DS_TRY_NEXTCLOSEST_SITE: UInt = 262144u

public val DS_UNIQUE_ID_NAME: DsNameFormat = 6

public val DS_UNKNOWN_NAME: DsNameFormat = 0

public val DS_USER_PRINCIPAL_NAME: DsNameFormat = 8

public val DS_WEB_SERVICE_REQUIRED: UInt = 1048576u

public val DS_WRITABLE_FLAG: UInt = 256u

public val DS_WRITABLE_REQUIRED: UInt = 4096u

public val DS_WS_FLAG: UInt = 8192u

public val DS_ROLE_OPERATION_ACTIVE: DsroleOperationState = 1

public val DS_ROLE_OPERATION_IDLE: DsroleOperationState = 0

public val DS_ROLE_OPERATION_NEED_REBOOT: DsroleOperationState = 2

public val DS_ROLE_OPERATION_STATE: DsrolePrimaryDomainInfoLevel = 3

public val DS_ROLE_PRIMARY_DOMAIN_INFO_BASIC: DsrolePrimaryDomainInfoLevel = 1

public val DS_ROLE_SERVER_BACKUP: DsroleServerState = 2

public val DS_ROLE_SERVER_PRIMARY: DsroleServerState = 1

public val DS_ROLE_SERVER_UNKNOWN: DsroleServerState = 0

public val DS_ROLE_UPGRADE_STATUS: DsrolePrimaryDomainInfoLevel = 2

public val DS_ROLE_ROLE_BACKUP_DOMAIN_CONTROLLER: DsroleMachineRole = 4

public val DS_ROLE_ROLE_MEMBER_SERVER: DsroleMachineRole = 3

public val DS_ROLE_ROLE_MEMBER_WORKSTATION: DsroleMachineRole = 1

public val DS_ROLE_ROLE_PRIMARY_DOMAIN_CONTROLLER: DsroleMachineRole = 5

public val DS_ROLE_ROLE_STANDALONE_SERVER: DsroleMachineRole = 2

public val DS_ROLE_ROLE_STANDALONE_WORKSTATION: DsroleMachineRole = 0

public val EMAIL: Guid = Guid.fromU128(U128(0x8f92a857478e11d1uL, 0xa3b400c04fb950dcuL))

public val FACILITY_BACKUP: UInt = 2047u

public val FACILITY_NTDSB: UInt = 2048u

public val FACILITY_SYSTEM: UInt = 0u

public val FLAG_DISABLABLE_OPTIONAL_FEATURE: UInt = 4u

public val FLAG_DOMAIN_OPTIONAL_FEATURE: UInt = 2u

public val FLAG_FOREST_OPTIONAL_FEATURE: UInt = 1u

public val FLAG_SERVER_OPTIONAL_FEATURE: UInt = 8u

public val FRSCONN_MAX_PRIORITY: UInt = 8u

public val FRSCONN_PRIORITY_MASK: UInt = 1879048192u

public val FAX_NUMBER: Guid = Guid.fromU128(U128(0xa5062215468111d1uL, 0xa3b400c04fb950dcuL))

public val GUID_COMPUTRS_CONTAINER_A: Pcstr = s("aa312825768811d1aded00c04fd8d5cd")

public val GUID_COMPUTRS_CONTAINER_W: Pcwstr = w("aa312825768811d1aded00c04fd8d5cd")

public val GUID_DELETED_OBJECTS_CONTAINER_A: Pcstr = s("18e2ea80684f11d2b9aa00c04f79f805")

public val GUID_DELETED_OBJECTS_CONTAINER_W: Pcwstr = w("18e2ea80684f11d2b9aa00c04f79f805")

public val GUID_DOMAIN_CONTROLLERS_CONTAINER_A: Pcstr = s("a361b2ffffd211d1aa4b00c04fd7d83a")

public val GUID_DOMAIN_CONTROLLERS_CONTAINER_W: Pcwstr = w("a361b2ffffd211d1aa4b00c04fd7d83a")

public val GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_A: Pcstr = s("22b70c67d56e4efb91e9300fca3dc1aa")

public val GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_W: Pcwstr = w("22b70c67d56e4efb91e9300fca3dc1aa")

public val GUID_INFRASTRUCTURE_CONTAINER_A: Pcstr = s("2fbac1870ade11d297c400c04fd8d5cd")

public val GUID_INFRASTRUCTURE_CONTAINER_W: Pcwstr = w("2fbac1870ade11d297c400c04fd8d5cd")

public val GUID_KEYS_CONTAINER_W: Pcwstr = w("683A24E2E8164BD3AF86AC3C2CF3F981")

public val GUID_LOSTANDFOUND_CONTAINER_A: Pcstr = s("ab8153b7768811d1aded00c04fd8d5cd")

public val GUID_LOSTANDFOUND_CONTAINER_W: Pcwstr = w("ab8153b7768811d1aded00c04fd8d5cd")

public val GUID_MANAGED_SERVICE_ACCOUNTS_CONTAINER_W: Pcwstr = w("1EB93889E40C45DF9F0C64D23BBB6237")

public val GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_A: Pcstr = s("f4be92a4c777485e878e9421d53087db")

public val GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_W: Pcwstr = w("f4be92a4c777485e878e9421d53087db")

public val GUID_NTDS_QUOTAS_CONTAINER_A: Pcstr = s("6227f0af1fc2410d8e3bb10615bb5b0f")

public val GUID_NTDS_QUOTAS_CONTAINER_W: Pcwstr = w("6227f0af1fc2410d8e3bb10615bb5b0f")

public val GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_A: Pcstr = s("73e843ece8cc4046b4ab07ffe4ab5bcd")

public val GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_W: Pcwstr = w("73e843ece8cc4046b4ab07ffe4ab5bcd")

public val GUID_PROGRAM_DATA_CONTAINER_A: Pcstr = s("09460c08ae1e4a4ea0f64aee7daa1e5a")

public val GUID_PROGRAM_DATA_CONTAINER_W: Pcwstr = w("09460c08ae1e4a4ea0f64aee7daa1e5a")

public val GUID_RECYCLE_BIN_OPTIONAL_FEATURE_A: Pcstr = s("d8dc6d76d0ac5e44f3b9a7f9b6744f2a")

public val GUID_RECYCLE_BIN_OPTIONAL_FEATURE_W: Pcwstr = w("d8dc6d76d0ac5e44f3b9a7f9b6744f2a")

public val GUID_SYSTEMS_CONTAINER_A: Pcstr = s("ab1d30f3768811d1aded00c04fd8d5cd")

public val GUID_SYSTEMS_CONTAINER_W: Pcwstr = w("ab1d30f3768811d1aded00c04fd8d5cd")

public val GUID_USERS_CONTAINER_A: Pcstr = s("a9d1ca15768811d1aded00c04fd8d5cd")

public val GUID_USERS_CONTAINER_W: Pcwstr = w("a9d1ca15768811d1aded00c04fd8d5cd")

public val HOLD: Guid = Guid.fromU128(U128(0xb3ad3e13408011d1uL, 0xa3ac00c04fb950dcuL))

public val LARGE_INTEGER: Guid = Guid.fromU128(U128(0x927971f5093911d1uL, 0x8be100c04fd8d503uL))

public val NTDSAPI_BIND_ALLOW_DELEGATION: UInt = 1u

public val NTDSAPI_BIND_FIND_BINDING: UInt = 2u

public val NTDSAPI_BIND_FORCE_KERBEROS: UInt = 4u

public val NTDSCONN_KCC_GC_TOPOLOGY: UInt = 1u

public val NTDSCONN_KCC_INTERSITE_GC_TOPOLOGY: UInt = 32u

public val NTDSCONN_KCC_INTERSITE_TOPOLOGY: UInt = 64u

public val NTDSCONN_KCC_MINIMIZE_HOPS_TOPOLOGY: UInt = 4u

public val NTDSCONN_KCC_NO_REASON: UInt = 0u

public val NTDSCONN_KCC_OSCILLATING_CONNECTION_TOPOLOGY: UInt = 16u

public val NTDSCONN_KCC_REDUNDANT_SERVER_TOPOLOGY: UInt = 512u

public val NTDSCONN_KCC_RING_TOPOLOGY: UInt = 2u

public val NTDSCONN_KCC_SERVER_FAILOVER_TOPOLOGY: UInt = 128u

public val NTDSCONN_KCC_SITE_FAILOVER_TOPOLOGY: UInt = 256u

public val NTDSCONN_KCC_STALE_SERVERS_TOPOLOGY: UInt = 8u

public val NTDSCONN_OPT_DISABLE_INTERSITE_COMPRESSION: UInt = 16u

public val NTDSCONN_OPT_IGNORE_SCHEDULE_MASK: UInt = 2147483648u

public val NTDSCONN_OPT_IS_GENERATED: UInt = 1u

public val NTDSCONN_OPT_OVERRIDE_NOTIFY_DEFAULT: UInt = 4u

public val NTDSCONN_OPT_RODC_TOPOLOGY: UInt = 64u

public val NTDSCONN_OPT_TWOWAY_SYNC: UInt = 2u

public val NTDSCONN_OPT_USER_OWNED_SCHEDULE: UInt = 32u

public val NTDSCONN_OPT_USE_NOTIFY: UInt = 8u

public val NTDSDSA_OPT_BLOCK_RPC: UInt = 64u

public val NTDSDSA_OPT_DISABLE_INBOUND_REPL: UInt = 2u

public val NTDSDSA_OPT_DISABLE_NTDSCONN_XLATE: UInt = 8u

public val NTDSDSA_OPT_DISABLE_OUTBOUND_REPL: UInt = 4u

public val NTDSDSA_OPT_DISABLE_SPN_REGISTRATION: UInt = 16u

public val NTDSDSA_OPT_GENERATE_OWN_TOPO: UInt = 32u

public val NTDSDSA_OPT_IS_GC: UInt = 1u

public val NTDSSETTINGS_DEFAULT_SERVER_REDUNDANCY: UInt = 2u

public val NTDSSETTINGS_OPT_FORCE_KCC_W2K_ELECTION: UInt = 128u

public val NTDSSETTINGS_OPT_FORCE_KCC_WHISTLER_BEHAVIOR: UInt = 64u

public val NTDSSETTINGS_OPT_IS_AUTO_TOPOLOGY_DISABLED: UInt = 1u

public val NTDSSETTINGS_OPT_IS_GROUP_CACHING_ENABLED: UInt = 32u

public val NTDSSETTINGS_OPT_IS_INTER_SITE_AUTO_TOPOLOGY_DISABLED: UInt = 16u

public val NTDSSETTINGS_OPT_IS_RAND_BH_SELECTION_DISABLED: UInt = 256u

public val NTDSSETTINGS_OPT_IS_REDUNDANT_SERVER_TOPOLOGY_ENABLED: UInt = 1024u

public val NTDSSETTINGS_OPT_IS_SCHEDULE_HASHING_ENABLED: UInt = 512u

public val NTDSSETTINGS_OPT_IS_TOPL_CLEANUP_DISABLED: UInt = 2u

public val NTDSSETTINGS_OPT_IS_TOPL_DETECT_STALE_DISABLED: UInt = 8u

public val NTDSSETTINGS_OPT_IS_TOPL_MIN_HOPS_DISABLED: UInt = 4u

public val NTDSSETTINGS_OPT_W2K3_BRIDGES_REQUIRED: UInt = 4096u

public val NTDSSETTINGS_OPT_W2K3_IGNORE_SCHEDULES: UInt = 2048u

public val NTDSSITECONN_OPT_DISABLE_COMPRESSION: UInt = 4u

public val NTDSSITECONN_OPT_TWOWAY_SYNC: UInt = 2u

public val NTDSSITECONN_OPT_USE_NOTIFY: UInt = 1u

public val NTDSSITELINK_OPT_DISABLE_COMPRESSION: UInt = 4u

public val NTDSSITELINK_OPT_TWOWAY_SYNC: UInt = 2u

public val NTDSSITELINK_OPT_USE_NOTIFY: UInt = 1u

public val NTDSTRANSPORT_OPT_BRIDGES_REQUIRED: UInt = 2u

public val NTDSTRANSPORT_OPT_IGNORE_SCHEDULES: UInt = 1u

public val NAME_TRANSLATE: Guid = Guid.fromU128(U128(0x274fae1f362611d1uL, 0xa3a400c04fb950dcuL))

public val NET_ADDRESS: Guid = Guid.fromU128(U128(0xb0b71247408011d1uL, 0xa3ac00c04fb950dcuL))

public val OQWF_DEFAULTFORM: UInt = 2u

public val OQWF_HIDEMENUS: UInt = 1024u

public val OQWF_HIDESEARCHUI: UInt = 2048u

public val OQWF_ISSUEONOPEN: UInt = 64u

public val OQWF_LOADQUERY: UInt = 8u

public val OQWF_OKCANCEL: UInt = 1u

public val OQWF_PARAMISPROPERTYBAG: UInt = 2147483648u

public val OQWF_REMOVEFORMS: UInt = 32u

public val OQWF_REMOVESCOPES: UInt = 16u

public val OQWF_SAVEQUERYONOK: UInt = 512u

public val OQWF_SHOWOPTIONAL: UInt = 128u

public val OQWF_SINGLESELECT: UInt = 4u

public val OCTET_LIST: Guid = Guid.fromU128(U128(0x1241400f468011d1uL, 0xa3b400c04fb950dcuL))

public val PATH: Guid = Guid.fromU128(U128(0xb2538919408011d1uL, 0xa3ac00c04fb950dcuL))

public val PATHNAME: Guid = Guid.fromU128(U128(0x80d0d78f42111d0uL, 0xa36e00c04fb950dcuL))

public val POSTAL_ADDRESS: Guid = Guid.fromU128(U128(0xa75afcd468011d1uL, 0xa3b400c04fb950dcuL))

public val PROPERTY_ENTRY: Guid = Guid.fromU128(U128(0x72d3edc2a4c411d0uL, 0x853300c04fd8d503uL))

public val PROPERTY_VALUE: Guid = Guid.fromU128(U128(0x7b9e38b0a97c11d0uL, 0x853400c04fd8d503uL))

public val QUERYFORM_CHANGESFORMLIST: ULong = 1uL

public val QUERYFORM_CHANGESOPTFORMLIST: ULong = 2uL

public val REPLICA_POINTER: Guid = Guid.fromU128(U128(0xf5d1badf408011d1uL, 0xa3ac00c04fb950dcuL))

public val SCHEDULE_BANDWIDTH: UInt = 1u

public val SCHEDULE_INTERVAL: UInt = 0u

public val SCHEDULE_PRIORITY: UInt = 2u

public val SECURITY_DESCRIPTOR: Guid = Guid.fromU128(U128(0xb958f73c9bdd11d0uL, 0x852c00c04fd8d503uL))

public val TIMESTAMP: Guid = Guid.fromU128(U128(0xb2bed2eb408011d1uL, 0xa3ac00c04fb950dcuL))

public val TYPED_NAME: Guid = Guid.fromU128(U128(0xb33143cb408011d1uL, 0xa3ac00c04fb950dcuL))

public val WM_ADSPROP_NOTIFY_APPLY: UInt = 2128u

public val WM_ADSPROP_NOTIFY_CHANGE: UInt = 2127u

public val WM_ADSPROP_NOTIFY_ERROR: UInt = 2134u

public val WM_ADSPROP_NOTIFY_EXIT: UInt = 2131u

public val WM_ADSPROP_NOTIFY_FOREGROUND: UInt = 2130u

public val WM_ADSPROP_NOTIFY_PAGEHWND: UInt = 2126u

public val WM_ADSPROP_NOTIFY_PAGEINIT: UInt = 2125u

public val WM_ADSPROP_NOTIFY_SETFOCUS: UInt = 2129u

public val WIN_NT_SYSTEM_INFO: Guid = Guid.fromU128(U128(0x66182ec4afd111d2uL, 0x9cb90000f87a369euL))

public val HR_ACCESS_DENIED: Hresult = 0xC8000773u.toInt()

public val HR_AFTER_INITIALIZATION: Hresult = 0xC800073Au.toInt()

public val HR_ALREADY_INITIALIZED: Hresult = 0xC8000406u.toInt()

public val HR_ALREADY_OPEN: Hresult = 0xC7FF0005u.toInt()

public val HR_ALREADY_PREPARED: Hresult = 0xC8000647u.toInt()

public val HR_BF_IN_USE: Hresult = 0xC80000CAu.toInt()

public val HR_BF_NOT_SYNCHRONOUS: Hresult = 0x880000C8u.toInt()

public val HR_BF_PAGE_NOT_FOUND: Hresult = 0x880000C9u.toInt()

public val HR_BACKUP_DIRECTORY_NOT_EMPTY: Hresult = 0xC80001F8u.toInt()

public val HR_BACKUP_IN_PROGRESS: Hresult = 0xC80001F9u.toInt()

public val HR_BACKUP_NOT_ALLOWED_YET: Hresult = 0xC800020Bu.toInt()

public val HR_BAD_BACKUP_DATABASE_SIZE: Hresult = 0xC8000231u.toInt()

public val HR_BAD_CHECKPOINT_SIGNATURE: Hresult = 0xC8000214u.toInt()

public val HR_BAD_COLUMN_ID: Hresult = 0xC80005EDu.toInt()

public val HR_BAD_DB_SIGNATURE: Hresult = 0xC8000213u.toInt()

public val HR_BAD_ITAG_SEQUENCE: Hresult = 0xC80005EEu.toInt()

public val HR_BAD_LOG_SIGNATURE: Hresult = 0xC8000212u.toInt()

public val HR_BAD_LOG_VERSION: Hresult = 0xC8000202u.toInt()

public val HR_BUFFER_TOO_SMALL: Hresult = 0xC800040Eu.toInt()

public val HR_BUFFER_TRUNCATED: Hresult = 0x880003EEu.toInt()

public val HR_CANNOT_BE_TAGGED: Hresult = 0xC80005F1u.toInt()

public val HR_CANNOT_RENAME: Hresult = 0xC800051Au.toInt()

public val HR_CHECKPOINT_CORRUPT: Hresult = 0xC8000215u.toInt()

public val HR_CIRCULAR_LOGGING: Hresult = 0xC7FF000Bu.toInt()

public val HR_COLUMN2ND_SYS_MAINT: Hresult = 0xC80005E6u.toInt()

public val HR_COLUMN_CANNOT_INDEX: Hresult = 0xC80005E9u.toInt()

public val HR_COLUMN_DOES_NOT_FIT: Hresult = 0xC80005DFu.toInt()

public val HR_COLUMN_DUPLICATE: Hresult = 0xC80005E4u.toInt()

public val HR_COLUMN_IN_USE: Hresult = 0xC8000416u.toInt()

public val HR_COLUMN_INDEXED: Hresult = 0xC80005E1u.toInt()

public val HR_COLUMN_LONG: Hresult = 0xC80005DDu.toInt()

public val HR_COLUMN_MAX_TRUNCATED: Hresult = 0x880005E8u.toInt()

public val HR_COLUMN_NOT_FOUND: Hresult = 0xC80005E3u.toInt()

public val HR_COLUMN_NOT_UPDATABLE: Hresult = 0xC8000418u.toInt()

public val HR_COLUMN_NULL: Hresult = 0x880003ECu.toInt()

public val HR_COLUMN_SET_NULL: Hresult = 0x8800042Cu.toInt()

public val HR_COLUMN_TOO_BIG: Hresult = 0xC80005E2u.toInt()

public val HR_COMMUNICATION_ERROR: Hresult = 0xC7FF000Du.toInt()

public val HR_CONSISTENT_TIME_MISMATCH: Hresult = 0xC8000227u.toInt()

public val HR_CONTAINER_NOT_EMPTY: Hresult = 0xC8000413u.toInt()

public val HR_CONTENTS_EXPIRED: Hresult = 0xC7FF0011u.toInt()

public val HR_COULD_NOT_CONNECT: Hresult = 0xC7FF0007u.toInt()

public val HR_CREATE_INDEX_FAILED: Hresult = 0x88000581u.toInt()

public val HR_CURRENCY_STACK_OUT_OF_MEMORY: Hresult = 0xC800042Eu.toInt()

public val HR_DATABASE_ATTACHED: Hresult = 0x880003EFu.toInt()

public val HR_DATABASE_CORRUPTED: Hresult = 0xC80004B6u.toInt()

public val HR_DATABASE_DUPLICATE: Hresult = 0xC80004B1u.toInt()

public val HR_DATABASE_IN_USE: Hresult = 0xC80004B2u.toInt()

public val HR_DATABASE_INCONSISTENT: Hresult = 0xC8000226u.toInt()

public val HR_DATABASE_INVALID_NAME: Hresult = 0xC80004B4u.toInt()

public val HR_DATABASE_INVALID_PAGES: Hresult = 0xC80004B5u.toInt()

public val HR_DATABASE_LOCKED: Hresult = 0xC80004B7u.toInt()

public val HR_DATABASE_NOT_FOUND: Hresult = 0xC80004B3u.toInt()

public val HR_DELETE_BACKUP_FILE_FAIL: Hresult = 0xC800020Cu.toInt()

public val HR_DENSITY_INVALID: Hresult = 0xC800051Bu.toInt()

public val HR_DISK_FULL: Hresult = 0xC8000710u.toInt()

public val HR_DISK_IO: Hresult = 0xC80003FEu.toInt()

public val HR_ERROR: Hresult = 0xC7FF0002u.toInt()

public val HR_EXISTING_LOG_FILE_HAS_BAD_SIGNATURE: Hresult = 0x8800022Eu.toInt()

public val HR_EXISTING_LOG_FILE_IS_NOT_CONTIGUOUS: Hresult = 0x8800022Fu.toInt()

public val HR_FLD_KEY_TOO_BIG: Hresult = 0x88000190u.toInt()

public val HR_FLD_NULL_KEY: Hresult = 0x88000192u.toInt()

public val HR_FLD_TOO_MANY_SEGMENTS: Hresult = 0xC8000191u.toInt()

public val HR_FEATURE_NOT_AVAILABLE: Hresult = 0xC80003E9u.toInt()

public val HR_FILE_ACCESS_DENIED: Hresult = 0xC8000408u.toInt()

public val HR_FILE_CLOSE: Hresult = 0xC8000066u.toInt()

public val HR_FILE_NOT_FOUND: Hresult = 0xC8000713u.toInt()

public val HR_FILE_OPEN_READ_ONLY: Hresult = 0x88000715u.toInt()

public val HR_FULL_BACKUP_NOT_TAKEN: Hresult = 0xC7FF000Eu.toInt()

public val HR_GIVEN_LOG_FILE_HAS_BAD_SIGNATURE: Hresult = 0xC800022Bu.toInt()

public val HR_GIVEN_LOG_FILE_IS_NOT_CONTIGUOUS: Hresult = 0xC800022Cu.toInt()

public val HR_ILLEGAL_OPERATION: Hresult = 0xC8000520u.toInt()

public val HR_IN_TRANSACTION: Hresult = 0xC8000454u.toInt()

public val HR_INCREMENTAL_BACKUP_DISABLED: Hresult = 0xC7FF0009u.toInt()

public val HR_INDEX_CANT_BUILD: Hresult = 0xC8000579u.toInt()

public val HR_INDEX_DUPLICATE: Hresult = 0xC800057Bu.toInt()

public val HR_INDEX_HAS_CLUSTERED: Hresult = 0xC8000580u.toInt()

public val HR_INDEX_HAS_PRIMARY: Hresult = 0xC800057Au.toInt()

public val HR_INDEX_IN_USE: Hresult = 0xC800041Bu.toInt()

public val HR_INDEX_INVALID_DEF: Hresult = 0xC800057Eu.toInt()

public val HR_INDEX_MUST_STAY: Hresult = 0xC800057Du.toInt()

public val HR_INDEX_NOT_FOUND: Hresult = 0xC800057Cu.toInt()

public val HR_INVALID_BACKUP: Hresult = 0xC800020Eu.toInt()

public val HR_INVALID_BACKUP_SEQUENCE: Hresult = 0xC8000209u.toInt()

public val HR_INVALID_BOOKMARK: Hresult = 0xC8000415u.toInt()

public val HR_INVALID_BUFFER_SIZE: Hresult = 0xC8000417u.toInt()

public val HR_INVALID_CODE_PAGE: Hresult = 0xC8000427u.toInt()

public val HR_INVALID_COLUMN_TYPE: Hresult = 0xC80005E7u.toInt()

public val HR_INVALID_COUNTRY: Hresult = 0xC8000425u.toInt()

public val HR_INVALID_DATABASE: Hresult = 0xC8000404u.toInt()

public val HR_INVALID_DATABASE_ID: Hresult = 0xC80003F2u.toInt()

public val HR_INVALID_FILENAME: Hresult = 0xC8000414u.toInt()

public val HR_INVALID_HANDLE: Hresult = 0xC7FF0003u.toInt()

public val HR_INVALID_LANGUAGE_ID: Hresult = 0xC8000426u.toInt()

public val HR_INVALID_LOG_SEQUENCE: Hresult = 0xC8000203u.toInt()

public val HR_INVALID_NAME: Hresult = 0xC80003EAu.toInt()

public val HR_INVALID_OBJECT: Hresult = 0xC8000524u.toInt()

public val HR_INVALID_ON_SORT: Hresult = 0xC80006A6u.toInt()

public val HR_INVALID_OPERATION: Hresult = 0xC8000772u.toInt()

public val HR_INVALID_PARAM: Hresult = 0xC7FF0001u.toInt()

public val HR_INVALID_PARAMETER: Hresult = 0xC80003EBu.toInt()

public val HR_INVALID_PATH: Hresult = 0xC80003FFu.toInt()

public val HR_INVALID_RECIPS: Hresult = 0xC7FF0006u.toInt()

public val HR_INVALID_SESID: Hresult = 0xC8000450u.toInt()

public val HR_INVALID_TABLE_ID: Hresult = 0xC800051Eu.toInt()

public val HR_KEY_CHANGED: Hresult = 0x88000652u.toInt()

public val HR_KEY_DUPLICATE: Hresult = 0xC8000645u.toInt()

public val HR_KEY_IS_MADE: Hresult = 0xC80005ECu.toInt()

public val HR_KEY_NOT_MADE: Hresult = 0xC8000648u.toInt()

public val HR_LOG_BUFFER_TOO_SMALL: Hresult = 0xC8000205u.toInt()

public val HR_LOG_CORRUPTED: Hresult = 0xC800073Cu.toInt()

public val HR_LOG_DISK_FULL: Hresult = 0xC8000211u.toInt()

public val HR_LOG_FILE_CORRUPT: Hresult = 0xC80001F5u.toInt()

public val HR_LOG_FILE_NOT_FOUND: Hresult = 0xC7FF000Au.toInt()

public val HR_LOG_SEQUENCE_END: Hresult = 0xC8000207u.toInt()

public val HR_LOG_WRITE_FAIL: Hresult = 0xC80001FEu.toInt()

public val HR_LOGGING_DISABLED: Hresult = 0xC8000204u.toInt()

public val HR_MAKE_BACKUP_DIRECTORY_FAIL: Hresult = 0xC800020Du.toInt()

public val HR_MISSING_EXPIRY_TOKEN: Hresult = 0xC7FF000Fu.toInt()

public val HR_MISSING_FULL_BACKUP: Hresult = 0xC8000230u.toInt()

public val HR_MISSING_LOG_FILE: Hresult = 0xC8000210u.toInt()

public val HR_MISSING_PREVIOUS_LOG_FILE: Hresult = 0xC80001FDu.toInt()

public val HR_MISSING_RESTORE_LOG_FILES: Hresult = 0xC800022Du.toInt()

public val HR_NO_BACKUP: Hresult = 0xC8000208u.toInt()

public val HR_NO_BACKUP_DIRECTORY: Hresult = 0xC80001F7u.toInt()

public val HR_NO_CURRENT_INDEX: Hresult = 0xC80005EBu.toInt()

public val HR_NO_CURRENT_RECORD: Hresult = 0xC8000643u.toInt()

public val HR_NO_FULL_RESTORE: Hresult = 0xC7FF000Cu.toInt()

public val HR_NO_IDLE_ACTIVITY: Hresult = 0x88000422u.toInt()

public val HR_NO_WRITE_LOCK: Hresult = 0x8800042Bu.toInt()

public val HR_NONE: Hresult = 0x0u.toInt()

public val HR_NOT_IN_TRANSACTION: Hresult = 0xC800041Eu.toInt()

public val HR_NOT_INITIALIZED: Hresult = 0xC8000405u.toInt()

public val HR_NULL_INVALID: Hresult = 0xC80005E0u.toInt()

public val HR_NULL_KEY_DISALLOWED: Hresult = 0xC800041Du.toInt()

public val HR_NYI: Hresult = 0xC0000001u.toInt()

public val HR_OBJECT_DUPLICATE: Hresult = 0xC8000522u.toInt()

public val HR_OBJECT_NOT_FOUND: Hresult = 0xC8000519u.toInt()

public val HR_OUT_OF_BUFFERS: Hresult = 0xC80003F6u.toInt()

public val HR_OUT_OF_CURSORS: Hresult = 0xC80003F5u.toInt()

public val HR_OUT_OF_DATABASE_SPACE: Hresult = 0xC80003F4u.toInt()

public val HR_OUT_OF_FILE_HANDLES: Hresult = 0xC80003FCu.toInt()

public val HR_OUT_OF_MEMORY: Hresult = 0xC80003F3u.toInt()

public val HR_OUT_OF_SESSIONS: Hresult = 0xC800044Du.toInt()

public val HR_OUT_OF_THREADS: Hresult = 0xC8000067u.toInt()

public val HR_PM_REC_DELETED: Hresult = 0xC800012Eu.toInt()

public val HR_PATCH_FILE_MISMATCH: Hresult = 0xC8000228u.toInt()

public val HR_PERMISSION_DENIED: Hresult = 0xC8000711u.toInt()

public val HR_READ_VERIFY_FAILURE: Hresult = 0xC80003FAu.toInt()

public val HR_RECORD_CLUSTERED_CHANGED: Hresult = 0xC8000644u.toInt()

public val HR_RECORD_DELETED: Hresult = 0xC80003F9u.toInt()

public val HR_RECORD_NOT_FOUND: Hresult = 0xC8000641u.toInt()

public val HR_RECORD_TOO_BIG: Hresult = 0xC8000402u.toInt()

public val HR_RECOVERED_WITH_ERRORS: Hresult = 0xC800020Fu.toInt()

public val HR_REMAINING_VERSIONS: Hresult = 0x88000141u.toInt()

public val HR_RESTORE_IN_PROGRESS: Hresult = 0xC7FF0004u.toInt()

public val HR_RESTORE_LOG_TOO_HIGH: Hresult = 0xC800022Au.toInt()

public val HR_RESTORE_LOG_TOO_LOW: Hresult = 0xC8000229u.toInt()

public val HR_RESTORE_MAP_EXISTS: Hresult = 0xC7FF0008u.toInt()

public val HR_SEEK_NOT_EQUAL: Hresult = 0x8800040Fu.toInt()

public val HR_SESSION_WRITE_CONFLICT: Hresult = 0xC8000453u.toInt()

public val HR_TABLE_DUPLICATE: Hresult = 0xC8000517u.toInt()

public val HR_TABLE_EMPTY: Hresult = 0x88000515u.toInt()

public val HR_TABLE_IN_USE: Hresult = 0xC8000518u.toInt()

public val HR_TABLE_LOCKED: Hresult = 0xC8000516u.toInt()

public val HR_TABLE_NOT_EMPTY: Hresult = 0xC800051Cu.toInt()

public val HR_TAGGED_NOT_NULL: Hresult = 0xC80005EAu.toInt()

public val HR_TEMP_FILE_OPEN_ERROR: Hresult = 0xC800070Bu.toInt()

public val HR_TERM_IN_PROGRESS: Hresult = 0xC80003E8u.toInt()

public val HR_TOO_MANY_ACTIVE_USERS: Hresult = 0xC8000423u.toInt()

public val HR_TOO_MANY_ATTACHED_DATABASES: Hresult = 0xC800070Du.toInt()

public val HR_TOO_MANY_COLUMNS: Hresult = 0xC8000410u.toInt()

public val HR_TOO_MANY_IO: Hresult = 0xC8000069u.toInt()

public val HR_TOO_MANY_INDEXES: Hresult = 0xC80003F7u.toInt()

public val HR_TOO_MANY_KEYS: Hresult = 0xC80003F8u.toInt()

public val HR_TOO_MANY_OPEN_DATABASES: Hresult = 0xC8000403u.toInt()

public val HR_TOO_MANY_OPEN_INDEXES: Hresult = 0xC8000582u.toInt()

public val HR_TOO_MANY_OPEN_TABLES: Hresult = 0xC800051Fu.toInt()

public val HR_TOO_MANY_SORTS: Hresult = 0xC80006A5u.toInt()

public val HR_TRANS_TOO_DEEP: Hresult = 0xC800044Fu.toInt()

public val HR_UNKNOWN_EXPIRY_TOKEN_FORMAT: Hresult = 0xC7FF0010u.toInt()

public val HR_UPDATE_NOT_PREPARED: Hresult = 0xC8000649u.toInt()

public val HR_VERSION_STORE_OUT_OF_MEMORY: Hresult = 0xC800042Du.toInt()

public val HR_WRITE_CONFLICT: Hresult = 0xC800044Eu.toInt()

public val HRERR_DATA_HAS_CHANGED: Hresult = 0xC800064Bu.toInt()

public val HRWRN_DATA_HAS_CHANGED: Hresult = 0x8800064Au.toInt()
