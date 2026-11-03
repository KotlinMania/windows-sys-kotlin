package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val XCN_OID_SUPPORTED_APPLICATION_CONTEXT: CERTENROLL_OBJECTID = 148

public val XCN_OID_SUR_NAME: CERTENROLL_OBJECTID = 122

public val XCN_OID_TELEPHONE_NUMBER: CERTENROLL_OBJECTID = 138

public val XCN_OID_TELETEXT_TERMINAL_IDENTIFIER: CERTENROLL_OBJECTID = 140

public val XCN_OID_TELEX_NUMBER: CERTENROLL_OBJECTID = 139

public val XCN_OID_TIMESTAMP_TOKEN: CERTENROLL_OBJECTID = 427

public val XCN_OID_TITLE: CERTENROLL_OBJECTID = 130

public val XCN_OID_USER_CERTIFICATE: CERTENROLL_OBJECTID = 154

public val XCN_OID_USER_PASSWORD: CERTENROLL_OBJECTID = 153

public val XCN_OID_VERISIGN_BITSTRING_6_13: CERTENROLL_OBJECTID = 287

public val XCN_OID_VERISIGN_ISS_STRONG_CRYPTO: CERTENROLL_OBJECTID = 288

public val XCN_OID_VERISIGN_ONSITE_JURISDICTION_HASH: CERTENROLL_OBJECTID = 286

public val XCN_OID_VERISIGN_PRIVATE_6_9: CERTENROLL_OBJECTID = 285

public val XCN_OID_WHQL_CRYPTO: CERTENROLL_OBJECTID = 261

public val XCN_OID_X21_ADDRESS: CERTENROLL_OBJECTID = 142

public val XCN_OID_X957: CERTENROLL_OBJECTID = 55

public val XCN_OID_X957_DSA: CERTENROLL_OBJECTID = 56

public val XCN_OID_X957_SHA1DSA: CERTENROLL_OBJECTID = 57

public val XCN_OID_YESNO_TRUST_ATTR: CERTENROLL_OBJECTID = 278

public val XCN_PROPERTYID_NONE: CERTENROLL_PROPERTYID = 0

public val XCN_PROV_DH_SCHANNEL: X509ProviderType = 18

public val XCN_PROV_DSS: X509ProviderType = 3

public val XCN_PROV_DSS_DH: X509ProviderType = 13

public val XCN_PROV_EC_ECDSA_FULL: X509ProviderType = 16

public val XCN_PROV_EC_ECDSA_SIG: X509ProviderType = 14

public val XCN_PROV_EC_ECNRA_FULL: X509ProviderType = 17

public val XCN_PROV_EC_ECNRA_SIG: X509ProviderType = 15

public val XCN_PROV_FORTEZZA: X509ProviderType = 4

public val XCN_PROV_INTEL_SEC: X509ProviderType = 22

public val XCN_PROV_MS_EXCHANGE: X509ProviderType = 5

public val XCN_PROV_NONE: X509ProviderType = 0

public val XCN_PROV_REPLACE_OWF: X509ProviderType = 23

public val XCN_PROV_RNG: X509ProviderType = 21

public val XCN_PROV_RSA_AES: X509ProviderType = 24

public val XCN_PROV_RSA_FULL: X509ProviderType = 1

public val XCN_PROV_RSA_SCHANNEL: X509ProviderType = 12

public val XCN_PROV_RSA_SIG: X509ProviderType = 2

public val XCN_PROV_SPYRUS_LYNKS: X509ProviderType = 20

public val XCN_PROV_SSL: X509ProviderType = 6

public val XECI_AUTOENROLL: UInt = 2u

public val XECI_CERTREQ: UInt = 4u

public val XECI_DISABLE: UInt = 0u

public val XECI_REQWIZARD: UInt = 3u

public val XECI_XENROLL: UInt = 1u

public val XECP_STRING_PROPERTY: UInt = 1u

public val XECR_CMC: CERT_CREATE_REQUEST_FLAGS = 3

public val XECR_PKCS10_V1_5: CERT_CREATE_REQUEST_FLAGS = 4

public val XECR_PKCS10_V2_0: CERT_CREATE_REQUEST_FLAGS = 1

public val XECR_PKCS7: CERT_CREATE_REQUEST_FLAGS = 2

public val XECT_EXTENSION_V1: ADDED_CERT_TYPE = 1

public val XECT_EXTENSION_V2: ADDED_CERT_TYPE = 2

public val XEKL_KEYSIZE_DEFAULT: UInt = 4u

public val XEKL_KEYSIZE_INC: XEKL_KEYSIZE = 3

public val XEKL_KEYSIZE_MAX: XEKL_KEYSIZE = 2

public val XEKL_KEYSIZE_MIN: XEKL_KEYSIZE = 1

public val XEKL_KEYSPEC_KEYX: XEKL_KEYSPEC = 1

public val XEKL_KEYSPEC_SIG: XEKL_KEYSPEC = 2

public val XEPR_CADNS: PENDING_REQUEST_DESIRED_PROPERTY = 1

public val XEPR_CAFRIENDLYNAME: PENDING_REQUEST_DESIRED_PROPERTY = 3

public val XEPR_CANAME: PENDING_REQUEST_DESIRED_PROPERTY = 2

public val XEPR_DATE: UInt = 5u

public val XEPR_ENUM_FIRST: Int = -1

public val XEPR_HASH: PENDING_REQUEST_DESIRED_PROPERTY = 8

public val XEPR_REQUESTID: PENDING_REQUEST_DESIRED_PROPERTY = 4

public val XEPR_TEMPLATENAME: UInt = 6u

public val XEPR_V1TEMPLATENAME: UInt = 9u

public val XEPR_V2TEMPLATEOID: UInt = 16u

public val XEPR_VERSION: UInt = 7u

public val dwCAXCHGOVERLAPPERIODCOUNTDEFAULT: UInt = 1u

public val dwCAXCHGVALIDITYPERIODCOUNTDEFAULT: UInt = 1u

public val dwCRLDELTAOVERLAPPERIODCOUNTDEFAULT: UInt = 0u

public val dwCRLDELTAPERIODCOUNTDEFAULT: UInt = 1u

public val dwCRLOVERLAPPERIODCOUNTDEFAULT: UInt = 0u

public val dwCRLPERIODCOUNTDEFAULT: UInt = 1u

public val dwVALIDITYPERIODCOUNTDEFAULT_ENTERPRISE: UInt = 2u

public val dwVALIDITYPERIODCOUNTDEFAULT_ROOT: UInt = 5u

public val dwVALIDITYPERIODCOUNTDEFAULT_STANDALONE: UInt = 1u

public val szBACKUPANNOTATION: PCSTR = s("Cert Server Backup Interface")

public val szDBBASENAMEPARM: PCSTR = s("edb")

public val szNAMESEPARATORDEFAULT: PCSTR = s("\n")

public val szPROPASNTAG: PCSTR = s("{asn}")

public val szRESTOREANNOTATION: PCSTR = s("Cert Server Restore Interface")

public val wszAT_EKCERTINF: PCWSTR = w("@EKCert")

public val wszAT_TESTROOT: PCWSTR = w("@TestRoot")

public val wszCAPOLICYFILE: PCWSTR = w("CAPolicy.inf")

public val wszCERTEXITMODULE_POSTFIX: PCWSTR = w(".Exit")

public val wszCERTIFICATETRANSPARENCYFLAGS: PCWSTR = w("CertificateTransparencyFlags")

public val wszCERTMANAGE_SUFFIX: PCWSTR = w("Manage")

public val wszCERTPOLICYMODULE_POSTFIX: PCWSTR = w(".Policy")

