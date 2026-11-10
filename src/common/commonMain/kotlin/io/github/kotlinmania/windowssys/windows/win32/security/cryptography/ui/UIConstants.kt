package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val ACTION_REVOCATION_DEFAULT_CACHE: UInt = 131072u

public val ACTION_REVOCATION_DEFAULT_ONLINE: UInt = 65536u

public val CERTVIEW_CRYPTUI_LPARAM: UInt = 8388608u

public val CERT_CERTIFICATE_ACTION_VERIFY: Guid = Guid.fromU128(U128(0x7801ebd0cf4b11d0uL, 0x851f0060979387eauL))

public val CERT_CREDENTIAL_PROVIDER_ID: Int = -509

public val CERT_DISPWELL_DISTRUST_ADD_CA_CERT: UInt = 8u

public val CERT_DISPWELL_DISTRUST_ADD_LEAF_CERT: UInt = 9u

public val CERT_DISPWELL_DISTRUST_CA_CERT: UInt = 6u

public val CERT_DISPWELL_DISTRUST_LEAF_CERT: UInt = 7u

public val CERT_DISPWELL_SELECT: UInt = 1u

public val CERT_DISPWELL_TRUST_ADD_CA_CERT: UInt = 4u

public val CERT_DISPWELL_TRUST_ADD_LEAF_CERT: UInt = 5u

public val CERT_DISPWELL_TRUST_CA_CERT: UInt = 2u

public val CERT_DISPWELL_TRUST_LEAF_CERT: UInt = 3u

public val CERT_FILTER_INCLUDE_V1_CERTS: UInt = 1u

public val CERT_FILTER_ISSUER_CERTS_ONLY: UInt = 16u

public val CERT_FILTER_KEY_EXISTS: UInt = 32u

public val CERT_FILTER_LEAF_CERTS_ONLY: UInt = 8u

public val CERT_FILTER_OP_EQUALITY: UInt = 3u

public val CERT_FILTER_OP_EXISTS: UInt = 1u

public val CERT_FILTER_OP_NOT_EXISTS: UInt = 2u

public val CERT_FILTER_VALID_SIGNATURE: UInt = 4u

public val CERT_FILTER_VALID_TIME_RANGE: UInt = 2u

public val CERT_TRUST_DO_FULL_SEARCH: UInt = 1u

public val CERT_TRUST_DO_FULL_TRUST: UInt = 5u

public val CERT_TRUST_MASK: UInt = 16777215u

public val CERT_TRUST_PERMIT_MISSING_CRLS: UInt = 2u

public val CERT_VALIDITY_AFTER_END: UInt = 2u

public val CERT_VALIDITY_BEFORE_START: UInt = 1u

public val CERT_VALIDITY_CERTIFICATE_REVOKED: UInt = 8u

public val CERT_VALIDITY_CRL_OUT_OF_DATE: UInt = 1073741824u

public val CERT_VALIDITY_EXPLICITLY_DISTRUSTED: UInt = 16777216u

public val CERT_VALIDITY_EXTENDED_USAGE_FAILURE: UInt = 32u

public val CERT_VALIDITY_ISSUER_DISTRUST: UInt = 33554432u

public val CERT_VALIDITY_ISSUER_INVALID: UInt = 256u

public val CERT_VALIDITY_KEY_USAGE_EXT_FAILURE: UInt = 16u

public val CERT_VALIDITY_MASK_TRUST: UInt = 4294901760u

public val CERT_VALIDITY_MASK_VALIDITY: UInt = 65535u

public val CERT_VALIDITY_NAME_CONSTRAINTS_FAILURE: UInt = 64u

public val CERT_VALIDITY_NO_CRL_FOUND: UInt = 536870912u

public val CERT_VALIDITY_NO_ISSUER_CERT_FOUND: UInt = 268435456u

public val CERT_VALIDITY_NO_TRUST_DATA: UInt = 2147483648u

public val CERT_VALIDITY_OTHER_ERROR: UInt = 2048u

public val CERT_VALIDITY_OTHER_EXTENSION_FAILURE: UInt = 512u

