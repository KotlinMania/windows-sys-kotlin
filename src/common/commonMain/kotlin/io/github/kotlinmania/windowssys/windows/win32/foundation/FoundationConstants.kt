package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.Hresult

public val APPMODEL_ERROR_DYNAMIC_PROPERTY_INVALID: Win32Error = 15705u

public val APPMODEL_ERROR_DYNAMIC_PROPERTY_READ_FAILED: Win32Error = 15704u

public val APPMODEL_ERROR_NO_APPLICATION: Win32Error = 15703u

public val APPMODEL_ERROR_NO_MUTABLE_DIRECTORY: Win32Error = 15707u

public val APPMODEL_ERROR_NO_PACKAGE: Win32Error = 15700u

public val APPMODEL_ERROR_PACKAGE_IDENTITY_CORRUPT: Win32Error = 15702u

public val APPMODEL_ERROR_PACKAGE_NOT_AVAILABLE: Win32Error = 15706u

public val APPMODEL_ERROR_PACKAGE_RUNTIME_CORRUPT: Win32Error = 15701u

public val APPX_E_BLOCK_HASH_INVALID: Hresult = 0x80080207u.toInt()

public val APPX_E_CORRUPT_CONTENT: Hresult = 0x80080206u.toInt()

public val APPX_E_DELTA_APPENDED_PACKAGE_NOT_ALLOWED: Hresult = 0x80080210u.toInt()

public val APPX_E_DELTA_BASELINE_VERSION_MISMATCH: Hresult = 0x8008020Du.toInt()

public val APPX_E_DELTA_PACKAGE_MISSING_FILE: Hresult = 0x8008020Eu.toInt()

public val APPX_E_DIGEST_MISMATCH: Hresult = 0x80080219u.toInt()

public val APPX_E_FILE_COMPRESSION_MISMATCH: Hresult = 0x80080214u.toInt()

public val APPX_E_INTERLEAVING_NOT_ALLOWED: Hresult = 0x80080201u.toInt()

public val APPX_E_INVALID_APPINSTALLER: Hresult = 0x8008020Cu.toInt()

public val APPX_E_INVALID_BLOCKMAP: Hresult = 0x80080205u.toInt()

public val APPX_E_INVALID_CONTENTGROUPMAP: Hresult = 0x8008020Bu.toInt()

public val APPX_E_INVALID_DELTA_PACKAGE: Hresult = 0x8008020Fu.toInt()

public val APPX_E_INVALID_ENCRYPTION_EXCLUSION_FILE_LIST: Hresult = 0x80080216u.toInt()

public val APPX_E_INVALID_KEY_INFO: Hresult = 0x8008020Au.toInt()

public val APPX_E_INVALID_MANIFEST: Hresult = 0x80080204u.toInt()

public val APPX_E_INVALID_PACKAGESIGNCONFIG: Hresult = 0x80080212u.toInt()

public val APPX_E_INVALID_PACKAGE_FOLDER_ACLS: Hresult = 0x80080217u.toInt()

public val APPX_E_INVALID_PACKAGING_LAYOUT: Hresult = 0x80080211u.toInt()

public val APPX_E_INVALID_PAYLOAD_PACKAGE_EXTENSION: Hresult = 0x80080215u.toInt()

public val APPX_E_INVALID_PUBLISHER_BRIDGING: Hresult = 0x80080218u.toInt()

public val APPX_E_INVALID_SIP_CLIENT_DATA: Hresult = 0x80080209u.toInt()

public val APPX_E_MISSING_REQUIRED_FILE: Hresult = 0x80080203u.toInt()

public val APPX_E_PACKAGING_INTERNAL: Hresult = 0x80080200u.toInt()

public val APPX_E_RELATIONSHIPS_NOT_ALLOWED: Hresult = 0x80080202u.toInt()

public val APPX_E_REQUESTED_RANGE_TOO_LARGE: Hresult = 0x80080208u.toInt()

public val APPX_E_RESOURCESPRI_NOT_ALLOWED: Hresult = 0x80080213u.toInt()

public val APP_LOCAL_DEVICE_ID_SIZE: UInt = 32u

public val BT_E_SPURIOUS_ACTIVATION: Hresult = 0x80080300u.toInt()

public val CACHE_E_FIRST: Int = -2147221136

public val CACHE_E_LAST: Int = -2147221121

public val CACHE_E_NOCACHE_UPDATED: Hresult = 0x80040170u.toInt()

public val CACHE_S_FIRST: Int = 262512

public val CACHE_S_FORMATETC_NOTSUPPORTED: Hresult = 0x40170u.toInt()

public val CACHE_S_LAST: Int = 262527

public val CACHE_S_SAMECACHE: Hresult = 0x40171u.toInt()

public val CACHE_S_SOMECACHES_NOTUPDATED: Hresult = 0x40172u.toInt()

public val CAT_E_CATIDNOEXIST: Hresult = 0x80040160u.toInt()

public val CAT_E_FIRST: Int = -2147221152

public val CAT_E_LAST: Int = -2147221151

public val CAT_E_NODESCRIPTION: Hresult = 0x80040161u.toInt()

public val CERTSRV_E_ADMIN_DENIED_REQUEST: Hresult = 0x80094014u.toInt()

public val CERTSRV_E_ALIGNMENT_FAULT: Hresult = 0x80094010u.toInt()

public val CERTSRV_E_ARCHIVED_KEY_REQUIRED: Hresult = 0x80094804u.toInt()

public val CERTSRV_E_ARCHIVED_KEY_UNEXPECTED: Hresult = 0x80094810u.toInt()

public val CERTSRV_E_BAD_RENEWAL_CERT_ATTRIBUTE: Hresult = 0x8009400Eu.toInt()

public val CERTSRV_E_BAD_RENEWAL_SUBJECT: Hresult = 0x80094806u.toInt()

public val CERTSRV_E_BAD_REQUESTSTATUS: Hresult = 0x80094003u.toInt()

public val CERTSRV_E_BAD_REQUESTSUBJECT: Hresult = 0x80094001u.toInt()

public val CERTSRV_E_BAD_REQUEST_KEY_ARCHIVAL: Hresult = 0x8009400Cu.toInt()

public val CERTSRV_E_BAD_TEMPLATE_VERSION: Hresult = 0x80094807u.toInt()

public val CERTSRV_E_CERT_TYPE_OVERLAP: Hresult = 0x80094814u.toInt()

public val CERTSRV_E_CORRUPT_KEY_ATTESTATION: Hresult = 0x8009481Bu.toInt()

public val CERTSRV_E_DOWNLEVEL_DC_SSL_OR_UPGRADE: Hresult = 0x80094013u.toInt()

public val CERTSRV_E_ENCODING_LENGTH: Hresult = 0x80094007u.toInt()

public val CERTSRV_E_ENCRYPTION_CERT_REQUIRED: Hresult = 0x80094018u.toInt()

public val CERTSRV_E_ENROLL_DENIED: Hresult = 0x80094011u.toInt()

public val CERTSRV_E_EXPIRED_CHALLENGE: Hresult = 0x8009481Cu.toInt()

public val CERTSRV_E_INVALID_ATTESTATION: Hresult = 0x80094819u.toInt()

public val CERTSRV_E_INVALID_CA_CERTIFICATE: Hresult = 0x80094005u.toInt()

public val CERTSRV_E_INVALID_EK: Hresult = 0x80094817u.toInt()

public val CERTSRV_E_INVALID_IDBINDING: Hresult = 0x80094818u.toInt()

public val CERTSRV_E_INVALID_REQUESTID: Hresult = 0x8009481Eu.toInt()

public val CERTSRV_E_INVALID_RESPONSE: Hresult = 0x8009481Du.toInt()

public val CERTSRV_E_ISSUANCE_POLICY_REQUIRED: Hresult = 0x8009480Cu.toInt()

public val CERTSRV_E_KEY_ARCHIVAL_NOT_CONFIGURED: Hresult = 0x8009400Au.toInt()

public val CERTSRV_E_KEY_ATTESTATION: Hresult = 0x8009481Au.toInt()

public val CERTSRV_E_KEY_ATTESTATION_NOT_SUPPORTED: Hresult = 0x80094017u.toInt()

public val CERTSRV_E_KEY_LENGTH: Hresult = 0x80094811u.toInt()

public val CERTSRV_E_NO_CAADMIN_DEFINED: Hresult = 0x8009400Du.toInt()

public val CERTSRV_E_NO_CERT_TYPE: Hresult = 0x80094801u.toInt()

public val CERTSRV_E_NO_DB_SESSIONS: Hresult = 0x8009400Fu.toInt()

public val CERTSRV_E_NO_POLICY_SERVER: Hresult = 0x80094015u.toInt()

public val CERTSRV_E_NO_REQUEST: Hresult = 0x80094002u.toInt()

public val CERTSRV_E_NO_VALID_KRA: Hresult = 0x8009400Bu.toInt()

public val CERTSRV_E_PENDING_CLIENT_RESPONSE: Hresult = 0x80094820u.toInt()

public val CERTSRV_E_PROPERTY_EMPTY: Hresult = 0x80094004u.toInt()

public val CERTSRV_E_RENEWAL_BAD_PUBLIC_KEY: Hresult = 0x80094816u.toInt()

public val CERTSRV_E_REQUEST_PRECERTIFICATE_MISMATCH: Hresult = 0x8009481Fu.toInt()

public val CERTSRV_E_RESTRICTEDOFFICER: Hresult = 0x80094009u.toInt()

public val CERTSRV_E_ROLECONFLICT: Hresult = 0x80094008u.toInt()

public val CERTSRV_E_SEC_EXT_DIRECTORY_SID_REQUIRED: Hresult = 0x80094821u.toInt()

public val CERTSRV_E_SERVER_SUSPENDED: Hresult = 0x80094006u.toInt()

public val CERTSRV_E_SIGNATURE_COUNT: Hresult = 0x8009480Au.toInt()

public val CERTSRV_E_SIGNATURE_POLICY_REQUIRED: Hresult = 0x80094809u.toInt()

public val CERTSRV_E_SIGNATURE_REJECTED: Hresult = 0x8009480Bu.toInt()

public val CERTSRV_E_SMIME_REQUIRED: Hresult = 0x80094805u.toInt()

public val CERTSRV_E_SUBJECT_ALT_NAME_REQUIRED: Hresult = 0x80094803u.toInt()

public val CERTSRV_E_SUBJECT_DIRECTORY_GUID_REQUIRED: Hresult = 0x8009480Eu.toInt()

public val CERTSRV_E_SUBJECT_DNS_REQUIRED: Hresult = 0x8009480Fu.toInt()

public val CERTSRV_E_SUBJECT_EMAIL_REQUIRED: Hresult = 0x80094812u.toInt()

public val CERTSRV_E_SUBJECT_UPN_REQUIRED: Hresult = 0x8009480Du.toInt()

public val CERTSRV_E_TEMPLATE_CONFLICT: Hresult = 0x80094802u.toInt()

public val CERTSRV_E_TEMPLATE_DENIED: Hresult = 0x80094012u.toInt()

public val CERTSRV_E_TEMPLATE_POLICY_REQUIRED: Hresult = 0x80094808u.toInt()

public val CERTSRV_E_TOO_MANY_SIGNATURES: Hresult = 0x80094815u.toInt()

public val CERTSRV_E_UNKNOWN_CERT_TYPE: Hresult = 0x80094813u.toInt()

public val CERTSRV_E_UNSUPPORTED_CERT_TYPE: Hresult = 0x80094800u.toInt()

public val CERTSRV_E_WEAK_SIGNATURE_OR_KEY: Hresult = 0x80094016u.toInt()

public val CERT_E_CHAINING: Hresult = 0x800B010Au.toInt()

public val CERT_E_CN_NO_MATCH: Hresult = 0x800B010Fu.toInt()

public val CERT_E_CRITICAL: Hresult = 0x800B0105u.toInt()

public val CERT_E_EXPIRED: Hresult = 0x800B0101u.toInt()

public val CERT_E_INVALID_NAME: Hresult = 0x800B0114u.toInt()

public val CERT_E_INVALID_POLICY: Hresult = 0x800B0113u.toInt()

public val CERT_E_ISSUERCHAINING: Hresult = 0x800B0107u.toInt()

public val CERT_E_MALFORMED: Hresult = 0x800B0108u.toInt()

public val CERT_E_PATHLENCONST: Hresult = 0x800B0104u.toInt()

public val CERT_E_PURPOSE: Hresult = 0x800B0106u.toInt()

public val CERT_E_REVOCATION_FAILURE: Hresult = 0x800B010Eu.toInt()

public val CERT_E_REVOKED: Hresult = 0x800B010Cu.toInt()

public val CERT_E_ROLE: Hresult = 0x800B0103u.toInt()

public val CERT_E_UNTRUSTEDCA: Hresult = 0x800B0112u.toInt()

public val CERT_E_UNTRUSTEDROOT: Hresult = 0x800B0109u.toInt()

public val CERT_E_UNTRUSTEDTESTROOT: Hresult = 0x800B010Du.toInt()

public val CERT_E_VALIDITYPERIODNESTING: Hresult = 0x800B0102u.toInt()

public val CERT_E_WRONG_USAGE: Hresult = 0x800B0110u.toInt()

public val CI_CORRUPT_CATALOG: Hresult = 0xC0041801u.toInt()

public val CI_CORRUPT_DATABASE: Hresult = 0xC0041800u.toInt()

public val CI_CORRUPT_FILTER_BUFFER: Hresult = 0xC0041807u.toInt()

public val CI_E_ALREADY_INITIALIZED: Hresult = 0x8004180Au.toInt()

public val CI_E_BUFFERTOOSMALL: Hresult = 0x8004180Cu.toInt()

public val CI_E_CARDINALITY_MISMATCH: Hresult = 0x80041827u.toInt()

public val CI_E_CLIENT_FILTER_ABORT: Hresult = 0xC0041824u.toInt()

public val CI_E_CONFIG_DISK_FULL: Hresult = 0x80041828u.toInt()

public val CI_E_DISK_FULL: Hresult = 0x80041811u.toInt()

public val CI_E_DISTRIBUTED_GROUPBY_UNSUPPORTED: Hresult = 0x80041829u.toInt()

public val CI_E_DUPLICATE_NOTIFICATION: Hresult = 0x80041817u.toInt()

public val CI_E_ENUMERATION_STARTED: Hresult = 0xC0041822u.toInt()

public val CI_E_FILTERING_DISABLED: Hresult = 0x80041810u.toInt()

public val CI_E_INVALID_FLAGS_COMBINATION: Hresult = 0x80041819u.toInt()

public val CI_E_INVALID_STATE: Hresult = 0x8004180Fu.toInt()

public val CI_E_LOGON_FAILURE: Hresult = 0x8004181Cu.toInt()

public val CI_E_NOT_FOUND: Hresult = 0x80041815u.toInt()

public val CI_E_NOT_INITIALIZED: Hresult = 0x8004180Bu.toInt()

public val CI_E_NOT_RUNNING: Hresult = 0x80041820u.toInt()

public val CI_E_NO_CATALOG: Hresult = 0x8004181Du.toInt()

public val CI_E_OUTOFSEQ_INCREMENT_DATA: Hresult = 0x8004181Au.toInt()

public val CI_E_PROPERTY_NOT_CACHED: Hresult = 0x8004180Du.toInt()

public val CI_E_PROPERTY_TOOLARGE: Hresult = 0xC0041823u.toInt()

public val CI_E_SHARING_VIOLATION: Hresult = 0x8004181Bu.toInt()

public val CI_E_SHUTDOWN: Hresult = 0x80041812u.toInt()

public val CI_E_STRANGE_PAGEORSECTOR_SIZE: Hresult = 0x8004181Eu.toInt()

public val CI_E_TIMEOUT: Hresult = 0x8004181Fu.toInt()

public val CI_E_UPDATES_DISABLED: Hresult = 0x80041818u.toInt()

public val CI_E_USE_DEFAULT_PID: Hresult = 0x80041816u.toInt()

public val CI_E_WORKID_NOTVALID: Hresult = 0x80041813u.toInt()

public val CI_INCORRECT_VERSION: Hresult = 0xC0041821u.toInt()

public val CI_INVALID_INDEX: Hresult = 0xC0041808u.toInt()

public val CI_INVALID_PARTITION: Hresult = 0xC0041802u.toInt()

public val CI_INVALID_PRIORITY: Hresult = 0xC0041803u.toInt()

public val CI_NO_CATALOG: Hresult = 0xC0041806u.toInt()

public val CI_NO_STARTING_KEY: Hresult = 0xC0041804u.toInt()

public val CI_OUT_OF_INDEX_IDS: Hresult = 0xC0041805u.toInt()

public val CI_PROPSTORE_INCONSISTENCY: Hresult = 0xC0041809u.toInt()

public val CI_S_CAT_STOPPED: Hresult = 0x41826u.toInt()

public val CI_S_END_OF_ENUMERATION: Hresult = 0x41814u.toInt()

public val CI_S_NO_DOCSTORE: Hresult = 0x41825u.toInt()

public val CI_S_WORKID_DELETED: Hresult = 0x4180Eu.toInt()

public val CLASSFACTORY_E_FIRST: Int = -2147221232

public val CLASSFACTORY_E_LAST: Int = -2147221217

public val CLASSFACTORY_S_FIRST: Int = 262416

public val CLASSFACTORY_S_LAST: Int = 262431

public val CLASS_E_CLASSNOTAVAILABLE: Hresult = 0x80040111u.toInt()

public val CLASS_E_NOAGGREGATION: Hresult = 0x80040110u.toInt()

public val CLASS_E_NOTLICENSED: Hresult = 0x80040112u.toInt()

public val CLIENTSITE_E_FIRST: Int = -2147221104

public val CLIENTSITE_E_LAST: Int = -2147221089

public val CLIENTSITE_S_FIRST: Int = 262544

public val CLIENTSITE_S_LAST: Int = 262559

public val CLIPBRD_E_BAD_DATA: Hresult = 0x800401D3u.toInt()

public val CLIPBRD_E_CANT_CLOSE: Hresult = 0x800401D4u.toInt()

public val CLIPBRD_E_CANT_EMPTY: Hresult = 0x800401D1u.toInt()

