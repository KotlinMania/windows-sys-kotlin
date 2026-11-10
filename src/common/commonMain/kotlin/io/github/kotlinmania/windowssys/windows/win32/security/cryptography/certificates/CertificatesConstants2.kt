package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val XCN_OID_SUPPORTED_APPLICATION_CONTEXT: CertenrollObjectid = 148

public val XCN_OID_SUR_NAME: CertenrollObjectid = 122

public val XCN_OID_TELEPHONE_NUMBER: CertenrollObjectid = 138

public val XCN_OID_TELETEXT_TERMINAL_IDENTIFIER: CertenrollObjectid = 140

public val XCN_OID_TELEX_NUMBER: CertenrollObjectid = 139

public val XCN_OID_TIMESTAMP_TOKEN: CertenrollObjectid = 427

public val XCN_OID_TITLE: CertenrollObjectid = 130

public val XCN_OID_USER_CERTIFICATE: CertenrollObjectid = 154

public val XCN_OID_USER_PASSWORD: CertenrollObjectid = 153

public val XCN_OID_VERISIGN_BITSTRING_6_13: CertenrollObjectid = 287

public val XCN_OID_VERISIGN_ISS_STRONG_CRYPTO: CertenrollObjectid = 288

public val XCN_OID_VERISIGN_ONSITE_JURISDICTION_HASH: CertenrollObjectid = 286

public val XCN_OID_VERISIGN_PRIVATE_6_9: CertenrollObjectid = 285

public val XCN_OID_WHQL_CRYPTO: CertenrollObjectid = 261

public val XCN_OID_X21_ADDRESS: CertenrollObjectid = 142

public val XCN_OID_X957: CertenrollObjectid = 55

public val XCN_OID_X957_DSA: CertenrollObjectid = 56

public val XCN_OID_X957_SHA1DSA: CertenrollObjectid = 57

public val XCN_OID_YESNO_TRUST_ATTR: CertenrollObjectid = 278

public val XCN_PROPERTYID_NONE: CertenrollPropertyid = 0

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

public val XECR_CMC: CertCreateRequestFlags = 3

public val XECR_PKCS10_V1_5: CertCreateRequestFlags = 4

public val XECR_PKCS10_V2_0: CertCreateRequestFlags = 1

public val XECR_PKCS7: CertCreateRequestFlags = 2

public val XECT_EXTENSION_V1: AddedCertType = 1

public val XECT_EXTENSION_V2: AddedCertType = 2

public val XEKL_KEYSIZE_DEFAULT: UInt = 4u

public val XEKL_KEYSIZE_INC: XeklKeysize = 3

public val XEKL_KEYSIZE_MAX: XeklKeysize = 2

public val XEKL_KEYSIZE_MIN: XeklKeysize = 1

public val XEKL_KEYSPEC_KEYX: XeklKeyspec = 1

public val XEKL_KEYSPEC_SIG: XeklKeyspec = 2

public val XEPR_CADNS: PendingRequestDesiredProperty = 1

public val XEPR_CAFRIENDLYNAME: PendingRequestDesiredProperty = 3

public val XEPR_CANAME: PendingRequestDesiredProperty = 2

public val XEPR_DATE: UInt = 5u

public val XEPR_ENUM_FIRST: Int = -1

public val XEPR_HASH: PendingRequestDesiredProperty = 8

public val XEPR_REQUESTID: PendingRequestDesiredProperty = 4

public val XEPR_TEMPLATENAME: UInt = 6u

public val XEPR_V1TEMPLATENAME: UInt = 9u

public val XEPR_V2TEMPLATEOID: UInt = 16u

public val XEPR_VERSION: UInt = 7u

public val DW_CAXCHGOVERLAPPERIODCOUNTDEFAULT: UInt = 1u

public val DW_CAXCHGVALIDITYPERIODCOUNTDEFAULT: UInt = 1u

public val DW_CRLDELTAOVERLAPPERIODCOUNTDEFAULT: UInt = 0u

public val DW_CRLDELTAPERIODCOUNTDEFAULT: UInt = 1u

public val DW_CRLOVERLAPPERIODCOUNTDEFAULT: UInt = 0u

public val DW_CRLPERIODCOUNTDEFAULT: UInt = 1u

public val DW_VALIDITYPERIODCOUNTDEFAULT_ENTERPRISE: UInt = 2u

public val DW_VALIDITYPERIODCOUNTDEFAULT_ROOT: UInt = 5u

public val DW_VALIDITYPERIODCOUNTDEFAULT_STANDALONE: UInt = 1u

public val SZ_BACKUPANNOTATION: Pcstr = s("Cert Server Backup Interface")

public val SZ_DBBASENAMEPARM: Pcstr = s("edb")

public val SZ_NAMESEPARATORDEFAULT: Pcstr = s("\n")

public val SZ_PROPASNTAG: Pcstr = s("{asn}")

public val SZ_RESTOREANNOTATION: Pcstr = s("Cert Server Restore Interface")

public val WSZ_AT_EKCERTINF: Pcwstr = w("@EKCert")

public val WSZ_AT_TESTROOT: Pcwstr = w("@TestRoot")

public val WSZ_CAPOLICYFILE: Pcwstr = w("CAPolicy.inf")

public val WSZ_CERTEXITMODULE_POSTFIX: Pcwstr = w(".Exit")

public val WSZ_CERTIFICATETRANSPARENCYFLAGS: Pcwstr = w("CertificateTransparencyFlags")

public val WSZ_CERTMANAGE_SUFFIX: Pcwstr = w("Manage")

public val WSZ_CERTPOLICYMODULE_POSTFIX: Pcwstr = w(".Policy")

public val WSZ_CERT_TYPE: Pcwstr = w("RequestType")

public val WSZ_CERT_TYPE_CLIENT: Pcwstr = w("Client")

public val WSZ_CERT_TYPE_CODESIGN: Pcwstr = w("CodeSign")

public val WSZ_CERT_TYPE_CUSTOMER: Pcwstr = w("SetCustomer")

public val WSZ_CERT_TYPE_MERCHANT: Pcwstr = w("SetMerchant")

public val WSZ_CERT_TYPE_PAYMENT: Pcwstr = w("SetPayment")

public val WSZ_CERT_TYPE_SERVER: Pcwstr = w("Server")

public val WSZ_CERT_VERSION: Pcwstr = w("Version")

public val WSZ_CERT_VERSION_1: Pcwstr = w("1")

public val WSZ_CERT_VERSION_2: Pcwstr = w("2")

public val WSZ_CERT_VERSION_3: Pcwstr = w("3")

public val WSZ_CLASS_CERTADMIN: Pcwstr = w("CertificateAuthority.Admin")

public val WSZ_CLASS_CERTCONFIG: Pcwstr = w("CertificateAuthority.Config")

public val WSZ_CLASS_CERTDBMEM: Pcwstr = w("CertificateAuthority.DBMem")

public val WSZ_CLASS_CERTENCODE: Pcwstr = w("CertificateAuthority.Encode")

public val WSZ_CLASS_CERTGETCONFIG: Pcwstr = w("CertificateAuthority.GetConfig")

public val WSZ_CLASS_CERTREQUEST: Pcwstr = w("CertificateAuthority.Request")

public val WSZ_CLASS_CERTSERVEREXIT: Pcwstr = w("CertificateAuthority.ServerExit")

public val WSZ_CLASS_CERTSERVERPOLICY: Pcwstr = w("CertificateAuthority.ServerPolicy")

public val WSZ_CLASS_CERTVIEW: Pcwstr = w("CertificateAuthority.View")

public val WSZ_CMM_PROP_COPYRIGHT: Pcwstr = w("Copyright")

public val WSZ_CMM_PROP_DESCRIPTION: Pcwstr = w("Description")

public val WSZ_CMM_PROP_DISPLAY_HWND: Pcwstr = w("HWND")

public val WSZ_CMM_PROP_FILEVER: Pcwstr = w("File Version")

