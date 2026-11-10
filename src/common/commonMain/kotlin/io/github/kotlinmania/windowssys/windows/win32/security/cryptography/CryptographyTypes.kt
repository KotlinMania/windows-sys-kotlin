package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle

public typealias AlgId = UInt

public typealias BcryptgenrandomFlags = UInt

public typealias BcryptAlgHandle = COpaquePointer?

public typealias BcryptDhKeyBlobMagic = UInt

public typealias BcryptDsaMagic = UInt

public typealias BcryptFlags = UInt

public typealias BcryptHandle = COpaquePointer?

public typealias BcryptHashHandle = COpaquePointer?

public typealias BcryptHashOperationType = Int

public typealias BcryptInterface = UInt

public typealias BcryptKeyHandle = COpaquePointer?

public typealias BcryptMultiOperationType = Int

public typealias BcryptOpenAlgorithmProviderFlags = UInt

public typealias BcryptOperation = UInt

public typealias BcryptQueryProviderMode = UInt

public typealias BcryptResolveProvidersFlags = UInt

public typealias BcryptRsakeyBlobMagic = UInt

public typealias BcryptSecretHandle = COpaquePointer?

public typealias BcryptTable = UInt

public fun interface BCryptCloseAlgorithmProviderFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus
}

public typealias BCryptCloseAlgorithmProviderFn = BCryptCloseAlgorithmProviderFnFn?

public fun interface BCryptCreateHashFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptCreateHashFn = BCryptCreateHashFnFn?

public fun interface BCryptCreateMultiHashFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, nhashes: UInt, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptCreateMultiHashFn = BCryptCreateMultiHashFnFn?

public fun interface BCryptDecryptFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptDecryptFn = BCryptDecryptFnFn?

public fun interface BCryptDeriveKeyCapiFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDeriveKeyCapiFn = BCryptDeriveKeyCapiFnFn?