public val CLIPBRD_E_CANT_OPEN: Hresult = 0x800401D0u.toInt()

public val CLIPBRD_E_CANT_SET: Hresult = 0x800401D2u.toInt()

public val CLIPBRD_E_FIRST: Int = -2147221040

public val CLIPBRD_E_LAST: Int = -2147221025

public val CLIPBRD_S_FIRST: Int = 262608

public val CLIPBRD_S_LAST: Int = 262623

public val COMADMIN_E_ALREADYINSTALLED: Hresult = 0x80110404u.toInt()

public val COMADMIN_E_AMBIGUOUS_APPLICATION_NAME: Hresult = 0x8011045Cu.toInt()

public val COMADMIN_E_AMBIGUOUS_PARTITION_NAME: Hresult = 0x8011045Du.toInt()

public val COMADMIN_E_APPDIRNOTFOUND: Hresult = 0x8011041Fu.toInt()

public val COMADMIN_E_APPLICATIONEXISTS: Hresult = 0x8011040Bu.toInt()

public val COMADMIN_E_APPLID_MATCHES_CLSID: Hresult = 0x80110446u.toInt()

public val COMADMIN_E_APP_FILE_READFAIL: Hresult = 0x80110408u.toInt()

public val COMADMIN_E_APP_FILE_VERSION: Hresult = 0x80110409u.toInt()

public val COMADMIN_E_APP_FILE_WRITEFAIL: Hresult = 0x80110407u.toInt()

public val COMADMIN_E_APP_NOT_RUNNING: Hresult = 0x8011080Au.toInt()

public val COMADMIN_E_AUTHENTICATIONLEVEL: Hresult = 0x80110413u.toInt()

public val COMADMIN_E_BADPATH: Hresult = 0x8011040Au.toInt()

public val COMADMIN_E_BADREGISTRYLIBID: Hresult = 0x8011041Eu.toInt()

public val COMADMIN_E_BADREGISTRYPROGID: Hresult = 0x80110412u.toInt()

public val COMADMIN_E_BASEPARTITION_REQUIRED_IN_SET: Hresult = 0x8011081Fu.toInt()

public val COMADMIN_E_BASE_PARTITION_ONLY: Hresult = 0x80110450u.toInt()

public val COMADMIN_E_CANNOT_ALIAS_EVENTCLASS: Hresult = 0x80110820u.toInt()

public val COMADMIN_E_CANTCOPYFILE: Hresult = 0x8011040Du.toInt()

public val COMADMIN_E_CANTMAKEINPROCSERVICE: Hresult = 0x80110814u.toInt()

public val COMADMIN_E_CANTRECYCLELIBRARYAPPS: Hresult = 0x8011080Fu.toInt()

public val COMADMIN_E_CANTRECYCLESERVICEAPPS: Hresult = 0x80110811u.toInt()

public val COMADMIN_E_CANT_SUBSCRIBE_TO_COMPONENT: Hresult = 0x8011044Du.toInt()

public val COMADMIN_E_CAN_NOT_EXPORT_APP_PROXY: Hresult = 0x8011044Au.toInt()

public val COMADMIN_E_CAN_NOT_EXPORT_SYS_APP: Hresult = 0x8011044Cu.toInt()

public val COMADMIN_E_CAN_NOT_START_APP: Hresult = 0x8011044Bu.toInt()

public val COMADMIN_E_CAT_BITNESSMISMATCH: Hresult = 0x80110482u.toInt()

public val COMADMIN_E_CAT_DUPLICATE_PARTITION_NAME: Hresult = 0x80110457u.toInt()

public val COMADMIN_E_CAT_IMPORTED_COMPONENTS_NOT_ALLOWED: Hresult = 0x8011045Bu.toInt()

public val COMADMIN_E_CAT_INVALID_PARTITION_NAME: Hresult = 0x80110458u.toInt()

public val COMADMIN_E_CAT_PARTITION_IN_USE: Hresult = 0x80110459u.toInt()

public val COMADMIN_E_CAT_PAUSE_RESUME_NOT_SUPPORTED: Hresult = 0x80110485u.toInt()

public val COMADMIN_E_CAT_SERVERFAULT: Hresult = 0x80110486u.toInt()

public val COMADMIN_E_CAT_UNACCEPTABLEBITNESS: Hresult = 0x80110483u.toInt()

public val COMADMIN_E_CAT_WRONGAPPBITNESS: Hresult = 0x80110484u.toInt()

public val COMADMIN_E_CLSIDORIIDMISMATCH: Hresult = 0x80110418u.toInt()

public val COMADMIN_E_COMPFILE_BADTLB: Hresult = 0x80110428u.toInt()

public val COMADMIN_E_COMPFILE_CLASSNOTAVAIL: Hresult = 0x80110427u.toInt()

public val COMADMIN_E_COMPFILE_DOESNOTEXIST: Hresult = 0x80110424u.toInt()

public val COMADMIN_E_COMPFILE_GETCLASSOBJ: Hresult = 0x80110426u.toInt()

public val COMADMIN_E_COMPFILE_LOADDLLFAIL: Hresult = 0x80110425u.toInt()

public val COMADMIN_E_COMPFILE_NOREGISTRAR: Hresult = 0x80110434u.toInt()

public val COMADMIN_E_COMPFILE_NOTINSTALLABLE: Hresult = 0x80110429u.toInt()

public val COMADMIN_E_COMPONENTEXISTS: Hresult = 0x80110439u.toInt()

public val COMADMIN_E_COMP_MOVE_BAD_DEST: Hresult = 0x8011042Eu.toInt()

public val COMADMIN_E_COMP_MOVE_DEST: Hresult = 0x8011081Du.toInt()

public val COMADMIN_E_COMP_MOVE_LOCKED: Hresult = 0x8011042Du.toInt()

public val COMADMIN_E_COMP_MOVE_PRIVATE: Hresult = 0x8011081Eu.toInt()

public val COMADMIN_E_COMP_MOVE_SOURCE: Hresult = 0x8011081Cu.toInt()

public val COMADMIN_E_COREQCOMPINSTALLED: Hresult = 0x80110435u.toInt()

public val COMADMIN_E_DEFAULT_PARTITION_NOT_IN_SET: Hresult = 0x80110816u.toInt()

public val COMADMIN_E_DLLLOADFAILED: Hresult = 0x8011041Du.toInt()

public val COMADMIN_E_DLLREGISTERSERVER: Hresult = 0x8011041Au.toInt()

public val COMADMIN_E_EVENTCLASS_CANT_BE_SUBSCRIBER: Hresult = 0x8011044Eu.toInt()

public val COMADMIN_E_FILE_PARTITION_DUPLICATE_FILES: Hresult = 0x8011045Au.toInt()

public val COMADMIN_E_INVALIDUSERIDS: Hresult = 0x80110410u.toInt()

public val COMADMIN_E_INVALID_PARTITION: Hresult = 0x8011080Bu.toInt()

public val COMADMIN_E_KEYMISSING: Hresult = 0x80110403u.toInt()

public val COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_1_0_FORMAT: Hresult = 0x8011081Au.toInt()

public val COMADMIN_E_LEGACYCOMPS_NOT_ALLOWED_IN_NONBASE_PARTITIONS: Hresult = 0x8011081Bu.toInt()

public val COMADMIN_E_LIB_APP_PROXY_INCOMPATIBLE: Hresult = 0x8011044Fu.toInt()

public val COMADMIN_E_MIG_SCHEMANOTFOUND: Hresult = 0x80110481u.toInt()

public val COMADMIN_E_MIG_VERSIONNOTSUPPORTED: Hresult = 0x80110480u.toInt()

public val COMADMIN_E_NOREGISTRYCLSID: Hresult = 0x80110411u.toInt()

public val COMADMIN_E_NOSERVERSHARE: Hresult = 0x8011041Bu.toInt()

public val COMADMIN_E_NOTCHANGEABLE: Hresult = 0x8011042Au.toInt()

public val COMADMIN_E_NOTDELETEABLE: Hresult = 0x8011042Bu.toInt()

public val COMADMIN_E_NOTINREGISTRY: Hresult = 0x8011043Eu.toInt()

public val COMADMIN_E_NOUSER: Hresult = 0x8011040Fu.toInt()

public val COMADMIN_E_OBJECTERRORS: Hresult = 0x80110401u.toInt()

public val COMADMIN_E_OBJECTEXISTS: Hresult = 0x80110438u.toInt()

public val COMADMIN_E_OBJECTINVALID: Hresult = 0x80110402u.toInt()

public val COMADMIN_E_OBJECTNOTPOOLABLE: Hresult = 0x8011043Fu.toInt()

public val COMADMIN_E_OBJECT_DOES_NOT_EXIST: Hresult = 0x80110809u.toInt()

public val COMADMIN_E_OBJECT_PARENT_MISSING: Hresult = 0x80110808u.toInt()

public val COMADMIN_E_PARTITIONS_DISABLED: Hresult = 0x80110824u.toInt()

public val COMADMIN_E_PARTITION_ACCESSDENIED: Hresult = 0x80110818u.toInt()

public val COMADMIN_E_PARTITION_MSI_ONLY: Hresult = 0x80110819u.toInt()

public val COMADMIN_E_PAUSEDPROCESSMAYNOTBERECYCLED: Hresult = 0x80110813u.toInt()

public val COMADMIN_E_PRIVATE_ACCESSDENIED: Hresult = 0x80110821u.toInt()

public val COMADMIN_E_PROCESSALREADYRECYCLED: Hresult = 0x80110812u.toInt()

public val COMADMIN_E_PROGIDINUSEBYCLSID: Hresult = 0x80110815u.toInt()

public val COMADMIN_E_PROPERTYSAVEFAILED: Hresult = 0x80110437u.toInt()

public val COMADMIN_E_PROPERTY_OVERFLOW: Hresult = 0x8011043Cu.toInt()

public val COMADMIN_E_RECYCLEDPROCESSMAYNOTBEPAUSED: Hresult = 0x80110817u.toInt()

public val COMADMIN_E_REGDB_ALREADYRUNNING: Hresult = 0x80110475u.toInt()

public val COMADMIN_E_REGDB_NOTINITIALIZED: Hresult = 0x80110472u.toInt()

public val COMADMIN_E_REGDB_NOTOPEN: Hresult = 0x80110473u.toInt()

public val COMADMIN_E_REGDB_SYSTEMERR: Hresult = 0x80110474u.toInt()

public val COMADMIN_E_REGFILE_CORRUPT: Hresult = 0x8011043Bu.toInt()

public val COMADMIN_E_REGISTERTLB: Hresult = 0x80110430u.toInt()

public val COMADMIN_E_REGISTRARFAILED: Hresult = 0x80110423u.toInt()

public val COMADMIN_E_REGISTRY_ACCESSDENIED: Hresult = 0x80110823u.toInt()

public val COMADMIN_E_REMOTEINTERFACE: Hresult = 0x80110419u.toInt()

public val COMADMIN_E_REQUIRES_DIFFERENT_PLATFORM: Hresult = 0x80110449u.toInt()

public val COMADMIN_E_ROLEEXISTS: Hresult = 0x8011040Cu.toInt()

public val COMADMIN_E_ROLE_DOES_NOT_EXIST: Hresult = 0x80110447u.toInt()

public val COMADMIN_E_SAFERINVALID: Hresult = 0x80110822u.toInt()

public val COMADMIN_E_SERVICENOTINSTALLED: Hresult = 0x80110436u.toInt()

public val COMADMIN_E_SESSION: Hresult = 0x8011042Cu.toInt()

public val COMADMIN_E_START_APP_DISABLED: Hresult = 0x80110451u.toInt()

public val COMADMIN_E_START_APP_NEEDS_COMPONENTS: Hresult = 0x80110448u.toInt()

public val COMADMIN_E_SVCAPP_NOT_POOLABLE_OR_RECYCLABLE: Hresult = 0x8011080Du.toInt()

public val COMADMIN_E_SYSTEMAPP: Hresult = 0x80110433u.toInt()

public val COMADMIN_E_USERPASSWDNOTVALID: Hresult = 0x80110414u.toInt()

public val COMADMIN_E_USER_IN_SET: Hresult = 0x8011080Eu.toInt()

public val COMQC_E_APPLICATION_NOT_QUEUED: Hresult = 0x80110600u.toInt()

public val COMQC_E_BAD_MESSAGE: Hresult = 0x80110604u.toInt()

public val COMQC_E_NO_IPERSISTSTREAM: Hresult = 0x80110603u.toInt()

public val COMQC_E_NO_QUEUEABLE_INTERFACES: Hresult = 0x80110601u.toInt()

public val COMQC_E_QUEUING_SERVICE_NOT_AVAILABLE: Hresult = 0x80110602u.toInt()

public val COMQC_E_UNAUTHENTICATED: Hresult = 0x80110605u.toInt()

public val COMQC_E_UNTRUSTED_ENQUEUER: Hresult = 0x80110606u.toInt()

public val CONTEXT_E_ABORTED: Hresult = 0x8004E002u.toInt()

public val CONTEXT_E_ABORTING: Hresult = 0x8004E003u.toInt()

public val CONTEXT_E_FIRST: Int = -2147164160

public val CONTEXT_E_LAST: Int = -2147164113

public val CONTEXT_E_NOCONTEXT: Hresult = 0x8004E004u.toInt()

public val CONTEXT_E_NOJIT: Hresult = 0x8004E026u.toInt()

public val CONTEXT_E_NOTRANSACTION: Hresult = 0x8004E027u.toInt()

public val CONTEXT_E_OLDREF: Hresult = 0x8004E007u.toInt()

public val CONTEXT_E_ROLENOTFOUND: Hresult = 0x8004E00Cu.toInt()

public val CONTEXT_E_SYNCH_TIMEOUT: Hresult = 0x8004E006u.toInt()

public val CONTEXT_E_TMNOTAVAILABLE: Hresult = 0x8004E00Fu.toInt()

public val CONTEXT_E_WOULD_DEADLOCK: Hresult = 0x8004E005u.toInt()

public val CONTEXT_S_FIRST: Int = 319488

public val CONTEXT_S_LAST: Int = 319535

public val CONTROL_C_EXIT: Ntstatus = 0xC000013Au.toInt()

public val CONVERT10_E_FIRST: Int = -2147221056

public val CONVERT10_E_LAST: Int = -2147221041

public val CONVERT10_E_OLELINK_DISABLED: Hresult = 0x800401C7u.toInt()

public val CONVERT10_E_OLESTREAM_BITMAP_TO_DIB: Hresult = 0x800401C3u.toInt()

public val CONVERT10_E_OLESTREAM_FMT: Hresult = 0x800401C2u.toInt()

public val CONVERT10_E_OLESTREAM_GET: Hresult = 0x800401C0u.toInt()

public val CONVERT10_E_OLESTREAM_PUT: Hresult = 0x800401C1u.toInt()

public val CONVERT10_E_STG_DIB_TO_BITMAP: Hresult = 0x800401C6u.toInt()

public val CONVERT10_E_STG_FMT: Hresult = 0x800401C4u.toInt()

public val CONVERT10_E_STG_NO_STD_STREAM: Hresult = 0x800401C5u.toInt()

public val CONVERT10_S_FIRST: Int = 262592

public val CONVERT10_S_LAST: Int = 262607

public val CONVERT10_S_NO_PRESENTATION: Hresult = 0x401C0u.toInt()

public val CO_E_ACCESSCHECKFAILED: Hresult = 0x8001012Au.toInt()

public val CO_E_ACESINWRONGORDER: Hresult = 0x8001013Au.toInt()

public val CO_E_ACNOTINITIALIZED: Hresult = 0x8001013Fu.toInt()

public val CO_E_ACTIVATIONFAILED: Hresult = 0x8004E021u.toInt()

public val CO_E_ACTIVATIONFAILED_CATALOGERROR: Hresult = 0x8004E023u.toInt()

public val CO_E_ACTIVATIONFAILED_EVENTLOGGED: Hresult = 0x8004E022u.toInt()

public val CO_E_ACTIVATIONFAILED_TIMEOUT: Hresult = 0x8004E024u.toInt()

public val CO_E_ALREADYINITIALIZED: Hresult = 0x800401F1u.toInt()

public val CO_E_APPDIDNTREG: Hresult = 0x800401FEu.toInt()

public val CO_E_APPNOTFOUND: Hresult = 0x800401F5u.toInt()

public val CO_E_APPSINGLEUSE: Hresult = 0x800401F6u.toInt()

public val CO_E_ASYNC_WORK_REJECTED: Hresult = 0x80004029u.toInt()

public val CO_E_ATTEMPT_TO_CREATE_OUTSIDE_CLIENT_CONTEXT: Hresult = 0x80004024u.toInt()

public val CO_E_BAD_PATH: Hresult = 0x80080004u.toInt()

public val CO_E_BAD_SERVER_NAME: Hresult = 0x80004014u.toInt()

public val CO_E_CALL_OUT_OF_TX_SCOPE_NOT_ALLOWED: Hresult = 0x8004E030u.toInt()

public val CO_E_CANCEL_DISABLED: Hresult = 0x80010140u.toInt()

public val CO_E_CANTDETERMINECLASS: Hresult = 0x800401F2u.toInt()

public val CO_E_CANT_REMOTE: Hresult = 0x80004013u.toInt()

public val CO_E_CLASSSTRING: Hresult = 0x800401F3u.toInt()

public val CO_E_CLASS_CREATE_FAILED: Hresult = 0x80080001u.toInt()

public val CO_E_CLASS_DISABLED: Hresult = 0x80004027u.toInt()

public val CO_E_CLRNOTAVAILABLE: Hresult = 0x80004028u.toInt()

public val CO_E_CLSREG_INCONSISTENT: Hresult = 0x8000401Fu.toInt()

public val CO_E_CONVERSIONFAILED: Hresult = 0x8001012Eu.toInt()

public val CO_E_CREATEPROCESS_FAILURE: Hresult = 0x80004018u.toInt()

public val CO_E_DBERROR: Hresult = 0x8004E02Bu.toInt()

public val CO_E_DECODEFAILED: Hresult = 0x8001013Du.toInt()

public val CO_E_DLLNOTFOUND: Hresult = 0x800401F8u.toInt()

public val CO_E_ELEVATION_DISABLED: Hresult = 0x80080017u.toInt()