public val WSZ_CMM_PROP_ISMULTITHREADED: Pcwstr = w("IsMultiThreaded")

public val WSZ_CMM_PROP_NAME: Pcwstr = w("Name")

public val WSZ_CMM_PROP_PRODUCTVER: Pcwstr = w("Product Version")

public val WSZ_CNGENCRYPTIONALGORITHM: Pcwstr = w("CNGEncryptionAlgorithm")

public val WSZ_CNGHASHALGORITHM: Pcwstr = w("CNGHashAlgorithm")

public val WSZ_CNGPUBLICKEYALGORITHM: Pcwstr = w("CNGPublicKeyAlgorithm")

public val WSZ_CONFIG_AUTHORITY: Pcwstr = w("Authority")

public val WSZ_CONFIG_COMMENT: Pcwstr = w("Comment")

public val WSZ_CONFIG_COMMONNAME: Pcwstr = w("CommonName")

public val WSZ_CONFIG_CONFIG: Pcwstr = w("Config")

public val WSZ_CONFIG_COUNTRY: Pcwstr = w("Country")

public val WSZ_CONFIG_DESCRIPTION: Pcwstr = w("Description")

public val WSZ_CONFIG_EXCHANGECERTIFICATE: Pcwstr = w("ExchangeCertificate")

public val WSZ_CONFIG_FLAGS: Pcwstr = w("Flags")

public val WSZ_CONFIG_LOCALITY: Pcwstr = w("Locality")

public val WSZ_CONFIG_ORGANIZATION: Pcwstr = w("Organization")

public val WSZ_CONFIG_ORGUNIT: Pcwstr = w("OrgUnit")

public val WSZ_CONFIG_SANITIZEDNAME: Pcwstr = w("SanitizedName")

public val WSZ_CONFIG_SANITIZEDSHORTNAME: Pcwstr = w("SanitizedShortName")

public val WSZ_CONFIG_SERVER: Pcwstr = w("Server")

public val WSZ_CONFIG_SHORTNAME: Pcwstr = w("ShortName")

public val WSZ_CONFIG_SIGNATURECERTIFICATE: Pcwstr = w("SignatureCertificate")

public val WSZ_CONFIG_STATE: Pcwstr = w("State")

public val WSZ_CONFIG_WEBENROLLMENTSERVERS: Pcwstr = w("WebEnrollmentServers")

public val WSZ_CRLPUBLISHRETRYCOUNT: Pcwstr = w("CRLPublishRetryCount")

public val WSZ_CRTFILENAMEEXT: Pcwstr = w(".crt")

public val WSZ_DATFILENAMEEXT: Pcwstr = w(".dat")

public val WSZ_DBBACKUPCERTBACKDAT: Pcwstr = w("certbkxp.dat")

public val WSZ_DBBACKUPSUBDIR: Pcwstr = w("DataBase")

public val WSZ_DBFILENAMEEXT: Pcwstr = w(".edb")

public val WSZ_ENCRYPTIONALGORITHM: Pcwstr = w("EncryptionAlgorithm")

public val WSZ_ENROLLMENTAGENTRIGHTS: Pcwstr = w("EnrollmentAgentRights")

public val WSZ_HASHALGORITHM: Pcwstr = w("HashAlgorithm")

public val WSZ_INFKEY_ALTERNATESIGNATUREALGORITHM: Pcwstr = w("AlternateSignatureAlgorithm")

public val WSZ_INFKEY_ATTESTPRIVATEKEY: Pcwstr = w("AttestPrivateKey")

public val WSZ_INFKEY_CACAPABILITIES: Pcwstr = w("CACapabilities")

public val WSZ_INFKEY_CACERTS: Pcwstr = w("CACerts")

public val WSZ_INFKEY_CATHUMBPRINT: Pcwstr = w("CAThumbprint")

public val WSZ_INFKEY_CCDPSYNCDELTATIME: Pcwstr = w("SyncDeltaTime")

public val WSZ_INFKEY_CHALLENGEPASSWORD: Pcwstr = w("ChallengePassword")

public val WSZ_INFKEY_CONTINUE: Pcwstr = w("_continue_")

public val WSZ_INFKEY_CRITICAL: Pcwstr = w("Critical")

public val WSZ_INFKEY_CRLDELTAPERIODCOUNT: Pcwstr = w("CRLDeltaPeriodUnits")

public val WSZ_INFKEY_CRLDELTAPERIODSTRING: Pcwstr = w("CRLDeltaPeriod")

public val WSZ_INFKEY_CRLPERIODCOUNT: Pcwstr = w("CRLPeriodUnits")

public val WSZ_INFKEY_CRLPERIODSTRING: Pcwstr = w("CRLPeriod")

public val WSZ_INFKEY_DIRECTORYNAME: Pcwstr = w("DirectoryName")

public val WSZ_INFKEY_DNS: Pcwstr = w("DNS")

public val WSZ_INFKEY_ECCKEYPARAMETERS: Pcwstr = w("EccKeyParameters")

public val WSZ_INFKEY_ECCKEYPARAMETERSTYPE: Pcwstr = w("EccKeyParametersType")

public val WSZ_INFKEY_ECCKEYPARAMETERS_A: Pcwstr = w("EccKeyParameters_A")

public val WSZ_INFKEY_ECCKEYPARAMETERS_B: Pcwstr = w("EccKeyParameters_B")

public val WSZ_INFKEY_ECCKEYPARAMETERS_BASE: Pcwstr = w("EccKeyParameters_Base")

public val WSZ_INFKEY_ECCKEYPARAMETERS_COFACTOR: Pcwstr = w("EccKeyParameters_Cofactor")

public val WSZ_INFKEY_ECCKEYPARAMETERS_ORDER: Pcwstr = w("EccKeyParameters_Order")

public val WSZ_INFKEY_ECCKEYPARAMETERS_P: Pcwstr = w("EccKeyParameters_P")

public val WSZ_INFKEY_ECCKEYPARAMETERS_SEED: Pcwstr = w("EccKeyParameters_Seed")

public val WSZ_INFKEY_EMAIL: Pcwstr = w("EMail")

public val WSZ_INFKEY_EMPTY: Pcwstr = w("Empty")

public val WSZ_INFKEY_ENABLEKEYCOUNTING: Pcwstr = w("EnableKeyCounting")

public val WSZ_INFKEY_ENCRYPTIONALGORITHM: Pcwstr = w("EncryptionAlgorithm")

public val WSZ_INFKEY_ENCRYPTIONLENGTH: Pcwstr = w("EncryptionLength")

public val WSZ_INFKEY_EXCLUDE: Pcwstr = w("Exclude")

public val WSZ_INFKEY_EXPORTABLE: Pcwstr = w("Exportable")

public val WSZ_INFKEY_EXPORTABLEENCRYPTED: Pcwstr = w("ExportableEncrypted")

public val WSZ_INFKEY_FLAGS: Pcwstr = w("Flags")

public val WSZ_INFKEY_FORCEUTF8: Pcwstr = w("ForceUTF8")

public val WSZ_INFKEY_FRIENDLYNAME: Pcwstr = w("FriendlyName")

public val WSZ_INFKEY_HASHALGORITHM: Pcwstr = w("HashAlgorithm")

public val WSZ_INFKEY_INCLUDE: Pcwstr = w("Include")

public val WSZ_INFKEY_INHIBITPOLICYMAPPING: Pcwstr = w("InhibitPolicyMapping")

public val WSZ_INFKEY_IPADDRESS: Pcwstr = w("IPAddress")

public val WSZ_INFKEY_KEYALGORITHM: Pcwstr = w("KeyAlgorithm")

public val WSZ_INFKEY_KEYALGORITHMPARMETERS: Pcwstr = w("KeyAlgorithmParameters")

public val WSZ_INFKEY_KEYCONTAINER: Pcwstr = w("KeyContainer")

public val WSZ_INFKEY_KEYLENGTH: Pcwstr = w("KeyLength")