public fun interface BCryptDeriveKeyFnFn {
    public operator fun invoke(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptDeriveKeyFn = BCryptDeriveKeyFnFn?

public fun interface BCryptDeriveKeyPBKDF2FnFn {
    public operator fun invoke(hprf: BcryptAlgHandle, pbpassword: COpaquePointer?, cbpassword: UInt, pbsalt: COpaquePointer?, cbsalt: UInt, citerations: ULong, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDeriveKeyPBKDF2Fn = BCryptDeriveKeyPBKDF2FnFn?

public fun interface BCryptDestroyHashFnFn {
    public operator fun invoke(hhash: BcryptHashHandle): Ntstatus
}

public typealias BCryptDestroyHashFn = BCryptDestroyHashFnFn?

public fun interface BCryptDestroyKeyFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle): Ntstatus
}

public typealias BCryptDestroyKeyFn = BCryptDestroyKeyFnFn?

public fun interface BCryptDestroySecretFnFn {
    public operator fun invoke(hsecret: BcryptSecretHandle): Ntstatus
}

public typealias BCryptDestroySecretFn = BCryptDestroySecretFnFn?

public fun interface BCryptDuplicateHashFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, phnewhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDuplicateHashFn = BCryptDuplicateHashFnFn?

public fun interface BCryptDuplicateKeyFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, phnewkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDuplicateKeyFn = BCryptDuplicateKeyFnFn?

public fun interface BCryptEncryptFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptEncryptFn = BCryptEncryptFnFn?

public fun interface BCryptExportKeyFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptExportKeyFn = BCryptExportKeyFnFn?

public fun interface BCryptFinalizeKeyPairFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus
}

public typealias BCryptFinalizeKeyPairFn = BCryptFinalizeKeyPairFnFn?

public fun interface BCryptFinishHashFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptFinishHashFn = BCryptFinishHashFnFn?

public fun interface BCryptFreeBufferFnFn {
    public operator fun invoke(pvbuffer: COpaquePointer?)
}

public typealias BCryptFreeBufferFn = BCryptFreeBufferFnFn?

public fun interface BCryptGenRandomFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, pbbuffer: COpaquePointer?, cbbuffer: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenRandomFn = BCryptGenRandomFnFn?

public fun interface BCryptGenerateKeyPairFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, dwlength: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenerateKeyPairFn = BCryptGenerateKeyPairFnFn?

public fun interface BCryptGenerateSymmetricKeyFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenerateSymmetricKeyFn = BCryptGenerateSymmetricKeyFnFn?

public fun interface BCryptGetPropertyFnFn {
    public operator fun invoke(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptGetPropertyFn = BCryptGetPropertyFnFn?

public fun interface BCryptHashDataFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptHashDataFn = BCryptHashDataFnFn?

public fun interface BCryptImportKeyFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptImportKeyFn = BCryptImportKeyFnFn?

public fun interface BCryptImportKeyPairFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptImportKeyPairFn = BCryptImportKeyPairFnFn?

public fun interface BCryptKeyDerivationFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptKeyDerivationFn = BCryptKeyDerivationFnFn?

public fun interface BCryptOpenAlgorithmProviderFnFn {
    public operator fun invoke(phalgorithm: COpaquePointer?, pszalgid: Pcwstr, dwflags: UInt): Ntstatus
}

public typealias BCryptOpenAlgorithmProviderFn = BCryptOpenAlgorithmProviderFnFn?

public fun interface BCryptProcessMultiOperationsFnFn {
    public operator fun invoke(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: COpaquePointer?, cboperations: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptProcessMultiOperationsFn = BCryptProcessMultiOperationsFnFn?

public fun interface BCryptSecretAgreementFnFn {
    public operator fun invoke(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptSecretAgreementFn = BCryptSecretAgreementFnFn?

public fun interface BCryptSetPropertyFnFn {
    public operator fun invoke(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptSetPropertyFn = BCryptSetPropertyFnFn?

public fun interface BCryptSignHashFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias BCryptSignHashFn = BCryptSignHashFnFn?

public fun interface BCryptVerifySignatureFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhash: COpaquePointer?, cbhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptVerifySignatureFn = BCryptVerifySignatureFnFn?

public typealias CardDirectoryAccessCondition = Int

public typealias CardFileAccessCondition = Int

public typealias CASetupProperty = Int

public typealias CEPSetupProperty = Int

public typealias CertBiometricDataType = UInt

public typealias CertChainPolicyFlags = UInt

public typealias CertControlStoreFlags = UInt

public typealias CertCreateSelfsignFlags = UInt

public typealias CertFindChainInStoreFlags = UInt

public typealias CertFindFlags = UInt

public typealias CertFindType = UInt

public typealias CertIdOption = UInt

public typealias CertKeySpec = UInt

public typealias CertLogotypeChoice = UInt

public typealias CertLogotypeImageInfoType = UInt

public typealias CertLogotypeOption = UInt

public typealias CertOpenStoreFlags = UInt

public typealias CertQueryContentType = UInt

public typealias CertQueryContentTypeFlags = UInt

public typealias CertQueryEncodingType = UInt

public typealias CertQueryFormatType = UInt

public typealias CertQueryFormatTypeFlags = UInt

public typealias CertQueryObjectType = UInt

public typealias CertRdnAttrValueType = Int

public typealias CertRevocationStatusReason = UInt

public typealias CertRootProgramFlags = UInt

public typealias CertSelectCriteriaType = UInt

public typealias CertStoreProvFlags = UInt

public typealias CertStoreSaveAs = UInt

public typealias CertStoreSaveTo = UInt

public typealias CertStringType = UInt

public typealias CertStrongSignFlags = UInt

public typealias CertSystemStoreFlags = UInt

public typealias CESSetupProperty = Int

public typealias CmsgKeyAgreeOption = UInt

public typealias CmsgKeyAgreeOriginator = UInt

public typealias CryptAcquireFlags = UInt

public typealias CryptContextConfigFlags = UInt

public typealias CryptDefaultContextFlags = UInt

public typealias CryptDefaultContextType = UInt

public typealias CryptEncodeObjectFlags = UInt

public typealias CryptFindFlags = UInt

public typealias CryptGetUrlFlags = UInt

public typealias CryptImageRefFlags = UInt

public typealias CryptImportPublicKeyFlags = UInt

public typealias CryptKeyFlags = UInt

public typealias CryptKeyParamId = UInt

public typealias CryptMsgType = UInt

public typealias CryptObjectLocatorReleaseReason = UInt

public fun interface CryptReturnHwndFn {
    public operator fun invoke(phwnd: COpaquePointer?)
}

public typealias CryptReturnHwnd = CryptReturnHwndFn?

public typealias CryptSetHashParam = UInt

public typealias CryptSetProvParamId = UInt

public typealias CryptString = UInt

public typealias CryptTimestampResponseStatus = UInt

public typealias CryptTimestampVersion = UInt

public typealias CryptVerifyCertFlags = UInt

public fun interface CryptVerifyImageAFn {
    public operator fun invoke(szimage: Pcstr, pbsigdata: COpaquePointer?): Bool
}

public typealias CryptVerifyImageA = CryptVerifyImageAFn?

public fun interface CryptVerifyImageWFn {
    public operator fun invoke(szimage: Pcwstr, pbsigdata: COpaquePointer?): Bool
}

public typealias CryptVerifyImageW = CryptVerifyImageWFn?

public typealias CryptXmlCharset = Int

public typealias CryptXmlFlags = UInt

public typealias CryptXmlGroupId = UInt

public typealias CryptXmlKeyinfoSpec = Int

public typealias CryptXmlKeyinfoType = UInt

public typealias CryptXmlKeyValueType = UInt

public typealias CryptXmlPropertyId = Int

public typealias CryptXmlStatusErrorStatus = UInt

public typealias CryptXmlStatusInfoStatus = UInt

public typealias CryptXmlTransformFlags = UInt

public typealias CryptXmlX509dataType = UInt

public typealias CertKeyType = UInt

public fun interface CryptXmlDllCloseDigestFn {
    public operator fun invoke(hdigest: COpaquePointer?): Hresult
}

public typealias CryptXmlDllCloseDigest = CryptXmlDllCloseDigestFn?

public fun interface CryptXmlDllCreateDigestFn {
    public operator fun invoke(pdigestmethod: COpaquePointer?, pcbsize: COpaquePointer?, phdigest: COpaquePointer?): Hresult
}

public typealias CryptXmlDllCreateDigest = CryptXmlDllCreateDigestFn?

public fun interface CryptXmlDllCreateKeyFn {
    public operator fun invoke(pencoded: COpaquePointer?, phkey: COpaquePointer?): Hresult
}

public typealias CryptXmlDllCreateKey = CryptXmlDllCreateKeyFn?

public fun interface CryptXmlDllDigestDataFn {
    public operator fun invoke(hdigest: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt): Hresult
}

public typealias CryptXmlDllDigestData = CryptXmlDllDigestDataFn?

public fun interface CryptXmlDllEncodeAlgorithmFn {
    public operator fun invoke(palginfo: COpaquePointer?, dwcharset: CryptXmlCharset, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult
}

public typealias CryptXmlDllEncodeAlgorithm = CryptXmlDllEncodeAlgorithmFn?

public fun interface CryptXmlDllEncodeKeyValueFn {
    public operator fun invoke(hkey: NcryptKeyHandle, dwcharset: CryptXmlCharset, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult
}

public typealias CryptXmlDllEncodeKeyValue = CryptXmlDllEncodeKeyValueFn?

public fun interface CryptXmlDllFinalizeDigestFn {
    public operator fun invoke(hdigest: COpaquePointer?, pbdigest: COpaquePointer?, cbdigest: UInt): Hresult
}

public typealias CryptXmlDllFinalizeDigest = CryptXmlDllFinalizeDigestFn?

public fun interface CryptXmlDllGetAlgorithmInfoFn {
    public operator fun invoke(pxmlalgorithm: COpaquePointer?, ppalginfo: COpaquePointer?): Hresult
}

public typealias CryptXmlDllGetAlgorithmInfo = CryptXmlDllGetAlgorithmInfoFn?

public fun interface CryptXmlDllGetInterfaceFn {
    public operator fun invoke(dwflags: UInt, pmethod: COpaquePointer?, pinterface: COpaquePointer?): Hresult
}

public typealias CryptXmlDllGetInterface = CryptXmlDllGetInterfaceFn?

public fun interface CryptXmlDllSignDataFn {
    public operator fun invoke(psignaturemethod: COpaquePointer?, hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?): Hresult
}

public typealias CryptXmlDllSignData = CryptXmlDllSignDataFn?

public fun interface CryptXmlDllVerifySignatureFn {
    public operator fun invoke(psignaturemethod: COpaquePointer?, hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pbsignature: COpaquePointer?, cbsignature: UInt): Hresult
}

public typealias CryptXmlDllVerifySignature = CryptXmlDllVerifySignatureFn?

public typealias DsafipsversionEnum = Int

public typealias Direction = Int

public typealias EccCurveAlgIdEnum = Int

public typealias EccCurveTypeEnum = Int

public fun interface GetAsymmetricEncryptionInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetAsymmetricEncryptionInterfaceFn = GetAsymmetricEncryptionInterfaceFnFn?

public fun interface GetCipherInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetCipherInterfaceFn = GetCipherInterfaceFnFn?

public fun interface GetHashInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetHashInterfaceFn = GetHashInterfaceFnFn?

public fun interface GetKeyDerivationInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetKeyDerivationInterfaceFn = GetKeyDerivationInterfaceFnFn?

public fun interface GetKeyStorageInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetKeyStorageInterfaceFn = GetKeyStorageInterfaceFnFn?

public fun interface GetRngInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetRngInterfaceFn = GetRngInterfaceFnFn?

public fun interface GetSChannelInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetSChannelInterfaceFn = GetSChannelInterfaceFnFn?

public fun interface GetSecretAgreementInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetSecretAgreementInterfaceFn = GetSecretAgreementInterfaceFnFn?

public fun interface GetSignatureInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus
}

public typealias GetSignatureInterfaceFn = GetSignatureInterfaceFnFn?

public typealias HashalgorithmEnum = Int

public typealias Hcertchainengine = COpaquePointer?

public typealias Hcertstore = COpaquePointer?

public typealias Hcertstoreprov = COpaquePointer?

public typealias Hcryptasync = Long

public typealias HcryptprovLegacy = ULong

public typealias HcryptprovOrNcryptKeyHandle = ULong

public typealias HttpspolicyCallbackDataAuthType = UInt

public typealias MSCEPSetupProperty = Int

public typealias NcryptAlgorithmNameClass = UInt

public typealias NcryptFlags = UInt

public typealias NcryptHandle = ULong

public typealias NcryptHashHandle = ULong

public typealias NcryptKeyHandle = ULong

public typealias NcryptOperation = UInt

public typealias NcryptProvHandle = ULong

public typealias NcryptSecretHandle = ULong

public fun interface NCryptCreateClaimFnFn {
    public operator fun invoke(hprov: NcryptProvHandle, hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptCreateClaimFn = NCryptCreateClaimFnFn?

public fun interface NCryptCreatePersistedKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: UInt, dwflags: UInt): Hresult
}

public typealias NCryptCreatePersistedKeyFn = NCryptCreatePersistedKeyFnFn?

public fun interface NCryptDecryptFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptDecryptFn = NCryptDecryptFnFn?

public fun interface NCryptDeleteKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, dwflags: UInt): Hresult
}

public typealias NCryptDeleteKeyFn = NCryptDeleteKeyFnFn?

public fun interface NCryptDeriveKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptDeriveKeyFn = NCryptDeriveKeyFnFn?

public fun interface NCryptEncryptFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptEncryptFn = NCryptEncryptFnFn?

public fun interface NCryptEnumAlgorithmsFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, dwalgclass: UInt, pdwalgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptEnumAlgorithmsFn = NCryptEnumAlgorithmsFnFn?

public fun interface NCryptEnumKeysFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptEnumKeysFn = NCryptEnumKeysFnFn?

public fun interface NCryptEnumStorageProvidersFnFn {
    public operator fun invoke(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptEnumStorageProvidersFn = NCryptEnumStorageProvidersFnFn?

public fun interface NCryptExportKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptExportKeyFn = NCryptExportKeyFnFn?

public fun interface NCryptFinalizeKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, dwflags: UInt): Hresult
}

public typealias NCryptFinalizeKeyFn = NCryptFinalizeKeyFnFn?

public fun interface NCryptFreeBufferFnFn {
    public operator fun invoke(pvinput: COpaquePointer?): Hresult
}

public typealias NCryptFreeBufferFn = NCryptFreeBufferFnFn?

public fun interface NCryptFreeKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle): Hresult
}

public typealias NCryptFreeKeyFn = NCryptFreeKeyFnFn?

public fun interface NCryptFreeProviderFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle): Hresult
}

public typealias NCryptFreeProviderFn = NCryptFreeProviderFnFn?

public fun interface NCryptFreeSecretFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hsharedsecret: NcryptSecretHandle): Hresult
}

public typealias NCryptFreeSecretFn = NCryptFreeSecretFnFn?

public fun interface NCryptGetKeyPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptGetKeyPropertyFn = NCryptGetKeyPropertyFnFn?

public fun interface NCryptGetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptGetProviderPropertyFn = NCryptGetProviderPropertyFnFn?

public fun interface NCryptImportKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, phkey: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Hresult
}

public typealias NCryptImportKeyFn = NCryptImportKeyFnFn?

public fun interface NCryptIsAlgSupportedFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptIsAlgSupportedFn = NCryptIsAlgSupportedFnFn?

public fun interface NCryptKeyDerivationFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptKeyDerivationFn = NCryptKeyDerivationFnFn?

public fun interface NCryptNotifyChangeKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phevent: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptNotifyChangeKeyFn = NCryptNotifyChangeKeyFnFn?

public fun interface NCryptOpenKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszkeyname: Pcwstr, dwlegacykeyspec: UInt, dwflags: UInt): Hresult
}

