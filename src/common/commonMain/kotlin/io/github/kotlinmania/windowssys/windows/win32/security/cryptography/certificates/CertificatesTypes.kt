package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ADDED_CERT_TYPE = Int

public typealias AlgorithmFlags = Int

public typealias AlgorithmOperationFlags = Int

public typealias AlgorithmType = Int

public typealias AlternativeNameType = Int

public typealias CERTADMIN_GET_ROLES_FLAGS = UInt

public typealias CERTENROLL_OBJECTID = Int

public typealias CERTENROLL_PROPERTYID = Int

public typealias CERT_ALT_NAME = Int

public typealias CERT_CREATE_REQUEST_FLAGS = Int

public typealias CERT_DELETE_ROW_FLAGS = Int

public typealias CERT_EXIT_EVENT_MASK = UInt

public typealias CERT_GET_CONFIG_FLAGS = Int

public typealias CERT_IMPORT_FLAGS = Int

public typealias CERT_PROPERTY_TYPE = Int

public typealias CERT_REQUEST_OUT_TYPE = Int

public typealias CERT_VIEW_COLUMN_INDEX = Int

public typealias CERT_VIEW_SEEK_OPERATOR_FLAGS = Int

public typealias CRLRevocationReason = Int

public typealias CR_DISP = UInt

public typealias CSBACKUP_TYPE = UInt

public typealias CVRC_COLUMN = Int

public typealias CVRC_TABLE = Int

public typealias CommitTemplateFlags = Int

public typealias DelayRetryAction = Int

public typealias ENUM_CATYPES = Int

public typealias ENUM_CERT_COLUMN_VALUE_FLAGS = Int

public typealias EncodingType = Int

public typealias EnrollmentCAProperty = Int

public typealias EnrollmentDisplayStatus = Int

public typealias EnrollmentEnrollStatus = Int

public typealias EnrollmentPolicyFlags = Int

public typealias EnrollmentPolicyServerPropertyFlags = Int

public typealias EnrollmentSelectionStatus = Int

public typealias EnrollmentTemplateProperty = Int

public fun interface FNCERTSRVBACKUPCLOSEFn {
    public operator fun invoke(hbc: Long): HRESULT
}

public typealias FNCERTSRVBACKUPCLOSE = FNCERTSRVBACKUPCLOSEFn?

public fun interface FNCERTSRVBACKUPENDFn {
    public operator fun invoke(hbc: Long): HRESULT
}

public typealias FNCERTSRVBACKUPEND = FNCERTSRVBACKUPENDFn?

public fun interface FNCERTSRVBACKUPFREEFn {
    public operator fun invoke(pv: Long)
}

public typealias FNCERTSRVBACKUPFREE = FNCERTSRVBACKUPFREEFn?