public val wszCERT_TYPE: PCWSTR = w("RequestType")

public val wszCERT_TYPE_CLIENT: PCWSTR = w("Client")

public val wszCERT_TYPE_CODESIGN: PCWSTR = w("CodeSign")

public val wszCERT_TYPE_CUSTOMER: PCWSTR = w("SetCustomer")

public val wszCERT_TYPE_MERCHANT: PCWSTR = w("SetMerchant")

public val wszCERT_TYPE_PAYMENT: PCWSTR = w("SetPayment")

public val wszCERT_TYPE_SERVER: PCWSTR = w("Server")

public val wszCERT_VERSION: PCWSTR = w("Version")

public val wszCERT_VERSION_1: PCWSTR = w("1")

public val wszCERT_VERSION_2: PCWSTR = w("2")

public val wszCERT_VERSION_3: PCWSTR = w("3")

public val wszCLASS_CERTADMIN: PCWSTR = w("CertificateAuthority.Admin")

public val wszCLASS_CERTCONFIG: PCWSTR = w("CertificateAuthority.Config")

public val wszCLASS_CERTDBMEM: PCWSTR = w("CertificateAuthority.DBMem")

public val wszCLASS_CERTENCODE: PCWSTR = w("CertificateAuthority.Encode")

public val wszCLASS_CERTGETCONFIG: PCWSTR = w("CertificateAuthority.GetConfig")

public val wszCLASS_CERTREQUEST: PCWSTR = w("CertificateAuthority.Request")

public val wszCLASS_CERTSERVEREXIT: PCWSTR = w("CertificateAuthority.ServerExit")

public val wszCLASS_CERTSERVERPOLICY: PCWSTR = w("CertificateAuthority.ServerPolicy")

public val wszCLASS_CERTVIEW: PCWSTR = w("CertificateAuthority.View")

public val wszCMM_PROP_COPYRIGHT: PCWSTR = w("Copyright")

public val wszCMM_PROP_DESCRIPTION: PCWSTR = w("Description")

public val wszCMM_PROP_DISPLAY_HWND: PCWSTR = w("HWND")

public val wszCMM_PROP_FILEVER: PCWSTR = w("File Version")

public val wszCMM_PROP_ISMULTITHREADED: PCWSTR = w("IsMultiThreaded")

public val wszCMM_PROP_NAME: PCWSTR = w("Name")

public val wszCMM_PROP_PRODUCTVER: PCWSTR = w("Product Version")

public val wszCNGENCRYPTIONALGORITHM: PCWSTR = w("CNGEncryptionAlgorithm")

public val wszCNGHASHALGORITHM: PCWSTR = w("CNGHashAlgorithm")

public val wszCNGPUBLICKEYALGORITHM: PCWSTR = w("CNGPublicKeyAlgorithm")

public val wszCONFIG_AUTHORITY: PCWSTR = w("Authority")

public val wszCONFIG_COMMENT: PCWSTR = w("Comment")

public val wszCONFIG_COMMONNAME: PCWSTR = w("CommonName")

public val wszCONFIG_CONFIG: PCWSTR = w("Config")

public val wszCONFIG_COUNTRY: PCWSTR = w("Country")

public val wszCONFIG_DESCRIPTION: PCWSTR = w("Description")

public val wszCONFIG_EXCHANGECERTIFICATE: PCWSTR = w("ExchangeCertificate")

public val wszCONFIG_FLAGS: PCWSTR = w("Flags")

public val wszCONFIG_LOCALITY: PCWSTR = w("Locality")

public val wszCONFIG_ORGANIZATION: PCWSTR = w("Organization")

public val wszCONFIG_ORGUNIT: PCWSTR = w("OrgUnit")

public val wszCONFIG_SANITIZEDNAME: PCWSTR = w("SanitizedName")

public val wszCONFIG_SANITIZEDSHORTNAME: PCWSTR = w("SanitizedShortName")

public val wszCONFIG_SERVER: PCWSTR = w("Server")

public val wszCONFIG_SHORTNAME: PCWSTR = w("ShortName")

public val wszCONFIG_SIGNATURECERTIFICATE: PCWSTR = w("SignatureCertificate")

public val wszCONFIG_STATE: PCWSTR = w("State")

public val wszCONFIG_WEBENROLLMENTSERVERS: PCWSTR = w("WebEnrollmentServers")

public val wszCRLPUBLISHRETRYCOUNT: PCWSTR = w("CRLPublishRetryCount")

public val wszCRTFILENAMEEXT: PCWSTR = w(".crt")

public val wszDATFILENAMEEXT: PCWSTR = w(".dat")

public val wszDBBACKUPCERTBACKDAT: PCWSTR = w("certbkxp.dat")

public val wszDBBACKUPSUBDIR: PCWSTR = w("DataBase")

public val wszDBFILENAMEEXT: PCWSTR = w(".edb")

public val wszENCRYPTIONALGORITHM: PCWSTR = w("EncryptionAlgorithm")

public val wszENROLLMENTAGENTRIGHTS: PCWSTR = w("EnrollmentAgentRights")

public val wszHASHALGORITHM: PCWSTR = w("HashAlgorithm")

public val wszINFKEY_ALTERNATESIGNATUREALGORITHM: PCWSTR = w("AlternateSignatureAlgorithm")

public val wszINFKEY_ATTESTPRIVATEKEY: PCWSTR = w("AttestPrivateKey")

public val wszINFKEY_CACAPABILITIES: PCWSTR = w("CACapabilities")

public val wszINFKEY_CACERTS: PCWSTR = w("CACerts")

public val wszINFKEY_CATHUMBPRINT: PCWSTR = w("CAThumbprint")

public val wszINFKEY_CCDPSYNCDELTATIME: PCWSTR = w("SyncDeltaTime")

public val wszINFKEY_CHALLENGEPASSWORD: PCWSTR = w("ChallengePassword")

public val wszINFKEY_CONTINUE: PCWSTR = w("_continue_")

public val wszINFKEY_CRITICAL: PCWSTR = w("Critical")

public val wszINFKEY_CRLDELTAPERIODCOUNT: PCWSTR = w("CRLDeltaPeriodUnits")

public val wszINFKEY_CRLDELTAPERIODSTRING: PCWSTR = w("CRLDeltaPeriod")

public val wszINFKEY_CRLPERIODCOUNT: PCWSTR = w("CRLPeriodUnits")

public val wszINFKEY_CRLPERIODSTRING: PCWSTR = w("CRLPeriod")

public val wszINFKEY_DIRECTORYNAME: PCWSTR = w("DirectoryName")

public val wszINFKEY_DNS: PCWSTR = w("DNS")

public val wszINFKEY_ECCKEYPARAMETERS: PCWSTR = w("EccKeyParameters")

public val wszINFKEY_ECCKEYPARAMETERSTYPE: PCWSTR = w("EccKeyParametersType")

public val wszINFKEY_ECCKEYPARAMETERS_A: PCWSTR = w("EccKeyParameters_A")

public val wszINFKEY_ECCKEYPARAMETERS_B: PCWSTR = w("EccKeyParameters_B")

public val wszINFKEY_ECCKEYPARAMETERS_BASE: PCWSTR = w("EccKeyParameters_Base")

public val wszINFKEY_ECCKEYPARAMETERS_COFACTOR: PCWSTR = w("EccKeyParameters_Cofactor")

public val wszINFKEY_ECCKEYPARAMETERS_ORDER: PCWSTR = w("EccKeyParameters_Order")

public val wszINFKEY_ECCKEYPARAMETERS_P: PCWSTR = w("EccKeyParameters_P")

public val wszINFKEY_ECCKEYPARAMETERS_SEED: PCWSTR = w("EccKeyParameters_Seed")