public typealias NCryptOpenKeyFn = NCryptOpenKeyFnFn?

public fun interface NCryptOpenStorageProviderFnFn {
    public operator fun invoke(phprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptOpenStorageProviderFn = NCryptOpenStorageProviderFnFn?

public fun interface NCryptPromptUserFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszoperation: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptPromptUserFn = NCryptPromptUserFnFn?

public fun interface NCryptSecretAgreementFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptSecretAgreementFn = NCryptSecretAgreementFnFn?

public fun interface NCryptSetKeyPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias NCryptSetKeyPropertyFn = NCryptSetKeyPropertyFnFn?

public fun interface NCryptSetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias NCryptSetProviderPropertyFn = NCryptSetProviderPropertyFnFn?

public fun interface NCryptSignHashFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptSignHashFn = NCryptSignHashFnFn?

public fun interface NCryptVerifyClaimFnFn {
    public operator fun invoke(hprov: NcryptProvHandle, hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, poutput: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias NCryptVerifyClaimFn = NCryptVerifyClaimFnFn?

public fun interface NCryptVerifySignatureFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult
}

public typealias NCryptVerifySignatureFn = NCryptVerifySignatureFnFn?

public fun interface PcryptDecryptPrivateKeyFuncFn {
    public operator fun invoke(algorithm: CryptAlgorithmIdentifier, encryptedprivatekey: CryptIntegerBlob, pbcleartextkey: COpaquePointer?, pcbcleartextkey: COpaquePointer?, pvoiddecryptfunc: COpaquePointer?): Bool
}

public typealias PcryptDecryptPrivateKeyFunc = PcryptDecryptPrivateKeyFuncFn?

public fun interface PcryptEncryptPrivateKeyFuncFn {
    public operator fun invoke(palgorithm: COpaquePointer?, pcleartextprivatekey: COpaquePointer?, pbencryptedkey: COpaquePointer?, pcbencryptedkey: COpaquePointer?, pvoidencryptfunc: COpaquePointer?): Bool
}

public typealias PcryptEncryptPrivateKeyFunc = PcryptEncryptPrivateKeyFuncFn?

public fun interface PcryptResolveHcryptprovFuncFn {
    public operator fun invoke(pprivatekeyinfo: COpaquePointer?, phcryptprov: COpaquePointer?, pvoidresolvefunc: COpaquePointer?): Bool
}

public typealias PcryptResolveHcryptprovFunc = PcryptResolveHcryptprovFuncFn?

public fun interface PFNCryptStreamOutputCallbackFn {
    public operator fun invoke(pvcallbackctxt: COpaquePointer?, pbdata: COpaquePointer?, cbdata: ULong, ffinal: Bool): Hresult
}

public typealias PFNCryptStreamOutputCallback = PFNCryptStreamOutputCallbackFn?

public fun interface PFNCryptStreamOutputCallbackExFn {
    public operator fun invoke(pvcallbackctxt: COpaquePointer?, pbdata: COpaquePointer?, cbdata: ULong, hdescriptor: NcryptDescriptorHandle, ffinal: Bool): Hresult
}

public typealias PFNCryptStreamOutputCallbackEx = PFNCryptStreamOutputCallbackExFn?

public fun interface PfnAuthenticodeDigestSignFn {
    public operator fun invoke(psigningcert: COpaquePointer?, pmetadatablob: COpaquePointer?, digestalgid: AlgId, pbtobesigneddigest: COpaquePointer?, cbtobesigneddigest: UInt, psigneddigest: COpaquePointer?): Hresult
}

public typealias PfnAuthenticodeDigestSign = PfnAuthenticodeDigestSignFn?

public fun interface PfnAuthenticodeDigestSignExFn {
    public operator fun invoke(pmetadatablob: COpaquePointer?, digestalgid: AlgId, pbtobesigneddigest: COpaquePointer?, cbtobesigneddigest: UInt, psigneddigest: COpaquePointer?, ppsignercert: COpaquePointer?, hcertchainstore: Hcertstore): Hresult
}

public typealias PfnAuthenticodeDigestSignEx = PfnAuthenticodeDigestSignExFn?

public fun interface PfnAuthenticodeDigestSignExWithfilehandleFn {
    public operator fun invoke(pmetadatablob: COpaquePointer?, digestalgid: AlgId, pbtobesigneddigest: COpaquePointer?, cbtobesigneddigest: UInt, hfile: Handle, psigneddigest: COpaquePointer?, ppsignercert: COpaquePointer?, hcertchainstore: Hcertstore): Hresult
}

public typealias PfnAuthenticodeDigestSignExWithfilehandle = PfnAuthenticodeDigestSignExWithfilehandleFn?

public fun interface PfnAuthenticodeDigestSignWithfilehandleFn {
    public operator fun invoke(psigningcert: COpaquePointer?, pmetadatablob: COpaquePointer?, digestalgid: AlgId, pbtobesigneddigest: COpaquePointer?, cbtobesigneddigest: UInt, hfile: Handle, psigneddigest: COpaquePointer?): Hresult
}

public typealias PfnAuthenticodeDigestSignWithfilehandle = PfnAuthenticodeDigestSignWithfilehandleFn?

public fun interface PfnCancelAsyncRetrievalFuncFn {
    public operator fun invoke(hasyncretrieve: Hcryptasync): Bool
}

public typealias PfnCancelAsyncRetrievalFunc = PfnCancelAsyncRetrievalFuncFn?

public fun interface PfnCardAcquireContextFn {
    public operator fun invoke(pcarddata: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardAcquireContext = PfnCardAcquireContextFn?

public fun interface PfnCardAuthenticateChallengeFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pbresponsedata: COpaquePointer?, cbresponsedata: UInt, pcattemptsremaining: COpaquePointer?): UInt
}

public typealias PfnCardAuthenticateChallenge = PfnCardAuthenticateChallengeFn?

public fun interface PfnCardAuthenticateExFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pinid: UInt, dwflags: UInt, pbpindata: COpaquePointer?, cbpindata: UInt, ppbsessionpin: COpaquePointer?, pcbsessionpin: COpaquePointer?, pcattemptsremaining: COpaquePointer?): UInt
}

public typealias PfnCardAuthenticateEx = PfnCardAuthenticateExFn?

public fun interface PfnCardAuthenticatePinFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszuserid: Pcwstr, pbpin: COpaquePointer?, cbpin: UInt, pcattemptsremaining: COpaquePointer?): UInt
}

