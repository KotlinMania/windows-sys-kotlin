package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public typealias AddedCertType = Int

public typealias AlgorithmFlags = Int

public typealias AlgorithmOperationFlags = Int

public typealias AlgorithmType = Int

public typealias AlternativeNameType = Int

public typealias CertadminGetRolesFlags = UInt

public typealias CertenrollObjectid = Int

public typealias CertenrollPropertyid = Int

public typealias CertAltName = Int

public typealias CertCreateRequestFlags = Int

public typealias CertDeleteRowFlags = Int

public typealias CertExitEventMask = UInt

public typealias CertGetConfigFlags = Int

public typealias CertImportFlags = Int

public typealias CertPropertyType = Int

public typealias CertRequestOutType = Int

public typealias CertViewColumnIndex = Int

public typealias CertViewSeekOperatorFlags = Int

public typealias CRLRevocationReason = Int

public typealias CrDisp = UInt

public typealias CsbackupType = UInt

public typealias CvrcColumn = Int

public typealias CvrcTable = Int

public typealias CommitTemplateFlags = Int

public typealias DelayRetryAction = Int

public typealias EnumCatypes = Int

public typealias EnumCertColumnValueFlags = Int

public typealias EncodingType = Int

public typealias EnrollmentCAProperty = Int

public typealias EnrollmentDisplayStatus = Int

public typealias EnrollmentEnrollStatus = Int

public typealias EnrollmentPolicyFlags = Int

public typealias EnrollmentPolicyServerPropertyFlags = Int

public typealias EnrollmentSelectionStatus = Int

public typealias EnrollmentTemplateProperty = Int

public fun interface FncertsrvbackupcloseFn {
    public operator fun invoke(hbc: MutPtr<CVoid>): Hresult
}

public typealias Fncertsrvbackupclose = FncertsrvbackupcloseFn?

public fun interface FncertsrvbackupendFn {
    public operator fun invoke(hbc: MutPtr<CVoid>): Hresult
}

public typealias Fncertsrvbackupend = FncertsrvbackupendFn?

public fun interface FncertsrvbackupfreeFn {
    public operator fun invoke(pv: MutPtr<CVoid>)
}

public typealias Fncertsrvbackupfree = FncertsrvbackupfreeFn?

public fun interface FncertsrvbackupgetbackuplogswFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<MutPtr<UShort>>, pcbsize: MutPtr<UInt>): Hresult
}

public typealias Fncertsrvbackupgetbackuplogsw = FncertsrvbackupgetbackuplogswFn?

public fun interface FncertsrvbackupgetdatabasenameswFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, ppwszzattachmentinformation: MutPtr<MutPtr<UShort>>, pcbsize: MutPtr<UInt>): Hresult
}

public typealias Fncertsrvbackupgetdatabasenamesw = FncertsrvbackupgetdatabasenameswFn?

public fun interface FncertsrvbackupgetdynamicfilelistwFn {
    public operator fun invoke(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<MutPtr<UShort>>, pcbsize: MutPtr<UInt>): Hresult
}

public typealias Fncertsrvbackupgetdynamicfilelistw = FncertsrvbackupgetdynamicfilelistwFn?

public fun interface FncertsrvbackupopenfilewFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult
}

public typealias Fncertsrvbackupopenfilew = FncertsrvbackupopenfilewFn?

public fun interface FncertsrvbackuppreparewFn {
    public operator fun invoke(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias Fncertsrvbackuppreparew = FncertsrvbackuppreparewFn?

public fun interface FncertsrvbackupreadFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult
}

public typealias Fncertsrvbackupread = FncertsrvbackupreadFn?

public fun interface FncertsrvbackuptruncatelogsFn {
    public operator fun invoke(hbc: MutPtr<CVoid>): Hresult
}

public typealias Fncertsrvbackuptruncatelogs = FncertsrvbackuptruncatelogsFn?

public fun interface FncertsrvisserveronlinewFn {
    public operator fun invoke(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult
}

public typealias Fncertsrvisserveronlinew = FncertsrvisserveronlinewFn?

public fun interface FncertsrvrestoreendFn {
    public operator fun invoke(hbc: MutPtr<CVoid>): Hresult
}

public typealias Fncertsrvrestoreend = FncertsrvrestoreendFn?

public fun interface FncertsrvrestoregetdatabaselocationswFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<MutPtr<UShort>>, pcbsize: MutPtr<UInt>): Hresult
}

