package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

public val AlgorithmFlagsNone: AlgorithmFlags = 0

public val AlgorithmFlagsWrap: AlgorithmFlags = 1

public val AllowNoOutstandingRequest: InstallResponseRestrictionFlags = 1

public val AllowNone: InstallResponseRestrictionFlags = 0

public val AllowUntrustedCertificate: InstallResponseRestrictionFlags = 2

public val AllowUntrustedRoot: InstallResponseRestrictionFlags = 4

public val AllowedKeySignature: Pkcs10AllowedSignatureTypes = 1

public val AllowedNullSignature: Pkcs10AllowedSignatureTypes = 2

public val CAIF_DSENTRY: UInt = 1u

public val CAIF_LOCAL: UInt = 8u

public val CAIF_REGISTRY: UInt = 4u

public val CAIF_REGISTRYPARENT: UInt = 16u

public val CAIF_SHAREDFOLDERENTRY: UInt = 2u

public val CAPATHLENGTH_INFINITE: UInt = 4294967295u

public val CAPropCertificate: EnrollmentCAProperty = 7

public val CAPropCertificateTypes: EnrollmentCAProperty = 6

public val CAPropCommonName: EnrollmentCAProperty = 1

public val CAPropDNSName: EnrollmentCAProperty = 5

public val CAPropDescription: EnrollmentCAProperty = 8

public val CAPropDistinguishedName: EnrollmentCAProperty = 2

public val CAPropRenewalOnly: EnrollmentCAProperty = 12

public val CAPropSanitizedName: EnrollmentCAProperty = 3

public val CAPropSanitizedShortName: EnrollmentCAProperty = 4

public val CAPropSecurity: EnrollmentCAProperty = 11

public val CAPropSiteName: EnrollmentCAProperty = 10

public val CAPropWebServers: EnrollmentCAProperty = 9

public val CA_ACCESS_ADMIN: CERTADMIN_GET_ROLES_FLAGS = 1u

public val CA_ACCESS_AUDITOR: CERTADMIN_GET_ROLES_FLAGS = 4u

public val CA_ACCESS_ENROLL: CERTADMIN_GET_ROLES_FLAGS = 512u

public val CA_ACCESS_MASKROLES: UInt = 255u

public val CA_ACCESS_OFFICER: CERTADMIN_GET_ROLES_FLAGS = 2u

public val CA_ACCESS_OPERATOR: CERTADMIN_GET_ROLES_FLAGS = 8u

public val CA_ACCESS_READ: CERTADMIN_GET_ROLES_FLAGS = 256u

public val CA_CRL_BASE: UInt = 1u

public val CA_CRL_DELTA: UInt = 2u

public val CA_CRL_REPUBLISH: UInt = 16u

public val CA_DISP_ERROR: UInt = 1u

public val CA_DISP_INCOMPLETE: UInt = 0u

public val CA_DISP_INVALID: UInt = 4u

public val CA_DISP_REVOKED: UInt = 2u

public val CA_DISP_UNDER_SUBMISSION: UInt = 5u

public val CA_DISP_VALID: UInt = 3u