public val wszINFKEY_EMAIL: PCWSTR = w("EMail")

public val wszINFKEY_EMPTY: PCWSTR = w("Empty")

public val wszINFKEY_ENABLEKEYCOUNTING: PCWSTR = w("EnableKeyCounting")

public val wszINFKEY_ENCRYPTIONALGORITHM: PCWSTR = w("EncryptionAlgorithm")

public val wszINFKEY_ENCRYPTIONLENGTH: PCWSTR = w("EncryptionLength")

public val wszINFKEY_EXCLUDE: PCWSTR = w("Exclude")

public val wszINFKEY_EXPORTABLE: PCWSTR = w("Exportable")

public val wszINFKEY_EXPORTABLEENCRYPTED: PCWSTR = w("ExportableEncrypted")

public val wszINFKEY_FLAGS: PCWSTR = w("Flags")

public val wszINFKEY_FORCEUTF8: PCWSTR = w("ForceUTF8")

public val wszINFKEY_FRIENDLYNAME: PCWSTR = w("FriendlyName")

public val wszINFKEY_HASHALGORITHM: PCWSTR = w("HashAlgorithm")

public val wszINFKEY_INCLUDE: PCWSTR = w("Include")

public val wszINFKEY_INHIBITPOLICYMAPPING: PCWSTR = w("InhibitPolicyMapping")

public val wszINFKEY_IPADDRESS: PCWSTR = w("IPAddress")

public val wszINFKEY_KEYALGORITHM: PCWSTR = w("KeyAlgorithm")

public val wszINFKEY_KEYALGORITHMPARMETERS: PCWSTR = w("KeyAlgorithmParameters")

public val wszINFKEY_KEYCONTAINER: PCWSTR = w("KeyContainer")

public val wszINFKEY_KEYLENGTH: PCWSTR = w("KeyLength")

public val wszINFKEY_KEYPROTECTION: PCWSTR = w("KeyProtection")

public val wszINFKEY_KEYUSAGEEXTENSION: PCWSTR = w("KeyUsage")

public val wszINFKEY_KEYUSAGEPROPERTY: PCWSTR = w("KeyUsageProperty")

public val wszINFKEY_LEGACYKEYSPEC: PCWSTR = w("KeySpec")

public val wszINFKEY_LOADDEFAULTTEMPLATES: PCWSTR = w("LoadDefaultTemplates")

public val wszINFKEY_MACHINEKEYSET: PCWSTR = w("MachineKeySet")

public val wszINFKEY_NOTAFTER: PCWSTR = w("NotAfter")

public val wszINFKEY_NOTBEFORE: PCWSTR = w("NotBefore")

public val wszINFKEY_NOTICE: PCWSTR = w("Notice")

public val wszINFKEY_OID: PCWSTR = w("OID")

public val wszINFKEY_OTHERNAME: PCWSTR = w("OtherName")

public val wszINFKEY_PATHLENGTH: PCWSTR = w("PathLength")

public val wszINFKEY_POLICIES: PCWSTR = w("Policies")

public val wszINFKEY_PRIVATEKEYARCHIVE: PCWSTR = w("PrivateKeyArchive")

public val wszINFKEY_PROVIDERNAME: PCWSTR = w("ProviderName")

public val wszINFKEY_PROVIDERTYPE: PCWSTR = w("ProviderType")

public val wszINFKEY_PUBLICKEY: PCWSTR = w("PublicKey")

public val wszINFKEY_PUBLICKEYPARAMETERS: PCWSTR = w("PublicKeyParameters")

public val wszINFKEY_READERNAME: PCWSTR = w("ReaderName")

public val wszINFKEY_REGISTEREDID: PCWSTR = w("RegisteredId")

public val wszINFKEY_RENEWALCERT: PCWSTR = w("RenewalCert")

public val wszINFKEY_RENEWALKEYLENGTH: PCWSTR = w("RenewalKeyLength")

public val wszINFKEY_RENEWALVALIDITYPERIODCOUNT: PCWSTR = w("RenewalValidityPeriodUnits")

public val wszINFKEY_RENEWALVALIDITYPERIODSTRING: PCWSTR = w("RenewalValidityPeriod")

public val wszINFKEY_REQUESTTYPE: PCWSTR = w("RequestType")

public val wszINFKEY_REQUIREEXPLICITPOLICY: PCWSTR = w("RequireExplicitPolicy")

public val wszINFKEY_SECURITYDESCRIPTOR: PCWSTR = w("SecurityDescriptor")

public val wszINFKEY_SERIALNUMBER: PCWSTR = w("SerialNumber")

public val wszINFKEY_SHOWALLCSPS: PCWSTR = w("ShowAllCSPs")

public val wszINFKEY_SILENT: PCWSTR = w("Silent")

public val wszINFKEY_SMIME: PCWSTR = w("SMIME")

public val wszINFKEY_SUBJECT: PCWSTR = w("Subject")

public val wszINFKEY_SUBJECTNAMEFLAGS: PCWSTR = w("SubjectNameFlags")

public val wszINFKEY_SUBTREE: PCWSTR = w("SubTree")

public val wszINFKEY_SUPPRESSDEFAULTS: PCWSTR = w("SuppressDefaults")

public val wszINFKEY_UICONTEXTMESSAGE: PCWSTR = w("UIContextMessage")

public val wszINFKEY_UPN: PCWSTR = w("UPN")

public val wszINFKEY_URL: PCWSTR = w("URL")

public val wszINFKEY_USEEXISTINGKEY: PCWSTR = w("UseExistingKeySet")

public val wszINFKEY_USERPROTECTED: PCWSTR = w("UserProtected")

public val wszINFKEY_UTF8: PCWSTR = w("UTF8")

public val wszINFKEY_X500NAMEFLAGS: PCWSTR = w("X500NameFlags")

public val wszINFSECTION_AIA: PCWSTR = w("AuthorityInformationAccess")

public val wszINFSECTION_APPLICATIONPOLICYCONSTRAINTS: PCWSTR = w("ApplicationPolicyConstraintsExtension")

public val wszINFSECTION_APPLICATIONPOLICYMAPPINGS: PCWSTR = w("ApplicationPolicyMappingsExtension")

public val wszINFSECTION_APPLICATIONPOLICYSTATEMENT: PCWSTR = w("ApplicationPolicyStatementExtension")

public val wszINFSECTION_BASICCONSTRAINTS: PCWSTR = w("BasicConstraintsExtension")

public val wszINFSECTION_CAPOLICY: PCWSTR = w("CAPolicy")

public val wszINFSECTION_CCDP: PCWSTR = w("CrossCertificateDistributionPointsExtension")

public val wszINFSECTION_CDP: PCWSTR = w("CRLDistributionPoint")

public val wszINFSECTION_CERTSERVER: PCWSTR = w("certsrv_server")

public val wszINFSECTION_EKU: PCWSTR = w("EnhancedKeyUsageExtension")

public val wszINFSECTION_EXTENSIONS: PCWSTR = w("Extensions")

public val wszINFSECTION_NAMECONSTRAINTS: PCWSTR = w("NameConstraintsExtension")

public val wszINFSECTION_NEWREQUEST: PCWSTR = w("NewRequest")

public val wszINFSECTION_POLICYCONSTRAINTS: PCWSTR = w("PolicyConstraintsExtension")

public val wszINFSECTION_POLICYMAPPINGS: PCWSTR = w("PolicyMappingsExtension")

public val wszINFSECTION_POLICYSTATEMENT: PCWSTR = w("PolicyStatementExtension")

public val wszINFSECTION_PROPERTIES: PCWSTR = w("Properties")