public val CERT_VALIDITY_PERIOD_NESTING_FAILURE: UInt = 1024u

public val CERT_VALIDITY_SIGNATURE_FAILS: UInt = 4u

public val CERT_VALIDITY_UNKNOWN_CRITICAL_EXTENSION: UInt = 128u

public val CM_ADD_CERT_STORES: CertViewpropertiesStructFlags = 512u

public val CM_ENABLEHOOK: CertViewpropertiesStructFlags = 1u

public val CM_ENABLETEMPLATE: CertViewpropertiesStructFlags = 8u

public val CM_HIDE_ADVANCEPAGE: CertViewpropertiesStructFlags = 16u

public val CM_HIDE_DETAILPAGE: CertViewpropertiesStructFlags = 256u

public val CM_HIDE_TRUSTPAGE: CertViewpropertiesStructFlags = 32u

public val CM_NO_EDITTRUST: CertViewpropertiesStructFlags = 128u

public val CM_NO_NAMECHANGE: CertViewpropertiesStructFlags = 64u

public val CM_SHOW_HELP: CertViewpropertiesStructFlags = 2u

public val CM_SHOW_HELPICON: CertViewpropertiesStructFlags = 4u

public val CM_VIEWFLAGS_MASK: UInt = 16777215u

public val CRYPTDLG_ACTION_MASK: UInt = 4294901760u

public val CRYPTDLG_CACHE_ONLY_URL_RETRIEVAL: UInt = 268435456u

public val CRYPTDLG_DISABLE_AIA: UInt = 134217728u

public val CRYPTDLG_POLICY_MASK: UInt = 65535u

public val CRYPTDLG_REVOCATION_CACHE: UInt = 1073741824u

public val CRYPTDLG_REVOCATION_DEFAULT: UInt = 0u

public val CRYPTDLG_REVOCATION_NONE: UInt = 536870912u

public val CRYPTDLG_REVOCATION_ONLINE: UInt = 2147483648u

public val CRYPTUI_ACCEPT_DECLINE_STYLE: CryptuiViewcertificateFlags = 64u

public val CRYPTUI_CACHE_ONLY_URL_RETRIEVAL: CryptuiViewcertificateFlags = 262144u

public val CRYPTUI_CERT_MGR_PUBLISHER_TAB: UInt = 4u

public val CRYPTUI_CERT_MGR_SINGLE_TAB_FLAG: UInt = 32768u

public val CRYPTUI_CERT_MGR_TAB_MASK: UInt = 15u

public val CRYPTUI_DISABLE_ADDTOSTORE: CryptuiViewcertificateFlags = 16u

public val CRYPTUI_DISABLE_EDITPROPERTIES: CryptuiViewcertificateFlags = 4u

public val CRYPTUI_DISABLE_EXPORT: CryptuiViewcertificateFlags = 8192u

public val CRYPTUI_DISABLE_HTMLLINK: CryptuiViewcertificateFlags = 65536u

public val CRYPTUI_DISABLE_ISSUERSTATEMENT: CryptuiViewcertificateFlags = 131072u

public val CRYPTUI_DONT_OPEN_STORES: CryptuiViewcertificateFlags = 256u

public val CRYPTUI_ENABLE_ADDTOSTORE: CryptuiViewcertificateFlags = 32u

public val CRYPTUI_ENABLE_EDITPROPERTIES: CryptuiViewcertificateFlags = 8u

public val CRYPTUI_ENABLE_REVOCATION_CHECKING: CryptuiViewcertificateFlags = 2048u

public val CRYPTUI_ENABLE_REVOCATION_CHECK_CHAIN: CryptuiViewcertificateFlags = 32768u

public val CRYPTUI_ENABLE_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT: CryptuiViewcertificateFlags = 2048u

public val CRYPTUI_ENABLE_REVOCATION_CHECK_END_CERT: CryptuiViewcertificateFlags = 16384u

public val CRYPTUI_HIDE_DETAILPAGE: CryptuiViewcertificateFlags = 2u

public val CRYPTUI_HIDE_HIERARCHYPAGE: CryptuiViewcertificateFlags = 1u