public val CAlternativeName: GUID = GUID.from_u128(U128(0x884e2013217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CAlternativeNames: GUID = GUID.from_u128(U128(0x884e2014217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CBinaryConverter: GUID = GUID.from_u128(U128(0x884e2002217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCLOCKSKEWMINUTESDEFAULT: UInt = 10u

public val CC_DEFAULTCONFIG: CERT_GET_CONFIG_FLAGS = 0

public val CC_FIRSTCONFIG: CERT_GET_CONFIG_FLAGS = 2

public val CC_LOCALACTIVECONFIG: CERT_GET_CONFIG_FLAGS = 4

public val CC_LOCALCONFIG: CERT_GET_CONFIG_FLAGS = 3

public val CC_UIPICKCONFIG: CERT_GET_CONFIG_FLAGS = 1

public val CC_UIPICKCONFIGSKIPLOCALCA: CERT_GET_CONFIG_FLAGS = 5

public val CCertAdmin: GUID = GUID.from_u128(U128(0x37eabaf07fb611d0uL, 0x881700a0c903b83cuL))

public val CCertConfig: GUID = GUID.from_u128(U128(0x372fce38432411d0uL, 0x881000a0c903b83cuL))

public val CCertEncodeAltName: GUID = GUID.from_u128(U128(0x1cfc4cda127111d1uL, 0x9bd400c04fb683fauL))

public val CCertEncodeBitString: GUID = GUID.from_u128(U128(0x6d6b3cd8127811d1uL, 0x9bd400c04fb683fauL))

public val CCertEncodeCRLDistInfo: GUID = GUID.from_u128(U128(0x1fa60a0bbff11d0uL, 0x882500a0c903b83cuL))

public val CCertEncodeDateArray: GUID = GUID.from_u128(U128(0x301f77b0a47011d0uL, 0x882100a0c903b83cuL))

public val CCertEncodeLongArray: GUID = GUID.from_u128(U128(0x4e0680a0a0a211d0uL, 0x882100a0c903b83cuL))

public val CCertEncodeStringArray: GUID = GUID.from_u128(U128(0x19a76fe0749411d0uL, 0x881600a0c903b83cuL))

public val CCertGetConfig: GUID = GUID.from_u128(U128(0xc6cc49b0ce1711d0uL, 0x883300a0c903b83cuL))

public val CCertProperties: GUID = GUID.from_u128(U128(0x884e202f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertProperty: GUID = GUID.from_u128(U128(0x884e202e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyArchived: GUID = GUID.from_u128(U128(0x884e2037217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyArchivedKeyHash: GUID = GUID.from_u128(U128(0x884e203b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyAutoEnroll: GUID = GUID.from_u128(U128(0x884e2032217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyBackedUp: GUID = GUID.from_u128(U128(0x884e2038217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyDescription: GUID = GUID.from_u128(U128(0x884e2031217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyEnrollment: GUID = GUID.from_u128(U128(0x884e2039217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyEnrollmentPolicyServer: GUID = GUID.from_u128(U128(0x884e204c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyFriendlyName: GUID = GUID.from_u128(U128(0x884e2030217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyKeyProvInfo: GUID = GUID.from_u128(U128(0x884e2036217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyRenewal: GUID = GUID.from_u128(U128(0x884e203a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertyRequestOriginator: GUID = GUID.from_u128(U128(0x884e2033217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertPropertySHA1Hash: GUID = GUID.from_u128(U128(0x884e2034217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertRequest: GUID = GUID.from_u128(U128(0x98aff3f0552411d0uL, 0x881200a0c903b83cuL))

public val CCertServerExit: GUID = GUID.from_u128(U128(0x4c4a5e40732c11d0uL, 0x881600a0c903b83cuL))

public val CCertServerPolicy: GUID = GUID.from_u128(U128(0xaa000926ffbe11cfuL, 0x880000a0c903b83cuL))

public val CCertView: GUID = GUID.from_u128(U128(0xa12d0f7a1e8411d1uL, 0x9bd600c04fb683fauL))

public val CCertificateAttestationChallenge: GUID = GUID.from_u128(U128(0x1362ada1eb60456auL, 0xb6e1118050db741buL))

public val CCertificatePolicies: GUID = GUID.from_u128(U128(0x884e201f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCertificatePolicy: GUID = GUID.from_u128(U128(0x884e201e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCryptAttribute: GUID = GUID.from_u128(U128(0x884e202c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCryptAttributes: GUID = GUID.from_u128(U128(0x884e202d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCspInformation: GUID = GUID.from_u128(U128(0x884e2007217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCspInformations: GUID = GUID.from_u128(U128(0x884e2008217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CCspStatus: GUID = GUID.from_u128(U128(0x884e2009217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CDR_EXPIRED: CERT_DELETE_ROW_FLAGS = 1

public val CDR_REQUEST_LAST_CHANGED: CERT_DELETE_ROW_FLAGS = 2

public val CERTENROLL_INDEX_BASE: UInt = 0u

public val CERT_ALT_NAME_DIRECTORY_NAME: CERT_ALT_NAME = 5

public val CERT_ALT_NAME_DNS_NAME: CERT_ALT_NAME = 3

public val CERT_ALT_NAME_IP_ADDRESS: CERT_ALT_NAME = 8

public val CERT_ALT_NAME_OTHER_NAME: CERT_ALT_NAME = 1

public val CERT_ALT_NAME_REGISTERED_ID: CERT_ALT_NAME = 9

public val CERT_ALT_NAME_RFC822_NAME: CERT_ALT_NAME = 2

public val CERT_ALT_NAME_URL: CERT_ALT_NAME = 7

public val CEnroll: GUID = GUID.from_u128(U128(0x43f8f2897a2011d0uL, 0x8f0600c04fc295e1uL))

public val CEnroll2: GUID = GUID.from_u128(U128(0x127698e4e7304e5cuL, 0xa2b121490a70c8a1uL))

public val CMM_READONLY: UInt = 2u

public val CMM_REFRESHONLY: UInt = 1u

public val CObjectId: GUID = GUID.from_u128(U128(0x884e2000217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CObjectIds: GUID = GUID.from_u128(U128(0x884e2001217d11dauL, 0xb2a4000e7bbb2b09uL))

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

public val CPolicyQualifier: GUID = GUID.from_u128(U128(0x884e201c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CPolicyQualifiers: GUID = GUID.from_u128(U128(0x884e201d217d11dauL, 0xb2a4000e7bbb2b09uL))

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

public val CR_DISP_DENIED: CR_DISP = 2u

public val CR_DISP_ERROR: CR_DISP = 1u

public val CR_DISP_INCOMPLETE: CR_DISP = 0u

public val CR_DISP_ISSUED: CR_DISP = 3u

public val CR_DISP_ISSUED_OUT_OF_BAND: CR_DISP = 4u

public val CR_DISP_REVOKED: UInt = 6u

public val CR_DISP_UNDER_SUBMISSION: CR_DISP = 5u

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

public val CR_IN_BASE64: CERT_IMPORT_FLAGS = 1

public val CR_IN_BASE64HEADER: CERT_IMPORT_FLAGS = 0

public val CR_IN_BINARY: CERT_IMPORT_FLAGS = 2

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

public val CR_OUT_BASE64: CERT_REQUEST_OUT_TYPE = 1

public val CR_OUT_BASE64HEADER: CERT_REQUEST_OUT_TYPE = 0

public val CR_OUT_BASE64REQUESTHEADER: UInt = 3u

public val CR_OUT_BASE64X509CRLHEADER: UInt = 9u

public val CR_OUT_BINARY: CERT_REQUEST_OUT_TYPE = 2

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

public val CSBACKUP_TYPE_FULL: CSBACKUP_TYPE = 1u

public val CSBACKUP_TYPE_LOGS_ONLY: CSBACKUP_TYPE = 2u

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

public val CSignerCertificate: GUID = GUID.from_u128(U128(0x884e203d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CSmimeCapabilities: GUID = GUID.from_u128(U128(0x884e201a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CSmimeCapability: GUID = GUID.from_u128(U128(0x884e2019217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CVIEWAGEMINUTESDEFAULT: UInt = 16u

public val CVRC_COLUMN_MASK: CVRC_COLUMN = 4095

public val CVRC_COLUMN_RESULT: CVRC_COLUMN = 1

public val CVRC_COLUMN_SCHEMA: CVRC_COLUMN = 0

public val CVRC_COLUMN_VALUE: CVRC_COLUMN = 2

public val CVRC_TABLE_ATTRIBUTES: CVRC_TABLE = 16384

public val CVRC_TABLE_CRL: CVRC_TABLE = 20480

public val CVRC_TABLE_EXTENSIONS: CVRC_TABLE = 12288

public val CVRC_TABLE_MASK: UInt = 61440u

public val CVRC_TABLE_REQCERT: CVRC_TABLE = 0

public val CVRC_TABLE_SHIFT: UInt = 12u

public val CVR_SEEK_EQ: CERT_VIEW_SEEK_OPERATOR_FLAGS = 1

public val CVR_SEEK_GE: CERT_VIEW_SEEK_OPERATOR_FLAGS = 8

public val CVR_SEEK_GT: CERT_VIEW_SEEK_OPERATOR_FLAGS = 16

public val CVR_SEEK_LE: CERT_VIEW_SEEK_OPERATOR_FLAGS = 4

public val CVR_SEEK_LT: CERT_VIEW_SEEK_OPERATOR_FLAGS = 2

public val CVR_SEEK_MASK: UInt = 255u

public val CVR_SEEK_NODELTA: UInt = 4096u

public val CVR_SEEK_NONE: UInt = 0u

public val CVR_SORT_ASCEND: UInt = 1u

public val CVR_SORT_DESCEND: UInt = 2u

public val CVR_SORT_NONE: UInt = 0u

public val CV_COLUMN_ATTRIBUTE_DEFAULT: Int = -5

public val CV_COLUMN_CRL_DEFAULT: Int = -6

public val CV_COLUMN_EXTENSION_DEFAULT: Int = -4

public val CV_COLUMN_LOG_DEFAULT: CERT_VIEW_COLUMN_INDEX = -2

public val CV_COLUMN_LOG_FAILED_DEFAULT: CERT_VIEW_COLUMN_INDEX = -3

public val CV_COLUMN_LOG_REVOKED_DEFAULT: Int = -7

public val CV_COLUMN_QUEUE_DEFAULT: CERT_VIEW_COLUMN_INDEX = -1

public val CV_OUT_BASE64: ENUM_CERT_COLUMN_VALUE_FLAGS = 1

public val CV_OUT_BASE64HEADER: ENUM_CERT_COLUMN_VALUE_FLAGS = 0

public val CV_OUT_BASE64REQUESTHEADER: ENUM_CERT_COLUMN_VALUE_FLAGS = 3

public val CV_OUT_BASE64X509CRLHEADER: ENUM_CERT_COLUMN_VALUE_FLAGS = 9

public val CV_OUT_BINARY: ENUM_CERT_COLUMN_VALUE_FLAGS = 2

public val CV_OUT_ENCODEMASK: UInt = 255u

public val CV_OUT_HEX: ENUM_CERT_COLUMN_VALUE_FLAGS = 4

public val CV_OUT_HEXADDR: ENUM_CERT_COLUMN_VALUE_FLAGS = 10

public val CV_OUT_HEXASCII: ENUM_CERT_COLUMN_VALUE_FLAGS = 5

public val CV_OUT_HEXASCIIADDR: ENUM_CERT_COLUMN_VALUE_FLAGS = 11

public val CV_OUT_HEXRAW: UInt = 12u

public val CV_OUT_NOCR: UInt = 2147483648u

public val CV_OUT_NOCRLF: UInt = 1073741824u

public val CX500DistinguishedName: GUID = GUID.from_u128(U128(0x884e2003217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509Attribute: GUID = GUID.from_u128(U128(0x884e2022217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeArchiveKey: GUID = GUID.from_u128(U128(0x884e2027217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeArchiveKeyHash: GUID = GUID.from_u128(U128(0x884e2028217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeClientId: GUID = GUID.from_u128(U128(0x884e2025217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeCspProvider: GUID = GUID.from_u128(U128(0x884e202b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeExtensions: GUID = GUID.from_u128(U128(0x884e2024217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeOSVersion: GUID = GUID.from_u128(U128(0x884e202a217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509AttributeRenewalCertificate: GUID = GUID.from_u128(U128(0x884e2026217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509Attributes: GUID = GUID.from_u128(U128(0x884e2023217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRequestCertificate: GUID = GUID.from_u128(U128(0x884e2043217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRequestCmc: GUID = GUID.from_u128(U128(0x884e2045217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRequestPkcs10: GUID = GUID.from_u128(U128(0x884e2042217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRequestPkcs7: GUID = GUID.from_u128(U128(0x884e2044217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRevocationList: GUID = GUID.from_u128(U128(0x884e2060217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRevocationListEntries: GUID = GUID.from_u128(U128(0x884e205f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateRevocationListEntry: GUID = GUID.from_u128(U128(0x884e205e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509CertificateTemplateADWritable: GUID = GUID.from_u128(U128(0x8336e3232e6a4a04uL, 0x937c548f681839b3uL))

public val CX509EndorsementKey: GUID = GUID.from_u128(U128(0x11a25a1db9a34edduL, 0xaf833b59adbed361uL))

public val CX509Enrollment: GUID = GUID.from_u128(U128(0x884e2046217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EnrollmentHelper: GUID = GUID.from_u128(U128(0x884e2050217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EnrollmentPolicyActiveDirectory: GUID = GUID.from_u128(U128(0x91f39027217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EnrollmentPolicyWebService: GUID = GUID.from_u128(U128(0x91f39028217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509EnrollmentWebClassFactory: GUID = GUID.from_u128(U128(0x884e2049217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509Extension: GUID = GUID.from_u128(U128(0x884e200d217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionAlternativeNames: GUID = GUID.from_u128(U128(0x884e2015217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionAuthorityKeyIdentifier: GUID = GUID.from_u128(U128(0x884e2018217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionBasicConstraints: GUID = GUID.from_u128(U128(0x884e2016217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionCertificatePolicies: GUID = GUID.from_u128(U128(0x884e2020217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionEnhancedKeyUsage: GUID = GUID.from_u128(U128(0x884e2010217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionKeyUsage: GUID = GUID.from_u128(U128(0x884e200f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionMSApplicationPolicies: GUID = GUID.from_u128(U128(0x884e2021217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionSmimeCapabilities: GUID = GUID.from_u128(U128(0x884e201b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionSubjectKeyIdentifier: GUID = GUID.from_u128(U128(0x884e2017217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionTemplate: GUID = GUID.from_u128(U128(0x884e2012217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509ExtensionTemplateName: GUID = GUID.from_u128(U128(0x884e2011217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509Extensions: GUID = GUID.from_u128(U128(0x884e200e217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509MachineEnrollmentFactory: GUID = GUID.from_u128(U128(0x884e2051217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509NameValuePair: GUID = GUID.from_u128(U128(0x884e203f217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PolicyServerListManager: GUID = GUID.from_u128(U128(0x91f39029217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PolicyServerUrl: GUID = GUID.from_u128(U128(0x91f3902a217f11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PrivateKey: GUID = GUID.from_u128(U128(0x884e200c217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509PublicKey: GUID = GUID.from_u128(U128(0x884e200b217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509SCEPEnrollment: GUID = GUID.from_u128(U128(0x884e2061217d11dauL, 0xb2a4000e7bbb2b09uL))

public val CX509SCEPEnrollmentHelper: GUID = GUID.from_u128(U128(0x884e2062217d11dauL, 0xb2a4000e7bbb2b09uL))

public val ClientIdAutoEnroll: RequestClientInfoClientId = 6

public val ClientIdAutoEnroll2003: RequestClientInfoClientId = 2

public val ClientIdCertReq: RequestClientInfoClientId = 9

public val ClientIdCertReq2003: RequestClientInfoClientId = 4

public val ClientIdDefaultRequest: RequestClientInfoClientId = 5

public val ClientIdEOBO: RequestClientInfoClientId = 8

public val ClientIdNone: RequestClientInfoClientId = 0

public val ClientIdRequestWizard: RequestClientInfoClientId = 7

public val ClientIdTest: RequestClientInfoClientId = 10

public val ClientIdUserStart: RequestClientInfoClientId = 1000

public val ClientIdWinRT: RequestClientInfoClientId = 11

public val ClientIdWizard2003: RequestClientInfoClientId = 3

public val ClientIdXEnroll2003: RequestClientInfoClientId = 1

public val CommitFlagDeleteTemplate: CommitTemplateFlags = 4

public val CommitFlagSaveTemplateGenerateOID: CommitTemplateFlags = 1

public val CommitFlagSaveTemplateOverwrite: CommitTemplateFlags = 3

public val CommitFlagSaveTemplateUseCurrentOID: CommitTemplateFlags = 2

public val ContextAdministratorForceMachine: X509CertificateEnrollmentContext = 3

public val ContextMachine: X509CertificateEnrollmentContext = 2

public val ContextNone: X509CertificateEnrollmentContext = 0

public val ContextUser: X509CertificateEnrollmentContext = 1

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

public val DefaultNone: EnrollmentPolicyServerPropertyFlags = 0

public val DefaultPolicyServer: EnrollmentPolicyServerPropertyFlags = 1

public val DelayRetryLong: DelayRetryAction = 3

public val DelayRetryNone: DelayRetryAction = 1

public val DelayRetryPastSuccess: DelayRetryAction = 5

public val DelayRetryShort: DelayRetryAction = 2

public val DelayRetrySuccess: DelayRetryAction = 4

public val DelayRetryUnknown: DelayRetryAction = 0

public val DisableGroupPolicyList: EnrollmentPolicyFlags = 2

public val DisableUserServerList: EnrollmentPolicyFlags = 4

public val DisplayNo: EnrollmentDisplayStatus = 0

public val DisplayYes: EnrollmentDisplayStatus = 1

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

public val ENUM_ENTERPRISE_ROOTCA: ENUM_CATYPES = 0

public val ENUM_ENTERPRISE_SUBCA: ENUM_CATYPES = 1

public val ENUM_STANDALONE_ROOTCA: ENUM_CATYPES = 3

public val ENUM_STANDALONE_SUBCA: ENUM_CATYPES = 4

public val ENUM_UNKNOWN_CA: ENUM_CATYPES = 5

public val EXITEVENT_CERTDENIED: CERT_EXIT_EVENT_MASK = 4u

public val EXITEVENT_CERTIMPORTED: UInt = 512u

public val EXITEVENT_CERTISSUED: CERT_EXIT_EVENT_MASK = 1u

public val EXITEVENT_CERTPENDING: CERT_EXIT_EVENT_MASK = 2u

public val EXITEVENT_CERTRETRIEVEPENDING: CERT_EXIT_EVENT_MASK = 16u

public val EXITEVENT_CERTREVOKED: CERT_EXIT_EVENT_MASK = 8u

public val EXITEVENT_CRLISSUED: CERT_EXIT_EVENT_MASK = 32u

public val EXITEVENT_INVALID: UInt = 0u

public val EXITEVENT_SHUTDOWN: CERT_EXIT_EVENT_MASK = 64u

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

public val EnrollDenied: EnrollmentEnrollStatus = 256

public val EnrollError: EnrollmentEnrollStatus = 16

public val EnrollPended: EnrollmentEnrollStatus = 2

public val EnrollPrompt: WebEnrollmentFlags = 1

public val EnrollSkipped: EnrollmentEnrollStatus = 64

public val EnrollUIDeferredEnrollmentRequired: EnrollmentEnrollStatus = 4

public val EnrollUnknown: EnrollmentEnrollStatus = 32

public val Enrolled: EnrollmentEnrollStatus = 1

public val EnrollmentAddOCSPNoCheck: X509CertificateTemplateEnrollmentFlag = 4096

public val EnrollmentAddTemplateName: X509CertificateTemplateEnrollmentFlag = 512

public val EnrollmentAllowEnrollOnBehalfOf: X509CertificateTemplateEnrollmentFlag = 2048

public val EnrollmentAutoEnrollment: X509CertificateTemplateEnrollmentFlag = 32

public val EnrollmentAutoEnrollmentCheckUserDSCertificate: X509CertificateTemplateEnrollmentFlag = 16

public val EnrollmentCertificateIssuancePoliciesFromRequest: X509CertificateTemplateEnrollmentFlag = 131072

public val EnrollmentDomainAuthenticationNotRequired: X509CertificateTemplateEnrollmentFlag = 128

public val EnrollmentIncludeBasicConstraintsForEECerts: X509CertificateTemplateEnrollmentFlag = 32768

public val EnrollmentIncludeSymmetricAlgorithms: X509CertificateTemplateEnrollmentFlag = 1

public val EnrollmentNoRevocationInfoInCerts: X509CertificateTemplateEnrollmentFlag = 16384

public val EnrollmentPendAllRequests: X509CertificateTemplateEnrollmentFlag = 2

public val EnrollmentPreviousApprovalKeyBasedValidateReenrollment: X509CertificateTemplateEnrollmentFlag = 65536

public val EnrollmentPreviousApprovalValidateReenrollment: X509CertificateTemplateEnrollmentFlag = 64

public val EnrollmentPublishToDS: X509CertificateTemplateEnrollmentFlag = 8

public val EnrollmentPublishToKRAContainer: X509CertificateTemplateEnrollmentFlag = 4

public val EnrollmentRemoveInvalidCertificateFromPersonalStore: X509CertificateTemplateEnrollmentFlag = 1024

public val EnrollmentReuseKeyOnFullSmartCard: X509CertificateTemplateEnrollmentFlag = 8192

public val EnrollmentSkipAutoRenewal: X509CertificateTemplateEnrollmentFlag = 262144

public val EnrollmentUserInteractionRequired: X509CertificateTemplateEnrollmentFlag = 256

public val ExportCAs: X509EnrollmentPolicyExportFlags = 4

public val ExportOIDs: X509EnrollmentPolicyExportFlags = 2

public val ExportTemplates: X509EnrollmentPolicyExportFlags = 1

public val FR_PROP_ATTESTATIONCHALLENGE: FULL_RESPONSE_PROPERTY_ID = 20

public val FR_PROP_ATTESTATIONPROVIDERNAME: FULL_RESPONSE_PROPERTY_ID = 21

public val FR_PROP_BODYPARTSTRING: FULL_RESPONSE_PROPERTY_ID = 3

public val FR_PROP_CAEXCHANGECERTIFICATE: FULL_RESPONSE_PROPERTY_ID = 17

public val FR_PROP_CAEXCHANGECERTIFICATECHAIN: FULL_RESPONSE_PROPERTY_ID = 18

public val FR_PROP_CAEXCHANGECERTIFICATECRLCHAIN: FULL_RESPONSE_PROPERTY_ID = 19

public val FR_PROP_CAEXCHANGECERTIFICATEHASH: FULL_RESPONSE_PROPERTY_ID = 16

public val FR_PROP_CLAIMCHALLENGE: UInt = 22u

public val FR_PROP_ENCRYPTEDKEYHASH: FULL_RESPONSE_PROPERTY_ID = 14

public val FR_PROP_FAILINFO: FULL_RESPONSE_PROPERTY_ID = 7

public val FR_PROP_FULLRESPONSE: FULL_RESPONSE_PROPERTY_ID = 1

public val FR_PROP_FULLRESPONSENOPKCS7: FULL_RESPONSE_PROPERTY_ID = 15

public val FR_PROP_ISSUEDCERTIFICATE: FULL_RESPONSE_PROPERTY_ID = 11

public val FR_PROP_ISSUEDCERTIFICATECHAIN: FULL_RESPONSE_PROPERTY_ID = 12

public val FR_PROP_ISSUEDCERTIFICATECRLCHAIN: FULL_RESPONSE_PROPERTY_ID = 13

public val FR_PROP_ISSUEDCERTIFICATEHASH: FULL_RESPONSE_PROPERTY_ID = 10

public val FR_PROP_NONE: FULL_RESPONSE_PROPERTY_ID = 0

public val FR_PROP_OTHERINFOCHOICE: FULL_RESPONSE_PROPERTY_ID = 6

public val FR_PROP_PENDINFOTIME: FULL_RESPONSE_PROPERTY_ID = 9

public val FR_PROP_PENDINFOTOKEN: FULL_RESPONSE_PROPERTY_ID = 8

public val FR_PROP_STATUS: FULL_RESPONSE_PROPERTY_ID = 4

public val FR_PROP_STATUSINFOCOUNT: FULL_RESPONSE_PROPERTY_ID = 2

public val FR_PROP_STATUSSTRING: FULL_RESPONSE_PROPERTY_ID = 5

public val GeneralCA: X509CertificateTemplateGeneralFlag = 128

public val GeneralCrossCA: X509CertificateTemplateGeneralFlag = 2048

public val GeneralDefault: X509CertificateTemplateGeneralFlag = 65536

public val GeneralDonotPersist: X509CertificateTemplateGeneralFlag = 4096

public val GeneralMachineType: X509CertificateTemplateGeneralFlag = 64

public val GeneralModified: X509CertificateTemplateGeneralFlag = 131072

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

public val ImportExportable: ImportPFXFlags = 16

public val ImportExportableEncrypted: ImportPFXFlags = 32

public val ImportForceOverwrite: ImportPFXFlags = 2

public val ImportInstallCertificate: ImportPFXFlags = 512

public val ImportInstallChain: ImportPFXFlags = 1024

public val ImportInstallChainAndRoot: ImportPFXFlags = 2048

public val ImportMachineContext: ImportPFXFlags = 1

public val ImportNoUserProtected: ImportPFXFlags = 64

public val ImportNone: ImportPFXFlags = 0

public val ImportSaveProperties: ImportPFXFlags = 8

public val ImportSilent: ImportPFXFlags = 4

public val ImportUserProtected: ImportPFXFlags = 128

public val ImportUserProtectedHigh: ImportPFXFlags = 256

public val InheritDefault: X509RequestInheritOptions = 0

public val InheritExtensionsFlag: X509RequestInheritOptions = 256

public val InheritKeyMask: X509RequestInheritOptions = 15

public val InheritNewDefaultKey: X509RequestInheritOptions = 1

public val InheritNewSimilarKey: X509RequestInheritOptions = 2

public val InheritNone: X509RequestInheritOptions = 16

public val InheritPrivateKey: X509RequestInheritOptions = 3

public val InheritPublicKey: X509RequestInheritOptions = 4

public val InheritRenewalCertificateFlag: X509RequestInheritOptions = 32

public val InheritReserved80000000: X509RequestInheritOptions = -2147483648

public val InheritSubjectAltNameFlag: X509RequestInheritOptions = 512

public val InheritSubjectFlag: X509RequestInheritOptions = 128

public val InheritTemplateFlag: X509RequestInheritOptions = 64

public val InheritValidityPeriodFlag: X509RequestInheritOptions = 1024

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

public val LevelInnermost: InnerRequestLevel = 0

public val LevelNext: InnerRequestLevel = 1

public val LevelSafe: WebSecurityLevel = 1

public val LevelUnsafe: WebSecurityLevel = 0

public val LoadOptionCacheOnly: X509EnrollmentPolicyLoadOption = 1

public val LoadOptionDefault: X509EnrollmentPolicyLoadOption = 0

public val LoadOptionRegisterForADChanges: X509EnrollmentPolicyLoadOption = 4

public val LoadOptionReload: X509EnrollmentPolicyLoadOption = 2

public val OCSPAdmin: GUID = GUID.from_u128(U128(0xd3f7351192c947cbuL, 0x8ff28d891a7c4de4uL))

public val OCSPPropertyCollection: GUID = GUID.from_u128(U128(0xf935a528ba8a4dd9uL, 0xba79f283275cb2deuL))

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

public val PFXExportChainNoRoot: PFXExportOptions = 1

public val PFXExportChainWithRoot: PFXExportOptions = 2

public val PFXExportEEOnly: PFXExportOptions = 0

public val PROCFLG_ENFORCEGOODKEYS: UInt = 1u

public val PROCFLG_NONE: UInt = 0u

public val PROPCALLER_ADMIN: UInt = 1024u

public val PROPCALLER_EXIT: UInt = 768u

public val PROPCALLER_MASK: UInt = 3840u

public val PROPCALLER_POLICY: UInt = 512u

public val PROPCALLER_REQUEST: UInt = 1280u

public val PROPCALLER_SERVER: UInt = 256u

public val PROPFLAGS_INDEXED: UInt = 65536u

public val PROPTYPE_BINARY: CERT_PROPERTY_TYPE = 3

public val PROPTYPE_DATE: CERT_PROPERTY_TYPE = 2

public val PROPTYPE_LONG: CERT_PROPERTY_TYPE = 1

public val PROPTYPE_MASK: UInt = 255u

public val PROPTYPE_STRING: CERT_PROPERTY_TYPE = 4

public val PolicyQualifierTypeFlags: PolicyQualifierType = 3

public val PolicyQualifierTypeUnknown: PolicyQualifierType = 0

public val PolicyQualifierTypeUrl: PolicyQualifierType = 1

public val PolicyQualifierTypeUserNotice: PolicyQualifierType = 2

public val PrivateKeyAttestMask: X509CertificateTemplatePrivateKeyFlag = 12288

public val PrivateKeyAttestNone: X509CertificateTemplatePrivateKeyFlag = 0

public val PrivateKeyAttestPreferred: X509CertificateTemplatePrivateKeyFlag = 4096

public val PrivateKeyAttestRequired: X509CertificateTemplatePrivateKeyFlag = 8192

public val PrivateKeyAttestWithoutPolicy: X509CertificateTemplatePrivateKeyFlag = 16384

public val PrivateKeyClientVersionMask: X509CertificateTemplatePrivateKeyFlag = 251658240

public val PrivateKeyClientVersionShift: X509CertificateTemplatePrivateKeyFlag = 24

public val PrivateKeyEKTrustOnUse: X509CertificateTemplatePrivateKeyFlag = 512

public val PrivateKeyEKValidateCert: X509CertificateTemplatePrivateKeyFlag = 1024

public val PrivateKeyEKValidateKey: X509CertificateTemplatePrivateKeyFlag = 2048

public val PrivateKeyExportable: X509CertificateTemplatePrivateKeyFlag = 16

public val PrivateKeyHelloKspKey: X509CertificateTemplatePrivateKeyFlag = 1048576

public val PrivateKeyHelloLogonKey: X509CertificateTemplatePrivateKeyFlag = 2097152

public val PrivateKeyRequireAlternateSignatureAlgorithm: X509CertificateTemplatePrivateKeyFlag = 64

public val PrivateKeyRequireArchival: X509CertificateTemplatePrivateKeyFlag = 1

public val PrivateKeyRequireSameKeyRenewal: X509CertificateTemplatePrivateKeyFlag = 128

public val PrivateKeyRequireStrongKeyProtection: X509CertificateTemplatePrivateKeyFlag = 32

public val PrivateKeyServerVersionMask: X509CertificateTemplatePrivateKeyFlag = 983040

public val PrivateKeyServerVersionShift: X509CertificateTemplatePrivateKeyFlag = 16

public val PrivateKeyUseLegacyProvider: X509CertificateTemplatePrivateKeyFlag = 256

public val PsFriendlyName: PolicyServerUrlPropertyID = 1

public val PsPolicyID: PolicyServerUrlPropertyID = 0

public val PsfAllowUnTrustedCA: PolicyServerUrlFlags = 32

public val PsfAutoEnrollmentEnabled: PolicyServerUrlFlags = 16

public val PsfLocationGroupPolicy: PolicyServerUrlFlags = 1

public val PsfLocationRegistry: PolicyServerUrlFlags = 2

public val PsfNone: PolicyServerUrlFlags = 0

public val PsfUseClientId: PolicyServerUrlFlags = 4

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

public val SCEPDispositionFailure: X509SCEPDisposition = 2

public val SCEPDispositionPending: X509SCEPDisposition = 3

public val SCEPDispositionPendingChallenge: X509SCEPDisposition = 11

public val SCEPDispositionSuccess: X509SCEPDisposition = 0

public val SCEPDispositionUnknown: X509SCEPDisposition = -1

public val SCEPFailBadAlgorithm: X509SCEPFailInfo = 0

public val SCEPFailBadCertId: X509SCEPFailInfo = 4

public val SCEPFailBadMessageCheck: X509SCEPFailInfo = 1

public val SCEPFailBadRequest: X509SCEPFailInfo = 2

public val SCEPFailBadTime: X509SCEPFailInfo = 3

public val SCEPFailUnknown: X509SCEPFailInfo = -1

public val SCEPMessageCertResponse: X509SCEPMessageType = 3

public val SCEPMessageClaimChallengeAnswer: X509SCEPMessageType = 41

public val SCEPMessageGetCRL: X509SCEPMessageType = 22

public val SCEPMessageGetCert: X509SCEPMessageType = 21

public val SCEPMessageGetCertInitial: X509SCEPMessageType = 20

public val SCEPMessagePKCSRequest: X509SCEPMessageType = 19

public val SCEPMessageUnknown: X509SCEPMessageType = -1

public val SCEPProcessDefault: X509SCEPProcessMessageFlags = 0

public val SCEPProcessSkipCertInstall: X509SCEPProcessMessageFlags = 1

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

public val SKIHashCapiSha1: KeyIdentifierHashAlgorithm = 2

public val SKIHashDefault: KeyIdentifierHashAlgorithm = 0

public val SKIHashHPKP: KeyIdentifierHashAlgorithm = 5

public val SKIHashSha1: KeyIdentifierHashAlgorithm = 1

public val SKIHashSha256: KeyIdentifierHashAlgorithm = 3

public val SelectedNo: EnrollmentSelectionStatus = 0

public val SelectedYes: EnrollmentSelectionStatus = 1

public val SubjectAlternativeNameEnrolleeSupplies: X509CertificateTemplateSubjectNameFlag = 65536

public val SubjectAlternativeNameRequireDNS: X509CertificateTemplateSubjectNameFlag = 134217728

public val SubjectAlternativeNameRequireDirectoryGUID: X509CertificateTemplateSubjectNameFlag = 16777216

public val SubjectAlternativeNameRequireDomainDNS: X509CertificateTemplateSubjectNameFlag = 4194304

public val SubjectAlternativeNameRequireEmail: X509CertificateTemplateSubjectNameFlag = 67108864

public val SubjectAlternativeNameRequireSPN: X509CertificateTemplateSubjectNameFlag = 8388608

public val SubjectAlternativeNameRequireUPN: X509CertificateTemplateSubjectNameFlag = 33554432

public val SubjectNameAndAlternativeNameOldCertSupplies: X509CertificateTemplateSubjectNameFlag = 8

public val SubjectNameEnrolleeSupplies: X509CertificateTemplateSubjectNameFlag = 1

public val SubjectNameRequireCommonName: X509CertificateTemplateSubjectNameFlag = 1073741824

public val SubjectNameRequireDNS: X509CertificateTemplateSubjectNameFlag = 268435456

public val SubjectNameRequireDirectoryPath: X509CertificateTemplateSubjectNameFlag = -2147483648

public val SubjectNameRequireEmail: X509CertificateTemplateSubjectNameFlag = 536870912

public val TP_MACHINEPOLICY: UInt = 1u

public val TemplatePropAsymmetricAlgorithm: EnrollmentTemplateProperty = 18

public val TemplatePropCertificatePolicies: EnrollmentTemplateProperty = 16

public val TemplatePropCommonName: EnrollmentTemplateProperty = 1

public val TemplatePropCryptoProviders: EnrollmentTemplateProperty = 4

public val TemplatePropDescription: EnrollmentTemplateProperty = 6

public val TemplatePropEKUs: EnrollmentTemplateProperty = 3

public val TemplatePropEnrollmentFlags: EnrollmentTemplateProperty = 24

public val TemplatePropExtensions: EnrollmentTemplateProperty = 29

public val TemplatePropFriendlyName: EnrollmentTemplateProperty = 2

public val TemplatePropGeneralFlags: EnrollmentTemplateProperty = 27

public val TemplatePropHashAlgorithm: EnrollmentTemplateProperty = 22

public val TemplatePropKeySecurityDescriptor: EnrollmentTemplateProperty = 19

public val TemplatePropKeySpec: EnrollmentTemplateProperty = 7

public val TemplatePropKeyUsage: EnrollmentTemplateProperty = 23

public val TemplatePropMajorRevision: EnrollmentTemplateProperty = 5

public val TemplatePropMinimumKeySize: EnrollmentTemplateProperty = 11

public val TemplatePropMinorRevision: EnrollmentTemplateProperty = 9

public val TemplatePropOID: EnrollmentTemplateProperty = 12

public val TemplatePropPrivateKeyFlags: EnrollmentTemplateProperty = 26

public val TemplatePropRACertificatePolicies: EnrollmentTemplateProperty = 14

public val TemplatePropRAEKUs: EnrollmentTemplateProperty = 15

public val TemplatePropRASignatureCount: EnrollmentTemplateProperty = 10

public val TemplatePropRenewalPeriod: EnrollmentTemplateProperty = 31

public val TemplatePropSchemaVersion: EnrollmentTemplateProperty = 8

public val TemplatePropSecurityDescriptor: EnrollmentTemplateProperty = 28

public val TemplatePropSubjectNameFlags: EnrollmentTemplateProperty = 25

public val TemplatePropSupersede: EnrollmentTemplateProperty = 13

public val TemplatePropSymmetricAlgorithm: EnrollmentTemplateProperty = 20

public val TemplatePropSymmetricKeyLength: EnrollmentTemplateProperty = 21

public val TemplatePropV1ApplicationPolicy: EnrollmentTemplateProperty = 17

public val TemplatePropValidityPeriod: EnrollmentTemplateProperty = 30

public val TypeAny: X509RequestType = 0

public val TypeCertificate: X509RequestType = 4

public val TypeCmc: X509RequestType = 3

public val TypePkcs10: X509RequestType = 1

public val TypePkcs7: X509RequestType = 2

public val VR_INSTANT_BAD: UInt = 2u

public val VR_INSTANT_OK: UInt = 1u

public val VR_PENDING: UInt = 0u

public val VerifyAllowUI: X509PrivateKeyVerify = 4

public val VerifyNone: X509PrivateKeyVerify = 0

public val VerifySilent: X509PrivateKeyVerify = 1

public val VerifySmartCardNone: X509PrivateKeyVerify = 2

public val VerifySmartCardSilent: X509PrivateKeyVerify = 3

public val X509AuthAnonymous: X509EnrollmentAuthFlags = 1

public val X509AuthCertificate: X509EnrollmentAuthFlags = 8

public val X509AuthKerberos: X509EnrollmentAuthFlags = 2

public val X509AuthNone: X509EnrollmentAuthFlags = 0

public val X509AuthUsername: X509EnrollmentAuthFlags = 4

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

public val XCN_CERT_ACCESS_STATE_PROP_ID: CERTENROLL_PROPERTYID = 14

public val XCN_CERT_AIA_URL_RETRIEVED_PROP_ID: CERTENROLL_PROPERTYID = 67

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

public val XCN_CERT_ARCHIVED_KEY_HASH_PROP_ID: CERTENROLL_PROPERTYID = 65

public val XCN_CERT_ARCHIVED_PROP_ID: CERTENROLL_PROPERTYID = 19

public val XCN_CERT_AUTHORITY_INFO_ACCESS_PROP_ID: CERTENROLL_PROPERTYID = 68

public val XCN_CERT_AUTH_ROOT_SHA256_HASH_PROP_ID: CERTENROLL_PROPERTYID = 98

public val XCN_CERT_AUTO_ENROLL_PROP_ID: CERTENROLL_PROPERTYID = 21

public val XCN_CERT_AUTO_ENROLL_RETRY_PROP_ID: CERTENROLL_PROPERTYID = 66

public val XCN_CERT_BACKED_UP_PROP_ID: CERTENROLL_PROPERTYID = 69

public val XCN_CERT_CA_DISABLE_CRL_PROP_ID: CERTENROLL_PROPERTYID = 82

public val XCN_CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: CERTENROLL_PROPERTYID = 81

public val XCN_CERT_CEP_PROP_ID: CERTENROLL_PROPERTYID = 87

public val XCN_CERT_CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID: CERTENROLL_PROPERTYID = 127

public val XCN_CERT_CLR_DELETE_KEY_PROP_ID: CERTENROLL_PROPERTYID = 125

public val XCN_CERT_CRL_SIGN_KEY_USAGE: X509KeyUsageFlags = 2

public val XCN_CERT_CROSS_CERT_DIST_POINTS_PROP_ID: CERTENROLL_PROPERTYID = 23

public val XCN_CERT_CTL_USAGE_PROP_ID: CERTENROLL_PROPERTYID = 9

public val XCN_CERT_DATA_ENCIPHERMENT_KEY_USAGE: X509KeyUsageFlags = 16

public val XCN_CERT_DATE_STAMP_PROP_ID: CERTENROLL_PROPERTYID = 27

public val XCN_CERT_DECIPHER_ONLY_KEY_USAGE: X509KeyUsageFlags = 32768

public val XCN_CERT_DESCRIPTION_PROP_ID: CERTENROLL_PROPERTYID = 13

public val XCN_CERT_DIGITAL_SIGNATURE_KEY_USAGE: X509KeyUsageFlags = 128

public val XCN_CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID: CERTENROLL_PROPERTYID = 122

public val XCN_CERT_DISALLOWED_FILETIME_PROP_ID: CERTENROLL_PROPERTYID = 104

public val XCN_CERT_EFS_PROP_ID: CERTENROLL_PROPERTYID = 17

public val XCN_CERT_ENCIPHER_ONLY_KEY_USAGE: X509KeyUsageFlags = 1

public val XCN_CERT_ENHKEY_USAGE_PROP_ID: CERTENROLL_PROPERTYID = 9

public val XCN_CERT_ENROLLMENT_PROP_ID: CERTENROLL_PROPERTYID = 26

public val XCN_CERT_EXTENDED_ERROR_INFO_PROP_ID: CERTENROLL_PROPERTYID = 30

public val XCN_CERT_FIRST_RESERVED_PROP_ID: CERTENROLL_PROPERTYID = 129

public val XCN_CERT_FIRST_USER_PROP_ID: CERTENROLL_PROPERTYID = 32768

public val XCN_CERT_FORTEZZA_DATA_PROP_ID: CERTENROLL_PROPERTYID = 18

public val XCN_CERT_FRIENDLY_NAME_PROP_ID: CERTENROLL_PROPERTYID = 11

public val XCN_CERT_HASH_PROP_ID: CERTENROLL_PROPERTYID = 3

public val XCN_CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID: CERTENROLL_PROPERTYID = 79

public val XCN_CERT_HCRYPTPROV_TRANSFER_PROP_ID: CERTENROLL_PROPERTYID = 100

public val XCN_CERT_IE30_RESERVED_PROP_ID: CERTENROLL_PROPERTYID = 7

public val XCN_CERT_ISOLATED_KEY_PROP_ID: CERTENROLL_PROPERTYID = 118

public val XCN_CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: CERTENROLL_PROPERTYID = 96

public val XCN_CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID: CERTENROLL_PROPERTYID = 95

public val XCN_CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID: CERTENROLL_PROPERTYID = 24

public val XCN_CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID: CERTENROLL_PROPERTYID = 94

public val XCN_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: CERTENROLL_PROPERTYID = 28

public val XCN_CERT_KEY_AGREEMENT_KEY_USAGE: X509KeyUsageFlags = 8

public val XCN_CERT_KEY_CERT_SIGN_KEY_USAGE: X509KeyUsageFlags = 4

public val XCN_CERT_KEY_CLASSIFICATION_PROP_ID: CERTENROLL_PROPERTYID = 120

public val XCN_CERT_KEY_CONTEXT_PROP_ID: CERTENROLL_PROPERTYID = 5

public val XCN_CERT_KEY_ENCIPHERMENT_KEY_USAGE: X509KeyUsageFlags = 32

public val XCN_CERT_KEY_IDENTIFIER_PROP_ID: CERTENROLL_PROPERTYID = 20

public val XCN_CERT_KEY_PROV_HANDLE_PROP_ID: CERTENROLL_PROPERTYID = 1

public val XCN_CERT_KEY_PROV_INFO_PROP_ID: CERTENROLL_PROPERTYID = 2

public val XCN_CERT_KEY_REPAIR_ATTEMPTED_PROP_ID: CERTENROLL_PROPERTYID = 103

public val XCN_CERT_KEY_SPEC_PROP_ID: CERTENROLL_PROPERTYID = 6

public val XCN_CERT_LAST_RESERVED_PROP_ID: CERTENROLL_PROPERTYID = 32767

public val XCN_CERT_LAST_USER_PROP_ID: CERTENROLL_PROPERTYID = 65535

public val XCN_CERT_MD5_HASH_PROP_ID: CERTENROLL_PROPERTYID = 4

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

public val XCN_CERT_NCRYPT_KEY_HANDLE_PROP_ID: CERTENROLL_PROPERTYID = 78

public val XCN_CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID: CERTENROLL_PROPERTYID = 99

public val XCN_CERT_NEW_KEY_PROP_ID: CERTENROLL_PROPERTYID = 74

public val XCN_CERT_NEXT_UPDATE_LOCATION_PROP_ID: CERTENROLL_PROPERTYID = 10

public val XCN_CERT_NONCOMPLIANT_ROOT_URL_PROP_ID: CERTENROLL_PROPERTYID = 123

public val XCN_CERT_NON_REPUDIATION_KEY_USAGE: X509KeyUsageFlags = 64

public val XCN_CERT_NOT_BEFORE_FILETIME_PROP_ID: CERTENROLL_PROPERTYID = 126

public val XCN_CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID: CERTENROLL_PROPERTYID = 77

public val XCN_CERT_NO_EXPIRE_NOTIFICATION_PROP_ID: CERTENROLL_PROPERTYID = 97

public val XCN_CERT_NO_KEY_USAGE: X509KeyUsageFlags = 0

public val XCN_CERT_OCSP_CACHE_PREFIX_PROP_ID: CERTENROLL_PROPERTYID = 75

public val XCN_CERT_OCSP_RESPONSE_PROP_ID: CERTENROLL_PROPERTYID = 70

public val XCN_CERT_OFFLINE_CRL_SIGN_KEY_USAGE: X509KeyUsageFlags = 2

public val XCN_CERT_OID_NAME_STR: X500NameFlags = 2

public val XCN_CERT_PIN_SHA256_HASH_PROP_ID: CERTENROLL_PROPERTYID = 124

public val XCN_CERT_PUBKEY_ALG_PARA_PROP_ID: CERTENROLL_PROPERTYID = 22

public val XCN_CERT_PUBKEY_HASH_RESERVED_PROP_ID: CERTENROLL_PROPERTYID = 8

public val XCN_CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: CERTENROLL_PROPERTYID = 93

public val XCN_CERT_PVK_FILE_PROP_ID: CERTENROLL_PROPERTYID = 12

public val XCN_CERT_RENEWAL_PROP_ID: CERTENROLL_PROPERTYID = 64

public val XCN_CERT_REQUEST_ORIGINATOR_PROP_ID: CERTENROLL_PROPERTYID = 71

public val XCN_CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID: CERTENROLL_PROPERTYID = 83

public val XCN_CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID: CERTENROLL_PROPERTYID = 105

public val XCN_CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID: CERTENROLL_PROPERTYID = 84

public val XCN_CERT_SCARD_PIN_ID_PROP_ID: CERTENROLL_PROPERTYID = 90

public val XCN_CERT_SCARD_PIN_INFO_PROP_ID: CERTENROLL_PROPERTYID = 91

public val XCN_CERT_SCEP_CA_CERT_PROP_ID: CERTENROLL_PROPERTYID = 111

public val XCN_CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID: CERTENROLL_PROPERTYID = 114

public val XCN_CERT_SCEP_FLAGS_PROP_ID: CERTENROLL_PROPERTYID = 115

public val XCN_CERT_SCEP_GUID_PROP_ID: CERTENROLL_PROPERTYID = 116

public val XCN_CERT_SCEP_NONCE_PROP_ID: CERTENROLL_PROPERTYID = 113

public val XCN_CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID: CERTENROLL_PROPERTYID = 110

public val XCN_CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID: CERTENROLL_PROPERTYID = 109

public val XCN_CERT_SCEP_SERVER_CERTS_PROP_ID: CERTENROLL_PROPERTYID = 108

public val XCN_CERT_SCEP_SIGNER_CERT_PROP_ID: CERTENROLL_PROPERTYID = 112

public val XCN_CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID: CERTENROLL_PROPERTYID = 102

public val XCN_CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID: CERTENROLL_PROPERTYID = 117

public val XCN_CERT_SERIAL_CHAIN_PROP_ID: CERTENROLL_PROPERTYID = 119

public val XCN_CERT_SHA1_HASH_PROP_ID: CERTENROLL_PROPERTYID = 3

public val XCN_CERT_SHA256_HASH_PROP_ID: CERTENROLL_PROPERTYID = 107

public val XCN_CERT_SIGNATURE_HASH_PROP_ID: CERTENROLL_PROPERTYID = 15

public val XCN_CERT_SIGN_HASH_CNG_ALG_PROP_ID: CERTENROLL_PROPERTYID = 89

public val XCN_CERT_SIMPLE_NAME_STR: X500NameFlags = 1

public val XCN_CERT_SMART_CARD_DATA_PROP_ID: CERTENROLL_PROPERTYID = 16

public val XCN_CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID: CERTENROLL_PROPERTYID = 106

public val XCN_CERT_SMART_CARD_READER_PROP_ID: CERTENROLL_PROPERTYID = 101

public val XCN_CERT_SMART_CARD_ROOT_INFO_PROP_ID: CERTENROLL_PROPERTYID = 76

public val XCN_CERT_SOURCE_LOCATION_PROP_ID: CERTENROLL_PROPERTYID = 72

public val XCN_CERT_SOURCE_URL_PROP_ID: CERTENROLL_PROPERTYID = 73

public val XCN_CERT_STORE_LOCALIZED_NAME_PROP_ID: CERTENROLL_PROPERTYID = 4096

public val XCN_CERT_SUBJECT_DISABLE_CRL_PROP_ID: CERTENROLL_PROPERTYID = 86

public val XCN_CERT_SUBJECT_INFO_ACCESS_PROP_ID: CERTENROLL_PROPERTYID = 80

public val XCN_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: CERTENROLL_PROPERTYID = 29

public val XCN_CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: CERTENROLL_PROPERTYID = 85

public val XCN_CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID: CERTENROLL_PROPERTYID = 25

public val XCN_CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID: CERTENROLL_PROPERTYID = 92

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

public val XCN_CRYPT_OID_DISABLE_SEARCH_DS_FLAG: ObjectIdGroupId = -2147483648

public val XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK: ObjectIdGroupId = 268369920

public val XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT: ObjectIdGroupId = 16

public val XCN_CRYPT_OID_INFO_PUBKEY_ANY: ObjectIdPublicKeyFlags = 0

public val XCN_CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG: ObjectIdPublicKeyFlags = 1073741824

public val XCN_CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG: ObjectIdPublicKeyFlags = -2147483648

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

public val XCN_CRYPT_STRING_NOCR: EncodingType = -2147483648

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

public val XCN_OIDVerisign_FailInfo: CERTENROLL_OBJECTID = 431

public val XCN_OIDVerisign_MessageType: CERTENROLL_OBJECTID = 429

public val XCN_OIDVerisign_PkiStatus: CERTENROLL_OBJECTID = 430

public val XCN_OIDVerisign_RecipientNonce: CERTENROLL_OBJECTID = 433

public val XCN_OIDVerisign_SenderNonce: CERTENROLL_OBJECTID = 432

public val XCN_OIDVerisign_TransactionID: CERTENROLL_OBJECTID = 434

public val XCN_OID_ANSI_X942: CERTENROLL_OBJECTID = 53

public val XCN_OID_ANSI_X942_DH: CERTENROLL_OBJECTID = 54

public val XCN_OID_ANY_APPLICATION_POLICY: CERTENROLL_OBJECTID = 216

public val XCN_OID_ANY_CERT_POLICY: CERTENROLL_OBJECTID = 180

public val XCN_OID_ANY_ENHANCED_KEY_USAGE: CERTENROLL_OBJECTID = 352

public val XCN_OID_APPLICATION_CERT_POLICIES: CERTENROLL_OBJECTID = 229

public val XCN_OID_APPLICATION_POLICY_CONSTRAINTS: CERTENROLL_OBJECTID = 231

public val XCN_OID_APPLICATION_POLICY_MAPPINGS: CERTENROLL_OBJECTID = 230

public val XCN_OID_ARCHIVED_KEY_ATTR: CERTENROLL_OBJECTID = 232

public val XCN_OID_ARCHIVED_KEY_CERT_HASH: CERTENROLL_OBJECTID = 235

public val XCN_OID_ATTR_SUPPORTED_ALGORITHMS: CERTENROLL_OBJECTID = 355

public val XCN_OID_ATTR_TPM_SECURITY_ASSERTIONS: CERTENROLL_OBJECTID = 356

public val XCN_OID_ATTR_TPM_SPECIFICATION: CERTENROLL_OBJECTID = 357

public val XCN_OID_AUTHORITY_INFO_ACCESS: CERTENROLL_OBJECTID = 204

public val XCN_OID_AUTHORITY_KEY_IDENTIFIER: CERTENROLL_OBJECTID = 169

public val XCN_OID_AUTHORITY_KEY_IDENTIFIER2: CERTENROLL_OBJECTID = 181

public val XCN_OID_AUTHORITY_REVOCATION_LIST: CERTENROLL_OBJECTID = 156

public val XCN_OID_AUTO_ENROLL_CTL_USAGE: CERTENROLL_OBJECTID = 217

public val XCN_OID_BACKGROUND_OTHER_LOGOTYPE: CERTENROLL_OBJECTID = 327

public val XCN_OID_BASIC_CONSTRAINTS: CERTENROLL_OBJECTID = 175

public val XCN_OID_BASIC_CONSTRAINTS2: CERTENROLL_OBJECTID = 178

public val XCN_OID_BIOMETRIC_EXT: CERTENROLL_OBJECTID = 205

public val XCN_OID_BUSINESS_CATEGORY: CERTENROLL_OBJECTID = 133

public val XCN_OID_CA_CERTIFICATE: CERTENROLL_OBJECTID = 155

public val XCN_OID_CERTIFICATE_REVOCATION_LIST: CERTENROLL_OBJECTID = 157

public val XCN_OID_CERTIFICATE_TEMPLATE: CERTENROLL_OBJECTID = 226

public val XCN_OID_CERTSRV_CA_VERSION: CERTENROLL_OBJECTID = 220

public val XCN_OID_CERTSRV_CROSSCA_VERSION: CERTENROLL_OBJECTID = 240

public val XCN_OID_CERTSRV_PREVIOUS_CERT_HASH: CERTENROLL_OBJECTID = 221

public val XCN_OID_CERT_DISALLOWED_FILETIME_PROP_ID: CERTENROLL_OBJECTID = 358

public val XCN_OID_CERT_EXTENSIONS: CERTENROLL_OBJECTID = 207

public val XCN_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: CERTENROLL_OBJECTID = 339

public val XCN_OID_CERT_KEY_IDENTIFIER_PROP_ID: CERTENROLL_OBJECTID = 338

public val XCN_OID_CERT_MANIFOLD: CERTENROLL_OBJECTID = 219

public val XCN_OID_CERT_MD5_HASH_PROP_ID: CERTENROLL_OBJECTID = 341

public val XCN_OID_CERT_POLICIES: CERTENROLL_OBJECTID = 179

public val XCN_OID_CERT_POLICIES_95: CERTENROLL_OBJECTID = 171

public val XCN_OID_CERT_POLICIES_95_QUALIFIER1: CERTENROLL_OBJECTID = 281

public val XCN_OID_CERT_PROP_ID_PREFIX: CERTENROLL_OBJECTID = 337

public val XCN_OID_CERT_SIGNATURE_HASH_PROP_ID: CERTENROLL_OBJECTID = 359

public val XCN_OID_CERT_STRONG_KEY_OS_1: CERTENROLL_OBJECTID = 360

public val XCN_OID_CERT_STRONG_KEY_OS_CURRENT: CERTENROLL_OBJECTID = 361

public val XCN_OID_CERT_STRONG_KEY_OS_PREFIX: CERTENROLL_OBJECTID = 362

public val XCN_OID_CERT_STRONG_SIGN_OS_1: CERTENROLL_OBJECTID = 363

public val XCN_OID_CERT_STRONG_SIGN_OS_CURRENT: CERTENROLL_OBJECTID = 364

public val XCN_OID_CERT_STRONG_SIGN_OS_PREFIX: CERTENROLL_OBJECTID = 365

public val XCN_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: CERTENROLL_OBJECTID = 340

public val XCN_OID_CMC: CERTENROLL_OBJECTID = 304

public val XCN_OID_CMC_ADD_ATTRIBUTES: CERTENROLL_OBJECTID = 325

public val XCN_OID_CMC_ADD_EXTENSIONS: CERTENROLL_OBJECTID = 312

public val XCN_OID_CMC_DATA_RETURN: CERTENROLL_OBJECTID = 308

public val XCN_OID_CMC_DECRYPTED_POP: CERTENROLL_OBJECTID = 314

public val XCN_OID_CMC_ENCRYPTED_POP: CERTENROLL_OBJECTID = 313

public val XCN_OID_CMC_GET_CERT: CERTENROLL_OBJECTID = 316

public val XCN_OID_CMC_GET_CRL: CERTENROLL_OBJECTID = 317

public val XCN_OID_CMC_IDENTIFICATION: CERTENROLL_OBJECTID = 306

public val XCN_OID_CMC_IDENTITY_PROOF: CERTENROLL_OBJECTID = 307

public val XCN_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE: CERTENROLL_OBJECTID = 324

public val XCN_OID_CMC_ID_POP_LINK_RANDOM: CERTENROLL_OBJECTID = 322

public val XCN_OID_CMC_ID_POP_LINK_WITNESS: CERTENROLL_OBJECTID = 323

public val XCN_OID_CMC_LRA_POP_WITNESS: CERTENROLL_OBJECTID = 315

public val XCN_OID_CMC_QUERY_PENDING: CERTENROLL_OBJECTID = 321

public val XCN_OID_CMC_RECIPIENT_NONCE: CERTENROLL_OBJECTID = 311

public val XCN_OID_CMC_REG_INFO: CERTENROLL_OBJECTID = 319

public val XCN_OID_CMC_RESPONSE_INFO: CERTENROLL_OBJECTID = 320

public val XCN_OID_CMC_REVOKE_REQUEST: CERTENROLL_OBJECTID = 318

public val XCN_OID_CMC_SENDER_NONCE: CERTENROLL_OBJECTID = 310

public val XCN_OID_CMC_STATUS_INFO: CERTENROLL_OBJECTID = 305

public val XCN_OID_CMC_TRANSACTION_ID: CERTENROLL_OBJECTID = 309

public val XCN_OID_COMMON_NAME: CERTENROLL_OBJECTID = 121

public val XCN_OID_COUNTRY_NAME: CERTENROLL_OBJECTID = 124

public val XCN_OID_CRL_DIST_POINTS: CERTENROLL_OBJECTID = 187

public val XCN_OID_CRL_NEXT_PUBLISH: CERTENROLL_OBJECTID = 223

public val XCN_OID_CRL_NUMBER: CERTENROLL_OBJECTID = 189

public val XCN_OID_CRL_REASON_CODE: CERTENROLL_OBJECTID = 185

public val XCN_OID_CRL_SELF_CDP: CERTENROLL_OBJECTID = 233

public val XCN_OID_CRL_VIRTUAL_BASE: CERTENROLL_OBJECTID = 222

public val XCN_OID_CROSS_CERTIFICATE_PAIR: CERTENROLL_OBJECTID = 158

public val XCN_OID_CROSS_CERT_DIST_POINTS: CERTENROLL_OBJECTID = 210

public val XCN_OID_CTL: CERTENROLL_OBJECTID = 211

public val XCN_OID_CT_PKI_DATA: CERTENROLL_OBJECTID = 301

public val XCN_OID_CT_PKI_RESPONSE: CERTENROLL_OBJECTID = 302

public val XCN_OID_DELTA_CRL_INDICATOR: CERTENROLL_OBJECTID = 190

public val XCN_OID_DESCRIPTION: CERTENROLL_OBJECTID = 131

public val XCN_OID_DESTINATION_INDICATOR: CERTENROLL_OBJECTID = 145

public val XCN_OID_DEVICE_SERIAL_NUMBER: CERTENROLL_OBJECTID = 123

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF: CERTENROLL_OBJECTID = 366

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF: CERTENROLL_OBJECTID = 367

public val XCN_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF: CERTENROLL_OBJECTID = 368

public val XCN_OID_DISALLOWED_HASH: CERTENROLL_OBJECTID = 369

public val XCN_OID_DISALLOWED_LIST: CERTENROLL_OBJECTID = 370

public val XCN_OID_DN_QUALIFIER: CERTENROLL_OBJECTID = 161

public val XCN_OID_DOMAIN_COMPONENT: CERTENROLL_OBJECTID = 162

public val XCN_OID_DRM: CERTENROLL_OBJECTID = 273

public val XCN_OID_DRM_INDIVIDUALIZATION: CERTENROLL_OBJECTID = 274

public val XCN_OID_DS: CERTENROLL_OBJECTID = 58

public val XCN_OID_DSALG: CERTENROLL_OBJECTID = 59

public val XCN_OID_DSALG_CRPT: CERTENROLL_OBJECTID = 60

public val XCN_OID_DSALG_HASH: CERTENROLL_OBJECTID = 61

public val XCN_OID_DSALG_RSA: CERTENROLL_OBJECTID = 63

public val XCN_OID_DSALG_SIGN: CERTENROLL_OBJECTID = 62

public val XCN_OID_DS_EMAIL_REPLICATION: CERTENROLL_OBJECTID = 237

public val XCN_OID_ECC_CURVE_P256: CERTENROLL_OBJECTID = 371

public val XCN_OID_ECC_CURVE_P384: CERTENROLL_OBJECTID = 372

public val XCN_OID_ECC_CURVE_P521: CERTENROLL_OBJECTID = 373

public val XCN_OID_ECC_PUBLIC_KEY: CERTENROLL_OBJECTID = 349

public val XCN_OID_ECDSA_SHA1: CERTENROLL_OBJECTID = 350

public val XCN_OID_ECDSA_SHA256: CERTENROLL_OBJECTID = 374

public val XCN_OID_ECDSA_SHA384: CERTENROLL_OBJECTID = 375

public val XCN_OID_ECDSA_SHA512: CERTENROLL_OBJECTID = 376

public val XCN_OID_ECDSA_SPECIFIED: CERTENROLL_OBJECTID = 351

public val XCN_OID_EFS_RECOVERY: CERTENROLL_OBJECTID = 260

public val XCN_OID_EMBEDDED_NT_CRYPTO: CERTENROLL_OBJECTID = 264

public val XCN_OID_ENCRYPTED_KEY_HASH: CERTENROLL_OBJECTID = 239

public val XCN_OID_ENHANCED_KEY_USAGE: CERTENROLL_OBJECTID = 188

public val XCN_OID_ENROLLMENT_AGENT: CERTENROLL_OBJECTID = 201

public val XCN_OID_ENROLLMENT_CSP_PROVIDER: CERTENROLL_OBJECTID = 199

public val XCN_OID_ENROLLMENT_NAME_VALUE_PAIR: CERTENROLL_OBJECTID = 198

public val XCN_OID_ENROLL_ATTESTATION_CHALLENGE: CERTENROLL_OBJECTID = 435

public val XCN_OID_ENROLL_ATTESTATION_STATEMENT: CERTENROLL_OBJECTID = 436

public val XCN_OID_ENROLL_CAXCHGCERT_HASH: CERTENROLL_OBJECTID = 377

public val XCN_OID_ENROLL_CERTTYPE_EXTENSION: CERTENROLL_OBJECTID = 218

public val XCN_OID_ENROLL_EKPUB_CHALLENGE: CERTENROLL_OBJECTID = 379

public val XCN_OID_ENROLL_EKVERIFYCERT: CERTENROLL_OBJECTID = 380

public val XCN_OID_ENROLL_EKVERIFYCREDS: CERTENROLL_OBJECTID = 381

public val XCN_OID_ENROLL_EKVERIFYKEY: CERTENROLL_OBJECTID = 382

public val XCN_OID_ENROLL_EK_INFO: CERTENROLL_OBJECTID = 378

public val XCN_OID_ENROLL_ENCRYPTION_ALGORITHM: CERTENROLL_OBJECTID = 437

public val XCN_OID_ENROLL_KSP_NAME: CERTENROLL_OBJECTID = 438

public val XCN_OID_ENROLL_SCEP_ERROR: CERTENROLL_OBJECTID = 428

public val XCN_OID_ENTERPRISE_OID_ROOT: CERTENROLL_OBJECTID = 227

public val XCN_OID_EV_RDN_COUNTRY: CERTENROLL_OBJECTID = 383

public val XCN_OID_EV_RDN_LOCALE: CERTENROLL_OBJECTID = 384

public val XCN_OID_EV_RDN_STATE_OR_PROVINCE: CERTENROLL_OBJECTID = 385

public val XCN_OID_FACSIMILE_TELEPHONE_NUMBER: CERTENROLL_OBJECTID = 141

public val XCN_OID_FRESHEST_CRL: CERTENROLL_OBJECTID = 192

public val XCN_OID_GIVEN_NAME: CERTENROLL_OBJECTID = 159

public val XCN_OID_INFOSEC: CERTENROLL_OBJECTID = 99

public val XCN_OID_INFOSEC_SuiteAConfidentiality: CERTENROLL_OBJECTID = 113

public val XCN_OID_INFOSEC_SuiteAIntegrity: CERTENROLL_OBJECTID = 114

public val XCN_OID_INFOSEC_SuiteAKMandSig: CERTENROLL_OBJECTID = 117

public val XCN_OID_INFOSEC_SuiteAKeyManagement: CERTENROLL_OBJECTID = 116

public val XCN_OID_INFOSEC_SuiteASignature: CERTENROLL_OBJECTID = 112

public val XCN_OID_INFOSEC_SuiteATokenProtection: CERTENROLL_OBJECTID = 115

public val XCN_OID_INFOSEC_mosaicConfidentiality: CERTENROLL_OBJECTID = 103

public val XCN_OID_INFOSEC_mosaicIntegrity: CERTENROLL_OBJECTID = 105

public val XCN_OID_INFOSEC_mosaicKMandSig: CERTENROLL_OBJECTID = 111

public val XCN_OID_INFOSEC_mosaicKMandUpdSig: CERTENROLL_OBJECTID = 119

public val XCN_OID_INFOSEC_mosaicKeyManagement: CERTENROLL_OBJECTID = 109

public val XCN_OID_INFOSEC_mosaicSignature: CERTENROLL_OBJECTID = 101

public val XCN_OID_INFOSEC_mosaicTokenProtection: CERTENROLL_OBJECTID = 107

public val XCN_OID_INFOSEC_mosaicUpdatedInteg: CERTENROLL_OBJECTID = 120

public val XCN_OID_INFOSEC_mosaicUpdatedSig: CERTENROLL_OBJECTID = 118

public val XCN_OID_INFOSEC_sdnsConfidentiality: CERTENROLL_OBJECTID = 102

public val XCN_OID_INFOSEC_sdnsIntegrity: CERTENROLL_OBJECTID = 104

public val XCN_OID_INFOSEC_sdnsKMandSig: CERTENROLL_OBJECTID = 110

public val XCN_OID_INFOSEC_sdnsKeyManagement: CERTENROLL_OBJECTID = 108

public val XCN_OID_INFOSEC_sdnsSignature: CERTENROLL_OBJECTID = 100

public val XCN_OID_INFOSEC_sdnsTokenProtection: CERTENROLL_OBJECTID = 106

public val XCN_OID_INHIBIT_ANY_POLICY: CERTENROLL_OBJECTID = 386

public val XCN_OID_INITIALS: CERTENROLL_OBJECTID = 160

public val XCN_OID_INTERNATIONALIZED_EMAIL_ADDRESS: CERTENROLL_OBJECTID = 387

public val XCN_OID_INTERNATIONAL_ISDN_NUMBER: CERTENROLL_OBJECTID = 143

public val XCN_OID_IPSEC_KP_IKE_INTERMEDIATE: CERTENROLL_OBJECTID = 254

public val XCN_OID_ISSUED_CERT_HASH: CERTENROLL_OBJECTID = 236

public val XCN_OID_ISSUER_ALT_NAME: CERTENROLL_OBJECTID = 174

public val XCN_OID_ISSUER_ALT_NAME2: CERTENROLL_OBJECTID = 184

public val XCN_OID_ISSUING_DIST_POINT: CERTENROLL_OBJECTID = 191

public val XCN_OID_KEYID_RDN: CERTENROLL_OBJECTID = 168

public val XCN_OID_KEY_ATTRIBUTES: CERTENROLL_OBJECTID = 170

public val XCN_OID_KEY_USAGE: CERTENROLL_OBJECTID = 176

public val XCN_OID_KEY_USAGE_RESTRICTION: CERTENROLL_OBJECTID = 172

public val XCN_OID_KP_CA_EXCHANGE: CERTENROLL_OBJECTID = 224

public val XCN_OID_KP_CSP_SIGNATURE: CERTENROLL_OBJECTID = 272

public val XCN_OID_KP_CTL_USAGE_SIGNING: CERTENROLL_OBJECTID = 255

public val XCN_OID_KP_DOCUMENT_SIGNING: CERTENROLL_OBJECTID = 268

public val XCN_OID_KP_EFS: CERTENROLL_OBJECTID = 259

public val XCN_OID_KP_KERNEL_MODE_CODE_SIGNING: CERTENROLL_OBJECTID = 388

public val XCN_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING: CERTENROLL_OBJECTID = 389

public val XCN_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING: CERTENROLL_OBJECTID = 390

public val XCN_OID_KP_KEY_RECOVERY: CERTENROLL_OBJECTID = 267

public val XCN_OID_KP_KEY_RECOVERY_AGENT: CERTENROLL_OBJECTID = 225

public val XCN_OID_KP_LIFETIME_SIGNING: CERTENROLL_OBJECTID = 269

public val XCN_OID_KP_MOBILE_DEVICE_SOFTWARE: CERTENROLL_OBJECTID = 270

public val XCN_OID_KP_QUALIFIED_SUBORDINATION: CERTENROLL_OBJECTID = 266

public val XCN_OID_KP_SMARTCARD_LOGON: CERTENROLL_OBJECTID = 277

public val XCN_OID_KP_SMART_DISPLAY: CERTENROLL_OBJECTID = 271

public val XCN_OID_KP_TIME_STAMP_SIGNING: CERTENROLL_OBJECTID = 256

public val XCN_OID_KP_TPM_AIK_CERTIFICATE: CERTENROLL_OBJECTID = 391

public val XCN_OID_KP_TPM_EK_CERTIFICATE: CERTENROLL_OBJECTID = 392

public val XCN_OID_KP_TPM_PLATFORM_CERTIFICATE: CERTENROLL_OBJECTID = 393

public val XCN_OID_LEGACY_POLICY_MAPPINGS: CERTENROLL_OBJECTID = 195

public val XCN_OID_LICENSES: CERTENROLL_OBJECTID = 275

public val XCN_OID_LICENSE_SERVER: CERTENROLL_OBJECTID = 276

public val XCN_OID_LOCALITY_NAME: CERTENROLL_OBJECTID = 125

public val XCN_OID_LOCAL_MACHINE_KEYSET: CERTENROLL_OBJECTID = 166

public val XCN_OID_LOGOTYPE_EXT: CERTENROLL_OBJECTID = 206

public val XCN_OID_LOYALTY_OTHER_LOGOTYPE: CERTENROLL_OBJECTID = 326

public val XCN_OID_MEMBER: CERTENROLL_OBJECTID = 149

public val XCN_OID_NAME_CONSTRAINTS: CERTENROLL_OBJECTID = 193

public val XCN_OID_NETSCAPE: CERTENROLL_OBJECTID = 289

public val XCN_OID_NETSCAPE_BASE_URL: CERTENROLL_OBJECTID = 292

public val XCN_OID_NETSCAPE_CA_POLICY_URL: CERTENROLL_OBJECTID = 296

public val XCN_OID_NETSCAPE_CA_REVOCATION_URL: CERTENROLL_OBJECTID = 294

public val XCN_OID_NETSCAPE_CERT_EXTENSION: CERTENROLL_OBJECTID = 290

public val XCN_OID_NETSCAPE_CERT_RENEWAL_URL: CERTENROLL_OBJECTID = 295

public val XCN_OID_NETSCAPE_CERT_SEQUENCE: CERTENROLL_OBJECTID = 300

public val XCN_OID_NETSCAPE_CERT_TYPE: CERTENROLL_OBJECTID = 291

public val XCN_OID_NETSCAPE_COMMENT: CERTENROLL_OBJECTID = 298

public val XCN_OID_NETSCAPE_DATA_TYPE: CERTENROLL_OBJECTID = 299

public val XCN_OID_NETSCAPE_REVOCATION_URL: CERTENROLL_OBJECTID = 293

public val XCN_OID_NETSCAPE_SSL_SERVER_NAME: CERTENROLL_OBJECTID = 297

public val XCN_OID_NEXT_UPDATE_LOCATION: CERTENROLL_OBJECTID = 208

public val XCN_OID_NIST_AES128_CBC: CERTENROLL_OBJECTID = 394

public val XCN_OID_NIST_AES128_WRAP: CERTENROLL_OBJECTID = 395

public val XCN_OID_NIST_AES192_CBC: CERTENROLL_OBJECTID = 396

public val XCN_OID_NIST_AES192_WRAP: CERTENROLL_OBJECTID = 397

public val XCN_OID_NIST_AES256_CBC: CERTENROLL_OBJECTID = 398

public val XCN_OID_NIST_AES256_WRAP: CERTENROLL_OBJECTID = 399

public val XCN_OID_NIST_sha256: CERTENROLL_OBJECTID = 345

public val XCN_OID_NIST_sha384: CERTENROLL_OBJECTID = 346

public val XCN_OID_NIST_sha512: CERTENROLL_OBJECTID = 347

public val XCN_OID_NONE: CERTENROLL_OBJECTID = 0

public val XCN_OID_NT5_CRYPTO: CERTENROLL_OBJECTID = 262

public val XCN_OID_NTDS_REPLICATION: CERTENROLL_OBJECTID = 241

public val XCN_OID_NT_PRINCIPAL_NAME: CERTENROLL_OBJECTID = 214

public val XCN_OID_OEM_WHQL_CRYPTO: CERTENROLL_OBJECTID = 263

public val XCN_OID_OIW: CERTENROLL_OBJECTID = 64

public val XCN_OID_OIWDIR: CERTENROLL_OBJECTID = 93

public val XCN_OID_OIWDIR_CRPT: CERTENROLL_OBJECTID = 94

public val XCN_OID_OIWDIR_HASH: CERTENROLL_OBJECTID = 95

public val XCN_OID_OIWDIR_SIGN: CERTENROLL_OBJECTID = 96

public val XCN_OID_OIWDIR_md2: CERTENROLL_OBJECTID = 97

public val XCN_OID_OIWDIR_md2RSA: CERTENROLL_OBJECTID = 98

public val XCN_OID_OIWSEC: CERTENROLL_OBJECTID = 65

public val XCN_OID_OIWSEC_desCBC: CERTENROLL_OBJECTID = 70

public val XCN_OID_OIWSEC_desCFB: CERTENROLL_OBJECTID = 72

public val XCN_OID_OIWSEC_desECB: CERTENROLL_OBJECTID = 69

public val XCN_OID_OIWSEC_desEDE: CERTENROLL_OBJECTID = 80

public val XCN_OID_OIWSEC_desMAC: CERTENROLL_OBJECTID = 73

public val XCN_OID_OIWSEC_desOFB: CERTENROLL_OBJECTID = 71

public val XCN_OID_OIWSEC_dhCommMod: CERTENROLL_OBJECTID = 79

public val XCN_OID_OIWSEC_dsa: CERTENROLL_OBJECTID = 75

public val XCN_OID_OIWSEC_dsaComm: CERTENROLL_OBJECTID = 83

public val XCN_OID_OIWSEC_dsaCommSHA: CERTENROLL_OBJECTID = 84

public val XCN_OID_OIWSEC_dsaCommSHA1: CERTENROLL_OBJECTID = 91

public val XCN_OID_OIWSEC_dsaSHA1: CERTENROLL_OBJECTID = 90

public val XCN_OID_OIWSEC_keyHashSeal: CERTENROLL_OBJECTID = 86

public val XCN_OID_OIWSEC_md2RSASign: CERTENROLL_OBJECTID = 87

public val XCN_OID_OIWSEC_md4RSA: CERTENROLL_OBJECTID = 66

public val XCN_OID_OIWSEC_md4RSA2: CERTENROLL_OBJECTID = 68

public val XCN_OID_OIWSEC_md5RSA: CERTENROLL_OBJECTID = 67

public val XCN_OID_OIWSEC_md5RSASign: CERTENROLL_OBJECTID = 88

public val XCN_OID_OIWSEC_mdc2: CERTENROLL_OBJECTID = 82

public val XCN_OID_OIWSEC_mdc2RSA: CERTENROLL_OBJECTID = 77

public val XCN_OID_OIWSEC_rsaSign: CERTENROLL_OBJECTID = 74

public val XCN_OID_OIWSEC_rsaXchg: CERTENROLL_OBJECTID = 85

public val XCN_OID_OIWSEC_sha: CERTENROLL_OBJECTID = 81

public val XCN_OID_OIWSEC_sha1: CERTENROLL_OBJECTID = 89

public val XCN_OID_OIWSEC_sha1RSASign: CERTENROLL_OBJECTID = 92

public val XCN_OID_OIWSEC_shaDSA: CERTENROLL_OBJECTID = 76

public val XCN_OID_OIWSEC_shaRSA: CERTENROLL_OBJECTID = 78

public val XCN_OID_ORGANIZATIONAL_UNIT_NAME: CERTENROLL_OBJECTID = 129

public val XCN_OID_ORGANIZATION_NAME: CERTENROLL_OBJECTID = 128

public val XCN_OID_OS_VERSION: CERTENROLL_OBJECTID = 200

public val XCN_OID_OWNER: CERTENROLL_OBJECTID = 150

public val XCN_OID_PHYSICAL_DELIVERY_OFFICE_NAME: CERTENROLL_OBJECTID = 137

public val XCN_OID_PKCS: CERTENROLL_OBJECTID = 2

public val XCN_OID_PKCS_1: CERTENROLL_OBJECTID = 5

public val XCN_OID_PKCS_10: CERTENROLL_OBJECTID = 14

public val XCN_OID_PKCS_12: CERTENROLL_OBJECTID = 15

public val XCN_OID_PKCS_12_EXTENDED_ATTRIBUTES: CERTENROLL_OBJECTID = 167

public val XCN_OID_PKCS_12_FRIENDLY_NAME_ATTR: CERTENROLL_OBJECTID = 163

public val XCN_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR: CERTENROLL_OBJECTID = 165

public val XCN_OID_PKCS_12_LOCAL_KEY_ID: CERTENROLL_OBJECTID = 164

public val XCN_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID: CERTENROLL_OBJECTID = 407

public val XCN_OID_PKCS_12_PbeIds: CERTENROLL_OBJECTID = 400

public val XCN_OID_PKCS_12_pbeWithSHA1And128BitRC2: CERTENROLL_OBJECTID = 401

public val XCN_OID_PKCS_12_pbeWithSHA1And128BitRC4: CERTENROLL_OBJECTID = 402

public val XCN_OID_PKCS_12_pbeWithSHA1And2KeyTripleDES: CERTENROLL_OBJECTID = 403

public val XCN_OID_PKCS_12_pbeWithSHA1And3KeyTripleDES: CERTENROLL_OBJECTID = 404

public val XCN_OID_PKCS_12_pbeWithSHA1And40BitRC2: CERTENROLL_OBJECTID = 405

public val XCN_OID_PKCS_12_pbeWithSHA1And40BitRC4: CERTENROLL_OBJECTID = 406

public val XCN_OID_PKCS_2: CERTENROLL_OBJECTID = 6

public val XCN_OID_PKCS_3: CERTENROLL_OBJECTID = 7

public val XCN_OID_PKCS_4: CERTENROLL_OBJECTID = 8

public val XCN_OID_PKCS_5: CERTENROLL_OBJECTID = 9

public val XCN_OID_PKCS_6: CERTENROLL_OBJECTID = 10

public val XCN_OID_PKCS_7: CERTENROLL_OBJECTID = 11

public val XCN_OID_PKCS_7_DATA: CERTENROLL_OBJECTID = 329

public val XCN_OID_PKCS_7_DIGESTED: CERTENROLL_OBJECTID = 333

public val XCN_OID_PKCS_7_ENCRYPTED: CERTENROLL_OBJECTID = 334

public val XCN_OID_PKCS_7_ENVELOPED: CERTENROLL_OBJECTID = 331

public val XCN_OID_PKCS_7_SIGNED: CERTENROLL_OBJECTID = 330

public val XCN_OID_PKCS_7_SIGNEDANDENVELOPED: CERTENROLL_OBJECTID = 332

public val XCN_OID_PKCS_8: CERTENROLL_OBJECTID = 12

public val XCN_OID_PKCS_9: CERTENROLL_OBJECTID = 13

public val XCN_OID_PKCS_9_CONTENT_TYPE: CERTENROLL_OBJECTID = 335

public val XCN_OID_PKCS_9_MESSAGE_DIGEST: CERTENROLL_OBJECTID = 336

public val XCN_OID_PKINIT_KP_KDC: CERTENROLL_OBJECTID = 408

public val XCN_OID_PKIX: CERTENROLL_OBJECTID = 202

public val XCN_OID_PKIX_ACC_DESCR: CERTENROLL_OBJECTID = 282

public val XCN_OID_PKIX_CA_ISSUERS: CERTENROLL_OBJECTID = 284

public val XCN_OID_PKIX_CA_REPOSITORY: CERTENROLL_OBJECTID = 409

public val XCN_OID_PKIX_KP: CERTENROLL_OBJECTID = 243

public val XCN_OID_PKIX_KP_CLIENT_AUTH: CERTENROLL_OBJECTID = 245

public val XCN_OID_PKIX_KP_CODE_SIGNING: CERTENROLL_OBJECTID = 246

public val XCN_OID_PKIX_KP_EMAIL_PROTECTION: CERTENROLL_OBJECTID = 247

public val XCN_OID_PKIX_KP_IPSEC_END_SYSTEM: CERTENROLL_OBJECTID = 248

public val XCN_OID_PKIX_KP_IPSEC_TUNNEL: CERTENROLL_OBJECTID = 249

public val XCN_OID_PKIX_KP_IPSEC_USER: CERTENROLL_OBJECTID = 250

public val XCN_OID_PKIX_KP_OCSP_SIGNING: CERTENROLL_OBJECTID = 252

public val XCN_OID_PKIX_KP_SERVER_AUTH: CERTENROLL_OBJECTID = 244

public val XCN_OID_PKIX_KP_TIMESTAMP_SIGNING: CERTENROLL_OBJECTID = 251

public val XCN_OID_PKIX_NO_SIGNATURE: CERTENROLL_OBJECTID = 303

public val XCN_OID_PKIX_OCSP: CERTENROLL_OBJECTID = 283

public val XCN_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE: CERTENROLL_OBJECTID = 328

public val XCN_OID_PKIX_OCSP_NOCHECK: CERTENROLL_OBJECTID = 253

public val XCN_OID_PKIX_OCSP_NONCE: CERTENROLL_OBJECTID = 410

public val XCN_OID_PKIX_PE: CERTENROLL_OBJECTID = 203

public val XCN_OID_PKIX_POLICY_QUALIFIER_CPS: CERTENROLL_OBJECTID = 279

public val XCN_OID_PKIX_POLICY_QUALIFIER_USERNOTICE: CERTENROLL_OBJECTID = 280

public val XCN_OID_PKIX_TIME_STAMPING: CERTENROLL_OBJECTID = 411

public val XCN_OID_POLICY_CONSTRAINTS: CERTENROLL_OBJECTID = 196

public val XCN_OID_POLICY_MAPPINGS: CERTENROLL_OBJECTID = 194

public val XCN_OID_POSTAL_ADDRESS: CERTENROLL_OBJECTID = 134

public val XCN_OID_POSTAL_CODE: CERTENROLL_OBJECTID = 135

public val XCN_OID_POST_OFFICE_BOX: CERTENROLL_OBJECTID = 136

public val XCN_OID_PREFERRED_DELIVERY_METHOD: CERTENROLL_OBJECTID = 146

public val XCN_OID_PRESENTATION_ADDRESS: CERTENROLL_OBJECTID = 147

public val XCN_OID_PRIVATEKEY_USAGE_PERIOD: CERTENROLL_OBJECTID = 177

public val XCN_OID_PRODUCT_UPDATE: CERTENROLL_OBJECTID = 215

public val XCN_OID_QC_EU_COMPLIANCE: CERTENROLL_OBJECTID = 412

public val XCN_OID_QC_SSCD: CERTENROLL_OBJECTID = 413

public val XCN_OID_QC_STATEMENTS_EXT: CERTENROLL_OBJECTID = 414

public val XCN_OID_RDN_DUMMY_SIGNER: CERTENROLL_OBJECTID = 228

public val XCN_OID_RDN_TPM_MANUFACTURER: CERTENROLL_OBJECTID = 415

public val XCN_OID_RDN_TPM_MODEL: CERTENROLL_OBJECTID = 416

public val XCN_OID_RDN_TPM_VERSION: CERTENROLL_OBJECTID = 417

public val XCN_OID_REASON_CODE_HOLD: CERTENROLL_OBJECTID = 186

public val XCN_OID_REGISTERED_ADDRESS: CERTENROLL_OBJECTID = 144

public val XCN_OID_REMOVE_CERTIFICATE: CERTENROLL_OBJECTID = 209

public val XCN_OID_RENEWAL_CERTIFICATE: CERTENROLL_OBJECTID = 197

public val XCN_OID_REQUEST_CLIENT_INFO: CERTENROLL_OBJECTID = 238

public val XCN_OID_REQUIRE_CERT_CHAIN_POLICY: CERTENROLL_OBJECTID = 234

public val XCN_OID_REVOKED_LIST_SIGNER: CERTENROLL_OBJECTID = 418

public val XCN_OID_RFC3161_counterSign: CERTENROLL_OBJECTID = 419

public val XCN_OID_ROLE_OCCUPANT: CERTENROLL_OBJECTID = 151

public val XCN_OID_ROOT_LIST_SIGNER: CERTENROLL_OBJECTID = 265

public val XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION: CERTENROLL_OBJECTID = 420

public val XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION: CERTENROLL_OBJECTID = 421

public val XCN_OID_ROOT_PROGRAM_FLAGS: CERTENROLL_OBJECTID = 422

public val XCN_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL: CERTENROLL_OBJECTID = 423

public val XCN_OID_RSA: CERTENROLL_OBJECTID = 1

public val XCN_OID_RSAES_OAEP: CERTENROLL_OBJECTID = 425

public val XCN_OID_RSA_DES_EDE3_CBC: CERTENROLL_OBJECTID = 51

public val XCN_OID_RSA_DH: CERTENROLL_OBJECTID = 22

public val XCN_OID_RSA_ENCRYPT: CERTENROLL_OBJECTID = 4

public val XCN_OID_RSA_HASH: CERTENROLL_OBJECTID = 3

public val XCN_OID_RSA_MD2: CERTENROLL_OBJECTID = 46

public val XCN_OID_RSA_MD2RSA: CERTENROLL_OBJECTID = 17

public val XCN_OID_RSA_MD4: CERTENROLL_OBJECTID = 47

public val XCN_OID_RSA_MD4RSA: CERTENROLL_OBJECTID = 18

public val XCN_OID_RSA_MD5: CERTENROLL_OBJECTID = 48

public val XCN_OID_RSA_MD5RSA: CERTENROLL_OBJECTID = 19

public val XCN_OID_RSA_MGF1: CERTENROLL_OBJECTID = 348

public val XCN_OID_RSA_PSPECIFIED: CERTENROLL_OBJECTID = 424

public val XCN_OID_RSA_RC2CBC: CERTENROLL_OBJECTID = 49

public val XCN_OID_RSA_RC4: CERTENROLL_OBJECTID = 50

public val XCN_OID_RSA_RC5_CBCPad: CERTENROLL_OBJECTID = 52

public val XCN_OID_RSA_RSA: CERTENROLL_OBJECTID = 16

public val XCN_OID_RSA_SETOAEP_RSA: CERTENROLL_OBJECTID = 21

public val XCN_OID_RSA_SHA1RSA: CERTENROLL_OBJECTID = 20

public val XCN_OID_RSA_SHA256RSA: CERTENROLL_OBJECTID = 342

public val XCN_OID_RSA_SHA384RSA: CERTENROLL_OBJECTID = 343

public val XCN_OID_RSA_SHA512RSA: CERTENROLL_OBJECTID = 344

public val XCN_OID_RSA_SMIMECapabilities: CERTENROLL_OBJECTID = 40

public val XCN_OID_RSA_SMIMEalg: CERTENROLL_OBJECTID = 42

public val XCN_OID_RSA_SMIMEalgCMS3DESwrap: CERTENROLL_OBJECTID = 44

public val XCN_OID_RSA_SMIMEalgCMSRC2wrap: CERTENROLL_OBJECTID = 45

public val XCN_OID_RSA_SMIMEalgESDH: CERTENROLL_OBJECTID = 43

public val XCN_OID_RSA_SSA_PSS: CERTENROLL_OBJECTID = 353

public val XCN_OID_RSA_certExtensions: CERTENROLL_OBJECTID = 39

public val XCN_OID_RSA_challengePwd: CERTENROLL_OBJECTID = 36

public val XCN_OID_RSA_contentType: CERTENROLL_OBJECTID = 32

public val XCN_OID_RSA_counterSign: CERTENROLL_OBJECTID = 35

public val XCN_OID_RSA_data: CERTENROLL_OBJECTID = 23

public val XCN_OID_RSA_digestedData: CERTENROLL_OBJECTID = 27

public val XCN_OID_RSA_emailAddr: CERTENROLL_OBJECTID = 30

public val XCN_OID_RSA_encryptedData: CERTENROLL_OBJECTID = 29

public val XCN_OID_RSA_envelopedData: CERTENROLL_OBJECTID = 25

public val XCN_OID_RSA_extCertAttrs: CERTENROLL_OBJECTID = 38

public val XCN_OID_RSA_hashedData: CERTENROLL_OBJECTID = 28

public val XCN_OID_RSA_messageDigest: CERTENROLL_OBJECTID = 33

public val XCN_OID_RSA_preferSignedData: CERTENROLL_OBJECTID = 41

public val XCN_OID_RSA_signEnvData: CERTENROLL_OBJECTID = 26

public val XCN_OID_RSA_signedData: CERTENROLL_OBJECTID = 24

public val XCN_OID_RSA_signingTime: CERTENROLL_OBJECTID = 34

public val XCN_OID_RSA_unstructAddr: CERTENROLL_OBJECTID = 37

public val XCN_OID_RSA_unstructName: CERTENROLL_OBJECTID = 31

public val XCN_OID_SEARCH_GUIDE: CERTENROLL_OBJECTID = 132

public val XCN_OID_SEE_ALSO: CERTENROLL_OBJECTID = 152

public val XCN_OID_SERIALIZED: CERTENROLL_OBJECTID = 213

public val XCN_OID_SERVER_GATED_CRYPTO: CERTENROLL_OBJECTID = 257

public val XCN_OID_SGC_NETSCAPE: CERTENROLL_OBJECTID = 258

public val XCN_OID_SORTED_CTL: CERTENROLL_OBJECTID = 212

public val XCN_OID_STATE_OR_PROVINCE_NAME: CERTENROLL_OBJECTID = 126

public val XCN_OID_STREET_ADDRESS: CERTENROLL_OBJECTID = 127

public val XCN_OID_SUBJECT_ALT_NAME: CERTENROLL_OBJECTID = 173

public val XCN_OID_SUBJECT_ALT_NAME2: CERTENROLL_OBJECTID = 183

public val XCN_OID_SUBJECT_DIR_ATTRS: CERTENROLL_OBJECTID = 242

public val XCN_OID_SUBJECT_INFO_ACCESS: CERTENROLL_OBJECTID = 426

public val XCN_OID_SUBJECT_KEY_IDENTIFIER: CERTENROLL_OBJECTID = 182
