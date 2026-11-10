package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CAT_MEMBERINFO2_OBJID: Pcstr = s("1.3.6.1.4.1.311.12.2.3")

public val CAT_MEMBERINFO2_STRUCT: Pcstr = COpaquePointer(2223.toLong())

public val CAT_MEMBERINFO_OBJID: Pcstr = s("1.3.6.1.4.1.311.12.2.2")

public val CAT_MEMBERINFO_STRUCT: Pcstr = COpaquePointer(2222.toLong())

public val CAT_NAMEVALUE_OBJID: Pcstr = s("1.3.6.1.4.1.311.12.2.1")

public val CAT_NAMEVALUE_STRUCT: Pcstr = COpaquePointer(2221.toLong())

public val CCPI_RESULT_ALLOW: UInt = 1u

public val CCPI_RESULT_AUDIT: UInt = 3u

public val CCPI_RESULT_DENY: UInt = 2u

public val CERT_CONFIDENCE_AUTHIDEXT: UInt = 65536u

public val CERT_CONFIDENCE_HIGHEST: UInt = 286330880u

public val CERT_CONFIDENCE_HYGIENE: UInt = 4096u

public val CERT_CONFIDENCE_SIG: UInt = 268435456u

public val CERT_CONFIDENCE_TIME: UInt = 16777216u

public val CERT_CONFIDENCE_TIMENEST: UInt = 1048576u

public val CONFIG_CI_ACTION_VERIFY: Guid = Guid.fromU128(U128(0x6078065b8f224b13uL, 0xbd9b5b762776f386uL))

public val CPD_CHOICE_SIP: UInt = 1u

public val CPD_RETURN_LOWER_QUALITY_CHAINS: UInt = 1048576u

public val CPD_REVOCATION_CHECK_CHAIN: UInt = 262144u

public val CPD_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT: UInt = 524288u

public val CPD_REVOCATION_CHECK_END_CERT: UInt = 131072u

public val CPD_REVOCATION_CHECK_NONE: UInt = 65536u

public val CPD_RFC3161V21: UInt = 2097152u

public val CPD_UISTATE_MODE_ALLOW: UInt = 2u

public val CPD_UISTATE_MODE_BLOCK: UInt = 1u

public val CPD_UISTATE_MODE_MASK: UInt = 3u

public val CPD_UISTATE_MODE_PROMPT: UInt = 0u

public val CPD_USE_NT5_CHAIN_FLAG: UInt = 2147483648u

public val DRIVER_ACTION_VERIFY: Guid = Guid.fromU128(U128(0xf750e6c338ee11d1uL, 0x85e500c04fc295eeuL))

public val DRIVER_CLEANUPPOLICY_FUNCTION: Pcwstr = w("DriverCleanupPolicy")

public val DRIVER_FINALPOLPROV_FUNCTION: Pcwstr = w("DriverFinalPolicy")

public val DRIVER_INITPROV_FUNCTION: Pcwstr = w("DriverInitializePolicy")

public val DWACTION_ALLOCANDFILL: WintrustGetDefaultForUsageAction = 1u

public val DWACTION_FREE: WintrustGetDefaultForUsageAction = 2u

public val GENERIC_CHAIN_CERTTRUST_FUNCTION: Pcwstr = w("GenericChainCertificateTrust")

public val GENERIC_CHAIN_FINALPOLICY_FUNCTION: Pcwstr = w("GenericChainFinalProv")

public val HTTPSPROV_ACTION: Guid = Guid.fromU128(U128(0x573e31f8aaba11d0uL, 0x8ccb00c04fc295eeuL))

public val HTTPS_CERTTRUST_FUNCTION: Pcwstr = w("HTTPSCertificateTrust")

public val HTTPS_CHKCERT_FUNCTION: Pcwstr = w("HTTPSCheckCertProv")

public val HTTPS_FINALPOLICY_FUNCTION: Pcwstr = w("HTTPSFinalProv")

