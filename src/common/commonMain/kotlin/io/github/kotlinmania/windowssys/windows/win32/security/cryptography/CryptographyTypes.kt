package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public typealias BcryptAlgHandle = MutPtr

public typealias BcryptDhKeyBlobMagic = UInt

public typealias BcryptDsaMagic = UInt

public typealias BcryptFlags = UInt

public typealias BcryptHandle = MutPtr

public typealias BcryptHashHandle = MutPtr

public typealias BcryptHashOperationType = Int

public typealias BcryptInterface = UInt

public typealias BcryptKeyHandle = MutPtr

public typealias BcryptMultiOperationType = Int

public typealias BcryptOpenAlgorithmProviderFlags = UInt

public typealias BcryptOperation = UInt

public typealias BcryptQueryProviderMode = UInt

public typealias BcryptResolveProvidersFlags = UInt

public typealias BcryptRsakeyBlobMagic = UInt

public typealias BcryptSecretHandle = MutPtr

public typealias BcryptTable = UInt

public fun interface BCryptCloseAlgorithmProviderFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus
}

public typealias BCryptCloseAlgorithmProviderFn = BCryptCloseAlgorithmProviderFnFn?

public fun interface BCryptCreateHashFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptCreateHashFn = BCryptCreateHashFnFn?

public fun interface BCryptCreateMultiHashFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phhash: MutPtr, nhashes: UInt, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptCreateMultiHashFn = BCryptCreateMultiHashFnFn?

public fun interface BCryptDecryptFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptDecryptFn = BCryptDecryptFnFn?

public fun interface BCryptDeriveKeyCapiFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDeriveKeyCapiFn = BCryptDeriveKeyCapiFnFn?