public val CO_E_ERRORINAPP: Hresult = 0x800401F7u.toInt()

public val CO_E_ERRORINDLL: Hresult = 0x800401F9u.toInt()

public val CO_E_EXCEEDSYSACLLIMIT: Hresult = 0x80010139u.toInt()

public val CO_E_EXIT_TRANSACTION_SCOPE_NOT_CALLED: Hresult = 0x8004E031u.toInt()

public val CO_E_FAILEDTOCLOSEHANDLE: Hresult = 0x80010138u.toInt()

public val CO_E_FAILEDTOCREATEFILE: Hresult = 0x80010137u.toInt()

public val CO_E_FAILEDTOGENUUID: Hresult = 0x80010136u.toInt()

public val CO_E_FAILEDTOGETSECCTX: Hresult = 0x80010124u.toInt()

public val CO_E_FAILEDTOGETTOKENINFO: Hresult = 0x80010126u.toInt()

public val CO_E_FAILEDTOGETWINDIR: Hresult = 0x80010134u.toInt()

public val CO_E_FAILEDTOIMPERSONATE: Hresult = 0x80010123u.toInt()

public val CO_E_FAILEDTOOPENPROCESSTOKEN: Hresult = 0x8001013Cu.toInt()

public val CO_E_FAILEDTOOPENTHREADTOKEN: Hresult = 0x80010125u.toInt()

public val CO_E_FAILEDTOQUERYCLIENTBLANKET: Hresult = 0x80010128u.toInt()

public val CO_E_FAILEDTOSETDACL: Hresult = 0x80010129u.toInt()

public val CO_E_FIRST: Int = -2147221008

public val CO_E_IIDREG_INCONSISTENT: Hresult = 0x80004020u.toInt()

public val CO_E_IIDSTRING: Hresult = 0x800401F4u.toInt()

public val CO_E_INCOMPATIBLESTREAMVERSION: Hresult = 0x8001013Bu.toInt()

public val CO_E_INITIALIZATIONFAILED: Hresult = 0x8004E025u.toInt()

public val CO_E_INIT_CLASS_CACHE: Hresult = 0x80004009u.toInt()

public val CO_E_INIT_MEMORY_ALLOCATOR: Hresult = 0x80004008u.toInt()

public val CO_E_INIT_ONLY_SINGLE_THREADED: Hresult = 0x80004012u.toInt()

public val CO_E_INIT_RPC_CHANNEL: Hresult = 0x8000400Au.toInt()

public val CO_E_INIT_SCM_EXEC_FAILURE: Hresult = 0x80004011u.toInt()

public val CO_E_INIT_SCM_FILE_MAPPING_EXISTS: Hresult = 0x8000400Fu.toInt()

public val CO_E_INIT_SCM_MAP_VIEW_OF_FILE: Hresult = 0x80004010u.toInt()

public val CO_E_INIT_SCM_MUTEX_EXISTS: Hresult = 0x8000400Eu.toInt()

public val CO_E_INIT_SHARED_ALLOCATOR: Hresult = 0x80004007u.toInt()

public val CO_E_INIT_TLS: Hresult = 0x80004006u.toInt()

public val CO_E_INIT_TLS_CHANNEL_CONTROL: Hresult = 0x8000400Cu.toInt()

public val CO_E_INIT_TLS_SET_CHANNEL_CONTROL: Hresult = 0x8000400Bu.toInt()

public val CO_E_INIT_UNACCEPTED_USER_ALLOCATOR: Hresult = 0x8000400Du.toInt()

public val CO_E_INVALIDSID: Hresult = 0x8001012Du.toInt()

public val CO_E_ISOLEVELMISMATCH: Hresult = 0x8004E02Fu.toInt()

public val CO_E_LAST: Int = -2147220993

public val CO_E_LAUNCH_PERMSSION_DENIED: Hresult = 0x8000401Bu.toInt()

public val CO_E_LOOKUPACCNAMEFAILED: Hresult = 0x80010132u.toInt()

public val CO_E_LOOKUPACCSIDFAILED: Hresult = 0x80010130u.toInt()

public val CO_E_MALFORMED_SPN: Hresult = 0x80004033u.toInt()

public val CO_E_MISSING_DISPLAYNAME: Hresult = 0x80080015u.toInt()

public val CO_E_MSI_ERROR: Hresult = 0x80004023u.toInt()

public val CO_E_NETACCESSAPIFAILED: Hresult = 0x8001012Bu.toInt()

public val CO_E_NOCOOKIES: Hresult = 0x8004E02Au.toInt()

public val CO_E_NOIISINTRINSICS: Hresult = 0x8004E029u.toInt()

public val CO_E_NOMATCHINGNAMEFOUND: Hresult = 0x80010131u.toInt()

public val CO_E_NOMATCHINGSIDFOUND: Hresult = 0x8001012Fu.toInt()

public val CO_E_NOSYNCHRONIZATION: Hresult = 0x8004E02Eu.toInt()

public val CO_E_NOTCONSTRUCTED: Hresult = 0x8004E02Du.toInt()

public val CO_E_NOTINITIALIZED: Hresult = 0x800401F0u.toInt()

public val CO_E_NOTPOOLED: Hresult = 0x8004E02Cu.toInt()

public val CO_E_NOT_SUPPORTED: Hresult = 0x80004021u.toInt()

public val CO_E_NO_SECCTX_IN_ACTIVATE: Hresult = 0x8000402Bu.toInt()

public val CO_E_OBJISREG: Hresult = 0x800401FCu.toInt()

public val CO_E_OBJNOTCONNECTED: Hresult = 0x800401FDu.toInt()

public val CO_E_OBJNOTREG: Hresult = 0x800401FBu.toInt()

public val CO_E_OBJSRV_RPC_FAILURE: Hresult = 0x80080006u.toInt()

public val CO_E_OLE1DDE_DISABLED: Hresult = 0x80004016u.toInt()

public val CO_E_PATHTOOLONG: Hresult = 0x80010135u.toInt()

public val CO_E_PREMATURE_STUB_RUNDOWN: Hresult = 0x80004035u.toInt()

public val CO_E_RELEASED: Hresult = 0x800401FFu.toInt()

public val CO_E_RELOAD_DLL: Hresult = 0x80004022u.toInt()

public val CO_E_REMOTE_COMMUNICATION_FAILURE: Hresult = 0x8000401Du.toInt()

public val CO_E_RUNAS_CREATEPROCESS_FAILURE: Hresult = 0x80004019u.toInt()

public val CO_E_RUNAS_LOGON_FAILURE: Hresult = 0x8000401Au.toInt()

public val CO_E_RUNAS_SYNTAX: Hresult = 0x80004017u.toInt()

public val CO_E_RUNAS_VALUE_MUST_BE_AAA: Hresult = 0x80080016u.toInt()

public val CO_E_SCM_ERROR: Hresult = 0x80080002u.toInt()

public val CO_E_SCM_RPC_FAILURE: Hresult = 0x80080003u.toInt()

public val CO_E_SERVER_EXEC_FAILURE: Hresult = 0x80080005u.toInt()

public val CO_E_SERVER_INIT_TIMEOUT: Hresult = 0x8000402Au.toInt()

public val CO_E_SERVER_NOT_PAUSED: Hresult = 0x80004026u.toInt()

public val CO_E_SERVER_PAUSED: Hresult = 0x80004025u.toInt()

public val CO_E_SERVER_START_TIMEOUT: Hresult = 0x8000401Eu.toInt()

public val CO_E_SERVER_STOPPING: Hresult = 0x80080008u.toInt()

public val CO_E_SETSERLHNDLFAILED: Hresult = 0x80010133u.toInt()

public val CO_E_START_SERVICE_FAILURE: Hresult = 0x8000401Cu.toInt()

public val CO_E_SXS_CONFIG: Hresult = 0x80004032u.toInt()

public val CO_E_THREADINGMODEL_CHANGED: Hresult = 0x8004E028u.toInt()

public val CO_E_THREADPOOL_CONFIG: Hresult = 0x80004031u.toInt()

public val CO_E_TRACKER_CONFIG: Hresult = 0x80004030u.toInt()

public val CO_E_TRUSTEEDOESNTMATCHCLIENT: Hresult = 0x80010127u.toInt()

public val CO_E_UNREVOKED_REGISTRATION_ON_APARTMENT_SHUTDOWN: Hresult = 0x80004034u.toInt()

public val CO_E_WRONGOSFORAPP: Hresult = 0x800401FAu.toInt()

public val CO_E_WRONGTRUSTEENAMESYNTAX: Hresult = 0x8001012Cu.toInt()

public val CO_E_WRONG_SERVER_IDENTITY: Hresult = 0x80004015u.toInt()

public val CO_S_FIRST: Int = 262640

public val CO_S_LAST: Int = 262655

public val CO_S_MACHINENAMENOTFOUND: Hresult = 0x80013u.toInt()

public val CO_S_NOTALLINTERFACES: Hresult = 0x80012u.toInt()

public val CRYPT_E_ALREADY_DECRYPTED: Hresult = 0x80091009u.toInt()

public val CRYPT_E_ASN1_BADARGS: Hresult = 0x80093109u.toInt()

public val CRYPT_E_ASN1_BADPDU: Hresult = 0x80093108u.toInt()

public val CRYPT_E_ASN1_BADREAL: Hresult = 0x8009310Au.toInt()

public val CRYPT_E_ASN1_BADTAG: Hresult = 0x8009310Bu.toInt()

public val CRYPT_E_ASN1_CHOICE: Hresult = 0x8009310Cu.toInt()

public val CRYPT_E_ASN1_CONSTRAINT: Hresult = 0x80093105u.toInt()

public val CRYPT_E_ASN1_CORRUPT: Hresult = 0x80093103u.toInt()

public val CRYPT_E_ASN1_EOD: Hresult = 0x80093102u.toInt()

public val CRYPT_E_ASN1_ERROR: Hresult = 0x80093100u.toInt()

public val CRYPT_E_ASN1_EXTENDED: Hresult = 0x80093201u.toInt()

public val CRYPT_E_ASN1_INTERNAL: Hresult = 0x80093101u.toInt()

public val CRYPT_E_ASN1_LARGE: Hresult = 0x80093104u.toInt()

public val CRYPT_E_ASN1_MEMORY: Hresult = 0x80093106u.toInt()

public val CRYPT_E_ASN1_NOEOD: Hresult = 0x80093202u.toInt()

public val CRYPT_E_ASN1_NYI: Hresult = 0x80093134u.toInt()

public val CRYPT_E_ASN1_OVERFLOW: Hresult = 0x80093107u.toInt()

public val CRYPT_E_ASN1_PDU_TYPE: Hresult = 0x80093133u.toInt()

public val CRYPT_E_ASN1_RULE: Hresult = 0x8009310Du.toInt()

public val CRYPT_E_ASN1_UTF8: Hresult = 0x8009310Eu.toInt()

public val CRYPT_E_ATTRIBUTES_MISSING: Hresult = 0x8009100Fu.toInt()

public val CRYPT_E_AUTH_ATTR_MISSING: Hresult = 0x80091006u.toInt()

public val CRYPT_E_BAD_ENCODE: Hresult = 0x80092002u.toInt()

public val CRYPT_E_BAD_LEN: Hresult = 0x80092001u.toInt()

public val CRYPT_E_BAD_MSG: Hresult = 0x8009200Du.toInt()

public val CRYPT_E_CONTROL_TYPE: Hresult = 0x8009100Cu.toInt()

public val CRYPT_E_DELETED_PREV: Hresult = 0x80092008u.toInt()

public val CRYPT_E_EXISTS: Hresult = 0x80092005u.toInt()

public val CRYPT_E_FILERESIZED: Hresult = 0x80092025u.toInt()

public val CRYPT_E_FILE_ERROR: Hresult = 0x80092003u.toInt()

public val CRYPT_E_HASH_VALUE: Hresult = 0x80091007u.toInt()

public val CRYPT_E_INVALID_IA5_STRING: Hresult = 0x80092022u.toInt()

public val CRYPT_E_INVALID_INDEX: Hresult = 0x80091008u.toInt()

public val CRYPT_E_INVALID_MSG_TYPE: Hresult = 0x80091004u.toInt()

public val CRYPT_E_INVALID_NUMERIC_STRING: Hresult = 0x80092020u.toInt()

public val CRYPT_E_INVALID_PRINTABLE_STRING: Hresult = 0x80092021u.toInt()

public val CRYPT_E_INVALID_X500_STRING: Hresult = 0x80092023u.toInt()

public val CRYPT_E_ISSUER_SERIALNUMBER: Hresult = 0x8009100Du.toInt()

public val CRYPT_E_MISSING_PUBKEY_PARA: Hresult = 0x8009202Cu.toInt()

public val CRYPT_E_MSG_ERROR: Hresult = 0x80091001u.toInt()

public val CRYPT_E_NOT_CHAR_STRING: Hresult = 0x80092024u.toInt()

public val CRYPT_E_NOT_DECRYPTED: Hresult = 0x8009100Au.toInt()

public val CRYPT_E_NOT_FOUND: Hresult = 0x80092004u.toInt()

public val CRYPT_E_NOT_IN_CTL: Hresult = 0x8009202Au.toInt()

public val CRYPT_E_NOT_IN_REVOCATION_DATABASE: Hresult = 0x80092014u.toInt()

public val CRYPT_E_NO_DECRYPT_CERT: Hresult = 0x8009200Cu.toInt()

public val CRYPT_E_NO_KEY_PROPERTY: Hresult = 0x8009200Bu.toInt()

public val CRYPT_E_NO_MATCH: Hresult = 0x80092009u.toInt()

public val CRYPT_E_NO_PROVIDER: Hresult = 0x80092006u.toInt()

public val CRYPT_E_NO_REVOCATION_CHECK: Hresult = 0x80092012u.toInt()

public val CRYPT_E_NO_REVOCATION_DLL: Hresult = 0x80092011u.toInt()

public val CRYPT_E_NO_SIGNER: Hresult = 0x8009200Eu.toInt()

public val CRYPT_E_NO_TRUSTED_SIGNER: Hresult = 0x8009202Bu.toInt()

public val CRYPT_E_NO_VERIFY_USAGE_CHECK: Hresult = 0x80092028u.toInt()

public val CRYPT_E_NO_VERIFY_USAGE_DLL: Hresult = 0x80092027u.toInt()

public val CRYPT_E_OBJECT_LOCATOR_OBJECT_NOT_FOUND: Hresult = 0x8009202Du.toInt()

public val CRYPT_E_OID_FORMAT: Hresult = 0x80091003u.toInt()

public val CRYPT_E_OSS_ERROR: Hresult = 0x80093000u.toInt()

public val CRYPT_E_PENDING_CLOSE: Hresult = 0x8009200Fu.toInt()

public val CRYPT_E_RECIPIENT_NOT_FOUND: Hresult = 0x8009100Bu.toInt()

public val CRYPT_E_REVOCATION_OFFLINE: Hresult = 0x80092013u.toInt()

public val CRYPT_E_REVOKED: Hresult = 0x80092010u.toInt()

public val CRYPT_E_SECURITY_SETTINGS: Hresult = 0x80092026u.toInt()

public val CRYPT_E_SELF_SIGNED: Hresult = 0x80092007u.toInt()

public val CRYPT_E_SIGNER_NOT_FOUND: Hresult = 0x8009100Eu.toInt()

public val CRYPT_E_STREAM_INSUFFICIENT_DATA: Hresult = 0x80091011u.toInt()

public val CRYPT_E_STREAM_MSG_NOT_READY: Hresult = 0x80091010u.toInt()

public val CRYPT_E_UNEXPECTED_ENCODING: Hresult = 0x80091005u.toInt()

public val CRYPT_E_UNEXPECTED_MSG_TYPE: Hresult = 0x8009200Au.toInt()

public val CRYPT_E_UNKNOWN_ALGO: Hresult = 0x80091002u.toInt()

public val CRYPT_E_VERIFY_USAGE_OFFLINE: Hresult = 0x80092029u.toInt()

public val CRYPT_I_NEW_PROTECTION_REQUIRED: Hresult = 0x91012u.toInt()

public val CS_E_ADMIN_LIMIT_EXCEEDED: Hresult = 0x8004016Du.toInt()

public val CS_E_CLASS_NOTFOUND: Hresult = 0x80040166u.toInt()

public val CS_E_FIRST: Int = -2147221148

public val CS_E_INTERNAL_ERROR: Hresult = 0x8004016Fu.toInt()

public val CS_E_INVALID_PATH: Hresult = 0x8004016Bu.toInt()

public val CS_E_INVALID_VERSION: Hresult = 0x80040167u.toInt()

public val CS_E_LAST: Int = -2147221137

public val CS_E_NETWORK_ERROR: Hresult = 0x8004016Cu.toInt()

public val CS_E_NOT_DELETABLE: Hresult = 0x80040165u.toInt()

public val CS_E_NO_CLASSSTORE: Hresult = 0x80040168u.toInt()

public val CS_E_OBJECT_ALREADY_EXISTS: Hresult = 0x8004016Au.toInt()

public val CS_E_OBJECT_NOTFOUND: Hresult = 0x80040169u.toInt()

public val CS_E_PACKAGE_NOTFOUND: Hresult = 0x80040164u.toInt()

public val CS_E_SCHEMA_MISMATCH: Hresult = 0x8004016Eu.toInt()

public val D2DERR_BAD_NUMBER: Hresult = 0x88990011u.toInt()

public val D2DERR_BITMAP_BOUND_AS_TARGET: Hresult = 0x88990025u.toInt()

public val D2DERR_BITMAP_CANNOT_DRAW: Hresult = 0x88990021u.toInt()

public val D2DERR_CYCLIC_GRAPH: Hresult = 0x88990020u.toInt()

public val D2DERR_DISPLAY_FORMAT_NOT_SUPPORTED: Hresult = 0x88990009u.toInt()

public val D2DERR_DISPLAY_STATE_INVALID: Hresult = 0x88990006u.toInt()

public val D2DERR_EFFECT_IS_NOT_REGISTERED: Hresult = 0x88990028u.toInt()

public val D2DERR_EXCEEDS_MAX_BITMAP_SIZE: Hresult = 0x8899001Du.toInt()

public val D2DERR_INCOMPATIBLE_BRUSH_TYPES: Hresult = 0x88990018u.toInt()