public val wszINFSECTION_REQUESTATTRIBUTES: PCWSTR = w("RequestAttributes")

public val wszINFVALUE_ENDORSEMENTKEY: PCWSTR = w("EndorsementKey")

public val wszINFVALUE_REQUESTTYPE_CERT: PCWSTR = w("Cert")

public val wszINFVALUE_REQUESTTYPE_CMC: PCWSTR = w("CMC")

public val wszINFVALUE_REQUESTTYPE_PKCS10: PCWSTR = w("PKCS10")

public val wszINFVALUE_REQUESTTYPE_PKCS7: PCWSTR = w("PKCS7")

public val wszINFVALUE_REQUESTTYPE_SCEP: PCWSTR = w("SCEP")

public val wszLDAPSESSIONOPTIONVALUE: PCWSTR = w("LDAPSessionOptionValue")

public val wszLOCALIZEDTIMEPERIODUNITS: PCWSTR = w("LocalizedTimePeriodUnits")

public val wszLOGFILENAMEEXT: PCWSTR = w(".log")

public val wszLOGPATH: PCWSTR = w("CertLog")

public val wszMACHINEKEYSET: PCWSTR = w("MachineKeyset")

public val wszMICROSOFTCERTMODULE_PREFIX: PCWSTR = w("CertificateAuthority_MicrosoftDefault")

public val wszNETSCAPEREVOCATIONTYPE: PCWSTR = w("Netscape")

public val wszOCSPCAPROP_CACERTIFICATE: PCWSTR = w("CACertificate")

public val wszOCSPCAPROP_CACONFIG: PCWSTR = w("CAConfig")

public val wszOCSPCAPROP_CSPNAME: PCWSTR = w("CSPName")

public val wszOCSPCAPROP_ERRORCODE: PCWSTR = w("ErrorCode")

public val wszOCSPCAPROP_HASHALGORITHMID: PCWSTR = w("HashAlgorithmId")

public val wszOCSPCAPROP_KEYSPEC: PCWSTR = w("KeySpec")

public val wszOCSPCAPROP_LOCALREVOCATIONINFORMATION: PCWSTR = w("LocalRevocationInformation")

public val wszOCSPCAPROP_PROVIDERCLSID: PCWSTR = w("ProviderCLSID")

public val wszOCSPCAPROP_PROVIDERPROPERTIES: PCWSTR = w("Provider")

public val wszOCSPCAPROP_REMINDERDURATION: PCWSTR = w("ReminderDuration")

public val wszOCSPCAPROP_SIGNINGCERTIFICATE: PCWSTR = w("SigningCertificate")

public val wszOCSPCAPROP_SIGNINGCERTIFICATETEMPLATE: PCWSTR = w("SigningCertificateTemplate")

public val wszOCSPCAPROP_SIGNINGFLAGS: PCWSTR = w("SigningFlags")

public val wszOCSPCOMMONPROP_MAXINCOMINGMESSAGESIZE: PCWSTR = w("MaxIncomingMessageSize")

public val wszOCSPCOMMONPROP_MAXNUMOFREQUESTENTRIES: PCWSTR = w("MaxNumOfRequestEntries")

public val wszOCSPCOMMONPROP_REQFLAGS: PCWSTR = w("RequestFlags")

public val wszOCSPISAPIPROP_DEBUG: PCWSTR = w("ISAPIDebug")

public val wszOCSPISAPIPROP_MAXAGE: PCWSTR = w("MaxAge")

public val wszOCSPISAPIPROP_MAXNUMOFCACHEENTRIES: PCWSTR = w("MaxNumOfCacheEntries")

public val wszOCSPISAPIPROP_NUMOFBACKENDCONNECTIONS: PCWSTR = w("NumOfBackendConnections")

public val wszOCSPISAPIPROP_NUMOFTHREADS: PCWSTR = w("NumOfThreads")

public val wszOCSPISAPIPROP_REFRESHRATE: PCWSTR = w("RefreshRate")

public val wszOCSPISAPIPROP_VIRTUALROOTNAME: PCWSTR = w("VirtualRootName")

public val wszOCSPPROP_ARRAYCONTROLLER: PCWSTR = w("ArrayController")

public val wszOCSPPROP_ARRAYMEMBERS: PCWSTR = w("ArrayMembers")

public val wszOCSPPROP_AUDITFILTER: PCWSTR = w("AuditFilter")

public val wszOCSPPROP_DEBUG: PCWSTR = w("Debug")

public val wszOCSPPROP_ENROLLPOLLINTERVAL: PCWSTR = w("EnrollPollInterval")

public val wszOCSPPROP_LOGLEVEL: PCWSTR = w("LogLevel")

public val wszOCSPREVPROP_BASECRL: PCWSTR = w("BaseCrl")

public val wszOCSPREVPROP_BASECRLURLS: PCWSTR = w("BaseCrlUrls")

public val wszOCSPREVPROP_CRLURLTIMEOUT: PCWSTR = w("CrlUrlTimeOut")

public val wszOCSPREVPROP_DELTACRL: PCWSTR = w("DeltaCrl")

public val wszOCSPREVPROP_DELTACRLURLS: PCWSTR = w("DeltaCrlUrls")

public val wszOCSPREVPROP_ERRORCODE: PCWSTR = w("RevocationErrorCode")

public val wszOCSPREVPROP_REFRESHTIMEOUT: PCWSTR = w("RefreshTimeOut")

public val wszOCSPREVPROP_SERIALNUMBERSDIRS: PCWSTR = w("IssuedSerialNumbersDirectories")

public val wszPERIODDAYS: PCWSTR = w("Days")

public val wszPERIODHOURS: PCWSTR = w("Hours")

public val wszPERIODMINUTES: PCWSTR = w("Minutes")

public val wszPERIODMONTHS: PCWSTR = w("Months")

public val wszPERIODSECONDS: PCWSTR = w("Seconds")

public val wszPERIODWEEKS: PCWSTR = w("Weeks")

public val wszPERIODYEARS: PCWSTR = w("Years")

public val wszPFXFILENAMEEXT: PCWSTR = w(".p12")

public val wszPROPATTESTATIONCHALLENGE: PCWSTR = w("AttestationChallenge")

public val wszPROPATTRIBNAME: PCWSTR = w("AttributeName")

public val wszPROPATTRIBREQUESTID: PCWSTR = w("AttributeRequestId")

public val wszPROPATTRIBVALUE: PCWSTR = w("AttributeValue")

public val wszPROPCALLERNAME: PCWSTR = w("CallerName")

public val wszPROPCATYPE: PCWSTR = w("CAType")

public val wszPROPCERTCLIENTMACHINE: PCWSTR = w("ccm")

public val wszPROPCERTCOUNT: PCWSTR = w("CertCount")

public val wszPROPCERTIFICATEENROLLMENTFLAGS: PCWSTR = w("EnrollmentFlags")

public val wszPROPCERTIFICATEGENERALFLAGS: PCWSTR = w("GeneralFlags")

public val wszPROPCERTIFICATEHASH: PCWSTR = w("CertificateHash")

public val wszPROPCERTIFICATENOTAFTERDATE: PCWSTR = w("NotAfter")

public val wszPROPCERTIFICATENOTBEFOREDATE: PCWSTR = w("NotBefore")

public val wszPROPCERTIFICATEPRIVATEKEYFLAGS: PCWSTR = w("PrivatekeyFlags")

public val wszPROPCERTIFICATEPUBLICKEYALGORITHM: PCWSTR = w("PublicKeyAlgorithm")

public val wszPROPCERTIFICATEPUBLICKEYLENGTH: PCWSTR = w("PublicKeyLength")