public fun interface BCryptDeriveKeyFnFn {
    public operator fun invoke(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptDeriveKeyFn = BCryptDeriveKeyFnFn?

public fun interface BCryptDeriveKeyPBKDF2FnFn {
    public operator fun invoke(hprf: BcryptAlgHandle, pbpassword: ConstPtr, cbpassword: UInt, pbsalt: ConstPtr, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus
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
    public operator fun invoke(hhash: BcryptHashHandle, phnewhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDuplicateHashFn = BCryptDuplicateHashFnFn?

public fun interface BCryptDuplicateKeyFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, phnewkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptDuplicateKeyFn = BCryptDuplicateKeyFnFn?

public fun interface BCryptEncryptFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptEncryptFn = BCryptEncryptFnFn?

public fun interface BCryptExportKeyFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptExportKeyFn = BCryptExportKeyFnFn?

public fun interface BCryptFinalizeKeyPairFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus
}

public typealias BCryptFinalizeKeyPairFn = BCryptFinalizeKeyPairFnFn?

public fun interface BCryptFinishHashFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptFinishHashFn = BCryptFinishHashFnFn?

public fun interface BCryptFreeBufferFnFn {
    public operator fun invoke(pvbuffer: ConstPtr)
}

public typealias BCryptFreeBufferFn = BCryptFreeBufferFnFn?

public fun interface BCryptGenRandomFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr, cbbuffer: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenRandomFn = BCryptGenRandomFnFn?

public fun interface BCryptGenerateKeyPairFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phkey: MutPtr, dwlength: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenerateKeyPairFn = BCryptGenerateKeyPairFnFn?

public fun interface BCryptGenerateSymmetricKeyFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptGenerateSymmetricKeyFn = BCryptGenerateSymmetricKeyFnFn?

public fun interface BCryptGetPropertyFnFn {
    public operator fun invoke(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptGetPropertyFn = BCryptGetPropertyFnFn?

public fun interface BCryptHashDataFnFn {
    public operator fun invoke(hhash: BcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptHashDataFn = BCryptHashDataFnFn?

public fun interface BCryptImportKeyFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptImportKeyFn = BCryptImportKeyFnFn?

public fun interface BCryptImportKeyPairFnFn {
    public operator fun invoke(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptImportKeyPairFn = BCryptImportKeyPairFnFn?

public fun interface BCryptKeyDerivationFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptKeyDerivationFn = BCryptKeyDerivationFnFn?

public fun interface BCryptOpenAlgorithmProviderFnFn {
    public operator fun invoke(phalgorithm: MutPtr, pszalgid: Pcwstr, dwflags: UInt): Ntstatus
}

public typealias BCryptOpenAlgorithmProviderFn = BCryptOpenAlgorithmProviderFnFn?

public fun interface BCryptProcessMultiOperationsFnFn {
    public operator fun invoke(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr, cboperations: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptProcessMultiOperationsFn = BCryptProcessMultiOperationsFnFn?

public fun interface BCryptSecretAgreementFnFn {
    public operator fun invoke(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptSecretAgreementFn = BCryptSecretAgreementFnFn?

public fun interface BCryptSetPropertyFnFn {
    public operator fun invoke(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus
}

public typealias BCryptSetPropertyFn = BCryptSetPropertyFnFn?

public fun interface BCryptSignHashFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus
}

public typealias BCryptSignHashFn = BCryptSignHashFnFn?

public fun interface BCryptVerifySignatureFnFn {
    public operator fun invoke(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbhash: ConstPtr, cbhash: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Ntstatus
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
    public operator fun invoke(phwnd: MutPtr)
}

public typealias CryptReturnHwnd = CryptReturnHwndFn?

public typealias CryptSetHashParam = UInt

public typealias CryptSetProvParamId = UInt

public typealias CryptString = UInt

public typealias CryptTimestampResponseStatus = UInt

public typealias CryptTimestampVersion = UInt

public typealias CryptVerifyCertFlags = UInt

public fun interface CryptVerifyImageAFn {
    public operator fun invoke(szimage: Pcstr, pbsigdata: ConstPtr): Bool
}

public typealias CryptVerifyImageA = CryptVerifyImageAFn?

public fun interface CryptVerifyImageWFn {
    public operator fun invoke(szimage: Pcwstr, pbsigdata: ConstPtr): Bool
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
    public operator fun invoke(hdigest: ConstPtr): Hresult
}

public typealias CryptXmlDllCloseDigest = CryptXmlDllCloseDigestFn?

public fun interface CryptXmlDllCreateDigestFn {
    public operator fun invoke(pdigestmethod: ConstPtr, pcbsize: MutPtr, phdigest: MutPtr): Hresult
}

public typealias CryptXmlDllCreateDigest = CryptXmlDllCreateDigestFn?

public fun interface CryptXmlDllCreateKeyFn {
    public operator fun invoke(pencoded: ConstPtr, phkey: MutPtr): Hresult
}

public typealias CryptXmlDllCreateKey = CryptXmlDllCreateKeyFn?

public fun interface CryptXmlDllDigestDataFn {
    public operator fun invoke(hdigest: ConstPtr, pbdata: ConstPtr, cbdata: UInt): Hresult
}

public typealias CryptXmlDllDigestData = CryptXmlDllDigestDataFn?

public fun interface CryptXmlDllEncodeAlgorithmFn {
    public operator fun invoke(palginfo: ConstPtr, dwcharset: CryptXmlCharset, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult
}

public typealias CryptXmlDllEncodeAlgorithm = CryptXmlDllEncodeAlgorithmFn?

public fun interface CryptXmlDllEncodeKeyValueFn {
    public operator fun invoke(hkey: NcryptKeyHandle, dwcharset: CryptXmlCharset, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult
}

public typealias CryptXmlDllEncodeKeyValue = CryptXmlDllEncodeKeyValueFn?

public fun interface CryptXmlDllFinalizeDigestFn {
    public operator fun invoke(hdigest: ConstPtr, pbdigest: MutPtr, cbdigest: UInt): Hresult
}

public typealias CryptXmlDllFinalizeDigest = CryptXmlDllFinalizeDigestFn?

public fun interface CryptXmlDllGetAlgorithmInfoFn {
    public operator fun invoke(pxmlalgorithm: ConstPtr, ppalginfo: MutPtr): Hresult
}

public typealias CryptXmlDllGetAlgorithmInfo = CryptXmlDllGetAlgorithmInfoFn?

public fun interface CryptXmlDllGetInterfaceFn {
    public operator fun invoke(dwflags: UInt, pmethod: ConstPtr, pinterface: MutPtr): Hresult
}

public typealias CryptXmlDllGetInterface = CryptXmlDllGetInterfaceFn?

public fun interface CryptXmlDllSignDataFn {
    public operator fun invoke(psignaturemethod: ConstPtr, hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr): Hresult
}

public typealias CryptXmlDllSignData = CryptXmlDllSignDataFn?

public fun interface CryptXmlDllVerifySignatureFn {
    public operator fun invoke(psignaturemethod: ConstPtr, hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pbsignature: ConstPtr, cbsignature: UInt): Hresult
}

public typealias CryptXmlDllVerifySignature = CryptXmlDllVerifySignatureFn?

public typealias DsafipsversionEnum = Int

public typealias Direction = Int

public typealias EccCurveAlgIdEnum = Int

public typealias EccCurveTypeEnum = Int

public fun interface GetAsymmetricEncryptionInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetAsymmetricEncryptionInterfaceFn = GetAsymmetricEncryptionInterfaceFnFn?

public fun interface GetCipherInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetCipherInterfaceFn = GetCipherInterfaceFnFn?

public fun interface GetHashInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetHashInterfaceFn = GetHashInterfaceFnFn?

public fun interface GetKeyDerivationInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetKeyDerivationInterfaceFn = GetKeyDerivationInterfaceFnFn?

public fun interface GetKeyStorageInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetKeyStorageInterfaceFn = GetKeyStorageInterfaceFnFn?

public fun interface GetRngInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetRngInterfaceFn = GetRngInterfaceFnFn?

public fun interface GetSChannelInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetSChannelInterfaceFn = GetSChannelInterfaceFnFn?

public fun interface GetSecretAgreementInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetSecretAgreementInterfaceFn = GetSecretAgreementInterfaceFnFn?

public fun interface GetSignatureInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus
}

public typealias GetSignatureInterfaceFn = GetSignatureInterfaceFnFn?

public typealias HashalgorithmEnum = Int

public typealias Hcertchainengine = MutPtr

public typealias Hcertstore = MutPtr

public typealias Hcertstoreprov = MutPtr

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
    public operator fun invoke(hprov: NcryptProvHandle, hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: MutPtr, cbclaimblob: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptCreateClaimFn = NCryptCreateClaimFnFn?

public fun interface NCryptCreatePersistedKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phkey: MutPtr, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: UInt, dwflags: UInt): Hresult
}

public typealias NCryptCreatePersistedKeyFn = NCryptCreatePersistedKeyFnFn?

public fun interface NCryptDecryptFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptDecryptFn = NCryptDecryptFnFn?

public fun interface NCryptDeleteKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, dwflags: UInt): Hresult
}

public typealias NCryptDeleteKeyFn = NCryptDeleteKeyFnFn?

public fun interface NCryptDeriveKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptDeriveKeyFn = NCryptDeriveKeyFnFn?

public fun interface NCryptEncryptFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptEncryptFn = NCryptEncryptFnFn?

public fun interface NCryptEnumAlgorithmsFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, dwalgclass: UInt, pdwalgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptEnumAlgorithmsFn = NCryptEnumAlgorithmsFnFn?

public fun interface NCryptEnumKeysFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptEnumKeysFn = NCryptEnumKeysFnFn?

public fun interface NCryptEnumStorageProvidersFnFn {
    public operator fun invoke(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptEnumStorageProvidersFn = NCryptEnumStorageProvidersFnFn?

public fun interface NCryptExportKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptExportKeyFn = NCryptExportKeyFnFn?

public fun interface NCryptFinalizeKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, dwflags: UInt): Hresult
}

public typealias NCryptFinalizeKeyFn = NCryptFinalizeKeyFnFn?

public fun interface NCryptFreeBufferFnFn {
    public operator fun invoke(pvinput: MutPtr): Hresult
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
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptGetKeyPropertyFn = NCryptGetKeyPropertyFnFn?

public fun interface NCryptGetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptGetProviderPropertyFn = NCryptGetProviderPropertyFnFn?

public fun interface NCryptImportKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, phkey: MutPtr, pbdata: ConstPtr, cbdata: UInt, dwflags: UInt): Hresult
}

public typealias NCryptImportKeyFn = NCryptImportKeyFnFn?

public fun interface NCryptIsAlgSupportedFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptIsAlgSupportedFn = NCryptIsAlgSupportedFnFn?

public fun interface NCryptKeyDerivationFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptKeyDerivationFn = NCryptKeyDerivationFnFn?

public fun interface NCryptNotifyChangeKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phevent: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptNotifyChangeKeyFn = NCryptNotifyChangeKeyFnFn?

public fun interface NCryptOpenKeyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, phkey: MutPtr, pszkeyname: Pcwstr, dwlegacykeyspec: UInt, dwflags: UInt): Hresult
}

public typealias NCryptOpenKeyFn = NCryptOpenKeyFnFn?

public fun interface NCryptOpenStorageProviderFnFn {
    public operator fun invoke(phprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptOpenStorageProviderFn = NCryptOpenStorageProviderFnFn?

public fun interface NCryptPromptUserFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszoperation: Pcwstr, dwflags: UInt): Hresult
}

public typealias NCryptPromptUserFn = NCryptPromptUserFnFn?

public fun interface NCryptSecretAgreementFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptSecretAgreementFn = NCryptSecretAgreementFnFn?

public fun interface NCryptSetKeyPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias NCryptSetKeyPropertyFn = NCryptSetKeyPropertyFnFn?

public fun interface NCryptSetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias NCryptSetProviderPropertyFn = NCryptSetProviderPropertyFnFn?

public fun interface NCryptSignHashFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptSignHashFn = NCryptSignHashFnFn?

public fun interface NCryptVerifyClaimFnFn {
    public operator fun invoke(hprov: NcryptProvHandle, hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: ConstPtr, cbclaimblob: UInt, poutput: MutPtr, dwflags: UInt): Hresult
}

public typealias NCryptVerifyClaimFn = NCryptVerifyClaimFnFn?

public fun interface NCryptVerifySignatureFnFn {
    public operator fun invoke(hprovider: NcryptProvHandle, hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult
}

public typealias NCryptVerifySignatureFn = NCryptVerifySignatureFnFn?

public fun interface PcryptDecryptPrivateKeyFuncFn {
    public operator fun invoke(algorithm: CryptAlgorithmIdentifier, encryptedprivatekey: CryptIntegerBlob, pbcleartextkey: MutPtr, pcbcleartextkey: MutPtr, pvoiddecryptfunc: ConstPtr): Bool
}

public typealias PcryptDecryptPrivateKeyFunc = PcryptDecryptPrivateKeyFuncFn?

public fun interface PcryptEncryptPrivateKeyFuncFn {
    public operator fun invoke(palgorithm: MutPtr, pcleartextprivatekey: ConstPtr, pbencryptedkey: MutPtr, pcbencryptedkey: MutPtr, pvoidencryptfunc: ConstPtr): Bool
}

public typealias PcryptEncryptPrivateKeyFunc = PcryptEncryptPrivateKeyFuncFn?

public fun interface PcryptResolveHcryptprovFuncFn {
    public operator fun invoke(pprivatekeyinfo: MutPtr, phcryptprov: MutPtr, pvoidresolvefunc: MutPtr): Bool
}

public typealias PcryptResolveHcryptprovFunc = PcryptResolveHcryptprovFuncFn?

public fun interface PFNCryptStreamOutputCallbackFn {
    public operator fun invoke(pvcallbackctxt: ConstPtr, pbdata: ConstPtr, cbdata: ULong, ffinal: Bool): Hresult
}

public typealias PFNCryptStreamOutputCallback = PFNCryptStreamOutputCallbackFn?

public fun interface PFNCryptStreamOutputCallbackExFn {
    public operator fun invoke(pvcallbackctxt: ConstPtr, pbdata: ConstPtr, cbdata: ULong, hdescriptor: NcryptDescriptorHandle, ffinal: Bool): Hresult
}

public typealias PFNCryptStreamOutputCallbackEx = PFNCryptStreamOutputCallbackExFn?

public fun interface PfnAuthenticodeDigestSignFn {
    public operator fun invoke(psigningcert: ConstPtr, pmetadatablob: ConstPtr, digestalgid: AlgId, pbtobesigneddigest: ConstPtr, cbtobesigneddigest: UInt, psigneddigest: MutPtr): Hresult
}

public typealias PfnAuthenticodeDigestSign = PfnAuthenticodeDigestSignFn?

public fun interface PfnAuthenticodeDigestSignExFn {
    public operator fun invoke(pmetadatablob: ConstPtr, digestalgid: AlgId, pbtobesigneddigest: ConstPtr, cbtobesigneddigest: UInt, psigneddigest: MutPtr, ppsignercert: MutPtr, hcertchainstore: Hcertstore): Hresult
}

public typealias PfnAuthenticodeDigestSignEx = PfnAuthenticodeDigestSignExFn?

public fun interface PfnAuthenticodeDigestSignExWithfilehandleFn {
    public operator fun invoke(pmetadatablob: ConstPtr, digestalgid: AlgId, pbtobesigneddigest: ConstPtr, cbtobesigneddigest: UInt, hfile: Handle, psigneddigest: MutPtr, ppsignercert: MutPtr, hcertchainstore: Hcertstore): Hresult
}

public typealias PfnAuthenticodeDigestSignExWithfilehandle = PfnAuthenticodeDigestSignExWithfilehandleFn?

public fun interface PfnAuthenticodeDigestSignWithfilehandleFn {
    public operator fun invoke(psigningcert: ConstPtr, pmetadatablob: ConstPtr, digestalgid: AlgId, pbtobesigneddigest: ConstPtr, cbtobesigneddigest: UInt, hfile: Handle, psigneddigest: MutPtr): Hresult
}

public typealias PfnAuthenticodeDigestSignWithfilehandle = PfnAuthenticodeDigestSignWithfilehandleFn?

public fun interface PfnCancelAsyncRetrievalFuncFn {
    public operator fun invoke(hasyncretrieve: Hcryptasync): Bool
}

public typealias PfnCancelAsyncRetrievalFunc = PfnCancelAsyncRetrievalFuncFn?

public fun interface PfnCardAcquireContextFn {
    public operator fun invoke(pcarddata: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardAcquireContext = PfnCardAcquireContextFn?

public fun interface PfnCardAuthenticateChallengeFn {
    public operator fun invoke(pcarddata: ConstPtr, pbresponsedata: ConstPtr, cbresponsedata: UInt, pcattemptsremaining: MutPtr): UInt
}

public typealias PfnCardAuthenticateChallenge = PfnCardAuthenticateChallengeFn?

public fun interface PfnCardAuthenticateExFn {
    public operator fun invoke(pcarddata: ConstPtr, pinid: UInt, dwflags: UInt, pbpindata: ConstPtr, cbpindata: UInt, ppbsessionpin: MutPtr, pcbsessionpin: MutPtr, pcattemptsremaining: MutPtr): UInt
}

public typealias PfnCardAuthenticateEx = PfnCardAuthenticateExFn?

public fun interface PfnCardAuthenticatePinFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszuserid: Pcwstr, pbpin: ConstPtr, cbpin: UInt, pcattemptsremaining: MutPtr): UInt
}

public typealias PfnCardAuthenticatePin = PfnCardAuthenticatePinFn?

public fun interface PfnCardChangeAuthenticatorFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszuserid: Pcwstr, pbcurrentauthenticator: ConstPtr, cbcurrentauthenticator: UInt, pbnewauthenticator: ConstPtr, cbnewauthenticator: UInt, cretrycount: UInt, dwflags: UInt, pcattemptsremaining: MutPtr): UInt
}

public typealias PfnCardChangeAuthenticator = PfnCardChangeAuthenticatorFn?

public fun interface PfnCardChangeAuthenticatorExFn {
    public operator fun invoke(pcarddata: ConstPtr, dwflags: UInt, dwauthenticatingpinid: UInt, pbauthenticatingpindata: ConstPtr, cbauthenticatingpindata: UInt, dwtargetpinid: UInt, pbtargetdata: ConstPtr, cbtargetdata: UInt, cretrycount: UInt, pcattemptsremaining: MutPtr): UInt
}

public typealias PfnCardChangeAuthenticatorEx = PfnCardChangeAuthenticatorExFn?

public fun interface PfnCardConstructDhAgreementFn {
    public operator fun invoke(pcarddata: ConstPtr, pagreementinfo: MutPtr): UInt
}

public typealias PfnCardConstructDhAgreement = PfnCardConstructDhAgreementFn?

public fun interface PfnCardCreateContainerFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: ConstPtr): UInt
}

public typealias PfnCardCreateContainer = PfnCardCreateContainerFn?

public fun interface PfnCardCreateContainerExFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: ConstPtr, pinid: UInt): UInt
}

public typealias PfnCardCreateContainerEx = PfnCardCreateContainerExFn?

public fun interface PfnCardCreateDirectoryFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, accesscondition: CardDirectoryAccessCondition): UInt
}

public typealias PfnCardCreateDirectory = PfnCardCreateDirectoryFn?

public fun interface PfnCardCreateFileFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pszfilename: Pcstr, cbinitialcreationsize: UInt, accesscondition: CardFileAccessCondition): UInt
}

public typealias PfnCardCreateFile = PfnCardCreateFileFn?

public fun interface PfnCardDeauthenticateFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszuserid: Pcwstr, dwflags: UInt): UInt
}