public val D2DERR_INSUFFICIENT_DEVICE_CAPABILITIES: Hresult = 0x88990026u.toInt()

public val D2DERR_INTERMEDIATE_TOO_LARGE: Hresult = 0x88990027u.toInt()

public val D2DERR_INTERNAL_ERROR: Hresult = 0x88990008u.toInt()

public val D2DERR_INVALID_CALL: Hresult = 0x8899000Au.toInt()

public val D2DERR_INVALID_GLYPH_IMAGE: Hresult = 0x8899002Eu.toInt()

public val D2DERR_INVALID_GRAPH_CONFIGURATION: Hresult = 0x8899001Eu.toInt()

public val D2DERR_INVALID_INTERNAL_GRAPH_CONFIGURATION: Hresult = 0x8899001Fu.toInt()

public val D2DERR_INVALID_PROPERTY: Hresult = 0x88990029u.toInt()

public val D2DERR_INVALID_TARGET: Hresult = 0x88990024u.toInt()

public val D2DERR_LAYER_ALREADY_IN_USE: Hresult = 0x88990013u.toInt()

public val D2DERR_MAX_TEXTURE_SIZE_EXCEEDED: Hresult = 0x8899000Fu.toInt()

public val D2DERR_NOT_INITIALIZED: Hresult = 0x88990002u.toInt()

public val D2DERR_NO_HARDWARE_DEVICE: Hresult = 0x8899000Bu.toInt()

public val D2DERR_NO_SUBPROPERTIES: Hresult = 0x8899002Au.toInt()

public val D2DERR_ORIGINAL_TARGET_NOT_BOUND: Hresult = 0x88990023u.toInt()

public val D2DERR_OUTSTANDING_BITMAP_REFERENCES: Hresult = 0x88990022u.toInt()

public val D2DERR_POP_CALL_DID_NOT_MATCH_PUSH: Hresult = 0x88990014u.toInt()

public val D2DERR_PRINT_FORMAT_NOT_SUPPORTED: Hresult = 0x8899002Cu.toInt()

public val D2DERR_PRINT_JOB_CLOSED: Hresult = 0x8899002Bu.toInt()

public val D2DERR_PUSH_POP_UNBALANCED: Hresult = 0x88990016u.toInt()

public val D2DERR_RECREATE_TARGET: Hresult = 0x8899000Cu.toInt()

public val D2DERR_RENDER_TARGET_HAS_LAYER_OR_CLIPRECT: Hresult = 0x88990017u.toInt()

public val D2DERR_SCANNER_FAILED: Hresult = 0x88990004u.toInt()

public val D2DERR_SCREEN_ACCESS_DENIED: Hresult = 0x88990005u.toInt()

public val D2DERR_SHADER_COMPILE_FAILED: Hresult = 0x8899000Eu.toInt()

public val D2DERR_TARGET_NOT_GDI_COMPATIBLE: Hresult = 0x8899001Au.toInt()

public val D2DERR_TEXT_EFFECT_IS_WRONG_TYPE: Hresult = 0x8899001Bu.toInt()

public val D2DERR_TEXT_RENDERER_NOT_RELEASED: Hresult = 0x8899001Cu.toInt()

public val D2DERR_TOO_MANY_SHADER_ELEMENTS: Hresult = 0x8899000Du.toInt()

public val D2DERR_TOO_MANY_TRANSFORM_INPUTS: Hresult = 0x8899002Du.toInt()

public val D2DERR_UNSUPPORTED_OPERATION: Hresult = 0x88990003u.toInt()

public val D2DERR_UNSUPPORTED_VERSION: Hresult = 0x88990010u.toInt()

public val D2DERR_WIN32_ERROR: Hresult = 0x88990019u.toInt()

public val D2DERR_WRONG_FACTORY: Hresult = 0x88990012u.toInt()

public val D2DERR_WRONG_RESOURCE_DOMAIN: Hresult = 0x88990015u.toInt()

public val D2DERR_WRONG_STATE: Hresult = 0x88990001u.toInt()

public val D2DERR_ZERO_VECTOR: Hresult = 0x88990007u.toInt()

public val D3D10_ERROR_FILE_NOT_FOUND: Hresult = 0x88790002u.toInt()

public val D3D10_ERROR_TOO_MANY_UNIQUE_STATE_OBJECTS: Hresult = 0x88790001u.toInt()

public val D3D11_ERROR_DEFERRED_CONTEXT_MAP_WITHOUT_INITIAL_DISCARD: Hresult = 0x887C0004u.toInt()

public val D3D11_ERROR_FILE_NOT_FOUND: Hresult = 0x887C0002u.toInt()

public val D3D11_ERROR_TOO_MANY_UNIQUE_STATE_OBJECTS: Hresult = 0x887C0001u.toInt()

public val D3D11_ERROR_TOO_MANY_UNIQUE_VIEW_OBJECTS: Hresult = 0x887C0003u.toInt()

public val D3D12_ERROR_ADAPTER_NOT_FOUND: Hresult = 0x887E0001u.toInt()

public val D3D12_ERROR_DRIVER_VERSION_MISMATCH: Hresult = 0x887E0002u.toInt()

public val D3D12_ERROR_INVALID_REDIST: Hresult = 0x887E0003u.toInt()

public val DATA_E_FIRST: Int = -2147221200

public val DATA_E_LAST: Int = -2147221185

public val DATA_S_FIRST: Int = 262448

public val DATA_S_LAST: Int = 262463

public val DATA_S_SAMEFORMATETC: Hresult = 0x40130u.toInt()

public val DBG_APP_NOT_IDLE: Ntstatus = 0xC0010002u.toInt()

public val DBG_COMMAND_EXCEPTION: Ntstatus = 0x40010009u.toInt()

public val DBG_CONTINUE: Ntstatus = 0x10002u.toInt()

public val DBG_CONTROL_BREAK: Ntstatus = 0x40010008u.toInt()

public val DBG_CONTROL_C: Ntstatus = 0x40010005u.toInt()

public val DBG_EXCEPTION_HANDLED: Ntstatus = 0x10001u.toInt()

public val DBG_EXCEPTION_NOT_HANDLED: Ntstatus = 0x80010001u.toInt()

public val DBG_NO_STATE_CHANGE: Ntstatus = 0xC0010001u.toInt()

public val DBG_PRINTEXCEPTION_C: Ntstatus = 0x40010006u.toInt()

public val DBG_PRINTEXCEPTION_WIDE_C: Ntstatus = 0x4001000Au.toInt()

public val DBG_REPLY_LATER: Ntstatus = 0x40010001u.toInt()

public val DBG_RIPEXCEPTION: Ntstatus = 0x40010007u.toInt()

public val DBG_TERMINATE_PROCESS: Ntstatus = 0x40010004u.toInt()

public val DBG_TERMINATE_THREAD: Ntstatus = 0x40010003u.toInt()

public val DBG_UNABLE_TO_PROVIDE_HANDLE: Ntstatus = 0x40010002u.toInt()

public val DCOMPOSITION_ERROR_SURFACE_BEING_RENDERED: Hresult = 0x88980801u.toInt()

public val DCOMPOSITION_ERROR_SURFACE_NOT_BEING_RENDERED: Hresult = 0x88980802u.toInt()

public val DCOMPOSITION_ERROR_WINDOW_ALREADY_COMPOSED: Hresult = 0x88980800u.toInt()

public val DIGSIG_E_CRYPTO: Hresult = 0x800B0008u.toInt()

public val DIGSIG_E_DECODE: Hresult = 0x800B0006u.toInt()

public val DIGSIG_E_ENCODE: Hresult = 0x800B0005u.toInt()

public val DIGSIG_E_EXTENSIBILITY: Hresult = 0x800B0007u.toInt()

public val DISP_E_ARRAYISLOCKED: Hresult = 0x8002000Du.toInt()

public val DISP_E_BADCALLEE: Hresult = 0x80020010u.toInt()

public val DISP_E_BADINDEX: Hresult = 0x8002000Bu.toInt()

public val DISP_E_BADPARAMCOUNT: Hresult = 0x8002000Eu.toInt()

public val DISP_E_BADVARTYPE: Hresult = 0x80020008u.toInt()

public val DISP_E_BUFFERTOOSMALL: Hresult = 0x80020013u.toInt()

public val DISP_E_DIVBYZERO: Hresult = 0x80020012u.toInt()

public val DISP_E_EXCEPTION: Hresult = 0x80020009u.toInt()

public val DISP_E_MEMBERNOTFOUND: Hresult = 0x80020003u.toInt()

public val DISP_E_NONAMEDARGS: Hresult = 0x80020007u.toInt()

public val DISP_E_NOTACOLLECTION: Hresult = 0x80020011u.toInt()

public val DISP_E_OVERFLOW: Hresult = 0x8002000Au.toInt()

public val DISP_E_PARAMNOTFOUND: Hresult = 0x80020004u.toInt()

public val DISP_E_PARAMNOTOPTIONAL: Hresult = 0x8002000Fu.toInt()

public val DISP_E_TYPEMISMATCH: Hresult = 0x80020005u.toInt()

public val DISP_E_UNKNOWNINTERFACE: Hresult = 0x80020001u.toInt()

public val DISP_E_UNKNOWNLCID: Hresult = 0x8002000Cu.toInt()

public val DISP_E_UNKNOWNNAME: Hresult = 0x80020006u.toInt()

public val DNS_ERROR_ADDRESS_REQUIRED: Win32Error = 9573u

public val DNS_ERROR_ALIAS_LOOP: Win32Error = 9722u

public val DNS_ERROR_AUTOZONE_ALREADY_EXISTS: Win32Error = 9610u

public val DNS_ERROR_AXFR: Win32Error = 9752u

public val DNS_ERROR_BACKGROUND_LOADING: Win32Error = 9568u

public val DNS_ERROR_BAD_KEYMASTER: Win32Error = 9122u

public val DNS_ERROR_BAD_PACKET: Win32Error = 9502u

public val DNS_ERROR_CANNOT_FIND_ROOT_HINTS: Win32Error = 9564u

public val DNS_ERROR_CLIENT_SUBNET_ALREADY_EXISTS: Win32Error = 9977u

public val DNS_ERROR_CLIENT_SUBNET_DOES_NOT_EXIST: Win32Error = 9976u

public val DNS_ERROR_CLIENT_SUBNET_IS_ACCESSED: Win32Error = 9975u

public val DNS_ERROR_CNAME_COLLISION: Win32Error = 9709u

public val DNS_ERROR_CNAME_LOOP: Win32Error = 9707u

public val DNS_ERROR_DATABASE_BASE: Win32Error = 9700u

public val DNS_ERROR_DATAFILE_BASE: Win32Error = 9650u

public val DNS_ERROR_DATAFILE_OPEN_FAILURE: Win32Error = 9653u

public val DNS_ERROR_DATAFILE_PARSING: Win32Error = 9655u

public val DNS_ERROR_DEFAULT_SCOPE: Win32Error = 9960u

public val DNS_ERROR_DEFAULT_VIRTUALIZATION_INSTANCE: Win32Error = 9925u

public val DNS_ERROR_DEFAULT_ZONESCOPE: Win32Error = 9953u

public val DNS_ERROR_DELEGATION_REQUIRED: Win32Error = 9571u

public val DNS_ERROR_DNAME_COLLISION: Win32Error = 9721u

public val DNS_ERROR_DNSSEC_BASE: Win32Error = 9100u

public val DNS_ERROR_DNSSEC_IS_DISABLED: Win32Error = 9125u

public val DNS_ERROR_DP_ALREADY_ENLISTED: Win32Error = 9904u

public val DNS_ERROR_DP_ALREADY_EXISTS: Win32Error = 9902u

public val DNS_ERROR_DP_BASE: Win32Error = 9900u

public val DNS_ERROR_DP_DOES_NOT_EXIST: Win32Error = 9901u

public val DNS_ERROR_DP_FSMO_ERROR: Win32Error = 9906u

public val DNS_ERROR_DP_NOT_AVAILABLE: Win32Error = 9905u

public val DNS_ERROR_DP_NOT_ENLISTED: Win32Error = 9903u

public val DNS_ERROR_DS_UNAVAILABLE: Win32Error = 9717u

public val DNS_ERROR_DS_ZONE_ALREADY_EXISTS: Win32Error = 9718u

public val DNS_ERROR_DWORD_VALUE_TOO_LARGE: Win32Error = 9567u

public val DNS_ERROR_DWORD_VALUE_TOO_SMALL: Win32Error = 9566u

public val DNS_ERROR_FILE_WRITEBACK_FAILED: Win32Error = 9654u

public val DNS_ERROR_FORWARDER_ALREADY_EXISTS: Win32Error = 9619u

public val DNS_ERROR_GENERAL_API_BASE: Win32Error = 9550u

public val DNS_ERROR_INCONSISTENT_ROOT_HINTS: Win32Error = 9565u

public val DNS_ERROR_INVAILD_VIRTUALIZATION_INSTANCE_NAME: Win32Error = 9924u

public val DNS_ERROR_INVALID_CLIENT_SUBNET_NAME: Win32Error = 9984u

public val DNS_ERROR_INVALID_DATA: Win32Error = 13u

public val DNS_ERROR_INVALID_DATAFILE_NAME: Win32Error = 9652u

public val DNS_ERROR_INVALID_INITIAL_ROLLOVER_OFFSET: Win32Error = 9115u

public val DNS_ERROR_INVALID_IP_ADDRESS: Win32Error = 9552u

public val DNS_ERROR_INVALID_KEY_SIZE: Win32Error = 9106u

public val DNS_ERROR_INVALID_NAME: Win32Error = 123u

public val DNS_ERROR_INVALID_NAME_CHAR: Win32Error = 9560u

public val DNS_ERROR_INVALID_NSEC3_ITERATION_COUNT: Win32Error = 9124u

public val DNS_ERROR_INVALID_POLICY_TABLE: Win32Error = 9572u

public val DNS_ERROR_INVALID_PROPERTY: Win32Error = 9553u

public val DNS_ERROR_INVALID_ROLLOVER_PERIOD: Win32Error = 9114u

public val DNS_ERROR_INVALID_SCOPE_NAME: Win32Error = 9958u

public val DNS_ERROR_INVALID_SCOPE_OPERATION: Win32Error = 9961u

public val DNS_ERROR_INVALID_SIGNATURE_VALIDITY_PERIOD: Win32Error = 9123u

public val DNS_ERROR_INVALID_TYPE: Win32Error = 9551u

public val DNS_ERROR_INVALID_XML: Win32Error = 9126u

public val DNS_ERROR_INVALID_ZONESCOPE_NAME: Win32Error = 9954u

public val DNS_ERROR_INVALID_ZONE_OPERATION: Win32Error = 9603u

public val DNS_ERROR_INVALID_ZONE_TYPE: Win32Error = 9611u

public val DNS_ERROR_KEYMASTER_REQUIRED: Win32Error = 9101u

public val DNS_ERROR_KSP_DOES_NOT_SUPPORT_PROTECTION: Win32Error = 9108u

public val DNS_ERROR_KSP_NOT_ACCESSIBLE: Win32Error = 9112u

public val DNS_ERROR_LOAD_ZONESCOPE_FAILED: Win32Error = 9956u

public val DNS_ERROR_MASK: Win32Error = 9000u

public val DNS_ERROR_NAME_DOES_NOT_EXIST: Win32Error = 9714u

public val DNS_ERROR_NAME_NOT_IN_ZONE: Win32Error = 9706u

public val DNS_ERROR_NBSTAT_INIT_FAILED: Win32Error = 9617u

public val DNS_ERROR_NEED_SECONDARY_ADDRESSES: Win32Error = 9614u

public val DNS_ERROR_NEED_WINS_SERVERS: Win32Error = 9616u

public val DNS_ERROR_NODE_CREATION_FAILED: Win32Error = 9703u

public val DNS_ERROR_NODE_IS_CNAME: Win32Error = 9708u

public val DNS_ERROR_NODE_IS_DNAME: Win32Error = 9720u

public val DNS_ERROR_NON_RFC_NAME: Win32Error = 9556u

public val DNS_ERROR_NOT_ALLOWED_ON_ACTIVE_SKD: Win32Error = 9119u

public val DNS_ERROR_NOT_ALLOWED_ON_RODC: Win32Error = 9569u

public val DNS_ERROR_NOT_ALLOWED_ON_ROOT_SERVER: Win32Error = 9562u

public val DNS_ERROR_NOT_ALLOWED_ON_SIGNED_ZONE: Win32Error = 9102u

public val DNS_ERROR_NOT_ALLOWED_ON_UNSIGNED_ZONE: Win32Error = 9121u

public val DNS_ERROR_NOT_ALLOWED_ON_ZSK: Win32Error = 9118u

public val DNS_ERROR_NOT_ALLOWED_UNDER_DELEGATION: Win32Error = 9563u

public val DNS_ERROR_NOT_ALLOWED_UNDER_DNAME: Win32Error = 9570u

public val DNS_ERROR_NOT_ALLOWED_WITH_ZONESCOPES: Win32Error = 9955u

public val DNS_ERROR_NOT_ENOUGH_SIGNING_KEY_DESCRIPTORS: Win32Error = 9104u

public val DNS_ERROR_NOT_UNIQUE: Win32Error = 9555u

public val DNS_ERROR_NO_BOOTFILE_IF_DS_ZONE: Win32Error = 9719u

public val DNS_ERROR_NO_CREATE_CACHE_DATA: Win32Error = 9713u

public val DNS_ERROR_NO_DNS_SERVERS: Win32Error = 9852u

public val DNS_ERROR_NO_MEMORY: Win32Error = 14u

public val DNS_ERROR_NO_PACKET: Win32Error = 9503u

public val DNS_ERROR_NO_TCPIP: Win32Error = 9851u

public val DNS_ERROR_NO_VALID_TRUST_ANCHORS: Win32Error = 9127u

public val DNS_ERROR_NO_ZONE_INFO: Win32Error = 9602u

public val DNS_ERROR_NSEC3_INCOMPATIBLE_WITH_RSA_SHA1: Win32Error = 9103u

public val DNS_ERROR_NSEC3_NAME_COLLISION: Win32Error = 9129u

public val DNS_ERROR_NSEC_INCOMPATIBLE_WITH_NSEC3_RSA_SHA1: Win32Error = 9130u