public val WSZ_INFKEY_KEYPROTECTION: Pcwstr = w("KeyProtection")

public val WSZ_INFKEY_KEYUSAGEEXTENSION: Pcwstr = w("KeyUsage")

public val WSZ_INFKEY_KEYUSAGEPROPERTY: Pcwstr = w("KeyUsageProperty")

public val WSZ_INFKEY_LEGACYKEYSPEC: Pcwstr = w("KeySpec")

public val WSZ_INFKEY_LOADDEFAULTTEMPLATES: Pcwstr = w("LoadDefaultTemplates")

public val WSZ_INFKEY_MACHINEKEYSET: Pcwstr = w("MachineKeySet")

public val WSZ_INFKEY_NOTAFTER: Pcwstr = w("NotAfter")

public val WSZ_INFKEY_NOTBEFORE: Pcwstr = w("NotBefore")

public val WSZ_INFKEY_NOTICE: Pcwstr = w("Notice")

public val WSZ_INFKEY_OID: Pcwstr = w("OID")

public val WSZ_INFKEY_OTHERNAME: Pcwstr = w("OtherName")

public val WSZ_INFKEY_PATHLENGTH: Pcwstr = w("PathLength")

public val WSZ_INFKEY_POLICIES: Pcwstr = w("Policies")

public val WSZ_INFKEY_PRIVATEKEYARCHIVE: Pcwstr = w("PrivateKeyArchive")

public val WSZ_INFKEY_PROVIDERNAME: Pcwstr = w("ProviderName")

public val WSZ_INFKEY_PROVIDERTYPE: Pcwstr = w("ProviderType")

public val WSZ_INFKEY_PUBLICKEY: Pcwstr = w("PublicKey")

public val WSZ_INFKEY_PUBLICKEYPARAMETERS: Pcwstr = w("PublicKeyParameters")

public val WSZ_INFKEY_READERNAME: Pcwstr = w("ReaderName")

public val WSZ_INFKEY_REGISTEREDID: Pcwstr = w("RegisteredId")

public val WSZ_INFKEY_RENEWALCERT: Pcwstr = w("RenewalCert")

public val WSZ_INFKEY_RENEWALKEYLENGTH: Pcwstr = w("RenewalKeyLength")

public val WSZ_INFKEY_RENEWALVALIDITYPERIODCOUNT: Pcwstr = w("RenewalValidityPeriodUnits")

public val WSZ_INFKEY_RENEWALVALIDITYPERIODSTRING: Pcwstr = w("RenewalValidityPeriod")

public val WSZ_INFKEY_REQUESTTYPE: Pcwstr = w("RequestType")

public val WSZ_INFKEY_REQUIREEXPLICITPOLICY: Pcwstr = w("RequireExplicitPolicy")

public val WSZ_INFKEY_SECURITYDESCRIPTOR: Pcwstr = w("SecurityDescriptor")

public val WSZ_INFKEY_SERIALNUMBER: Pcwstr = w("SerialNumber")

public val WSZ_INFKEY_SHOWALLCSPS: Pcwstr = w("ShowAllCSPs")

public val WSZ_INFKEY_SILENT: Pcwstr = w("Silent")

public val WSZ_INFKEY_SMIME: Pcwstr = w("SMIME")

public val WSZ_INFKEY_SUBJECT: Pcwstr = w("Subject")

public val WSZ_INFKEY_SUBJECTNAMEFLAGS: Pcwstr = w("SubjectNameFlags")

public val WSZ_INFKEY_SUBTREE: Pcwstr = w("SubTree")

public val WSZ_INFKEY_SUPPRESSDEFAULTS: Pcwstr = w("SuppressDefaults")

public val WSZ_INFKEY_UICONTEXTMESSAGE: Pcwstr = w("UIContextMessage")

public val WSZ_INFKEY_UPN: Pcwstr = w("UPN")

public val WSZ_INFKEY_URL: Pcwstr = w("URL")

public val WSZ_INFKEY_USEEXISTINGKEY: Pcwstr = w("UseExistingKeySet")

public val WSZ_INFKEY_USERPROTECTED: Pcwstr = w("UserProtected")

public val WSZ_INFKEY_UTF8: Pcwstr = w("UTF8")

public val WSZ_INFKEY_X500NAMEFLAGS: Pcwstr = w("X500NameFlags")

public val WSZ_INFSECTION_AIA: Pcwstr = w("AuthorityInformationAccess")

public val WSZ_INFSECTION_APPLICATIONPOLICYCONSTRAINTS: Pcwstr = w("ApplicationPolicyConstraintsExtension")

public val WSZ_INFSECTION_APPLICATIONPOLICYMAPPINGS: Pcwstr = w("ApplicationPolicyMappingsExtension")

public val WSZ_INFSECTION_APPLICATIONPOLICYSTATEMENT: Pcwstr = w("ApplicationPolicyStatementExtension")

public val WSZ_INFSECTION_BASICCONSTRAINTS: Pcwstr = w("BasicConstraintsExtension")

public val WSZ_INFSECTION_CAPOLICY: Pcwstr = w("CAPolicy")

public val WSZ_INFSECTION_CCDP: Pcwstr = w("CrossCertificateDistributionPointsExtension")

public val WSZ_INFSECTION_CDP: Pcwstr = w("CRLDistributionPoint")

public val WSZ_INFSECTION_CERTSERVER: Pcwstr = w("certsrv_server")

public val WSZ_INFSECTION_EKU: Pcwstr = w("EnhancedKeyUsageExtension")

public val WSZ_INFSECTION_EXTENSIONS: Pcwstr = w("Extensions")

public val WSZ_INFSECTION_NAMECONSTRAINTS: Pcwstr = w("NameConstraintsExtension")

public val WSZ_INFSECTION_NEWREQUEST: Pcwstr = w("NewRequest")

public val WSZ_INFSECTION_POLICYCONSTRAINTS: Pcwstr = w("PolicyConstraintsExtension")

public val WSZ_INFSECTION_POLICYMAPPINGS: Pcwstr = w("PolicyMappingsExtension")

public val WSZ_INFSECTION_POLICYSTATEMENT: Pcwstr = w("PolicyStatementExtension")

public val WSZ_INFSECTION_PROPERTIES: Pcwstr = w("Properties")

public val WSZ_INFSECTION_REQUESTATTRIBUTES: Pcwstr = w("RequestAttributes")

public val WSZ_INFVALUE_ENDORSEMENTKEY: Pcwstr = w("EndorsementKey")

public val WSZ_INFVALUE_REQUESTTYPE_CERT: Pcwstr = w("Cert")

public val WSZ_INFVALUE_REQUESTTYPE_CMC: Pcwstr = w("CMC")

public val WSZ_INFVALUE_REQUESTTYPE_PKCS10: Pcwstr = w("PKCS10")

public val WSZ_INFVALUE_REQUESTTYPE_PKCS7: Pcwstr = w("PKCS7")

public val WSZ_INFVALUE_REQUESTTYPE_SCEP: Pcwstr = w("SCEP")

public val WSZ_LDAPSESSIONOPTIONVALUE: Pcwstr = w("LDAPSessionOptionValue")

public val WSZ_LOCALIZEDTIMEPERIODUNITS: Pcwstr = w("LocalizedTimePeriodUnits")

public val WSZ_LOGFILENAMEEXT: Pcwstr = w(".log")

public val WSZ_LOGPATH: Pcwstr = w("CertLog")

public val WSZ_MACHINEKEYSET: Pcwstr = w("MachineKeyset")

public val WSZ_MICROSOFTCERTMODULE_PREFIX: Pcwstr = w("CertificateAuthority_MicrosoftDefault")

public val WSZ_NETSCAPEREVOCATIONTYPE: Pcwstr = w("Netscape")

public val WSZ_OCSPCAPROP_CACERTIFICATE: Pcwstr = w("CACertificate")