public val CRYPTUI_IGNORE_UNTRUSTED_ROOT: CryptuiViewcertificateFlags = 128u

public val CRYPTUI_ONLY_OPEN_ROOT_STORE: CryptuiViewcertificateFlags = 512u

public val CRYPTUI_SELECT_EXPIRATION_COLUMN: ULong = 32uL

public val CRYPTUI_SELECT_FRIENDLYNAME_COLUMN: ULong = 8uL

public val CRYPTUI_SELECT_INTENDEDUSE_COLUMN: ULong = 4uL

public val CRYPTUI_SELECT_ISSUEDBY_COLUMN: ULong = 2uL

public val CRYPTUI_SELECT_ISSUEDTO_COLUMN: ULong = 1uL

public val CRYPTUI_SELECT_LOCATION_COLUMN: ULong = 16uL

public val CRYPTUI_WARN_REMOTE_TRUST: CryptuiViewcertificateFlags = 4096u

public val CRYPTUI_WARN_UNTRUSTED_ROOT: CryptuiViewcertificateFlags = 1024u

public val CRYPTUI_WIZ_DIGITAL_SIGN_ADD_CHAIN: CryptuiWizDigitalAdditionalCertChoice = 1u

public val CRYPTUI_WIZ_DIGITAL_SIGN_ADD_CHAIN_NO_ROOT: CryptuiWizDigitalAdditionalCertChoice = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_ADD_NONE: CryptuiWizDigitalAdditionalCertChoice = 0u

public val CRYPTUI_WIZ_DIGITAL_SIGN_CERT: CryptuiWizDigitalSign = 1u

public val CRYPTUI_WIZ_DIGITAL_SIGN_COMMERCIAL: CryptuiWizDigitalSignSigType = 1u

public val CRYPTUI_WIZ_DIGITAL_SIGN_EXCLUDE_PAGE_HASHES: UInt = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_INCLUDE_PAGE_HASHES: UInt = 4u

public val CRYPTUI_WIZ_DIGITAL_SIGN_INDIVIDUAL: CryptuiWizDigitalSignSigType = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_NONE: CryptuiWizDigitalSign = 0u

public val CRYPTUI_WIZ_DIGITAL_SIGN_PVK: CryptuiWizDigitalSign = 3u

public val CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE: CryptuiWizDigitalSignPvkOption = 1u

public val CRYPTUI_WIZ_DIGITAL_SIGN_PVK_PROV: CryptuiWizDigitalSignPvkOption = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_STORE: CryptuiWizDigitalSign = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_BLOB: CryptuiWizDigitalSignSubject = 2u

public val CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_FILE: CryptuiWizDigitalSignSubject = 1u

public val CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_NONE: CryptuiWizDigitalSignSubject = 0u

public val CRYPTUI_WIZ_EXPORT_CERT_CONTEXT: CryptuiWizExportSubject = 1u

public val CRYPTUI_WIZ_EXPORT_CERT_STORE: CryptuiWizExportSubject = 4u

public val CRYPTUI_WIZ_EXPORT_CERT_STORE_CERTIFICATES_ONLY: CryptuiWizExportSubject = 5u

public val CRYPTUI_WIZ_EXPORT_CRL_CONTEXT: CryptuiWizExportSubject = 3u

public val CRYPTUI_WIZ_EXPORT_CTL_CONTEXT: CryptuiWizExportSubject = 2u

public val CRYPTUI_WIZ_EXPORT_FORMAT_BASE64: CryptuiWizExportFormat = 4u

public val CRYPTUI_WIZ_EXPORT_FORMAT_CRL: CryptuiWizExportFormat = 6u

public val CRYPTUI_WIZ_EXPORT_FORMAT_CTL: CryptuiWizExportFormat = 7u

public val CRYPTUI_WIZ_EXPORT_FORMAT_DER: CryptuiWizExportFormat = 1u

public val CRYPTUI_WIZ_EXPORT_FORMAT_PFX: CryptuiWizExportFormat = 2u

public val CRYPTUI_WIZ_EXPORT_FORMAT_PKCS7: CryptuiWizExportFormat = 3u