public val DNS_ERROR_NUMERIC_NAME: Win32Error = 9561u

public val DNS_ERROR_OPERATION_BASE: Win32Error = 9750u

public val DNS_ERROR_PACKET_FMT_BASE: Win32Error = 9500u

public val DNS_ERROR_POLICY_ALREADY_EXISTS: Win32Error = 9971u

public val DNS_ERROR_POLICY_DOES_NOT_EXIST: Win32Error = 9972u

public val DNS_ERROR_POLICY_INVALID_CRITERIA: Win32Error = 9973u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_CLIENT_SUBNET: Win32Error = 9990u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_FQDN: Win32Error = 9994u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_INTERFACE: Win32Error = 9993u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_NETWORK_PROTOCOL: Win32Error = 9992u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_QUERY_TYPE: Win32Error = 9995u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_TIME_OF_DAY: Win32Error = 9996u

public val DNS_ERROR_POLICY_INVALID_CRITERIA_TRANSPORT_PROTOCOL: Win32Error = 9991u

public val DNS_ERROR_POLICY_INVALID_NAME: Win32Error = 9982u

public val DNS_ERROR_POLICY_INVALID_SETTINGS: Win32Error = 9974u

public val DNS_ERROR_POLICY_INVALID_WEIGHT: Win32Error = 9981u

public val DNS_ERROR_POLICY_LOCKED: Win32Error = 9980u

public val DNS_ERROR_POLICY_MISSING_CRITERIA: Win32Error = 9983u

public val DNS_ERROR_POLICY_PROCESSING_ORDER_INVALID: Win32Error = 9985u

public val DNS_ERROR_POLICY_SCOPE_MISSING: Win32Error = 9986u

public val DNS_ERROR_POLICY_SCOPE_NOT_ALLOWED: Win32Error = 9987u

public val DNS_ERROR_PRIMARY_REQUIRES_DATAFILE: Win32Error = 9651u

public val DNS_ERROR_RCODE: Win32Error = 9504u

public val DNS_ERROR_RCODE_BADKEY: Win32Error = 9017u

public val DNS_ERROR_RCODE_BADSIG: Win32Error = 9016u

public val DNS_ERROR_RCODE_BADTIME: Win32Error = 9018u

public val DNS_ERROR_RCODE_FORMAT_ERROR: Win32Error = 9001u

public val DNS_ERROR_RCODE_LAST: Win32Error = 9018u

public val DNS_ERROR_RCODE_NAME_ERROR: Win32Error = 9003u

public val DNS_ERROR_RCODE_NOTAUTH: Win32Error = 9009u

public val DNS_ERROR_RCODE_NOTZONE: Win32Error = 9010u

public val DNS_ERROR_RCODE_NOT_IMPLEMENTED: Win32Error = 9004u

public val DNS_ERROR_RCODE_NO_ERROR: Win32Error = 0u

public val DNS_ERROR_RCODE_NXRRSET: Win32Error = 9008u

public val DNS_ERROR_RCODE_REFUSED: Win32Error = 9005u

public val DNS_ERROR_RCODE_SERVER_FAILURE: Win32Error = 9002u

public val DNS_ERROR_RCODE_YXDOMAIN: Win32Error = 9006u

public val DNS_ERROR_RCODE_YXRRSET: Win32Error = 9007u

public val DNS_ERROR_RECORD_ALREADY_EXISTS: Win32Error = 9711u

public val DNS_ERROR_RECORD_DOES_NOT_EXIST: Win32Error = 9701u

public val DNS_ERROR_RECORD_FORMAT: Win32Error = 9702u

public val DNS_ERROR_RECORD_ONLY_AT_ZONE_ROOT: Win32Error = 9710u

public val DNS_ERROR_RECORD_TIMED_OUT: Win32Error = 9705u

public val DNS_ERROR_RESPONSE_CODES_BASE: Win32Error = 9000u

public val DNS_ERROR_ROLLOVER_ALREADY_QUEUED: Win32Error = 9120u

public val DNS_ERROR_ROLLOVER_IN_PROGRESS: Win32Error = 9116u

public val DNS_ERROR_ROLLOVER_NOT_POKEABLE: Win32Error = 9128u

public val DNS_ERROR_RRL_INVALID_IPV4_PREFIX: Win32Error = 9913u

public val DNS_ERROR_RRL_INVALID_IPV6_PREFIX: Win32Error = 9914u

public val DNS_ERROR_RRL_INVALID_LEAK_RATE: Win32Error = 9916u

public val DNS_ERROR_RRL_INVALID_TC_RATE: Win32Error = 9915u

public val DNS_ERROR_RRL_INVALID_WINDOW_SIZE: Win32Error = 9912u

public val DNS_ERROR_RRL_LEAK_RATE_LESSTHAN_TC_RATE: Win32Error = 9917u

public val DNS_ERROR_RRL_NOT_ENABLED: Win32Error = 9911u

public val DNS_ERROR_SCOPE_ALREADY_EXISTS: Win32Error = 9963u

public val DNS_ERROR_SCOPE_DOES_NOT_EXIST: Win32Error = 9959u

public val DNS_ERROR_SCOPE_LOCKED: Win32Error = 9962u

public val DNS_ERROR_SECONDARY_DATA: Win32Error = 9712u

public val DNS_ERROR_SECONDARY_REQUIRES_MASTER_IP: Win32Error = 9612u

public val DNS_ERROR_SECURE_BASE: Win32Error = 9800u

public val DNS_ERROR_SERVERSCOPE_IS_REFERENCED: Win32Error = 9988u

public val DNS_ERROR_SETUP_BASE: Win32Error = 9850u

public val DNS_ERROR_SIGNING_KEY_NOT_ACCESSIBLE: Win32Error = 9107u

public val DNS_ERROR_SOA_DELETE_INVALID: Win32Error = 9618u

public val DNS_ERROR_STANDBY_KEY_NOT_PRESENT: Win32Error = 9117u

public val DNS_ERROR_SUBNET_ALREADY_EXISTS: Win32Error = 9979u

public val DNS_ERROR_SUBNET_DOES_NOT_EXIST: Win32Error = 9978u

public val DNS_ERROR_TOO_MANY_SKDS: Win32Error = 9113u

public val DNS_ERROR_TRY_AGAIN_LATER: Win32Error = 9554u

public val DNS_ERROR_UNEXPECTED_CNG_ERROR: Win32Error = 9110u

public val DNS_ERROR_UNEXPECTED_DATA_PROTECTION_ERROR: Win32Error = 9109u

public val DNS_ERROR_UNKNOWN_RECORD_TYPE: Win32Error = 9704u

public val DNS_ERROR_UNKNOWN_SIGNING_PARAMETER_VERSION: Win32Error = 9111u

public val DNS_ERROR_UNSECURE_PACKET: Win32Error = 9505u

public val DNS_ERROR_UNSUPPORTED_ALGORITHM: Win32Error = 9105u

public val DNS_ERROR_VIRTUALIZATION_INSTANCE_ALREADY_EXISTS: Win32Error = 9921u

public val DNS_ERROR_VIRTUALIZATION_INSTANCE_DOES_NOT_EXIST: Win32Error = 9922u

public val DNS_ERROR_VIRTUALIZATION_TREE_LOCKED: Win32Error = 9923u

public val DNS_ERROR_WINS_INIT_FAILED: Win32Error = 9615u

public val DNS_ERROR_ZONESCOPE_ALREADY_EXISTS: Win32Error = 9951u

public val DNS_ERROR_ZONESCOPE_DOES_NOT_EXIST: Win32Error = 9952u

public val DNS_ERROR_ZONESCOPE_FILE_WRITEBACK_FAILED: Win32Error = 9957u

public val DNS_ERROR_ZONESCOPE_IS_REFERENCED: Win32Error = 9989u

public val DNS_ERROR_ZONE_ALREADY_EXISTS: Win32Error = 9609u

public val DNS_ERROR_ZONE_BASE: Win32Error = 9600u

public val DNS_ERROR_ZONE_CONFIGURATION_ERROR: Win32Error = 9604u

public val DNS_ERROR_ZONE_CREATION_FAILED: Win32Error = 9608u

public val DNS_ERROR_ZONE_DOES_NOT_EXIST: Win32Error = 9601u

public val DNS_ERROR_ZONE_HAS_NO_NS_RECORDS: Win32Error = 9606u

public val DNS_ERROR_ZONE_HAS_NO_SOA_RECORD: Win32Error = 9605u

public val DNS_ERROR_ZONE_IS_SHUTDOWN: Win32Error = 9621u

public val DNS_ERROR_ZONE_LOCKED: Win32Error = 9607u

public val DNS_ERROR_ZONE_LOCKED_FOR_SIGNING: Win32Error = 9622u

public val DNS_ERROR_ZONE_NOT_SECONDARY: Win32Error = 9613u

public val DNS_ERROR_ZONE_REQUIRES_MASTER_IP: Win32Error = 9620u

public val DNS_INFO_ADDED_LOCAL_WINS: Int = 9753

public val DNS_INFO_AXFR_COMPLETE: Int = 9751

public val DNS_INFO_NO_RECORDS: Int = 9501

public val DNS_REQUEST_PENDING: Int = 9506

public val DNS_STATUS_CONTINUE_NEEDED: Int = 9801

public val DNS_STATUS_DOTTED_NAME: Int = 9558

public val DNS_STATUS_FQDN: Int = 9557

public val DNS_STATUS_SINGLE_PART_NAME: Int = 9559

public val DNS_WARNING_DOMAIN_UNDELETED: Int = 9716

public val DNS_WARNING_PTR_CREATE_FAILED: Int = 9715

public val DRAGDROP_E_ALREADYREGISTERED: Hresult = 0x80040101u.toInt()

public val DRAGDROP_E_CONCURRENT_DRAG_ATTEMPTED: Hresult = 0x80040103u.toInt()

public val DRAGDROP_E_FIRST: Int = -2147221248

public val DRAGDROP_E_INVALIDHWND: Hresult = 0x80040102u.toInt()

public val DRAGDROP_E_LAST: Int = -2147221233

public val DRAGDROP_E_NOTREGISTERED: Hresult = 0x80040100u.toInt()

public val DRAGDROP_S_CANCEL: Hresult = 0x40101u.toInt()

public val DRAGDROP_S_DROP: Hresult = 0x40100u.toInt()

public val DRAGDROP_S_FIRST: Int = 262400

public val DRAGDROP_S_LAST: Int = 262415

public val DRAGDROP_S_USEDEFAULTCURSORS: Hresult = 0x40102u.toInt()

public val DUPLICATE_CLOSE_SOURCE: DuplicateHandleOptions = 1u

public val DUPLICATE_SAME_ACCESS: DuplicateHandleOptions = 2u

public val DV_E_CLIPFORMAT: Hresult = 0x8004006Au.toInt()

public val DV_E_DVASPECT: Hresult = 0x8004006Bu.toInt()

public val DV_E_DVTARGETDEVICE: Hresult = 0x80040065u.toInt()

public val DV_E_DVTARGETDEVICE_SIZE: Hresult = 0x8004006Cu.toInt()

public val DV_E_FORMATETC: Hresult = 0x80040064u.toInt()

public val DV_E_LINDEX: Hresult = 0x80040068u.toInt()

public val DV_E_NOIVIEWOBJECT: Hresult = 0x8004006Du.toInt()

public val DV_E_STATDATA: Hresult = 0x80040067u.toInt()

public val DV_E_STGMEDIUM: Hresult = 0x80040066u.toInt()

public val DV_E_TYMED: Hresult = 0x80040069u.toInt()

public val DWMERR_CATASTROPHIC_FAILURE: Hresult = 0x88980702u.toInt()

public val DWMERR_STATE_TRANSITION_FAILED: Hresult = 0x88980700u.toInt()

public val DWMERR_THEME_FAILED: Hresult = 0x88980701u.toInt()

public val DWM_E_ADAPTER_NOT_FOUND: Hresult = 0x80263005u.toInt()

public val DWM_E_COMPOSITIONDISABLED: Hresult = 0x80263001u.toInt()

public val DWM_E_NOT_QUEUING_PRESENTS: Hresult = 0x80263004u.toInt()

public val DWM_E_NO_REDIRECTION_SURFACE_AVAILABLE: Hresult = 0x80263003u.toInt()

public val DWM_E_REMOTING_NOT_SUPPORTED: Hresult = 0x80263002u.toInt()

public val DWM_E_TEXTURE_TOO_LARGE: Hresult = 0x80263007u.toInt()

public val DWM_S_GDI_REDIRECTION_SURFACE: Hresult = 0x263005u.toInt()

public val DWM_S_GDI_REDIRECTION_SURFACE_BLT_VIA_GDI: Hresult = 0x263008u.toInt()

public val DWRITE_E_ALREADYREGISTERED: Hresult = 0x88985006u.toInt()

public val DWRITE_E_CACHEFORMAT: Hresult = 0x88985007u.toInt()

public val DWRITE_E_CACHEVERSION: Hresult = 0x88985008u.toInt()

public val DWRITE_E_FILEACCESS: Hresult = 0x88985004u.toInt()

public val DWRITE_E_FILEFORMAT: Hresult = 0x88985000u.toInt()

public val DWRITE_E_FILENOTFOUND: Hresult = 0x88985003u.toInt()

public val DWRITE_E_FLOWDIRECTIONCONFLICTS: Hresult = 0x8898500Bu.toInt()

public val DWRITE_E_FONTCOLLECTIONOBSOLETE: Hresult = 0x88985005u.toInt()

public val DWRITE_E_NOCOLOR: Hresult = 0x8898500Cu.toInt()

public val DWRITE_E_NOFONT: Hresult = 0x88985002u.toInt()

public val DWRITE_E_TEXTRENDERERINCOMPATIBLE: Hresult = 0x8898500Au.toInt()

public val DWRITE_E_UNEXPECTED: Hresult = 0x88985001u.toInt()

public val DWRITE_E_UNSUPPORTEDOPERATION: Hresult = 0x88985009u.toInt()

public val DXCORE_ERROR_EVENT_NOT_UNREGISTERED: Hresult = 0x88800001u.toInt()

public val DXGI_DDI_ERR_NONEXCLUSIVE: Hresult = 0x887B0003u.toInt()

public val DXGI_DDI_ERR_UNSUPPORTED: Hresult = 0x887B0002u.toInt()

public val DXGI_DDI_ERR_WASSTILLDRAWING: Hresult = 0x887B0001u.toInt()

public val DXGI_STATUS_CLIPPED: Hresult = 0x87A0002u.toInt()

public val DXGI_STATUS_DDA_WAS_STILL_DRAWING: Hresult = 0x87A000Au.toInt()

public val DXGI_STATUS_GRAPHICS_VIDPN_SOURCE_IN_USE: Hresult = 0x87A0006u.toInt()

public val DXGI_STATUS_MODE_CHANGED: Hresult = 0x87A0007u.toInt()

public val DXGI_STATUS_MODE_CHANGE_IN_PROGRESS: Hresult = 0x87A0008u.toInt()

public val DXGI_STATUS_NO_DESKTOP_ACCESS: Hresult = 0x87A0005u.toInt()

public val DXGI_STATUS_NO_REDIRECTION: Hresult = 0x87A0004u.toInt()

public val DXGI_STATUS_OCCLUDED: Hresult = 0x87A0001u.toInt()

public val DXGI_STATUS_PRESENT_REQUIRED: Hresult = 0x87A002Fu.toInt()

public val DXGI_STATUS_UNOCCLUDED: Hresult = 0x87A0009u.toInt()

public val EAS_E_ADMINS_CANNOT_CHANGE_PASSWORD: Hresult = 0x80550008u.toInt()

public val EAS_E_ADMINS_HAVE_BLANK_PASSWORD: Hresult = 0x80550007u.toInt()

public val EAS_E_CONNECTED_ADMINS_NEED_TO_CHANGE_PASSWORD: Hresult = 0x8055000Bu.toInt()

public val EAS_E_CURRENT_CONNECTED_USER_NEED_TO_CHANGE_PASSWORD: Hresult = 0x8055000Du.toInt()

public val EAS_E_CURRENT_USER_HAS_BLANK_PASSWORD: Hresult = 0x80550004u.toInt()

public val EAS_E_LOCAL_CONTROLLED_USERS_CANNOT_CHANGE_PASSWORD: Hresult = 0x80550009u.toInt()

public val EAS_E_PASSWORD_POLICY_NOT_ENFORCEABLE_FOR_CONNECTED_ADMINS: Hresult = 0x8055000Au.toInt()

public val EAS_E_PASSWORD_POLICY_NOT_ENFORCEABLE_FOR_CURRENT_CONNECTED_USER: Hresult = 0x8055000Cu.toInt()

public val EAS_E_POLICY_COMPLIANT_WITH_ACTIONS: Hresult = 0x80550002u.toInt()

public val EAS_E_POLICY_NOT_MANAGED_BY_OS: Hresult = 0x80550001u.toInt()

public val EAS_E_REQUESTED_POLICY_NOT_ENFORCEABLE: Hresult = 0x80550003u.toInt()

public val EAS_E_REQUESTED_POLICY_PASSWORD_EXPIRATION_INCOMPATIBLE: Hresult = 0x80550005u.toInt()

public val EAS_E_USER_CANNOT_CHANGE_PASSWORD: Hresult = 0x80550006u.toInt()

public val ENUM_E_FIRST: Int = -2147221072

public val ENUM_E_LAST: Int = -2147221057

public val ENUM_S_FIRST: Int = 262576

public val ENUM_S_LAST: Int = 262591

public val EPT_NT_CANT_CREATE: Ntstatus = 0xC002004Cu.toInt()

public val EPT_NT_CANT_PERFORM_OP: Ntstatus = 0xC0020035u.toInt()

public val EPT_NT_INVALID_ENTRY: Ntstatus = 0xC0020034u.toInt()

public val EPT_NT_NOT_REGISTERED: Ntstatus = 0xC0020036u.toInt()

public val ERROR_ABANDONED_WAIT_0: Win32Error = 735u

public val ERROR_ABANDONED_WAIT_63: Win32Error = 736u

public val ERROR_ABANDON_HIBERFILE: Win32Error = 787u