public val INTENT_TO_SEAL_ATTRIBUTE_STRUCT: Pcstr = COpaquePointer(2010.toLong())

public val OFFICESIGN_ACTION_VERIFY: Guid = Guid.fromU128(U128(0x5555c2cd17fb11d1uL, 0x85c400c04fc295eeuL))

public val OFFICE_CLEANUPPOLICY_FUNCTION: Pcwstr = w("OfficeCleanupPolicy")

public val OFFICE_INITPROV_FUNCTION: Pcwstr = w("OfficeInitializePolicy")

public val OFFICE_POLICY_PROVIDER_DLL_NAME: Pcwstr = w("WINTRUST.DLL")

public val SEALING_SIGNATURE_ATTRIBUTE_STRUCT: Pcstr = COpaquePointer(2011.toLong())

public val SEALING_TIMESTAMP_ATTRIBUTE_STRUCT: Pcstr = COpaquePointer(2012.toLong())

public val SGNR_TYPE_TIMESTAMP: UInt = 16u

public val SPC_CAB_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.25")

public val SPC_CAB_DATA_STRUCT: Pcstr = COpaquePointer(2008.toLong())

public val SPC_CERT_EXTENSIONS_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.14")

public val SPC_COMMERCIAL_SP_KEY_PURPOSE_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.22")

public val SPC_COMMON_NAME_OBJID: Pcwstr = w("2.5.4.3")

public val SPC_ENCRYPTED_DIGEST_RETRY_COUNT_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.6.2")

public val SPC_FILE_LINK_CHOICE: UInt = 3u

public val SPC_FINANCIAL_CRITERIA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.27")

public val SPC_FINANCIAL_CRITERIA_STRUCT: Pcstr = COpaquePointer(2002.toLong())

public val SPC_GLUE_RDN_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.25")

public val SPC_INDIRECT_DATA_CONTENT_STRUCT: Pcstr = COpaquePointer(2003.toLong())

public val SPC_INDIRECT_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.4")

public val SPC_INDIVIDUAL_SP_KEY_PURPOSE_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.21")

public val SPC_JAVA_CLASS_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.20")

public val SPC_JAVA_CLASS_DATA_STRUCT: Pcstr = COpaquePointer(2009.toLong())

public val SPC_LINK_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.28")

public val SPC_LINK_STRUCT: Pcstr = COpaquePointer(2005.toLong())

public val SPC_MINIMAL_CRITERIA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.26")

public val SPC_MINIMAL_CRITERIA_STRUCT: Pcstr = COpaquePointer(2001.toLong())

public val SPC_MONIKER_LINK_CHOICE: UInt = 2u

public val SPC_NATURAL_AUTH_PLUGIN_OBJID: Pcstr = s("1.3.6.1.4.1.311.96.1.1")

public val SPC_PE_IMAGE_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.15")

public val SPC_PE_IMAGE_DATA_STRUCT: Pcstr = COpaquePointer(2004.toLong())

public val SPC_PE_IMAGE_PAGE_HASHES_V1_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.3.1")

public val SPC_PE_IMAGE_PAGE_HASHES_V2_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.3.2")

public val SPC_RAW_FILE_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.18")

public val SPC_RELAXED_PE_MARKER_CHECK_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.6.1")

public val SPC_SIGINFO_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.30")

public val SPC_SIGINFO_STRUCT: Pcstr = COpaquePointer(2130.toLong())

public val SPC_SP_AGENCY_INFO_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.10")

public val SPC_SP_AGENCY_INFO_STRUCT: Pcstr = COpaquePointer(2000.toLong())

public val SPC_SP_OPUS_INFO_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.12")

public val SPC_SP_OPUS_INFO_STRUCT: Pcstr = COpaquePointer(2007.toLong())

public val SPC_STATEMENT_TYPE_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.11")