public typealias PfnCardAuthenticatePin = PfnCardAuthenticatePinFn?

public fun interface PfnCardChangeAuthenticatorFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszuserid: Pcwstr, pbcurrentauthenticator: COpaquePointer?, cbcurrentauthenticator: UInt, pbnewauthenticator: COpaquePointer?, cbnewauthenticator: UInt, cretrycount: UInt, dwflags: UInt, pcattemptsremaining: COpaquePointer?): UInt
}

public typealias PfnCardChangeAuthenticator = PfnCardChangeAuthenticatorFn?

public fun interface PfnCardChangeAuthenticatorExFn {
    public operator fun invoke(pcarddata: COpaquePointer?, dwflags: UInt, dwauthenticatingpinid: UInt, pbauthenticatingpindata: COpaquePointer?, cbauthenticatingpindata: UInt, dwtargetpinid: UInt, pbtargetdata: COpaquePointer?, cbtargetdata: UInt, cretrycount: UInt, pcattemptsremaining: COpaquePointer?): UInt
}

public typealias PfnCardChangeAuthenticatorEx = PfnCardChangeAuthenticatorExFn?

public fun interface PfnCardConstructDhAgreementFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pagreementinfo: COpaquePointer?): UInt
}

public typealias PfnCardConstructDhAgreement = PfnCardConstructDhAgreementFn?

public fun interface PfnCardCreateContainerFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: COpaquePointer?): UInt
}

public typealias PfnCardCreateContainer = PfnCardCreateContainerFn?

public fun interface PfnCardCreateContainerExFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: COpaquePointer?, pinid: UInt): UInt
}

public typealias PfnCardCreateContainerEx = PfnCardCreateContainerExFn?

public fun interface PfnCardCreateDirectoryFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, accesscondition: CardDirectoryAccessCondition): UInt
}

public typealias PfnCardCreateDirectory = PfnCardCreateDirectoryFn?

public fun interface PfnCardCreateFileFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pszfilename: Pcstr, cbinitialcreationsize: UInt, accesscondition: CardFileAccessCondition): UInt
}

public typealias PfnCardCreateFile = PfnCardCreateFileFn?

public fun interface PfnCardDeauthenticateFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszuserid: Pcwstr, dwflags: UInt): UInt
}

public typealias PfnCardDeauthenticate = PfnCardDeauthenticateFn?

public fun interface PfnCardDeauthenticateExFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pinid: UInt, dwflags: UInt): UInt
}

public typealias PfnCardDeauthenticateEx = PfnCardDeauthenticateExFn?

public fun interface PfnCardDeleteContainerFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, dwreserved: UInt): UInt
}

public typealias PfnCardDeleteContainer = PfnCardDeleteContainerFn?

public fun interface PfnCardDeleteContextFn {
    public operator fun invoke(pcarddata: COpaquePointer?): UInt
}

public typealias PfnCardDeleteContext = PfnCardDeleteContextFn?

public fun interface PfnCardDeleteDirectoryFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr): UInt
}

public typealias PfnCardDeleteDirectory = PfnCardDeleteDirectoryFn?

public fun interface PfnCardDeleteFileFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt): UInt
}

public typealias PfnCardDeleteFile = PfnCardDeleteFileFn?

public fun interface PfnCardDeriveKeyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pagreementinfo: COpaquePointer?): UInt
}

public typealias PfnCardDeriveKey = PfnCardDeriveKeyFn?

public fun interface PfnCardDestroyDhAgreementFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bsecretagreementindex: UByte, dwflags: UInt): UInt
}

public typealias PfnCardDestroyDhAgreement = PfnCardDestroyDhAgreementFn?

public fun interface PfnCardDestroyKeyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hkey: ULong): UInt
}

public typealias PfnCardDestroyKey = PfnCardDestroyKeyFn?

public fun interface PfnCardEnumFilesFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pmszfilenames: COpaquePointer?, pdwcbfilename: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardEnumFiles = PfnCardEnumFilesFn?

public fun interface PfnCardGetAlgorithmPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszalgid: Pcwstr, pwszproperty: Pcwstr, pbdata: COpaquePointer?, cbdata: UInt, pdwdatalen: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardGetAlgorithmProperty = PfnCardGetAlgorithmPropertyFn?

public fun interface PfnCardGetChallengeFn {
    public operator fun invoke(pcarddata: COpaquePointer?, ppbchallengedata: COpaquePointer?, pcbchallengedata: COpaquePointer?): UInt
}

public typealias PfnCardGetChallenge = PfnCardGetChallengeFn?

public fun interface PfnCardGetChallengeExFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pinid: UInt, ppbchallengedata: COpaquePointer?, pcbchallengedata: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardGetChallengeEx = PfnCardGetChallengeExFn?

public fun interface PfnCardGetContainerInfoFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, dwflags: UInt, pcontainerinfo: COpaquePointer?): UInt
}

public typealias PfnCardGetContainerInfo = PfnCardGetContainerInfoFn?

public fun interface PfnCardGetContainerPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, wszproperty: Pcwstr, pbdata: COpaquePointer?, cbdata: UInt, pdwdatalen: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardGetContainerProperty = PfnCardGetContainerPropertyFn?

public fun interface PfnCardGetFileInfoFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pszfilename: Pcstr, pcardfileinfo: COpaquePointer?): UInt
}

public typealias PfnCardGetFileInfo = PfnCardGetFileInfoFn?

public fun interface PfnCardGetKeyPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hkey: ULong, pwszproperty: Pcwstr, pbdata: COpaquePointer?, cbdata: UInt, pdwdatalen: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardGetKeyProperty = PfnCardGetKeyPropertyFn?

public fun interface PfnCardGetPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, wszproperty: Pcwstr, pbdata: COpaquePointer?, cbdata: UInt, pdwdatalen: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardGetProperty = PfnCardGetPropertyFn?

public fun interface PfnCardGetSharedKeyHandleFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, phkey: COpaquePointer?): UInt
}

public typealias PfnCardGetSharedKeyHandle = PfnCardGetSharedKeyHandleFn?

public fun interface PfnCardImportSessionKeyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, ppaddinginfo: COpaquePointer?, pwszblobtype: Pcwstr, pwszalgid: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PfnCardImportSessionKey = PfnCardImportSessionKeyFn?

public fun interface PfnCardProcessEncryptedDataFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hkey: ULong, pwszsecurefunction: Pcwstr, pencrypteddata: COpaquePointer?, cencrypteddata: UInt, pboutput: COpaquePointer?, cboutput: UInt, pdwoutputlen: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCardProcessEncryptedData = PfnCardProcessEncryptedDataFn?

public fun interface PfnCardQueryCapabilitiesFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pcardcapabilities: COpaquePointer?): UInt
}

public typealias PfnCardQueryCapabilities = PfnCardQueryCapabilitiesFn?

public fun interface PfnCardQueryFreeSpaceFn {
    public operator fun invoke(pcarddata: COpaquePointer?, dwflags: UInt, pcardfreespaceinfo: COpaquePointer?): UInt
}

public typealias PfnCardQueryFreeSpace = PfnCardQueryFreeSpaceFn?

public fun interface PfnCardQueryKeySizesFn {
    public operator fun invoke(pcarddata: COpaquePointer?, dwkeyspec: UInt, dwflags: UInt, pkeysizes: COpaquePointer?): UInt
}

public typealias PfnCardQueryKeySizes = PfnCardQueryKeySizesFn?

public fun interface PfnCardReadFileFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): UInt
}

public typealias PfnCardReadFile = PfnCardReadFileFn?

public fun interface PfnCardRsaDecryptFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pinfo: COpaquePointer?): UInt
}