public typealias PfnCardDeauthenticate = PfnCardDeauthenticateFn?

public fun interface PfnCardDeauthenticateExFn {
    public operator fun invoke(pcarddata: ConstPtr, pinid: UInt, dwflags: UInt): UInt
}

public typealias PfnCardDeauthenticateEx = PfnCardDeauthenticateExFn?

public fun interface PfnCardDeleteContainerFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, dwreserved: UInt): UInt
}

public typealias PfnCardDeleteContainer = PfnCardDeleteContainerFn?

public fun interface PfnCardDeleteContextFn {
    public operator fun invoke(pcarddata: MutPtr): UInt
}

public typealias PfnCardDeleteContext = PfnCardDeleteContextFn?

public fun interface PfnCardDeleteDirectoryFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr): UInt
}

public typealias PfnCardDeleteDirectory = PfnCardDeleteDirectoryFn?

public fun interface PfnCardDeleteFileFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt): UInt
}

public typealias PfnCardDeleteFile = PfnCardDeleteFileFn?

public fun interface PfnCardDeriveKeyFn {
    public operator fun invoke(pcarddata: ConstPtr, pagreementinfo: MutPtr): UInt
}

public typealias PfnCardDeriveKey = PfnCardDeriveKeyFn?

public fun interface PfnCardDestroyDhAgreementFn {
    public operator fun invoke(pcarddata: ConstPtr, bsecretagreementindex: UByte, dwflags: UInt): UInt
}

