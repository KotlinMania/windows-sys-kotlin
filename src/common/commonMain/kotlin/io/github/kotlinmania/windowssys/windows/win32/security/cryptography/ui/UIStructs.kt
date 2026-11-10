package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CrlContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptKeyFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptKeyProvInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CtlContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.CryptProviderData
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Propsheetpagea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Propsheetpagew

public data class CertFilterData(
    public var dwSize: UInt = 0u,
    public var cExtensionChecks: UInt = 0u,
    public var arrayExtensionChecks: CertFilterExtensionMatch? = null,
    public var dwCheckingFlags: UInt = 0u,
)

public data class CertFilterExtensionMatch(
    public var szExtensionOID: Pcstr = null,
    public var dwTestOperation: UInt = 0u,
    public var pbTestData: COpaquePointer? = null,
    public var cbTestData: UInt = 0u,
)

public data class CertSelectuiInput(
    public var hStore: Hcertstore = null,
    public var prgpChain: COpaquePointer? = null,
    public var cChain: UInt = 0u,
)

public class CertSelectStructA(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var pTemplateName: Pcstr = null,
    public var dwFlags: CertSelectStructFlags = 0u,
    public var szTitle: Pcstr = null,
    public var cCertStore: UInt = 0u,
    public var arrayCertStore: Hcertstore? = null,
    public var szPurposeOid: Pcstr = null,
    public var cCertContext: UInt = 0u,
    public var arrayCertContext: COpaquePointer? = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Pfncmhookproc = null,
    public var pfnFilter: Pfncmfilterproc = null,
    public var szHelpFileName: Pcstr = null,
    public var dwHelpId: UInt = 0u,
    public var hprov: Int = 0,
)

public class CertSelectStructW(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var pTemplateName: Pcwstr = null,
    public var dwFlags: CertSelectStructFlags = 0u,
    public var szTitle: Pcwstr = null,
    public var cCertStore: UInt = 0u,
    public var arrayCertStore: Hcertstore? = null,
    public var szPurposeOid: Pcstr = null,
    public var cCertContext: UInt = 0u,
    public var arrayCertContext: COpaquePointer? = null,
    public var lCustData: Lparam = 0L,
    public var pfnHook: Pfncmhookproc = null,
    public var pfnFilter: Pfncmfilterproc = null,
    public var szHelpFileName: Pcwstr = null,
    public var dwHelpId: UInt = 0u,
    public var hprov: Int = 0,
)

public class CertVerifyCertificateTrust(
    public var cbSize: UInt = 0u,
    public var pccert: CertContext? = null,
    public var dwFlags: UInt = 0u,
    public var dwIgnoreErr: UInt = 0u,
    public var pdwErrors: UInt? = null,
    public var pszUsageOid: Pstr = null,
    public var hprov: Int = 0,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Hcertstore? = null,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Hcertstore? = null,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Hcertstore? = null,
    public var lCustData: Lparam = 0L,
    public var pfnTrustHelper: Pfntrusthelper = null,
    public var pcChain: UInt? = null,
    public var prgChain: COpaquePointer? = null,
    public var prgdwErrors: COpaquePointer? = null,
    public var prgpbTrustInfo: COpaquePointer? = null,
)

public class CertViewpropertiesStructA(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var dwFlags: CertViewpropertiesStructFlags = 0u,
    public var szTitle: Pcstr = null,
    public var pCertContext: CertContext? = null,
    public var arrayPurposes: Pstr? = null,
    public var cArrayPurposes: UInt = 0u,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Hcertstore? = null,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Hcertstore? = null,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Hcertstore? = null,
    public var hprov: Int = 0,
    public var lCustData: Lparam = 0L,
    public var dwPad: UInt = 0u,
    public var szHelpFileName: Pcstr = null,
    public var dwHelpId: UInt = 0u,
    public var nStartPage: UInt = 0u,
    public var cArrayPropSheetPages: UInt = 0u,
    public var arrayPropSheetPages: Propsheetpagea? = null,
)