public typealias Fncertsrvrestoregetdatabaselocationsw = FncertsrvrestoregetdatabaselocationswFn?

public fun interface FncertsrvrestorepreparewFn {
    public operator fun invoke(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias Fncertsrvrestorepreparew = FncertsrvrestorepreparewFn?

public fun interface FncertsrvrestoreregistercompleteFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult
}

public typealias Fncertsrvrestoreregistercomplete = FncertsrvrestoreregistercompleteFn?

public fun interface FncertsrvrestoreregisterwFn {
    public operator fun invoke(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult
}

public typealias Fncertsrvrestoreregisterw = FncertsrvrestoreregisterwFn?

public fun interface FncertsrvservercontrolwFn {
    public operator fun invoke(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult
}

public typealias Fncertsrvservercontrolw = FncertsrvservercontrolwFn?

public fun interface FnimportpfxtoproviderFn {
    public operator fun invoke(hwndparent: Hwnd, pbpfx: ConstPtr<UByte>, cbpfx: UInt, importflags: ImportPFXFlags, pwszpassword: Pcwstr, pwszprovidername: Pcwstr, pwszreadername: Pcwstr, pwszcontainernameprefix: Pcwstr, pwszpin: Pcwstr, pwszfriendlyname: Pcwstr, pccertout: MutPtr<UInt>, prgpcertout: MutPtr<MutPtr<MutPtr<CertContext>>>): Hresult
}

public typealias Fnimportpfxtoprovider = FnimportpfxtoproviderFn?

public fun interface FnimportpfxtoproviderfreedataFn {
    public operator fun invoke(ccert: UInt, rgpcert: ConstPtr<ConstPtr<CertContext>>)
}

public typealias Fnimportpfxtoproviderfreedata = FnimportpfxtoproviderfreedataFn?

public typealias FullResponsePropertyId = Int

public typealias ImportPFXFlags = Int

public typealias InnerRequestLevel = Int

public typealias InstallResponseRestrictionFlags = Int

public typealias KeyAttestationClaimType = Int

public typealias KeyIdentifierHashAlgorithm = Int

public typealias OCSPRequestFlag = Int

public typealias OCSPSigningFlag = Int

public typealias ObjectIdGroupId = Int

public typealias ObjectIdPublicKeyFlags = Int

public typealias PendingRequestDesiredProperty = Int

public typealias PFXExportOptions = Int

public typealias Pkcs10AllowedSignatureTypes = Int

public typealias PolicyQualifierType = Int

public typealias PolicyServerUrlFlags = Int

public typealias PolicyServerUrlPropertyID = Int

public typealias RequestClientInfoClientId = Int

public typealias WebEnrollmentFlags = Int

public typealias WebSecurityLevel = Int

public typealias X500NameFlags = Int

public typealias X509CertificateEnrollmentContext = Int

public typealias X509CertificateTemplateEnrollmentFlag = Int

public typealias X509CertificateTemplateGeneralFlag = Int

public typealias X509CertificateTemplatePrivateKeyFlag = Int

public typealias X509CertificateTemplateSubjectNameFlag = Int

public typealias X509EnrollmentAuthFlags = Int

public typealias X509EnrollmentPolicyExportFlags = Int

public typealias X509EnrollmentPolicyLoadOption = Int

public typealias X509HardwareKeyUsageFlags = Int

public typealias X509KeyParametersExportType = Int

public typealias X509KeySpec = Int

public typealias X509KeyUsageFlags = Int

public typealias X509PrivateKeyExportFlags = Int

public typealias X509PrivateKeyProtection = Int

public typealias X509PrivateKeyUsageFlags = Int

public typealias X509PrivateKeyVerify = Int

public typealias X509ProviderType = Int

public typealias X509RequestInheritOptions = Int

public typealias X509RequestType = Int

public typealias X509SCEPDisposition = Int

public typealias X509SCEPFailInfo = Int

public typealias X509SCEPMessageType = Int

public typealias X509SCEPProcessMessageFlags = Int

public typealias XeklKeysize = Int

public typealias XeklKeyspec = Int