public typealias PfnCardDestroyDhAgreement = PfnCardDestroyDhAgreementFn?

public fun interface PfnCardDestroyKeyFn {
    public operator fun invoke(pcarddata: ConstPtr, hkey: ULong): UInt
}

public typealias PfnCardDestroyKey = PfnCardDestroyKeyFn?

public fun interface PfnCardEnumFilesFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pmszfilenames: MutPtr, pdwcbfilename: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardEnumFiles = PfnCardEnumFilesFn?

public fun interface PfnCardGetAlgorithmPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszalgid: Pcwstr, pwszproperty: Pcwstr, pbdata: MutPtr, cbdata: UInt, pdwdatalen: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardGetAlgorithmProperty = PfnCardGetAlgorithmPropertyFn?

public fun interface PfnCardGetChallengeFn {
    public operator fun invoke(pcarddata: ConstPtr, ppbchallengedata: MutPtr, pcbchallengedata: MutPtr): UInt
}

public typealias PfnCardGetChallenge = PfnCardGetChallengeFn?

public fun interface PfnCardGetChallengeExFn {
    public operator fun invoke(pcarddata: ConstPtr, pinid: UInt, ppbchallengedata: MutPtr, pcbchallengedata: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardGetChallengeEx = PfnCardGetChallengeExFn?

public fun interface PfnCardGetContainerInfoFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, dwflags: UInt, pcontainerinfo: MutPtr): UInt
}

public typealias PfnCardGetContainerInfo = PfnCardGetContainerInfoFn?

public fun interface PfnCardGetContainerPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, wszproperty: Pcwstr, pbdata: MutPtr, cbdata: UInt, pdwdatalen: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardGetContainerProperty = PfnCardGetContainerPropertyFn?

public fun interface PfnCardGetFileInfoFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pszfilename: Pcstr, pcardfileinfo: MutPtr): UInt
}

public typealias PfnCardGetFileInfo = PfnCardGetFileInfoFn?

public fun interface PfnCardGetKeyPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, hkey: ULong, pwszproperty: Pcwstr, pbdata: MutPtr, cbdata: UInt, pdwdatalen: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardGetKeyProperty = PfnCardGetKeyPropertyFn?

public fun interface PfnCardGetPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, wszproperty: Pcwstr, pbdata: MutPtr, cbdata: UInt, pdwdatalen: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardGetProperty = PfnCardGetPropertyFn?

public fun interface PfnCardGetSharedKeyHandleFn {
    public operator fun invoke(pcarddata: ConstPtr, pbinput: ConstPtr, cbinput: UInt, ppboutput: MutPtr, pcboutput: MutPtr, phkey: MutPtr): UInt
}

public typealias PfnCardGetSharedKeyHandle = PfnCardGetSharedKeyHandleFn?

public fun interface PfnCardImportSessionKeyFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, ppaddinginfo: ConstPtr, pwszblobtype: Pcwstr, pwszalgid: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PfnCardImportSessionKey = PfnCardImportSessionKeyFn?

public fun interface PfnCardProcessEncryptedDataFn {
    public operator fun invoke(pcarddata: ConstPtr, hkey: ULong, pwszsecurefunction: Pcwstr, pencrypteddata: ConstPtr, cencrypteddata: UInt, pboutput: MutPtr, cboutput: UInt, pdwoutputlen: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCardProcessEncryptedData = PfnCardProcessEncryptedDataFn?

public fun interface PfnCardQueryCapabilitiesFn {
    public operator fun invoke(pcarddata: ConstPtr, pcardcapabilities: MutPtr): UInt
}

public typealias PfnCardQueryCapabilities = PfnCardQueryCapabilitiesFn?

public fun interface PfnCardQueryFreeSpaceFn {
    public operator fun invoke(pcarddata: ConstPtr, dwflags: UInt, pcardfreespaceinfo: MutPtr): UInt
}

public typealias PfnCardQueryFreeSpace = PfnCardQueryFreeSpaceFn?

public fun interface PfnCardQueryKeySizesFn {
    public operator fun invoke(pcarddata: ConstPtr, dwkeyspec: UInt, dwflags: UInt, pkeysizes: MutPtr): UInt
}

public typealias PfnCardQueryKeySizes = PfnCardQueryKeySizesFn?

public fun interface PfnCardReadFileFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt, ppbdata: MutPtr, pcbdata: MutPtr): UInt
}

public typealias PfnCardReadFile = PfnCardReadFileFn?

public fun interface PfnCardRsaDecryptFn {
    public operator fun invoke(pcarddata: ConstPtr, pinfo: MutPtr): UInt
}

public typealias PfnCardRsaDecrypt = PfnCardRsaDecryptFn?

public fun interface PfnCardSetContainerPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, bcontainerindex: UByte, wszproperty: Pcwstr, pbdata: ConstPtr, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetContainerProperty = PfnCardSetContainerPropertyFn?

public fun interface PfnCardSetKeyPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, hkey: ULong, pwszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetKeyProperty = PfnCardSetKeyPropertyFn?

public fun interface PfnCardSetPropertyFn {
    public operator fun invoke(pcarddata: ConstPtr, wszproperty: Pcwstr, pbdata: ConstPtr, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PfnCardSetProperty = PfnCardSetPropertyFn?

public fun interface PfnCardSignDataFn {
    public operator fun invoke(pcarddata: ConstPtr, pinfo: MutPtr): UInt
}

public typealias PfnCardSignData = PfnCardSignDataFn?

public fun interface PfnCardUnblockPinFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszuserid: Pcwstr, pbauthenticationdata: ConstPtr, cbauthenticationdata: UInt, pbnewpindata: ConstPtr, cbnewpindata: UInt, cretrycount: UInt, dwflags: UInt): UInt
}

public typealias PfnCardUnblockPin = PfnCardUnblockPinFn?

public fun interface PfnCardWriteFileFn {
    public operator fun invoke(pcarddata: ConstPtr, pszdirectoryname: Pcstr, pszfilename: Pcstr, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt): UInt
}

public typealias PfnCardWriteFile = PfnCardWriteFileFn?

public fun interface PfnCertChainFindByIssuerCallbackFn {
    public operator fun invoke(pcert: ConstPtr, pvfindarg: MutPtr): Bool
}

public typealias PfnCertChainFindByIssuerCallback = PfnCertChainFindByIssuerCallbackFn?

public fun interface PfnCertCreateContextSortFuncFn {
    public operator fun invoke(cbtotalencoded: UInt, cbremainencoded: UInt, centry: UInt, pvsort: MutPtr): Bool
}

public typealias PfnCertCreateContextSortFunc = PfnCertCreateContextSortFuncFn?

public fun interface PfnCertDllOpenStoreProvFuncFn {
    public operator fun invoke(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr, hcertstore: Hcertstore, pstoreprovinfo: MutPtr): Bool
}

public typealias PfnCertDllOpenStoreProvFunc = PfnCertDllOpenStoreProvFuncFn?