public class CertViewpropertiesStructW(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var dwFlags: CertViewpropertiesStructFlags = 0u,
    public var szTitle: Pcwstr = null,
    public var pCertContext: CertContext? = null,
    public var arrayPurposes: Pstr? = null,
    public var cArrayPurposes: UInt = 0u,
    public var cRootStores: UInt = 0u,
    public var rghstoreRoots: Hcertstore? = null,
    public var cStores: UInt = 0u,
    public var rghstoreCAs: Hcertstore? = null,
    public var cTrustStores: UInt = 0u,
    public var rghstoreTrust: Hcertstore? = null,
    public var hprov: Int = 0,
    public var lCustData: Lparam = 0L,
    public var dwPad: UInt = 0u,
    public var szHelpFileName: Pcwstr = null,
    public var dwHelpId: UInt = 0u,
    public var nStartPage: UInt = 0u,
    public var cArrayPropSheetPages: UInt = 0u,
    public var arrayPropSheetPages: Propsheetpagea? = null,
)

public data class CryptuiCertMgrStruct(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var pwszTitle: Pcwstr = null,
    public var pszInitUsageOID: Pcstr = null,
)

public data class CryptuiInitdialogStruct(
    public var lParam: Lparam = 0L,
    public var pCertContext: CertContext? = null,
)

public class CryptuiViewcertificateStructa(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var dwFlags: CryptuiViewcertificateFlags = 0u,
    public var szTitle: Pcstr = null,
    public var pCertContext: CertContext? = null,
    public var rgszPurposes: Pcstr? = null,
    public var cPurposes: UInt = 0u,
    public var anonymous: CryptuiViewcertificateStructa0 = CryptuiViewcertificateStructa0(),
    public var fpCryptProviderDataTrustedUsage: Bool = 0,
    public var idxSigner: UInt = 0u,
    public var idxCert: UInt = 0u,
    public var fCounterSigner: Bool = 0,
    public var idxCounterSigner: UInt = 0u,
    public var cStores: UInt = 0u,
    public var rghStores: Hcertstore? = null,
    public var cPropSheetPages: UInt = 0u,
    public var rgPropSheetPages: Propsheetpagea? = null,
    public var nStartPage: UInt = 0u,
)

public data class CryptuiViewcertificateStructa0(
    public var pCryptProviderData: CryptProviderData? = null,
    public var hWVTStateData: Handle = null,
)

public class CryptuiViewcertificateStructw(
    public var dwSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var dwFlags: CryptuiViewcertificateFlags = 0u,
    public var szTitle: Pcwstr = null,
    public var pCertContext: CertContext? = null,
    public var rgszPurposes: Pcstr? = null,
    public var cPurposes: UInt = 0u,
    public var anonymous: CryptuiViewcertificateStructw0 = CryptuiViewcertificateStructw0(),
    public var fpCryptProviderDataTrustedUsage: Bool = 0,
    public var idxSigner: UInt = 0u,
    public var idxCert: UInt = 0u,
    public var fCounterSigner: Bool = 0,
    public var idxCounterSigner: UInt = 0u,
    public var cStores: UInt = 0u,
    public var rghStores: Hcertstore? = null,
    public var cPropSheetPages: UInt = 0u,
    public var rgPropSheetPages: Propsheetpagew? = null,
    public var nStartPage: UInt = 0u,
)

public data class CryptuiViewcertificateStructw0(
    public var pCryptProviderData: CryptProviderData? = null,
    public var hWVTStateData: Handle = null,
)

public data class CryptuiWizDigitalSignBlobInfo(
    public var dwSize: UInt = 0u,
    public var pGuidSubject: Guid? = null,
    public var cbBlob: UInt = 0u,
    public var pbBlob: COpaquePointer? = null,
    public var pwszDisplayName: Pcwstr = null,
)

public data class CryptuiWizDigitalSignCertPvkInfo(
    public var dwSize: UInt = 0u,
    public var pwszSigningCertFileName: Pwstr = null,
    public var dwPvkChoice: CryptuiWizDigitalSignPvkOption = 0u,
    public var anonymous: CryptuiWizDigitalSignCertPvkInfo0 = CryptuiWizDigitalSignCertPvkInfo0(),
)

public data class CryptuiWizDigitalSignCertPvkInfo0(
    public var pPvkFileInfo: CryptuiWizDigitalSignPvkFileInfo? = null,
    public var pPvkProvInfo: CryptKeyProvInfo? = null,
)

public data class CryptuiWizDigitalSignContext(
    public var dwSize: UInt = 0u,
    public var cbBlob: UInt = 0u,
    public var pbBlob: COpaquePointer? = null,
)