public val ERROR_ABIOS_ERROR: Win32Error = 538u

public val ERROR_ACCESS_AUDIT_BY_POLICY: Win32Error = 785u

public val ERROR_ACCESS_DENIED: Win32Error = 5u

public val ERROR_ACCESS_DENIED_APPDATA: Win32Error = 502u

public val ERROR_ACCESS_DISABLED_BY_POLICY: Win32Error = 1260u

public val ERROR_ACCESS_DISABLED_NO_SAFER_UI_BY_POLICY: Win32Error = 786u

public val ERROR_ACCESS_DISABLED_WEBBLADE: Win32Error = 1277u

public val ERROR_ACCESS_DISABLED_WEBBLADE_TAMPER: Win32Error = 1278u

public val ERROR_ACCOUNT_DISABLED: Win32Error = 1331u

public val ERROR_ACCOUNT_EXPIRED: Win32Error = 1793u

public val ERROR_ACCOUNT_LOCKED_OUT: Win32Error = 1909u

public val ERROR_ACCOUNT_RESTRICTION: Win32Error = 1327u

public val ERROR_ACPI_ERROR: Win32Error = 669u

public val ERROR_ACTIVATION_COUNT_EXCEEDED: Win32Error = 7059u

public val ERROR_ACTIVE_CONNECTIONS: Win32Error = 2402u

public val ERROR_ADAP_HDW_ERR: Win32Error = 57u

public val ERROR_ADDRESS_ALREADY_ASSOCIATED: Win32Error = 1227u

public val ERROR_ADDRESS_NOT_ASSOCIATED: Win32Error = 1228u

public val ERROR_ADVANCED_INSTALLER_FAILED: Win32Error = 14099u

public val ERROR_ALERTED: Win32Error = 739u

public val ERROR_ALIAS_EXISTS: Win32Error = 1379u

public val ERROR_ALLOCATE_BUCKET: Win32Error = 602u

public val ERROR_ALLOTTED_SPACE_EXCEEDED: Win32Error = 1344u

public val ERROR_ALLOWED_PORT_TYPE_RESTRICTION: UInt = 941u

public val ERROR_ALL_NODES_NOT_AVAILABLE: Win32Error = 5037u

public val ERROR_ALL_SIDS_FILTERED: Hresult = 0xC0090002u.toInt()

public val ERROR_ALL_USER_TRUST_QUOTA_EXCEEDED: Win32Error = 1933u

public val ERROR_ALREADY_ASSIGNED: Win32Error = 85u

public val ERROR_ALREADY_CONNECTED: UInt = 901u

public val ERROR_ALREADY_CONNECTING: UInt = 910u

public val ERROR_ALREADY_EXISTS: Win32Error = 183u

public val ERROR_ALREADY_FIBER: Win32Error = 1280u

public val ERROR_ALREADY_HAS_STREAM_ID: Win32Error = 4444u

public val ERROR_ALREADY_INITIALIZED: Win32Error = 1247u

public val ERROR_ALREADY_REGISTERED: Win32Error = 1242u

public val ERROR_ALREADY_RUNNING_LKG: Win32Error = 1074u

public val ERROR_ALREADY_THREAD: Win32Error = 1281u

public val ERROR_ALREADY_WAITING: Win32Error = 1904u

public val ERROR_ALREADY_WIN32: Win32Error = 719u

public val ERROR_AMBIGUOUS_SYSTEM_DEVICE: Win32Error = 15250u

public val ERROR_API_UNAVAILABLE: Win32Error = 15841u

public val ERROR_APPCONTAINER_REQUIRED: Win32Error = 4251u

public val ERROR_APPEXEC_APP_COMPAT_BLOCK: Win32Error = 3068u

public val ERROR_APPEXEC_CALLER_WAIT_TIMEOUT: Win32Error = 3069u

public val ERROR_APPEXEC_CALLER_WAIT_TIMEOUT_LICENSING: Win32Error = 3071u

public val ERROR_APPEXEC_CALLER_WAIT_TIMEOUT_RESOURCES: Win32Error = 3072u

public val ERROR_APPEXEC_CALLER_WAIT_TIMEOUT_TERMINATION: Win32Error = 3070u

public val ERROR_APPEXEC_CONDITION_NOT_SATISFIED: Win32Error = 3060u

public val ERROR_APPEXEC_HANDLE_INVALIDATED: Win32Error = 3061u

public val ERROR_APPEXEC_HOST_ID_MISMATCH: Win32Error = 3066u

public val ERROR_APPEXEC_INVALID_HOST_GENERATION: Win32Error = 3062u

public val ERROR_APPEXEC_INVALID_HOST_STATE: Win32Error = 3064u

public val ERROR_APPEXEC_NO_DONOR: Win32Error = 3065u

public val ERROR_APPEXEC_UNEXPECTED_PROCESS_REGISTRATION: Win32Error = 3063u

public val ERROR_APPEXEC_UNKNOWN_USER: Win32Error = 3067u

public val ERROR_APPHELP_BLOCK: Win32Error = 1259u

public val ERROR_APPINSTALLER_ACTIVATION_BLOCKED: Win32Error = 15646u

public val ERROR_APPINSTALLER_IS_MANAGED_BY_SYSTEM: Win32Error = 15672u

public val ERROR_APPINSTALLER_URI_IN_USE: Win32Error = 15671u

public val ERROR_APPX_FILE_NOT_ENCRYPTED: Win32Error = 409u

public val ERROR_APPX_INTEGRITY_FAILURE_CLR_NGEN: Win32Error = 15624u

public val ERROR_APPX_RAW_DATA_WRITE_FAILED: Win32Error = 15648u

public val ERROR_APP_DATA_CORRUPT: Win32Error = 4402u

public val ERROR_APP_DATA_EXPIRED: Win32Error = 4401u

public val ERROR_APP_DATA_LIMIT_EXCEEDED: Win32Error = 4403u

public val ERROR_APP_DATA_NOT_FOUND: Win32Error = 4400u

public val ERROR_APP_DATA_REBOOT_REQUIRED: Win32Error = 4404u

public val ERROR_APP_HANG: Win32Error = 1298u

public val ERROR_APP_INIT_FAILURE: Win32Error = 575u

public val ERROR_APP_WRONG_OS: Win32Error = 1151u

public val ERROR_ARBITRATION_UNHANDLED: Win32Error = 723u

public val ERROR_ARENA_TRASHED: Win32Error = 7u

public val ERROR_ARITHMETIC_OVERFLOW: Win32Error = 534u

public val ERROR_ASSERTION_FAILURE: Win32Error = 668u

public val ERROR_ATOMIC_LOCKS_NOT_SUPPORTED: Win32Error = 174u

public val ERROR_ATTRIBUTE_NOT_PRESENT: Hresult = 0x8083000Au.toInt()

public val ERROR_AUDITING_DISABLED: Hresult = 0xC0090001u.toInt()

public val ERROR_AUDIT_FAILED: Win32Error = 606u

public val ERROR_AUTHENTICATION_FIREWALL_FAILED: Win32Error = 1935u

public val ERROR_AUTHENTICATOR_MISMATCH: UInt = 955u

public val ERROR_AUTHENTICODE_DISALLOWED: Win32Error = 3758096960u

public val ERROR_AUTHENTICODE_PUBLISHER_NOT_TRUSTED: Win32Error = 3758096963u

public val ERROR_AUTHENTICODE_TRUSTED_PUBLISHER: Win32Error = 3758096961u

public val ERROR_AUTHENTICODE_TRUST_NOT_ESTABLISHED: Win32Error = 3758096962u

public val ERROR_AUTHIP_FAILURE: Win32Error = 1469u

public val ERROR_AUTH_PROTOCOL_REJECTED: UInt = 917u

public val ERROR_AUTH_PROTOCOL_RESTRICTION: UInt = 942u

public val ERROR_AUTH_SERVER_TIMEOUT: UInt = 930u

public val ERROR_AUTODATASEG_EXCEEDS_64K: Win32Error = 199u

public val ERROR_BACKUP_CONTROLLER: Win32Error = 586u

public val ERROR_BADDB: Win32Error = 1009u

public val ERROR_BADKEY: Win32Error = 1010u

public val ERROR_BADSTARTPOSITION: Win32Error = 778u

public val ERROR_BAD_ACCESSOR_FLAGS: Win32Error = 773u

public val ERROR_BAD_ARGUMENTS: Win32Error = 160u

public val ERROR_BAD_CLUSTERS: Win32Error = 6849u

public val ERROR_BAD_COMMAND: Win32Error = 22u

public val ERROR_BAD_COMPRESSION_BUFFER: Win32Error = 605u

public val ERROR_BAD_CONFIGURATION: Win32Error = 1610u

public val ERROR_BAD_CURRENT_DIRECTORY: Win32Error = 703u

public val ERROR_BAD_DESCRIPTOR_FORMAT: Win32Error = 1361u

public val ERROR_BAD_DEVICE: Win32Error = 1200u

public val ERROR_BAD_DEVICE_PATH: Win32Error = 330u

public val ERROR_BAD_DEV_TYPE: Win32Error = 66u

public val ERROR_BAD_DLL_ENTRYPOINT: Win32Error = 609u

public val ERROR_BAD_DRIVER: Win32Error = 2001u

public val ERROR_BAD_DRIVER_LEVEL: Win32Error = 119u

public val ERROR_BAD_ENVIRONMENT: Win32Error = 10u

public val ERROR_BAD_EXE_FORMAT: Win32Error = 193u

public val ERROR_BAD_FILE_TYPE: Win32Error = 222u

public val ERROR_BAD_FORMAT: Win32Error = 11u

public val ERROR_BAD_FUNCTION_TABLE: Win32Error = 559u

public val ERROR_BAD_IMPERSONATION_LEVEL: Win32Error = 1346u

public val ERROR_BAD_INHERITANCE_ACL: Win32Error = 1340u

public val ERROR_BAD_INTERFACE_INSTALLSECT: Win32Error = 3758096925u

public val ERROR_BAD_LENGTH: Win32Error = 24u

public val ERROR_BAD_LOGON_SESSION_STATE: Win32Error = 1365u

public val ERROR_BAD_MCFG_TABLE: Win32Error = 791u

public val ERROR_BAD_NETPATH: Win32Error = 53u

public val ERROR_BAD_NET_NAME: Win32Error = 67u

public val ERROR_BAD_NET_RESP: Win32Error = 58u

public val ERROR_BAD_PATHNAME: Win32Error = 161u

public val ERROR_BAD_PIPE: Win32Error = 230u

public val ERROR_BAD_PROFILE: Win32Error = 1206u

public val ERROR_BAD_PROVIDER: Win32Error = 1204u

public val ERROR_BAD_QUERY_SYNTAX: Win32Error = 1615u

public val ERROR_BAD_RECOVERY_POLICY: Win32Error = 6012u

public val ERROR_BAD_REM_ADAP: Win32Error = 60u

public val ERROR_BAD_SECTION_NAME_LINE: Win32Error = 3758096385u

public val ERROR_BAD_SERVICE_ENTRYPOINT: Win32Error = 610u

public val ERROR_BAD_SERVICE_INSTALLSECT: Win32Error = 3758096919u

public val ERROR_BAD_STACK: Win32Error = 543u

public val ERROR_BAD_THREADID_ADDR: Win32Error = 159u

public val ERROR_BAD_TOKEN_TYPE: Win32Error = 1349u

public val ERROR_BAD_UNIT: Win32Error = 20u

public val ERROR_BAD_USERNAME: Win32Error = 2202u

public val ERROR_BAD_USER_PROFILE: Win32Error = 1253u

public val ERROR_BAD_VALIDATION_CLASS: Win32Error = 1348u

public val ERROR_BAP_DISCONNECTED: UInt = 936u

public val ERROR_BAP_REQUIRED: UInt = 943u

public val ERROR_BCD_NOT_ALL_ENTRIES_IMPORTED: Win32Error = 2151219201u

public val ERROR_BCD_NOT_ALL_ENTRIES_SYNCHRONIZED: Win32Error = 2151219203u

public val ERROR_BCD_TOO_MANY_ELEMENTS: Win32Error = 3224961026u

public val ERROR_BEGINNING_OF_MEDIA: Win32Error = 1102u

public val ERROR_BEYOND_VDL: Win32Error = 1289u

public val ERROR_BIOS_FAILED_TO_CONNECT_INTERRUPT: Win32Error = 585u

public val ERROR_BIZRULES_NOT_ENABLED: Hresult = 0xC0090003u.toInt()

public val ERROR_BLOCKED_BY_PARENTAL_CONTROLS: Win32Error = 346u

public val ERROR_BLOCK_SHARED: Win32Error = 514u

public val ERROR_BLOCK_SOURCE_WEAK_REFERENCE_INVALID: Win32Error = 512u

public val ERROR_BLOCK_TARGET_WEAK_REFERENCE_INVALID: Win32Error = 513u

public val ERROR_BLOCK_TOO_MANY_REFERENCES: Win32Error = 347u

public val ERROR_BLOCK_WEAK_REFERENCE_INVALID: Win32Error = 511u

public val ERROR_BOOT_ALREADY_ACCEPTED: Win32Error = 1076u

public val ERROR_BROKEN_PIPE: Win32Error = 109u

public val ERROR_BUFFER_ALL_ZEROS: Win32Error = 754u

public val ERROR_BUFFER_OVERFLOW: Win32Error = 111u

public val ERROR_BUSY: Win32Error = 170u

public val ERROR_BUSY_DRIVE: Win32Error = 142u

public val ERROR_BUS_RESET: Win32Error = 1111u

public val ERROR_BYPASSIO_FLT_NOT_SUPPORTED: Win32Error = 506u

public val ERROR_CACHE_PAGE_LOCKED: Win32Error = 752u

public val ERROR_CALLBACK_INVOKE_INLINE: Win32Error = 812u

public val ERROR_CALLBACK_POP_STACK: Win32Error = 768u

public val ERROR_CALLBACK_SUPPLIED_INVALID_DATA: Win32Error = 1273u

public val ERROR_CALL_NOT_IMPLEMENTED: Win32Error = 120u

public val ERROR_CANCELLED: Win32Error = 1223u

public val ERROR_CANCEL_VIOLATION: Win32Error = 173u

public val ERROR_CANNOT_ABORT_TRANSACTIONS: Win32Error = 6848u

public val ERROR_CANNOT_ACCEPT_TRANSACTED_WORK: Win32Error = 6847u

public val ERROR_CANNOT_BREAK_OPLOCK: Win32Error = 802u

public val ERROR_CANNOT_COPY: Win32Error = 266u

public val ERROR_CANNOT_DETECT_DRIVER_FAILURE: Win32Error = 1080u

public val ERROR_CANNOT_DETECT_PROCESS_ABORT: Win32Error = 1081u

public val ERROR_CANNOT_EXECUTE_FILE_IN_TRANSACTION: Win32Error = 6838u

public val ERROR_CANNOT_FIND_WND_CLASS: Win32Error = 1407u

public val ERROR_CANNOT_GRANT_REQUESTED_OPLOCK: Win32Error = 801u

public val ERROR_CANNOT_IMPERSONATE: Win32Error = 1368u

public val ERROR_CANNOT_LOAD_REGISTRY_FILE: Win32Error = 589u

public val ERROR_CANNOT_MAKE: Win32Error = 82u

public val ERROR_CANNOT_OPEN_PROFILE: Win32Error = 1205u

public val ERROR_CANNOT_SWITCH_RUNLEVEL: Win32Error = 15400u

public val ERROR_CANTFETCHBACKWARDS: Win32Error = 770u

public val ERROR_CANTOPEN: Win32Error = 1011u

public val ERROR_CANTREAD: Win32Error = 1012u

public val ERROR_CANTSCROLLBACKWARDS: Win32Error = 771u

public val ERROR_CANTWRITE: Win32Error = 1013u

public val ERROR_CANT_ACCESS_DOMAIN_INFO: Win32Error = 1351u

public val ERROR_CANT_ACCESS_FILE: Win32Error = 1920u

public val ERROR_CANT_ATTACH_TO_DEV_VOLUME: Win32Error = 478u

public val ERROR_CANT_BREAK_TRANSACTIONAL_DEPENDENCY: Win32Error = 6824u

public val ERROR_CANT_CLEAR_ENCRYPTION_FLAG: Win32Error = 432u

public val ERROR_CANT_CREATE_MORE_STREAM_MINIVERSIONS: Win32Error = 6812u

public val ERROR_CANT_CROSS_RM_BOUNDARY: Win32Error = 6825u

public val ERROR_CANT_DELETE_LAST_ITEM: Win32Error = 4335u

public val ERROR_CANT_DISABLE_MANDATORY: Win32Error = 1310u

public val ERROR_CANT_ENABLE_DENY_ONLY: Win32Error = 629u

public val ERROR_CANT_EVICT_ACTIVE_NODE: Win32Error = 5009u

public val ERROR_CANT_LOAD_CLASS_ICON: Win32Error = 3758096908u

public val ERROR_CANT_OPEN_ANONYMOUS: Win32Error = 1347u

public val ERROR_CANT_OPEN_MINIVERSION_WITH_MODIFY_INTENT: Win32Error = 6811u

public val ERROR_CANT_RECOVER_WITH_HANDLE_OPEN: Win32Error = 6818u

public val ERROR_CANT_REMOVE_DEVINST: Win32Error = 3758096946u

public val ERROR_CANT_RESOLVE_FILENAME: Win32Error = 1921u

public val ERROR_CANT_TERMINATE_SELF: Win32Error = 555u

public val ERROR_CANT_WAIT: Win32Error = 554u

public val ERROR_CAN_NOT_COMPLETE: Win32Error = 1003u

public val ERROR_CAN_NOT_DEL_LOCAL_WINS: Win32Error = 4001u

public val ERROR_CAPAUTHZ_CHANGE_TYPE: Win32Error = 451u

public val ERROR_CAPAUTHZ_DB_CORRUPTED: Win32Error = 455u

public val ERROR_CAPAUTHZ_NOT_AUTHORIZED: Win32Error = 453u

public val ERROR_CAPAUTHZ_NOT_DEVUNLOCKED: Win32Error = 450u

public val ERROR_CAPAUTHZ_NOT_PROVISIONED: Win32Error = 452u

public val ERROR_CAPAUTHZ_NO_POLICY: Win32Error = 454u