public val wszPROPCERTIFICATERAWPUBLICKEY: PCWSTR = w("RawPublicKey")

public val wszPROPCERTIFICATERAWPUBLICKEYALGORITHMPARAMETERS: PCWSTR = w("RawPublicKeyAlgorithmParameters")

public val wszPROPCERTIFICATERAWSMIMECAPABILITIES: PCWSTR = w("RawSMIMECapabilities")

public val wszPROPCERTIFICATEREQUESTID: PCWSTR = w("RequestID")

public val wszPROPCERTIFICATESERIALNUMBER: PCWSTR = w("SerialNumber")

public val wszPROPCERTIFICATESUBJECTKEYIDENTIFIER: PCWSTR = w("SubjectKeyIdentifier")

public val wszPROPCERTIFICATETEMPLATE: PCWSTR = w("CertificateTemplate")

public val wszPROPCERTIFICATETYPE: PCWSTR = w("CertificateType")

public val wszPROPCERTIFICATEUPN: PCWSTR = w("UPN")

public val wszPROPCERTSTATE: PCWSTR = w("CertState")

public val wszPROPCERTSUFFIX: PCWSTR = w("CertSuffix")

public val wszPROPCERTTEMPLATE: PCWSTR = w("CertificateTemplate")

public val wszPROPCERTTYPE: PCWSTR = w("CertType")

public val wszPROPCERTUSAGE: PCWSTR = w("CertificateUsage")

public val wszPROPCHALLENGE: PCWSTR = w("Challenge")

public val wszPROPCLIENTBROWSERMACHINE: PCWSTR = w("cbm")

public val wszPROPCLIENTDCDNS: PCWSTR = w("cdc")

public val wszPROPCOMMONNAME: PCWSTR = w("CommonName")

public val wszPROPCONFIGDN: PCWSTR = w("ConfigDN")

public val wszPROPCOUNTRY: PCWSTR = w("Country")

public val wszPROPCRITICALTAG: PCWSTR = w("{critical}")

public val wszPROPCRLCOUNT: PCWSTR = w("CRLCount")

public val wszPROPCRLEFFECTIVE: PCWSTR = w("CRLEffective")

public val wszPROPCRLINDEX: PCWSTR = w("CRLIndex")

public val wszPROPCRLLASTPUBLISHED: PCWSTR = w("CRLLastPublished")

public val wszPROPCRLMINBASE: PCWSTR = w("CRLMinBase")

public val wszPROPCRLNAMEID: PCWSTR = w("CRLNameId")

public val wszPROPCRLNEXTPUBLISH: PCWSTR = w("CRLNextPublish")

public val wszPROPCRLNEXTUPDATE: PCWSTR = w("CRLNextUpdate")

public val wszPROPCRLNUMBER: PCWSTR = w("CRLNumber")

public val wszPROPCRLPROPAGATIONCOMPLETE: PCWSTR = w("CRLPropagationComplete")

public val wszPROPCRLPUBLISHATTEMPTS: PCWSTR = w("CRLPublishAttempts")

public val wszPROPCRLPUBLISHERROR: PCWSTR = w("CRLPublishError")

public val wszPROPCRLPUBLISHFLAGS: PCWSTR = w("CRLPublishFlags")

public val wszPROPCRLPUBLISHSTATUSCODE: PCWSTR = w("CRLPublishStatusCode")

public val wszPROPCRLRAWCRL: PCWSTR = w("CRLRawCRL")

public val wszPROPCRLROWID: PCWSTR = w("CRLRowId")

public val wszPROPCRLSTATE: PCWSTR = w("CRLState")

public val wszPROPCRLSUFFIX: PCWSTR = w("CRLSuffix")

public val wszPROPCRLTHISPUBLISH: PCWSTR = w("CRLThisPublish")

public val wszPROPCRLTHISUPDATE: PCWSTR = w("CRLThisUpdate")

public val wszPROPCROSSFOREST: PCWSTR = w("CrossForest")

public val wszPROPDCNAME: PCWSTR = w("DCName")

public val wszPROPDECIMALTAG: PCWSTR = w("{decimal}")

public val wszPROPDELTACRLSDISABLED: PCWSTR = w("fDeltaCRLsDisabled")

public val wszPROPDEVICESERIALNUMBER: PCWSTR = w("DeviceSerialNumber")

public val wszPROPDISPOSITION: PCWSTR = w("Disposition")

public val wszPROPDISPOSITIONDENY: PCWSTR = w("Deny")

public val wszPROPDISPOSITIONPENDING: PCWSTR = w("Pending")

public val wszPROPDISTINGUISHEDNAME: PCWSTR = w("DistinguishedName")

public val wszPROPDN: PCWSTR = w("dn")

public val wszPROPDNS: PCWSTR = w("dns")

public val wszPROPDOMAINCOMPONENT: PCWSTR = w("DomainComponent")

public val wszPROPDOMAINDN: PCWSTR = w("DomainDN")

public val wszPROPEMAIL: PCWSTR = w("EMail")

public val wszPROPENDORSEMENTCERTIFICATEHASH: PCWSTR = w("EndorsementCertificateHash")

public val wszPROPENDORSEMENTKEYHASH: PCWSTR = w("EndorsementKeyHash")

public val wszPROPEVENTLOGERROR: PCWSTR = w("EventLogError")

public val wszPROPEVENTLOGEXHAUSTIVE: PCWSTR = w("EventLogExhaustive")

public val wszPROPEVENTLOGTERSE: PCWSTR = w("EventLogTerse")

public val wszPROPEVENTLOGVERBOSE: PCWSTR = w("EventLogVerbose")

public val wszPROPEVENTLOGWARNING: PCWSTR = w("EventLogWarning")

public val wszPROPEXITCERTFILE: PCWSTR = w("CertFile")

public val wszPROPEXPECTEDCHALLENGE: PCWSTR = w("ExpectedChallenge")

public val wszPROPEXPIRATIONDATE: PCWSTR = w("ExpirationDate")

public val wszPROPEXTFLAGS: PCWSTR = w("ExtensionFlags")

public val wszPROPEXTNAME: PCWSTR = w("ExtensionName")

public val wszPROPEXTRAWVALUE: PCWSTR = w("ExtensionRawValue")

public val wszPROPEXTREQUESTID: PCWSTR = w("ExtensionRequestId")

public val wszPROPFILETAG: PCWSTR = w("{file}")

public val wszPROPGIVENNAME: PCWSTR = w("GivenName")

public val wszPROPGUID: PCWSTR = w("guid")

public val wszPROPHEXTAG: PCWSTR = w("{hex}")

public val wszPROPINITIALS: PCWSTR = w("Initials")

public val wszPROPIPADDRESS: PCWSTR = w("ipaddress")

public val wszPROPKEYARCHIVED: PCWSTR = w("KeyArchived")

public val wszPROPLOCALITY: PCWSTR = w("Locality")

public val wszPROPLOGLEVEL: PCWSTR = w("LogLevel")

public val wszPROPMACHINEDNSNAME: PCWSTR = w("MachineDNSName")

public val wszPROPMODULEREGLOC: PCWSTR = w("ModuleRegistryLocation")

public val wszPROPNAMETYPE: PCWSTR = w("NameType")

public val wszPROPOCTETTAG: PCWSTR = w("{octet}")

public val wszPROPOFFICER: PCWSTR = w("Officer")

public val wszPROPOID: PCWSTR = w("oid")

public val wszPROPORGANIZATION: PCWSTR = w("Organization")

public val wszPROPORGUNIT: PCWSTR = w("OrgUnit")

public val wszPROPPUBLISHEXPIREDCERTINCRL: PCWSTR = w("PublishExpiredCertInCRL")