public val SPC_STATEMENT_TYPE_STRUCT: Pcstr = COpaquePointer(2006.toLong())

public val SPC_STRUCTURED_STORAGE_DATA_OBJID: Pcstr = s("1.3.6.1.4.1.311.2.1.19")

public val SPC_TIME_STAMP_REQUEST_OBJID: Pcstr = s("1.3.6.1.4.1.311.3.2.1")

public val SPC_URL_LINK_CHOICE: UInt = 1u

public val SPC_UUID_LENGTH: UInt = 16u

public val SPC_WINDOWS_HELLO_COMPATIBILITY_OBJID: Pcstr = s("1.3.6.1.4.1.311.10.41.1")

public val SP_CHKCERT_FUNCTION: Pcwstr = w("SoftpubCheckCert")

public val SP_CLEANUPPOLICY_FUNCTION: Pcwstr = w("SoftpubCleanup")

public val SP_FINALPOLICY_FUNCTION: Pcwstr = w("SoftpubAuthenticode")

public val SP_GENERIC_CERT_INIT_FUNCTION: Pcwstr = w("SoftpubDefCertInit")

public val SP_INIT_FUNCTION: Pcwstr = w("SoftpubInitialize")

public val SP_OBJTRUST_FUNCTION: Pcwstr = w("SoftpubLoadMessage")

public val SP_POLICY_PROVIDER_DLL_NAME: Pcwstr = w("WINTRUST.DLL")

public val SP_SIGTRUST_FUNCTION: Pcwstr = w("SoftpubLoadSignature")

public val SP_TESTDUMPPOLICY_FUNCTION_TEST: Pcwstr = w("SoftpubDumpStructure")

public val TRUSTERROR_MAX_STEPS: UInt = 38u

public val TRUSTERROR_STEP_CATALOGFILE: UInt = 6u

public val TRUSTERROR_STEP_CERTSTORE: UInt = 7u

public val TRUSTERROR_STEP_FILEIO: UInt = 2u

public val TRUSTERROR_STEP_FINAL_CERTCHKPROV: UInt = 35u

public val TRUSTERROR_STEP_FINAL_CERTPROV: UInt = 34u

public val TRUSTERROR_STEP_FINAL_INITPROV: UInt = 31u

public val TRUSTERROR_STEP_FINAL_OBJPROV: UInt = 32u

public val TRUSTERROR_STEP_FINAL_POLICYPROV: UInt = 36u

public val TRUSTERROR_STEP_FINAL_SIGPROV: UInt = 33u

public val TRUSTERROR_STEP_FINAL_UIPROV: UInt = 37u

public val TRUSTERROR_STEP_FINAL_WVTINIT: UInt = 30u

public val TRUSTERROR_STEP_MESSAGE: UInt = 8u

public val TRUSTERROR_STEP_MSG_CERTCHAIN: UInt = 15u

public val TRUSTERROR_STEP_MSG_COUNTERSIGCERT: UInt = 17u

public val TRUSTERROR_STEP_MSG_COUNTERSIGINFO: UInt = 16u

public val TRUSTERROR_STEP_MSG_INNERCNT: UInt = 11u

public val TRUSTERROR_STEP_MSG_INNERCNTTYPE: UInt = 10u

public val TRUSTERROR_STEP_MSG_SIGNERCERT: UInt = 14u

public val TRUSTERROR_STEP_MSG_SIGNERCOUNT: UInt = 9u

public val TRUSTERROR_STEP_MSG_SIGNERINFO: UInt = 13u

public val TRUSTERROR_STEP_MSG_STORE: UInt = 12u

public val TRUSTERROR_STEP_SIP: UInt = 3u

public val TRUSTERROR_STEP_SIPSUBJINFO: UInt = 5u

public val TRUSTERROR_STEP_VERIFY_MSGHASH: UInt = 18u

public val TRUSTERROR_STEP_VERIFY_MSGINDIRECTDATA: UInt = 19u

