package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_KEY_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

public data class CERT_FILTER_DATA(
    public var dwSize: UInt = 0u,
    public var cExtensionChecks: UInt = 0u,
    public var arrayExtensionChecks: Long = 0L,
    public var dwCheckingFlags: UInt = 0u,
)

public data class CERT_FILTER_EXTENSION_MATCH(
    public var szExtensionOID: PCSTR = 0L,
    public var dwTestOperation: UInt = 0u,
    public var pbTestData: Long = 0L,
    public var cbTestData: UInt = 0u,
)

public data class CERT_SELECTUI_INPUT(
    public var hStore: HCERTSTORE = 0L,
    public var prgpChain: Long = 0L,
    public var cChain: UInt = 0u,
)

public class CERT_SELECT_STRUCT_A(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var pTemplateName: PCSTR = 0L,
    public var dwFlags: CERT_SELECT_STRUCT_FLAGS = 0u,
    public var szTitle: PCSTR = 0L,
    public var cCertStore: UInt = 0u,
    public var arrayCertStore: Long = 0L,
    public var szPurposeOid: PCSTR = 0L,
    public var cCertContext: UInt = 0u,
    public var arrayCertContext: Long = 0L,
    public var lCustData: LPARAM = 0L,
    public var pfnHook: PFNCMHOOKPROC = null,
    public var pfnFilter: PFNCMFILTERPROC = null,
    public var szHelpFileName: PCSTR = 0L,
    public var dwHelpId: UInt = 0u,
    public var hprov: ULong = 0uL,
)

public class CERT_SELECT_STRUCT_W(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var pTemplateName: PCWSTR = 0L,
    public var dwFlags: CERT_SELECT_STRUCT_FLAGS = 0u,
    public var szTitle: PCWSTR = 0L,
    public var cCertStore: UInt = 0u,
    public var arrayCertStore: Long = 0L,
    public var szPurposeOid: PCSTR = 0L,
    public var cCertContext: UInt = 0u,
    public var arrayCertContext: Long = 0L,
    public var lCustData: LPARAM = 0L,
    public var pfnHook: PFNCMHOOKPROC = null,
    public var pfnFilter: PFNCMFILTERPROC = null,
    public var szHelpFileName: PCWSTR = 0L,
    public var dwHelpId: UInt = 0u,
    public var hprov: ULong = 0uL,
)

public class CERT_VERIFY_CERTIFICATE_TRUST(
    public var cbSize: UInt = 0u,
    public var pccert: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var dwIgnoreErr: UInt = 0u,
    public var pdwErrors: Long = 0L,
    public var pszUsageOid: PSTR = 0L,
    public var hprov: ULong = 0uL,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Long = 0L,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Long = 0L,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Long = 0L,
    public var lCustData: LPARAM = 0L,
    public var pfnTrustHelper: PFNTRUSTHELPER = null,
    public var pcChain: Long = 0L,
    public var prgChain: Long = 0L,
    public var prgdwErrors: Long = 0L,
    public var prgpbTrustInfo: Long = 0L,
)

public class CERT_VIEWPROPERTIES_STRUCT_A(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var dwFlags: CERT_VIEWPROPERTIES_STRUCT_FLAGS = 0u,
    public var szTitle: PCSTR = 0L,
    public var pCertContext: Long = 0L,
    public var arrayPurposes: Long = 0L,
    public var cArrayPurposes: UInt = 0u,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Long = 0L,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Long = 0L,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Long = 0L,
    public var hprov: ULong = 0uL,
    public var lCustData: LPARAM = 0L,
    public var dwPad: UInt = 0u,
    public var szHelpFileName: PCSTR = 0L,
    public var dwHelpId: UInt = 0u,
    public var nStartPage: UInt = 0u,
    public var cArrayPropSheetPages: UInt = 0u,
    public var arrayPropSheetPages: Long = 0L,
)