public fun interface FNCERTSRVBACKUPGETBACKUPLOGSWFn {
    public operator fun invoke(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT
}

public typealias FNCERTSRVBACKUPGETBACKUPLOGSW = FNCERTSRVBACKUPGETBACKUPLOGSWFn?

public fun interface FNCERTSRVBACKUPGETDATABASENAMESWFn {
    public operator fun invoke(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT
}

public typealias FNCERTSRVBACKUPGETDATABASENAMESW = FNCERTSRVBACKUPGETDATABASENAMESWFn?

public fun interface FNCERTSRVBACKUPGETDYNAMICFILELISTWFn {
    public operator fun invoke(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT
}

public typealias FNCERTSRVBACKUPGETDYNAMICFILELISTW = FNCERTSRVBACKUPGETDYNAMICFILELISTWFn?

public fun interface FNCERTSRVBACKUPOPENFILEWFn {
    public operator fun invoke(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT
}

public typealias FNCERTSRVBACKUPOPENFILEW = FNCERTSRVBACKUPOPENFILEWFn?

public fun interface FNCERTSRVBACKUPPREPAREWFn {
    public operator fun invoke(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: UInt, phbc: Long): HRESULT
}

public typealias FNCERTSRVBACKUPPREPAREW = FNCERTSRVBACKUPPREPAREWFn?

public fun interface FNCERTSRVBACKUPREADFn {
    public operator fun invoke(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT
}

public typealias FNCERTSRVBACKUPREAD = FNCERTSRVBACKUPREADFn?

public fun interface FNCERTSRVBACKUPTRUNCATELOGSFn {
    public operator fun invoke(hbc: Long): HRESULT
}

public typealias FNCERTSRVBACKUPTRUNCATELOGS = FNCERTSRVBACKUPTRUNCATELOGSFn?

public fun interface FNCERTSRVISSERVERONLINEWFn {
    public operator fun invoke(pwszservername: PCWSTR, pfserveronline: Long): HRESULT
}

public typealias FNCERTSRVISSERVERONLINEW = FNCERTSRVISSERVERONLINEWFn?

public fun interface FNCERTSRVRESTOREENDFn {
    public operator fun invoke(hbc: Long): HRESULT
}

public typealias FNCERTSRVRESTOREEND = FNCERTSRVRESTOREENDFn?

public fun interface FNCERTSRVRESTOREGETDATABASELOCATIONSWFn {
    public operator fun invoke(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT
}

public typealias FNCERTSRVRESTOREGETDATABASELOCATIONSW = FNCERTSRVRESTOREGETDATABASELOCATIONSWFn?

public fun interface FNCERTSRVRESTOREPREPAREWFn {
    public operator fun invoke(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT
}

public typealias FNCERTSRVRESTOREPREPAREW = FNCERTSRVRESTOREPREPAREWFn?

public fun interface FNCERTSRVRESTOREREGISTERCOMPLETEFn {
    public operator fun invoke(hbc: Long, hrrestorestate: HRESULT): HRESULT
}

public typealias FNCERTSRVRESTOREREGISTERCOMPLETE = FNCERTSRVRESTOREREGISTERCOMPLETEFn?

public fun interface FNCERTSRVRESTOREREGISTERWFn {
    public operator fun invoke(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT
}

public typealias FNCERTSRVRESTOREREGISTERW = FNCERTSRVRESTOREREGISTERWFn?

public fun interface FNCERTSRVSERVERCONTROLWFn {
    public operator fun invoke(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT
}

public typealias FNCERTSRVSERVERCONTROLW = FNCERTSRVSERVERCONTROLWFn?

public fun interface FNIMPORTPFXTOPROVIDERFn {
    public operator fun invoke(hwndparent: Foundation.HWND, pbpfx: Long, cbpfx: UInt, importflags: ImportPFXFlags, pwszpassword: PCWSTR, pwszprovidername: PCWSTR, pwszreadername: PCWSTR, pwszcontainernameprefix: PCWSTR, pwszpin: PCWSTR, pwszfriendlyname: PCWSTR, pccertout: Long, prgpcertout: Long): HRESULT
}

public typealias FNIMPORTPFXTOPROVIDER = FNIMPORTPFXTOPROVIDERFn?

public fun interface FNIMPORTPFXTOPROVIDERFREEDATAFn {
    public operator fun invoke(ccert: UInt, rgpcert: Long)
}

public typealias FNIMPORTPFXTOPROVIDERFREEDATA = FNIMPORTPFXTOPROVIDERFREEDATAFn?

public typealias FULL_RESPONSE_PROPERTY_ID = Int

public typealias ImportPFXFlags = Int

public typealias InnerRequestLevel = Int

public typealias InstallResponseRestrictionFlags = Int

public typealias KeyAttestationClaimType = Int

public typealias KeyIdentifierHashAlgorithm = Int

public typealias OCSPRequestFlag = Int

public typealias OCSPSigningFlag = Int

public typealias ObjectIdGroupId = Int

public typealias ObjectIdPublicKeyFlags = Int

public typealias PENDING_REQUEST_DESIRED_PROPERTY = Int

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

public typealias XEKL_KEYSIZE = Int

public typealias XEKL_KEYSPEC = Int