public typealias PfnCardRsaDecrypt = PfnCardRsaDecryptFn?

public fun interface PfnCardSetContainerPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, bcontainerindex: UByte, wszproperty: Pcwstr, pbdata: COpaquePointer?, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetContainerProperty = PfnCardSetContainerPropertyFn?

public fun interface PfnCardSetKeyPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hkey: ULong, pwszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetKeyProperty = PfnCardSetKeyPropertyFn?

public fun interface PfnCardSetPropertyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, wszproperty: Pcwstr, pbdata: COpaquePointer?, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetProperty = PfnCardSetPropertyFn?

public fun interface PfnCardSignDataFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pinfo: COpaquePointer?): UInt
}

public typealias PfnCardSignData = PfnCardSignDataFn?

public fun interface PfnCardUnblockPinFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszuserid: Pcwstr, pbauthenticationdata: COpaquePointer?, cbauthenticationdata: UInt, pbnewpindata: COpaquePointer?, cbnewpindata: UInt, cretrycount: UInt, dwflags: UInt): UInt
}

public typealias PfnCardUnblockPin = PfnCardUnblockPinFn?

public fun interface PfnCardWriteFileFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt): UInt
}

public typealias PfnCardWriteFile = PfnCardWriteFileFn?

public fun interface PfnCertChainFindByIssuerCallbackFn {
    public operator fun invoke(pcert: COpaquePointer?, pvfindarg: COpaquePointer?): Bool
}

public typealias PfnCertChainFindByIssuerCallback = PfnCertChainFindByIssuerCallbackFn?

public fun interface PfnCertCreateContextSortFuncFn {
    public operator fun invoke(cbtotalencoded: UInt, cbremainencoded: UInt, centry: UInt, pvsort: COpaquePointer?): Bool
}

public typealias PfnCertCreateContextSortFunc = PfnCertCreateContextSortFuncFn?

public fun interface PfnCertDllOpenStoreProvFuncFn {
    public operator fun invoke(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: COpaquePointer?, hcertstore: Hcertstore, pstoreprovinfo: COpaquePointer?): Bool
}

public typealias PfnCertDllOpenStoreProvFunc = PfnCertDllOpenStoreProvFuncFn?