public val WSZ_OCSPCAPROP_CACONFIG: Pcwstr = w("CAConfig")

public val WSZ_OCSPCAPROP_CSPNAME: Pcwstr = w("CSPName")

public val WSZ_OCSPCAPROP_ERRORCODE: Pcwstr = w("ErrorCode")

public val WSZ_OCSPCAPROP_HASHALGORITHMID: Pcwstr = w("HashAlgorithmId")

public val WSZ_OCSPCAPROP_KEYSPEC: Pcwstr = w("KeySpec")

public val WSZ_OCSPCAPROP_LOCALREVOCATIONINFORMATION: Pcwstr = w("LocalRevocationInformation")

public val WSZ_OCSPCAPROP_PROVIDERCLSID: Pcwstr = w("ProviderCLSID")

public val WSZ_OCSPCAPROP_PROVIDERPROPERTIES: Pcwstr = w("Provider")

public val WSZ_OCSPCAPROP_REMINDERDURATION: Pcwstr = w("ReminderDuration")

public val WSZ_OCSPCAPROP_SIGNINGCERTIFICATE: Pcwstr = w("SigningCertificate")

public val WSZ_OCSPCAPROP_SIGNINGCERTIFICATETEMPLATE: Pcwstr = w("SigningCertificateTemplate")

public val WSZ_OCSPCAPROP_SIGNINGFLAGS: Pcwstr = w("SigningFlags")

public val WSZ_OCSPCOMMONPROP_MAXINCOMINGMESSAGESIZE: Pcwstr = w("MaxIncomingMessageSize")

public val WSZ_OCSPCOMMONPROP_MAXNUMOFREQUESTENTRIES: Pcwstr = w("MaxNumOfRequestEntries")

public val WSZ_OCSPCOMMONPROP_REQFLAGS: Pcwstr = w("RequestFlags")

public val WSZ_OCSPISAPIPROP_DEBUG: Pcwstr = w("ISAPIDebug")

public val WSZ_OCSPISAPIPROP_MAXAGE: Pcwstr = w("MaxAge")

public val WSZ_OCSPISAPIPROP_MAXNUMOFCACHEENTRIES: Pcwstr = w("MaxNumOfCacheEntries")

public val WSZ_OCSPISAPIPROP_NUMOFBACKENDCONNECTIONS: Pcwstr = w("NumOfBackendConnections")

public val WSZ_OCSPISAPIPROP_NUMOFTHREADS: Pcwstr = w("NumOfThreads")

public val WSZ_OCSPISAPIPROP_REFRESHRATE: Pcwstr = w("RefreshRate")

public val WSZ_OCSPISAPIPROP_VIRTUALROOTNAME: Pcwstr = w("VirtualRootName")

public val WSZ_OCSPPROP_ARRAYCONTROLLER: Pcwstr = w("ArrayController")

public val WSZ_OCSPPROP_ARRAYMEMBERS: Pcwstr = w("ArrayMembers")

public val WSZ_OCSPPROP_AUDITFILTER: Pcwstr = w("AuditFilter")

public val WSZ_OCSPPROP_DEBUG: Pcwstr = w("Debug")

public val WSZ_OCSPPROP_ENROLLPOLLINTERVAL: Pcwstr = w("EnrollPollInterval")

public val WSZ_OCSPPROP_LOGLEVEL: Pcwstr = w("LogLevel")

public val WSZ_OCSPREVPROP_BASECRL: Pcwstr = w("BaseCrl")

public val WSZ_OCSPREVPROP_BASECRLURLS: Pcwstr = w("BaseCrlUrls")

public val WSZ_OCSPREVPROP_CRLURLTIMEOUT: Pcwstr = w("CrlUrlTimeOut")

public val WSZ_OCSPREVPROP_DELTACRL: Pcwstr = w("DeltaCrl")

public val WSZ_OCSPREVPROP_DELTACRLURLS: Pcwstr = w("DeltaCrlUrls")

public val WSZ_OCSPREVPROP_ERRORCODE: Pcwstr = w("RevocationErrorCode")

public val WSZ_OCSPREVPROP_REFRESHTIMEOUT: Pcwstr = w("RefreshTimeOut")

public val WSZ_OCSPREVPROP_SERIALNUMBERSDIRS: Pcwstr = w("IssuedSerialNumbersDirectories")

public val WSZ_PERIODDAYS: Pcwstr = w("Days")

public val WSZ_PERIODHOURS: Pcwstr = w("Hours")

public val WSZ_PERIODMINUTES: Pcwstr = w("Minutes")

public val WSZ_PERIODMONTHS: Pcwstr = w("Months")

public val WSZ_PERIODSECONDS: Pcwstr = w("Seconds")

public val WSZ_PERIODWEEKS: Pcwstr = w("Weeks")

public val WSZ_PERIODYEARS: Pcwstr = w("Years")

public val WSZ_PFXFILENAMEEXT: Pcwstr = w(".p12")

public val WSZ_PROPATTESTATIONCHALLENGE: Pcwstr = w("AttestationChallenge")

public val WSZ_PROPATTRIBNAME: Pcwstr = w("AttributeName")

public val WSZ_PROPATTRIBREQUESTID: Pcwstr = w("AttributeRequestId")

public val WSZ_PROPATTRIBVALUE: Pcwstr = w("AttributeValue")

public val WSZ_PROPCALLERNAME: Pcwstr = w("CallerName")

public val WSZ_PROPCATYPE: Pcwstr = w("CAType")

public val WSZ_PROPCERTCLIENTMACHINE: Pcwstr = w("ccm")

public val WSZ_PROPCERTCOUNT: Pcwstr = w("CertCount")

public val WSZ_PROPCERTIFICATEENROLLMENTFLAGS: Pcwstr = w("EnrollmentFlags")

public val WSZ_PROPCERTIFICATEGENERALFLAGS: Pcwstr = w("GeneralFlags")

public val WSZ_PROPCERTIFICATEHASH: Pcwstr = w("CertificateHash")

public val WSZ_PROPCERTIFICATENOTAFTERDATE: Pcwstr = w("NotAfter")

public val WSZ_PROPCERTIFICATENOTBEFOREDATE: Pcwstr = w("NotBefore")

public val WSZ_PROPCERTIFICATEPRIVATEKEYFLAGS: Pcwstr = w("PrivatekeyFlags")

public val WSZ_PROPCERTIFICATEPUBLICKEYALGORITHM: Pcwstr = w("PublicKeyAlgorithm")

public val WSZ_PROPCERTIFICATEPUBLICKEYLENGTH: Pcwstr = w("PublicKeyLength")

public val WSZ_PROPCERTIFICATERAWPUBLICKEY: Pcwstr = w("RawPublicKey")

public val WSZ_PROPCERTIFICATERAWPUBLICKEYALGORITHMPARAMETERS: Pcwstr = w("RawPublicKeyAlgorithmParameters")

public val WSZ_PROPCERTIFICATERAWSMIMECAPABILITIES: Pcwstr = w("RawSMIMECapabilities")

public val WSZ_PROPCERTIFICATEREQUESTID: Pcwstr = w("RequestID")

public val WSZ_PROPCERTIFICATESERIALNUMBER: Pcwstr = w("SerialNumber")

public val WSZ_PROPCERTIFICATESUBJECTKEYIDENTIFIER: Pcwstr = w("SubjectKeyIdentifier")

public val WSZ_PROPCERTIFICATETEMPLATE: Pcwstr = w("CertificateTemplate")

public val WSZ_PROPCERTIFICATETYPE: Pcwstr = w("CertificateType")

public val WSZ_PROPCERTIFICATEUPN: Pcwstr = w("UPN")

public val WSZ_PROPCERTSTATE: Pcwstr = w("CertState")

public val WSZ_PROPCERTSUFFIX: Pcwstr = w("CertSuffix")

public val WSZ_PROPCERTTEMPLATE: Pcwstr = w("CertificateTemplate")

public val WSZ_PROPCERTTYPE: Pcwstr = w("CertType")