public val TRUSTERROR_STEP_WVTPARAMS: UInt = 0u

public val WINTRUST_ACTION_GENERIC_CERT_VERIFY: Guid = Guid.fromU128(U128(0x189a3842304111d1uL, 0x85e100c04fc295eeuL))

public val WINTRUST_ACTION_GENERIC_CHAIN_VERIFY: Guid = Guid.fromU128(U128(0xfc451c16ac7511d1uL, 0xb4b800c04fb66ea0uL))

public val WINTRUST_ACTION_GENERIC_VERIFY_V2: Guid = Guid.fromU128(U128(0xaac56bcd4411d0uL, 0x8cc200c04fc295eeuL))

public val WINTRUST_ACTION_TRUSTPROVIDER_TEST: Guid = Guid.fromU128(U128(0x573e31f8ddba11d0uL, 0x8ccb00c04fc295eeuL))

public val WINTRUST_CONFIG_REGPATH: Pcwstr = w("Software\\Microsoft\\Cryptography\\Wintrust\\Config")

public val WINTRUST_MAX_HASH_BYTES_TO_MAP_DEFAULT: UInt = 1048576u

public val WINTRUST_MAX_HASH_BYTES_TO_MAP_VALUE_NAME: Pcwstr = w("MaxHashBytesToMap")

public val WINTRUST_MAX_HEADER_BYTES_TO_MAP_DEFAULT: UInt = 10485760u

public val WINTRUST_MAX_HEADER_BYTES_TO_MAP_VALUE_NAME: Pcwstr = w("MaxHeaderBytesToMap")

public val WIN_CERT_REVISION_1_0: UInt = 256u

public val WIN_CERT_REVISION_2_0: UInt = 512u

public val WIN_CERT_TYPE_PKCS_SIGNED_DATA: UInt = 2u

public val WIN_CERT_TYPE_RESERVED_1: UInt = 3u

public val WIN_CERT_TYPE_TS_STACK_SIGNED: UInt = 4u

public val WIN_CERT_TYPE_X509: UInt = 1u

public val WIN_SPUB_ACTION_NT_ACTIVATE_IMAGE: Guid = Guid.fromU128(U128(0x8bc96b008da111cfuL, 0x873600aa00a485ebuL))

public val WIN_SPUB_ACTION_PUBLISHED_SOFTWARE: Guid = Guid.fromU128(U128(0x64b9d1808da211cfuL, 0x873600aa00a485ebuL))

public val WIN_SPUB_ACTION_TRUSTED_PUBLISHER: Guid = Guid.fromU128(U128(0x664267308da111cfuL, 0x873600aa00a485ebuL))

public val WIN_TRUST_SUBJTYPE_CABINET: Guid = Guid.fromU128(U128(0xd17c5374a39211cfuL, 0x9df500aa00c184e0uL))

public val WIN_TRUST_SUBJTYPE_CABINETEX: Guid = Guid.fromU128(U128(0x6f458114c2f111cfuL, 0x8a6900aa006c3706uL))

public val WIN_TRUST_SUBJTYPE_JAVA_CLASS: Guid = Guid.fromU128(U128(0x8ad39908da111cfuL, 0x873600aa00a485ebuL))

public val WIN_TRUST_SUBJTYPE_JAVA_CLASSEX: Guid = Guid.fromU128(U128(0x6f458113c2f111cfuL, 0x8a6900aa006c3706uL))

public val WIN_TRUST_SUBJTYPE_OLE_STORAGE: Guid = Guid.fromU128(U128(0xc257e7408da011cfuL, 0x873600aa00a485ebuL))

public val WIN_TRUST_SUBJTYPE_PE_IMAGE: Guid = Guid.fromU128(U128(0x43c9a1e08da011cfuL, 0x873600aa00a485ebuL))

public val WIN_TRUST_SUBJTYPE_PE_IMAGEEX: Guid = Guid.fromU128(U128(0x6f458111c2f111cfuL, 0x8a6900aa006c3706uL))