public val CRYPTUI_WIZ_EXPORT_FORMAT_SERIALIZED_CERT_STORE: UInt = 5u

public val CRYPTUI_WIZ_EXPORT_NO_DELETE_PRIVATE_KEY: CryptuiWizFlags = 512u

public val CRYPTUI_WIZ_EXPORT_PRIVATE_KEY: CryptuiWizFlags = 256u

public val CRYPTUI_WIZ_IGNORE_NO_UI_FLAG_FOR_CSPS: CryptuiWizFlags = 2u

public val CRYPTUI_WIZ_IMPORT_ALLOW_CERT: CryptuiWizFlags = 131072u

public val CRYPTUI_WIZ_IMPORT_ALLOW_CRL: CryptuiWizFlags = 262144u

public val CRYPTUI_WIZ_IMPORT_ALLOW_CTL: CryptuiWizFlags = 524288u

public val CRYPTUI_WIZ_IMPORT_NO_CHANGE_DEST_STORE: CryptuiWizFlags = 65536u

public val CRYPTUI_WIZ_IMPORT_REMOTE_DEST_STORE: CryptuiWizFlags = 4194304u

public val CRYPTUI_WIZ_IMPORT_SUBJECT_CERT_CONTEXT: CryptuiWizImportSubjectOption = 2u

public val CRYPTUI_WIZ_IMPORT_SUBJECT_CERT_STORE: CryptuiWizImportSubjectOption = 5u

public val CRYPTUI_WIZ_IMPORT_SUBJECT_CRL_CONTEXT: CryptuiWizImportSubjectOption = 4u

public val CRYPTUI_WIZ_IMPORT_SUBJECT_CTL_CONTEXT: CryptuiWizImportSubjectOption = 3u

public val CRYPTUI_WIZ_IMPORT_SUBJECT_FILE: CryptuiWizImportSubjectOption = 1u

public val CRYPTUI_WIZ_IMPORT_TO_CURRENTUSER: CryptuiWizFlags = 2097152u

public val CRYPTUI_WIZ_IMPORT_TO_LOCALMACHINE: CryptuiWizFlags = 1048576u

public val CRYPTUI_WIZ_NO_UI: CryptuiWizFlags = 1u

public val CRYPTUI_WIZ_NO_UI_EXCEPT_CSP: CryptuiWizFlags = 3u

public val CRYTPDLG_FLAGS_MASK: UInt = 4278190080u

public val CSS_ALLOWMULTISELECT: CertSelectStructFlags = 4u

public val CSS_ENABLEHOOK: CertSelectStructFlags = 2u

public val CSS_ENABLETEMPLATE: CertSelectStructFlags = 32u

public val CSS_ENABLETEMPLATEHANDLE: CertSelectStructFlags = 64u

public val CSS_HIDE_PROPERTIES: CertSelectStructFlags = 1u

public val CSS_SELECTCERT_MASK: UInt = 16777215u

public val CSS_SHOW_HELP: CertSelectStructFlags = 16u

public val CTL_MODIFY_REQUEST_ADD_NOT_TRUSTED: CtlModifyRequestOperation = 1u

public val CTL_MODIFY_REQUEST_ADD_TRUSTED: CtlModifyRequestOperation = 3u

public val CTL_MODIFY_REQUEST_REMOVE: CtlModifyRequestOperation = 2u

public val POLICY_IGNORE_NON_CRITICAL_BC: UInt = 1u

public val SELCERT_ALGORITHM: UInt = 105u

public val SELCERT_CERTLIST: UInt = 102u

public val SELCERT_FINEPRINT: UInt = 101u

public val SELCERT_ISSUED_TO: UInt = 103u

public val SELCERT_PROPERTIES: UInt = 100u

public val SELCERT_SERIAL_NUM: UInt = 106u

public val SELCERT_THUMBPRINT: UInt = 107u

public val SELCERT_VALIDITY: UInt = 104u

public val SZ_CERT_CERTIFICATE_ACTION_VERIFY: Pcstr = s("{7801ebd0-cf4b-11d0-851f-0060979387ea}")