public val wszPROPRAWCACERTIFICATE: PCWSTR = w("RawCACertificate")

public val wszPROPRAWCERTIFICATE: PCWSTR = w("RawCertificate")

public val wszPROPRAWCRL: PCWSTR = w("RawCRL")

public val wszPROPRAWDELTACRL: PCWSTR = w("RawDeltaCRL")

public val wszPROPRAWNAME: PCWSTR = w("RawName")

public val wszPROPRAWPRECERTIFICATE: PCWSTR = w("RawPrecertificate")

public val wszPROPREQUESTARCHIVEDKEY: PCWSTR = w("ArchivedKey")

public val wszPROPREQUESTATTRIBUTES: PCWSTR = w("RequestAttributes")

public val wszPROPREQUESTCSPPROVIDER: PCWSTR = w("RequestCSPProvider")

public val wszPROPREQUESTDISPOSITION: PCWSTR = w("Disposition")

public val wszPROPREQUESTDISPOSITIONMESSAGE: PCWSTR = w("DispositionMessage")

public val wszPROPREQUESTDOT: PCWSTR = w("Request.")

public val wszPROPREQUESTERCAACCESS: PCWSTR = w("RequesterCAAccess")

public val wszPROPREQUESTERDN: PCWSTR = w("RequesterDN")

public val wszPROPREQUESTERNAME: PCWSTR = w("RequesterName")

public val wszPROPREQUESTERNAMEFROMOLDCERTIFICATE: PCWSTR = w("RequesterNameFromOldCertificate")

public val wszPROPREQUESTERSAMNAME: PCWSTR = w("RequesterSAMName")

public val wszPROPREQUESTERUPN: PCWSTR = w("RequesterUPN")

public val wszPROPREQUESTFLAGS: PCWSTR = w("RequestFlags")

public val wszPROPREQUESTKEYRECOVERYHASHES: PCWSTR = w("KeyRecoveryHashes")

public val wszPROPREQUESTMACHINEDNS: PCWSTR = w("rmd")

public val wszPROPREQUESTOSVERSION: PCWSTR = w("RequestOSVersion")

public val wszPROPREQUESTRAWARCHIVEDKEY: PCWSTR = w("RawArchivedKey")

public val wszPROPREQUESTRAWOLDCERTIFICATE: PCWSTR = w("RawOldCertificate")

public val wszPROPREQUESTRAWREQUEST: PCWSTR = w("RawRequest")

public val wszPROPREQUESTREQUESTID: PCWSTR = w("RequestID")

public val wszPROPREQUESTRESOLVEDWHEN: PCWSTR = w("ResolvedWhen")

public val wszPROPREQUESTREVOKEDEFFECTIVEWHEN: PCWSTR = w("RevokedEffectiveWhen")

public val wszPROPREQUESTREVOKEDREASON: PCWSTR = w("RevokedReason")

public val wszPROPREQUESTREVOKEDWHEN: PCWSTR = w("RevokedWhen")

public val wszPROPREQUESTSTATUSCODE: PCWSTR = w("StatusCode")

public val wszPROPREQUESTSUBMITTEDWHEN: PCWSTR = w("SubmittedWhen")

public val wszPROPREQUESTTYPE: PCWSTR = w("RequestType")

public val wszPROPSANITIZEDCANAME: PCWSTR = w("SanitizedCAName")

public val wszPROPSANITIZEDSHORTNAME: PCWSTR = w("SanitizedShortName")

public val wszPROPSEAUDITFILTER: PCWSTR = w("SEAuditFilter")

public val wszPROPSEAUDITID: PCWSTR = w("SEAuditId")

public val wszPROPSERVERUPGRADED: PCWSTR = w("fServerUpgraded")

public val wszPROPSESSIONCOUNT: PCWSTR = w("SessionCount")

public val wszPROPSIGNERAPPLICATIONPOLICIES: PCWSTR = w("SignerApplicationPolicies")

public val wszPROPSIGNERPOLICIES: PCWSTR = w("SignerPolicies")

public val wszPROPSTATE: PCWSTR = w("State")

public val wszPROPSTREETADDRESS: PCWSTR = w("StreetAddress")

public val wszPROPSUBJECTALTNAME2: PCWSTR = w("san")

public val wszPROPSUBJECTDOT: PCWSTR = w("Subject.")

public val wszPROPSURNAME: PCWSTR = w("SurName")

public val wszPROPTEMPLATECHANGESEQUENCENUMBER: PCWSTR = w("TemplateChangeSequenceNumber")

public val wszPROPTEXTTAG: PCWSTR = w("{text}")

public val wszPROPTITLE: PCWSTR = w("Title")

public val wszPROPUNSTRUCTUREDADDRESS: PCWSTR = w("UnstructuredAddress")

public val wszPROPUNSTRUCTUREDNAME: PCWSTR = w("UnstructuredName")

public val wszPROPUPN: PCWSTR = w("upn")

public val wszPROPURL: PCWSTR = w("url")

public val wszPROPUSEDS: PCWSTR = w("fUseDS")

public val wszPROPUSERDN: PCWSTR = w("UserDN")

public val wszPROPUTF8TAG: PCWSTR = w("{utf8}")

public val wszPROPVALIDITYPERIODCOUNT: PCWSTR = w("ValidityPeriodUnits")

public val wszPROPVALIDITYPERIODSTRING: PCWSTR = w("ValidityPeriod")

public val wszPROPVOLATILEMODE: PCWSTR = w("VolatileMode")

public val wszREGACTIVE: PCWSTR = w("Active")

public val wszREGAELOGLEVEL_OLD: PCWSTR = w("AEEventLogLevel")

public val wszREGAIKCLOUDCAURL: PCWSTR = w("AIKCloudCAURL")

public val wszREGAIKKEYALGORITHM: PCWSTR = w("AIKKeyAlgorithm")

public val wszREGAIKKEYLENGTH: PCWSTR = w("AIKKeyLength")

public val wszREGALLPROVIDERS: PCWSTR = w("All")

public val wszREGALTERNATEPUBLISHDOMAINS: PCWSTR = w("AlternatePublishDomains")

public val wszREGALTERNATESIGNATUREALGORITHM: PCWSTR = w("AlternateSignatureAlgorithm")

public val wszREGAUDITFILTER: PCWSTR = w("AuditFilter")

public val wszREGB2ICERTMANAGEMODULE: PCWSTR = w("ICertManageModule")

public val wszREGBACKUPLOGDIRECTORY: PCWSTR = w("BackupLogDirectory")

public val wszREGCACERTFILENAME: PCWSTR = w("CACertFileName")

public val wszREGCACERTHASH: PCWSTR = w("CACertHash")

public val wszREGCACERTPUBLICATIONURLS: PCWSTR = w("CACertPublicationURLs")

public val wszREGCADESCRIPTION: PCWSTR = w("CADescription")

public val wszREGCAPATHLENGTH: PCWSTR = w("CAPathLength")

public val wszREGCASECURITY: PCWSTR = w("Security")

public val wszREGCASERIALNUMBER: PCWSTR = w("CACertSerialNumber")

public val wszREGCASERVERNAME: PCWSTR = w("CAServerName")

public val wszREGCATYPE: PCWSTR = w("CAType")

public val wszREGCAUSEDS: PCWSTR = w("UseDS")

public val wszREGCAXCHGCERTHASH: PCWSTR = w("CAXchgCertHash")

public val wszREGCAXCHGOVERLAPPERIODCOUNT: PCWSTR = w("CAXchgOverlapPeriodUnits")

public val wszREGCAXCHGOVERLAPPERIODSTRING: PCWSTR = w("CAXchgOverlapPeriod")