public fun interface PfnCertEnumPhysicalStoreFn {
    public operator fun invoke(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr, pvreserved: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCertEnumPhysicalStore = PfnCertEnumPhysicalStoreFn?

public fun interface PfnCertEnumSystemStoreFn {
    public operator fun invoke(pvsystemstore: ConstPtr, dwflags: CertSystemStoreFlags, pstoreinfo: ConstPtr, pvreserved: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCertEnumSystemStore = PfnCertEnumSystemStoreFn?

public fun interface PfnCertEnumSystemStoreLocationFn {
    public operator fun invoke(pwszstorelocation: Pcwstr, dwflags: UInt, pvreserved: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCertEnumSystemStoreLocation = PfnCertEnumSystemStoreLocationFn?

public fun interface PfnCertIsWeakHashFn {
    public operator fun invoke(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr, ptimestamp: ConstPtr, pwszfilename: Pcwstr): Bool
}

public typealias PfnCertIsWeakHash = PfnCertIsWeakHashFn?

public fun interface PfnCertServerOcspResponseUpdateCallbackFn {
    public operator fun invoke(pchaincontext: ConstPtr, pserverocspresponsecontext: ConstPtr, pnewcrlcontext: ConstPtr, pprevcrlcontext: ConstPtr, pvarg: MutPtr, dwwriteocspfileerror: UInt)
}

public typealias PfnCertServerOcspResponseUpdateCallback = PfnCertServerOcspResponseUpdateCallbackFn?

public fun interface PfnCertStoreProvCloseFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, dwflags: UInt)
}

public typealias PfnCertStoreProvClose = PfnCertStoreProvCloseFn?

public fun interface PfnCertStoreProvControlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool
}

public typealias PfnCertStoreProvControl = PfnCertStoreProvControlFn?

public fun interface PfnCertStoreProvDeleteCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCert = PfnCertStoreProvDeleteCertFn?

public fun interface PfnCertStoreProvDeleteCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCrl = PfnCertStoreProvDeleteCrlFn?

public fun interface PfnCertStoreProvDeleteCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvDeleteCtl = PfnCertStoreProvDeleteCtlFn?

public fun interface PfnCertStoreProvFindCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: ConstPtr, pprevcertcontext: ConstPtr, dwflags: UInt, ppvstoreprovfindinfo: MutPtr, ppprovcertcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvFindCert = PfnCertStoreProvFindCertFn?

public fun interface PfnCertStoreProvFindCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: ConstPtr, pprevcrlcontext: ConstPtr, dwflags: UInt, ppvstoreprovfindinfo: MutPtr, ppprovcrlcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvFindCrl = PfnCertStoreProvFindCrlFn?

public fun interface PfnCertStoreProvFindCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pfindinfo: ConstPtr, pprevctlcontext: ConstPtr, dwflags: UInt, ppvstoreprovfindinfo: MutPtr, ppprovctlcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvFindCtl = PfnCertStoreProvFindCtlFn?

public fun interface PfnCertStoreProvFreeFindCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: ConstPtr, pvstoreprovfindinfo: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCert = PfnCertStoreProvFreeFindCertFn?

public fun interface PfnCertStoreProvFreeFindCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: ConstPtr, pvstoreprovfindinfo: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCrl = PfnCertStoreProvFreeFindCrlFn?

public fun interface PfnCertStoreProvFreeFindCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: ConstPtr, pvstoreprovfindinfo: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvFreeFindCtl = PfnCertStoreProvFreeFindCtlFn?

public fun interface PfnCertStoreProvGetCertPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool
}

public typealias PfnCertStoreProvGetCertProperty = PfnCertStoreProvGetCertPropertyFn?

public fun interface PfnCertStoreProvGetCrlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool
}

public typealias PfnCertStoreProvGetCrlProperty = PfnCertStoreProvGetCrlPropertyFn?

public fun interface PfnCertStoreProvGetCtlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool
}

public typealias PfnCertStoreProvGetCtlProperty = PfnCertStoreProvGetCtlPropertyFn?

public fun interface PfnCertStoreProvReadCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorecertcontext: ConstPtr, dwflags: UInt, ppprovcertcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvReadCert = PfnCertStoreProvReadCertFn?

public fun interface PfnCertStoreProvReadCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorecrlcontext: ConstPtr, dwflags: UInt, ppprovcrlcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvReadCrl = PfnCertStoreProvReadCrlFn?

public fun interface PfnCertStoreProvReadCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pstorectlcontext: ConstPtr, dwflags: UInt, ppprovctlcontext: MutPtr): Bool
}

public typealias PfnCertStoreProvReadCtl = PfnCertStoreProvReadCtlFn?

public fun interface PfnCertStoreProvSetCertPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool
}

public typealias PfnCertStoreProvSetCertProperty = PfnCertStoreProvSetCertPropertyFn?

public fun interface PfnCertStoreProvSetCrlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool
}

public typealias PfnCertStoreProvSetCrlProperty = PfnCertStoreProvSetCrlPropertyFn?

public fun interface PfnCertStoreProvSetCtlPropertyFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool
}

public typealias PfnCertStoreProvSetCtlProperty = PfnCertStoreProvSetCtlPropertyFn?

public fun interface PfnCertStoreProvWriteCertFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcertcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCert = PfnCertStoreProvWriteCertFn?

public fun interface PfnCertStoreProvWriteCrlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pcrlcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCrl = PfnCertStoreProvWriteCrlFn?

public fun interface PfnCertStoreProvWriteCtlFn {
    public operator fun invoke(hstoreprov: Hcertstoreprov, pctlcontext: ConstPtr, dwflags: UInt): Bool
}

public typealias PfnCertStoreProvWriteCtl = PfnCertStoreProvWriteCtlFn?

public fun interface PfnCmsgAllocFn {
    public operator fun invoke(cb: ULong): MutPtr
}

public typealias PfnCmsgAlloc = PfnCmsgAllocFn?