public class CERT_VIEWPROPERTIES_STRUCT_W(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var dwFlags: CERT_VIEWPROPERTIES_STRUCT_FLAGS = 0u,
    public var szTitle: PCWSTR = 0L,
    public var pCertContext: Long = 0L,
    public var arrayPurposes: Long = 0L,
    public var cArrayPurposes: UInt = 0u,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Long = 0L,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Long = 0L,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Long = 0L,
    public var hprov: ULong = 0uL,
    public var lCustData: LPARAM = 0L,
    public var dwPad: UInt = 0u,
    public var szHelpFileName: PCWSTR = 0L,
    public var dwHelpId: UInt = 0u,
    public var nStartPage: UInt = 0u,
    public var cArrayPropSheetPages: UInt = 0u,
    public var arrayPropSheetPages: Long = 0L,
)

public data class CRYPTUI_CERT_MGR_STRUCT(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var pwszTitle: PCWSTR = 0L,
    public var pszInitUsageOID: PCSTR = 0L,
)

public data class CRYPTUI_INITDIALOG_STRUCT(public var lParam: LPARAM = 0L, public var pCertContext: Long = 0L)

public class CRYPTUI_VIEWCERTIFICATE_STRUCTA(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var dwFlags: CRYPTUI_VIEWCERTIFICATE_FLAGS = 0u,
    public var szTitle: PCSTR = 0L,
    public var pCertContext: Long = 0L,
    public var rgszPurposes: Long = 0L,
    public var cPurposes: UInt = 0u,
    public var Anonymous: CRYPTUI_VIEWCERTIFICATE_STRUCTA_0 = CRYPTUI_VIEWCERTIFICATE_STRUCTA_0(),
    public var fpCryptProviderDataTrustedUsage: BOOL = 0,
    public var idxSigner: UInt = 0u,
    public var idxCert: UInt = 0u,
    public var fCounterSigner: BOOL = 0,
    public var idxCounterSigner: UInt = 0u,
    public var cStores: UInt = 0u,
    public var rghStores: Long = 0L,
    public var cPropSheetPages: UInt = 0u,
    public var rgPropSheetPages: Long = 0L,
    public var nStartPage: UInt = 0u,
)

public data class CRYPTUI_VIEWCERTIFICATE_STRUCTA_0(public var pCryptProviderData: Long = 0L, public var hWVTStateData: HANDLE = 0L)

public class CRYPTUI_VIEWCERTIFICATE_STRUCTW(
    public var dwSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var dwFlags: CRYPTUI_VIEWCERTIFICATE_FLAGS = 0u,
    public var szTitle: PCWSTR = 0L,
    public var pCertContext: Long = 0L,
    public var rgszPurposes: Long = 0L,
    public var cPurposes: UInt = 0u,
    public var Anonymous: CRYPTUI_VIEWCERTIFICATE_STRUCTW_0 = CRYPTUI_VIEWCERTIFICATE_STRUCTW_0(),
    public var fpCryptProviderDataTrustedUsage: BOOL = 0,
    public var idxSigner: UInt = 0u,
    public var idxCert: UInt = 0u,
    public var fCounterSigner: BOOL = 0,
    public var idxCounterSigner: UInt = 0u,
    public var cStores: UInt = 0u,
    public var rghStores: Long = 0L,
    public var cPropSheetPages: UInt = 0u,
    public var rgPropSheetPages: Long = 0L,
    public var nStartPage: UInt = 0u,
)