public fun interface PfnCertEnumPhysicalStoreFn {
    public operator fun invoke(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCertEnumPhysicalStore = PfnCertEnumPhysicalStoreFn?

public fun interface PfnCertEnumSystemStoreFn {
    public operator fun invoke(pvsystemstore: COpaquePointer?, dwflags: CertSystemStoreFlags, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCertEnumSystemStore = PfnCertEnumSystemStoreFn?

public fun interface PfnCertEnumSystemStoreLocationFn {
    public operator fun invoke(pwszstorelocation: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCertEnumSystemStoreLocation = PfnCertEnumSystemStoreLocationFn?

public fun interface PfnCertIsWeakHashFn {
    public operator fun invoke(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: COpaquePointer?, ptimestamp: COpaquePointer?, pwszfilename: Pcwstr): Bool
}

public typealias PfnCertIsWeakHash = PfnCertIsWeakHashFn?

public fun interface PfnCertServerOcspResponseUpdateCallbackFn {
    public operator fun invoke(pchaincontext: COpaquePointer?, pserverocspresponsecontext: COpaquePointer?, pnewcrlcontext: COpaquePointer?, pprevcrlcontext: COpaquePointer?, pvarg: COpaquePointer?, dwwriteocspfileerror: UInt)
}

public typealias PfnCertServerOcspResponseUpdateCallback = PfnCertServerOcspResponseUpdateCallbackFn?

public fun interface PfnCertStoreProvCloseFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, dwflags: UInt)
}

public typealias PfnCertStoreProvClose = PfnCertStoreProvCloseFn?

public fun interface PfnCertStoreProvControlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, dwflags: UInt, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvControl = PfnCertStoreProvControlFn?

public fun interface PfnCertStoreProvDeleteCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCert = PfnCertStoreProvDeleteCertFn?

public fun interface PfnCertStoreProvDeleteCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCrl = PfnCertStoreProvDeleteCrlFn?

public fun interface PfnCertStoreProvDeleteCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCtl = PfnCertStoreProvDeleteCtlFn?

public fun interface PfnCertStoreProvFindCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: COpaquePointer?, pprevcertcontext: COpaquePointer?, dwflags: UInt, ppvstoreprovfindinfo: COpaquePointer?, ppprovcertcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvFindCert = PfnCertStoreProvFindCertFn?

public fun interface PfnCertStoreProvFindCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: COpaquePointer?, pprevcrlcontext: COpaquePointer?, dwflags: UInt, ppvstoreprovfindinfo: COpaquePointer?, ppprovcrlcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvFindCrl = PfnCertStoreProvFindCrlFn?

public fun interface PfnCertStoreProvFindCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: COpaquePointer?, pprevctlcontext: COpaquePointer?, dwflags: UInt, ppvstoreprovfindinfo: COpaquePointer?, ppprovctlcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvFindCtl = PfnCertStoreProvFindCtlFn?

public fun interface PfnCertStoreProvFreeFindCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: COpaquePointer?, pvstoreprovfindinfo: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCert = PfnCertStoreProvFreeFindCertFn?

public fun interface PfnCertStoreProvFreeFindCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: COpaquePointer?, pvstoreprovfindinfo: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCrl = PfnCertStoreProvFreeFindCrlFn?

public fun interface PfnCertStoreProvFreeFindCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: COpaquePointer?, pvstoreprovfindinfo: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCtl = PfnCertStoreProvFreeFindCtlFn?

public fun interface PfnCertStoreProvGetCertPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvGetCertProperty = PfnCertStoreProvGetCertPropertyFn?

public fun interface PfnCertStoreProvGetCrlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvGetCrlProperty = PfnCertStoreProvGetCrlPropertyFn?

public fun interface PfnCertStoreProvGetCtlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvGetCtlProperty = PfnCertStoreProvGetCtlPropertyFn?

public fun interface PfnCertStoreProvReadCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorecertcontext: COpaquePointer?, dwflags: UInt, ppprovcertcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvReadCert = PfnCertStoreProvReadCertFn?

public fun interface PfnCertStoreProvReadCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorecrlcontext: COpaquePointer?, dwflags: UInt, ppprovcrlcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvReadCrl = PfnCertStoreProvReadCrlFn?

public fun interface PfnCertStoreProvReadCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorectlcontext: COpaquePointer?, dwflags: UInt, ppprovctlcontext: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvReadCtl = PfnCertStoreProvReadCtlFn?

public fun interface PfnCertStoreProvSetCertPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvSetCertProperty = PfnCertStoreProvSetCertPropertyFn?

public fun interface PfnCertStoreProvSetCrlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvSetCrlProperty = PfnCertStoreProvSetCrlPropertyFn?

public fun interface PfnCertStoreProvSetCtlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool
}

public typealias PfnCertStoreProvSetCtlProperty = PfnCertStoreProvSetCtlPropertyFn?

public fun interface PfnCertStoreProvWriteCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCert = PfnCertStoreProvWriteCertFn?

public fun interface PfnCertStoreProvWriteCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCrl = PfnCertStoreProvWriteCrlFn?

public fun interface PfnCertStoreProvWriteCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCtl = PfnCertStoreProvWriteCtlFn?

public fun interface PfnCmsgAllocFn {
    public operator fun invoke(cb: ULong): COpaquePointer?
}

public typealias PfnCmsgAlloc = PfnCmsgAllocFn?

public fun interface PfnCmsgCngImportContentEncryptKeyFn {
    public operator fun invoke(pcngcontentdecryptinfo: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgCngImportContentEncryptKey = PfnCmsgCngImportContentEncryptKeyFn?

public fun interface PfnCmsgCngImportKeyAgreeFn {
    public operator fun invoke(pcngcontentdecryptinfo: COpaquePointer?, pkeyagreedecryptpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgCngImportKeyAgree = PfnCmsgCngImportKeyAgreeFn?

public fun interface PfnCmsgCngImportKeyTransFn {
    public operator fun invoke(pcngcontentdecryptinfo: COpaquePointer?, pkeytransdecryptpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgCngImportKeyTrans = PfnCmsgCngImportKeyTransFn?

public fun interface PfnCmsgExportEncryptKeyFn {
    public operator fun invoke(hcryptprov: ULong, hencryptkey: ULong, ppublickeyinfo: COpaquePointer?, pbdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool
}

public typealias PfnCmsgExportEncryptKey = PfnCmsgExportEncryptKeyFn?

public fun interface PfnCmsgExportKeyAgreeFn {
    public operator fun invoke(pcontentencryptinfo: COpaquePointer?, pkeyagreeencodeinfo: COpaquePointer?, pkeyagreeencryptinfo: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgExportKeyAgree = PfnCmsgExportKeyAgreeFn?

public fun interface PfnCmsgExportKeyTransFn {
    public operator fun invoke(pcontentencryptinfo: COpaquePointer?, pkeytransencodeinfo: COpaquePointer?, pkeytransencryptinfo: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgExportKeyTrans = PfnCmsgExportKeyTransFn?

public fun interface PfnCmsgExportMailListFn {
    public operator fun invoke(pcontentencryptinfo: COpaquePointer?, pmaillistencodeinfo: COpaquePointer?, pmaillistencryptinfo: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgExportMailList = PfnCmsgExportMailListFn?

public fun interface PfnCmsgFreeFn {
    public operator fun invoke(pv: COpaquePointer?)
}

public typealias PfnCmsgFree = PfnCmsgFreeFn?

public fun interface PfnCmsgGenContentEncryptKeyFn {
    public operator fun invoke(pcontentencryptinfo: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool
}

public typealias PfnCmsgGenContentEncryptKey = PfnCmsgGenContentEncryptKeyFn?

public fun interface PfnCmsgGenEncryptKeyFn {
    public operator fun invoke(phcryptprov: COpaquePointer?, paiencrypt: COpaquePointer?, pvencryptauxinfo: COpaquePointer?, ppublickeyinfo: COpaquePointer?, pfnalloc: PfnCmsgAlloc, phencryptkey: COpaquePointer?, ppbencryptparameters: COpaquePointer?, pcbencryptparameters: COpaquePointer?): Bool
}

public typealias PfnCmsgGenEncryptKey = PfnCmsgGenEncryptKeyFn?

public fun interface PfnCmsgImportEncryptKeyFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, paiencrypt: COpaquePointer?, paipubkey: COpaquePointer?, pbencodedkey: COpaquePointer?, cbencodedkey: UInt, phencryptkey: COpaquePointer?): Bool
}

public typealias PfnCmsgImportEncryptKey = PfnCmsgImportEncryptKeyFn?

public fun interface PfnCmsgImportKeyAgreeFn {
    public operator fun invoke(pcontentencryptionalgorithm: COpaquePointer?, pkeyagreedecryptpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, phcontentencryptkey: COpaquePointer?): Bool
}

public typealias PfnCmsgImportKeyAgree = PfnCmsgImportKeyAgreeFn?

public fun interface PfnCmsgImportKeyTransFn {
    public operator fun invoke(pcontentencryptionalgorithm: COpaquePointer?, pkeytransdecryptpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, phcontentencryptkey: COpaquePointer?): Bool
}

public typealias PfnCmsgImportKeyTrans = PfnCmsgImportKeyTransFn?

public fun interface PfnCmsgImportMailListFn {
    public operator fun invoke(pcontentencryptionalgorithm: COpaquePointer?, pmaillistdecryptpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, phcontentencryptkey: COpaquePointer?): Bool
}

public typealias PfnCmsgImportMailList = PfnCmsgImportMailListFn?

public fun interface PfnCmsgStreamOutputFn {
    public operator fun invoke(pvarg: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, ffinal: Bool): Bool
}

public typealias PfnCmsgStreamOutput = PfnCmsgStreamOutputFn?

public fun interface PfnCryptAllocFn {
    public operator fun invoke(cbsize: ULong): COpaquePointer?
}

public typealias PfnCryptAlloc = PfnCryptAllocFn?

public fun interface PfnCryptAsyncParamFreeFuncFn {
    public operator fun invoke(pszparamoid: Pcstr, pvparam: COpaquePointer?)
}

public typealias PfnCryptAsyncParamFreeFunc = PfnCryptAsyncParamFreeFuncFn?

public fun interface PfnCryptAsyncRetrievalCompletionFuncFn {
    public operator fun invoke(pvcompletion: COpaquePointer?, dwcompletioncode: UInt, pszurl: Pcstr, pszobjectoid: Pcstr, pvobject: COpaquePointer?)
}

public typealias PfnCryptAsyncRetrievalCompletionFunc = PfnCryptAsyncRetrievalCompletionFuncFn?

public fun interface PfnCryptCancelRetrievalFn {
    public operator fun invoke(dwflags: UInt, pvarg: COpaquePointer?): Bool
}

public typealias PfnCryptCancelRetrieval = PfnCryptCancelRetrievalFn?

public fun interface PfnCryptEnumKeyidPropFn {
    public operator fun invoke(pkeyidentifier: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pvarg: COpaquePointer?, cprop: UInt, rgdwpropid: COpaquePointer?, rgpvdata: COpaquePointer?, rgcbdata: COpaquePointer?): Bool
}

public typealias PfnCryptEnumKeyidProp = PfnCryptEnumKeyidPropFn?

public fun interface PfnCryptEnumOidFuncFn {
    public operator fun invoke(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, cvalue: UInt, rgdwvaluetype: COpaquePointer?, rgpwszvaluename: COpaquePointer?, rgpbvaluedata: COpaquePointer?, rgcbvaluedata: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCryptEnumOidFunc = PfnCryptEnumOidFuncFn?

public fun interface PfnCryptEnumOidInfoFn {
    public operator fun invoke(pinfo: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCryptEnumOidInfo = PfnCryptEnumOidInfoFn?

public fun interface PfnCryptExportPublicKeyInfoEx2FuncFn {
    public operator fun invoke(hncryptkey: NcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool
}

public typealias PfnCryptExportPublicKeyInfoEx2Func = PfnCryptExportPublicKeyInfoEx2FuncFn?

public fun interface PfnCryptExportPublicKeyInfoFromBcryptHandleFuncFn {
    public operator fun invoke(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool
}

public typealias PfnCryptExportPublicKeyInfoFromBcryptHandleFunc = PfnCryptExportPublicKeyInfoFromBcryptHandleFuncFn?

public fun interface PfnCryptExtractEncodedSignatureParametersFuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, psignaturealgorithm: COpaquePointer?, ppvdecodedsignpara: COpaquePointer?, ppwszcnghashalgid: COpaquePointer?): Bool
}

public typealias PfnCryptExtractEncodedSignatureParametersFunc = PfnCryptExtractEncodedSignatureParametersFuncFn?

public fun interface PfnCryptFreeFn {
    public operator fun invoke(pv: COpaquePointer?)
}

public typealias PfnCryptFree = PfnCryptFreeFn?

public fun interface PfnCryptGetSignerCertificateFn {
    public operator fun invoke(pvgetarg: COpaquePointer?, dwcertencodingtype: CertQueryEncodingType, psignerid: COpaquePointer?, hmsgcertstore: Hcertstore): COpaquePointer?
}

public typealias PfnCryptGetSignerCertificate = PfnCryptGetSignerCertificateFn?

public fun interface PfnCryptObjectLocatorProviderFlushFn {
    public operator fun invoke(pcontext: COpaquePointer?, rgidentifierornamelist: COpaquePointer?, dwidentifierornamelistcount: UInt): Bool
}

public typealias PfnCryptObjectLocatorProviderFlush = PfnCryptObjectLocatorProviderFlushFn?

public fun interface PfnCryptObjectLocatorProviderFreeFn {
    public operator fun invoke(pplugincontext: COpaquePointer?, pbdata: COpaquePointer?)
}

public typealias PfnCryptObjectLocatorProviderFree = PfnCryptObjectLocatorProviderFreeFn?

public fun interface PfnCryptObjectLocatorProviderFreeIdentifierFn {
    public operator fun invoke(pplugincontext: COpaquePointer?, pidentifier: COpaquePointer?)
}

public typealias PfnCryptObjectLocatorProviderFreeIdentifier = PfnCryptObjectLocatorProviderFreeIdentifierFn?

public fun interface PfnCryptObjectLocatorProviderFreePasswordFn {
    public operator fun invoke(pplugincontext: COpaquePointer?, pwszpassword: Pcwstr)
}

public typealias PfnCryptObjectLocatorProviderFreePassword = PfnCryptObjectLocatorProviderFreePasswordFn?

public fun interface PfnCryptObjectLocatorProviderGetFn {
    public operator fun invoke(pplugincontext: COpaquePointer?, pidentifier: COpaquePointer?, dwnametype: UInt, pnameblob: COpaquePointer?, ppbcontent: COpaquePointer?, pcbcontent: COpaquePointer?, ppwszpassword: COpaquePointer?, ppidentifier: COpaquePointer?): Bool
}

public typealias PfnCryptObjectLocatorProviderGet = PfnCryptObjectLocatorProviderGetFn?

public fun interface PfnCryptObjectLocatorProviderInitializeFn {
    public operator fun invoke(pfnflush: PfnCryptObjectLocatorProviderFlush, pcontext: COpaquePointer?, pdwexpectedobjectcount: COpaquePointer?, ppfunctable: COpaquePointer?, ppplugincontext: COpaquePointer?): Bool
}

public typealias PfnCryptObjectLocatorProviderInitialize = PfnCryptObjectLocatorProviderInitializeFn?

public fun interface PfnCryptObjectLocatorProviderReleaseFn {
    public operator fun invoke(dwreason: CryptObjectLocatorReleaseReason, pplugincontext: COpaquePointer?)
}

public typealias PfnCryptObjectLocatorProviderRelease = PfnCryptObjectLocatorProviderReleaseFn?

public fun interface PfnCryptSignAndEncodeHashFuncFn {
    public operator fun invoke(hkey: NcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, psignaturealgorithm: COpaquePointer?, pvdecodedsignpara: COpaquePointer?, pwszcngpubkeyalgid: Pcwstr, pwszcnghashalgid: Pcwstr, pbcomputedhash: COpaquePointer?, cbcomputedhash: UInt, pbsignature: COpaquePointer?, pcbsignature: COpaquePointer?): Bool
}

public typealias PfnCryptSignAndEncodeHashFunc = PfnCryptSignAndEncodeHashFuncFn?

public fun interface PfnCryptVerifyEncodedSignatureFuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, ppubkeyinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pvdecodedsignpara: COpaquePointer?, pwszcngpubkeyalgid: Pcwstr, pwszcnghashalgid: Pcwstr, pbcomputedhash: COpaquePointer?, cbcomputedhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt): Bool
}

public typealias PfnCryptVerifyEncodedSignatureFunc = PfnCryptVerifyEncodedSignatureFuncFn?

public fun interface PfnCryptXmlCreateTransformFn {
    public operator fun invoke(ptransform: COpaquePointer?, pproviderin: COpaquePointer?, pproviderout: COpaquePointer?): Hresult
}

public typealias PfnCryptXmlCreateTransform = PfnCryptXmlCreateTransformFn?

public fun interface PfnCryptXmlDataProviderCloseFn {
    public operator fun invoke(pvcallbackstate: COpaquePointer?): Hresult
}

public typealias PfnCryptXmlDataProviderClose = PfnCryptXmlDataProviderCloseFn?

public fun interface PfnCryptXmlDataProviderReadFn {
    public operator fun invoke(pvcallbackstate: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, pcbread: COpaquePointer?): Hresult
}

public typealias PfnCryptXmlDataProviderRead = PfnCryptXmlDataProviderReadFn?

public fun interface PfnCryptXmlEnumAlgInfoFn {
    public operator fun invoke(pinfo: COpaquePointer?, pvarg: COpaquePointer?): Bool
}

public typealias PfnCryptXmlEnumAlgInfo = PfnCryptXmlEnumAlgInfoFn?

public fun interface PfnCryptXmlWriteCallbackFn {
    public operator fun invoke(pvcallbackstate: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt): Hresult
}

public typealias PfnCryptXmlWriteCallback = PfnCryptXmlWriteCallbackFn?

public fun interface PfnCspAllocFn {
    public operator fun invoke(size: ULong): COpaquePointer?
}

public typealias PfnCspAlloc = PfnCspAllocFn?

public fun interface PfnCspCacheAddFileFn {
    public operator fun invoke(pvcachecontext: COpaquePointer?, wsztag: Pcwstr, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt): UInt
}

public typealias PfnCspCacheAddFile = PfnCspCacheAddFileFn?

public fun interface PfnCspCacheDeleteFileFn {
    public operator fun invoke(pvcachecontext: COpaquePointer?, wsztag: Pcwstr, dwflags: UInt): UInt
}

public typealias PfnCspCacheDeleteFile = PfnCspCacheDeleteFileFn?

public fun interface PfnCspCacheLookupFileFn {
    public operator fun invoke(pvcachecontext: COpaquePointer?, wsztag: Pcwstr, dwflags: UInt, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): UInt
}

public typealias PfnCspCacheLookupFile = PfnCspCacheLookupFileFn?

public fun interface PfnCspFreeFn {
    public operator fun invoke(address: COpaquePointer?)
}

public typealias PfnCspFree = PfnCspFreeFn?

public fun interface PfnCspGetDhAgreementFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hsecretagreement: COpaquePointer?, pbsecretagreementindex: COpaquePointer?, dwflags: UInt): UInt
}

public typealias PfnCspGetDhAgreement = PfnCspGetDhAgreementFn?

public fun interface PfnCspPadDataFn {
    public operator fun invoke(psigninginfo: COpaquePointer?, cbmaxwidth: UInt, pcbpaddedbuffer: COpaquePointer?, ppbpaddedbuffer: COpaquePointer?): UInt
}

public typealias PfnCspPadData = PfnCspPadDataFn?

public fun interface PfnCspReallocFn {
    public operator fun invoke(address: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias PfnCspRealloc = PfnCspReallocFn?

public fun interface PfnCspUnpadDataFn {
    public operator fun invoke(prsadecryptinfo: COpaquePointer?, pcbunpaddeddata: COpaquePointer?, ppbunpaddeddata: COpaquePointer?): UInt
}

public typealias PfnCspUnpadData = PfnCspUnpadDataFn?

public fun interface PfnExportPrivKeyFuncFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pprivatekeyinfo: COpaquePointer?, pcbprivatekeyinfo: COpaquePointer?): Bool
}

public typealias PfnExportPrivKeyFunc = PfnExportPrivKeyFuncFn?

public fun interface PfnFreeEncodedObjectFuncFn {
    public operator fun invoke(pszobjectoid: Pcstr, pobject: COpaquePointer?, pvfreecontext: COpaquePointer?)
}

public typealias PfnFreeEncodedObjectFunc = PfnFreeEncodedObjectFuncFn?

public fun interface PfnImportPrivKeyFuncFn {
    public operator fun invoke(hcryptprov: ULong, pprivatekeyinfo: COpaquePointer?, dwflags: UInt, pvauxinfo: COpaquePointer?): Bool
}

public typealias PfnImportPrivKeyFunc = PfnImportPrivKeyFuncFn?

public fun interface PfnImportPublicKeyInfoEx2FuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, dwflags: UInt, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool
}

public typealias PfnImportPublicKeyInfoEx2Func = PfnImportPublicKeyInfoEx2FuncFn?

public fun interface PfnMdEncryptDataFn {
    public operator fun invoke(pcarddata: COpaquePointer?, hkey: ULong, pwszsecurefunction: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt, ppencrypteddata: COpaquePointer?, pcencrypteddata: COpaquePointer?): UInt
}

public typealias PfnMdEncryptData = PfnMdEncryptDataFn?

public fun interface PfnMdImportSessionKeyFn {
    public operator fun invoke(pcarddata: COpaquePointer?, pwszblobtype: Pcwstr, pwszalgid: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt): UInt
}

public typealias PfnMdImportSessionKey = PfnMdImportSessionKeyFn?

public fun interface PfnNcryptAllocFn {
    public operator fun invoke(cbsize: ULong): COpaquePointer?
}

public typealias PfnNcryptAlloc = PfnNcryptAllocFn?

public fun interface PfnNcryptFreeFn {
    public operator fun invoke(pv: COpaquePointer?)
}

public typealias PfnNcryptFree = PfnNcryptFreeFn?

public fun interface PfnOffloadModExpoFn {
    public operator fun invoke(pbbase: COpaquePointer?, pbexponent: COpaquePointer?, cbexponent: UInt, pbmodulus: COpaquePointer?, cbmodulus: UInt, pbresult: COpaquePointer?, pvoffloadprivatekey: COpaquePointer?, dwflags: UInt): Bool
}

public typealias PfnOffloadModExpo = PfnOffloadModExpoFn?

public typealias PinCachePolicyType = Int

public typealias SecretPurpose = Int

public typealias SecretType = Int

public typealias SignerCertChoice = UInt

public typealias SignerCertPolicy = UInt

public typealias SignerPrivateKeyChoice = UInt

public typealias SignerSignatureAttributeChoice = UInt

public typealias SignerSignFlags = UInt

public typealias SignerSubjectChoice = UInt

public typealias SignerTimestampFlags = UInt

public fun interface SslComputeClientAuthHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslComputeClientAuthHashFn = SslComputeClientAuthHashFnFn?

public fun interface SslComputeEapKeyBlockFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: COpaquePointer?, cbrandoms: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslComputeEapKeyBlockFn = SslComputeEapKeyBlockFnFn?

public fun interface SslComputeFinishedHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult
}

public typealias SslComputeFinishedHashFn = SslComputeFinishedHashFnFn?

public fun interface SslComputeSessionHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslComputeSessionHashFn = SslComputeSessionHashFnFn?

public fun interface SslCreateClientAuthHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult
}

public typealias SslCreateClientAuthHashFn = SslCreateClientAuthHashFnFn?

public fun interface SslCreateEphemeralKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phephemeralkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: COpaquePointer?, cbparams: UInt, dwflags: UInt): Hresult
}

public typealias SslCreateEphemeralKeyFn = SslCreateEphemeralKeyFnFn?

public fun interface SslCreateHandshakeHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult
}

public typealias SslCreateHandshakeHashFn = SslCreateHandshakeHashFnFn?

public fun interface SslDecryptPacketFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwflags: UInt): Hresult
}

public typealias SslDecryptPacketFn = SslDecryptPacketFnFn?

public fun interface SslDuplicateTranscriptHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phduplicatetranscripthash: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslDuplicateTranscriptHashFn = SslDuplicateTranscriptHashFnFn?

public fun interface SslEncryptPacketFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult
}

public typealias SslEncryptPacketFn = SslEncryptPacketFnFn?

public fun interface SslEnumCipherSuitesExFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslEnumCipherSuitesExFn = SslEnumCipherSuitesExFnFn?

public fun interface SslEnumCipherSuitesFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslEnumCipherSuitesFn = SslEnumCipherSuitesFnFn?

public fun interface SslEnumEccCurvesFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, pecccurvecount: COpaquePointer?, ppecccurve: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslEnumEccCurvesFn = SslEnumEccCurvesFnFn?

public fun interface SslExpandBinderKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandBinderKeyFn = SslExpandBinderKeyFnFn?

public fun interface SslExpandExporterMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandExporterMasterKeyFn = SslExpandExporterMasterKeyFnFn?

public fun interface SslExpandPreSharedKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: COpaquePointer?, cbticketnonce: UInt, phpresharedkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandPreSharedKeyFn = SslExpandPreSharedKeyFnFn?

public fun interface SslExpandResumptionMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandResumptionMasterKeyFn = SslExpandResumptionMasterKeyFnFn?

public fun interface SslExpandTrafficKeysFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: COpaquePointer?, phservertraffickey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandTrafficKeysFn = SslExpandTrafficKeysFnFn?

public fun interface SslExpandWriteKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExpandWriteKeyFn = SslExpandWriteKeyFnFn?

public fun interface SslExportKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExportKeyFn = SslExportKeyFnFn?

public fun interface SslExportKeyingMaterialFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: COpaquePointer?, cbrandoms: UInt, pbcontextvalue: COpaquePointer?, cbcontextvalue: UShort, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult
}

public typealias SslExportKeyingMaterialFn = SslExportKeyingMaterialFnFn?

public fun interface SslExtractEarlyKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExtractEarlyKeyFn = SslExtractEarlyKeyFnFn?

public fun interface SslExtractHandshakeKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExtractHandshakeKeyFn = SslExtractHandshakeKeyFnFn?

public fun interface SslExtractMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslExtractMasterKeyFn = SslExtractMasterKeyFnFn?

public fun interface SslFreeBufferFnFn {
    public operator fun invoke(pvinput: COpaquePointer?): Hresult
}

public typealias SslFreeBufferFn = SslFreeBufferFnFn?

public fun interface SslFreeObjectFnFn {
    public operator fun invoke(hobject: NcryptHandle, dwflags: UInt): Hresult
}

public typealias SslFreeObjectFn = SslFreeObjectFnFn?

public fun interface SslGenerateMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslGenerateMasterKeyFn = SslGenerateMasterKeyFnFn?

public fun interface SslGeneratePreMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslGeneratePreMasterKeyFn = SslGeneratePreMasterKeyFnFn?

public fun interface SslGenerateSessionKeysFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: COpaquePointer?, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslGenerateSessionKeysFn = SslGenerateSessionKeysFnFn?

public fun interface SslGetCipherSuitePRFHashAlgorithmFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult
}

public typealias SslGetCipherSuitePRFHashAlgorithmFn = SslGetCipherSuitePRFHashAlgorithmFnFn?

public fun interface SslGetKeyPropertyFnFn {
    public operator fun invoke(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslGetKeyPropertyFn = SslGetKeyPropertyFnFn?

public fun interface SslGetProviderPropertyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslGetProviderPropertyFn = SslGetProviderPropertyFnFn?

public fun interface SslHashHandshakeFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias SslHashHandshakeFn = SslHashHandshakeFnFn?

public fun interface SslImportKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phkey: COpaquePointer?, pszblobtype: Pcwstr, pbkeyblob: COpaquePointer?, cbkeyblob: UInt, dwflags: UInt): Hresult
}

public typealias SslImportKeyFn = SslImportKeyFnFn?

public fun interface SslImportMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pbencryptedkey: COpaquePointer?, cbencryptedkey: UInt, dwflags: UInt): Hresult
}

public typealias SslImportMasterKeyFn = SslImportMasterKeyFnFn?

public fun interface SslInitializeInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pfunctiontable: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslInitializeInterfaceFn = SslInitializeInterfaceFnFn?

public fun interface SslLookupCipherLengthsFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: COpaquePointer?, cbcipherlengths: UInt, dwflags: UInt): Hresult
}

public typealias SslLookupCipherLengthsFn = SslLookupCipherLengthsFnFn?

public fun interface SslLookupCipherSuiteInfoFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslLookupCipherSuiteInfoFn = SslLookupCipherSuiteInfoFnFn?

public fun interface SslOpenPrivateKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phprivatekey: COpaquePointer?, pcertcontext: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslOpenPrivateKeyFn = SslOpenPrivateKeyFnFn?

public fun interface SslOpenProviderFnFn {
    public operator fun invoke(phsslprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult
}

public typealias SslOpenProviderFn = SslOpenProviderFnFn?

public fun interface SslSignHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult
}

public typealias SslSignHashFn = SslSignHashFnFn?

public fun interface SslVerifySignatureFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult
}

public typealias SslVerifySignatureFn = SslVerifySignatureFnFn?