public fun interface PfnCmsgCngImportContentEncryptKeyFn {
    public operator fun invoke(pcngcontentdecryptinfo: MutPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgCngImportContentEncryptKey = PfnCmsgCngImportContentEncryptKeyFn?

public fun interface PfnCmsgCngImportKeyAgreeFn {
    public operator fun invoke(pcngcontentdecryptinfo: MutPtr, pkeyagreedecryptpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgCngImportKeyAgree = PfnCmsgCngImportKeyAgreeFn?

public fun interface PfnCmsgCngImportKeyTransFn {
    public operator fun invoke(pcngcontentdecryptinfo: MutPtr, pkeytransdecryptpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgCngImportKeyTrans = PfnCmsgCngImportKeyTransFn?

public fun interface PfnCmsgExportEncryptKeyFn {
    public operator fun invoke(hcryptprov: ULong, hencryptkey: ULong, ppublickeyinfo: ConstPtr, pbdata: MutPtr, pcbdata: MutPtr): Bool
}

public typealias PfnCmsgExportEncryptKey = PfnCmsgExportEncryptKeyFn?

public fun interface PfnCmsgExportKeyAgreeFn {
    public operator fun invoke(pcontentencryptinfo: ConstPtr, pkeyagreeencodeinfo: ConstPtr, pkeyagreeencryptinfo: MutPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgExportKeyAgree = PfnCmsgExportKeyAgreeFn?

public fun interface PfnCmsgExportKeyTransFn {
    public operator fun invoke(pcontentencryptinfo: ConstPtr, pkeytransencodeinfo: ConstPtr, pkeytransencryptinfo: MutPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgExportKeyTrans = PfnCmsgExportKeyTransFn?

public fun interface PfnCmsgExportMailListFn {
    public operator fun invoke(pcontentencryptinfo: ConstPtr, pmaillistencodeinfo: ConstPtr, pmaillistencryptinfo: MutPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgExportMailList = PfnCmsgExportMailListFn?

public fun interface PfnCmsgFreeFn {
    public operator fun invoke(pv: MutPtr)
}

public typealias PfnCmsgFree = PfnCmsgFreeFn?

public fun interface PfnCmsgGenContentEncryptKeyFn {
    public operator fun invoke(pcontentencryptinfo: MutPtr, dwflags: UInt, pvreserved: ConstPtr): Bool
}

public typealias PfnCmsgGenContentEncryptKey = PfnCmsgGenContentEncryptKeyFn?

public fun interface PfnCmsgGenEncryptKeyFn {
    public operator fun invoke(phcryptprov: MutPtr, paiencrypt: ConstPtr, pvencryptauxinfo: ConstPtr, ppublickeyinfo: ConstPtr, pfnalloc: PfnCmsgAlloc, phencryptkey: MutPtr, ppbencryptparameters: MutPtr, pcbencryptparameters: MutPtr): Bool
}

public typealias PfnCmsgGenEncryptKey = PfnCmsgGenEncryptKeyFn?

public fun interface PfnCmsgImportEncryptKeyFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, paiencrypt: ConstPtr, paipubkey: ConstPtr, pbencodedkey: ConstPtr, cbencodedkey: UInt, phencryptkey: MutPtr): Bool
}

public typealias PfnCmsgImportEncryptKey = PfnCmsgImportEncryptKeyFn?

public fun interface PfnCmsgImportKeyAgreeFn {
    public operator fun invoke(pcontentencryptionalgorithm: ConstPtr, pkeyagreedecryptpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, phcontentencryptkey: MutPtr): Bool
}

public typealias PfnCmsgImportKeyAgree = PfnCmsgImportKeyAgreeFn?

public fun interface PfnCmsgImportKeyTransFn {
    public operator fun invoke(pcontentencryptionalgorithm: ConstPtr, pkeytransdecryptpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, phcontentencryptkey: MutPtr): Bool
}

public typealias PfnCmsgImportKeyTrans = PfnCmsgImportKeyTransFn?

public fun interface PfnCmsgImportMailListFn {
    public operator fun invoke(pcontentencryptionalgorithm: ConstPtr, pmaillistdecryptpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, phcontentencryptkey: MutPtr): Bool
}

public typealias PfnCmsgImportMailList = PfnCmsgImportMailListFn?

public fun interface PfnCmsgStreamOutputFn {
    public operator fun invoke(pvarg: ConstPtr, pbdata: ConstPtr, cbdata: UInt, ffinal: Bool): Bool
}

public typealias PfnCmsgStreamOutput = PfnCmsgStreamOutputFn?

public fun interface PfnCryptAllocFn {
    public operator fun invoke(cbsize: ULong): MutPtr
}

public typealias PfnCryptAlloc = PfnCryptAllocFn?

public fun interface PfnCryptAsyncParamFreeFuncFn {
    public operator fun invoke(pszparamoid: Pcstr, pvparam: ConstPtr)
}

public typealias PfnCryptAsyncParamFreeFunc = PfnCryptAsyncParamFreeFuncFn?

public fun interface PfnCryptAsyncRetrievalCompletionFuncFn {
    public operator fun invoke(pvcompletion: MutPtr, dwcompletioncode: UInt, pszurl: Pcstr, pszobjectoid: Pcstr, pvobject: ConstPtr)
}

public typealias PfnCryptAsyncRetrievalCompletionFunc = PfnCryptAsyncRetrievalCompletionFuncFn?

public fun interface PfnCryptCancelRetrievalFn {
    public operator fun invoke(dwflags: UInt, pvarg: MutPtr): Bool
}

public typealias PfnCryptCancelRetrieval = PfnCryptCancelRetrievalFn?

public fun interface PfnCryptEnumKeyidPropFn {
    public operator fun invoke(pkeyidentifier: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pvarg: MutPtr, cprop: UInt, rgdwpropid: ConstPtr, rgpvdata: ConstPtr, rgcbdata: ConstPtr): Bool
}

public typealias PfnCryptEnumKeyidProp = PfnCryptEnumKeyidPropFn?

public fun interface PfnCryptEnumOidFuncFn {
    public operator fun invoke(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, cvalue: UInt, rgdwvaluetype: ConstPtr, rgpwszvaluename: ConstPtr, rgpbvaluedata: ConstPtr, rgcbvaluedata: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCryptEnumOidFunc = PfnCryptEnumOidFuncFn?

public fun interface PfnCryptEnumOidInfoFn {
    public operator fun invoke(pinfo: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCryptEnumOidInfo = PfnCryptEnumOidInfoFn?

public fun interface PfnCryptExportPublicKeyInfoEx2FuncFn {
    public operator fun invoke(hncryptkey: NcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool
}

public typealias PfnCryptExportPublicKeyInfoEx2Func = PfnCryptExportPublicKeyInfoEx2FuncFn?

public fun interface PfnCryptExportPublicKeyInfoFromBcryptHandleFuncFn {
    public operator fun invoke(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool
}

public typealias PfnCryptExportPublicKeyInfoFromBcryptHandleFunc = PfnCryptExportPublicKeyInfoFromBcryptHandleFuncFn?

public fun interface PfnCryptExtractEncodedSignatureParametersFuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, psignaturealgorithm: ConstPtr, ppvdecodedsignpara: MutPtr, ppwszcnghashalgid: MutPtr): Bool
}

public typealias PfnCryptExtractEncodedSignatureParametersFunc = PfnCryptExtractEncodedSignatureParametersFuncFn?

public fun interface PfnCryptFreeFn {
    public operator fun invoke(pv: ConstPtr)
}

public typealias PfnCryptFree = PfnCryptFreeFn?

public fun interface PfnCryptGetSignerCertificateFn {
    public operator fun invoke(pvgetarg: MutPtr, dwcertencodingtype: CertQueryEncodingType, psignerid: ConstPtr, hmsgcertstore: Hcertstore): MutPtr
}

public typealias PfnCryptGetSignerCertificate = PfnCryptGetSignerCertificateFn?

public fun interface PfnCryptObjectLocatorProviderFlushFn {
    public operator fun invoke(pcontext: ConstPtr, rgidentifierornamelist: ConstPtr, dwidentifierornamelistcount: UInt): Bool
}

public typealias PfnCryptObjectLocatorProviderFlush = PfnCryptObjectLocatorProviderFlushFn?

public fun interface PfnCryptObjectLocatorProviderFreeFn {
    public operator fun invoke(pplugincontext: ConstPtr, pbdata: ConstPtr)
}

public typealias PfnCryptObjectLocatorProviderFree = PfnCryptObjectLocatorProviderFreeFn?

public fun interface PfnCryptObjectLocatorProviderFreeIdentifierFn {
    public operator fun invoke(pplugincontext: ConstPtr, pidentifier: ConstPtr)
}

public typealias PfnCryptObjectLocatorProviderFreeIdentifier = PfnCryptObjectLocatorProviderFreeIdentifierFn?

public fun interface PfnCryptObjectLocatorProviderFreePasswordFn {
    public operator fun invoke(pplugincontext: ConstPtr, pwszpassword: Pcwstr)
}

public typealias PfnCryptObjectLocatorProviderFreePassword = PfnCryptObjectLocatorProviderFreePasswordFn?

public fun interface PfnCryptObjectLocatorProviderGetFn {
    public operator fun invoke(pplugincontext: ConstPtr, pidentifier: ConstPtr, dwnametype: UInt, pnameblob: ConstPtr, ppbcontent: MutPtr, pcbcontent: MutPtr, ppwszpassword: MutPtr, ppidentifier: MutPtr): Bool
}

public typealias PfnCryptObjectLocatorProviderGet = PfnCryptObjectLocatorProviderGetFn?

public fun interface PfnCryptObjectLocatorProviderInitializeFn {
    public operator fun invoke(pfnflush: PfnCryptObjectLocatorProviderFlush, pcontext: ConstPtr, pdwexpectedobjectcount: MutPtr, ppfunctable: MutPtr, ppplugincontext: MutPtr): Bool
}

public typealias PfnCryptObjectLocatorProviderInitialize = PfnCryptObjectLocatorProviderInitializeFn?

public fun interface PfnCryptObjectLocatorProviderReleaseFn {
    public operator fun invoke(dwreason: CryptObjectLocatorReleaseReason, pplugincontext: ConstPtr)
}

public typealias PfnCryptObjectLocatorProviderRelease = PfnCryptObjectLocatorProviderReleaseFn?

public fun interface PfnCryptSignAndEncodeHashFuncFn {
    public operator fun invoke(hkey: NcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, psignaturealgorithm: ConstPtr, pvdecodedsignpara: ConstPtr, pwszcngpubkeyalgid: Pcwstr, pwszcnghashalgid: Pcwstr, pbcomputedhash: ConstPtr, cbcomputedhash: UInt, pbsignature: MutPtr, pcbsignature: MutPtr): Bool
}

public typealias PfnCryptSignAndEncodeHashFunc = PfnCryptSignAndEncodeHashFuncFn?

public fun interface PfnCryptVerifyEncodedSignatureFuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, ppubkeyinfo: ConstPtr, psignaturealgorithm: ConstPtr, pvdecodedsignpara: ConstPtr, pwszcngpubkeyalgid: Pcwstr, pwszcnghashalgid: Pcwstr, pbcomputedhash: ConstPtr, cbcomputedhash: UInt, pbsignature: ConstPtr, cbsignature: UInt): Bool
}

public typealias PfnCryptVerifyEncodedSignatureFunc = PfnCryptVerifyEncodedSignatureFuncFn?

public fun interface PfnCryptXmlCreateTransformFn {
    public operator fun invoke(ptransform: ConstPtr, pproviderin: ConstPtr, pproviderout: MutPtr): Hresult
}

public typealias PfnCryptXmlCreateTransform = PfnCryptXmlCreateTransformFn?

public fun interface PfnCryptXmlDataProviderCloseFn {
    public operator fun invoke(pvcallbackstate: MutPtr): Hresult
}

public typealias PfnCryptXmlDataProviderClose = PfnCryptXmlDataProviderCloseFn?

public fun interface PfnCryptXmlDataProviderReadFn {
    public operator fun invoke(pvcallbackstate: MutPtr, pbdata: MutPtr, cbdata: UInt, pcbread: MutPtr): Hresult
}

public typealias PfnCryptXmlDataProviderRead = PfnCryptXmlDataProviderReadFn?

public fun interface PfnCryptXmlEnumAlgInfoFn {
    public operator fun invoke(pinfo: ConstPtr, pvarg: MutPtr): Bool
}

public typealias PfnCryptXmlEnumAlgInfo = PfnCryptXmlEnumAlgInfoFn?

public fun interface PfnCryptXmlWriteCallbackFn {
    public operator fun invoke(pvcallbackstate: MutPtr, pbdata: ConstPtr, cbdata: UInt): Hresult
}

public typealias PfnCryptXmlWriteCallback = PfnCryptXmlWriteCallbackFn?

public fun interface PfnCspAllocFn {
    public operator fun invoke(size: ULong): MutPtr
}

public typealias PfnCspAlloc = PfnCspAllocFn?

public fun interface PfnCspCacheAddFileFn {
    public operator fun invoke(pvcachecontext: ConstPtr, wsztag: Pcwstr, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt): UInt
}

public typealias PfnCspCacheAddFile = PfnCspCacheAddFileFn?

public fun interface PfnCspCacheDeleteFileFn {
    public operator fun invoke(pvcachecontext: ConstPtr, wsztag: Pcwstr, dwflags: UInt): UInt
}

public typealias PfnCspCacheDeleteFile = PfnCspCacheDeleteFileFn?

public fun interface PfnCspCacheLookupFileFn {
    public operator fun invoke(pvcachecontext: ConstPtr, wsztag: Pcwstr, dwflags: UInt, ppbdata: MutPtr, pcbdata: MutPtr): UInt
}

public typealias PfnCspCacheLookupFile = PfnCspCacheLookupFileFn?

public fun interface PfnCspFreeFn {
    public operator fun invoke(address: ConstPtr)
}

public typealias PfnCspFree = PfnCspFreeFn?

public fun interface PfnCspGetDhAgreementFn {
    public operator fun invoke(pcarddata: ConstPtr, hsecretagreement: ConstPtr, pbsecretagreementindex: MutPtr, dwflags: UInt): UInt
}

public typealias PfnCspGetDhAgreement = PfnCspGetDhAgreementFn?

public fun interface PfnCspPadDataFn {
    public operator fun invoke(psigninginfo: ConstPtr, cbmaxwidth: UInt, pcbpaddedbuffer: MutPtr, ppbpaddedbuffer: MutPtr): UInt
}

public typealias PfnCspPadData = PfnCspPadDataFn?

public fun interface PfnCspReallocFn {
    public operator fun invoke(address: ConstPtr, size: ULong): MutPtr
}

public typealias PfnCspRealloc = PfnCspReallocFn?

public fun interface PfnCspUnpadDataFn {
    public operator fun invoke(prsadecryptinfo: ConstPtr, pcbunpaddeddata: MutPtr, ppbunpaddeddata: MutPtr): UInt
}

public typealias PfnCspUnpadData = PfnCspUnpadDataFn?

public fun interface PfnExportPrivKeyFuncFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pprivatekeyinfo: MutPtr, pcbprivatekeyinfo: MutPtr): Bool
}

public typealias PfnExportPrivKeyFunc = PfnExportPrivKeyFuncFn?

public fun interface PfnFreeEncodedObjectFuncFn {
    public operator fun invoke(pszobjectoid: Pcstr, pobject: MutPtr, pvfreecontext: MutPtr)
}

public typealias PfnFreeEncodedObjectFunc = PfnFreeEncodedObjectFuncFn?

public fun interface PfnImportPrivKeyFuncFn {
    public operator fun invoke(hcryptprov: ULong, pprivatekeyinfo: ConstPtr, dwflags: UInt, pvauxinfo: ConstPtr): Bool
}

public typealias PfnImportPrivKeyFunc = PfnImportPrivKeyFuncFn?

public fun interface PfnImportPublicKeyInfoEx2FuncFn {
    public operator fun invoke(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, dwflags: UInt, pvauxinfo: ConstPtr, phkey: MutPtr): Bool
}

public typealias PfnImportPublicKeyInfoEx2Func = PfnImportPublicKeyInfoEx2FuncFn?

public fun interface PfnMdEncryptDataFn {
    public operator fun invoke(pcarddata: ConstPtr, hkey: ULong, pwszsecurefunction: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt, ppencrypteddata: MutPtr, pcencrypteddata: MutPtr): UInt
}

public typealias PfnMdEncryptData = PfnMdEncryptDataFn?

public fun interface PfnMdImportSessionKeyFn {
    public operator fun invoke(pcarddata: ConstPtr, pwszblobtype: Pcwstr, pwszalgid: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt): UInt
}

public typealias PfnMdImportSessionKey = PfnMdImportSessionKeyFn?

public fun interface PfnNcryptAllocFn {
    public operator fun invoke(cbsize: ULong): MutPtr
}

public typealias PfnNcryptAlloc = PfnNcryptAllocFn?

public fun interface PfnNcryptFreeFn {
    public operator fun invoke(pv: ConstPtr)
}

public typealias PfnNcryptFree = PfnNcryptFreeFn?

public fun interface PfnOffloadModExpoFn {
    public operator fun invoke(pbbase: MutPtr, pbexponent: MutPtr, cbexponent: UInt, pbmodulus: MutPtr, cbmodulus: UInt, pbresult: MutPtr, pvoffloadprivatekey: MutPtr, dwflags: UInt): Bool
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
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslComputeClientAuthHashFn = SslComputeClientAuthHashFnFn?

public fun interface SslComputeEapKeyBlockFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr, cbrandoms: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslComputeEapKeyBlockFn = SslComputeEapKeyBlockFnFn?

public fun interface SslComputeFinishedHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult
}

public typealias SslComputeFinishedHashFn = SslComputeFinishedHashFnFn?

public fun interface SslComputeSessionHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslComputeSessionHashFn = SslComputeSessionHashFnFn?

public fun interface SslCreateClientAuthHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult
}

public typealias SslCreateClientAuthHashFn = SslCreateClientAuthHashFnFn?

public fun interface SslCreateEphemeralKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr, cbparams: UInt, dwflags: UInt): Hresult
}

public typealias SslCreateEphemeralKeyFn = SslCreateEphemeralKeyFnFn?

public fun interface SslCreateHandshakeHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult
}

public typealias SslCreateHandshakeHashFn = SslCreateHandshakeHashFnFn?

public fun interface SslDecryptPacketFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwflags: UInt): Hresult
}

public typealias SslDecryptPacketFn = SslDecryptPacketFnFn?

public fun interface SslDuplicateTranscriptHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phduplicatetranscripthash: MutPtr, dwflags: UInt): Hresult
}

public typealias SslDuplicateTranscriptHashFn = SslDuplicateTranscriptHashFnFn?

public fun interface SslEncryptPacketFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult
}

public typealias SslEncryptPacketFn = SslEncryptPacketFnFn?

public fun interface SslEnumCipherSuitesExFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult
}