public val WSZ_PROPCERTUSAGE: Pcwstr = w("CertificateUsage")

public val WSZ_PROPCHALLENGE: Pcwstr = w("Challenge")

public val WSZ_PROPCLIENTBROWSERMACHINE: Pcwstr = w("cbm")

public val WSZ_PROPCLIENTDCDNS: Pcwstr = w("cdc")

public val WSZ_PROPCOMMONNAME: Pcwstr = w("CommonName")

public val WSZ_PROPCONFIGDN: Pcwstr = w("ConfigDN")

public val WSZ_PROPCOUNTRY: Pcwstr = w("Country")

public val WSZ_PROPCRITICALTAG: Pcwstr = w("{critical}")

public val WSZ_PROPCRLCOUNT: Pcwstr = w("CRLCount")

public val WSZ_PROPCRLEFFECTIVE: Pcwstr = w("CRLEffective")

public val WSZ_PROPCRLINDEX: Pcwstr = w("CRLIndex")

public val WSZ_PROPCRLLASTPUBLISHED: Pcwstr = w("CRLLastPublished")

public val WSZ_PROPCRLMINBASE: Pcwstr = w("CRLMinBase")

public val WSZ_PROPCRLNAMEID: Pcwstr = w("CRLNameId")

public val WSZ_PROPCRLNEXTPUBLISH: Pcwstr = w("CRLNextPublish")

public val WSZ_PROPCRLNEXTUPDATE: Pcwstr = w("CRLNextUpdate")

public val WSZ_PROPCRLNUMBER: Pcwstr = w("CRLNumber")

public val WSZ_PROPCRLPROPAGATIONCOMPLETE: Pcwstr = w("CRLPropagationComplete")

public val WSZ_PROPCRLPUBLISHATTEMPTS: Pcwstr = w("CRLPublishAttempts")

public val WSZ_PROPCRLPUBLISHERROR: Pcwstr = w("CRLPublishError")

public val WSZ_PROPCRLPUBLISHFLAGS: Pcwstr = w("CRLPublishFlags")

public val WSZ_PROPCRLPUBLISHSTATUSCODE: Pcwstr = w("CRLPublishStatusCode")

public val WSZ_PROPCRLRAWCRL: Pcwstr = w("CRLRawCRL")

public val WSZ_PROPCRLROWID: Pcwstr = w("CRLRowId")

public val WSZ_PROPCRLSTATE: Pcwstr = w("CRLState")

public val WSZ_PROPCRLSUFFIX: Pcwstr = w("CRLSuffix")

public val WSZ_PROPCRLTHISPUBLISH: Pcwstr = w("CRLThisPublish")

public val WSZ_PROPCRLTHISUPDATE: Pcwstr = w("CRLThisUpdate")

public val WSZ_PROPCROSSFOREST: Pcwstr = w("CrossForest")

public val WSZ_PROPDCNAME: Pcwstr = w("DCName")

public val WSZ_PROPDECIMALTAG: Pcwstr = w("{decimal}")

public val WSZ_PROPDELTACRLSDISABLED: Pcwstr = w("fDeltaCRLsDisabled")

public val WSZ_PROPDEVICESERIALNUMBER: Pcwstr = w("DeviceSerialNumber")

public val WSZ_PROPDISPOSITION: Pcwstr = w("Disposition")

public val WSZ_PROPDISPOSITIONDENY: Pcwstr = w("Deny")

public val WSZ_PROPDISPOSITIONPENDING: Pcwstr = w("Pending")

public val WSZ_PROPDISTINGUISHEDNAME: Pcwstr = w("DistinguishedName")

public val WSZ_PROPDN: Pcwstr = w("dn")

public val WSZ_PROPDNS: Pcwstr = w("dns")

public val WSZ_PROPDOMAINCOMPONENT: Pcwstr = w("DomainComponent")

public val WSZ_PROPDOMAINDN: Pcwstr = w("DomainDN")

public val WSZ_PROPEMAIL: Pcwstr = w("EMail")

public val WSZ_PROPENDORSEMENTCERTIFICATEHASH: Pcwstr = w("EndorsementCertificateHash")

public val WSZ_PROPENDORSEMENTKEYHASH: Pcwstr = w("EndorsementKeyHash")

public val WSZ_PROPEVENTLOGERROR: Pcwstr = w("EventLogError")

public val WSZ_PROPEVENTLOGEXHAUSTIVE: Pcwstr = w("EventLogExhaustive")

public val WSZ_PROPEVENTLOGTERSE: Pcwstr = w("EventLogTerse")

public val WSZ_PROPEVENTLOGVERBOSE: Pcwstr = w("EventLogVerbose")

public val WSZ_PROPEVENTLOGWARNING: Pcwstr = w("EventLogWarning")

public val WSZ_PROPEXITCERTFILE: Pcwstr = w("CertFile")

public val WSZ_PROPEXPECTEDCHALLENGE: Pcwstr = w("ExpectedChallenge")

public val WSZ_PROPEXPIRATIONDATE: Pcwstr = w("ExpirationDate")

public val WSZ_PROPEXTFLAGS: Pcwstr = w("ExtensionFlags")

public val WSZ_PROPEXTNAME: Pcwstr = w("ExtensionName")

public val WSZ_PROPEXTRAWVALUE: Pcwstr = w("ExtensionRawValue")

public val WSZ_PROPEXTREQUESTID: Pcwstr = w("ExtensionRequestId")

public val WSZ_PROPFILETAG: Pcwstr = w("{file}")

public val WSZ_PROPGIVENNAME: Pcwstr = w("GivenName")

public val WSZ_PROPGUID: Pcwstr = w("guid")

public val WSZ_PROPHEXTAG: Pcwstr = w("{hex}")

public val WSZ_PROPINITIALS: Pcwstr = w("Initials")

public val WSZ_PROPIPADDRESS: Pcwstr = w("ipaddress")

public val WSZ_PROPKEYARCHIVED: Pcwstr = w("KeyArchived")

public val WSZ_PROPLOCALITY: Pcwstr = w("Locality")

public val WSZ_PROPLOGLEVEL: Pcwstr = w("LogLevel")

public val WSZ_PROPMACHINEDNSNAME: Pcwstr = w("MachineDNSName")

public val WSZ_PROPMODULEREGLOC: Pcwstr = w("ModuleRegistryLocation")

public val WSZ_PROPNAMETYPE: Pcwstr = w("NameType")

public val WSZ_PROPOCTETTAG: Pcwstr = w("{octet}")

public val WSZ_PROPOFFICER: Pcwstr = w("Officer")

public val WSZ_PROPOID: Pcwstr = w("oid")

public val WSZ_PROPORGANIZATION: Pcwstr = w("Organization")

public val WSZ_PROPORGUNIT: Pcwstr = w("OrgUnit")

public val WSZ_PROPPUBLISHEXPIREDCERTINCRL: Pcwstr = w("PublishExpiredCertInCRL")

public val WSZ_PROPRAWCACERTIFICATE: Pcwstr = w("RawCACertificate")

public val WSZ_PROPRAWCERTIFICATE: Pcwstr = w("RawCertificate")

public val WSZ_PROPRAWCRL: Pcwstr = w("RawCRL")

public val WSZ_PROPRAWDELTACRL: Pcwstr = w("RawDeltaCRL")

public val WSZ_PROPRAWNAME: Pcwstr = w("RawName")

public val WSZ_PROPRAWPRECERTIFICATE: Pcwstr = w("RawPrecertificate")

public val WSZ_PROPREQUESTARCHIVEDKEY: Pcwstr = w("ArchivedKey")

public val WSZ_PROPREQUESTATTRIBUTES: Pcwstr = w("RequestAttributes")

public val WSZ_PROPREQUESTCSPPROVIDER: Pcwstr = w("RequestCSPProvider")

public val WSZ_PROPREQUESTDISPOSITION: Pcwstr = w("Disposition")