public data class CryptuiWizDigitalSignExtendedInfo(
    public var dwSize: UInt = 0u,
    public var dwAttrFlags: CryptuiWizDigitalSignSigType = 0u,
    public var pwszDescription: Pcwstr = null,
    public var pwszMoreInfoLocation: Pcwstr = null,
    public var pszHashAlg: Pcstr = null,
    public var pwszSigningCertDisplayString: Pcwstr = null,
    public var hAdditionalCertStore: Hcertstore = null,
    public var psAuthenticated: CryptAttributes? = null,
    public var psUnauthenticated: CryptAttributes? = null,
)

public data class CryptuiWizDigitalSignInfo(
    public var dwSize: UInt = 0u,
    public var dwSubjectChoice: CryptuiWizDigitalSignSubject = 0u,
    public var anonymous1: CryptuiWizDigitalSignInfo0 = CryptuiWizDigitalSignInfo0(),
    public var dwSigningCertChoice: CryptuiWizDigitalSign = 0u,
    public var anonymous2: CryptuiWizDigitalSignInfo1 = CryptuiWizDigitalSignInfo1(),
    public var pwszTimestampURL: Pcwstr = null,
    public var dwAdditionalCertChoice: CryptuiWizDigitalAdditionalCertChoice = 0u,
    public var pSignExtInfo: CryptuiWizDigitalSignExtendedInfo? = null,
)

public data class CryptuiWizDigitalSignInfo0(
    public var pwszFileName: Pcwstr = null,
    public var pSignBlobInfo: CryptuiWizDigitalSignBlobInfo? = null,
)

public data class CryptuiWizDigitalSignInfo1(
    public var pSigningCertContext: CertContext? = null,
    public var pSigningCertStore: CryptuiWizDigitalSignStoreInfo? = null,
    public var pSigningCertPvkInfo: CryptuiWizDigitalSignCertPvkInfo? = null,
)

public data class CryptuiWizDigitalSignPvkFileInfo(
    public var dwSize: UInt = 0u,
    public var pwszPvkFileName: Pwstr = null,
    public var pwszProvName: Pwstr = null,
    public var dwProvType: UInt = 0u,
)

public data class CryptuiWizDigitalSignStoreInfo(
    public var dwSize: UInt = 0u,
    public var cCertStore: UInt = 0u,
    public var rghCertStore: Hcertstore? = null,
    public var pFilterCallback: Pfncfilterproc = null,
    public var pvCallbackData: COpaquePointer? = null,
)

public data class CryptuiWizExportCertcontextInfo(
    public var dwSize: UInt = 0u,
    public var dwExportFormat: CryptuiWizExportFormat = 0u,
    public var fExportChain: Bool = 0,
    public var fExportPrivateKeys: Bool = 0,
    public var pwszPassword: Pcwstr = null,
    public var fStrongEncryption: Bool = 0,
)

public data class CryptuiWizExportInfo(
    public var dwSize: UInt = 0u,
    public var pwszExportFileName: Pcwstr = null,
    public var dwSubjectChoice: CryptuiWizExportSubject = 0u,
    public var anonymous: CryptuiWizExportInfo0 = CryptuiWizExportInfo0(),
    public var cStores: UInt = 0u,
    public var rghStores: Hcertstore? = null,
)

public data class CryptuiWizExportInfo0(
    public var pCertContext: CertContext? = null,
    public var pCTLContext: CtlContext? = null,
    public var pCRLContext: CrlContext? = null,
    public var hCertStore: Hcertstore = null,
)

public data class CryptuiWizImportSrcInfo(
    public var dwSize: UInt = 0u,
    public var dwSubjectChoice: CryptuiWizImportSubjectOption = 0u,
    public var anonymous: CryptuiWizImportSrcInfo0 = CryptuiWizImportSrcInfo0(),
    public var dwFlags: CryptKeyFlags = 0u,
    public var pwszPassword: Pcwstr = null,
)

public data class CryptuiWizImportSrcInfo0(
    public var pwszFileName: Pcwstr = null,
    public var pCertContext: CertContext? = null,
    public var pCTLContext: CtlContext? = null,
    public var pCRLContext: CrlContext? = null,
    public var hCertStore: Hcertstore = null,
)

public data class CtlModifyRequest(
    public var pccert: CertContext? = null,
    public var dwOperation: CtlModifyRequestOperation = 0u,
    public var dwError: UInt = 0u,
)