public data class CRYPTUI_VIEWCERTIFICATE_STRUCTW_0(public var pCryptProviderData: Long = 0L, public var hWVTStateData: HANDLE = 0L)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO(
    public var dwSize: UInt = 0u,
    public var pGuidSubject: Long = 0L,
    public var cbBlob: UInt = 0u,
    public var pbBlob: Long = 0L,
    public var pwszDisplayName: PCWSTR = 0L,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO(
    public var dwSize: UInt = 0u,
    public var pwszSigningCertFileName: PWSTR = 0L,
    public var dwPvkChoice: CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION = 0u,
    public var Anonymous: CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0 = CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0(),
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0(public var pPvkFileInfo: Long = 0L, public var pPvkProvInfo: Long = 0L)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT(
    public var dwSize: UInt = 0u,
    public var cbBlob: UInt = 0u,
    public var pbBlob: Long = 0L,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO(
    public var dwSize: UInt = 0u,
    public var dwAttrFlags: CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE = 0u,
    public var pwszDescription: PCWSTR = 0L,
    public var pwszMoreInfoLocation: PCWSTR = 0L,
    public var pszHashAlg: PCSTR = 0L,
    public var pwszSigningCertDisplayString: PCWSTR = 0L,
    public var hAdditionalCertStore: HCERTSTORE = 0L,
    public var psAuthenticated: Long = 0L,
    public var psUnauthenticated: Long = 0L,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_INFO(
    public var dwSize: UInt = 0u,
    public var dwSubjectChoice: CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT = 0u,
    public var Anonymous1: CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0 = CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0(),
    public var dwSigningCertChoice: CRYPTUI_WIZ_DIGITAL_SIGN = 0u,
    public var Anonymous2: CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1 = CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1(),
    public var pwszTimestampURL: PCWSTR = 0L,
    public var dwAdditionalCertChoice: CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE = 0u,
    public var pSignExtInfo: Long = 0L,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0(public var pwszFileName: PCWSTR = 0L, public var pSignBlobInfo: Long = 0L)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1(
    public var pSigningCertContext: Long = 0L,
    public var pSigningCertStore: Long = 0L,
    public var pSigningCertPvkInfo: Long = 0L,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO(
    public var dwSize: UInt = 0u,
    public var pwszPvkFileName: PWSTR = 0L,
    public var pwszProvName: PWSTR = 0L,
    public var dwProvType: UInt = 0u,
)

public data class CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO(
    public var dwSize: UInt = 0u,
    public var cCertStore: UInt = 0u,
    public var rghCertStore: Long = 0L,
    public var pFilterCallback: PFNCFILTERPROC = null,
    public var pvCallbackData: Long = 0L,
)

public data class CRYPTUI_WIZ_EXPORT_CERTCONTEXT_INFO(
    public var dwSize: UInt = 0u,
    public var dwExportFormat: CRYPTUI_WIZ_EXPORT_FORMAT = 0u,
    public var fExportChain: BOOL = 0,
    public var fExportPrivateKeys: BOOL = 0,
    public var pwszPassword: PCWSTR = 0L,
    public var fStrongEncryption: BOOL = 0,
)

public data class CRYPTUI_WIZ_EXPORT_INFO(
    public var dwSize: UInt = 0u,
    public var pwszExportFileName: PCWSTR = 0L,
    public var dwSubjectChoice: CRYPTUI_WIZ_EXPORT_SUBJECT = 0u,
    public var Anonymous: CRYPTUI_WIZ_EXPORT_INFO_0 = CRYPTUI_WIZ_EXPORT_INFO_0(),
    public var cStores: UInt = 0u,
    public var rghStores: Long = 0L,
)

public data class CRYPTUI_WIZ_EXPORT_INFO_0(
    public var pCertContext: Long = 0L,
    public var pCTLContext: Long = 0L,
    public var pCRLContext: Long = 0L,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class CRYPTUI_WIZ_IMPORT_SRC_INFO(
    public var dwSize: UInt = 0u,
    public var dwSubjectChoice: CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION = 0u,
    public var Anonymous: CRYPTUI_WIZ_IMPORT_SRC_INFO_0 = CRYPTUI_WIZ_IMPORT_SRC_INFO_0(),
    public var dwFlags: CRYPT_KEY_FLAGS = 0u,
    public var pwszPassword: PCWSTR = 0L,
)

public data class CRYPTUI_WIZ_IMPORT_SRC_INFO_0(
    public var pwszFileName: PCWSTR = 0L,
    public var pCertContext: Long = 0L,
    public var pCTLContext: Long = 0L,
    public var pCRLContext: Long = 0L,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class CTL_MODIFY_REQUEST(
    public var pccert: Long = 0L,
    public var dwOperation: CTL_MODIFY_REQUEST_OPERATION = 0u,
    public var dwError: UInt = 0u,
)