public val WSZ_PROPREQUESTDISPOSITIONMESSAGE: Pcwstr = w("DispositionMessage")

public val WSZ_PROPREQUESTDOT: Pcwstr = w("Request.")

public val WSZ_PROPREQUESTERCAACCESS: Pcwstr = w("RequesterCAAccess")

public val WSZ_PROPREQUESTERDN: Pcwstr = w("RequesterDN")

public val WSZ_PROPREQUESTERNAME: Pcwstr = w("RequesterName")

public val WSZ_PROPREQUESTERNAMEFROMOLDCERTIFICATE: Pcwstr = w("RequesterNameFromOldCertificate")

public val WSZ_PROPREQUESTERSAMNAME: Pcwstr = w("RequesterSAMName")

public val WSZ_PROPREQUESTERUPN: Pcwstr = w("RequesterUPN")

public val WSZ_PROPREQUESTFLAGS: Pcwstr = w("RequestFlags")

public val WSZ_PROPREQUESTKEYRECOVERYHASHES: Pcwstr = w("KeyRecoveryHashes")

public val WSZ_PROPREQUESTMACHINEDNS: Pcwstr = w("rmd")

public val WSZ_PROPREQUESTOSVERSION: Pcwstr = w("RequestOSVersion")

public val WSZ_PROPREQUESTRAWARCHIVEDKEY: Pcwstr = w("RawArchivedKey")

public val WSZ_PROPREQUESTRAWOLDCERTIFICATE: Pcwstr = w("RawOldCertificate")

public val WSZ_PROPREQUESTRAWREQUEST: Pcwstr = w("RawRequest")

public val WSZ_PROPREQUESTREQUESTID: Pcwstr = w("RequestID")

public val WSZ_PROPREQUESTRESOLVEDWHEN: Pcwstr = w("ResolvedWhen")

public val WSZ_PROPREQUESTREVOKEDEFFECTIVEWHEN: Pcwstr = w("RevokedEffectiveWhen")

public val WSZ_PROPREQUESTREVOKEDREASON: Pcwstr = w("RevokedReason")

public val WSZ_PROPREQUESTREVOKEDWHEN: Pcwstr = w("RevokedWhen")

public val WSZ_PROPREQUESTSTATUSCODE: Pcwstr = w("StatusCode")

public val WSZ_PROPREQUESTSUBMITTEDWHEN: Pcwstr = w("SubmittedWhen")

public val WSZ_PROPREQUESTTYPE: Pcwstr = w("RequestType")

public val WSZ_PROPSANITIZEDCANAME: Pcwstr = w("SanitizedCAName")

public val WSZ_PROPSANITIZEDSHORTNAME: Pcwstr = w("SanitizedShortName")

public val WSZ_PROPSEAUDITFILTER: Pcwstr = w("SEAuditFilter")

public val WSZ_PROPSEAUDITID: Pcwstr = w("SEAuditId")

public val WSZ_PROPSERVERUPGRADED: Pcwstr = w("fServerUpgraded")

public val WSZ_PROPSESSIONCOUNT: Pcwstr = w("SessionCount")

public val WSZ_PROPSIGNERAPPLICATIONPOLICIES: Pcwstr = w("SignerApplicationPolicies")

public val WSZ_PROPSIGNERPOLICIES: Pcwstr = w("SignerPolicies")

public val WSZ_PROPSTATE: Pcwstr = w("State")

public val WSZ_PROPSTREETADDRESS: Pcwstr = w("StreetAddress")

public val WSZ_PROPSUBJECTALTNAME2: Pcwstr = w("san")

public val WSZ_PROPSUBJECTDOT: Pcwstr = w("Subject.")

public val WSZ_PROPSURNAME: Pcwstr = w("SurName")

public val WSZ_PROPTEMPLATECHANGESEQUENCENUMBER: Pcwstr = w("TemplateChangeSequenceNumber")

public val WSZ_PROPTEXTTAG: Pcwstr = w("{text}")

public val WSZ_PROPTITLE: Pcwstr = w("Title")

public val WSZ_PROPUNSTRUCTUREDADDRESS: Pcwstr = w("UnstructuredAddress")

public val WSZ_PROPUNSTRUCTUREDNAME: Pcwstr = w("UnstructuredName")

public val WSZ_PROPUPN: Pcwstr = w("upn")

public val WSZ_PROPURL: Pcwstr = w("url")

public val WSZ_PROPUSEDS: Pcwstr = w("fUseDS")

public val WSZ_PROPUSERDN: Pcwstr = w("UserDN")

public val WSZ_PROPUTF8TAG: Pcwstr = w("{utf8}")

public val WSZ_PROPVALIDITYPERIODCOUNT: Pcwstr = w("ValidityPeriodUnits")

public val WSZ_PROPVALIDITYPERIODSTRING: Pcwstr = w("ValidityPeriod")

public val WSZ_PROPVOLATILEMODE: Pcwstr = w("VolatileMode")

public val WSZ_REGACTIVE: Pcwstr = w("Active")

public val WSZ_REGAELOGLEVEL_OLD: Pcwstr = w("AEEventLogLevel")

public val WSZ_REGAIKCLOUDCAURL: Pcwstr = w("AIKCloudCAURL")

public val WSZ_REGAIKKEYALGORITHM: Pcwstr = w("AIKKeyAlgorithm")

public val WSZ_REGAIKKEYLENGTH: Pcwstr = w("AIKKeyLength")

public val WSZ_REGALLPROVIDERS: Pcwstr = w("All")

public val WSZ_REGALTERNATEPUBLISHDOMAINS: Pcwstr = w("AlternatePublishDomains")

public val WSZ_REGALTERNATESIGNATUREALGORITHM: Pcwstr = w("AlternateSignatureAlgorithm")

public val WSZ_REGAUDITFILTER: Pcwstr = w("AuditFilter")

public val WSZ_REGB2ICERTMANAGEMODULE: Pcwstr = w("ICertManageModule")

public val WSZ_REGBACKUPLOGDIRECTORY: Pcwstr = w("BackupLogDirectory")

public val WSZ_REGCACERTFILENAME: Pcwstr = w("CACertFileName")

public val WSZ_REGCACERTHASH: Pcwstr = w("CACertHash")

public val WSZ_REGCACERTPUBLICATIONURLS: Pcwstr = w("CACertPublicationURLs")

public val WSZ_REGCADESCRIPTION: Pcwstr = w("CADescription")

public val WSZ_REGCAPATHLENGTH: Pcwstr = w("CAPathLength")

public val WSZ_REGCASECURITY: Pcwstr = w("Security")

public val WSZ_REGCASERIALNUMBER: Pcwstr = w("CACertSerialNumber")

public val WSZ_REGCASERVERNAME: Pcwstr = w("CAServerName")

public val WSZ_REGCATYPE: Pcwstr = w("CAType")

public val WSZ_REGCAUSEDS: Pcwstr = w("UseDS")

public val WSZ_REGCAXCHGCERTHASH: Pcwstr = w("CAXchgCertHash")

public val WSZ_REGCAXCHGOVERLAPPERIODCOUNT: Pcwstr = w("CAXchgOverlapPeriodUnits")

public val WSZ_REGCAXCHGOVERLAPPERIODSTRING: Pcwstr = w("CAXchgOverlapPeriod")

public val WSZ_REGCAXCHGVALIDITYPERIODCOUNT: Pcwstr = w("CAXchgValidityPeriodUnits")

public val WSZ_REGCAXCHGVALIDITYPERIODSTRING: Pcwstr = w("CAXchgValidityPeriod")

public val WSZ_REGCERTENROLLCOMPATIBLE: Pcwstr = w("CertEnrollCompatible")

public val WSZ_REGCERTIFICATETRANSPARENCYINFOOID: Pcwstr = w("CTInformationExtensionOid")

public val WSZ_REGCERTPUBLISHFLAGS: Pcwstr = w("PublishCertFlags")

