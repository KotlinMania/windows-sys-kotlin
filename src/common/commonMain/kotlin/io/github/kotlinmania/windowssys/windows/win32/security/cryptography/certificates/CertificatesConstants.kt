package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val ALGORITHM_FLAGS_NONE: AlgorithmFlags = 0

public val ALGORITHM_FLAGS_WRAP: AlgorithmFlags = 1

public val ALLOW_NO_OUTSTANDING_REQUEST: InstallResponseRestrictionFlags = 1

public val ALLOW_NONE: InstallResponseRestrictionFlags = 0

public val ALLOW_UNTRUSTED_CERTIFICATE: InstallResponseRestrictionFlags = 2

public val ALLOW_UNTRUSTED_ROOT: InstallResponseRestrictionFlags = 4

public val ALLOWED_KEY_SIGNATURE: Pkcs10AllowedSignatureTypes = 1

public val ALLOWED_NULL_SIGNATURE: Pkcs10AllowedSignatureTypes = 2

public val CAIF_DSENTRY: UInt = 1u

public val CAIF_LOCAL: UInt = 8u

public val CAIF_REGISTRY: UInt = 4u

public val CAIF_REGISTRYPARENT: UInt = 16u

public val CAIF_SHAREDFOLDERENTRY: UInt = 2u

public val CAPATHLENGTH_INFINITE: UInt = 4294967295u

public val CA_PROP_CERTIFICATE: EnrollmentCAProperty = 7

public val CA_PROP_CERTIFICATE_TYPES: EnrollmentCAProperty = 6

public val CA_PROP_COMMON_NAME: EnrollmentCAProperty = 1

public val CA_PROP_DNS_NAME: EnrollmentCAProperty = 5

public val CA_PROP_DESCRIPTION: EnrollmentCAProperty = 8

public val CA_PROP_DISTINGUISHED_NAME: EnrollmentCAProperty = 2

public val CA_PROP_RENEWAL_ONLY: EnrollmentCAProperty = 12

public val CA_PROP_SANITIZED_NAME: EnrollmentCAProperty = 3

public val CA_PROP_SANITIZED_SHORT_NAME: EnrollmentCAProperty = 4

public val CA_PROP_SECURITY: EnrollmentCAProperty = 11

public val CA_PROP_SITE_NAME: EnrollmentCAProperty = 10

public val CA_PROP_WEB_SERVERS: EnrollmentCAProperty = 9

public val CA_ACCESS_ADMIN: CertadminGetRolesFlags = 1u

public val CA_ACCESS_AUDITOR: CertadminGetRolesFlags = 4u

public val CA_ACCESS_ENROLL: CertadminGetRolesFlags = 512u

public val CA_ACCESS_MASKROLES: UInt = 255u

public val CA_ACCESS_OFFICER: CertadminGetRolesFlags = 2u

public val CA_ACCESS_OPERATOR: CertadminGetRolesFlags = 8u

public val CA_ACCESS_READ: CertadminGetRolesFlags = 256u

public val CA_CRL_BASE: UInt = 1u

public val CA_CRL_DELTA: UInt = 2u

public val CA_CRL_REPUBLISH: UInt = 16u

public val CA_DISP_ERROR: UInt = 1u

public val CA_DISP_INCOMPLETE: UInt = 0u

public val CA_DISP_INVALID: UInt = 4u

public val CA_DISP_REVOKED: UInt = 2u

public val CA_DISP_UNDER_SUBMISSION: UInt = 5u

public val CA_DISP_VALID: UInt = 3u