public val WIN_TRUST_SUBJTYPE_RAW_FILE: Guid = Guid.fromU128(U128(0x959dc4508d9e11cfuL, 0x873600aa00a485ebuL))

public val WIN_TRUST_SUBJTYPE_RAW_FILEEX: Guid = Guid.fromU128(U128(0x6f458110c2f111cfuL, 0x8a6900aa006c3706uL))

public val WSS_CERTTRUST_SUPPORT: UInt = 4u

public val WSS_GET_SECONDARY_SIG_COUNT: WintrustSignatureSettingsFlags = 2u

public val WSS_INPUT_FLAG_MASK: UInt = 7u

public val WSS_OBJTRUST_SUPPORT: UInt = 1u

public val WSS_OUTPUT_FLAG_MASK: UInt = 3758096384u

public val WSS_OUT_FILE_SUPPORTS_SEAL: UInt = 536870912u

public val WSS_OUT_HAS_SEALING_INTENT: UInt = 1073741824u

public val WSS_OUT_SEALING_STATUS_VERIFIED: UInt = 2147483648u

public val WSS_SIGTRUST_SUPPORT: UInt = 2u

public val WSS_VERIFY_SEALING: UInt = 4u

public val WSS_VERIFY_SPECIFIC: WintrustSignatureSettingsFlags = 1u

public val WTCI_DONT_OPEN_STORES: UInt = 1u

public val WTCI_OPEN_ONLY_ROOT: UInt = 2u

public val WTCI_USE_LOCAL_MACHINE: UInt = 4u

public val WTD_CACHE_ONLY_URL_RETRIEVAL: WintrustDataProviderFlags = 4096u

public val WTD_CHOICE_BLOB: WintrustDataUnionChoice = 3u

public val WTD_CHOICE_CATALOG: WintrustDataUnionChoice = 2u

public val WTD_CHOICE_CERT: WintrustDataUnionChoice = 5u

public val WTD_CHOICE_FILE: WintrustDataUnionChoice = 1u

public val WTD_CHOICE_SIGNER: WintrustDataUnionChoice = 4u

public val WTD_CODE_INTEGRITY_DRIVER_MODE: UInt = 32768u

public val WTD_DISABLE_MD2_MD4: WintrustDataProviderFlags = 8192u

public val WTD_HASH_ONLY_FLAG: WintrustDataProviderFlags = 512u

public val WTD_LIFETIME_SIGNING_FLAG: WintrustDataProviderFlags = 2048u

public val WTD_MOTW: WintrustDataProviderFlags = 16384u

public val WTD_NO_IE4_CHAIN_FLAG: WintrustDataProviderFlags = 2u

public val WTD_NO_POLICY_USAGE_FLAG: WintrustDataProviderFlags = 4u

public val WTD_PROV_FLAGS_MASK: UInt = 65535u

public val WTD_REVOCATION_CHECK_CHAIN: WintrustDataProviderFlags = 64u

public val WTD_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT: WintrustDataProviderFlags = 128u

public val WTD_REVOCATION_CHECK_END_CERT: WintrustDataProviderFlags = 32u

public val WTD_REVOCATION_CHECK_NONE: WintrustDataProviderFlags = 16u

public val WTD_REVOKE_NONE: WintrustDataRevocationChecks = 0u

public val WTD_REVOKE_WHOLECHAIN: WintrustDataRevocationChecks = 1u

public val WTD_SAFER_FLAG: WintrustDataProviderFlags = 256u

public val WTD_STATEACTION_AUTO_CACHE: WintrustDataStateAction = 3u

public val WTD_STATEACTION_AUTO_CACHE_FLUSH: WintrustDataStateAction = 4u

public val WTD_STATEACTION_CLOSE: WintrustDataStateAction = 2u

public val WTD_STATEACTION_IGNORE: WintrustDataStateAction = 0u