public val WSZ_REGCERTSRVDEBUG: Pcwstr = w("Debug")

public val WSZ_REGCHECKPOINTFILE: Pcwstr = w("CheckPointFile")

public val WSZ_REGCLOCKSKEWMINUTES: Pcwstr = w("ClockSkewMinutes")

public val WSZ_REGCOMMONNAME: Pcwstr = w("CommonName")

public val WSZ_REGCRLATTEMPTREPUBLISH: Pcwstr = w("CRLAttemptRepublish")

public val WSZ_REGCRLDELTANEXTPUBLISH: Pcwstr = w("CRLDeltaNextPublish")

public val WSZ_REGCRLDELTAOVERLAPPERIODCOUNT: Pcwstr = w("CRLDeltaOverlapUnits")

public val WSZ_REGCRLDELTAOVERLAPPERIODSTRING: Pcwstr = w("CRLDeltaOverlapPeriod")

public val WSZ_REGCRLDELTAPERIODCOUNT: Pcwstr = w("CRLDeltaPeriodUnits")

public val WSZ_REGCRLDELTAPERIODSTRING: Pcwstr = w("CRLDeltaPeriod")

public val WSZ_REGCRLEDITFLAGS: Pcwstr = w("CRLEditFlags")

public val WSZ_REGCRLFLAGS: Pcwstr = w("CRLFlags")

public val WSZ_REGCRLNEXTPUBLISH: Pcwstr = w("CRLNextPublish")

public val WSZ_REGCRLOVERLAPPERIODCOUNT: Pcwstr = w("CRLOverlapUnits")

public val WSZ_REGCRLOVERLAPPERIODSTRING: Pcwstr = w("CRLOverlapPeriod")

public val WSZ_REGCRLPATH_OLD: Pcwstr = w("CRLPath")

public val WSZ_REGCRLPERIODCOUNT: Pcwstr = w("CRLPeriodUnits")

public val WSZ_REGCRLPERIODSTRING: Pcwstr = w("CRLPeriod")

public val WSZ_REGCRLPUBLICATIONURLS: Pcwstr = w("CRLPublicationURLs")

public val WSZ_REGDATABASERECOVERED: Pcwstr = w("DatabaseRecovered")

public val WSZ_REGDBDIRECTORY: Pcwstr = w("DBDirectory")

public val WSZ_REGDBFLAGS: Pcwstr = w("DBFlags")

public val WSZ_REGDBLASTFULLBACKUP: Pcwstr = w("DBLastFullBackup")

public val WSZ_REGDBLASTINCREMENTALBACKUP: Pcwstr = w("DBLastIncrementalBackup")

public val WSZ_REGDBLASTRECOVERY: Pcwstr = w("DBLastRecovery")

public val WSZ_REGDBLOGDIRECTORY: Pcwstr = w("DBLogDirectory")

public val WSZ_REGDBMAXREADSESSIONCOUNT: Pcwstr = w("DBMaxReadSessionCount")

public val WSZ_REGDBSESSIONCOUNT: Pcwstr = w("DBSessionCount")

public val WSZ_REGDBSYSDIRECTORY: Pcwstr = w("DBSystemDirectory")

public val WSZ_REGDBTEMPDIRECTORY: Pcwstr = w("DBTempDirectory")

public val WSZ_REGDEFAULTSMIME: Pcwstr = w("DefaultSMIME")

public val WSZ_REGDIRECTORY: Pcwstr = w("ConfigurationDirectory")

public val WSZ_REGDISABLEEXTENSIONLIST: Pcwstr = w("DisableExtensionList")

public val WSZ_REGDSCONFIGDN: Pcwstr = w("DSConfigDN")

public val WSZ_REGDSDOMAINDN: Pcwstr = w("DSDomainDN")

public val WSZ_REGEDITFLAGS: Pcwstr = w("EditFlags")

public val WSZ_REGEKPUBLISTDIRECTORIES: Pcwstr = w("EndorsementKeyListDirectories")

public val WSZ_REGEKUOIDSFORPUBLISHEXPIREDCERTINCRL: Pcwstr = w("EKUOIDsForPublishExpiredCertInCRL")

public val WSZ_REGEKUOIDSFORVOLATILEREQUESTS: Pcwstr = w("EKUOIDsforVolatileRequests")

public val WSZ_REGENABLED: Pcwstr = w("Enabled")

public val WSZ_REGENABLEDEKUFORDEFINEDCACERT: Pcwstr = w("EnabledEKUForDefinedCACert")

public val WSZ_REGENABLEENROLLEEREQUESTEXTENSIONLIST: Pcwstr = w("EnableEnrolleeRequestExtensionList")

public val WSZ_REGENABLEREQUESTEXTENSIONLIST: Pcwstr = w("EnableRequestExtensionList")

public val WSZ_REGENFORCEX500NAMELENGTHS: Pcwstr = w("EnforceX500NameLengths")

public val WSZ_REGENROLLFLAGS: Pcwstr = w("EnrollFlags")

public val WSZ_REGEXITBODYARG: Pcwstr = w("BodyArg")

public val WSZ_REGEXITBODYFORMAT: Pcwstr = w("BodyFormat")

public val WSZ_REGEXITCRLISSUEDKEY: Pcwstr = w("CRLIssued")

public val WSZ_REGEXITDENIEDKEY: Pcwstr = w("Denied")

public val WSZ_REGEXITIMPORTEDKEY: Pcwstr = w("Imported")

public val WSZ_REGEXITISSUEDKEY: Pcwstr = w("Issued")

public val WSZ_REGEXITPENDINGKEY: Pcwstr = w("Pending")

public val WSZ_REGEXITPROPNOTFOUND: Pcwstr = w("???")

public val WSZ_REGEXITREVOKEDKEY: Pcwstr = w("Revoked")

public val WSZ_REGEXITSHUTDOWNKEY: Pcwstr = w("Shutdown")

public val WSZ_REGEXITSMTPAUTHENTICATE: Pcwstr = w("SMTPAuthenticate")

public val WSZ_REGEXITSMTPCC: Pcwstr = w("Cc")

public val WSZ_REGEXITSMTPEVENTFILTER: Pcwstr = w("EventFilter")

public val WSZ_REGEXITSMTPFROM: Pcwstr = w("From")

public val WSZ_REGEXITSMTPKEY: Pcwstr = w("SMTP")

public val WSZ_REGEXITSMTPSERVER: Pcwstr = w("SMTPServer")

public val WSZ_REGEXITSMTPTEMPLATES: Pcwstr = w("Templates")

public val WSZ_REGEXITSMTPTO: Pcwstr = w("To")

public val WSZ_REGEXITSTARTUPKEY: Pcwstr = w("Startup")

public val WSZ_REGEXITTITLEARG: Pcwstr = w("TitleArg")

public val WSZ_REGEXITTITLEFORMAT: Pcwstr = w("TitleFormat")

public val WSZ_REGFILEISSUERCERTURL_OLD: Pcwstr = w("FileIssuerCertURL")

public val WSZ_REGFILEREVOCATIONCRLURL_OLD: Pcwstr = w("FileRevocationCRLURL")

public val WSZ_REGFORCETELETEX: Pcwstr = w("ForceTeletex")

public val WSZ_REGFTPISSUERCERTURL_OLD: Pcwstr = w("FTPIssuerCertURL")

public val WSZ_REGFTPREVOCATIONCRLURL_OLD: Pcwstr = w("FTPRevocationCRLURL")

public val WSZ_REGHIGHLOGNUMBER: Pcwstr = w("HighLogNumber")

public val WSZ_REGHIGHSERIAL: Pcwstr = w("HighSerial")

public val WSZ_REGINTERFACEFLAGS: Pcwstr = w("InterfaceFlags")

public val WSZ_REGISSUERCERTURLFLAGS: Pcwstr = w("IssuerCertURLFlags")

public val WSZ_REGISSUERCERTURL_OLD: Pcwstr = w("IssuerCertURL")