public val C_ALTERNATIVE_NAME: Guid = Guid.fromU128(U128(0x884e2013217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_ALTERNATIVE_NAMES: Guid = Guid.fromU128(U128(0x884e2014217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_BINARY_CONVERTER: Guid = Guid.fromU128(U128(0x884e2002217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCLOCKSKEWMINUTESDEFAULT: UInt = 10u

public val CC_DEFAULTCONFIG: CertGetConfigFlags = 0

public val CC_FIRSTCONFIG: CertGetConfigFlags = 2

public val CC_LOCALACTIVECONFIG: CertGetConfigFlags = 4

public val CC_LOCALCONFIG: CertGetConfigFlags = 3

public val CC_UIPICKCONFIG: CertGetConfigFlags = 1

public val CC_UIPICKCONFIGSKIPLOCALCA: CertGetConfigFlags = 5

public val C_CERT_ADMIN: Guid = Guid.fromU128(U128(0x37eabaf07fb611d0uL, 0x881700a0c903b83cuL))

public val C_CERT_CONFIG: Guid = Guid.fromU128(U128(0x372fce38432411d0uL, 0x881000a0c903b83cuL))

public val C_CERT_ENCODE_ALT_NAME: Guid = Guid.fromU128(U128(0x1cfc4cda127111d1uL, 0x9bd400c04fb683fauL))

public val C_CERT_ENCODE_BIT_STRING: Guid = Guid.fromU128(U128(0x6d6b3cd8127811d1uL, 0x9bd400c04fb683fauL))

public val C_CERT_ENCODE_CRL_DIST_INFO: Guid = Guid.fromU128(U128(0x1fa60a0bbff11d0uL, 0x882500a0c903b83cuL))

public val C_CERT_ENCODE_DATE_ARRAY: Guid = Guid.fromU128(U128(0x301f77b0a47011d0uL, 0x882100a0c903b83cuL))

public val C_CERT_ENCODE_LONG_ARRAY: Guid = Guid.fromU128(U128(0x4e0680a0a0a211d0uL, 0x882100a0c903b83cuL))

public val C_CERT_ENCODE_STRING_ARRAY: Guid = Guid.fromU128(U128(0x19a76fe0749411d0uL, 0x881600a0c903b83cuL))

public val C_CERT_GET_CONFIG: Guid = Guid.fromU128(U128(0xc6cc49b0ce1711d0uL, 0x883300a0c903b83cuL))

public val C_CERT_PROPERTIES: Guid = Guid.fromU128(U128(0x884e202f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY: Guid = Guid.fromU128(U128(0x884e202e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_ARCHIVED: Guid = Guid.fromU128(U128(0x884e2037217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_ARCHIVED_KEY_HASH: Guid = Guid.fromU128(U128(0x884e203b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_AUTO_ENROLL: Guid = Guid.fromU128(U128(0x884e2032217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_BACKED_UP: Guid = Guid.fromU128(U128(0x884e2038217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_DESCRIPTION: Guid = Guid.fromU128(U128(0x884e2031217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_ENROLLMENT: Guid = Guid.fromU128(U128(0x884e2039217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_ENROLLMENT_POLICY_SERVER: Guid = Guid.fromU128(U128(0x884e204c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_FRIENDLY_NAME: Guid = Guid.fromU128(U128(0x884e2030217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_KEY_PROV_INFO: Guid = Guid.fromU128(U128(0x884e2036217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_RENEWAL: Guid = Guid.fromU128(U128(0x884e203a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_REQUEST_ORIGINATOR: Guid = Guid.fromU128(U128(0x884e2033217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_PROPERTY_SHA1HASH: Guid = Guid.fromU128(U128(0x884e2034217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERT_REQUEST: Guid = Guid.fromU128(U128(0x98aff3f0552411d0uL, 0x881200a0c903b83cuL))

public val C_CERT_SERVER_EXIT: Guid = Guid.fromU128(U128(0x4c4a5e40732c11d0uL, 0x881600a0c903b83cuL))

public val C_CERT_SERVER_POLICY: Guid = Guid.fromU128(U128(0xaa000926ffbe11cfuL, 0x880000a0c903b83cuL))

public val C_CERT_VIEW: Guid = Guid.fromU128(U128(0xa12d0f7a1e8411d1uL, 0x9bd600c04fb683fauL))

public val C_CERTIFICATE_ATTESTATION_CHALLENGE: Guid = Guid.fromU128(U128(0x1362ada1eb60456auL, 0xb6e1118050db741buL))

public val C_CERTIFICATE_POLICIES: Guid = Guid.fromU128(U128(0x884e201f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CERTIFICATE_POLICY: Guid = Guid.fromU128(U128(0x884e201e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CRYPT_ATTRIBUTE: Guid = Guid.fromU128(U128(0x884e202c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CRYPT_ATTRIBUTES: Guid = Guid.fromU128(U128(0x884e202d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CSP_INFORMATION: Guid = Guid.fromU128(U128(0x884e2007217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CSP_INFORMATIONS: Guid = Guid.fromU128(U128(0x884e2008217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_CSP_STATUS: Guid = Guid.fromU128(U128(0x884e2009217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CDR_EXPIRED: CertDeleteRowFlags = 1

public val CDR_REQUEST_LAST_CHANGED: CertDeleteRowFlags = 2

public val CERTENROLL_INDEX_BASE: UInt = 0u

public val CERT_ALT_NAME_DIRECTORY_NAME: CertAltName = 5

public val CERT_ALT_NAME_DNS_NAME: CertAltName = 3

public val CERT_ALT_NAME_IP_ADDRESS: CertAltName = 8

public val CERT_ALT_NAME_OTHER_NAME: CertAltName = 1

public val CERT_ALT_NAME_REGISTERED_ID: CertAltName = 9

public val CERT_ALT_NAME_RFC822_NAME: CertAltName = 2

public val CERT_ALT_NAME_URL: CertAltName = 7

public val C_ENROLL: Guid = Guid.fromU128(U128(0x43f8f2897a2011d0uL, 0x8f0600c04fc295e1uL))

public val C_ENROLL2: Guid = Guid.fromU128(U128(0x127698e4e7304e5cuL, 0xa2b121490a70c8a1uL))

public val CMM_READONLY: UInt = 2u

public val CMM_REFRESHONLY: UInt = 1u

public val C_OBJECT_ID: Guid = Guid.fromU128(U128(0x884e2000217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_OBJECT_IDS: Guid = Guid.fromU128(U128(0x884e2001217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CPF_BADURL_ERROR: UInt = 32u

public val CPF_BASE: UInt = 1u

public val CPF_CASTORE_ERROR: UInt = 16u

public val CPF_COMPLETE: UInt = 4u

public val CPF_DELTA: UInt = 2u

public val CPF_FILE_ERROR: UInt = 512u

public val CPF_FTP_ERROR: UInt = 1024u

public val CPF_HTTP_ERROR: UInt = 2048u

public val CPF_LDAP_ERROR: UInt = 256u

public val CPF_MANUAL: UInt = 64u

public val CPF_POSTPONED_BASE_FILE_ERROR: UInt = 8192u

public val CPF_POSTPONED_BASE_LDAP_ERROR: UInt = 4096u

public val CPF_SHADOW: UInt = 8u

public val CPF_SIGNATURE_ERROR: UInt = 128u

public val C_POLICY_QUALIFIER: Guid = Guid.fromU128(U128(0x884e201c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_POLICY_QUALIFIERS: Guid = Guid.fromU128(U128(0x884e201d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CRLF_ALLOW_REQUEST_ATTRIBUTE_SUBJECT: UInt = 65536u

public val CRLF_BUILD_ROOTCA_CRLENTRIES_BASEDONKEY: UInt = 2097152u

public val CRLF_CRLNUMBER_CRITICAL: UInt = 4u

public val CRLF_DELETE_EXPIRED_CRLS: UInt = 2u

public val CRLF_DELTA_USE_OLDEST_UNEXPIRED_BASE: UInt = 1u

public val CRLF_DISABLE_CHAIN_VERIFICATION: UInt = 1048576u

public val CRLF_DISABLE_RDN_REORDER: UInt = 2048u

public val CRLF_DISABLE_ROOT_CROSS_CERTS: UInt = 4096u

public val CRLF_ENFORCE_ENROLLMENT_AGENT: UInt = 1024u

public val CRLF_IGNORE_CROSS_CERT_TRUST_ERROR: UInt = 256u

public val CRLF_IGNORE_INVALID_POLICIES: UInt = 16u

public val CRLF_IGNORE_UNKNOWN_CMC_ATTRIBUTES: UInt = 128u

public val CRLF_LOG_FULL_RESPONSE: UInt = 8192u

public val CRLF_PRESERVE_EXPIRED_CA_CERTS: UInt = 262144u

public val CRLF_PRESERVE_REVOKED_CA_CERTS: UInt = 524288u

public val CRLF_PUBLISH_EXPIRED_CERT_CRLS: UInt = 512u

public val CRLF_REBUILD_MODIFIED_SUBJECT_ONLY: UInt = 32u

public val CRLF_REVCHECK_IGNORE_NOREVCHECK: UInt = 131072u

public val CRLF_REVCHECK_IGNORE_OFFLINE: UInt = 8u

public val CRLF_SAVE_FAILED_CERTS: UInt = 64u

public val CRLF_USE_CROSS_CERT_TEMPLATE: UInt = 32768u

public val CRLF_USE_XCHG_CERT_TEMPLATE: UInt = 16384u

public val CRYPT_ENUM_ALL_PROVIDERS: UInt = 1u

public val CR_DISP_DENIED: CrDisp = 2u

public val CR_DISP_ERROR: CrDisp = 1u

public val CR_DISP_INCOMPLETE: CrDisp = 0u

public val CR_DISP_ISSUED: CrDisp = 3u

public val CR_DISP_ISSUED_OUT_OF_BAND: CrDisp = 4u

public val CR_DISP_REVOKED: UInt = 6u

public val CR_DISP_UNDER_SUBMISSION: CrDisp = 5u

public val CR_FLG_CACROSSCERT: UInt = 128u

public val CR_FLG_CAXCHGCERT: UInt = 8u

public val CR_FLG_CHALLENGEPENDING: UInt = 1024u

public val CR_FLG_CHALLENGESATISFIED: UInt = 2048u

public val CR_FLG_DEFINEDCACERT: UInt = 512u

public val CR_FLG_ENFORCEUTF8: UInt = 256u

public val CR_FLG_ENROLLONBEHALFOF: UInt = 16u

public val CR_FLG_FORCETELETEX: UInt = 1u

public val CR_FLG_FORCEUTF8: UInt = 4u

public val CR_FLG_PUBLISHERROR: UInt = 2147483648u

public val CR_FLG_RENEWAL: UInt = 2u

public val CR_FLG_SUBJECTUNMODIFIED: UInt = 32u

public val CR_FLG_TRUSTEKCERT: UInt = 8192u

public val CR_FLG_TRUSTEKKEY: UInt = 16384u

public val CR_FLG_TRUSTONUSE: UInt = 4096u

public val CR_FLG_VALIDENCRYPTEDKEYHASH: UInt = 64u

public val CR_GEMT_DEFAULT: UInt = 0u

public val CR_GEMT_HRESULT_STRING: UInt = 1u

public val CR_GEMT_HTTP_ERROR: UInt = 2u

public val CR_IN_BASE64: CertImportFlags = 1

public val CR_IN_BASE64HEADER: CertImportFlags = 0

public val CR_IN_BINARY: CertImportFlags = 2

public val CR_IN_CERTIFICATETRANSPARENCY: UInt = 67108864u

public val CR_IN_CHALLENGERESPONSE: UInt = 1280u

public val CR_IN_CLIENTIDNONE: UInt = 4194304u

public val CR_IN_CMC: UInt = 1024u

public val CR_IN_CONNECTONLY: UInt = 8388608u

public val CR_IN_CRLS: UInt = 524288u

public val CR_IN_ENCODEANY: UInt = 255u

public val CR_IN_ENCODEMASK: UInt = 255u

public val CR_IN_FORMATANY: UInt = 0u

public val CR_IN_FORMATMASK: UInt = 65280u

public val CR_IN_FULLRESPONSE: UInt = 262144u

public val CR_IN_HTTP: UInt = 196608u

public val CR_IN_KEYGEN: UInt = 512u

public val CR_IN_MACHINE: UInt = 1048576u

public val CR_IN_PKCS10: UInt = 256u

public val CR_IN_PKCS7: UInt = 768u

public val CR_IN_RETURNCHALLENGE: UInt = 16777216u

public val CR_IN_ROBO: UInt = 2097152u

public val CR_IN_RPC: UInt = 131072u

public val CR_IN_SCEP: UInt = 65536u

public val CR_IN_SCEPPOST: UInt = 33554432u

public val CR_IN_SIGNEDCERTIFICATETIMESTAMPLIST: UInt = 1536u

public val CR_OUT_BASE64: CertRequestOutType = 1

public val CR_OUT_BASE64HEADER: CertRequestOutType = 0

public val CR_OUT_BASE64REQUESTHEADER: UInt = 3u

public val CR_OUT_BASE64X509CRLHEADER: UInt = 9u

public val CR_OUT_BINARY: CertRequestOutType = 2

public val CR_OUT_CHAIN: UInt = 256u

public val CR_OUT_CRLS: UInt = 512u

public val CR_OUT_ENCODEMASK: UInt = 255u

public val CR_OUT_HEX: UInt = 4u

public val CR_OUT_HEXADDR: UInt = 10u

public val CR_OUT_HEXASCII: UInt = 5u

public val CR_OUT_HEXASCIIADDR: UInt = 11u

public val CR_OUT_HEXRAW: UInt = 12u

public val CR_OUT_NOCR: UInt = 2147483648u

public val CR_OUT_NOCRLF: UInt = 1073741824u

public val CR_PROP_ADVANCEDSERVER: UInt = 28u

public val CR_PROP_BASECRL: UInt = 17u

public val CR_PROP_BASECRLPUBLISHSTATUS: UInt = 30u

public val CR_PROP_CABACKWARDCROSSCERT: UInt = 36u

public val CR_PROP_CABACKWARDCROSSCERTSTATE: UInt = 38u

public val CR_PROP_CACERTSTATE: UInt = 19u

public val CR_PROP_CACERTSTATUSCODE: UInt = 34u

public val CR_PROP_CACERTVERSION: UInt = 39u

public val CR_PROP_CAFORWARDCROSSCERT: UInt = 35u

public val CR_PROP_CAFORWARDCROSSCERTSTATE: UInt = 37u

public val CR_PROP_CANAME: UInt = 6u

public val CR_PROP_CAPROPIDMAX: UInt = 21u

public val CR_PROP_CASIGCERT: UInt = 12u

public val CR_PROP_CASIGCERTCHAIN: UInt = 13u

public val CR_PROP_CASIGCERTCOUNT: UInt = 11u

public val CR_PROP_CASIGCERTCRLCHAIN: UInt = 32u

public val CR_PROP_CATYPE: UInt = 10u

public val CR_PROP_CAXCHGCERT: UInt = 15u

public val CR_PROP_CAXCHGCERTCHAIN: UInt = 16u

public val CR_PROP_CAXCHGCERTCOUNT: UInt = 14u

public val CR_PROP_CAXCHGCERTCRLCHAIN: UInt = 33u

public val CR_PROP_CERTAIAOCSPURLS: UInt = 43u

public val CR_PROP_CERTAIAURLS: UInt = 42u

public val CR_PROP_CERTCDPURLS: UInt = 41u

public val CR_PROP_CRLSTATE: UInt = 20u

public val CR_PROP_DELTACRL: UInt = 18u

public val CR_PROP_DELTACRLPUBLISHSTATUS: UInt = 31u

public val CR_PROP_DNSNAME: UInt = 22u

public val CR_PROP_EXITCOUNT: UInt = 3u

public val CR_PROP_EXITDESCRIPTION: UInt = 4u

public val CR_PROP_FILEVERSION: UInt = 1u

public val CR_PROP_KRACERT: UInt = 26u

public val CR_PROP_KRACERTCOUNT: UInt = 25u

public val CR_PROP_KRACERTSTATE: UInt = 27u

public val CR_PROP_KRACERTUSEDCOUNT: UInt = 24u

public val CR_PROP_LOCALENAME: UInt = 44u

public val CR_PROP_NONE: UInt = 0u

public val CR_PROP_PARENTCA: UInt = 9u

public val CR_PROP_POLICYDESCRIPTION: UInt = 5u

public val CR_PROP_PRODUCTVERSION: UInt = 2u

public val CR_PROP_ROLESEPARATIONENABLED: UInt = 23u

public val CR_PROP_SANITIZEDCANAME: UInt = 7u

public val CR_PROP_SANITIZEDCASHORTNAME: UInt = 40u

public val CR_PROP_SCEPMAX: UInt = 1002u

public val CR_PROP_SCEPMIN: UInt = 1000u

public val CR_PROP_SCEPSERVERCAPABILITIES: UInt = 1001u

public val CR_PROP_SCEPSERVERCERTS: UInt = 1000u

public val CR_PROP_SCEPSERVERCERTSCHAIN: UInt = 1002u

public val CR_PROP_SHAREDFOLDER: UInt = 8u

public val CR_PROP_SUBJECTTEMPLATE_OIDS: UInt = 45u

public val CR_PROP_TEMPLATES: UInt = 29u

public val CSBACKUP_DISABLE_INCREMENTAL: UInt = 4294967295u

public val CSBACKUP_TYPE_FULL: CsbackupType = 1u

public val CSBACKUP_TYPE_LOGS_ONLY: CsbackupType = 2u

public val CSBACKUP_TYPE_MASK: UInt = 3u

public val CSBFT_DATABASE_DIRECTORY: UInt = 64u

public val CSBFT_DIRECTORY: UInt = 128u

public val CSBFT_LOG_DIRECTORY: UInt = 32u

public val CSCONTROL_RESTART: ULong = 3uL

public val CSCONTROL_SHUTDOWN: ULong = 1uL

public val CSCONTROL_SUSPEND: ULong = 2uL

public val CSRESTORE_TYPE_CATCHUP: UInt = 4u

public val CSRESTORE_TYPE_FULL: UInt = 1u

public val CSRESTORE_TYPE_MASK: UInt = 5u

public val CSRESTORE_TYPE_ONLINE: UInt = 2u

public val CSURL_ADDTOCERTCDP: UInt = 2u

public val CSURL_ADDTOCERTOCSP: UInt = 32u

public val CSURL_ADDTOCRLCDP: UInt = 8u

public val CSURL_ADDTOFRESHESTCRL: UInt = 4u

public val CSURL_ADDTOIDP: UInt = 128u

public val CSURL_PUBLISHRETRY: UInt = 16u

public val CSURL_SERVERPUBLISH: UInt = 1u

public val CSURL_SERVERPUBLISHDELTA: UInt = 64u

public val CSVER_MAJOR: UInt = 7u

public val CSVER_MAJOR_LONGHORN: UInt = 3u

public val CSVER_MAJOR_THRESHOLD: UInt = 7u

public val CSVER_MAJOR_WHISTLER: UInt = 2u

public val CSVER_MAJOR_WIN2K: UInt = 1u

public val CSVER_MAJOR_WIN7: UInt = 4u

public val CSVER_MAJOR_WIN8: UInt = 5u

public val CSVER_MAJOR_WINBLUE: UInt = 6u

public val CSVER_MINOR: UInt = 1u

public val CSVER_MINOR_LONGHORN_BETA1: UInt = 1u

public val CSVER_MINOR_THRESHOLD: UInt = 1u

public val CSVER_MINOR_WHISTLER_BETA2: UInt = 1u

public val CSVER_MINOR_WHISTLER_BETA3: UInt = 2u

public val CSVER_MINOR_WIN2K: UInt = 1u

public val CSVER_MINOR_WIN7: UInt = 1u

public val CSVER_MINOR_WIN8: UInt = 1u

public val CSVER_MINOR_WINBLUE: UInt = 1u

public val C_SIGNER_CERTIFICATE: Guid = Guid.fromU128(U128(0x884e203d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_SMIME_CAPABILITIES: Guid = Guid.fromU128(U128(0x884e201a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val C_SMIME_CAPABILITY: Guid = Guid.fromU128(U128(0x884e2019217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CVIEWAGEMINUTESDEFAULT: UInt = 16u

public val CVRC_COLUMN_MASK: CvrcColumn = 4095

public val CVRC_COLUMN_RESULT: CvrcColumn = 1

public val CVRC_COLUMN_SCHEMA: CvrcColumn = 0

public val CVRC_COLUMN_VALUE: CvrcColumn = 2

public val CVRC_TABLE_ATTRIBUTES: CvrcTable = 16384

public val CVRC_TABLE_CRL: CvrcTable = 20480

public val CVRC_TABLE_EXTENSIONS: CvrcTable = 12288

public val CVRC_TABLE_MASK: UInt = 61440u

public val CVRC_TABLE_REQCERT: CvrcTable = 0

public val CVRC_TABLE_SHIFT: UInt = 12u

public val CVR_SEEK_EQ: CertViewSeekOperatorFlags = 1

public val CVR_SEEK_GE: CertViewSeekOperatorFlags = 8

public val CVR_SEEK_GT: CertViewSeekOperatorFlags = 16

public val CVR_SEEK_LE: CertViewSeekOperatorFlags = 4

public val CVR_SEEK_LT: CertViewSeekOperatorFlags = 2

public val CVR_SEEK_MASK: UInt = 255u

public val CVR_SEEK_NODELTA: UInt = 4096u

public val CVR_SEEK_NONE: UInt = 0u

public val CVR_SORT_ASCEND: UInt = 1u

public val CVR_SORT_DESCEND: UInt = 2u

public val CVR_SORT_NONE: UInt = 0u

public val CV_COLUMN_ATTRIBUTE_DEFAULT: Int = -5

public val CV_COLUMN_CRL_DEFAULT: Int = -6

public val CV_COLUMN_EXTENSION_DEFAULT: Int = -4

public val CV_COLUMN_LOG_DEFAULT: CertViewColumnIndex = -2

public val CV_COLUMN_LOG_FAILED_DEFAULT: CertViewColumnIndex = -3

public val CV_COLUMN_LOG_REVOKED_DEFAULT: Int = -7

public val CV_COLUMN_QUEUE_DEFAULT: CertViewColumnIndex = -1

public val CV_OUT_BASE64: EnumCertColumnValueFlags = 1

public val CV_OUT_BASE64HEADER: EnumCertColumnValueFlags = 0

public val CV_OUT_BASE64REQUESTHEADER: EnumCertColumnValueFlags = 3

public val CV_OUT_BASE64X509CRLHEADER: EnumCertColumnValueFlags = 9

public val CV_OUT_BINARY: EnumCertColumnValueFlags = 2

public val CV_OUT_ENCODEMASK: UInt = 255u

public val CV_OUT_HEX: EnumCertColumnValueFlags = 4

public val CV_OUT_HEXADDR: EnumCertColumnValueFlags = 10

public val CV_OUT_HEXASCII: EnumCertColumnValueFlags = 5

public val CV_OUT_HEXASCIIADDR: EnumCertColumnValueFlags = 11

public val CV_OUT_HEXRAW: UInt = 12u

public val CV_OUT_NOCR: UInt = 2147483648u

public val CV_OUT_NOCRLF: UInt = 1073741824u

public val CX500DISTINGUISHED_NAME: Guid = Guid.fromU128(U128(0x884e2003217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE: Guid = Guid.fromU128(U128(0x884e2022217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_ARCHIVE_KEY: Guid = Guid.fromU128(U128(0x884e2027217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_ARCHIVE_KEY_HASH: Guid = Guid.fromU128(U128(0x884e2028217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_CLIENT_ID: Guid = Guid.fromU128(U128(0x884e2025217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_CSP_PROVIDER: Guid = Guid.fromU128(U128(0x884e202b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_EXTENSIONS: Guid = Guid.fromU128(U128(0x884e2024217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_OS_VERSION: Guid = Guid.fromU128(U128(0x884e202a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTE_RENEWAL_CERTIFICATE: Guid = Guid.fromU128(U128(0x884e2026217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ATTRIBUTES: Guid = Guid.fromU128(U128(0x884e2023217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REQUEST_CERTIFICATE: Guid = Guid.fromU128(U128(0x884e2043217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REQUEST_CMC: Guid = Guid.fromU128(U128(0x884e2045217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REQUEST_PKCS10: Guid = Guid.fromU128(U128(0x884e2042217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REQUEST_PKCS7: Guid = Guid.fromU128(U128(0x884e2044217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REVOCATION_LIST: Guid = Guid.fromU128(U128(0x884e2060217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REVOCATION_LIST_ENTRIES: Guid = Guid.fromU128(U128(0x884e205f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_REVOCATION_LIST_ENTRY: Guid = Guid.fromU128(U128(0x884e205e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CERTIFICATE_TEMPLATE_AD_WRITABLE: Guid = Guid.fromU128(U128(0x8336e3232e6a4a04uL, 0x937c548f681839b3uL))

public val CX509ENDORSEMENT_KEY: Guid = Guid.fromU128(U128(0x11a25a1db9a34edduL, 0xaf833b59adbed361uL))

public val CX509ENROLLMENT: Guid = Guid.fromU128(U128(0x884e2046217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ENROLLMENT_HELPER: Guid = Guid.fromU128(U128(0x884e2050217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ENROLLMENT_POLICY_ACTIVE_DIRECTORY: Guid = Guid.fromU128(U128(0x91f39027217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ENROLLMENT_POLICY_WEB_SERVICE: Guid = Guid.fromU128(U128(0x91f39028217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ENROLLMENT_WEB_CLASS_FACTORY: Guid = Guid.fromU128(U128(0x884e2049217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION: Guid = Guid.fromU128(U128(0x884e200d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_ALTERNATIVE_NAMES: Guid = Guid.fromU128(U128(0x884e2015217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_AUTHORITY_KEY_IDENTIFIER: Guid = Guid.fromU128(U128(0x884e2018217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_BASIC_CONSTRAINTS: Guid = Guid.fromU128(U128(0x884e2016217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_CERTIFICATE_POLICIES: Guid = Guid.fromU128(U128(0x884e2020217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_ENHANCED_KEY_USAGE: Guid = Guid.fromU128(U128(0x884e2010217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_KEY_USAGE: Guid = Guid.fromU128(U128(0x884e200f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_MS_APPLICATION_POLICIES: Guid = Guid.fromU128(U128(0x884e2021217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_SMIME_CAPABILITIES: Guid = Guid.fromU128(U128(0x884e201b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_SUBJECT_KEY_IDENTIFIER: Guid = Guid.fromU128(U128(0x884e2017217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_TEMPLATE: Guid = Guid.fromU128(U128(0x884e2012217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSION_TEMPLATE_NAME: Guid = Guid.fromU128(U128(0x884e2011217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EXTENSIONS: Guid = Guid.fromU128(U128(0x884e200e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509MACHINE_ENROLLMENT_FACTORY: Guid = Guid.fromU128(U128(0x884e2051217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509NAME_VALUE_PAIR: Guid = Guid.fromU128(U128(0x884e203f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509POLICY_SERVER_LIST_MANAGER: Guid = Guid.fromU128(U128(0x91f39029217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509POLICY_SERVER_URL: Guid = Guid.fromU128(U128(0x91f3902a217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PRIVATE_KEY: Guid = Guid.fromU128(U128(0x884e200c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PUBLIC_KEY: Guid = Guid.fromU128(U128(0x884e200b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509SCEP_ENROLLMENT: Guid = Guid.fromU128(U128(0x884e2061217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509SCEP_ENROLLMENT_HELPER: Guid = Guid.fromU128(U128(0x884e2062217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CLIENT_ID_AUTO_ENROLL: RequestClientInfoClientId = 6

public val CLIENT_ID_AUTO_ENROLL2003: RequestClientInfoClientId = 2

public val CLIENT_ID_CERT_REQ: RequestClientInfoClientId = 9

public val CLIENT_ID_CERT_REQ2003: RequestClientInfoClientId = 4

public val CLIENT_ID_DEFAULT_REQUEST: RequestClientInfoClientId = 5

public val CLIENT_ID_EOBO: RequestClientInfoClientId = 8

public val CLIENT_ID_NONE: RequestClientInfoClientId = 0

public val CLIENT_ID_REQUEST_WIZARD: RequestClientInfoClientId = 7

public val CLIENT_ID_TEST: RequestClientInfoClientId = 10

public val CLIENT_ID_USER_START: RequestClientInfoClientId = 1000

public val CLIENT_ID_WIN_RT: RequestClientInfoClientId = 11

public val CLIENT_ID_WIZARD2003: RequestClientInfoClientId = 3

public val CLIENT_ID_X_ENROLL2003: RequestClientInfoClientId = 1

public val COMMIT_FLAG_DELETE_TEMPLATE: CommitTemplateFlags = 4

public val COMMIT_FLAG_SAVE_TEMPLATE_GENERATE_OID: CommitTemplateFlags = 1

public val COMMIT_FLAG_SAVE_TEMPLATE_OVERWRITE: CommitTemplateFlags = 3

public val COMMIT_FLAG_SAVE_TEMPLATE_USE_CURRENT_OID: CommitTemplateFlags = 2

public val CONTEXT_ADMINISTRATOR_FORCE_MACHINE: X509CertificateEnrollmentContext = 3

public val CONTEXT_MACHINE: X509CertificateEnrollmentContext = 2

public val CONTEXT_NONE: X509CertificateEnrollmentContext = 0

public val CONTEXT_USER: X509CertificateEnrollmentContext = 1

public val DBFLAGS_CHECKPOINTDEPTH60MB: UInt = 32u

public val DBFLAGS_CIRCULARLOGGING: UInt = 4u

public val DBFLAGS_CREATEIFNEEDED: UInt = 2u

public val DBFLAGS_DISABLESNAPSHOTBACKUP: UInt = 1024u

public val DBFLAGS_ENABLEVOLATILEREQUESTS: UInt = 2048u

public val DBFLAGS_LAZYFLUSH: UInt = 8u

public val DBFLAGS_LOGBUFFERSHUGE: UInt = 128u

public val DBFLAGS_LOGBUFFERSLARGE: UInt = 64u

public val DBFLAGS_LOGFILESIZE16MB: UInt = 256u

public val DBFLAGS_MAXCACHESIZEX100: UInt = 16u

public val DBFLAGS_MULTITHREADTRANSACTIONS: UInt = 512u

public val DBFLAGS_READONLY: UInt = 1u

public val DBG_CERTSRV: UInt = 1u

public val DBSESSIONCOUNTDEFAULT: UInt = 100u

public val DB_DISP_ACTIVE: UInt = 8u

public val DB_DISP_CA_CERT: UInt = 15u

public val DB_DISP_CA_CERT_CHAIN: UInt = 16u

public val DB_DISP_DENIED: UInt = 31u

public val DB_DISP_ERROR: UInt = 30u

public val DB_DISP_FOREIGN: UInt = 12u

public val DB_DISP_ISSUED: UInt = 20u

public val DB_DISP_KRA_CERT: UInt = 17u

public val DB_DISP_LOG_FAILED_MIN: UInt = 30u

public val DB_DISP_LOG_MIN: UInt = 20u

public val DB_DISP_PENDING: UInt = 9u

public val DB_DISP_QUEUE_MAX: UInt = 9u

public val DB_DISP_REVOKED: UInt = 21u

public val DEFAULT_NONE: EnrollmentPolicyServerPropertyFlags = 0

public val DEFAULT_POLICY_SERVER: EnrollmentPolicyServerPropertyFlags = 1

public val DELAY_RETRY_LONG: DelayRetryAction = 3

public val DELAY_RETRY_NONE: DelayRetryAction = 1

public val DELAY_RETRY_PAST_SUCCESS: DelayRetryAction = 5

public val DELAY_RETRY_SHORT: DelayRetryAction = 2

public val DELAY_RETRY_SUCCESS: DelayRetryAction = 4

public val DELAY_RETRY_UNKNOWN: DelayRetryAction = 0

public val DISABLE_GROUP_POLICY_LIST: EnrollmentPolicyFlags = 2

public val DISABLE_USER_SERVER_LIST: EnrollmentPolicyFlags = 4

public val DISPLAY_NO: EnrollmentDisplayStatus = 0

public val DISPLAY_YES: EnrollmentDisplayStatus = 1

public val EANR_SUPPRESS_IA5CONVERSION: UInt = 2147483648u

public val EAN_NAMEOBJECTID: UInt = 2147483648u

public val EDITF_ADDOLDCERTTYPE: UInt = 16u

public val EDITF_ADDOLDKEYUSAGE: UInt = 8u

public val EDITF_ATTRIBUTECA: UInt = 512u

public val EDITF_ATTRIBUTEEKU: UInt = 32768u

public val EDITF_ATTRIBUTEENDDATE: UInt = 32u

public val EDITF_ATTRIBUTESUBJECTALTNAME2: UInt = 262144u

public val EDITF_AUDITCERTTEMPLATELOAD: UInt = 2097152u

public val EDITF_BASICCONSTRAINTSCA: UInt = 128u

public val EDITF_BASICCONSTRAINTSCRITICAL: UInt = 64u

public val EDITF_DISABLEEXTENSIONLIST: UInt = 4u

public val EDITF_DISABLELDAPPACKAGELIST: UInt = 8388608u

public val EDITF_DISABLEOLDOSCNUPN: UInt = 4194304u

public val EDITF_EMAILOPTIONAL: UInt = 131072u

public val EDITF_ENABLEAKICRITICAL: UInt = 8192u

public val EDITF_ENABLEAKIISSUERNAME: UInt = 2048u

public val EDITF_ENABLEAKIISSUERSERIAL: UInt = 4096u

public val EDITF_ENABLEAKIKEYID: UInt = 256u

public val EDITF_ENABLECHASECLIENTDC: UInt = 1048576u

public val EDITF_ENABLEDEFAULTSMIME: UInt = 65536u

public val EDITF_ENABLEKEYENCIPHERMENTCACERT: UInt = 134217728u

public val EDITF_ENABLELDAPREFERRALS: UInt = 524288u

public val EDITF_ENABLEOCSPREVNOCHECK: UInt = 33554432u

public val EDITF_ENABLERENEWONBEHALFOF: UInt = 67108864u

public val EDITF_ENABLEREQUESTEXTENSIONS: UInt = 1u

public val EDITF_ENABLEUPNMAP: UInt = 16777216u

public val EDITF_IGNOREREQUESTERGROUP: UInt = 1024u

public val EDITF_REQUESTEXTENSIONLIST: UInt = 2u

public val EDITF_SERVERUPGRADED: UInt = 16384u

public val ENUMEXT_OBJECTID: UInt = 1u

public val ENUM_ENTERPRISE_ROOTCA: EnumCatypes = 0

public val ENUM_ENTERPRISE_SUBCA: EnumCatypes = 1

public val ENUM_STANDALONE_ROOTCA: EnumCatypes = 3

public val ENUM_STANDALONE_SUBCA: EnumCatypes = 4

public val ENUM_UNKNOWN_CA: EnumCatypes = 5

public val EXITEVENT_CERTDENIED: CertExitEventMask = 4u

public val EXITEVENT_CERTIMPORTED: UInt = 512u

public val EXITEVENT_CERTISSUED: CertExitEventMask = 1u

public val EXITEVENT_CERTPENDING: CertExitEventMask = 2u

public val EXITEVENT_CERTRETRIEVEPENDING: CertExitEventMask = 16u

public val EXITEVENT_CERTREVOKED: CertExitEventMask = 8u

public val EXITEVENT_CRLISSUED: CertExitEventMask = 32u

public val EXITEVENT_INVALID: UInt = 0u

public val EXITEVENT_SHUTDOWN: CertExitEventMask = 64u

public val EXITEVENT_STARTUP: UInt = 128u

public val EXITPUB_ACTIVEDIRECTORY: UInt = 2u

public val EXITPUB_DEFAULT_ENTERPRISE: UInt = 2u

public val EXITPUB_DEFAULT_STANDALONE: UInt = 1u

public val EXITPUB_FILE: UInt = 1u

public val EXITPUB_REMOVEOLDCERTS: UInt = 16u

public val EXTENSION_CRITICAL_FLAG: UInt = 1u

public val EXTENSION_DELETE_FLAG: UInt = 4u

public val EXTENSION_DISABLE_FLAG: UInt = 2u

public val EXTENSION_ORIGIN_ADMIN: UInt = 196608u

public val EXTENSION_ORIGIN_CACERT: UInt = 589824u

public val EXTENSION_ORIGIN_CMC: UInt = 524288u

public val EXTENSION_ORIGIN_IMPORTEDCERT: UInt = 393216u

public val EXTENSION_ORIGIN_MASK: UInt = 983040u

public val EXTENSION_ORIGIN_PKCS7: UInt = 458752u

public val EXTENSION_ORIGIN_POLICY: UInt = 131072u

public val EXTENSION_ORIGIN_RENEWALCERT: UInt = 327680u

public val EXTENSION_ORIGIN_REQUEST: UInt = 65536u

public val EXTENSION_ORIGIN_SERVER: UInt = 262144u

public val EXTENSION_POLICY_MASK: UInt = 65535u

public val ENROLL_DENIED: EnrollmentEnrollStatus = 256

public val ENROLL_ERROR: EnrollmentEnrollStatus = 16

public val ENROLL_PENDED: EnrollmentEnrollStatus = 2

public val ENROLL_PROMPT: WebEnrollmentFlags = 1

public val ENROLL_SKIPPED: EnrollmentEnrollStatus = 64

public val ENROLL_UI_DEFERRED_ENROLLMENT_REQUIRED: EnrollmentEnrollStatus = 4

public val ENROLL_UNKNOWN: EnrollmentEnrollStatus = 32

public val ENROLLED: EnrollmentEnrollStatus = 1

public val ENROLLMENT_ADD_OCSP_NO_CHECK: X509CertificateTemplateEnrollmentFlag = 4096

public val ENROLLMENT_ADD_TEMPLATE_NAME: X509CertificateTemplateEnrollmentFlag = 512

public val ENROLLMENT_ALLOW_ENROLL_ON_BEHALF_OF: X509CertificateTemplateEnrollmentFlag = 2048

public val ENROLLMENT_AUTO_ENROLLMENT: X509CertificateTemplateEnrollmentFlag = 32

public val ENROLLMENT_AUTO_ENROLLMENT_CHECK_USER_DS_CERTIFICATE: X509CertificateTemplateEnrollmentFlag = 16

public val ENROLLMENT_CERTIFICATE_ISSUANCE_POLICIES_FROM_REQUEST: X509CertificateTemplateEnrollmentFlag = 131072

public val ENROLLMENT_DOMAIN_AUTHENTICATION_NOT_REQUIRED: X509CertificateTemplateEnrollmentFlag = 128

public val ENROLLMENT_INCLUDE_BASIC_CONSTRAINTS_FOR_EE_CERTS: X509CertificateTemplateEnrollmentFlag = 32768

public val ENROLLMENT_INCLUDE_SYMMETRIC_ALGORITHMS: X509CertificateTemplateEnrollmentFlag = 1

public val ENROLLMENT_NO_REVOCATION_INFO_IN_CERTS: X509CertificateTemplateEnrollmentFlag = 16384

public val ENROLLMENT_PEND_ALL_REQUESTS: X509CertificateTemplateEnrollmentFlag = 2

public val ENROLLMENT_PREVIOUS_APPROVAL_KEY_BASED_VALIDATE_REENROLLMENT: X509CertificateTemplateEnrollmentFlag = 65536

public val ENROLLMENT_PREVIOUS_APPROVAL_VALIDATE_REENROLLMENT: X509CertificateTemplateEnrollmentFlag = 64

public val ENROLLMENT_PUBLISH_TO_DS: X509CertificateTemplateEnrollmentFlag = 8

public val ENROLLMENT_PUBLISH_TO_KRA_CONTAINER: X509CertificateTemplateEnrollmentFlag = 4

public val ENROLLMENT_REMOVE_INVALID_CERTIFICATE_FROM_PERSONAL_STORE: X509CertificateTemplateEnrollmentFlag = 1024

public val ENROLLMENT_REUSE_KEY_ON_FULL_SMART_CARD: X509CertificateTemplateEnrollmentFlag = 8192

public val ENROLLMENT_SKIP_AUTO_RENEWAL: X509CertificateTemplateEnrollmentFlag = 262144

public val ENROLLMENT_USER_INTERACTION_REQUIRED: X509CertificateTemplateEnrollmentFlag = 256

public val EXPORT_C_AS: X509EnrollmentPolicyExportFlags = 4

public val EXPORT_OI_DS: X509EnrollmentPolicyExportFlags = 2

public val EXPORT_TEMPLATES: X509EnrollmentPolicyExportFlags = 1

public val FR_PROP_ATTESTATIONCHALLENGE: FullResponsePropertyId = 20

public val FR_PROP_ATTESTATIONPROVIDERNAME: FullResponsePropertyId = 21

public val FR_PROP_BODYPARTSTRING: FullResponsePropertyId = 3

public val FR_PROP_CAEXCHANGECERTIFICATE: FullResponsePropertyId = 17

public val FR_PROP_CAEXCHANGECERTIFICATECHAIN: FullResponsePropertyId = 18

public val FR_PROP_CAEXCHANGECERTIFICATECRLCHAIN: FullResponsePropertyId = 19

public val FR_PROP_CAEXCHANGECERTIFICATEHASH: FullResponsePropertyId = 16

public val FR_PROP_CLAIMCHALLENGE: UInt = 22u

public val FR_PROP_ENCRYPTEDKEYHASH: FullResponsePropertyId = 14

public val FR_PROP_FAILINFO: FullResponsePropertyId = 7

public val FR_PROP_FULLRESPONSE: FullResponsePropertyId = 1

public val FR_PROP_FULLRESPONSENOPKCS7: FullResponsePropertyId = 15

public val FR_PROP_ISSUEDCERTIFICATE: FullResponsePropertyId = 11

public val FR_PROP_ISSUEDCERTIFICATECHAIN: FullResponsePropertyId = 12

public val FR_PROP_ISSUEDCERTIFICATECRLCHAIN: FullResponsePropertyId = 13

public val FR_PROP_ISSUEDCERTIFICATEHASH: FullResponsePropertyId = 10

public val FR_PROP_NONE: FullResponsePropertyId = 0

public val FR_PROP_OTHERINFOCHOICE: FullResponsePropertyId = 6

public val FR_PROP_PENDINFOTIME: FullResponsePropertyId = 9

public val FR_PROP_PENDINFOTOKEN: FullResponsePropertyId = 8

public val FR_PROP_STATUS: FullResponsePropertyId = 4

public val FR_PROP_STATUSINFOCOUNT: FullResponsePropertyId = 2

public val FR_PROP_STATUSSTRING: FullResponsePropertyId = 5

public val GENERAL_CA: X509CertificateTemplateGeneralFlag = 128

public val GENERAL_CROSS_CA: X509CertificateTemplateGeneralFlag = 2048

public val GENERAL_DEFAULT: X509CertificateTemplateGeneralFlag = 65536

public val GENERAL_DONOT_PERSIST: X509CertificateTemplateGeneralFlag = 4096

public val GENERAL_MACHINE_TYPE: X509CertificateTemplateGeneralFlag = 64

public val GENERAL_MODIFIED: X509CertificateTemplateGeneralFlag = 131072

public val ICF_ALLOWFOREIGN: UInt = 65536u

public val ICF_EXISTINGROW: UInt = 131072u

public val IF_ENABLEADMINASAUDITOR: UInt = 4096u

public val IF_ENABLEEXITKEYRETRIEVAL: UInt = 2048u

public val IF_ENFORCEENCRYPTICERTADMIN: UInt = 1024u

public val IF_ENFORCEENCRYPTICERTREQUEST: UInt = 512u

public val IF_LOCKICERTREQUEST: UInt = 1u

public val IF_NOLOCALICERTADMIN: UInt = 32u

public val IF_NOLOCALICERTADMINBACKUP: UInt = 128u

public val IF_NOLOCALICERTREQUEST: UInt = 4u

public val IF_NOREMOTEICERTADMIN: UInt = 16u

public val IF_NOREMOTEICERTADMINBACKUP: UInt = 64u

public val IF_NOREMOTEICERTREQUEST: UInt = 2u

public val IF_NORPCICERTREQUEST: UInt = 8u

public val IF_NOSNAPSHOTBACKUP: UInt = 256u

public val IKF_OVERWRITE: UInt = 65536u

public val ISSCERT_DEFAULT_DS: UInt = 256u

public val ISSCERT_DEFAULT_NODS: UInt = 256u

public val ISSCERT_ENABLE: UInt = 256u

public val ISSCERT_FILEURL_OLD: UInt = 8u

public val ISSCERT_FTPURL_OLD: UInt = 4u

public val ISSCERT_HTTPURL_OLD: UInt = 2u

public val ISSCERT_LDAPURL_OLD: UInt = 1u

public val ISSCERT_URLMASK_OLD: UInt = 255u

public val IMPORT_EXPORTABLE: ImportPFXFlags = 16

public val IMPORT_EXPORTABLE_ENCRYPTED: ImportPFXFlags = 32

public val IMPORT_FORCE_OVERWRITE: ImportPFXFlags = 2

public val IMPORT_INSTALL_CERTIFICATE: ImportPFXFlags = 512

public val IMPORT_INSTALL_CHAIN: ImportPFXFlags = 1024

public val IMPORT_INSTALL_CHAIN_AND_ROOT: ImportPFXFlags = 2048

public val IMPORT_MACHINE_CONTEXT: ImportPFXFlags = 1

public val IMPORT_NO_USER_PROTECTED: ImportPFXFlags = 64

public val IMPORT_NONE: ImportPFXFlags = 0

public val IMPORT_SAVE_PROPERTIES: ImportPFXFlags = 8

public val IMPORT_SILENT: ImportPFXFlags = 4

public val IMPORT_USER_PROTECTED: ImportPFXFlags = 128

public val IMPORT_USER_PROTECTED_HIGH: ImportPFXFlags = 256

public val INHERIT_DEFAULT: X509RequestInheritOptions = 0

public val INHERIT_EXTENSIONS_FLAG: X509RequestInheritOptions = 256

public val INHERIT_KEY_MASK: X509RequestInheritOptions = 15

public val INHERIT_NEW_DEFAULT_KEY: X509RequestInheritOptions = 1

public val INHERIT_NEW_SIMILAR_KEY: X509RequestInheritOptions = 2

public val INHERIT_NONE: X509RequestInheritOptions = 16

public val INHERIT_PRIVATE_KEY: X509RequestInheritOptions = 3

public val INHERIT_PUBLIC_KEY: X509RequestInheritOptions = 4

public val INHERIT_RENEWAL_CERTIFICATE_FLAG: X509RequestInheritOptions = 32

public val INHERIT_RESERVED80000000: X509RequestInheritOptions = -2147483648.toInt()

public val INHERIT_SUBJECT_ALT_NAME_FLAG: X509RequestInheritOptions = 512

public val INHERIT_SUBJECT_FLAG: X509RequestInheritOptions = 128

public val INHERIT_TEMPLATE_FLAG: X509RequestInheritOptions = 64

public val INHERIT_VALIDITY_PERIOD_FLAG: X509RequestInheritOptions = 1024

public val KRAF_DISABLEUSEDEFAULTPROVIDER: UInt = 8u

public val KRAF_ENABLEARCHIVEALL: UInt = 4u

public val KRAF_ENABLEFOREIGN: UInt = 1u

public val KRAF_SAVEBADREQUESTKEY: UInt = 2u

public val KRA_DISP_EXPIRED: UInt = 0u

public val KRA_DISP_INVALID: UInt = 4u

public val KRA_DISP_NOTFOUND: UInt = 1u

public val KRA_DISP_NOTLOADED: UInt = 6u

public val KRA_DISP_REVOKED: UInt = 2u

public val KRA_DISP_UNTRUSTED: UInt = 5u

public val KRA_DISP_VALID: UInt = 3u

public val KR_ENABLE_MACHINE: UInt = 1u

public val KR_ENABLE_USER: UInt = 2u

public val LDAPF_SIGNDISABLE: UInt = 2u

public val LDAPF_SSLENABLE: UInt = 1u

public val LEVEL_INNERMOST: InnerRequestLevel = 0

public val LEVEL_NEXT: InnerRequestLevel = 1

public val LEVEL_SAFE: WebSecurityLevel = 1

public val LEVEL_UNSAFE: WebSecurityLevel = 0

public val LOAD_OPTION_CACHE_ONLY: X509EnrollmentPolicyLoadOption = 1

public val LOAD_OPTION_DEFAULT: X509EnrollmentPolicyLoadOption = 0

public val LOAD_OPTION_REGISTER_FOR_AD_CHANGES: X509EnrollmentPolicyLoadOption = 4

public val LOAD_OPTION_RELOAD: X509EnrollmentPolicyLoadOption = 2

public val OCSP_ADMIN: Guid = Guid.fromU128(U128(0xd3f7351192c947cbuL, 0x8ff28d891a7c4de4uL))

public val OCSP_PROPERTY_COLLECTION: Guid = Guid.fromU128(U128(0xf935a528ba8a4dd9uL, 0xba79f283275cb2deuL))

public val OCSP_RF_REJECT_SIGNED_REQUESTS: OCSPRequestFlag = 1

public val OCSP_SF_ALLOW_NONCE_EXTENSION: OCSPSigningFlag = 256

public val OCSP_SF_ALLOW_SIGNINGCERT_AUTOENROLLMENT: OCSPSigningFlag = 512

public val OCSP_SF_ALLOW_SIGNINGCERT_AUTORENEWAL: OCSPSigningFlag = 4

public val OCSP_SF_AUTODISCOVER_SIGNINGCERT: OCSPSigningFlag = 16

public val OCSP_SF_FORCE_SIGNINGCERT_ISSUER_ISCA: OCSPSigningFlag = 8

public val OCSP_SF_MANUAL_ASSIGN_SIGNINGCERT: OCSPSigningFlag = 32

public val OCSP_SF_RESPONDER_ID_KEYHASH: OCSPSigningFlag = 64

public val OCSP_SF_RESPONDER_ID_NAME: OCSPSigningFlag = 128

public val OCSP_SF_SILENT: OCSPSigningFlag = 1

public val OCSP_SF_USE_CACERT: OCSPSigningFlag = 2

public val PFX_EXPORT_CHAIN_NO_ROOT: PFXExportOptions = 1

public val PFX_EXPORT_CHAIN_WITH_ROOT: PFXExportOptions = 2

public val PFX_EXPORT_EE_ONLY: PFXExportOptions = 0

public val PROCFLG_ENFORCEGOODKEYS: UInt = 1u

public val PROCFLG_NONE: UInt = 0u

public val PROPCALLER_ADMIN: UInt = 1024u

public val PROPCALLER_EXIT: UInt = 768u

public val PROPCALLER_MASK: UInt = 3840u

public val PROPCALLER_POLICY: UInt = 512u

public val PROPCALLER_REQUEST: UInt = 1280u

public val PROPCALLER_SERVER: UInt = 256u

public val PROPFLAGS_INDEXED: UInt = 65536u

public val PROPTYPE_BINARY: CertPropertyType = 3

public val PROPTYPE_DATE: CertPropertyType = 2

public val PROPTYPE_LONG: CertPropertyType = 1

public val PROPTYPE_MASK: UInt = 255u

public val PROPTYPE_STRING: CertPropertyType = 4

public val POLICY_QUALIFIER_TYPE_FLAGS: PolicyQualifierType = 3

public val POLICY_QUALIFIER_TYPE_UNKNOWN: PolicyQualifierType = 0

public val POLICY_QUALIFIER_TYPE_URL: PolicyQualifierType = 1

public val POLICY_QUALIFIER_TYPE_USER_NOTICE: PolicyQualifierType = 2

public val PRIVATE_KEY_ATTEST_MASK: X509CertificateTemplatePrivateKeyFlag = 12288

public val PRIVATE_KEY_ATTEST_NONE: X509CertificateTemplatePrivateKeyFlag = 0

public val PRIVATE_KEY_ATTEST_PREFERRED: X509CertificateTemplatePrivateKeyFlag = 4096

public val PRIVATE_KEY_ATTEST_REQUIRED: X509CertificateTemplatePrivateKeyFlag = 8192

public val PRIVATE_KEY_ATTEST_WITHOUT_POLICY: X509CertificateTemplatePrivateKeyFlag = 16384

public val PRIVATE_KEY_CLIENT_VERSION_MASK: X509CertificateTemplatePrivateKeyFlag = 251658240

public val PRIVATE_KEY_CLIENT_VERSION_SHIFT: X509CertificateTemplatePrivateKeyFlag = 24

public val PRIVATE_KEY_EK_TRUST_ON_USE: X509CertificateTemplatePrivateKeyFlag = 512

public val PRIVATE_KEY_EK_VALIDATE_CERT: X509CertificateTemplatePrivateKeyFlag = 1024

public val PRIVATE_KEY_EK_VALIDATE_KEY: X509CertificateTemplatePrivateKeyFlag = 2048

public val PRIVATE_KEY_EXPORTABLE: X509CertificateTemplatePrivateKeyFlag = 16

public val PRIVATE_KEY_HELLO_KSP_KEY: X509CertificateTemplatePrivateKeyFlag = 1048576

public val PRIVATE_KEY_HELLO_LOGON_KEY: X509CertificateTemplatePrivateKeyFlag = 2097152

public val PRIVATE_KEY_REQUIRE_ALTERNATE_SIGNATURE_ALGORITHM: X509CertificateTemplatePrivateKeyFlag = 64

public val PRIVATE_KEY_REQUIRE_ARCHIVAL: X509CertificateTemplatePrivateKeyFlag = 1

public val PRIVATE_KEY_REQUIRE_SAME_KEY_RENEWAL: X509CertificateTemplatePrivateKeyFlag = 128

public val PRIVATE_KEY_REQUIRE_STRONG_KEY_PROTECTION: X509CertificateTemplatePrivateKeyFlag = 32

public val PRIVATE_KEY_SERVER_VERSION_MASK: X509CertificateTemplatePrivateKeyFlag = 983040

public val PRIVATE_KEY_SERVER_VERSION_SHIFT: X509CertificateTemplatePrivateKeyFlag = 16

public val PRIVATE_KEY_USE_LEGACY_PROVIDER: X509CertificateTemplatePrivateKeyFlag = 256

public val PS_FRIENDLY_NAME: PolicyServerUrlPropertyID = 1

public val PS_POLICY_ID: PolicyServerUrlPropertyID = 0

public val PSF_ALLOW_UN_TRUSTED_CA: PolicyServerUrlFlags = 32

public val PSF_AUTO_ENROLLMENT_ENABLED: PolicyServerUrlFlags = 16

public val PSF_LOCATION_GROUP_POLICY: PolicyServerUrlFlags = 1

public val PSF_LOCATION_REGISTRY: PolicyServerUrlFlags = 2

public val PSF_NONE: PolicyServerUrlFlags = 0

public val PSF_USE_CLIENT_ID: PolicyServerUrlFlags = 4

public val REQDISP_DEFAULT_ENTERPRISE: UInt = 1u

public val REQDISP_DENY: UInt = 2u

public val REQDISP_ISSUE: UInt = 1u

public val REQDISP_MASK: UInt = 255u

public val REQDISP_PENDING: UInt = 0u

public val REQDISP_PENDINGFIRST: UInt = 256u

public val REQDISP_USEREQUESTATTRIBUTE: UInt = 3u

public val REVEXT_ASPENABLE: UInt = 512u

public val REVEXT_CDPENABLE: UInt = 256u

public val REVEXT_CDPFILEURL_OLD: UInt = 8u

public val REVEXT_CDPFTPURL_OLD: UInt = 4u

public val REVEXT_CDPHTTPURL_OLD: UInt = 2u

public val REVEXT_CDPLDAPURL_OLD: UInt = 1u

public val REVEXT_CDPURLMASK_OLD: UInt = 255u

public val REVEXT_DEFAULT_DS: UInt = 256u

public val REVEXT_DEFAULT_NODS: UInt = 256u

public val SCEP_DISPOSITION_FAILURE: X509SCEPDisposition = 2

public val SCEP_DISPOSITION_PENDING: X509SCEPDisposition = 3

public val SCEP_DISPOSITION_PENDING_CHALLENGE: X509SCEPDisposition = 11

public val SCEP_DISPOSITION_SUCCESS: X509SCEPDisposition = 0

public val SCEP_DISPOSITION_UNKNOWN: X509SCEPDisposition = -1

public val SCEP_FAIL_BAD_ALGORITHM: X509SCEPFailInfo = 0

public val SCEP_FAIL_BAD_CERT_ID: X509SCEPFailInfo = 4

public val SCEP_FAIL_BAD_MESSAGE_CHECK: X509SCEPFailInfo = 1

public val SCEP_FAIL_BAD_REQUEST: X509SCEPFailInfo = 2

public val SCEP_FAIL_BAD_TIME: X509SCEPFailInfo = 3

public val SCEP_FAIL_UNKNOWN: X509SCEPFailInfo = -1

public val SCEP_MESSAGE_CERT_RESPONSE: X509SCEPMessageType = 3

public val SCEP_MESSAGE_CLAIM_CHALLENGE_ANSWER: X509SCEPMessageType = 41

public val SCEP_MESSAGE_GET_CRL: X509SCEPMessageType = 22

public val SCEP_MESSAGE_GET_CERT: X509SCEPMessageType = 21

public val SCEP_MESSAGE_GET_CERT_INITIAL: X509SCEPMessageType = 20

public val SCEP_MESSAGE_PKCS_REQUEST: X509SCEPMessageType = 19

public val SCEP_MESSAGE_UNKNOWN: X509SCEPMessageType = -1

public val SCEP_PROCESS_DEFAULT: X509SCEPProcessMessageFlags = 0

public val SCEP_PROCESS_SKIP_CERT_INSTALL: X509SCEPProcessMessageFlags = 1

public val SETUP_ATTEMPT_VROOT_CREATE: UInt = 128u

public val SETUP_CLIENT_FLAG: UInt = 2u

public val SETUP_CREATEDB_FLAG: UInt = 64u

public val SETUP_DCOM_SECURITY_UPDATED_FLAG: UInt = 8192u

public val SETUP_DENIED_FLAG: UInt = 32u

public val SETUP_FORCECRL_FLAG: UInt = 256u

public val SETUP_ONLINE_FLAG: UInt = 16u

public val SETUP_REQUEST_FLAG: UInt = 8u

public val SETUP_SECURITY_CHANGED: UInt = 4096u

public val SETUP_SERVER_FLAG: UInt = 1u

public val SETUP_SERVER_IS_UP_TO_DATE_FLAG: UInt = 16384u

public val SETUP_SERVER_UPGRADED_FLAG: UInt = 1024u

public val SETUP_SUSPEND_FLAG: UInt = 4u

public val SETUP_UPDATE_CAOBJECT_SVRTYPE: UInt = 512u

public val SETUP_W2K_SECURITY_NOT_UPGRADED_FLAG: UInt = 2048u

public val SKI_HASH_CAPI_SHA1: KeyIdentifierHashAlgorithm = 2

public val SKI_HASH_DEFAULT: KeyIdentifierHashAlgorithm = 0

public val SKI_HASH_HPKP: KeyIdentifierHashAlgorithm = 5

public val SKI_HASH_SHA1: KeyIdentifierHashAlgorithm = 1

public val SKI_HASH_SHA256: KeyIdentifierHashAlgorithm = 3

public val SELECTED_NO: EnrollmentSelectionStatus = 0

public val SELECTED_YES: EnrollmentSelectionStatus = 1

public val SUBJECT_ALTERNATIVE_NAME_ENROLLEE_SUPPLIES: X509CertificateTemplateSubjectNameFlag = 65536

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_DNS: X509CertificateTemplateSubjectNameFlag = 134217728

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_DIRECTORY_GUID: X509CertificateTemplateSubjectNameFlag = 16777216

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_DOMAIN_DNS: X509CertificateTemplateSubjectNameFlag = 4194304

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_EMAIL: X509CertificateTemplateSubjectNameFlag = 67108864

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_SPN: X509CertificateTemplateSubjectNameFlag = 8388608

public val SUBJECT_ALTERNATIVE_NAME_REQUIRE_UPN: X509CertificateTemplateSubjectNameFlag = 33554432

public val SUBJECT_NAME_AND_ALTERNATIVE_NAME_OLD_CERT_SUPPLIES: X509CertificateTemplateSubjectNameFlag = 8

public val SUBJECT_NAME_ENROLLEE_SUPPLIES: X509CertificateTemplateSubjectNameFlag = 1

public val SUBJECT_NAME_REQUIRE_COMMON_NAME: X509CertificateTemplateSubjectNameFlag = 1073741824

public val SUBJECT_NAME_REQUIRE_DNS: X509CertificateTemplateSubjectNameFlag = 268435456

public val SUBJECT_NAME_REQUIRE_DIRECTORY_PATH: X509CertificateTemplateSubjectNameFlag = -2147483648.toInt()

public val SUBJECT_NAME_REQUIRE_EMAIL: X509CertificateTemplateSubjectNameFlag = 536870912

public val TP_MACHINEPOLICY: UInt = 1u

public val TEMPLATE_PROP_ASYMMETRIC_ALGORITHM: EnrollmentTemplateProperty = 18

public val TEMPLATE_PROP_CERTIFICATE_POLICIES: EnrollmentTemplateProperty = 16

public val TEMPLATE_PROP_COMMON_NAME: EnrollmentTemplateProperty = 1

public val TEMPLATE_PROP_CRYPTO_PROVIDERS: EnrollmentTemplateProperty = 4

public val TEMPLATE_PROP_DESCRIPTION: EnrollmentTemplateProperty = 6

public val TEMPLATE_PROP_EK_US: EnrollmentTemplateProperty = 3

public val TEMPLATE_PROP_ENROLLMENT_FLAGS: EnrollmentTemplateProperty = 24

public val TEMPLATE_PROP_EXTENSIONS: EnrollmentTemplateProperty = 29

public val TEMPLATE_PROP_FRIENDLY_NAME: EnrollmentTemplateProperty = 2

public val TEMPLATE_PROP_GENERAL_FLAGS: EnrollmentTemplateProperty = 27

public val TEMPLATE_PROP_HASH_ALGORITHM: EnrollmentTemplateProperty = 22

public val TEMPLATE_PROP_KEY_SECURITY_DESCRIPTOR: EnrollmentTemplateProperty = 19

public val TEMPLATE_PROP_KEY_SPEC: EnrollmentTemplateProperty = 7

public val TEMPLATE_PROP_KEY_USAGE: EnrollmentTemplateProperty = 23

public val TEMPLATE_PROP_MAJOR_REVISION: EnrollmentTemplateProperty = 5

public val TEMPLATE_PROP_MINIMUM_KEY_SIZE: EnrollmentTemplateProperty = 11

public val TEMPLATE_PROP_MINOR_REVISION: EnrollmentTemplateProperty = 9

public val TEMPLATE_PROP_OID: EnrollmentTemplateProperty = 12

public val TEMPLATE_PROP_PRIVATE_KEY_FLAGS: EnrollmentTemplateProperty = 26

public val TEMPLATE_PROP_RA_CERTIFICATE_POLICIES: EnrollmentTemplateProperty = 14

public val TEMPLATE_PROP_RAEK_US: EnrollmentTemplateProperty = 15

public val TEMPLATE_PROP_RA_SIGNATURE_COUNT: EnrollmentTemplateProperty = 10

public val TEMPLATE_PROP_RENEWAL_PERIOD: EnrollmentTemplateProperty = 31

public val TEMPLATE_PROP_SCHEMA_VERSION: EnrollmentTemplateProperty = 8

public val TEMPLATE_PROP_SECURITY_DESCRIPTOR: EnrollmentTemplateProperty = 28

public val TEMPLATE_PROP_SUBJECT_NAME_FLAGS: EnrollmentTemplateProperty = 25

public val TEMPLATE_PROP_SUPERSEDE: EnrollmentTemplateProperty = 13

public val TEMPLATE_PROP_SYMMETRIC_ALGORITHM: EnrollmentTemplateProperty = 20

public val TEMPLATE_PROP_SYMMETRIC_KEY_LENGTH: EnrollmentTemplateProperty = 21

public val TEMPLATE_PROP_V1APPLICATION_POLICY: EnrollmentTemplateProperty = 17

public val TEMPLATE_PROP_VALIDITY_PERIOD: EnrollmentTemplateProperty = 30

public val TYPE_ANY: X509RequestType = 0

public val TYPE_CERTIFICATE: X509RequestType = 4

public val TYPE_CMC: X509RequestType = 3

public val TYPE_PKCS10: X509RequestType = 1

public val TYPE_PKCS7: X509RequestType = 2

public val VR_INSTANT_BAD: UInt = 2u

public val VR_INSTANT_OK: UInt = 1u

public val VR_PENDING: UInt = 0u

public val VERIFY_ALLOW_UI: X509PrivateKeyVerify = 4

public val VERIFY_NONE: X509PrivateKeyVerify = 0

public val VERIFY_SILENT: X509PrivateKeyVerify = 1

public val VERIFY_SMART_CARD_NONE: X509PrivateKeyVerify = 2

public val VERIFY_SMART_CARD_SILENT: X509PrivateKeyVerify = 3

public val X509AUTH_ANONYMOUS: X509EnrollmentAuthFlags = 1

public val X509AUTH_CERTIFICATE: X509EnrollmentAuthFlags = 8

public val X509AUTH_KERBEROS: X509EnrollmentAuthFlags = 2

public val X509AUTH_NONE: X509EnrollmentAuthFlags = 0

public val X509AUTH_USERNAME: X509EnrollmentAuthFlags = 4

public val XCN_AT_KEYEXCHANGE: X509KeySpec = 1

public val XCN_AT_NONE: X509KeySpec = 0

public val XCN_AT_SIGNATURE: X509KeySpec = 2

public val XCN_BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE: AlgorithmType = 3

public val XCN_BCRYPT_CIPHER_INTERFACE: AlgorithmType = 1

public val XCN_BCRYPT_HASH_INTERFACE: AlgorithmType = 2

public val XCN_BCRYPT_KEY_DERIVATION_INTERFACE: AlgorithmType = 7

public val XCN_BCRYPT_RNG_INTERFACE: AlgorithmType = 6

public val XCN_BCRYPT_SECRET_AGREEMENT_INTERFACE: AlgorithmType = 4

public val XCN_BCRYPT_SIGNATURE_INTERFACE: AlgorithmType = 5

public val XCN_BCRYPT_UNKNOWN_INTERFACE: AlgorithmType = 0

public val XCN_CERT_ACCESS_STATE_PROP_ID: CertenrollPropertyid = 14

public val XCN_CERT_AIA_URL_RETRIEVED_PROP_ID: CertenrollPropertyid = 67

public val XCN_CERT_ALT_NAME_DIRECTORY_NAME: AlternativeNameType = 5

public val XCN_CERT_ALT_NAME_DNS_NAME: AlternativeNameType = 3

public val XCN_CERT_ALT_NAME_EDI_PARTY_NAME: AlternativeNameType = 6

public val XCN_CERT_ALT_NAME_GUID: AlternativeNameType = 10

public val XCN_CERT_ALT_NAME_IP_ADDRESS: AlternativeNameType = 8

public val XCN_CERT_ALT_NAME_OTHER_NAME: AlternativeNameType = 1

public val XCN_CERT_ALT_NAME_REGISTERED_ID: AlternativeNameType = 9

public val XCN_CERT_ALT_NAME_RFC822_NAME: AlternativeNameType = 2

public val XCN_CERT_ALT_NAME_UNKNOWN: AlternativeNameType = 0

public val XCN_CERT_ALT_NAME_URL: AlternativeNameType = 7

public val XCN_CERT_ALT_NAME_USER_PRINCIPLE_NAME: AlternativeNameType = 11

public val XCN_CERT_ALT_NAME_X400_ADDRESS: AlternativeNameType = 4

public val XCN_CERT_ARCHIVED_KEY_HASH_PROP_ID: CertenrollPropertyid = 65

public val XCN_CERT_ARCHIVED_PROP_ID: CertenrollPropertyid = 19

public val XCN_CERT_AUTHORITY_INFO_ACCESS_PROP_ID: CertenrollPropertyid = 68

public val XCN_CERT_AUTH_ROOT_SHA256_HASH_PROP_ID: CertenrollPropertyid = 98

public val XCN_CERT_AUTO_ENROLL_PROP_ID: CertenrollPropertyid = 21

public val XCN_CERT_AUTO_ENROLL_RETRY_PROP_ID: CertenrollPropertyid = 66

public val XCN_CERT_BACKED_UP_PROP_ID: CertenrollPropertyid = 69

public val XCN_CERT_CA_DISABLE_CRL_PROP_ID: CertenrollPropertyid = 82

public val XCN_CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: CertenrollPropertyid = 81

public val XCN_CERT_CEP_PROP_ID: CertenrollPropertyid = 87

public val XCN_CERT_CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID: CertenrollPropertyid = 127

public val XCN_CERT_CLR_DELETE_KEY_PROP_ID: CertenrollPropertyid = 125

public val XCN_CERT_CRL_SIGN_KEY_USAGE: X509KeyUsageFlags = 2

public val XCN_CERT_CROSS_CERT_DIST_POINTS_PROP_ID: CertenrollPropertyid = 23

public val XCN_CERT_CTL_USAGE_PROP_ID: CertenrollPropertyid = 9

public val XCN_CERT_DATA_ENCIPHERMENT_KEY_USAGE: X509KeyUsageFlags = 16

public val XCN_CERT_DATE_STAMP_PROP_ID: CertenrollPropertyid = 27

public val XCN_CERT_DECIPHER_ONLY_KEY_USAGE: X509KeyUsageFlags = 32768

public val XCN_CERT_DESCRIPTION_PROP_ID: CertenrollPropertyid = 13

public val XCN_CERT_DIGITAL_SIGNATURE_KEY_USAGE: X509KeyUsageFlags = 128

public val XCN_CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID: CertenrollPropertyid = 122

public val XCN_CERT_DISALLOWED_FILETIME_PROP_ID: CertenrollPropertyid = 104

public val XCN_CERT_EFS_PROP_ID: CertenrollPropertyid = 17

public val XCN_CERT_ENCIPHER_ONLY_KEY_USAGE: X509KeyUsageFlags = 1

public val XCN_CERT_ENHKEY_USAGE_PROP_ID: CertenrollPropertyid = 9

public val XCN_CERT_ENROLLMENT_PROP_ID: CertenrollPropertyid = 26

public val XCN_CERT_EXTENDED_ERROR_INFO_PROP_ID: CertenrollPropertyid = 30

public val XCN_CERT_FIRST_RESERVED_PROP_ID: CertenrollPropertyid = 129

public val XCN_CERT_FIRST_USER_PROP_ID: CertenrollPropertyid = 32768

public val XCN_CERT_FORTEZZA_DATA_PROP_ID: CertenrollPropertyid = 18

public val XCN_CERT_FRIENDLY_NAME_PROP_ID: CertenrollPropertyid = 11

public val XCN_CERT_HASH_PROP_ID: CertenrollPropertyid = 3

public val XCN_CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID: CertenrollPropertyid = 79

public val XCN_CERT_HCRYPTPROV_TRANSFER_PROP_ID: CertenrollPropertyid = 100

public val XCN_CERT_IE30_RESERVED_PROP_ID: CertenrollPropertyid = 7

public val XCN_CERT_ISOLATED_KEY_PROP_ID: CertenrollPropertyid = 118

public val XCN_CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: CertenrollPropertyid = 96

public val XCN_CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID: CertenrollPropertyid = 95

public val XCN_CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID: CertenrollPropertyid = 24

public val XCN_CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID: CertenrollPropertyid = 94

public val XCN_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: CertenrollPropertyid = 28

public val XCN_CERT_KEY_AGREEMENT_KEY_USAGE: X509KeyUsageFlags = 8

public val XCN_CERT_KEY_CERT_SIGN_KEY_USAGE: X509KeyUsageFlags = 4

public val XCN_CERT_KEY_CLASSIFICATION_PROP_ID: CertenrollPropertyid = 120

public val XCN_CERT_KEY_CONTEXT_PROP_ID: CertenrollPropertyid = 5

public val XCN_CERT_KEY_ENCIPHERMENT_KEY_USAGE: X509KeyUsageFlags = 32

public val XCN_CERT_KEY_IDENTIFIER_PROP_ID: CertenrollPropertyid = 20

public val XCN_CERT_KEY_PROV_HANDLE_PROP_ID: CertenrollPropertyid = 1

public val XCN_CERT_KEY_PROV_INFO_PROP_ID: CertenrollPropertyid = 2

public val XCN_CERT_KEY_REPAIR_ATTEMPTED_PROP_ID: CertenrollPropertyid = 103

public val XCN_CERT_KEY_SPEC_PROP_ID: CertenrollPropertyid = 6

public val XCN_CERT_LAST_RESERVED_PROP_ID: CertenrollPropertyid = 32767

public val XCN_CERT_LAST_USER_PROP_ID: CertenrollPropertyid = 65535

public val XCN_CERT_MD5_HASH_PROP_ID: CertenrollPropertyid = 4

public val XCN_CERT_NAME_STR_AMBIGUOUS_SEPARATOR_FLAGS: X500NameFlags = 1275068416

public val XCN_CERT_NAME_STR_COMMA_FLAG: X500NameFlags = 67108864

public val XCN_CERT_NAME_STR_CRLF_FLAG: X500NameFlags = 134217728

public val XCN_CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG: X500NameFlags = 65536

public val XCN_CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG: X500NameFlags = 1048576

public val XCN_CERT_NAME_STR_DS_ESCAPED: X500NameFlags = 8388608

public val XCN_CERT_NAME_STR_ENABLE_PUNYCODE_FLAG: X500NameFlags = 2097152

public val XCN_CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG: X500NameFlags = 131072

public val XCN_CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG: X500NameFlags = 262144

public val XCN_CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG: X500NameFlags = 524288

public val XCN_CERT_NAME_STR_FORWARD_FLAG: X500NameFlags = 16777216

public val XCN_CERT_NAME_STR_NONE: X500NameFlags = 0

public val XCN_CERT_NAME_STR_NO_PLUS_FLAG: X500NameFlags = 536870912

public val XCN_CERT_NAME_STR_NO_QUOTING_FLAG: X500NameFlags = 268435456

public val XCN_CERT_NAME_STR_REVERSE_FLAG: X500NameFlags = 33554432

public val XCN_CERT_NAME_STR_SEMICOLON_FLAG: X500NameFlags = 1073741824

public val XCN_CERT_NCRYPT_KEY_HANDLE_PROP_ID: CertenrollPropertyid = 78

public val XCN_CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID: CertenrollPropertyid = 99

public val XCN_CERT_NEW_KEY_PROP_ID: CertenrollPropertyid = 74

public val XCN_CERT_NEXT_UPDATE_LOCATION_PROP_ID: CertenrollPropertyid = 10

public val XCN_CERT_NONCOMPLIANT_ROOT_URL_PROP_ID: CertenrollPropertyid = 123

public val XCN_CERT_NON_REPUDIATION_KEY_USAGE: X509KeyUsageFlags = 64

public val XCN_CERT_NOT_BEFORE_FILETIME_PROP_ID: CertenrollPropertyid = 126

public val XCN_CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID: CertenrollPropertyid = 77

public val XCN_CERT_NO_EXPIRE_NOTIFICATION_PROP_ID: CertenrollPropertyid = 97

public val XCN_CERT_NO_KEY_USAGE: X509KeyUsageFlags = 0

public val XCN_CERT_OCSP_CACHE_PREFIX_PROP_ID: CertenrollPropertyid = 75

public val XCN_CERT_OCSP_RESPONSE_PROP_ID: CertenrollPropertyid = 70

public val XCN_CERT_OFFLINE_CRL_SIGN_KEY_USAGE: X509KeyUsageFlags = 2

public val XCN_CERT_OID_NAME_STR: X500NameFlags = 2

public val XCN_CERT_PIN_SHA256_HASH_PROP_ID: CertenrollPropertyid = 124

public val XCN_CERT_PUBKEY_ALG_PARA_PROP_ID: CertenrollPropertyid = 22

public val XCN_CERT_PUBKEY_HASH_RESERVED_PROP_ID: CertenrollPropertyid = 8

public val XCN_CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: CertenrollPropertyid = 93

public val XCN_CERT_PVK_FILE_PROP_ID: CertenrollPropertyid = 12

public val XCN_CERT_RENEWAL_PROP_ID: CertenrollPropertyid = 64

public val XCN_CERT_REQUEST_ORIGINATOR_PROP_ID: CertenrollPropertyid = 71

public val XCN_CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID: CertenrollPropertyid = 83

public val XCN_CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID: CertenrollPropertyid = 105

public val XCN_CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID: CertenrollPropertyid = 84

public val XCN_CERT_SCARD_PIN_ID_PROP_ID: CertenrollPropertyid = 90

public val XCN_CERT_SCARD_PIN_INFO_PROP_ID: CertenrollPropertyid = 91

public val XCN_CERT_SCEP_CA_CERT_PROP_ID: CertenrollPropertyid = 111

public val XCN_CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID: CertenrollPropertyid = 114

public val XCN_CERT_SCEP_FLAGS_PROP_ID: CertenrollPropertyid = 115

public val XCN_CERT_SCEP_GUID_PROP_ID: CertenrollPropertyid = 116

public val XCN_CERT_SCEP_NONCE_PROP_ID: CertenrollPropertyid = 113

public val XCN_CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID: CertenrollPropertyid = 110

public val XCN_CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID: CertenrollPropertyid = 109

public val XCN_CERT_SCEP_SERVER_CERTS_PROP_ID: CertenrollPropertyid = 108

public val XCN_CERT_SCEP_SIGNER_CERT_PROP_ID: CertenrollPropertyid = 112

public val XCN_CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID: CertenrollPropertyid = 102

public val XCN_CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID: CertenrollPropertyid = 117

public val XCN_CERT_SERIAL_CHAIN_PROP_ID: CertenrollPropertyid = 119

public val XCN_CERT_SHA1_HASH_PROP_ID: CertenrollPropertyid = 3

public val XCN_CERT_SHA256_HASH_PROP_ID: CertenrollPropertyid = 107

public val XCN_CERT_SIGNATURE_HASH_PROP_ID: CertenrollPropertyid = 15

public val XCN_CERT_SIGN_HASH_CNG_ALG_PROP_ID: CertenrollPropertyid = 89

public val XCN_CERT_SIMPLE_NAME_STR: X500NameFlags = 1

public val XCN_CERT_SMART_CARD_DATA_PROP_ID: CertenrollPropertyid = 16

public val XCN_CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID: CertenrollPropertyid = 106

public val XCN_CERT_SMART_CARD_READER_PROP_ID: CertenrollPropertyid = 101

public val XCN_CERT_SMART_CARD_ROOT_INFO_PROP_ID: CertenrollPropertyid = 76

public val XCN_CERT_SOURCE_LOCATION_PROP_ID: CertenrollPropertyid = 72

public val XCN_CERT_SOURCE_URL_PROP_ID: CertenrollPropertyid = 73

public val XCN_CERT_STORE_LOCALIZED_NAME_PROP_ID: CertenrollPropertyid = 4096

public val XCN_CERT_SUBJECT_DISABLE_CRL_PROP_ID: CertenrollPropertyid = 86

public val XCN_CERT_SUBJECT_INFO_ACCESS_PROP_ID: CertenrollPropertyid = 80

public val XCN_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: CertenrollPropertyid = 29

public val XCN_CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: CertenrollPropertyid = 85

public val XCN_CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID: CertenrollPropertyid = 25

public val XCN_CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID: CertenrollPropertyid = 92

public val XCN_CERT_X500_NAME_STR: X500NameFlags = 3

public val XCN_CERT_XML_NAME_STR: X500NameFlags = 4

public val XCN_CRL_REASON_AA_COMPROMISE: CRLRevocationReason = 10

public val XCN_CRL_REASON_AFFILIATION_CHANGED: CRLRevocationReason = 3

public val XCN_CRL_REASON_CA_COMPROMISE: CRLRevocationReason = 2

public val XCN_CRL_REASON_CERTIFICATE_HOLD: CRLRevocationReason = 6

public val XCN_CRL_REASON_CESSATION_OF_OPERATION: CRLRevocationReason = 5

public val XCN_CRL_REASON_KEY_COMPROMISE: CRLRevocationReason = 1

public val XCN_CRL_REASON_PRIVILEGE_WITHDRAWN: CRLRevocationReason = 9

public val XCN_CRL_REASON_REMOVE_FROM_CRL: CRLRevocationReason = 8

public val XCN_CRL_REASON_SUPERSEDED: CRLRevocationReason = 4

public val XCN_CRL_REASON_UNSPECIFIED: CRLRevocationReason = 0

public val XCN_CRYPT_ANY_GROUP_ID: ObjectIdGroupId = 0

public val XCN_CRYPT_ENCRYPT_ALG_OID_GROUP_ID: ObjectIdGroupId = 2

public val XCN_CRYPT_ENHKEY_USAGE_OID_GROUP_ID: ObjectIdGroupId = 7

public val XCN_CRYPT_EXT_OR_ATTR_OID_GROUP_ID: ObjectIdGroupId = 6

public val XCN_CRYPT_FIRST_ALG_OID_GROUP_ID: ObjectIdGroupId = 1

public val XCN_CRYPT_GROUP_ID_MASK: ObjectIdGroupId = 65535

public val XCN_CRYPT_HASH_ALG_OID_GROUP_ID: ObjectIdGroupId = 1

public val XCN_CRYPT_KDF_OID_GROUP_ID: ObjectIdGroupId = 10

public val XCN_CRYPT_KEY_LENGTH_MASK: ObjectIdGroupId = 268369920

public val XCN_CRYPT_LAST_ALG_OID_GROUP_ID: ObjectIdGroupId = 4

public val XCN_CRYPT_LAST_OID_GROUP_ID: ObjectIdGroupId = 10

public val XCN_CRYPT_OID_DISABLE_SEARCH_DS_FLAG: ObjectIdGroupId = -2147483648.toInt()

public val XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK: ObjectIdGroupId = 268369920

public val XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT: ObjectIdGroupId = 16

public val XCN_CRYPT_OID_INFO_PUBKEY_ANY: ObjectIdPublicKeyFlags = 0

public val XCN_CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG: ObjectIdPublicKeyFlags = 1073741824

public val XCN_CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG: ObjectIdPublicKeyFlags = -2147483648.toInt()

public val XCN_CRYPT_OID_PREFER_CNG_ALGID_FLAG: ObjectIdGroupId = 1073741824

public val XCN_CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG: X509KeyParametersExportType = 536870912

public val XCN_CRYPT_OID_USE_CURVE_NONE: X509KeyParametersExportType = 0

public val XCN_CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG: X509KeyParametersExportType = 268435456

public val XCN_CRYPT_POLICY_OID_GROUP_ID: ObjectIdGroupId = 8

public val XCN_CRYPT_PUBKEY_ALG_OID_GROUP_ID: ObjectIdGroupId = 3

public val XCN_CRYPT_RDN_ATTR_OID_GROUP_ID: ObjectIdGroupId = 5

public val XCN_CRYPT_SIGN_ALG_OID_GROUP_ID: ObjectIdGroupId = 4

public val XCN_CRYPT_STRING_ANY: EncodingType = 7

public val XCN_CRYPT_STRING_BASE64: EncodingType = 1

public val XCN_CRYPT_STRING_BASE64HEADER: EncodingType = 0

public val XCN_CRYPT_STRING_BASE64REQUESTHEADER: EncodingType = 3

public val XCN_CRYPT_STRING_BASE64URI: EncodingType = 13

public val XCN_CRYPT_STRING_BASE64X509CRLHEADER: EncodingType = 9

public val XCN_CRYPT_STRING_BASE64_ANY: EncodingType = 6

public val XCN_CRYPT_STRING_BINARY: EncodingType = 2

public val XCN_CRYPT_STRING_CHAIN: EncodingType = 256

public val XCN_CRYPT_STRING_ENCODEMASK: EncodingType = 255

public val XCN_CRYPT_STRING_HASHDATA: EncodingType = 268435456

public val XCN_CRYPT_STRING_HEX: EncodingType = 4

public val XCN_CRYPT_STRING_HEXADDR: EncodingType = 10

public val XCN_CRYPT_STRING_HEXASCII: EncodingType = 5

public val XCN_CRYPT_STRING_HEXASCIIADDR: EncodingType = 11

public val XCN_CRYPT_STRING_HEXRAW: EncodingType = 12

public val XCN_CRYPT_STRING_HEX_ANY: EncodingType = 8

public val XCN_CRYPT_STRING_NOCR: EncodingType = -2147483648.toInt()

public val XCN_CRYPT_STRING_NOCRLF: EncodingType = 1073741824

public val XCN_CRYPT_STRING_PERCENTESCAPE: EncodingType = 134217728

public val XCN_CRYPT_STRING_STRICT: EncodingType = 536870912

public val XCN_CRYPT_STRING_TEXT: EncodingType = 512

public val XCN_CRYPT_TEMPLATE_OID_GROUP_ID: ObjectIdGroupId = 9

public val XCN_NCRYPT_ALLOW_ALL_USAGES: X509PrivateKeyUsageFlags = 16777215

public val XCN_NCRYPT_ALLOW_ARCHIVING_FLAG: X509PrivateKeyExportFlags = 4

public val XCN_NCRYPT_ALLOW_DECRYPT_FLAG: X509PrivateKeyUsageFlags = 1

public val XCN_NCRYPT_ALLOW_EXPORT_FLAG: X509PrivateKeyExportFlags = 1

public val XCN_NCRYPT_ALLOW_EXPORT_NONE: X509PrivateKeyExportFlags = 0

public val XCN_NCRYPT_ALLOW_KEY_AGREEMENT_FLAG: X509PrivateKeyUsageFlags = 4

public val XCN_NCRYPT_ALLOW_KEY_IMPORT_FLAG: X509PrivateKeyUsageFlags = 8

public val XCN_NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG: X509PrivateKeyExportFlags = 8

public val XCN_NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG: X509PrivateKeyExportFlags = 2

public val XCN_NCRYPT_ALLOW_SIGNING_FLAG: X509PrivateKeyUsageFlags = 2

public val XCN_NCRYPT_ALLOW_USAGES_NONE: X509PrivateKeyUsageFlags = 0

public val XCN_NCRYPT_ANY_ASYMMETRIC_OPERATION: AlgorithmOperationFlags = 28

public val XCN_NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION: AlgorithmOperationFlags = 4

public val XCN_NCRYPT_CIPHER_OPERATION: AlgorithmOperationFlags = 1

public val XCN_NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT: KeyAttestationClaimType = 3

public val XCN_NCRYPT_CLAIM_AUTHORITY_ONLY: KeyAttestationClaimType = 1

public val XCN_NCRYPT_CLAIM_NONE: KeyAttestationClaimType = 0

public val XCN_NCRYPT_CLAIM_SUBJECT_ONLY: KeyAttestationClaimType = 2

public val XCN_NCRYPT_CLAIM_UNKNOWN: KeyAttestationClaimType = 4096

public val XCN_NCRYPT_EXACT_MATCH_OPERATION: AlgorithmOperationFlags = 8388608

public val XCN_NCRYPT_HASH_OPERATION: AlgorithmOperationFlags = 2

public val XCN_NCRYPT_KEY_DERIVATION_OPERATION: AlgorithmOperationFlags = 64

public val XCN_NCRYPT_NO_OPERATION: AlgorithmOperationFlags = 0

public val XCN_NCRYPT_PCP_ENCRYPTION_KEY: X509HardwareKeyUsageFlags = 2

public val XCN_NCRYPT_PCP_GENERIC_KEY: X509HardwareKeyUsageFlags = 3

public val XCN_NCRYPT_PCP_IDENTITY_KEY: X509HardwareKeyUsageFlags = 8

public val XCN_NCRYPT_PCP_NONE: X509HardwareKeyUsageFlags = 0

public val XCN_NCRYPT_PCP_SIGNATURE_KEY: X509HardwareKeyUsageFlags = 1

public val XCN_NCRYPT_PCP_STORAGE_KEY: X509HardwareKeyUsageFlags = 4

public val XCN_NCRYPT_PREFERENCE_MASK_OPERATION: AlgorithmOperationFlags = 14680064

public val XCN_NCRYPT_PREFER_NON_SIGNATURE_OPERATION: AlgorithmOperationFlags = 4194304

public val XCN_NCRYPT_PREFER_SIGNATURE_ONLY_OPERATION: AlgorithmOperationFlags = 2097152

public val XCN_NCRYPT_RNG_OPERATION: AlgorithmOperationFlags = 32

public val XCN_NCRYPT_SECRET_AGREEMENT_OPERATION: AlgorithmOperationFlags = 8

public val XCN_NCRYPT_SIGNATURE_OPERATION: AlgorithmOperationFlags = 16

public val XCN_NCRYPT_TPM12_PROVIDER: X509HardwareKeyUsageFlags = 65536

public val XCN_NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG: X509PrivateKeyProtection = 8

public val XCN_NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG: X509PrivateKeyProtection = 4

public val XCN_NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG: X509PrivateKeyProtection = 2

public val XCN_NCRYPT_UI_NO_PROTECTION_FLAG: X509PrivateKeyProtection = 0

public val XCN_NCRYPT_UI_PROTECT_KEY_FLAG: X509PrivateKeyProtection = 1

public val XCN_OID_VERISIGN_FAIL_INFO: CertenrollObjectid = 431

public val XCN_OID_VERISIGN_MESSAGE_TYPE: CertenrollObjectid = 429

public val XCN_OID_VERISIGN_PKI_STATUS: CertenrollObjectid = 430

public val XCN_OID_VERISIGN_RECIPIENT_NONCE: CertenrollObjectid = 433

public val XCN_OID_VERISIGN_SENDER_NONCE: CertenrollObjectid = 432

public val XCN_OID_VERISIGN_TRANSACTION_ID: CertenrollObjectid = 434

public val XCN_OID_ANSI_X942: CertenrollObjectid = 53

public val XCN_OID_ANSI_X942_DH: CertenrollObjectid = 54

public val XCN_OID_ANY_APPLICATION_POLICY: CertenrollObjectid = 216

public val XCN_OID_ANY_CERT_POLICY: CertenrollObjectid = 180

public val XCN_OID_ANY_ENHANCED_KEY_USAGE: CertenrollObjectid = 352

public val XCN_OID_APPLICATION_CERT_POLICIES: CertenrollObjectid = 229

public val XCN_OID_APPLICATION_POLICY_CONSTRAINTS: CertenrollObjectid = 231

public val XCN_OID_APPLICATION_POLICY_MAPPINGS: CertenrollObjectid = 230

public val XCN_OID_ARCHIVED_KEY_ATTR: CertenrollObjectid = 232

public val XCN_OID_ARCHIVED_KEY_CERT_HASH: CertenrollObjectid = 235

public val XCN_OID_ATTR_SUPPORTED_ALGORITHMS: CertenrollObjectid = 355

public val XCN_OID_ATTR_TPM_SECURITY_ASSERTIONS: CertenrollObjectid = 356

public val XCN_OID_ATTR_TPM_SPECIFICATION: CertenrollObjectid = 357

public val XCN_OID_AUTHORITY_INFO_ACCESS: CertenrollObjectid = 204

public val XCN_OID_AUTHORITY_KEY_IDENTIFIER: CertenrollObjectid = 169

public val XCN_OID_AUTHORITY_KEY_IDENTIFIER2: CertenrollObjectid = 181

public val XCN_OID_AUTHORITY_REVOCATION_LIST: CertenrollObjectid = 156

public val XCN_OID_AUTO_ENROLL_CTL_USAGE: CertenrollObjectid = 217

public val XCN_OID_BACKGROUND_OTHER_LOGOTYPE: CertenrollObjectid = 327

public val XCN_OID_BASIC_CONSTRAINTS: CertenrollObjectid = 175

public val XCN_OID_BASIC_CONSTRAINTS2: CertenrollObjectid = 178

public val XCN_OID_BIOMETRIC_EXT: CertenrollObjectid = 205

public val XCN_OID_BUSINESS_CATEGORY: CertenrollObjectid = 133

public val XCN_OID_CA_CERTIFICATE: CertenrollObjectid = 155

public val XCN_OID_CERTIFICATE_REVOCATION_LIST: CertenrollObjectid = 157

public val XCN_OID_CERTIFICATE_TEMPLATE: CertenrollObjectid = 226

public val XCN_OID_CERTSRV_CA_VERSION: CertenrollObjectid = 220

public val XCN_OID_CERTSRV_CROSSCA_VERSION: CertenrollObjectid = 240

public val XCN_OID_CERTSRV_PREVIOUS_CERT_HASH: CertenrollObjectid = 221

public val XCN_OID_CERT_DISALLOWED_FILETIME_PROP_ID: CertenrollObjectid = 358

public val XCN_OID_CERT_EXTENSIONS: CertenrollObjectid = 207

public val XCN_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: CertenrollObjectid = 339

public val XCN_OID_CERT_KEY_IDENTIFIER_PROP_ID: CertenrollObjectid = 338

public val XCN_OID_CERT_MANIFOLD: CertenrollObjectid = 219

public val XCN_OID_CERT_MD5_HASH_PROP_ID: CertenrollObjectid = 341

public val XCN_OID_CERT_POLICIES: CertenrollObjectid = 179

public val XCN_OID_CERT_POLICIES_95: CertenrollObjectid = 171

public val XCN_OID_CERT_POLICIES_95_QUALIFIER1: CertenrollObjectid = 281

public val XCN_OID_CERT_PROP_ID_PREFIX: CertenrollObjectid = 337

public val XCN_OID_CERT_SIGNATURE_HASH_PROP_ID: CertenrollObjectid = 359

public val XCN_OID_CERT_STRONG_KEY_OS_1: CertenrollObjectid = 360

public val XCN_OID_CERT_STRONG_KEY_OS_CURRENT: CertenrollObjectid = 361

public val XCN_OID_CERT_STRONG_KEY_OS_PREFIX: CertenrollObjectid = 362

public val XCN_OID_CERT_STRONG_SIGN_OS_1: CertenrollObjectid = 363

public val XCN_OID_CERT_STRONG_SIGN_OS_CURRENT: CertenrollObjectid = 364

public val XCN_OID_CERT_STRONG_SIGN_OS_PREFIX: CertenrollObjectid = 365

public val XCN_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: CertenrollObjectid = 340

public val XCN_OID_CMC: CertenrollObjectid = 304

public val XCN_OID_CMC_ADD_ATTRIBUTES: CertenrollObjectid = 325

public val XCN_OID_CMC_ADD_EXTENSIONS: CertenrollObjectid = 312

public val XCN_OID_CMC_DATA_RETURN: CertenrollObjectid = 308

public val XCN_OID_CMC_DECRYPTED_POP: CertenrollObjectid = 314

public val XCN_OID_CMC_ENCRYPTED_POP: CertenrollObjectid = 313

public val XCN_OID_CMC_GET_CERT: CertenrollObjectid = 316

public val XCN_OID_CMC_GET_CRL: CertenrollObjectid = 317

public val XCN_OID_CMC_IDENTIFICATION: CertenrollObjectid = 306

public val XCN_OID_CMC_IDENTITY_PROOF: CertenrollObjectid = 307

public val XCN_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE: CertenrollObjectid = 324

public val XCN_OID_CMC_ID_POP_LINK_RANDOM: CertenrollObjectid = 322

public val XCN_OID_CMC_ID_POP_LINK_WITNESS: CertenrollObjectid = 323

public val XCN_OID_CMC_LRA_POP_WITNESS: CertenrollObjectid = 315

public val XCN_OID_CMC_QUERY_PENDING: CertenrollObjectid = 321

public val XCN_OID_CMC_RECIPIENT_NONCE: CertenrollObjectid = 311

public val XCN_OID_CMC_REG_INFO: CertenrollObjectid = 319

public val XCN_OID_CMC_RESPONSE_INFO: CertenrollObjectid = 320

public val XCN_OID_CMC_REVOKE_REQUEST: CertenrollObjectid = 318

public val XCN_OID_CMC_SENDER_NONCE: CertenrollObjectid = 310

public val XCN_OID_CMC_STATUS_INFO: CertenrollObjectid = 305

public val XCN_OID_CMC_TRANSACTION_ID: CertenrollObjectid = 309

public val XCN_OID_COMMON_NAME: CertenrollObjectid = 121

public val XCN_OID_COUNTRY_NAME: CertenrollObjectid = 124

public val XCN_OID_CRL_DIST_POINTS: CertenrollObjectid = 187

public val XCN_OID_CRL_NEXT_PUBLISH: CertenrollObjectid = 223

public val XCN_OID_CRL_NUMBER: CertenrollObjectid = 189

public val XCN_OID_CRL_REASON_CODE: CertenrollObjectid = 185

public val XCN_OID_CRL_SELF_CDP: CertenrollObjectid = 233

public val XCN_OID_CRL_VIRTUAL_BASE: CertenrollObjectid = 222

public val XCN_OID_CROSS_CERTIFICATE_PAIR: CertenrollObjectid = 158

public val XCN_OID_CROSS_CERT_DIST_POINTS: CertenrollObjectid = 210

public val XCN_OID_CTL: CertenrollObjectid = 211

public val XCN_OID_CT_PKI_DATA: CertenrollObjectid = 301

public val XCN_OID_CT_PKI_RESPONSE: CertenrollObjectid = 302

public val XCN_OID_DELTA_CRL_INDICATOR: CertenrollObjectid = 190

public val XCN_OID_DESCRIPTION: CertenrollObjectid = 131

public val XCN_OID_DESTINATION_INDICATOR: CertenrollObjectid = 145

public val XCN_OID_DEVICE_SERIAL_NUMBER: CertenrollObjectid = 123

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF: CertenrollObjectid = 366

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF: CertenrollObjectid = 367

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF: CertenrollObjectid = 368

public val XCN_OID_DISALLOWED_HASH: CertenrollObjectid = 369

public val XCN_OID_DISALLOWED_LIST: CertenrollObjectid = 370

public val XCN_OID_DN_QUALIFIER: CertenrollObjectid = 161

public val XCN_OID_DOMAIN_COMPONENT: CertenrollObjectid = 162

public val XCN_OID_DRM: CertenrollObjectid = 273

public val XCN_OID_DRM_INDIVIDUALIZATION: CertenrollObjectid = 274

public val XCN_OID_DS: CertenrollObjectid = 58

public val XCN_OID_DSALG: CertenrollObjectid = 59

public val XCN_OID_DSALG_CRPT: CertenrollObjectid = 60

public val XCN_OID_DSALG_HASH: CertenrollObjectid = 61

public val XCN_OID_DSALG_RSA: CertenrollObjectid = 63

public val XCN_OID_DSALG_SIGN: CertenrollObjectid = 62

public val XCN_OID_DS_EMAIL_REPLICATION: CertenrollObjectid = 237

public val XCN_OID_ECC_CURVE_P256: CertenrollObjectid = 371

public val XCN_OID_ECC_CURVE_P384: CertenrollObjectid = 372

public val XCN_OID_ECC_CURVE_P521: CertenrollObjectid = 373

public val XCN_OID_ECC_PUBLIC_KEY: CertenrollObjectid = 349

public val XCN_OID_ECDSA_SHA1: CertenrollObjectid = 350

public val XCN_OID_ECDSA_SHA256: CertenrollObjectid = 374

public val XCN_OID_ECDSA_SHA384: CertenrollObjectid = 375

public val XCN_OID_ECDSA_SHA512: CertenrollObjectid = 376

public val XCN_OID_ECDSA_SPECIFIED: CertenrollObjectid = 351

public val XCN_OID_EFS_RECOVERY: CertenrollObjectid = 260

public val XCN_OID_EMBEDDED_NT_CRYPTO: CertenrollObjectid = 264

public val XCN_OID_ENCRYPTED_KEY_HASH: CertenrollObjectid = 239

public val XCN_OID_ENHANCED_KEY_USAGE: CertenrollObjectid = 188

public val XCN_OID_ENROLLMENT_AGENT: CertenrollObjectid = 201

public val XCN_OID_ENROLLMENT_CSP_PROVIDER: CertenrollObjectid = 199

public val XCN_OID_ENROLLMENT_NAME_VALUE_PAIR: CertenrollObjectid = 198

public val XCN_OID_ENROLL_ATTESTATION_CHALLENGE: CertenrollObjectid = 435

public val XCN_OID_ENROLL_ATTESTATION_STATEMENT: CertenrollObjectid = 436

public val XCN_OID_ENROLL_CAXCHGCERT_HASH: CertenrollObjectid = 377

public val XCN_OID_ENROLL_CERTTYPE_EXTENSION: CertenrollObjectid = 218

public val XCN_OID_ENROLL_EKPUB_CHALLENGE: CertenrollObjectid = 379

public val XCN_OID_ENROLL_EKVERIFYCERT: CertenrollObjectid = 380

public val XCN_OID_ENROLL_EKVERIFYCREDS: CertenrollObjectid = 381

public val XCN_OID_ENROLL_EKVERIFYKEY: CertenrollObjectid = 382

public val XCN_OID_ENROLL_EK_INFO: CertenrollObjectid = 378

public val XCN_OID_ENROLL_ENCRYPTION_ALGORITHM: CertenrollObjectid = 437

public val XCN_OID_ENROLL_KSP_NAME: CertenrollObjectid = 438

public val XCN_OID_ENROLL_SCEP_ERROR: CertenrollObjectid = 428

public val XCN_OID_ENTERPRISE_OID_ROOT: CertenrollObjectid = 227

public val XCN_OID_EV_RDN_COUNTRY: CertenrollObjectid = 383

public val XCN_OID_EV_RDN_LOCALE: CertenrollObjectid = 384

public val XCN_OID_EV_RDN_STATE_OR_PROVINCE: CertenrollObjectid = 385

public val XCN_OID_FACSIMILE_TELEPHONE_NUMBER: CertenrollObjectid = 141

public val XCN_OID_FRESHEST_CRL: CertenrollObjectid = 192

public val XCN_OID_GIVEN_NAME: CertenrollObjectid = 159

public val XCN_OID_INFOSEC: CertenrollObjectid = 99

public val XCN_OID_INFOSEC_SUITE_A_CONFIDENTIALITY: CertenrollObjectid = 113

public val XCN_OID_INFOSEC_SUITE_A_INTEGRITY: CertenrollObjectid = 114

public val XCN_OID_INFOSEC_SUITE_AK_MAND_SIG: CertenrollObjectid = 117

public val XCN_OID_INFOSEC_SUITE_A_KEY_MANAGEMENT: CertenrollObjectid = 116

public val XCN_OID_INFOSEC_SUITE_A_SIGNATURE: CertenrollObjectid = 112

public val XCN_OID_INFOSEC_SUITE_A_TOKEN_PROTECTION: CertenrollObjectid = 115

public val XCN_OID_INFOSEC_MOSAIC_CONFIDENTIALITY: CertenrollObjectid = 103

public val XCN_OID_INFOSEC_MOSAIC_INTEGRITY: CertenrollObjectid = 105

public val XCN_OID_INFOSEC_MOSAIC_K_MAND_SIG: CertenrollObjectid = 111

public val XCN_OID_INFOSEC_MOSAIC_K_MAND_UPD_SIG: CertenrollObjectid = 119

public val XCN_OID_INFOSEC_MOSAIC_KEY_MANAGEMENT: CertenrollObjectid = 109

public val XCN_OID_INFOSEC_MOSAIC_SIGNATURE: CertenrollObjectid = 101

public val XCN_OID_INFOSEC_MOSAIC_TOKEN_PROTECTION: CertenrollObjectid = 107

public val XCN_OID_INFOSEC_MOSAIC_UPDATED_INTEG: CertenrollObjectid = 120

public val XCN_OID_INFOSEC_MOSAIC_UPDATED_SIG: CertenrollObjectid = 118

public val XCN_OID_INFOSEC_SDNS_CONFIDENTIALITY: CertenrollObjectid = 102

public val XCN_OID_INFOSEC_SDNS_INTEGRITY: CertenrollObjectid = 104

public val XCN_OID_INFOSEC_SDNS_K_MAND_SIG: CertenrollObjectid = 110

public val XCN_OID_INFOSEC_SDNS_KEY_MANAGEMENT: CertenrollObjectid = 108

public val XCN_OID_INFOSEC_SDNS_SIGNATURE: CertenrollObjectid = 100

public val XCN_OID_INFOSEC_SDNS_TOKEN_PROTECTION: CertenrollObjectid = 106

public val XCN_OID_INHIBIT_ANY_POLICY: CertenrollObjectid = 386

public val XCN_OID_INITIALS: CertenrollObjectid = 160

public val XCN_OID_INTERNATIONALIZED_EMAIL_ADDRESS: CertenrollObjectid = 387

public val XCN_OID_INTERNATIONAL_ISDN_NUMBER: CertenrollObjectid = 143

public val XCN_OID_IPSEC_KP_IKE_INTERMEDIATE: CertenrollObjectid = 254

public val XCN_OID_ISSUED_CERT_HASH: CertenrollObjectid = 236

public val XCN_OID_ISSUER_ALT_NAME: CertenrollObjectid = 174

public val XCN_OID_ISSUER_ALT_NAME2: CertenrollObjectid = 184

public val XCN_OID_ISSUING_DIST_POINT: CertenrollObjectid = 191

public val XCN_OID_KEYID_RDN: CertenrollObjectid = 168

public val XCN_OID_KEY_ATTRIBUTES: CertenrollObjectid = 170

public val XCN_OID_KEY_USAGE: CertenrollObjectid = 176

public val XCN_OID_KEY_USAGE_RESTRICTION: CertenrollObjectid = 172

public val XCN_OID_KP_CA_EXCHANGE: CertenrollObjectid = 224

public val XCN_OID_KP_CSP_SIGNATURE: CertenrollObjectid = 272

public val XCN_OID_KP_CTL_USAGE_SIGNING: CertenrollObjectid = 255

public val XCN_OID_KP_DOCUMENT_SIGNING: CertenrollObjectid = 268

public val XCN_OID_KP_EFS: CertenrollObjectid = 259

public val XCN_OID_KP_KERNEL_MODE_CODE_SIGNING: CertenrollObjectid = 388

public val XCN_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING: CertenrollObjectid = 389

public val XCN_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING: CertenrollObjectid = 390

public val XCN_OID_KP_KEY_RECOVERY: CertenrollObjectid = 267

public val XCN_OID_KP_KEY_RECOVERY_AGENT: CertenrollObjectid = 225

public val XCN_OID_KP_LIFETIME_SIGNING: CertenrollObjectid = 269

public val XCN_OID_KP_MOBILE_DEVICE_SOFTWARE: CertenrollObjectid = 270

public val XCN_OID_KP_QUALIFIED_SUBORDINATION: CertenrollObjectid = 266

public val XCN_OID_KP_SMARTCARD_LOGON: CertenrollObjectid = 277

public val XCN_OID_KP_SMART_DISPLAY: CertenrollObjectid = 271

public val XCN_OID_KP_TIME_STAMP_SIGNING: CertenrollObjectid = 256

public val XCN_OID_KP_TPM_AIK_CERTIFICATE: CertenrollObjectid = 391

public val XCN_OID_KP_TPM_EK_CERTIFICATE: CertenrollObjectid = 392

public val XCN_OID_KP_TPM_PLATFORM_CERTIFICATE: CertenrollObjectid = 393

public val XCN_OID_LEGACY_POLICY_MAPPINGS: CertenrollObjectid = 195

public val XCN_OID_LICENSES: CertenrollObjectid = 275

public val XCN_OID_LICENSE_SERVER: CertenrollObjectid = 276

public val XCN_OID_LOCALITY_NAME: CertenrollObjectid = 125

public val XCN_OID_LOCAL_MACHINE_KEYSET: CertenrollObjectid = 166

public val XCN_OID_LOGOTYPE_EXT: CertenrollObjectid = 206

public val XCN_OID_LOYALTY_OTHER_LOGOTYPE: CertenrollObjectid = 326

public val XCN_OID_MEMBER: CertenrollObjectid = 149

public val XCN_OID_NAME_CONSTRAINTS: CertenrollObjectid = 193

public val XCN_OID_NETSCAPE: CertenrollObjectid = 289

public val XCN_OID_NETSCAPE_BASE_URL: CertenrollObjectid = 292

public val XCN_OID_NETSCAPE_CA_POLICY_URL: CertenrollObjectid = 296

public val XCN_OID_NETSCAPE_CA_REVOCATION_URL: CertenrollObjectid = 294

public val XCN_OID_NETSCAPE_CERT_EXTENSION: CertenrollObjectid = 290

public val XCN_OID_NETSCAPE_CERT_RENEWAL_URL: CertenrollObjectid = 295

public val XCN_OID_NETSCAPE_CERT_SEQUENCE: CertenrollObjectid = 300

public val XCN_OID_NETSCAPE_CERT_TYPE: CertenrollObjectid = 291

public val XCN_OID_NETSCAPE_COMMENT: CertenrollObjectid = 298

public val XCN_OID_NETSCAPE_DATA_TYPE: CertenrollObjectid = 299

public val XCN_OID_NETSCAPE_REVOCATION_URL: CertenrollObjectid = 293

public val XCN_OID_NETSCAPE_SSL_SERVER_NAME: CertenrollObjectid = 297

public val XCN_OID_NEXT_UPDATE_LOCATION: CertenrollObjectid = 208

public val XCN_OID_NIST_AES128_CBC: CertenrollObjectid = 394

public val XCN_OID_NIST_AES128_WRAP: CertenrollObjectid = 395

public val XCN_OID_NIST_AES192_CBC: CertenrollObjectid = 396

public val XCN_OID_NIST_AES192_WRAP: CertenrollObjectid = 397

public val XCN_OID_NIST_AES256_CBC: CertenrollObjectid = 398

public val XCN_OID_NIST_AES256_WRAP: CertenrollObjectid = 399

public val XCN_OID_NIST_SHA256: CertenrollObjectid = 345

public val XCN_OID_NIST_SHA384: CertenrollObjectid = 346

public val XCN_OID_NIST_SHA512: CertenrollObjectid = 347

public val XCN_OID_NONE: CertenrollObjectid = 0

public val XCN_OID_NT5_CRYPTO: CertenrollObjectid = 262

public val XCN_OID_NTDS_REPLICATION: CertenrollObjectid = 241

public val XCN_OID_NT_PRINCIPAL_NAME: CertenrollObjectid = 214

public val XCN_OID_OEM_WHQL_CRYPTO: CertenrollObjectid = 263

public val XCN_OID_OIW: CertenrollObjectid = 64

public val XCN_OID_OIWDIR: CertenrollObjectid = 93

public val XCN_OID_OIWDIR_CRPT: CertenrollObjectid = 94

public val XCN_OID_OIWDIR_HASH: CertenrollObjectid = 95

public val XCN_OID_OIWDIR_SIGN: CertenrollObjectid = 96

public val XCN_OID_OIWDIR_MD2: CertenrollObjectid = 97

public val XCN_OID_OIWDIR_MD2RSA: CertenrollObjectid = 98

public val XCN_OID_OIWSEC: CertenrollObjectid = 65

public val XCN_OID_OIWSEC_DES_CBC: CertenrollObjectid = 70

public val XCN_OID_OIWSEC_DES_CFB: CertenrollObjectid = 72

public val XCN_OID_OIWSEC_DES_ECB: CertenrollObjectid = 69

public val XCN_OID_OIWSEC_DES_EDE: CertenrollObjectid = 80

public val XCN_OID_OIWSEC_DES_MAC: CertenrollObjectid = 73

public val XCN_OID_OIWSEC_DES_OFB: CertenrollObjectid = 71

public val XCN_OID_OIWSEC_DH_COMM_MOD: CertenrollObjectid = 79

public val XCN_OID_OIWSEC_DSA: CertenrollObjectid = 75

public val XCN_OID_OIWSEC_DSA_COMM: CertenrollObjectid = 83

public val XCN_OID_OIWSEC_DSA_COMM_SHA: CertenrollObjectid = 84

public val XCN_OID_OIWSEC_DSA_COMM_SHA1: CertenrollObjectid = 91

public val XCN_OID_OIWSEC_DSA_SHA1: CertenrollObjectid = 90

public val XCN_OID_OIWSEC_KEY_HASH_SEAL: CertenrollObjectid = 86

public val XCN_OID_OIWSEC_MD2RSA_SIGN: CertenrollObjectid = 87

public val XCN_OID_OIWSEC_MD4RSA: CertenrollObjectid = 66

public val XCN_OID_OIWSEC_MD4RSA2: CertenrollObjectid = 68

public val XCN_OID_OIWSEC_MD5RSA: CertenrollObjectid = 67

public val XCN_OID_OIWSEC_MD5RSA_SIGN: CertenrollObjectid = 88

public val XCN_OID_OIWSEC_MDC2: CertenrollObjectid = 82

public val XCN_OID_OIWSEC_MDC2RSA: CertenrollObjectid = 77

public val XCN_OID_OIWSEC_RSA_SIGN: CertenrollObjectid = 74

public val XCN_OID_OIWSEC_RSA_XCHG: CertenrollObjectid = 85

public val XCN_OID_OIWSEC_SHA: CertenrollObjectid = 81

public val XCN_OID_OIWSEC_SHA1: CertenrollObjectid = 89

public val XCN_OID_OIWSEC_SHA1RSA_SIGN: CertenrollObjectid = 92

public val XCN_OID_OIWSEC_SHA_DSA: CertenrollObjectid = 76

public val XCN_OID_OIWSEC_SHA_RSA: CertenrollObjectid = 78

public val XCN_OID_ORGANIZATIONAL_UNIT_NAME: CertenrollObjectid = 129

public val XCN_OID_ORGANIZATION_NAME: CertenrollObjectid = 128

public val XCN_OID_OS_VERSION: CertenrollObjectid = 200

public val XCN_OID_OWNER: CertenrollObjectid = 150

public val XCN_OID_PHYSICAL_DELIVERY_OFFICE_NAME: CertenrollObjectid = 137

public val XCN_OID_PKCS: CertenrollObjectid = 2

public val XCN_OID_PKCS_1: CertenrollObjectid = 5

public val XCN_OID_PKCS_10: CertenrollObjectid = 14

public val XCN_OID_PKCS_12: CertenrollObjectid = 15

public val XCN_OID_PKCS_12_EXTENDED_ATTRIBUTES: CertenrollObjectid = 167

public val XCN_OID_PKCS_12_FRIENDLY_NAME_ATTR: CertenrollObjectid = 163

public val XCN_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR: CertenrollObjectid = 165

public val XCN_OID_PKCS_12_LOCAL_KEY_ID: CertenrollObjectid = 164

public val XCN_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID: CertenrollObjectid = 407

public val XCN_OID_PKCS_12_PBE_IDS: CertenrollObjectid = 400

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND128BIT_RC2: CertenrollObjectid = 401

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND128BIT_RC4: CertenrollObjectid = 402

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND2KEY_TRIPLE_DES: CertenrollObjectid = 403

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND3KEY_TRIPLE_DES: CertenrollObjectid = 404

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND40BIT_RC2: CertenrollObjectid = 405

public val XCN_OID_PKCS_12_PBE_WITH_SHA1AND40BIT_RC4: CertenrollObjectid = 406

public val XCN_OID_PKCS_2: CertenrollObjectid = 6

public val XCN_OID_PKCS_3: CertenrollObjectid = 7

public val XCN_OID_PKCS_4: CertenrollObjectid = 8

public val XCN_OID_PKCS_5: CertenrollObjectid = 9

public val XCN_OID_PKCS_6: CertenrollObjectid = 10

public val XCN_OID_PKCS_7: CertenrollObjectid = 11

public val XCN_OID_PKCS_7_DATA: CertenrollObjectid = 329

public val XCN_OID_PKCS_7_DIGESTED: CertenrollObjectid = 333

public val XCN_OID_PKCS_7_ENCRYPTED: CertenrollObjectid = 334

public val XCN_OID_PKCS_7_ENVELOPED: CertenrollObjectid = 331

public val XCN_OID_PKCS_7_SIGNED: CertenrollObjectid = 330

public val XCN_OID_PKCS_7_SIGNEDANDENVELOPED: CertenrollObjectid = 332

public val XCN_OID_PKCS_8: CertenrollObjectid = 12

public val XCN_OID_PKCS_9: CertenrollObjectid = 13

public val XCN_OID_PKCS_9_CONTENT_TYPE: CertenrollObjectid = 335

public val XCN_OID_PKCS_9_MESSAGE_DIGEST: CertenrollObjectid = 336

public val XCN_OID_PKINIT_KP_KDC: CertenrollObjectid = 408

public val XCN_OID_PKIX: CertenrollObjectid = 202

public val XCN_OID_PKIX_ACC_DESCR: CertenrollObjectid = 282

public val XCN_OID_PKIX_CA_ISSUERS: CertenrollObjectid = 284

public val XCN_OID_PKIX_CA_REPOSITORY: CertenrollObjectid = 409

public val XCN_OID_PKIX_KP: CertenrollObjectid = 243

public val XCN_OID_PKIX_KP_CLIENT_AUTH: CertenrollObjectid = 245

public val XCN_OID_PKIX_KP_CODE_SIGNING: CertenrollObjectid = 246

public val XCN_OID_PKIX_KP_EMAIL_PROTECTION: CertenrollObjectid = 247

public val XCN_OID_PKIX_KP_IPSEC_END_SYSTEM: CertenrollObjectid = 248

public val XCN_OID_PKIX_KP_IPSEC_TUNNEL: CertenrollObjectid = 249

public val XCN_OID_PKIX_KP_IPSEC_USER: CertenrollObjectid = 250

public val XCN_OID_PKIX_KP_OCSP_SIGNING: CertenrollObjectid = 252

public val XCN_OID_PKIX_KP_SERVER_AUTH: CertenrollObjectid = 244

public val XCN_OID_PKIX_KP_TIMESTAMP_SIGNING: CertenrollObjectid = 251

public val XCN_OID_PKIX_NO_SIGNATURE: CertenrollObjectid = 303

public val XCN_OID_PKIX_OCSP: CertenrollObjectid = 283

public val XCN_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE: CertenrollObjectid = 328

public val XCN_OID_PKIX_OCSP_NOCHECK: CertenrollObjectid = 253

public val XCN_OID_PKIX_OCSP_NONCE: CertenrollObjectid = 410

public val XCN_OID_PKIX_PE: CertenrollObjectid = 203

public val XCN_OID_PKIX_POLICY_QUALIFIER_CPS: CertenrollObjectid = 279

public val XCN_OID_PKIX_POLICY_QUALIFIER_USERNOTICE: CertenrollObjectid = 280

public val XCN_OID_PKIX_TIME_STAMPING: CertenrollObjectid = 411

public val XCN_OID_POLICY_CONSTRAINTS: CertenrollObjectid = 196

public val XCN_OID_POLICY_MAPPINGS: CertenrollObjectid = 194

public val XCN_OID_POSTAL_ADDRESS: CertenrollObjectid = 134

public val XCN_OID_POSTAL_CODE: CertenrollObjectid = 135

public val XCN_OID_POST_OFFICE_BOX: CertenrollObjectid = 136

public val XCN_OID_PREFERRED_DELIVERY_METHOD: CertenrollObjectid = 146

public val XCN_OID_PRESENTATION_ADDRESS: CertenrollObjectid = 147

public val XCN_OID_PRIVATEKEY_USAGE_PERIOD: CertenrollObjectid = 177

public val XCN_OID_PRODUCT_UPDATE: CertenrollObjectid = 215

public val XCN_OID_QC_EU_COMPLIANCE: CertenrollObjectid = 412

public val XCN_OID_QC_SSCD: CertenrollObjectid = 413

public val XCN_OID_QC_STATEMENTS_EXT: CertenrollObjectid = 414

public val XCN_OID_RDN_DUMMY_SIGNER: CertenrollObjectid = 228

public val XCN_OID_RDN_TPM_MANUFACTURER: CertenrollObjectid = 415

public val XCN_OID_RDN_TPM_MODEL: CertenrollObjectid = 416

public val XCN_OID_RDN_TPM_VERSION: CertenrollObjectid = 417

public val XCN_OID_REASON_CODE_HOLD: CertenrollObjectid = 186

public val XCN_OID_REGISTERED_ADDRESS: CertenrollObjectid = 144

public val XCN_OID_REMOVE_CERTIFICATE: CertenrollObjectid = 209

public val XCN_OID_RENEWAL_CERTIFICATE: CertenrollObjectid = 197

public val XCN_OID_REQUEST_CLIENT_INFO: CertenrollObjectid = 238

public val XCN_OID_REQUIRE_CERT_CHAIN_POLICY: CertenrollObjectid = 234

public val XCN_OID_REVOKED_LIST_SIGNER: CertenrollObjectid = 418

public val XCN_OID_RFC3161_COUNTER_SIGN: CertenrollObjectid = 419

public val XCN_OID_ROLE_OCCUPANT: CertenrollObjectid = 151

public val XCN_OID_ROOT_LIST_SIGNER: CertenrollObjectid = 265

public val XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION: CertenrollObjectid = 420

public val XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION: CertenrollObjectid = 421

public val XCN_OID_ROOT_PROGRAM_FLAGS: CertenrollObjectid = 422

public val XCN_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL: CertenrollObjectid = 423

public val XCN_OID_RSA: CertenrollObjectid = 1

public val XCN_OID_RSAES_OAEP: CertenrollObjectid = 425

public val XCN_OID_RSA_DES_EDE3_CBC: CertenrollObjectid = 51

public val XCN_OID_RSA_DH: CertenrollObjectid = 22

public val XCN_OID_RSA_ENCRYPT: CertenrollObjectid = 4

public val XCN_OID_RSA_HASH: CertenrollObjectid = 3

public val XCN_OID_RSA_MD2: CertenrollObjectid = 46

public val XCN_OID_RSA_MD2RSA: CertenrollObjectid = 17

public val XCN_OID_RSA_MD4: CertenrollObjectid = 47

public val XCN_OID_RSA_MD4RSA: CertenrollObjectid = 18

public val XCN_OID_RSA_MD5: CertenrollObjectid = 48

public val XCN_OID_RSA_MD5RSA: CertenrollObjectid = 19

public val XCN_OID_RSA_MGF1: CertenrollObjectid = 348

public val XCN_OID_RSA_PSPECIFIED: CertenrollObjectid = 424

public val XCN_OID_RSA_RC2CBC: CertenrollObjectid = 49

public val XCN_OID_RSA_RC4: CertenrollObjectid = 50

public val XCN_OID_RSA_RC5_CBC_PAD: CertenrollObjectid = 52

public val XCN_OID_RSA_RSA: CertenrollObjectid = 16

public val XCN_OID_RSA_SETOAEP_RSA: CertenrollObjectid = 21

public val XCN_OID_RSA_SHA1RSA: CertenrollObjectid = 20

public val XCN_OID_RSA_SHA256RSA: CertenrollObjectid = 342

public val XCN_OID_RSA_SHA384RSA: CertenrollObjectid = 343

public val XCN_OID_RSA_SHA512RSA: CertenrollObjectid = 344

public val XCN_OID_RSA_SMIME_CAPABILITIES: CertenrollObjectid = 40

public val XCN_OID_RSA_SMIM_EALG: CertenrollObjectid = 42

public val XCN_OID_RSA_SMIM_EALG_CMS3DE_SWRAP: CertenrollObjectid = 44

public val XCN_OID_RSA_SMIM_EALG_CMSRC2WRAP: CertenrollObjectid = 45

public val XCN_OID_RSA_SMIM_EALG_ESDH: CertenrollObjectid = 43

public val XCN_OID_RSA_SSA_PSS: CertenrollObjectid = 353

public val XCN_OID_RSA_CERT_EXTENSIONS: CertenrollObjectid = 39

public val XCN_OID_RSA_CHALLENGE_PWD: CertenrollObjectid = 36

public val XCN_OID_RSA_CONTENT_TYPE: CertenrollObjectid = 32

public val XCN_OID_RSA_COUNTER_SIGN: CertenrollObjectid = 35

public val XCN_OID_RSA_DATA: CertenrollObjectid = 23

public val XCN_OID_RSA_DIGESTED_DATA: CertenrollObjectid = 27

public val XCN_OID_RSA_EMAIL_ADDR: CertenrollObjectid = 30

public val XCN_OID_RSA_ENCRYPTED_DATA: CertenrollObjectid = 29

public val XCN_OID_RSA_ENVELOPED_DATA: CertenrollObjectid = 25

public val XCN_OID_RSA_EXT_CERT_ATTRS: CertenrollObjectid = 38

public val XCN_OID_RSA_HASHED_DATA: CertenrollObjectid = 28

public val XCN_OID_RSA_MESSAGE_DIGEST: CertenrollObjectid = 33

public val XCN_OID_RSA_PREFER_SIGNED_DATA: CertenrollObjectid = 41

public val XCN_OID_RSA_SIGN_ENV_DATA: CertenrollObjectid = 26

public val XCN_OID_RSA_SIGNED_DATA: CertenrollObjectid = 24

public val XCN_OID_RSA_SIGNING_TIME: CertenrollObjectid = 34

public val XCN_OID_RSA_UNSTRUCT_ADDR: CertenrollObjectid = 37

public val XCN_OID_RSA_UNSTRUCT_NAME: CertenrollObjectid = 31

public val XCN_OID_SEARCH_GUIDE: CertenrollObjectid = 132

public val XCN_OID_SEE_ALSO: CertenrollObjectid = 152

public val XCN_OID_SERIALIZED: CertenrollObjectid = 213

public val XCN_OID_SERVER_GATED_CRYPTO: CertenrollObjectid = 257

public val XCN_OID_SGC_NETSCAPE: CertenrollObjectid = 258

public val XCN_OID_SORTED_CTL: CertenrollObjectid = 212

public val XCN_OID_STATE_OR_PROVINCE_NAME: CertenrollObjectid = 126

public val XCN_OID_STREET_ADDRESS: CertenrollObjectid = 127

public val XCN_OID_SUBJECT_ALT_NAME: CertenrollObjectid = 173

public val XCN_OID_SUBJECT_ALT_NAME2: CertenrollObjectid = 183

public val XCN_OID_SUBJECT_DIR_ATTRS: CertenrollObjectid = 242

public val XCN_OID_SUBJECT_INFO_ACCESS: CertenrollObjectid = 426

public val XCN_OID_SUBJECT_KEY_IDENTIFIER: CertenrollObjectid = 182