public val WTD_STATEACTION_VERIFY: WintrustDataStateAction = 1u

public val WTD_UICONTEXT_EXECUTE: WintrustDataUicontext = 0u

public val WTD_UICONTEXT_INSTALL: WintrustDataUicontext = 1u

public val WTD_UI_ALL: WintrustDataUichoice = 1u

public val WTD_UI_NOBAD: WintrustDataUichoice = 3u

public val WTD_UI_NOGOOD: WintrustDataUichoice = 4u

public val WTD_UI_NONE: WintrustDataUichoice = 2u

public val WTD_USE_DEFAULT_OSVER_CHECK: WintrustDataProviderFlags = 1024u

public val WTD_USE_IE4_TRUST_FLAG: WintrustDataProviderFlags = 1u

public val WTPF_ALLOWONLYPERTRUST: WintrustPolicyFlags = 262144u

public val WTPF_IGNOREEXPIRATION: WintrustPolicyFlags = 256u

public val WTPF_IGNOREREVOCATIONONTS: WintrustPolicyFlags = 131072u

public val WTPF_IGNOREREVOKATION: WintrustPolicyFlags = 512u

public val WTPF_OFFLINEOKNBU_COM: WintrustPolicyFlags = 8192u

public val WTPF_OFFLINEOKNBU_IND: WintrustPolicyFlags = 4096u

public val WTPF_OFFLINEOK_COM: WintrustPolicyFlags = 2048u

public val WTPF_OFFLINEOK_IND: WintrustPolicyFlags = 1024u

public val WTPF_TESTCANBEVALID: WintrustPolicyFlags = 128u

public val WTPF_TRUSTTEST: WintrustPolicyFlags = 32u

public val WTPF_VERIFY_V1_OFF: WintrustPolicyFlags = 65536u

public val WT_ADD_ACTION_ID_RET_RESULT_FLAG: UInt = 1u

public val WT_CURRENT_VERSION: UInt = 512u

public val WT_PROVIDER_CERTTRUST_FUNCTION: Pcwstr = w("WintrustCertificateTrust")

public val WT_PROVIDER_DLL_NAME: Pcwstr = w("WINTRUST.DLL")

public val WT_TRUSTDBDIALOG_NO_UI_FLAG: UInt = 1u

public val WT_TRUSTDBDIALOG_ONLY_PUB_TAB_FLAG: UInt = 2u

public val WT_TRUSTDBDIALOG_WRITE_IEAK_STORE_FLAG: UInt = 512u

public val WT_TRUSTDBDIALOG_WRITE_LEGACY_REG_FLAG: UInt = 256u

public val SZ_OID_ENHANCED_HASH: Pcstr = s("1.3.6.1.4.1.311.2.5.1")

public val SZ_OID_INTENT_TO_SEAL: Pcstr = s("1.3.6.1.4.1.311.2.4.2")

public val SZ_OID_NESTED_SIGNATURE: Pcstr = s("1.3.6.1.4.1.311.2.4.1")

public val SZ_OID_PKCS_9_SEQUENCE_NUMBER: Pcstr = s("1.2.840.113549.1.9.25.4")

public val SZ_OID_SEALING_SIGNATURE: Pcstr = s("1.3.6.1.4.1.311.2.4.3")

public val SZ_OID_SEALING_TIMESTAMP: Pcstr = s("1.3.6.1.4.1.311.2.4.4")

public val SZ_OID_TRUSTED_CLIENT_AUTH_CA_LIST: Pcstr = s("1.3.6.1.4.1.311.2.2.2")

public val SZ_OID_TRUSTED_CODESIGNING_CA_LIST: Pcstr = s("1.3.6.1.4.1.311.2.2.1")

public val SZ_OID_TRUSTED_SERVER_AUTH_CA_LIST: Pcstr = s("1.3.6.1.4.1.311.2.2.3")