public val WSZ_REGKEYBASE: Pcwstr = w("SYSTEM\\CurrentControlSet\\Services\\CertSvc")

public val WSZ_REGKEYCERTSVCPATH: Pcwstr = w("SYSTEM\\CurrentControlSet\\Services\\CertSvc")

public val WSZ_REGKEYCONFIG: Pcwstr = w("Configuration")

public val WSZ_REGKEYCSP: Pcwstr = w("CSP")

public val WSZ_REGKEYDBPARAMETERS: Pcwstr = w("DBParameters")

public val WSZ_REGKEYENCRYPTIONCSP: Pcwstr = w("EncryptionCSP")

public val WSZ_REGKEYENROLLMENT: Pcwstr = w("Software\\Microsoft\\Cryptography\\AutoEnrollment")

public val WSZ_REGKEYEXITMODULES: Pcwstr = w("ExitModules")

public val WSZ_REGKEYGROUPPOLICYENROLLMENT: Pcwstr = w("Software\\Policies\\Microsoft\\Cryptography\\AutoEnrollment")

public val WSZ_REGKEYNOSYSTEMCERTSVCPATH: Pcwstr = w("CurrentControlSet\\Services\\CertSvc")

public val WSZ_REGKEYPOLICYMODULES: Pcwstr = w("PolicyModules")

public val WSZ_REGKEYREPAIR: Pcwstr = w("KeyRepair")

public val WSZ_REGKEYRESTOREINPROGRESS: Pcwstr = w("RestoreInProgress")

public val WSZ_REGKEYSIZE: Pcwstr = w("KeySize")

public val WSZ_REGKRACERTCOUNT: Pcwstr = w("KRACertCount")

public val WSZ_REGKRACERTHASH: Pcwstr = w("KRACertHash")

public val WSZ_REGKRAFLAGS: Pcwstr = w("KRAFlags")

public val WSZ_REGLDAPFLAGS: Pcwstr = w("LDAPFlags")

public val WSZ_REGLDAPISSUERCERTURL_OLD: Pcwstr = w("LDAPIssuerCertURL")

public val WSZ_REGLDAPREVOCATIONCRLURL_OLD: Pcwstr = w("LDAPRevocationCRLURL")

public val WSZ_REGLDAPREVOCATIONDNTEMPLATE_OLD: Pcwstr = w("LDAPRevocationDNTemplate")

public val WSZ_REGLDAPREVOCATIONDN_OLD: Pcwstr = w("LDAPRevocationDN")

public val WSZ_REGLDAPSESSIONOPTIONS: Pcwstr = w("LDAPSessionOptions")

public val WSZ_REGLOGLEVEL: Pcwstr = w("LogLevel")

public val WSZ_REGLOGPATH: Pcwstr = w("LogPath")

public val WSZ_REGLOWLOGNUMBER: Pcwstr = w("LowLogNumber")

public val WSZ_REGMAXINCOMINGALLOCSIZE: Pcwstr = w("MaxIncomingAllocSize")

public val WSZ_REGMAXINCOMINGMESSAGESIZE: Pcwstr = w("MaxIncomingMessageSize")

public val WSZ_REGMAXPENDINGREQUESTDAYS: Pcwstr = w("MaxPendingRequestDays")

public val WSZ_REGMAXSCTLISTSIZE: Pcwstr = w("MaxSCTListSize")

public val WSZ_REGNAMESEPARATOR: Pcwstr = w("SubjectNameSeparator")

public val WSZ_REGNETSCAPECERTTYPE: Pcwstr = w("NetscapeCertType")

public val WSZ_REGOFFICERRIGHTS: Pcwstr = w("OfficerRights")

public val WSZ_REGPARENTCAMACHINE: Pcwstr = w("ParentCAMachine")

public val WSZ_REGPARENTCANAME: Pcwstr = w("ParentCAName")

public val WSZ_REGPOLICYFLAGS: Pcwstr = w("PolicyFlags")

public val WSZ_REGPRESERVESCEPDUMMYCERTS: Pcwstr = w("PreserveSCEPDummyCerts")

public val WSZ_REGPROCESSINGFLAGS: Pcwstr = w("ProcessingFlags")

public val WSZ_REGPROVIDER: Pcwstr = w("Provider")

public val WSZ_REGPROVIDERTYPE: Pcwstr = w("ProviderType")

public val WSZ_REGREQUESTDISPOSITION: Pcwstr = w("RequestDisposition")

public val WSZ_REGREQUESTFILENAME: Pcwstr = w("RequestFileName")

public val WSZ_REGREQUESTID: Pcwstr = w("RequestId")

public val WSZ_REGREQUESTKEYCONTAINER: Pcwstr = w("RequestKeyContainer")

public val WSZ_REGREQUESTKEYINDEX: Pcwstr = w("RequestKeyIndex")

public val WSZ_REGRESTOREMAP: Pcwstr = w("RestoreMap")

public val WSZ_REGRESTOREMAPCOUNT: Pcwstr = w("RestoreMapCount")

public val WSZ_REGRESTORESTATUS: Pcwstr = w("RestoreStatus")

public val WSZ_REGREVOCATIONCRLURL_OLD: Pcwstr = w("RevocationCRLURL")

public val WSZ_REGREVOCATIONTYPE: Pcwstr = w("RevocationType")

public val WSZ_REGREVOCATIONURL: Pcwstr = w("RevocationURL")

public val WSZ_REGROLESEPARATIONENABLED: Pcwstr = w("RoleSeparationEnabled")

public val WSZ_REGSETUPSTATUS: Pcwstr = w("SetupStatus")

public val WSZ_REGSP4DEFAULTCONFIGURATION: Pcwstr = w("DefaultConfiguration")

public val WSZ_REGSP4KEYSETNAME: Pcwstr = w("KeySetName")

public val WSZ_REGSP4NAMES: Pcwstr = w("Names")

public val WSZ_REGSP4QUERIES: Pcwstr = w("Queries")

public val WSZ_REGSP4SUBJECTNAMESEPARATOR: Pcwstr = w("SubjectNameSeparator")

public val WSZ_REGSUBJECTALTNAME: Pcwstr = w("SubjectAltName")

public val WSZ_REGSUBJECTALTNAME2: Pcwstr = w("SubjectAltName2")

public val WSZ_REGSUBJECTTEMPLATE: Pcwstr = w("SubjectTemplate")

public val WSZ_REGSYMMETRICKEYSIZE: Pcwstr = w("SymmetricKeySize")

public val WSZ_REGUNICODE: Pcwstr = w("Unicode")

public val WSZ_REGUPNMAP: Pcwstr = w("UPNMap")

public val WSZ_REGUSEDEFINEDCACERTINREQ: Pcwstr = w("UseDefinedCACertInRequest")

public val WSZ_REGVALIDITYPERIODCOUNT: Pcwstr = w("ValidityPeriodUnits")

public val WSZ_REGVALIDITYPERIODSTRING: Pcwstr = w("ValidityPeriod")

public val WSZ_REGVERIFYFLAGS: Pcwstr = w("VerifyFlags")

public val WSZ_REGVERSION: Pcwstr = w("Version")

public val WSZ_REGVIEWAGEMINUTES: Pcwstr = w("ViewAgeMinutes")

public val WSZ_REGVIEWIDLEMINUTES: Pcwstr = w("ViewIdleMinutes")

public val WSZ_REGWEBCLIENTCAMACHINE: Pcwstr = w("WebClientCAMachine")

public val WSZ_REGWEBCLIENTCANAME: Pcwstr = w("WebClientCAName")

public val WSZ_REGWEBCLIENTCATYPE: Pcwstr = w("WebClientCAType")

public val WSZ_SECUREDATTRIBUTES: Pcwstr = w("SignedAttributes")

public val WSZ_SERVICE_NAME: Pcwstr = w("CertSvc")

public val WSZZ_DEFAULTSIGNEDATTRIBUTES: Pcwstr = w("RequesterName\u0000")