public typealias SslEnumCipherSuitesExFn = SslEnumCipherSuitesExFnFn?

public fun interface SslEnumCipherSuitesFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult
}

public typealias SslEnumCipherSuitesFn = SslEnumCipherSuitesFnFn?

public fun interface SslEnumEccCurvesFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr, ppecccurve: MutPtr, dwflags: UInt): Hresult
}

public typealias SslEnumEccCurvesFn = SslEnumEccCurvesFnFn?

public fun interface SslExpandBinderKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandBinderKeyFn = SslExpandBinderKeyFnFn?

public fun interface SslExpandExporterMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandExporterMasterKeyFn = SslExpandExporterMasterKeyFnFn?

public fun interface SslExpandPreSharedKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr, cbticketnonce: UInt, phpresharedkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandPreSharedKeyFn = SslExpandPreSharedKeyFnFn?

public fun interface SslExpandResumptionMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandResumptionMasterKeyFn = SslExpandResumptionMasterKeyFnFn?

public fun interface SslExpandTrafficKeysFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr, phservertraffickey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandTrafficKeysFn = SslExpandTrafficKeysFnFn?

public fun interface SslExpandWriteKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExpandWriteKeyFn = SslExpandWriteKeyFnFn?

public fun interface SslExportKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslExportKeyFn = SslExportKeyFnFn?

public fun interface SslExportKeyingMaterialFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr, cbrandoms: UInt, pbcontextvalue: ConstPtr, cbcontextvalue: UShort, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult
}

public typealias SslExportKeyingMaterialFn = SslExportKeyingMaterialFnFn?

public fun interface SslExtractEarlyKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExtractEarlyKeyFn = SslExtractEarlyKeyFnFn?

public fun interface SslExtractHandshakeKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExtractHandshakeKeyFn = SslExtractHandshakeKeyFnFn?

public fun interface SslExtractMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslExtractMasterKeyFn = SslExtractMasterKeyFnFn?

public fun interface SslFreeBufferFnFn {
    public operator fun invoke(pvinput: MutPtr): Hresult
}

public typealias SslFreeBufferFn = SslFreeBufferFnFn?

public fun interface SslFreeObjectFnFn {
    public operator fun invoke(hobject: NcryptHandle, dwflags: UInt): Hresult
}

public typealias SslFreeObjectFn = SslFreeObjectFnFn?

public fun interface SslGenerateMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslGenerateMasterKeyFn = SslGenerateMasterKeyFnFn?

public fun interface SslGeneratePreMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslGeneratePreMasterKeyFn = SslGeneratePreMasterKeyFnFn?

public fun interface SslGenerateSessionKeysFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslGenerateSessionKeysFn = SslGenerateSessionKeysFnFn?

public fun interface SslGetCipherSuitePRFHashAlgorithmFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult
}

public typealias SslGetCipherSuitePRFHashAlgorithmFn = SslGetCipherSuitePRFHashAlgorithmFnFn?

public fun interface SslGetKeyPropertyFnFn {
    public operator fun invoke(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, dwflags: UInt): Hresult
}

public typealias SslGetKeyPropertyFn = SslGetKeyPropertyFnFn?

public fun interface SslGetProviderPropertyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult
}

public typealias SslGetProviderPropertyFn = SslGetProviderPropertyFnFn?

public fun interface SslHashHandshakeFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult
}

public typealias SslHashHandshakeFn = SslHashHandshakeFnFn?

public fun interface SslImportKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phkey: MutPtr, pszblobtype: Pcwstr, pbkeyblob: ConstPtr, cbkeyblob: UInt, dwflags: UInt): Hresult
}

public typealias SslImportKeyFn = SslImportKeyFnFn?

public fun interface SslImportMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pbencryptedkey: ConstPtr, cbencryptedkey: UInt, dwflags: UInt): Hresult
}

public typealias SslImportMasterKeyFn = SslImportMasterKeyFnFn?

public fun interface SslInitializeInterfaceFnFn {
    public operator fun invoke(pszprovidername: Pcwstr, pfunctiontable: MutPtr, dwflags: UInt): Hresult
}

public typealias SslInitializeInterfaceFn = SslInitializeInterfaceFnFn?

public fun interface SslLookupCipherLengthsFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr, cbcipherlengths: UInt, dwflags: UInt): Hresult
}

public typealias SslLookupCipherLengthsFn = SslLookupCipherLengthsFnFn?

public fun interface SslLookupCipherSuiteInfoFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr, dwflags: UInt): Hresult
}

public typealias SslLookupCipherSuiteInfoFn = SslLookupCipherSuiteInfoFnFn?

public fun interface SslOpenPrivateKeyFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr, pcertcontext: ConstPtr, dwflags: UInt): Hresult
}

public typealias SslOpenPrivateKeyFn = SslOpenPrivateKeyFnFn?

public fun interface SslOpenProviderFnFn {
    public operator fun invoke(phsslprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult
}

public typealias SslOpenProviderFn = SslOpenProviderFnFn?

public fun interface SslSignHashFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult
}

public typealias SslSignHashFn = SslSignHashFnFn?

public fun interface SslVerifySignatureFnFn {
    public operator fun invoke(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult
}

public typealias SslVerifySignatureFn = SslVerifySignatureFnFn?