public val ERROR_CAPAUTHZ_SCCD_DEV_MODE_REQUIRED: Win32Error = 459u

public val ERROR_CAPAUTHZ_SCCD_INVALID_CATALOG: Win32Error = 456u

public val ERROR_CAPAUTHZ_SCCD_NO_AUTH_ENTITY: Win32Error = 457u

public val ERROR_CAPAUTHZ_SCCD_NO_CAPABILITY_MATCH: Win32Error = 460u

public val ERROR_CAPAUTHZ_SCCD_PARSE_ERROR: Win32Error = 458u

public val ERROR_CARDBUS_NOT_SUPPORTED: Win32Error = 724u

public val ERROR_CASE_DIFFERING_NAMES_IN_DIR: Win32Error = 424u

public val ERROR_CASE_SENSITIVE_PATH: Win32Error = 442u

public val ERROR_CERTIFICATE_VALIDATION_PREFERENCE_CONFLICT: Win32Error = 817u

public val ERROR_CHECKING_FILE_SYSTEM: Win32Error = 712u

public val ERROR_CHECKOUT_REQUIRED: Win32Error = 221u

public val ERROR_CHILD_MUST_BE_VOLATILE: Win32Error = 1021u

public val ERROR_CHILD_NOT_COMPLETE: Win32Error = 129u

public val ERROR_CHILD_PROCESS_BLOCKED: Win32Error = 367u

public val ERROR_CHILD_WINDOW_MENU: Win32Error = 1436u

public val ERROR_CIMFS_IMAGE_CORRUPT: Win32Error = 470u

public val ERROR_CIMFS_IMAGE_VERSION_NOT_SUPPORTED: Win32Error = 471u

public val ERROR_CIRCULAR_DEPENDENCY: Win32Error = 1059u

public val ERROR_CLASSIC_COMPAT_MODE_NOT_ALLOWED: Win32Error = 15667u

public val ERROR_CLASS_ALREADY_EXISTS: Win32Error = 1410u

public val ERROR_CLASS_DOES_NOT_EXIST: Win32Error = 1411u

public val ERROR_CLASS_HAS_WINDOWS: Win32Error = 1412u

public val ERROR_CLASS_MISMATCH: Win32Error = 3758096897u

public val ERROR_CLEANER_CARTRIDGE_INSTALLED: Win32Error = 4340u

public val ERROR_CLEANER_CARTRIDGE_SPENT: Win32Error = 4333u

public val ERROR_CLEANER_SLOT_NOT_SET: Win32Error = 4332u

public val ERROR_CLEANER_SLOT_SET: Win32Error = 4331u

public val ERROR_CLIENT_INTERFACE_ALREADY_EXISTS: UInt = 915u

public val ERROR_CLIENT_SERVER_PARAMETERS_INVALID: Win32Error = 597u

public val ERROR_CLIPBOARD_NOT_OPEN: Win32Error = 1418u

public val ERROR_CLIPPING_NOT_SUPPORTED: Win32Error = 2005u

public val ERROR_CLIP_DEVICE_LICENSE_MISSING: Hresult = 0xC0EA0003u.toInt()

public val ERROR_CLIP_KEYHOLDER_LICENSE_MISSING_OR_INVALID: Hresult = 0xC0EA0005u.toInt()

public val ERROR_CLIP_LICENSE_DEVICE_ID_MISMATCH: Hresult = 0xC0EA000Au.toInt()

public val ERROR_CLIP_LICENSE_EXPIRED: Hresult = 0xC0EA0006u.toInt()

public val ERROR_CLIP_LICENSE_HARDWARE_ID_OUT_OF_TOLERANCE: Hresult = 0xC0EA0009u.toInt()

public val ERROR_CLIP_LICENSE_INVALID_SIGNATURE: Hresult = 0xC0EA0004u.toInt()

public val ERROR_CLIP_LICENSE_NOT_FOUND: Hresult = 0xC0EA0002u.toInt()

public val ERROR_CLIP_LICENSE_NOT_SIGNED: Hresult = 0xC0EA0008u.toInt()

public val ERROR_CLIP_LICENSE_SIGNED_BY_UNKNOWN_SOURCE: Hresult = 0xC0EA0007u.toInt()

public val ERROR_CLOUD_FILE_ACCESS_DENIED: Win32Error = 395u

public val ERROR_CLOUD_FILE_ALREADY_CONNECTED: Win32Error = 378u

public val ERROR_CLOUD_FILE_AUTHENTICATION_FAILED: Win32Error = 386u

public val ERROR_CLOUD_FILE_CONNECTED_PROVIDER_ONLY: Win32Error = 382u

public val ERROR_CLOUD_FILE_DEHYDRATION_DISALLOWED: Win32Error = 434u

public val ERROR_CLOUD_FILE_INCOMPATIBLE_HARDLINKS: Win32Error = 396u

public val ERROR_CLOUD_FILE_INSUFFICIENT_RESOURCES: Win32Error = 387u

public val ERROR_CLOUD_FILE_INVALID_REQUEST: Win32Error = 380u

public val ERROR_CLOUD_FILE_IN_USE: Win32Error = 391u

public val ERROR_CLOUD_FILE_METADATA_CORRUPT: Win32Error = 363u

public val ERROR_CLOUD_FILE_METADATA_TOO_LARGE: Win32Error = 364u

public val ERROR_CLOUD_FILE_NETWORK_UNAVAILABLE: Win32Error = 388u

public val ERROR_CLOUD_FILE_NOT_IN_SYNC: Win32Error = 377u

public val ERROR_CLOUD_FILE_NOT_SUPPORTED: Win32Error = 379u

public val ERROR_CLOUD_FILE_NOT_UNDER_SYNC_ROOT: Win32Error = 390u

public val ERROR_CLOUD_FILE_PINNED: Win32Error = 392u

public val ERROR_CLOUD_FILE_PROPERTY_BLOB_CHECKSUM_MISMATCH: Win32Error = 366u

public val ERROR_CLOUD_FILE_PROPERTY_BLOB_TOO_LARGE: Win32Error = 365u

public val ERROR_CLOUD_FILE_PROPERTY_CORRUPT: Win32Error = 394u

public val ERROR_CLOUD_FILE_PROPERTY_LOCK_CONFLICT: Win32Error = 397u

public val ERROR_CLOUD_FILE_PROPERTY_VERSION_NOT_SUPPORTED: Win32Error = 375u

public val ERROR_CLOUD_FILE_PROVIDER_NOT_RUNNING: Win32Error = 362u

public val ERROR_CLOUD_FILE_PROVIDER_TERMINATED: Win32Error = 404u

public val ERROR_CLOUD_FILE_READ_ONLY_VOLUME: Win32Error = 381u

public val ERROR_CLOUD_FILE_REQUEST_ABORTED: Win32Error = 393u

public val ERROR_CLOUD_FILE_REQUEST_CANCELED: Win32Error = 398u

public val ERROR_CLOUD_FILE_REQUEST_TIMEOUT: Win32Error = 426u

public val ERROR_CLOUD_FILE_SYNC_ROOT_METADATA_CORRUPT: Win32Error = 358u

public val ERROR_CLOUD_FILE_TOO_MANY_PROPERTY_BLOBS: Win32Error = 374u

public val ERROR_CLOUD_FILE_UNSUCCESSFUL: Win32Error = 389u

public val ERROR_CLOUD_FILE_US_MESSAGE_TIMEOUT: Win32Error = 475u

public val ERROR_CLOUD_FILE_VALIDATION_FAILED: Win32Error = 383u

public val ERROR_CLUSCFG_ALREADY_COMMITTED: Win32Error = 5901u

public val ERROR_CLUSCFG_ROLLBACK_FAILED: Win32Error = 5902u

public val ERROR_CLUSCFG_SYSTEM_DISK_DRIVE_LETTER_CONFLICT: Win32Error = 5903u

public val ERROR_CLUSTERLOG_CHKPOINT_NOT_FOUND: Win32Error = 5032u

public val ERROR_CLUSTERLOG_CORRUPT: Win32Error = 5029u

public val ERROR_CLUSTERLOG_EXCEEDS_MAXSIZE: Win32Error = 5031u

public val ERROR_CLUSTERLOG_NOT_ENOUGH_SPACE: Win32Error = 5033u

public val ERROR_CLUSTERLOG_RECORD_EXCEEDS_MAXSIZE: Win32Error = 5030u

public val ERROR_CLUSTERSET_MANAGEMENT_CLUSTER_UNREACHABLE: Win32Error = 5999u

public val ERROR_CLUSTER_AFFINITY_CONFLICT: Win32Error = 5971u

public val ERROR_CLUSTER_BACKUP_IN_PROGRESS: Win32Error = 5949u

public val ERROR_CLUSTER_CANNOT_RETURN_PROPERTIES: Win32Error = 5968u

public val ERROR_CLUSTER_CANT_CREATE_DUP_CLUSTER_NAME: Win32Error = 5900u

public val ERROR_CLUSTER_CANT_DESERIALIZE_DATA: Win32Error = 5923u

public val ERROR_CLUSTER_CSV_INVALID_HANDLE: Win32Error = 5989u

public val ERROR_CLUSTER_CSV_IO_PAUSE_TIMEOUT: Win32Error = 5979u

public val ERROR_CLUSTER_CSV_SUPPORTED_ONLY_ON_COORDINATOR: Win32Error = 5990u

public val ERROR_CLUSTER_DATABASE_SEQMISMATCH: Win32Error = 5083u

public val ERROR_CLUSTER_DATABASE_TRANSACTION_IN_PROGRESS: Win32Error = 5918u

public val ERROR_CLUSTER_DATABASE_TRANSACTION_NOT_IN_PROGRESS: Win32Error = 5919u

public val ERROR_CLUSTER_DATABASE_UPDATE_CONDITION_FAILED: Win32Error = 5986u

public val ERROR_CLUSTER_DISK_NOT_CONNECTED: Win32Error = 5963u

public val ERROR_CLUSTER_EVICT_INVALID_REQUEST: Win32Error = 5939u

public val ERROR_CLUSTER_EVICT_WITHOUT_CLEANUP: Win32Error = 5896u

public val ERROR_CLUSTER_FAULT_DOMAIN_FAILED_S2D_VALIDATION: Win32Error = 5996u

public val ERROR_CLUSTER_FAULT_DOMAIN_INVALID_HIERARCHY: Win32Error = 5995u

public val ERROR_CLUSTER_FAULT_DOMAIN_PARENT_NOT_FOUND: Win32Error = 5994u

public val ERROR_CLUSTER_FAULT_DOMAIN_S2D_CONNECTIVITY_LOSS: Win32Error = 5997u

public val ERROR_CLUSTER_GROUP_BUSY: Win32Error = 5944u

public val ERROR_CLUSTER_GROUP_MOVING: Win32Error = 5908u

public val ERROR_CLUSTER_GROUP_QUEUED: Win32Error = 5959u

public val ERROR_CLUSTER_GROUP_SINGLETON_RESOURCE: Win32Error = 5941u

public val ERROR_CLUSTER_GUM_NOT_LOCKER: Win32Error = 5085u

public val ERROR_CLUSTER_INCOMPATIBLE_VERSIONS: Win32Error = 5075u

public val ERROR_CLUSTER_INSTANCE_ID_MISMATCH: Win32Error = 5893u

public val ERROR_CLUSTER_INTERNAL_INVALID_FUNCTION: Win32Error = 5912u

public val ERROR_CLUSTER_INVALID_INFRASTRUCTURE_FILESERVER_NAME: Win32Error = 5998u

public val ERROR_CLUSTER_INVALID_IPV6_NETWORK: Win32Error = 5926u

public val ERROR_CLUSTER_INVALID_IPV6_TUNNEL_NETWORK: Win32Error = 5927u

public val ERROR_CLUSTER_INVALID_NETWORK: Win32Error = 5054u

public val ERROR_CLUSTER_INVALID_NETWORK_PROVIDER: Win32Error = 5049u

public val ERROR_CLUSTER_INVALID_NODE: Win32Error = 5039u

public val ERROR_CLUSTER_INVALID_NODE_WEIGHT: Win32Error = 5954u

public val ERROR_CLUSTER_INVALID_REQUEST: Win32Error = 5048u

public val ERROR_CLUSTER_INVALID_SECURITY_DESCRIPTOR: Win32Error = 5946u

public val ERROR_CLUSTER_INVALID_STRING_FORMAT: Win32Error = 5917u

public val ERROR_CLUSTER_INVALID_STRING_TERMINATION: Win32Error = 5916u

public val ERROR_CLUSTER_IPADDR_IN_USE: Win32Error = 5057u

public val ERROR_CLUSTER_JOIN_ABORTED: Win32Error = 5074u

public val ERROR_CLUSTER_JOIN_IN_PROGRESS: Win32Error = 5041u

public val ERROR_CLUSTER_JOIN_NOT_IN_PROGRESS: Win32Error = 5053u

public val ERROR_CLUSTER_LAST_INTERNAL_NETWORK: Win32Error = 5066u

public val ERROR_CLUSTER_LOCAL_NODE_NOT_FOUND: Win32Error = 5043u

public val ERROR_CLUSTER_MAXNUM_OF_RESOURCES_EXCEEDED: Win32Error = 5076u

public val ERROR_CLUSTER_MAX_NODES_IN_CLUSTER: Win32Error = 5934u

public val ERROR_CLUSTER_MEMBERSHIP_HALT: Win32Error = 5892u

public val ERROR_CLUSTER_MEMBERSHIP_INVALID_STATE: Win32Error = 5890u

public val ERROR_CLUSTER_MISMATCHED_COMPUTER_ACCT_NAME: Win32Error = 5905u

public val ERROR_CLUSTER_NETINTERFACE_EXISTS: Win32Error = 5046u

public val ERROR_CLUSTER_NETINTERFACE_NOT_FOUND: Win32Error = 5047u

public val ERROR_CLUSTER_NETWORK_ALREADY_OFFLINE: Win32Error = 5064u

public val ERROR_CLUSTER_NETWORK_ALREADY_ONLINE: Win32Error = 5063u

public val ERROR_CLUSTER_NETWORK_EXISTS: Win32Error = 5044u

public val ERROR_CLUSTER_NETWORK_HAS_DEPENDENTS: Win32Error = 5067u

public val ERROR_CLUSTER_NETWORK_NOT_FOUND: Win32Error = 5045u

public val ERROR_CLUSTER_NETWORK_NOT_FOUND_FOR_IP: Win32Error = 5894u

public val ERROR_CLUSTER_NETWORK_NOT_INTERNAL: Win32Error = 5060u

public val ERROR_CLUSTER_NODE_ALREADY_DOWN: Win32Error = 5062u

public val ERROR_CLUSTER_NODE_ALREADY_HAS_DFS_ROOT: Win32Error = 5088u

public val ERROR_CLUSTER_NODE_ALREADY_MEMBER: Win32Error = 5065u

public val ERROR_CLUSTER_NODE_ALREADY_UP: Win32Error = 5061u

public val ERROR_CLUSTER_NODE_DOWN: Win32Error = 5050u

public val ERROR_CLUSTER_NODE_DRAIN_IN_PROGRESS: Win32Error = 5962u

public val ERROR_CLUSTER_NODE_EXISTS: Win32Error = 5040u

public val ERROR_CLUSTER_NODE_IN_GRACE_PERIOD: Win32Error = 5978u

public val ERROR_CLUSTER_NODE_ISOLATED: Win32Error = 5984u

public val ERROR_CLUSTER_NODE_NOT_FOUND: Win32Error = 5042u

public val ERROR_CLUSTER_NODE_NOT_MEMBER: Win32Error = 5052u

public val ERROR_CLUSTER_NODE_NOT_PAUSED: Win32Error = 5058u

public val ERROR_CLUSTER_NODE_NOT_READY: Win32Error = 5072u

public val ERROR_CLUSTER_NODE_PAUSED: Win32Error = 5070u

public val ERROR_CLUSTER_NODE_QUARANTINED: Win32Error = 5985u

public val ERROR_CLUSTER_NODE_SHUTTING_DOWN: Win32Error = 5073u

public val ERROR_CLUSTER_NODE_UNREACHABLE: Win32Error = 5051u

public val ERROR_CLUSTER_NODE_UP: Win32Error = 5056u

public val ERROR_CLUSTER_NOT_INSTALLED: Win32Error = 5932u

public val ERROR_CLUSTER_NOT_SHARED_VOLUME: Win32Error = 5945u

public val ERROR_CLUSTER_NO_NET_ADAPTERS: Win32Error = 5906u

public val ERROR_CLUSTER_NO_QUORUM: Win32Error = 5925u

public val ERROR_CLUSTER_NO_RPC_PACKAGES_REGISTERED: Win32Error = 5081u

public val ERROR_CLUSTER_NO_SECURITY_CONTEXT: Win32Error = 5059u

public val ERROR_CLUSTER_NULL_DATA: Win32Error = 5920u

public val ERROR_CLUSTER_OBJECT_ALREADY_USED: Win32Error = 5936u

public val ERROR_CLUSTER_OBJECT_IS_CLUSTER_SET_VM: Win32Error = 6250u

public val ERROR_CLUSTER_OLD_VERSION: Win32Error = 5904u

public val ERROR_CLUSTER_OWNER_NOT_IN_PREFLIST: Win32Error = 5082u

public val ERROR_CLUSTER_PARAMETER_MISMATCH: Win32Error = 5897u

public val ERROR_CLUSTER_PARAMETER_OUT_OF_BOUNDS: Win32Error = 5913u

public val ERROR_CLUSTER_PARTIAL_READ: Win32Error = 5921u

public val ERROR_CLUSTER_PARTIAL_SEND: Win32Error = 5914u

public val ERROR_CLUSTER_PARTIAL_WRITE: Win32Error = 5922u

public val ERROR_CLUSTER_POISONED: Win32Error = 5907u

public val ERROR_CLUSTER_PROPERTY_DATA_TYPE_MISMATCH: Win32Error = 5895u

public val ERROR_CLUSTER_QUORUMLOG_NOT_FOUND: Win32Error = 5891u

public val ERROR_CLUSTER_REGISTRY_INVALID_FUNCTION: Win32Error = 5915u

public val ERROR_CLUSTER_RESNAME_NOT_FOUND: Win32Error = 5080u