public val wszREGCAXCHGVALIDITYPERIODCOUNT: PCWSTR = w("CAXchgValidityPeriodUnits")

public val wszREGCAXCHGVALIDITYPERIODSTRING: PCWSTR = w("CAXchgValidityPeriod")

public val wszREGCERTENROLLCOMPATIBLE: PCWSTR = w("CertEnrollCompatible")

public val wszREGCERTIFICATETRANSPARENCYINFOOID: PCWSTR = w("CTInformationExtensionOid")

public val wszREGCERTPUBLISHFLAGS: PCWSTR = w("PublishCertFlags")

public val wszREGCERTSRVDEBUG: PCWSTR = w("Debug")

public val wszREGCHECKPOINTFILE: PCWSTR = w("CheckPointFile")

public val wszREGCLOCKSKEWMINUTES: PCWSTR = w("ClockSkewMinutes")

public val wszREGCOMMONNAME: PCWSTR = w("CommonName")

public val wszREGCRLATTEMPTREPUBLISH: PCWSTR = w("CRLAttemptRepublish")

public val wszREGCRLDELTANEXTPUBLISH: PCWSTR = w("CRLDeltaNextPublish")

public val wszREGCRLDELTAOVERLAPPERIODCOUNT: PCWSTR = w("CRLDeltaOverlapUnits")

public val wszREGCRLDELTAOVERLAPPERIODSTRING: PCWSTR = w("CRLDeltaOverlapPeriod")

public val wszREGCRLDELTAPERIODCOUNT: PCWSTR = w("CRLDeltaPeriodUnits")

public val wszREGCRLDELTAPERIODSTRING: PCWSTR = w("CRLDeltaPeriod")

public val wszREGCRLEDITFLAGS: PCWSTR = w("CRLEditFlags")

public val wszREGCRLFLAGS: PCWSTR = w("CRLFlags")

public val wszREGCRLNEXTPUBLISH: PCWSTR = w("CRLNextPublish")

public val wszREGCRLOVERLAPPERIODCOUNT: PCWSTR = w("CRLOverlapUnits")

public val wszREGCRLOVERLAPPERIODSTRING: PCWSTR = w("CRLOverlapPeriod")

public val wszREGCRLPATH_OLD: PCWSTR = w("CRLPath")

public val wszREGCRLPERIODCOUNT: PCWSTR = w("CRLPeriodUnits")

public val wszREGCRLPERIODSTRING: PCWSTR = w("CRLPeriod")

public val wszREGCRLPUBLICATIONURLS: PCWSTR = w("CRLPublicationURLs")

public val wszREGDATABASERECOVERED: PCWSTR = w("DatabaseRecovered")

public val wszREGDBDIRECTORY: PCWSTR = w("DBDirectory")

public val wszREGDBFLAGS: PCWSTR = w("DBFlags")

public val wszREGDBLASTFULLBACKUP: PCWSTR = w("DBLastFullBackup")

public val wszREGDBLASTINCREMENTALBACKUP: PCWSTR = w("DBLastIncrementalBackup")

public val wszREGDBLASTRECOVERY: PCWSTR = w("DBLastRecovery")

public val wszREGDBLOGDIRECTORY: PCWSTR = w("DBLogDirectory")

public val wszREGDBMAXREADSESSIONCOUNT: PCWSTR = w("DBMaxReadSessionCount")

public val wszREGDBSESSIONCOUNT: PCWSTR = w("DBSessionCount")

public val wszREGDBSYSDIRECTORY: PCWSTR = w("DBSystemDirectory")

public val wszREGDBTEMPDIRECTORY: PCWSTR = w("DBTempDirectory")

public val wszREGDEFAULTSMIME: PCWSTR = w("DefaultSMIME")

public val wszREGDIRECTORY: PCWSTR = w("ConfigurationDirectory")

public val wszREGDISABLEEXTENSIONLIST: PCWSTR = w("DisableExtensionList")

public val wszREGDSCONFIGDN: PCWSTR = w("DSConfigDN")

public val wszREGDSDOMAINDN: PCWSTR = w("DSDomainDN")

public val wszREGEDITFLAGS: PCWSTR = w("EditFlags")

public val wszREGEKPUBLISTDIRECTORIES: PCWSTR = w("EndorsementKeyListDirectories")

public val wszREGEKUOIDSFORPUBLISHEXPIREDCERTINCRL: PCWSTR = w("EKUOIDsForPublishExpiredCertInCRL")

public val wszREGEKUOIDSFORVOLATILEREQUESTS: PCWSTR = w("EKUOIDsforVolatileRequests")

public val wszREGENABLED: PCWSTR = w("Enabled")

public val wszREGENABLEDEKUFORDEFINEDCACERT: PCWSTR = w("EnabledEKUForDefinedCACert")

public val wszREGENABLEENROLLEEREQUESTEXTENSIONLIST: PCWSTR = w("EnableEnrolleeRequestExtensionList")

public val wszREGENABLEREQUESTEXTENSIONLIST: PCWSTR = w("EnableRequestExtensionList")

public val wszREGENFORCEX500NAMELENGTHS: PCWSTR = w("EnforceX500NameLengths")

public val wszREGENROLLFLAGS: PCWSTR = w("EnrollFlags")

public val wszREGEXITBODYARG: PCWSTR = w("BodyArg")

public val wszREGEXITBODYFORMAT: PCWSTR = w("BodyFormat")

public val wszREGEXITCRLISSUEDKEY: PCWSTR = w("CRLIssued")

public val wszREGEXITDENIEDKEY: PCWSTR = w("Denied")

public val wszREGEXITIMPORTEDKEY: PCWSTR = w("Imported")

public val wszREGEXITISSUEDKEY: PCWSTR = w("Issued")

public val wszREGEXITPENDINGKEY: PCWSTR = w("Pending")

public val wszREGEXITPROPNOTFOUND: PCWSTR = w("???")

public val wszREGEXITREVOKEDKEY: PCWSTR = w("Revoked")

public val wszREGEXITSHUTDOWNKEY: PCWSTR = w("Shutdown")

public val wszREGEXITSMTPAUTHENTICATE: PCWSTR = w("SMTPAuthenticate")

public val wszREGEXITSMTPCC: PCWSTR = w("Cc")

public val wszREGEXITSMTPEVENTFILTER: PCWSTR = w("EventFilter")

public val wszREGEXITSMTPFROM: PCWSTR = w("From")

public val wszREGEXITSMTPKEY: PCWSTR = w("SMTP")

public val wszREGEXITSMTPSERVER: PCWSTR = w("SMTPServer")

public val wszREGEXITSMTPTEMPLATES: PCWSTR = w("Templates")

public val wszREGEXITSMTPTO: PCWSTR = w("To")

public val wszREGEXITSTARTUPKEY: PCWSTR = w("Startup")

public val wszREGEXITTITLEARG: PCWSTR = w("TitleArg")

public val wszREGEXITTITLEFORMAT: PCWSTR = w("TitleFormat")

public val wszREGFILEISSUERCERTURL_OLD: PCWSTR = w("FileIssuerCertURL")

public val wszREGFILEREVOCATIONCRLURL_OLD: PCWSTR = w("FileRevocationCRLURL")

public val wszREGFORCETELETEX: PCWSTR = w("ForceTeletex")

public val wszREGFTPISSUERCERTURL_OLD: PCWSTR = w("FTPIssuerCertURL")

public val wszREGFTPREVOCATIONCRLURL_OLD: PCWSTR = w("FTPRevocationCRLURL")

public val wszREGHIGHLOGNUMBER: PCWSTR = w("HighLogNumber")

public val wszREGHIGHSERIAL: PCWSTR = w("HighSerial")