public val ERROR_CLUSTER_RESOURCES_MUST_BE_ONLINE_ON_THE_SAME_NODE: Win32Error = 5933u

public val ERROR_CLUSTER_RESOURCE_CONFIGURATION_ERROR: Win32Error = 5943u

public val ERROR_CLUSTER_RESOURCE_CONTAINS_UNSUPPORTED_DIFF_AREA_FOR_SHARED_VOLUMES: Win32Error = 5969u

public val ERROR_CLUSTER_RESOURCE_DOES_NOT_SUPPORT_UNMONITORED: Win32Error = 5982u

public val ERROR_CLUSTER_RESOURCE_IS_IN_MAINTENANCE_MODE: Win32Error = 5970u

public val ERROR_CLUSTER_RESOURCE_IS_REPLICATED: Win32Error = 5983u

public val ERROR_CLUSTER_RESOURCE_IS_REPLICA_VIRTUAL_MACHINE: Win32Error = 5972u

public val ERROR_CLUSTER_RESOURCE_LOCKED_STATUS: Win32Error = 5960u

public val ERROR_CLUSTER_RESOURCE_NOT_MONITORED: Win32Error = 5981u

public val ERROR_CLUSTER_RESOURCE_PROVIDER_FAILED: Win32Error = 5942u

public val ERROR_CLUSTER_RESOURCE_TYPE_BUSY: Win32Error = 5909u

public val ERROR_CLUSTER_RESOURCE_TYPE_NOT_FOUND: Win32Error = 5078u

public val ERROR_CLUSTER_RESOURCE_VETOED_CALL: Win32Error = 5955u

public val ERROR_CLUSTER_RESOURCE_VETOED_MOVE_INCOMPATIBLE_NODES: Win32Error = 5953u

public val ERROR_CLUSTER_RESOURCE_VETOED_MOVE_NOT_ENOUGH_RESOURCES_ON_DESTINATION: Win32Error = 5957u

public val ERROR_CLUSTER_RESOURCE_VETOED_MOVE_NOT_ENOUGH_RESOURCES_ON_SOURCE: Win32Error = 5958u

public val ERROR_CLUSTER_RESTYPE_NOT_SUPPORTED: Win32Error = 5079u

public val ERROR_CLUSTER_RHS_FAILED_INITIALIZATION: Win32Error = 5931u

public val ERROR_CLUSTER_SHARED_VOLUMES_IN_USE: Win32Error = 5947u

public val ERROR_CLUSTER_SHARED_VOLUME_FAILOVER_NOT_ALLOWED: Win32Error = 5961u

public val ERROR_CLUSTER_SHARED_VOLUME_NOT_REDIRECTED: Win32Error = 5967u

public val ERROR_CLUSTER_SHARED_VOLUME_REDIRECTED: Win32Error = 5966u

public val ERROR_CLUSTER_SHUTTING_DOWN: Win32Error = 5022u

public val ERROR_CLUSTER_SINGLETON_RESOURCE: Win32Error = 5940u

public val ERROR_CLUSTER_SPACE_DEGRADED: Win32Error = 5987u

public val ERROR_CLUSTER_SYSTEM_CONFIG_CHANGED: Win32Error = 5077u

public val ERROR_CLUSTER_TOKEN_DELEGATION_NOT_SUPPORTED: Win32Error = 5988u

public val ERROR_CLUSTER_TOO_MANY_NODES: Win32Error = 5935u

public val ERROR_CLUSTER_UPGRADE_FIX_QUORUM_NOT_SUPPORTED: Win32Error = 5974u

public val ERROR_CLUSTER_UPGRADE_INCOMPATIBLE_VERSIONS: Win32Error = 5973u

public val ERROR_CLUSTER_UPGRADE_INCOMPLETE: Win32Error = 5977u

public val ERROR_CLUSTER_UPGRADE_IN_PROGRESS: Win32Error = 5976u

public val ERROR_CLUSTER_UPGRADE_RESTART_REQUIRED: Win32Error = 5975u

public val ERROR_CLUSTER_USE_SHARED_VOLUMES_API: Win32Error = 5948u

public val ERROR_CLUSTER_WATCHDOG_TERMINATING: Win32Error = 5952u

public val ERROR_CLUSTER_WRONG_OS_VERSION: Win32Error = 5899u

public val ERROR_COLORSPACE_MISMATCH: Win32Error = 2021u

public val ERROR_COMMITMENT_LIMIT: Win32Error = 1455u

public val ERROR_COMMITMENT_MINIMUM: Win32Error = 635u

public val ERROR_COMPRESSED_FILE_NOT_SUPPORTED: Win32Error = 335u

public val ERROR_COMPRESSION_DISABLED: Win32Error = 769u

public val ERROR_COMPRESSION_NOT_ALLOWED_IN_TRANSACTION: Win32Error = 6850u

public val ERROR_COMPRESSION_NOT_BENEFICIAL: Win32Error = 344u

public val ERROR_COM_TASK_STOP_PENDING: Win32Error = 15501u

public val ERROR_CONNECTED_OTHER_PASSWORD: Win32Error = 2108u

public val ERROR_CONNECTED_OTHER_PASSWORD_DEFAULT: Win32Error = 2109u

public val ERROR_CONNECTION_ABORTED: Win32Error = 1236u

public val ERROR_CONNECTION_ACTIVE: Win32Error = 1230u

public val ERROR_CONNECTION_COUNT_LIMIT: Win32Error = 1238u

public val ERROR_CONNECTION_INVALID: Win32Error = 1229u

public val ERROR_CONNECTION_REFUSED: Win32Error = 1225u

public val ERROR_CONNECTION_UNAVAIL: Win32Error = 1201u

public val ERROR_CONTAINER_ASSIGNED: Win32Error = 1504u

public val ERROR_CONTENT_BLOCKED: Win32Error = 1296u

public val ERROR_CONTEXT_EXPIRED: Win32Error = 1931u

public val ERROR_CONTINUE: Win32Error = 1246u

public val ERROR_CONTROLLING_IEPORT: Win32Error = 4329u

public val ERROR_CONTROL_C_EXIT: Win32Error = 572u

public val ERROR_CONTROL_ID_NOT_FOUND: Win32Error = 1421u

public val ERROR_CONVERT_TO_LARGE: Win32Error = 600u

public val ERROR_CORE_DRIVER_PACKAGE_NOT_FOUND: Win32Error = 3016u

public val ERROR_CORE_RESOURCE: Win32Error = 5026u

public val ERROR_CORRUPT_LOG_CLEARED: Win32Error = 798u

public val ERROR_CORRUPT_LOG_CORRUPTED: Win32Error = 795u

public val ERROR_CORRUPT_LOG_DELETED_FULL: Win32Error = 797u

public val ERROR_CORRUPT_LOG_OVERFULL: Win32Error = 794u

public val ERROR_CORRUPT_LOG_UNAVAILABLE: Win32Error = 796u

public val ERROR_CORRUPT_SYSTEM_FILE: Win32Error = 634u

public val ERROR_COULD_NOT_INTERPRET: Win32Error = 552u

public val ERROR_COULD_NOT_RESIZE_LOG: Win32Error = 6629u

public val ERROR_COUNTER_TIMEOUT: Win32Error = 1121u

public val ERROR_CPU_SET_INVALID: Win32Error = 813u

public val ERROR_CRASH_DUMP: Win32Error = 753u

public val ERROR_CRC: Win32Error = 23u

public val ERROR_CREATE_FAILED: Win32Error = 1631u

public val ERROR_CRED_REQUIRES_CONFIRMATION: Hresult = 0x80097019u.toInt()

public val ERROR_CRM_PROTOCOL_ALREADY_EXISTS: Win32Error = 6710u

public val ERROR_CRM_PROTOCOL_NOT_FOUND: Win32Error = 6712u

public val ERROR_CROSS_PARTITION_VIOLATION: Win32Error = 1661u

public val ERROR_CSCSHARE_OFFLINE: Win32Error = 1262u

public val ERROR_CSV_VOLUME_NOT_LOCAL: Win32Error = 5951u

public val ERROR_CS_ENCRYPTION_EXISTING_ENCRYPTED_FILE: Win32Error = 6019u

public val ERROR_CS_ENCRYPTION_FILE_NOT_CSE: Win32Error = 6021u

public val ERROR_CS_ENCRYPTION_INVALID_SERVER_RESPONSE: Win32Error = 6017u

public val ERROR_CS_ENCRYPTION_NEW_ENCRYPTED_FILE: Win32Error = 6020u

public val ERROR_CS_ENCRYPTION_UNSUPPORTED_SERVER: Win32Error = 6018u

public val ERROR_CTLOG_INCONSISTENT_TRACKING_FILE: Win32Error = 3225026596u

public val ERROR_CTLOG_INVALID_TRACKING_STATE: Win32Error = 3225026595u

public val ERROR_CTLOG_LOGFILE_SIZE_EXCEEDED_MAXSIZE: Win32Error = 3225026593u

public val ERROR_CTLOG_TRACKING_NOT_INITIALIZED: Win32Error = 3225026592u

public val ERROR_CTLOG_VHD_CHANGED_OFFLINE: Win32Error = 3225026594u

public val ERROR_CTX_ACCOUNT_RESTRICTION: Win32Error = 7064u

public val ERROR_CTX_BAD_VIDEO_MODE: Win32Error = 7025u

public val ERROR_CTX_CANNOT_MAKE_EVENTLOG_ENTRY: Win32Error = 7005u

public val ERROR_CTX_CDM_CONNECT: Win32Error = 7066u

public val ERROR_CTX_CDM_DISCONNECT: Win32Error = 7067u

public val ERROR_CTX_CLIENT_LICENSE_IN_USE: Win32Error = 7052u

public val ERROR_CTX_CLIENT_LICENSE_NOT_SET: Win32Error = 7053u

public val ERROR_CTX_CLIENT_QUERY_TIMEOUT: Win32Error = 7040u

public val ERROR_CTX_CLOSE_PENDING: Win32Error = 7007u

public val ERROR_CTX_CONSOLE_CONNECT: Win32Error = 7042u

public val ERROR_CTX_CONSOLE_DISCONNECT: Win32Error = 7041u

public val ERROR_CTX_ENCRYPTION_LEVEL_REQUIRED: Win32Error = 7061u

public val ERROR_CTX_GRAPHICS_INVALID: Win32Error = 7035u

public val ERROR_CTX_INVALID_MODEMNAME: Win32Error = 7010u

public val ERROR_CTX_INVALID_PD: Win32Error = 7002u

public val ERROR_CTX_INVALID_WD: Win32Error = 7049u

public val ERROR_CTX_LICENSE_CLIENT_INVALID: Win32Error = 7055u

public val ERROR_CTX_LICENSE_EXPIRED: Win32Error = 7056u

public val ERROR_CTX_LICENSE_NOT_AVAILABLE: Win32Error = 7054u

public val ERROR_CTX_LOGON_DISABLED: Win32Error = 7037u

public val ERROR_CTX_MODEM_INF_NOT_FOUND: Win32Error = 7009u

public val ERROR_CTX_MODEM_RESPONSE_BUSY: Win32Error = 7015u

public val ERROR_CTX_MODEM_RESPONSE_ERROR: Win32Error = 7011u

public val ERROR_CTX_MODEM_RESPONSE_NO_CARRIER: Win32Error = 7013u

public val ERROR_CTX_MODEM_RESPONSE_NO_DIALTONE: Win32Error = 7014u

public val ERROR_CTX_MODEM_RESPONSE_TIMEOUT: Win32Error = 7012u

public val ERROR_CTX_MODEM_RESPONSE_VOICE: Win32Error = 7016u

public val ERROR_CTX_NOT_CONSOLE: Win32Error = 7038u

public val ERROR_CTX_NO_FORCE_LOGOFF: Win32Error = 7063u

public val ERROR_CTX_NO_OUTBUF: Win32Error = 7008u

public val ERROR_CTX_PD_NOT_FOUND: Win32Error = 7003u

public val ERROR_CTX_SECURITY_LAYER_ERROR: Win32Error = 7068u

public val ERROR_CTX_SERVICE_NAME_COLLISION: Win32Error = 7006u

public val ERROR_CTX_SESSION_IN_USE: Win32Error = 7062u

public val ERROR_CTX_SHADOW_DENIED: Win32Error = 7044u

public val ERROR_CTX_SHADOW_DISABLED: Win32Error = 7051u

public val ERROR_CTX_SHADOW_ENDED_BY_MODE_CHANGE: Win32Error = 7058u

public val ERROR_CTX_SHADOW_INVALID: Win32Error = 7050u

public val ERROR_CTX_SHADOW_NOT_RUNNING: Win32Error = 7057u

public val ERROR_CTX_TD_ERROR: Win32Error = 7017u

public val ERROR_CTX_WD_NOT_FOUND: Win32Error = 7004u

public val ERROR_CTX_WINSTATIONS_DISABLED: Win32Error = 7060u

public val ERROR_CTX_WINSTATION_ACCESS_DENIED: Win32Error = 7045u

public val ERROR_CTX_WINSTATION_ALREADY_EXISTS: Win32Error = 7023u

public val ERROR_CTX_WINSTATION_BUSY: Win32Error = 7024u

public val ERROR_CTX_WINSTATION_NAME_INVALID: Win32Error = 7001u

public val ERROR_CTX_WINSTATION_NOT_FOUND: Win32Error = 7022u

public val ERROR_CURRENT_DIRECTORY: Win32Error = 16u

public val ERROR_CURRENT_DOMAIN_NOT_ALLOWED: Win32Error = 1399u

public val ERROR_CURRENT_TRANSACTION_NOT_VALID: Win32Error = 6714u

public val ERROR_DATABASE_BACKUP_CORRUPT: Win32Error = 5087u

public val ERROR_DATABASE_DOES_NOT_EXIST: Win32Error = 1065u

public val ERROR_DATABASE_FAILURE: Win32Error = 4313u

public val ERROR_DATABASE_FULL: Win32Error = 4314u

public val ERROR_DATATYPE_MISMATCH: Win32Error = 1629u

public val ERROR_DATA_CHECKSUM_ERROR: Win32Error = 323u

public val ERROR_DATA_LOST_REPAIR: Win32Error = 6843u

public val ERROR_DATA_NOT_ACCEPTED: Win32Error = 592u

public val ERROR_DAX_MAPPING_EXISTS: Win32Error = 361u

public val ERROR_DBG_ATTACH_PROCESS_FAILURE_LOCKDOWN: Hresult = 0x80B00002u.toInt()

public val ERROR_DBG_COMMAND_EXCEPTION: Win32Error = 697u

public val ERROR_DBG_CONNECT_SERVER_FAILURE_LOCKDOWN: Hresult = 0x80B00003u.toInt()

public val ERROR_DBG_CONTINUE: Win32Error = 767u

public val ERROR_DBG_CONTROL_BREAK: Win32Error = 696u

public val ERROR_DBG_CONTROL_C: Win32Error = 693u

public val ERROR_DBG_CREATE_PROCESS_FAILURE_LOCKDOWN: Hresult = 0x80B00001u.toInt()

public val ERROR_DBG_EXCEPTION_HANDLED: Win32Error = 766u

public val ERROR_DBG_EXCEPTION_NOT_HANDLED: Win32Error = 688u

public val ERROR_DBG_PRINTEXCEPTION_C: Win32Error = 694u

public val ERROR_DBG_REPLY_LATER: Win32Error = 689u

public val ERROR_DBG_RIPEXCEPTION: Win32Error = 695u

public val ERROR_DBG_START_SERVER_FAILURE_LOCKDOWN: Hresult = 0x80B00004u.toInt()

public val ERROR_DBG_TERMINATE_PROCESS: Win32Error = 692u

public val ERROR_DBG_TERMINATE_THREAD: Win32Error = 691u

public val ERROR_DBG_UNABLE_TO_PROVIDE_HANDLE: Win32Error = 690u

public val ERROR_DC_NOT_FOUND: Win32Error = 1425u

public val ERROR_DDE_FAIL: Win32Error = 1156u

public val ERROR_DDM_NOT_RUNNING: UInt = 903u

public val ERROR_DEBUGGER_INACTIVE: Win32Error = 1284u

public val ERROR_DEBUG_ATTACH_FAILED: Win32Error = 590u

public val ERROR_DECRYPTION_FAILED: Win32Error = 6001u

public val ERROR_DELAY_LOAD_FAILED: Win32Error = 1285u

public val ERROR_DELETE_PENDING: Win32Error = 303u

public val ERROR_DELETING_EXISTING_APPLICATIONDATA_STORE_FAILED: Win32Error = 15621u

public val ERROR_DELETING_ICM_XFORM: Win32Error = 2019u

public val ERROR_DEPENDENCY_ALREADY_EXISTS: Win32Error = 5003u

public val ERROR_DEPENDENCY_NOT_ALLOWED: Win32Error = 5069u

public val ERROR_DEPENDENCY_NOT_FOUND: Win32Error = 5002u

public val ERROR_DEPENDENCY_TREE_TOO_COMPLEX: Win32Error = 5929u

public val ERROR_DEPENDENT_RESOURCE_EXISTS: Win32Error = 5001u

public val ERROR_DEPENDENT_RESOURCE_PROPERTY_CONFLICT: Win32Error = 5924u

public val ERROR_DEPENDENT_SERVICES_RUNNING: Win32Error = 1051u

public val ERROR_DEPLOYMENT_BLOCKED_BY_POLICY: Win32Error = 15617u

public val ERROR_DEPLOYMENT_BLOCKED_BY_PROFILE_POLICY: Win32Error = 15651u

public val ERROR_DEPLOYMENT_BLOCKED_BY_USER_LOG_OFF: Win32Error = 15641u

public val ERROR_DEPLOYMENT_BLOCKED_BY_VOLUME_POLICY_MACHINE: Win32Error = 15650u

public val ERROR_DEPLOYMENT_BLOCKED_BY_VOLUME_POLICY_PACKAGE: Win32Error = 15649u

public val ERROR_DEPLOYMENT_FAILED_CONFLICTING_MUTABLE_PACKAGE_DIRECTORY: Win32Error = 15652u

public val ERROR_DEPLOYMENT_OPTION_NOT_SUPPORTED: Win32Error = 15645u