public val wszREGINTERFACEFLAGS: PCWSTR = w("InterfaceFlags")

public val wszREGISSUERCERTURLFLAGS: PCWSTR = w("IssuerCertURLFlags")

public val wszREGISSUERCERTURL_OLD: PCWSTR = w("IssuerCertURL")

public val wszREGKEYBASE: PCWSTR = w("SYSTEM\\CurrentControlSet\\Services\\CertSvc")

public val wszREGKEYCERTSVCPATH: PCWSTR = w("SYSTEM\\CurrentControlSet\\Services\\CertSvc")

public val wszREGKEYCONFIG: PCWSTR = w("Configuration")

public val wszREGKEYCSP: PCWSTR = w("CSP")

public val wszREGKEYDBPARAMETERS: PCWSTR = w("DBParameters")

public val wszREGKEYENCRYPTIONCSP: PCWSTR = w("EncryptionCSP")

public val wszREGKEYENROLLMENT: PCWSTR = w("Software\\Microsoft\\Cryptography\\AutoEnrollment")

public val wszREGKEYEXITMODULES: PCWSTR = w("ExitModules")

public val wszREGKEYGROUPPOLICYENROLLMENT: PCWSTR = w("Software\\Policies\\Microsoft\\Cryptography\\AutoEnrollment")

public val wszREGKEYNOSYSTEMCERTSVCPATH: PCWSTR = w("CurrentControlSet\\Services\\CertSvc")

public val wszREGKEYPOLICYMODULES: PCWSTR = w("PolicyModules")

public val wszREGKEYREPAIR: PCWSTR = w("KeyRepair")

public val wszREGKEYRESTOREINPROGRESS: PCWSTR = w("RestoreInProgress")

public val wszREGKEYSIZE: PCWSTR = w("KeySize")

public val wszREGKRACERTCOUNT: PCWSTR = w("KRACertCount")

public val wszREGKRACERTHASH: PCWSTR = w("KRACertHash")

public val wszREGKRAFLAGS: PCWSTR = w("KRAFlags")

public val wszREGLDAPFLAGS: PCWSTR = w("LDAPFlags")

public val wszREGLDAPISSUERCERTURL_OLD: PCWSTR = w("LDAPIssuerCertURL")

public val wszREGLDAPREVOCATIONCRLURL_OLD: PCWSTR = w("LDAPRevocationCRLURL")

public val wszREGLDAPREVOCATIONDNTEMPLATE_OLD: PCWSTR = w("LDAPRevocationDNTemplate")

public val wszREGLDAPREVOCATIONDN_OLD: PCWSTR = w("LDAPRevocationDN")

public val wszREGLDAPSESSIONOPTIONS: PCWSTR = w("LDAPSessionOptions")

public val wszREGLOGLEVEL: PCWSTR = w("LogLevel")

public val wszREGLOGPATH: PCWSTR = w("LogPath")

public val wszREGLOWLOGNUMBER: PCWSTR = w("LowLogNumber")

public val wszREGMAXINCOMINGALLOCSIZE: PCWSTR = w("MaxIncomingAllocSize")

public val wszREGMAXINCOMINGMESSAGESIZE: PCWSTR = w("MaxIncomingMessageSize")

public val wszREGMAXPENDINGREQUESTDAYS: PCWSTR = w("MaxPendingRequestDays")

public val wszREGMAXSCTLISTSIZE: PCWSTR = w("MaxSCTListSize")

public val wszREGNAMESEPARATOR: PCWSTR = w("SubjectNameSeparator")

public val wszREGNETSCAPECERTTYPE: PCWSTR = w("NetscapeCertType")

public val wszREGOFFICERRIGHTS: PCWSTR = w("OfficerRights")

public val wszREGPARENTCAMACHINE: PCWSTR = w("ParentCAMachine")

public val wszREGPARENTCANAME: PCWSTR = w("ParentCAName")

public val wszREGPOLICYFLAGS: PCWSTR = w("PolicyFlags")

public val wszREGPRESERVESCEPDUMMYCERTS: PCWSTR = w("PreserveSCEPDummyCerts")

public val wszREGPROCESSINGFLAGS: PCWSTR = w("ProcessingFlags")

public val wszREGPROVIDER: PCWSTR = w("Provider")

public val wszREGPROVIDERTYPE: PCWSTR = w("ProviderType")

public val wszREGREQUESTDISPOSITION: PCWSTR = w("RequestDisposition")

public val wszREGREQUESTFILENAME: PCWSTR = w("RequestFileName")

public val wszREGREQUESTID: PCWSTR = w("RequestId")

public val wszREGREQUESTKEYCONTAINER: PCWSTR = w("RequestKeyContainer")

public val wszREGREQUESTKEYINDEX: PCWSTR = w("RequestKeyIndex")

public val wszREGRESTOREMAP: PCWSTR = w("RestoreMap")

public val wszREGRESTOREMAPCOUNT: PCWSTR = w("RestoreMapCount")

public val wszREGRESTORESTATUS: PCWSTR = w("RestoreStatus")

public val wszREGREVOCATIONCRLURL_OLD: PCWSTR = w("RevocationCRLURL")

public val wszREGREVOCATIONTYPE: PCWSTR = w("RevocationType")

public val wszREGREVOCATIONURL: PCWSTR = w("RevocationURL")

public val wszREGROLESEPARATIONENABLED: PCWSTR = w("RoleSeparationEnabled")

public val wszREGSETUPSTATUS: PCWSTR = w("SetupStatus")

public val wszREGSP4DEFAULTCONFIGURATION: PCWSTR = w("DefaultConfiguration")

public val wszREGSP4KEYSETNAME: PCWSTR = w("KeySetName")

public val wszREGSP4NAMES: PCWSTR = w("Names")

public val wszREGSP4QUERIES: PCWSTR = w("Queries")

public val wszREGSP4SUBJECTNAMESEPARATOR: PCWSTR = w("SubjectNameSeparator")

public val wszREGSUBJECTALTNAME: PCWSTR = w("SubjectAltName")

public val wszREGSUBJECTALTNAME2: PCWSTR = w("SubjectAltName2")

public val wszREGSUBJECTTEMPLATE: PCWSTR = w("SubjectTemplate")

public val wszREGSYMMETRICKEYSIZE: PCWSTR = w("SymmetricKeySize")

public val wszREGUNICODE: PCWSTR = w("Unicode")

public val wszREGUPNMAP: PCWSTR = w("UPNMap")

public val wszREGUSEDEFINEDCACERTINREQ: PCWSTR = w("UseDefinedCACertInRequest")

public val wszREGVALIDITYPERIODCOUNT: PCWSTR = w("ValidityPeriodUnits")

public val wszREGVALIDITYPERIODSTRING: PCWSTR = w("ValidityPeriod")

public val wszREGVERIFYFLAGS: PCWSTR = w("VerifyFlags")

public val wszREGVERSION: PCWSTR = w("Version")

public val wszREGVIEWAGEMINUTES: PCWSTR = w("ViewAgeMinutes")

public val wszREGVIEWIDLEMINUTES: PCWSTR = w("ViewIdleMinutes")

public val wszREGWEBCLIENTCAMACHINE: PCWSTR = w("WebClientCAMachine")

public val wszREGWEBCLIENTCANAME: PCWSTR = w("WebClientCAName")

public val wszREGWEBCLIENTCATYPE: PCWSTR = w("WebClientCAType")

public val wszSECUREDATTRIBUTES: PCWSTR = w("SignedAttributes")

public val wszSERVICE_NAME: PCWSTR = w("CertSvc")

public val wszzDEFAULTSIGNEDATTRIBUTES: PCWSTR = w("RequesterName\u0000")
