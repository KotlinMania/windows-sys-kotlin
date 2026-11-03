package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.NCRYPT_DESCRIPTOR_HANDLE

public typealias ALG_ID = UInt

public typealias BCRYPTGENRANDOM_FLAGS = UInt

public typealias BCRYPT_ALG_HANDLE = Long

public typealias BCRYPT_DH_KEY_BLOB_MAGIC = UInt

public typealias BCRYPT_DSA_MAGIC = UInt

public typealias BCRYPT_FLAGS = UInt

public typealias BCRYPT_HANDLE = Long

public typealias BCRYPT_HASH_HANDLE = Long

public typealias BCRYPT_HASH_OPERATION_TYPE = Int

public typealias BCRYPT_INTERFACE = UInt

public typealias BCRYPT_KEY_HANDLE = Long

public typealias BCRYPT_MULTI_OPERATION_TYPE = Int

public typealias BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS = UInt

public typealias BCRYPT_OPERATION = UInt

public typealias BCRYPT_QUERY_PROVIDER_MODE = UInt

public typealias BCRYPT_RESOLVE_PROVIDERS_FLAGS = UInt

public typealias BCRYPT_RSAKEY_BLOB_MAGIC = UInt

public typealias BCRYPT_SECRET_HANDLE = Long

public typealias BCRYPT_TABLE = UInt

public fun interface BCryptCloseAlgorithmProviderFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptCloseAlgorithmProviderFn = BCryptCloseAlgorithmProviderFnFn?

public fun interface BCryptCreateHashFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptCreateHashFn = BCryptCreateHashFnFn?

public fun interface BCryptCreateMultiHashFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptCreateMultiHashFn = BCryptCreateMultiHashFnFn?

public fun interface BCryptDecryptFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDecryptFn = BCryptDecryptFnFn?

public fun interface BCryptDeriveKeyCapiFnFn {
    public operator fun invoke(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDeriveKeyCapiFn = BCryptDeriveKeyCapiFnFn?

public fun interface BCryptDeriveKeyFnFn {
    public operator fun invoke(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDeriveKeyFn = BCryptDeriveKeyFnFn?

public fun interface BCryptDeriveKeyPBKDF2FnFn {
    public operator fun invoke(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDeriveKeyPBKDF2Fn = BCryptDeriveKeyPBKDF2FnFn?

public fun interface BCryptDestroyHashFnFn {
    public operator fun invoke(hhash: BCRYPT_HASH_HANDLE): Foundation.NTSTATUS
}

public typealias BCryptDestroyHashFn = BCryptDestroyHashFnFn?

public fun interface BCryptDestroyKeyFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE): Foundation.NTSTATUS
}

public typealias BCryptDestroyKeyFn = BCryptDestroyKeyFnFn?

public fun interface BCryptDestroySecretFnFn {
    public operator fun invoke(hsecret: BCRYPT_SECRET_HANDLE): Foundation.NTSTATUS
}

public typealias BCryptDestroySecretFn = BCryptDestroySecretFnFn?

public fun interface BCryptDuplicateHashFnFn {
    public operator fun invoke(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDuplicateHashFn = BCryptDuplicateHashFnFn?

public fun interface BCryptDuplicateKeyFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptDuplicateKeyFn = BCryptDuplicateKeyFnFn?

public fun interface BCryptEncryptFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptEncryptFn = BCryptEncryptFnFn?

public fun interface BCryptExportKeyFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptExportKeyFn = BCryptExportKeyFnFn?

public fun interface BCryptFinalizeKeyPairFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptFinalizeKeyPairFn = BCryptFinalizeKeyPairFnFn?

public fun interface BCryptFinishHashFnFn {
    public operator fun invoke(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptFinishHashFn = BCryptFinishHashFnFn?

public fun interface BCryptFreeBufferFnFn {
    public operator fun invoke(pvbuffer: Long)
}

public typealias BCryptFreeBufferFn = BCryptFreeBufferFnFn?

public fun interface BCryptGenRandomFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptGenRandomFn = BCryptGenRandomFnFn?

public fun interface BCryptGenerateKeyPairFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptGenerateKeyPairFn = BCryptGenerateKeyPairFnFn?

public fun interface BCryptGenerateSymmetricKeyFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptGenerateSymmetricKeyFn = BCryptGenerateSymmetricKeyFnFn?

public fun interface BCryptGetPropertyFnFn {
    public operator fun invoke(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptGetPropertyFn = BCryptGetPropertyFnFn?

public fun interface BCryptHashDataFnFn {
    public operator fun invoke(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptHashDataFn = BCryptHashDataFnFn?

public fun interface BCryptImportKeyFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptImportKeyFn = BCryptImportKeyFnFn?

public fun interface BCryptImportKeyPairFnFn {
    public operator fun invoke(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptImportKeyPairFn = BCryptImportKeyPairFnFn?

public fun interface BCryptKeyDerivationFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptKeyDerivationFn = BCryptKeyDerivationFnFn?

public fun interface BCryptOpenAlgorithmProviderFnFn {
    public operator fun invoke(phalgorithm: Long, pszalgid: PCWSTR, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptOpenAlgorithmProviderFn = BCryptOpenAlgorithmProviderFnFn?

public fun interface BCryptProcessMultiOperationsFnFn {
    public operator fun invoke(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptProcessMultiOperationsFn = BCryptProcessMultiOperationsFnFn?

public fun interface BCryptSecretAgreementFnFn {
    public operator fun invoke(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptSecretAgreementFn = BCryptSecretAgreementFnFn?

public fun interface BCryptSetPropertyFnFn {
    public operator fun invoke(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptSetPropertyFn = BCryptSetPropertyFnFn?

public fun interface BCryptSignHashFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptSignHashFn = BCryptSignHashFnFn?

public fun interface BCryptVerifySignatureFnFn {
    public operator fun invoke(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): Foundation.NTSTATUS
}

public typealias BCryptVerifySignatureFn = BCryptVerifySignatureFnFn?

public typealias CARD_DIRECTORY_ACCESS_CONDITION = Int

public typealias CARD_FILE_ACCESS_CONDITION = Int

public typealias CASetupProperty = Int

public typealias CEPSetupProperty = Int

public typealias CERT_BIOMETRIC_DATA_TYPE = UInt

public typealias CERT_CHAIN_POLICY_FLAGS = UInt

public typealias CERT_CONTROL_STORE_FLAGS = UInt

public typealias CERT_CREATE_SELFSIGN_FLAGS = UInt

public typealias CERT_FIND_CHAIN_IN_STORE_FLAGS = UInt

public typealias CERT_FIND_FLAGS = UInt

public typealias CERT_FIND_TYPE = UInt

public typealias CERT_ID_OPTION = UInt

public typealias CERT_KEY_SPEC = UInt

public typealias CERT_LOGOTYPE_CHOICE = UInt

public typealias CERT_LOGOTYPE_IMAGE_INFO_TYPE = UInt

public typealias CERT_LOGOTYPE_OPTION = UInt

public typealias CERT_OPEN_STORE_FLAGS = UInt

public typealias CERT_QUERY_CONTENT_TYPE = UInt

public typealias CERT_QUERY_CONTENT_TYPE_FLAGS = UInt

public typealias CERT_QUERY_ENCODING_TYPE = UInt

public typealias CERT_QUERY_FORMAT_TYPE = UInt

public typealias CERT_QUERY_FORMAT_TYPE_FLAGS = UInt

public typealias CERT_QUERY_OBJECT_TYPE = UInt

public typealias CERT_RDN_ATTR_VALUE_TYPE = Int

public typealias CERT_REVOCATION_STATUS_REASON = UInt

public typealias CERT_ROOT_PROGRAM_FLAGS = UInt

public typealias CERT_SELECT_CRITERIA_TYPE = UInt

public typealias CERT_STORE_PROV_FLAGS = UInt

public typealias CERT_STORE_SAVE_AS = UInt

public typealias CERT_STORE_SAVE_TO = UInt

public typealias CERT_STRING_TYPE = UInt

public typealias CERT_STRONG_SIGN_FLAGS = UInt

public typealias CERT_SYSTEM_STORE_FLAGS = UInt

public typealias CESSetupProperty = Int

public typealias CMSG_KEY_AGREE_OPTION = UInt

public typealias CMSG_KEY_AGREE_ORIGINATOR = UInt

public typealias CRYPT_ACQUIRE_FLAGS = UInt

public typealias CRYPT_CONTEXT_CONFIG_FLAGS = UInt

public typealias CRYPT_DEFAULT_CONTEXT_FLAGS = UInt

public typealias CRYPT_DEFAULT_CONTEXT_TYPE = UInt

public typealias CRYPT_ENCODE_OBJECT_FLAGS = UInt

public typealias CRYPT_FIND_FLAGS = UInt

public typealias CRYPT_GET_URL_FLAGS = UInt

public typealias CRYPT_IMAGE_REF_FLAGS = UInt

public typealias CRYPT_IMPORT_PUBLIC_KEY_FLAGS = UInt

public typealias CRYPT_KEY_FLAGS = UInt

public typealias CRYPT_KEY_PARAM_ID = UInt

public typealias CRYPT_MSG_TYPE = UInt

public typealias CRYPT_OBJECT_LOCATOR_RELEASE_REASON = UInt

public fun interface CRYPT_RETURN_HWNDFn {
    public operator fun invoke(phwnd: Long)
}

public typealias CRYPT_RETURN_HWND = CRYPT_RETURN_HWNDFn?

public typealias CRYPT_SET_HASH_PARAM = UInt

public typealias CRYPT_SET_PROV_PARAM_ID = UInt

public typealias CRYPT_STRING = UInt

public typealias CRYPT_TIMESTAMP_RESPONSE_STATUS = UInt

public typealias CRYPT_TIMESTAMP_VERSION = UInt

public typealias CRYPT_VERIFY_CERT_FLAGS = UInt

public fun interface CRYPT_VERIFY_IMAGE_AFn {
    public operator fun invoke(szimage: PCSTR, pbsigdata: Long): BOOL
}

public typealias CRYPT_VERIFY_IMAGE_A = CRYPT_VERIFY_IMAGE_AFn?

public fun interface CRYPT_VERIFY_IMAGE_WFn {
    public operator fun invoke(szimage: PCWSTR, pbsigdata: Long): BOOL
}

public typealias CRYPT_VERIFY_IMAGE_W = CRYPT_VERIFY_IMAGE_WFn?

public typealias CRYPT_XML_CHARSET = Int

public typealias CRYPT_XML_FLAGS = UInt

public typealias CRYPT_XML_GROUP_ID = UInt

public typealias CRYPT_XML_KEYINFO_SPEC = Int

public typealias CRYPT_XML_KEYINFO_TYPE = UInt

public typealias CRYPT_XML_KEY_VALUE_TYPE = UInt

public typealias CRYPT_XML_PROPERTY_ID = Int

public typealias CRYPT_XML_STATUS_ERROR_STATUS = UInt

public typealias CRYPT_XML_STATUS_INFO_STATUS = UInt

public typealias CRYPT_XML_TRANSFORM_FLAGS = UInt

public typealias CRYPT_XML_X509DATA_TYPE = UInt

public typealias CertKeyType = UInt

public fun interface CryptXmlDllCloseDigestFn {
    public operator fun invoke(hdigest: Long): HRESULT
}

public typealias CryptXmlDllCloseDigest = CryptXmlDllCloseDigestFn?

public fun interface CryptXmlDllCreateDigestFn {
    public operator fun invoke(pdigestmethod: Long, pcbsize: Long, phdigest: Long): HRESULT
}

public typealias CryptXmlDllCreateDigest = CryptXmlDllCreateDigestFn?

public fun interface CryptXmlDllCreateKeyFn {
    public operator fun invoke(pencoded: Long, phkey: Long): HRESULT
}

public typealias CryptXmlDllCreateKey = CryptXmlDllCreateKeyFn?

public fun interface CryptXmlDllDigestDataFn {
    public operator fun invoke(hdigest: Long, pbdata: Long, cbdata: UInt): HRESULT
}

public typealias CryptXmlDllDigestData = CryptXmlDllDigestDataFn?

public fun interface CryptXmlDllEncodeAlgorithmFn {
    public operator fun invoke(palginfo: Long, dwcharset: CRYPT_XML_CHARSET, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT
}

public typealias CryptXmlDllEncodeAlgorithm = CryptXmlDllEncodeAlgorithmFn?

public fun interface CryptXmlDllEncodeKeyValueFn {
    public operator fun invoke(hkey: NCRYPT_KEY_HANDLE, dwcharset: CRYPT_XML_CHARSET, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT
}

public typealias CryptXmlDllEncodeKeyValue = CryptXmlDllEncodeKeyValueFn?

public fun interface CryptXmlDllFinalizeDigestFn {
    public operator fun invoke(hdigest: Long, pbdigest: Long, cbdigest: UInt): HRESULT
}

public typealias CryptXmlDllFinalizeDigest = CryptXmlDllFinalizeDigestFn?

public fun interface CryptXmlDllGetAlgorithmInfoFn {
    public operator fun invoke(pxmlalgorithm: Long, ppalginfo: Long): HRESULT
}

public typealias CryptXmlDllGetAlgorithmInfo = CryptXmlDllGetAlgorithmInfoFn?

public fun interface CryptXmlDllGetInterfaceFn {
    public operator fun invoke(dwflags: UInt, pmethod: Long, pinterface: Long): HRESULT
}

public typealias CryptXmlDllGetInterface = CryptXmlDllGetInterfaceFn?

public fun interface CryptXmlDllSignDataFn {
    public operator fun invoke(psignaturemethod: Long, hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long): HRESULT
}

public typealias CryptXmlDllSignData = CryptXmlDllSignDataFn?

public fun interface CryptXmlDllVerifySignatureFn {
    public operator fun invoke(psignaturemethod: Long, hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pbsignature: Long, cbsignature: UInt): HRESULT
}

public typealias CryptXmlDllVerifySignature = CryptXmlDllVerifySignatureFn?

public typealias DSAFIPSVERSION_ENUM = Int

public typealias Direction = Int

public typealias ECC_CURVE_ALG_ID_ENUM = Int

public typealias ECC_CURVE_TYPE_ENUM = Int

public fun interface GetAsymmetricEncryptionInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetAsymmetricEncryptionInterfaceFn = GetAsymmetricEncryptionInterfaceFnFn?

public fun interface GetCipherInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetCipherInterfaceFn = GetCipherInterfaceFnFn?

public fun interface GetHashInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetHashInterfaceFn = GetHashInterfaceFnFn?

public fun interface GetKeyDerivationInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetKeyDerivationInterfaceFn = GetKeyDerivationInterfaceFnFn?

public fun interface GetKeyStorageInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetKeyStorageInterfaceFn = GetKeyStorageInterfaceFnFn?

public fun interface GetRngInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetRngInterfaceFn = GetRngInterfaceFnFn?

public fun interface GetSChannelInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetSChannelInterfaceFn = GetSChannelInterfaceFnFn?

public fun interface GetSecretAgreementInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetSecretAgreementInterfaceFn = GetSecretAgreementInterfaceFnFn?

public fun interface GetSignatureInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): Foundation.NTSTATUS
}

public typealias GetSignatureInterfaceFn = GetSignatureInterfaceFnFn?

public typealias HASHALGORITHM_ENUM = Int

public typealias HCERTCHAINENGINE = Long

public typealias HCERTSTORE = Long

public typealias HCERTSTOREPROV = Long

public typealias HCRYPTASYNC = Long

public typealias HCRYPTPROV_LEGACY = ULong

public typealias HCRYPTPROV_OR_NCRYPT_KEY_HANDLE = ULong

public typealias HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE = UInt

public typealias MSCEPSetupProperty = Int

public typealias NCRYPT_ALGORITHM_NAME_CLASS = UInt

public typealias NCRYPT_FLAGS = UInt

public typealias NCRYPT_HANDLE = ULong

public typealias NCRYPT_HASH_HANDLE = ULong

public typealias NCRYPT_KEY_HANDLE = ULong

public typealias NCRYPT_OPERATION = UInt

public typealias NCRYPT_PROV_HANDLE = ULong

public typealias NCRYPT_SECRET_HANDLE = ULong

public fun interface NCryptCreateClaimFnFn {
    public operator fun invoke(hprov: NCRYPT_PROV_HANDLE, hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptCreateClaimFn = NCryptCreateClaimFnFn?

public fun interface NCryptCreatePersistedKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptCreatePersistedKeyFn = NCryptCreatePersistedKeyFnFn?

public fun interface NCryptDecryptFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptDecryptFn = NCryptDecryptFnFn?

public fun interface NCryptDeleteKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT
}

public typealias NCryptDeleteKeyFn = NCryptDeleteKeyFnFn?

public fun interface NCryptDeriveKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptDeriveKeyFn = NCryptDeriveKeyFnFn?

public fun interface NCryptEncryptFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptEncryptFn = NCryptEncryptFnFn?

public fun interface NCryptEnumAlgorithmsFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, dwalgclass: UInt, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT
}

public typealias NCryptEnumAlgorithmsFn = NCryptEnumAlgorithmsFnFn?

public fun interface NCryptEnumKeysFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: UInt): HRESULT
}

public typealias NCryptEnumKeysFn = NCryptEnumKeysFnFn?

public fun interface NCryptEnumStorageProvidersFnFn {
    public operator fun invoke(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT
}

public typealias NCryptEnumStorageProvidersFn = NCryptEnumStorageProvidersFnFn?

public fun interface NCryptExportKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptExportKeyFn = NCryptExportKeyFnFn?

public fun interface NCryptFinalizeKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT
}

public typealias NCryptFinalizeKeyFn = NCryptFinalizeKeyFnFn?

public fun interface NCryptFreeBufferFnFn {
    public operator fun invoke(pvinput: Long): HRESULT
}

public typealias NCryptFreeBufferFn = NCryptFreeBufferFnFn?

public fun interface NCryptFreeKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE): HRESULT
}

public typealias NCryptFreeKeyFn = NCryptFreeKeyFnFn?

public fun interface NCryptFreeProviderFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE): HRESULT
}

public typealias NCryptFreeProviderFn = NCryptFreeProviderFnFn?

public fun interface NCryptFreeSecretFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hsharedsecret: NCRYPT_SECRET_HANDLE): HRESULT
}

public typealias NCryptFreeSecretFn = NCryptFreeSecretFnFn?

public fun interface NCryptGetKeyPropertyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptGetKeyPropertyFn = NCryptGetKeyPropertyFnFn?

public fun interface NCryptGetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptGetProviderPropertyFn = NCryptGetProviderPropertyFnFn?

public fun interface NCryptImportKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptImportKeyFn = NCryptImportKeyFnFn?

public fun interface NCryptIsAlgSupportedFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT
}

public typealias NCryptIsAlgSupportedFn = NCryptIsAlgSupportedFnFn?

public fun interface NCryptKeyDerivationFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptKeyDerivationFn = NCryptKeyDerivationFnFn?

public fun interface NCryptNotifyChangeKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: UInt): HRESULT
}

public typealias NCryptNotifyChangeKeyFn = NCryptNotifyChangeKeyFnFn?

public fun interface NCryptOpenKeyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptOpenKeyFn = NCryptOpenKeyFnFn?

public fun interface NCryptOpenStorageProviderFnFn {
    public operator fun invoke(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT
}

public typealias NCryptOpenStorageProviderFn = NCryptOpenStorageProviderFnFn?

public fun interface NCryptPromptUserFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszoperation: PCWSTR, dwflags: UInt): HRESULT
}

public typealias NCryptPromptUserFn = NCryptPromptUserFnFn?

public fun interface NCryptSecretAgreementFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): HRESULT
}

public typealias NCryptSecretAgreementFn = NCryptSecretAgreementFnFn?

public fun interface NCryptSetKeyPropertyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptSetKeyPropertyFn = NCryptSetKeyPropertyFnFn?

public fun interface NCryptSetProviderPropertyFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptSetProviderPropertyFn = NCryptSetProviderPropertyFnFn?

public fun interface NCryptSignHashFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias NCryptSignHashFn = NCryptSignHashFnFn?

public fun interface NCryptVerifyClaimFnFn {
    public operator fun invoke(hprov: NCRYPT_PROV_HANDLE, hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT
}

public typealias NCryptVerifyClaimFn = NCryptVerifyClaimFnFn?

public fun interface NCryptVerifySignatureFnFn {
    public operator fun invoke(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT
}

public typealias NCryptVerifySignatureFn = NCryptVerifySignatureFnFn?

public fun interface PCRYPT_DECRYPT_PRIVATE_KEY_FUNCFn {
    public operator fun invoke(algorithm: CRYPT_ALGORITHM_IDENTIFIER, encryptedprivatekey: CRYPT_INTEGER_BLOB, pbcleartextkey: Long, pcbcleartextkey: Long, pvoiddecryptfunc: Long): BOOL
}

public typealias PCRYPT_DECRYPT_PRIVATE_KEY_FUNC = PCRYPT_DECRYPT_PRIVATE_KEY_FUNCFn?

public fun interface PCRYPT_ENCRYPT_PRIVATE_KEY_FUNCFn {
    public operator fun invoke(palgorithm: Long, pcleartextprivatekey: Long, pbencryptedkey: Long, pcbencryptedkey: Long, pvoidencryptfunc: Long): BOOL
}

public typealias PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC = PCRYPT_ENCRYPT_PRIVATE_KEY_FUNCFn?

public fun interface PCRYPT_RESOLVE_HCRYPTPROV_FUNCFn {
    public operator fun invoke(pprivatekeyinfo: Long, phcryptprov: Long, pvoidresolvefunc: Long): BOOL
}

public typealias PCRYPT_RESOLVE_HCRYPTPROV_FUNC = PCRYPT_RESOLVE_HCRYPTPROV_FUNCFn?

public fun interface PFNCryptStreamOutputCallbackFn {
    public operator fun invoke(pvcallbackctxt: Long, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT
}

public typealias PFNCryptStreamOutputCallback = PFNCryptStreamOutputCallbackFn?

public fun interface PFNCryptStreamOutputCallbackExFn {
    public operator fun invoke(pvcallbackctxt: Long, pbdata: Long, cbdata: ULong, hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, ffinal: BOOL): HRESULT
}

public typealias PFNCryptStreamOutputCallbackEx = PFNCryptStreamOutputCallbackExFn?

public fun interface PFN_AUTHENTICODE_DIGEST_SIGNFn {
    public operator fun invoke(psigningcert: Long, pmetadatablob: Long, digestalgid: ALG_ID, pbtobesigneddigest: Long, cbtobesigneddigest: UInt, psigneddigest: Long): HRESULT
}

public typealias PFN_AUTHENTICODE_DIGEST_SIGN = PFN_AUTHENTICODE_DIGEST_SIGNFn?

public fun interface PFN_AUTHENTICODE_DIGEST_SIGN_EXFn {
    public operator fun invoke(pmetadatablob: Long, digestalgid: ALG_ID, pbtobesigneddigest: Long, cbtobesigneddigest: UInt, psigneddigest: Long, ppsignercert: Long, hcertchainstore: HCERTSTORE): HRESULT
}

public typealias PFN_AUTHENTICODE_DIGEST_SIGN_EX = PFN_AUTHENTICODE_DIGEST_SIGN_EXFn?

public fun interface PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLEFn {
    public operator fun invoke(pmetadatablob: Long, digestalgid: ALG_ID, pbtobesigneddigest: Long, cbtobesigneddigest: UInt, hfile: Foundation.HANDLE, psigneddigest: Long, ppsignercert: Long, hcertchainstore: HCERTSTORE): HRESULT
}

public typealias PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLE = PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLEFn?

public fun interface PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLEFn {
    public operator fun invoke(psigningcert: Long, pmetadatablob: Long, digestalgid: ALG_ID, pbtobesigneddigest: Long, cbtobesigneddigest: UInt, hfile: Foundation.HANDLE, psigneddigest: Long): HRESULT
}

public typealias PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLE = PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLEFn?

public fun interface PFN_CANCEL_ASYNC_RETRIEVAL_FUNCFn {
    public operator fun invoke(hasyncretrieve: HCRYPTASYNC): BOOL
}

public typealias PFN_CANCEL_ASYNC_RETRIEVAL_FUNC = PFN_CANCEL_ASYNC_RETRIEVAL_FUNCFn?

public fun interface PFN_CARD_ACQUIRE_CONTEXTFn {
    public operator fun invoke(pcarddata: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_ACQUIRE_CONTEXT = PFN_CARD_ACQUIRE_CONTEXTFn?

public fun interface PFN_CARD_AUTHENTICATE_CHALLENGEFn {
    public operator fun invoke(pcarddata: Long, pbresponsedata: Long, cbresponsedata: UInt, pcattemptsremaining: Long): UInt
}

public typealias PFN_CARD_AUTHENTICATE_CHALLENGE = PFN_CARD_AUTHENTICATE_CHALLENGEFn?

public fun interface PFN_CARD_AUTHENTICATE_EXFn {
    public operator fun invoke(pcarddata: Long, pinid: UInt, dwflags: UInt, pbpindata: Long, cbpindata: UInt, ppbsessionpin: Long, pcbsessionpin: Long, pcattemptsremaining: Long): UInt
}

public typealias PFN_CARD_AUTHENTICATE_EX = PFN_CARD_AUTHENTICATE_EXFn?

public fun interface PFN_CARD_AUTHENTICATE_PINFn {
    public operator fun invoke(pcarddata: Long, pwszuserid: PCWSTR, pbpin: Long, cbpin: UInt, pcattemptsremaining: Long): UInt
}

public typealias PFN_CARD_AUTHENTICATE_PIN = PFN_CARD_AUTHENTICATE_PINFn?

public fun interface PFN_CARD_CHANGE_AUTHENTICATORFn {
    public operator fun invoke(pcarddata: Long, pwszuserid: PCWSTR, pbcurrentauthenticator: Long, cbcurrentauthenticator: UInt, pbnewauthenticator: Long, cbnewauthenticator: UInt, cretrycount: UInt, dwflags: UInt, pcattemptsremaining: Long): UInt
}

public typealias PFN_CARD_CHANGE_AUTHENTICATOR = PFN_CARD_CHANGE_AUTHENTICATORFn?

public fun interface PFN_CARD_CHANGE_AUTHENTICATOR_EXFn {
    public operator fun invoke(pcarddata: Long, dwflags: UInt, dwauthenticatingpinid: UInt, pbauthenticatingpindata: Long, cbauthenticatingpindata: UInt, dwtargetpinid: UInt, pbtargetdata: Long, cbtargetdata: UInt, cretrycount: UInt, pcattemptsremaining: Long): UInt
}

public typealias PFN_CARD_CHANGE_AUTHENTICATOR_EX = PFN_CARD_CHANGE_AUTHENTICATOR_EXFn?

public fun interface PFN_CARD_CONSTRUCT_DH_AGREEMENTFn {
    public operator fun invoke(pcarddata: Long, pagreementinfo: Long): UInt
}

public typealias PFN_CARD_CONSTRUCT_DH_AGREEMENT = PFN_CARD_CONSTRUCT_DH_AGREEMENTFn?

public fun interface PFN_CARD_CREATE_CONTAINERFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: Long): UInt
}

public typealias PFN_CARD_CREATE_CONTAINER = PFN_CARD_CREATE_CONTAINERFn?

public fun interface PFN_CARD_CREATE_CONTAINER_EXFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, dwflags: UInt, dwkeyspec: UInt, dwkeysize: UInt, pbkeydata: Long, pinid: UInt): UInt
}

public typealias PFN_CARD_CREATE_CONTAINER_EX = PFN_CARD_CREATE_CONTAINER_EXFn?

public fun interface PFN_CARD_CREATE_DIRECTORYFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, accesscondition: CARD_DIRECTORY_ACCESS_CONDITION): UInt
}

public typealias PFN_CARD_CREATE_DIRECTORY = PFN_CARD_CREATE_DIRECTORYFn?

public fun interface PFN_CARD_CREATE_FILEFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pszfilename: PCSTR, cbinitialcreationsize: UInt, accesscondition: CARD_FILE_ACCESS_CONDITION): UInt
}

public typealias PFN_CARD_CREATE_FILE = PFN_CARD_CREATE_FILEFn?

public fun interface PFN_CARD_DEAUTHENTICATEFn {
    public operator fun invoke(pcarddata: Long, pwszuserid: PCWSTR, dwflags: UInt): UInt
}

public typealias PFN_CARD_DEAUTHENTICATE = PFN_CARD_DEAUTHENTICATEFn?

public fun interface PFN_CARD_DEAUTHENTICATE_EXFn {
    public operator fun invoke(pcarddata: Long, pinid: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_DEAUTHENTICATE_EX = PFN_CARD_DEAUTHENTICATE_EXFn?

public fun interface PFN_CARD_DELETE_CONTAINERFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, dwreserved: UInt): UInt
}

public typealias PFN_CARD_DELETE_CONTAINER = PFN_CARD_DELETE_CONTAINERFn?

public fun interface PFN_CARD_DELETE_CONTEXTFn {
    public operator fun invoke(pcarddata: Long): UInt
}

public typealias PFN_CARD_DELETE_CONTEXT = PFN_CARD_DELETE_CONTEXTFn?

public fun interface PFN_CARD_DELETE_DIRECTORYFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR): UInt
}

public typealias PFN_CARD_DELETE_DIRECTORY = PFN_CARD_DELETE_DIRECTORYFn?

public fun interface PFN_CARD_DELETE_FILEFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pszfilename: PCSTR, dwflags: UInt): UInt
}

public typealias PFN_CARD_DELETE_FILE = PFN_CARD_DELETE_FILEFn?

public fun interface PFN_CARD_DERIVE_KEYFn {
    public operator fun invoke(pcarddata: Long, pagreementinfo: Long): UInt
}

public typealias PFN_CARD_DERIVE_KEY = PFN_CARD_DERIVE_KEYFn?

public fun interface PFN_CARD_DESTROY_DH_AGREEMENTFn {
    public operator fun invoke(pcarddata: Long, bsecretagreementindex: UByte, dwflags: UInt): UInt
}

public typealias PFN_CARD_DESTROY_DH_AGREEMENT = PFN_CARD_DESTROY_DH_AGREEMENTFn?

public fun interface PFN_CARD_DESTROY_KEYFn {
    public operator fun invoke(pcarddata: Long, hkey: ULong): UInt
}

public typealias PFN_CARD_DESTROY_KEY = PFN_CARD_DESTROY_KEYFn?

public fun interface PFN_CARD_ENUM_FILESFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pmszfilenames: Long, pdwcbfilename: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_ENUM_FILES = PFN_CARD_ENUM_FILESFn?

public fun interface PFN_CARD_GET_ALGORITHM_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, pwszalgid: PCWSTR, pwszproperty: PCWSTR, pbdata: Long, cbdata: UInt, pdwdatalen: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_GET_ALGORITHM_PROPERTY = PFN_CARD_GET_ALGORITHM_PROPERTYFn?

public fun interface PFN_CARD_GET_CHALLENGEFn {
    public operator fun invoke(pcarddata: Long, ppbchallengedata: Long, pcbchallengedata: Long): UInt
}

public typealias PFN_CARD_GET_CHALLENGE = PFN_CARD_GET_CHALLENGEFn?

public fun interface PFN_CARD_GET_CHALLENGE_EXFn {
    public operator fun invoke(pcarddata: Long, pinid: UInt, ppbchallengedata: Long, pcbchallengedata: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_GET_CHALLENGE_EX = PFN_CARD_GET_CHALLENGE_EXFn?

public fun interface PFN_CARD_GET_CONTAINER_INFOFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, dwflags: UInt, pcontainerinfo: Long): UInt
}

public typealias PFN_CARD_GET_CONTAINER_INFO = PFN_CARD_GET_CONTAINER_INFOFn?

public fun interface PFN_CARD_GET_CONTAINER_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, wszproperty: PCWSTR, pbdata: Long, cbdata: UInt, pdwdatalen: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_GET_CONTAINER_PROPERTY = PFN_CARD_GET_CONTAINER_PROPERTYFn?

public fun interface PFN_CARD_GET_FILE_INFOFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pszfilename: PCSTR, pcardfileinfo: Long): UInt
}

public typealias PFN_CARD_GET_FILE_INFO = PFN_CARD_GET_FILE_INFOFn?

public fun interface PFN_CARD_GET_KEY_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, hkey: ULong, pwszproperty: PCWSTR, pbdata: Long, cbdata: UInt, pdwdatalen: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_GET_KEY_PROPERTY = PFN_CARD_GET_KEY_PROPERTYFn?

public fun interface PFN_CARD_GET_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, wszproperty: PCWSTR, pbdata: Long, cbdata: UInt, pdwdatalen: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_GET_PROPERTY = PFN_CARD_GET_PROPERTYFn?

public fun interface PFN_CARD_GET_SHARED_KEY_HANDLEFn {
    public operator fun invoke(pcarddata: Long, pbinput: Long, cbinput: UInt, ppboutput: Long, pcboutput: Long, phkey: Long): UInt
}

public typealias PFN_CARD_GET_SHARED_KEY_HANDLE = PFN_CARD_GET_SHARED_KEY_HANDLEFn?

public fun interface PFN_CARD_IMPORT_SESSION_KEYFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, ppaddinginfo: Long, pwszblobtype: PCWSTR, pwszalgid: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_IMPORT_SESSION_KEY = PFN_CARD_IMPORT_SESSION_KEYFn?

public fun interface PFN_CARD_PROCESS_ENCRYPTED_DATAFn {
    public operator fun invoke(pcarddata: Long, hkey: ULong, pwszsecurefunction: PCWSTR, pencrypteddata: Long, cencrypteddata: UInt, pboutput: Long, cboutput: UInt, pdwoutputlen: Long, dwflags: UInt): UInt
}

public typealias PFN_CARD_PROCESS_ENCRYPTED_DATA = PFN_CARD_PROCESS_ENCRYPTED_DATAFn?

public fun interface PFN_CARD_QUERY_CAPABILITIESFn {
    public operator fun invoke(pcarddata: Long, pcardcapabilities: Long): UInt
}

public typealias PFN_CARD_QUERY_CAPABILITIES = PFN_CARD_QUERY_CAPABILITIESFn?

public fun interface PFN_CARD_QUERY_FREE_SPACEFn {
    public operator fun invoke(pcarddata: Long, dwflags: UInt, pcardfreespaceinfo: Long): UInt
}

public typealias PFN_CARD_QUERY_FREE_SPACE = PFN_CARD_QUERY_FREE_SPACEFn?

public fun interface PFN_CARD_QUERY_KEY_SIZESFn {
    public operator fun invoke(pcarddata: Long, dwkeyspec: UInt, dwflags: UInt, pkeysizes: Long): UInt
}

public typealias PFN_CARD_QUERY_KEY_SIZES = PFN_CARD_QUERY_KEY_SIZESFn?

public fun interface PFN_CARD_READ_FILEFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pszfilename: PCSTR, dwflags: UInt, ppbdata: Long, pcbdata: Long): UInt
}

public typealias PFN_CARD_READ_FILE = PFN_CARD_READ_FILEFn?

public fun interface PFN_CARD_RSA_DECRYPTFn {
    public operator fun invoke(pcarddata: Long, pinfo: Long): UInt
}

public typealias PFN_CARD_RSA_DECRYPT = PFN_CARD_RSA_DECRYPTFn?

public fun interface PFN_CARD_SET_CONTAINER_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, bcontainerindex: UByte, wszproperty: PCWSTR, pbdata: Long, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_SET_CONTAINER_PROPERTY = PFN_CARD_SET_CONTAINER_PROPERTYFn?

public fun interface PFN_CARD_SET_KEY_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, hkey: ULong, pwszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_SET_KEY_PROPERTY = PFN_CARD_SET_KEY_PROPERTYFn?

public fun interface PFN_CARD_SET_PROPERTYFn {
    public operator fun invoke(pcarddata: Long, wszproperty: PCWSTR, pbdata: Long, cbdatalen: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_SET_PROPERTY = PFN_CARD_SET_PROPERTYFn?

public fun interface PFN_CARD_SIGN_DATAFn {
    public operator fun invoke(pcarddata: Long, pinfo: Long): UInt
}

public typealias PFN_CARD_SIGN_DATA = PFN_CARD_SIGN_DATAFn?

public fun interface PFN_CARD_UNBLOCK_PINFn {
    public operator fun invoke(pcarddata: Long, pwszuserid: PCWSTR, pbauthenticationdata: Long, cbauthenticationdata: UInt, pbnewpindata: Long, cbnewpindata: UInt, cretrycount: UInt, dwflags: UInt): UInt
}

public typealias PFN_CARD_UNBLOCK_PIN = PFN_CARD_UNBLOCK_PINFn?

public fun interface PFN_CARD_WRITE_FILEFn {
    public operator fun invoke(pcarddata: Long, pszdirectoryname: PCSTR, pszfilename: PCSTR, dwflags: UInt, pbdata: Long, cbdata: UInt): UInt
}

public typealias PFN_CARD_WRITE_FILE = PFN_CARD_WRITE_FILEFn?

public fun interface PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACKFn {
    public operator fun invoke(pcert: Long, pvfindarg: Long): BOOL
}

public typealias PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK = PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACKFn?

public fun interface PFN_CERT_CREATE_CONTEXT_SORT_FUNCFn {
    public operator fun invoke(cbtotalencoded: UInt, cbremainencoded: UInt, centry: UInt, pvsort: Long): BOOL
}

public typealias PFN_CERT_CREATE_CONTEXT_SORT_FUNC = PFN_CERT_CREATE_CONTEXT_SORT_FUNCFn?

public fun interface PFN_CERT_DLL_OPEN_STORE_PROV_FUNCFn {
    public operator fun invoke(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long, hcertstore: HCERTSTORE, pstoreprovinfo: Long): BOOL
}

public typealias PFN_CERT_DLL_OPEN_STORE_PROV_FUNC = PFN_CERT_DLL_OPEN_STORE_PROV_FUNCFn?

public fun interface PFN_CERT_ENUM_PHYSICAL_STOREFn {
    public operator fun invoke(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long, pvarg: Long): BOOL
}

public typealias PFN_CERT_ENUM_PHYSICAL_STORE = PFN_CERT_ENUM_PHYSICAL_STOREFn?

public fun interface PFN_CERT_ENUM_SYSTEM_STOREFn {
    public operator fun invoke(pvsystemstore: Long, dwflags: CERT_SYSTEM_STORE_FLAGS, pstoreinfo: Long, pvreserved: Long, pvarg: Long): BOOL
}

public typealias PFN_CERT_ENUM_SYSTEM_STORE = PFN_CERT_ENUM_SYSTEM_STOREFn?

public fun interface PFN_CERT_ENUM_SYSTEM_STORE_LOCATIONFn {
    public operator fun invoke(pwszstorelocation: PCWSTR, dwflags: UInt, pvreserved: Long, pvarg: Long): BOOL
}

public typealias PFN_CERT_ENUM_SYSTEM_STORE_LOCATION = PFN_CERT_ENUM_SYSTEM_STORE_LOCATIONFn?

public fun interface PFN_CERT_IS_WEAK_HASHFn {
    public operator fun invoke(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL
}

public typealias PFN_CERT_IS_WEAK_HASH = PFN_CERT_IS_WEAK_HASHFn?

public fun interface PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACKFn {
    public operator fun invoke(pchaincontext: Long, pserverocspresponsecontext: Long, pnewcrlcontext: Long, pprevcrlcontext: Long, pvarg: Long, dwwriteocspfileerror: UInt)
}

public typealias PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK = PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACKFn?

public fun interface PFN_CERT_STORE_PROV_CLOSEFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, dwflags: UInt)
}

public typealias PFN_CERT_STORE_PROV_CLOSE = PFN_CERT_STORE_PROV_CLOSEFn?

public fun interface PFN_CERT_STORE_PROV_CONTROLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_CONTROL = PFN_CERT_STORE_PROV_CONTROLFn?

public fun interface PFN_CERT_STORE_PROV_DELETE_CERTFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcertcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_DELETE_CERT = PFN_CERT_STORE_PROV_DELETE_CERTFn?

public fun interface PFN_CERT_STORE_PROV_DELETE_CRLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcrlcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_DELETE_CRL = PFN_CERT_STORE_PROV_DELETE_CRLFn?

public fun interface PFN_CERT_STORE_PROV_DELETE_CTLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pctlcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_DELETE_CTL = PFN_CERT_STORE_PROV_DELETE_CTLFn?

public fun interface PFN_CERT_STORE_PROV_FIND_CERTFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pfindinfo: Long, pprevcertcontext: Long, dwflags: UInt, ppvstoreprovfindinfo: Long, ppprovcertcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_FIND_CERT = PFN_CERT_STORE_PROV_FIND_CERTFn?

public fun interface PFN_CERT_STORE_PROV_FIND_CRLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pfindinfo: Long, pprevcrlcontext: Long, dwflags: UInt, ppvstoreprovfindinfo: Long, ppprovcrlcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_FIND_CRL = PFN_CERT_STORE_PROV_FIND_CRLFn?

public fun interface PFN_CERT_STORE_PROV_FIND_CTLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pfindinfo: Long, pprevctlcontext: Long, dwflags: UInt, ppvstoreprovfindinfo: Long, ppprovctlcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_FIND_CTL = PFN_CERT_STORE_PROV_FIND_CTLFn?

public fun interface PFN_CERT_STORE_PROV_FREE_FIND_CERTFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcertcontext: Long, pvstoreprovfindinfo: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_FREE_FIND_CERT = PFN_CERT_STORE_PROV_FREE_FIND_CERTFn?

public fun interface PFN_CERT_STORE_PROV_FREE_FIND_CRLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcrlcontext: Long, pvstoreprovfindinfo: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_FREE_FIND_CRL = PFN_CERT_STORE_PROV_FREE_FIND_CRLFn?

public fun interface PFN_CERT_STORE_PROV_FREE_FIND_CTLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pctlcontext: Long, pvstoreprovfindinfo: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_FREE_FIND_CTL = PFN_CERT_STORE_PROV_FREE_FIND_CTLFn?

public fun interface PFN_CERT_STORE_PROV_GET_CERT_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long, pcbdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_GET_CERT_PROPERTY = PFN_CERT_STORE_PROV_GET_CERT_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_GET_CRL_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long, pcbdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_GET_CRL_PROPERTY = PFN_CERT_STORE_PROV_GET_CRL_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_GET_CTL_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long, pcbdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_GET_CTL_PROPERTY = PFN_CERT_STORE_PROV_GET_CTL_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_READ_CERTFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pstorecertcontext: Long, dwflags: UInt, ppprovcertcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_READ_CERT = PFN_CERT_STORE_PROV_READ_CERTFn?

public fun interface PFN_CERT_STORE_PROV_READ_CRLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pstorecrlcontext: Long, dwflags: UInt, ppprovcrlcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_READ_CRL = PFN_CERT_STORE_PROV_READ_CRLFn?

public fun interface PFN_CERT_STORE_PROV_READ_CTLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pstorectlcontext: Long, dwflags: UInt, ppprovctlcontext: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_READ_CTL = PFN_CERT_STORE_PROV_READ_CTLFn?

public fun interface PFN_CERT_STORE_PROV_SET_CERT_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_SET_CERT_PROPERTY = PFN_CERT_STORE_PROV_SET_CERT_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_SET_CRL_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_SET_CRL_PROPERTY = PFN_CERT_STORE_PROV_SET_CRL_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_SET_CTL_PROPERTYFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL
}

public typealias PFN_CERT_STORE_PROV_SET_CTL_PROPERTY = PFN_CERT_STORE_PROV_SET_CTL_PROPERTYFn?

public fun interface PFN_CERT_STORE_PROV_WRITE_CERTFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcertcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_WRITE_CERT = PFN_CERT_STORE_PROV_WRITE_CERTFn?

public fun interface PFN_CERT_STORE_PROV_WRITE_CRLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pcrlcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_WRITE_CRL = PFN_CERT_STORE_PROV_WRITE_CRLFn?

public fun interface PFN_CERT_STORE_PROV_WRITE_CTLFn {
    public operator fun invoke(hstoreprov: HCERTSTOREPROV, pctlcontext: Long, dwflags: UInt): BOOL
}

public typealias PFN_CERT_STORE_PROV_WRITE_CTL = PFN_CERT_STORE_PROV_WRITE_CTLFn?

public fun interface PFN_CMSG_ALLOCFn {
    public operator fun invoke(cb: ULong): Long
}

public typealias PFN_CMSG_ALLOC = PFN_CMSG_ALLOCFn?

public fun interface PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEYFn {
    public operator fun invoke(pcngcontentdecryptinfo: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY = PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEYFn?

public fun interface PFN_CMSG_CNG_IMPORT_KEY_AGREEFn {
    public operator fun invoke(pcngcontentdecryptinfo: Long, pkeyagreedecryptpara: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_CNG_IMPORT_KEY_AGREE = PFN_CMSG_CNG_IMPORT_KEY_AGREEFn?

public fun interface PFN_CMSG_CNG_IMPORT_KEY_TRANSFn {
    public operator fun invoke(pcngcontentdecryptinfo: Long, pkeytransdecryptpara: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_CNG_IMPORT_KEY_TRANS = PFN_CMSG_CNG_IMPORT_KEY_TRANSFn?

public fun interface PFN_CMSG_EXPORT_ENCRYPT_KEYFn {
    public operator fun invoke(hcryptprov: ULong, hencryptkey: ULong, ppublickeyinfo: Long, pbdata: Long, pcbdata: Long): BOOL
}

public typealias PFN_CMSG_EXPORT_ENCRYPT_KEY = PFN_CMSG_EXPORT_ENCRYPT_KEYFn?

public fun interface PFN_CMSG_EXPORT_KEY_AGREEFn {
    public operator fun invoke(pcontentencryptinfo: Long, pkeyagreeencodeinfo: Long, pkeyagreeencryptinfo: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_EXPORT_KEY_AGREE = PFN_CMSG_EXPORT_KEY_AGREEFn?

public fun interface PFN_CMSG_EXPORT_KEY_TRANSFn {
    public operator fun invoke(pcontentencryptinfo: Long, pkeytransencodeinfo: Long, pkeytransencryptinfo: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_EXPORT_KEY_TRANS = PFN_CMSG_EXPORT_KEY_TRANSFn?

public fun interface PFN_CMSG_EXPORT_MAIL_LISTFn {
    public operator fun invoke(pcontentencryptinfo: Long, pmaillistencodeinfo: Long, pmaillistencryptinfo: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_EXPORT_MAIL_LIST = PFN_CMSG_EXPORT_MAIL_LISTFn?

public fun interface PFN_CMSG_FREEFn {
    public operator fun invoke(pv: Long)
}

public typealias PFN_CMSG_FREE = PFN_CMSG_FREEFn?

public fun interface PFN_CMSG_GEN_CONTENT_ENCRYPT_KEYFn {
    public operator fun invoke(pcontentencryptinfo: Long, dwflags: UInt, pvreserved: Long): BOOL
}

public typealias PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY = PFN_CMSG_GEN_CONTENT_ENCRYPT_KEYFn?

public fun interface PFN_CMSG_GEN_ENCRYPT_KEYFn {
    public operator fun invoke(phcryptprov: Long, paiencrypt: Long, pvencryptauxinfo: Long, ppublickeyinfo: Long, pfnalloc: PFN_CMSG_ALLOC, phencryptkey: Long, ppbencryptparameters: Long, pcbencryptparameters: Long): BOOL
}

public typealias PFN_CMSG_GEN_ENCRYPT_KEY = PFN_CMSG_GEN_ENCRYPT_KEYFn?

public fun interface PFN_CMSG_IMPORT_ENCRYPT_KEYFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, paiencrypt: Long, paipubkey: Long, pbencodedkey: Long, cbencodedkey: UInt, phencryptkey: Long): BOOL
}

public typealias PFN_CMSG_IMPORT_ENCRYPT_KEY = PFN_CMSG_IMPORT_ENCRYPT_KEYFn?

public fun interface PFN_CMSG_IMPORT_KEY_AGREEFn {
    public operator fun invoke(pcontentencryptionalgorithm: Long, pkeyagreedecryptpara: Long, dwflags: UInt, pvreserved: Long, phcontentencryptkey: Long): BOOL
}

public typealias PFN_CMSG_IMPORT_KEY_AGREE = PFN_CMSG_IMPORT_KEY_AGREEFn?

public fun interface PFN_CMSG_IMPORT_KEY_TRANSFn {
    public operator fun invoke(pcontentencryptionalgorithm: Long, pkeytransdecryptpara: Long, dwflags: UInt, pvreserved: Long, phcontentencryptkey: Long): BOOL
}

public typealias PFN_CMSG_IMPORT_KEY_TRANS = PFN_CMSG_IMPORT_KEY_TRANSFn?

public fun interface PFN_CMSG_IMPORT_MAIL_LISTFn {
    public operator fun invoke(pcontentencryptionalgorithm: Long, pmaillistdecryptpara: Long, dwflags: UInt, pvreserved: Long, phcontentencryptkey: Long): BOOL
}

public typealias PFN_CMSG_IMPORT_MAIL_LIST = PFN_CMSG_IMPORT_MAIL_LISTFn?

public fun interface PFN_CMSG_STREAM_OUTPUTFn {
    public operator fun invoke(pvarg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL
}

public typealias PFN_CMSG_STREAM_OUTPUT = PFN_CMSG_STREAM_OUTPUTFn?

public fun interface PFN_CRYPT_ALLOCFn {
    public operator fun invoke(cbsize: ULong): Long
}

public typealias PFN_CRYPT_ALLOC = PFN_CRYPT_ALLOCFn?

public fun interface PFN_CRYPT_ASYNC_PARAM_FREE_FUNCFn {
    public operator fun invoke(pszparamoid: PCSTR, pvparam: Long)
}

public typealias PFN_CRYPT_ASYNC_PARAM_FREE_FUNC = PFN_CRYPT_ASYNC_PARAM_FREE_FUNCFn?

public fun interface PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNCFn {
    public operator fun invoke(pvcompletion: Long, dwcompletioncode: UInt, pszurl: PCSTR, pszobjectoid: PCSTR, pvobject: Long)
}

public typealias PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC = PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNCFn?

public fun interface PFN_CRYPT_CANCEL_RETRIEVALFn {
    public operator fun invoke(dwflags: UInt, pvarg: Long): BOOL
}

public typealias PFN_CRYPT_CANCEL_RETRIEVAL = PFN_CRYPT_CANCEL_RETRIEVALFn?

public fun interface PFN_CRYPT_ENUM_KEYID_PROPFn {
    public operator fun invoke(pkeyidentifier: Long, dwflags: UInt, pvreserved: Long, pvarg: Long, cprop: UInt, rgdwpropid: Long, rgpvdata: Long, rgcbdata: Long): BOOL
}

public typealias PFN_CRYPT_ENUM_KEYID_PROP = PFN_CRYPT_ENUM_KEYID_PROPFn?

public fun interface PFN_CRYPT_ENUM_OID_FUNCFn {
    public operator fun invoke(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, cvalue: UInt, rgdwvaluetype: Long, rgpwszvaluename: Long, rgpbvaluedata: Long, rgcbvaluedata: Long, pvarg: Long): BOOL
}

public typealias PFN_CRYPT_ENUM_OID_FUNC = PFN_CRYPT_ENUM_OID_FUNCFn?

public fun interface PFN_CRYPT_ENUM_OID_INFOFn {
    public operator fun invoke(pinfo: Long, pvarg: Long): BOOL
}

public typealias PFN_CRYPT_ENUM_OID_INFO = PFN_CRYPT_ENUM_OID_INFOFn?

public fun interface PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNCFn {
    public operator fun invoke(hncryptkey: NCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL
}

public typealias PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC = PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNCFn?

public fun interface PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNCFn {
    public operator fun invoke(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL
}

public typealias PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC = PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNCFn?

public fun interface PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNCFn {
    public operator fun invoke(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignaturealgorithm: Long, ppvdecodedsignpara: Long, ppwszcnghashalgid: Long): BOOL
}

public typealias PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC = PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNCFn?

public fun interface PFN_CRYPT_FREEFn {
    public operator fun invoke(pv: Long)
}

public typealias PFN_CRYPT_FREE = PFN_CRYPT_FREEFn?

public fun interface PFN_CRYPT_GET_SIGNER_CERTIFICATEFn {
    public operator fun invoke(pvgetarg: Long, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignerid: Long, hmsgcertstore: HCERTSTORE): Long
}

public typealias PFN_CRYPT_GET_SIGNER_CERTIFICATE = PFN_CRYPT_GET_SIGNER_CERTIFICATEFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSHFn {
    public operator fun invoke(pcontext: Long, rgidentifierornamelist: Long, dwidentifierornamelistcount: UInt): BOOL
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSH = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSHFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREEFn {
    public operator fun invoke(pplugincontext: Long, pbdata: Long)
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREEFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIERFn {
    public operator fun invoke(pplugincontext: Long, pidentifier: Long)
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIERFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORDFn {
    public operator fun invoke(pplugincontext: Long, pwszpassword: PCWSTR)
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORDFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GETFn {
    public operator fun invoke(pplugincontext: Long, pidentifier: Long, dwnametype: UInt, pnameblob: Long, ppbcontent: Long, pcbcontent: Long, ppwszpassword: Long, ppidentifier: Long): BOOL
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GETFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZEFn {
    public operator fun invoke(pfnflush: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSH, pcontext: Long, pdwexpectedobjectcount: Long, ppfunctable: Long, ppplugincontext: Long): BOOL
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZEFn?

public fun interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASEFn {
    public operator fun invoke(dwreason: CRYPT_OBJECT_LOCATOR_RELEASE_REASON, pplugincontext: Long)
}

public typealias PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE = PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASEFn?

public fun interface PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNCFn {
    public operator fun invoke(hkey: NCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignaturealgorithm: Long, pvdecodedsignpara: Long, pwszcngpubkeyalgid: PCWSTR, pwszcnghashalgid: PCWSTR, pbcomputedhash: Long, cbcomputedhash: UInt, pbsignature: Long, pcbsignature: Long): BOOL
}

public typealias PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC = PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNCFn?

public fun interface PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNCFn {
    public operator fun invoke(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppubkeyinfo: Long, psignaturealgorithm: Long, pvdecodedsignpara: Long, pwszcngpubkeyalgid: PCWSTR, pwszcnghashalgid: PCWSTR, pbcomputedhash: Long, cbcomputedhash: UInt, pbsignature: Long, cbsignature: UInt): BOOL
}

public typealias PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC = PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNCFn?

public fun interface PFN_CRYPT_XML_CREATE_TRANSFORMFn {
    public operator fun invoke(ptransform: Long, pproviderin: Long, pproviderout: Long): HRESULT
}

public typealias PFN_CRYPT_XML_CREATE_TRANSFORM = PFN_CRYPT_XML_CREATE_TRANSFORMFn?

public fun interface PFN_CRYPT_XML_DATA_PROVIDER_CLOSEFn {
    public operator fun invoke(pvcallbackstate: Long): HRESULT
}

public typealias PFN_CRYPT_XML_DATA_PROVIDER_CLOSE = PFN_CRYPT_XML_DATA_PROVIDER_CLOSEFn?

public fun interface PFN_CRYPT_XML_DATA_PROVIDER_READFn {
    public operator fun invoke(pvcallbackstate: Long, pbdata: Long, cbdata: UInt, pcbread: Long): HRESULT
}

public typealias PFN_CRYPT_XML_DATA_PROVIDER_READ = PFN_CRYPT_XML_DATA_PROVIDER_READFn?

public fun interface PFN_CRYPT_XML_ENUM_ALG_INFOFn {
    public operator fun invoke(pinfo: Long, pvarg: Long): BOOL
}

public typealias PFN_CRYPT_XML_ENUM_ALG_INFO = PFN_CRYPT_XML_ENUM_ALG_INFOFn?

public fun interface PFN_CRYPT_XML_WRITE_CALLBACKFn {
    public operator fun invoke(pvcallbackstate: Long, pbdata: Long, cbdata: UInt): HRESULT
}

public typealias PFN_CRYPT_XML_WRITE_CALLBACK = PFN_CRYPT_XML_WRITE_CALLBACKFn?

public fun interface PFN_CSP_ALLOCFn {
    public operator fun invoke(size: ULong): Long
}

public typealias PFN_CSP_ALLOC = PFN_CSP_ALLOCFn?

public fun interface PFN_CSP_CACHE_ADD_FILEFn {
    public operator fun invoke(pvcachecontext: Long, wsztag: PCWSTR, dwflags: UInt, pbdata: Long, cbdata: UInt): UInt
}

public typealias PFN_CSP_CACHE_ADD_FILE = PFN_CSP_CACHE_ADD_FILEFn?

public fun interface PFN_CSP_CACHE_DELETE_FILEFn {
    public operator fun invoke(pvcachecontext: Long, wsztag: PCWSTR, dwflags: UInt): UInt
}

public typealias PFN_CSP_CACHE_DELETE_FILE = PFN_CSP_CACHE_DELETE_FILEFn?

public fun interface PFN_CSP_CACHE_LOOKUP_FILEFn {
    public operator fun invoke(pvcachecontext: Long, wsztag: PCWSTR, dwflags: UInt, ppbdata: Long, pcbdata: Long): UInt
}

public typealias PFN_CSP_CACHE_LOOKUP_FILE = PFN_CSP_CACHE_LOOKUP_FILEFn?

public fun interface PFN_CSP_FREEFn {
    public operator fun invoke(address: Long)
}

public typealias PFN_CSP_FREE = PFN_CSP_FREEFn?

public fun interface PFN_CSP_GET_DH_AGREEMENTFn {
    public operator fun invoke(pcarddata: Long, hsecretagreement: Long, pbsecretagreementindex: Long, dwflags: UInt): UInt
}

public typealias PFN_CSP_GET_DH_AGREEMENT = PFN_CSP_GET_DH_AGREEMENTFn?

public fun interface PFN_CSP_PAD_DATAFn {
    public operator fun invoke(psigninginfo: Long, cbmaxwidth: UInt, pcbpaddedbuffer: Long, ppbpaddedbuffer: Long): UInt
}

public typealias PFN_CSP_PAD_DATA = PFN_CSP_PAD_DATAFn?

public fun interface PFN_CSP_REALLOCFn {
    public operator fun invoke(address: Long, size: ULong): Long
}

public typealias PFN_CSP_REALLOC = PFN_CSP_REALLOCFn?

public fun interface PFN_CSP_UNPAD_DATAFn {
    public operator fun invoke(prsadecryptinfo: Long, pcbunpaddeddata: Long, ppbunpaddeddata: Long): UInt
}

public typealias PFN_CSP_UNPAD_DATA = PFN_CSP_UNPAD_DATAFn?

public fun interface PFN_EXPORT_PRIV_KEY_FUNCFn {
    public operator fun invoke(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pprivatekeyinfo: Long, pcbprivatekeyinfo: Long): BOOL
}

public typealias PFN_EXPORT_PRIV_KEY_FUNC = PFN_EXPORT_PRIV_KEY_FUNCFn?

public fun interface PFN_FREE_ENCODED_OBJECT_FUNCFn {
    public operator fun invoke(pszobjectoid: PCSTR, pobject: Long, pvfreecontext: Long)
}

public typealias PFN_FREE_ENCODED_OBJECT_FUNC = PFN_FREE_ENCODED_OBJECT_FUNCFn?

public fun interface PFN_IMPORT_PRIV_KEY_FUNCFn {
    public operator fun invoke(hcryptprov: ULong, pprivatekeyinfo: Long, dwflags: UInt, pvauxinfo: Long): BOOL
}

public typealias PFN_IMPORT_PRIV_KEY_FUNC = PFN_IMPORT_PRIV_KEY_FUNCFn?

public fun interface PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNCFn {
    public operator fun invoke(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL
}

public typealias PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC = PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNCFn?

public fun interface PFN_MD_ENCRYPT_DATAFn {
    public operator fun invoke(pcarddata: Long, hkey: ULong, pwszsecurefunction: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt, ppencrypteddata: Long, pcencrypteddata: Long): UInt
}

public typealias PFN_MD_ENCRYPT_DATA = PFN_MD_ENCRYPT_DATAFn?

public fun interface PFN_MD_IMPORT_SESSION_KEYFn {
    public operator fun invoke(pcarddata: Long, pwszblobtype: PCWSTR, pwszalgid: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt): UInt
}

public typealias PFN_MD_IMPORT_SESSION_KEY = PFN_MD_IMPORT_SESSION_KEYFn?

public fun interface PFN_NCRYPT_ALLOCFn {
    public operator fun invoke(cbsize: ULong): Long
}

public typealias PFN_NCRYPT_ALLOC = PFN_NCRYPT_ALLOCFn?

public fun interface PFN_NCRYPT_FREEFn {
    public operator fun invoke(pv: Long)
}

public typealias PFN_NCRYPT_FREE = PFN_NCRYPT_FREEFn?

public fun interface PFN_OFFLOAD_MOD_EXPOFn {
    public operator fun invoke(pbbase: Long, pbexponent: Long, cbexponent: UInt, pbmodulus: Long, cbmodulus: UInt, pbresult: Long, pvoffloadprivatekey: Long, dwflags: UInt): BOOL
}

public typealias PFN_OFFLOAD_MOD_EXPO = PFN_OFFLOAD_MOD_EXPOFn?

public typealias PIN_CACHE_POLICY_TYPE = Int

public typealias SECRET_PURPOSE = Int

public typealias SECRET_TYPE = Int

public typealias SIGNER_CERT_CHOICE = UInt

public typealias SIGNER_CERT_POLICY = UInt

public typealias SIGNER_PRIVATE_KEY_CHOICE = UInt

public typealias SIGNER_SIGNATURE_ATTRIBUTE_CHOICE = UInt

public typealias SIGNER_SIGN_FLAGS = UInt

public typealias SIGNER_SUBJECT_CHOICE = UInt

public typealias SIGNER_TIMESTAMP_FLAGS = UInt

public fun interface SslComputeClientAuthHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslComputeClientAuthHashFn = SslComputeClientAuthHashFnFn?

public fun interface SslComputeEapKeyBlockFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslComputeEapKeyBlockFn = SslComputeEapKeyBlockFnFn?

public fun interface SslComputeFinishedHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT
}

public typealias SslComputeFinishedHashFn = SslComputeFinishedHashFnFn?

public fun interface SslComputeSessionHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslComputeSessionHashFn = SslComputeSessionHashFnFn?

public fun interface SslCreateClientAuthHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT
}

public typealias SslCreateClientAuthHashFn = SslCreateClientAuthHashFnFn?

public fun interface SslCreateEphemeralKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT
}

public typealias SslCreateEphemeralKeyFn = SslCreateEphemeralKeyFnFn?

public fun interface SslCreateHandshakeHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT
}

public typealias SslCreateHandshakeHashFn = SslCreateHandshakeHashFnFn?

public fun interface SslDecryptPacketFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT
}

public typealias SslDecryptPacketFn = SslDecryptPacketFnFn?

public fun interface SslDuplicateTranscriptHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phduplicatetranscripthash: Long, dwflags: UInt): HRESULT
}

public typealias SslDuplicateTranscriptHashFn = SslDuplicateTranscriptHashFnFn?

public fun interface SslEncryptPacketFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT
}

public typealias SslEncryptPacketFn = SslEncryptPacketFnFn?

public fun interface SslEnumCipherSuitesExFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT
}

public typealias SslEnumCipherSuitesExFn = SslEnumCipherSuitesExFnFn?

public fun interface SslEnumCipherSuitesFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT
}

public typealias SslEnumCipherSuitesFn = SslEnumCipherSuitesFnFn?

public fun interface SslEnumEccCurvesFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT
}

public typealias SslEnumEccCurvesFn = SslEnumEccCurvesFnFn?

public fun interface SslExpandBinderKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandBinderKeyFn = SslExpandBinderKeyFnFn?

public fun interface SslExpandExporterMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandExporterMasterKeyFn = SslExpandExporterMasterKeyFnFn?

public fun interface SslExpandPreSharedKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandPreSharedKeyFn = SslExpandPreSharedKeyFnFn?

public fun interface SslExpandResumptionMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandResumptionMasterKeyFn = SslExpandResumptionMasterKeyFnFn?

public fun interface SslExpandTrafficKeysFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandTrafficKeysFn = SslExpandTrafficKeysFnFn?

public fun interface SslExpandWriteKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExpandWriteKeyFn = SslExpandWriteKeyFnFn?

public fun interface SslExportKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslExportKeyFn = SslExportKeyFnFn?

public fun interface SslExportKeyingMaterialFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT
}

public typealias SslExportKeyingMaterialFn = SslExportKeyingMaterialFnFn?

public fun interface SslExtractEarlyKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExtractEarlyKeyFn = SslExtractEarlyKeyFnFn?

public fun interface SslExtractHandshakeKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExtractHandshakeKeyFn = SslExtractHandshakeKeyFnFn?

public fun interface SslExtractMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslExtractMasterKeyFn = SslExtractMasterKeyFnFn?

public fun interface SslFreeBufferFnFn {
    public operator fun invoke(pvinput: Long): HRESULT
}

public typealias SslFreeBufferFn = SslFreeBufferFnFn?

public fun interface SslFreeObjectFnFn {
    public operator fun invoke(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT
}

public typealias SslFreeObjectFn = SslFreeObjectFnFn?

public fun interface SslGenerateMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslGenerateMasterKeyFn = SslGenerateMasterKeyFnFn?

public fun interface SslGeneratePreMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslGeneratePreMasterKeyFn = SslGeneratePreMasterKeyFnFn?

public fun interface SslGenerateSessionKeysFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT
}

public typealias SslGenerateSessionKeysFn = SslGenerateSessionKeysFnFn?

public fun interface SslGetCipherSuitePRFHashAlgorithmFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT
}

public typealias SslGetCipherSuitePRFHashAlgorithmFn = SslGetCipherSuitePRFHashAlgorithmFnFn?

public fun interface SslGetKeyPropertyFnFn {
    public operator fun invoke(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT
}

public typealias SslGetKeyPropertyFn = SslGetKeyPropertyFnFn?

public fun interface SslGetProviderPropertyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT
}

public typealias SslGetProviderPropertyFn = SslGetProviderPropertyFnFn?

public fun interface SslHashHandshakeFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT
}

public typealias SslHashHandshakeFn = SslHashHandshakeFnFn?

public fun interface SslImportKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT
}

public typealias SslImportKeyFn = SslImportKeyFnFn?

public fun interface SslImportMasterKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT
}

public typealias SslImportMasterKeyFn = SslImportMasterKeyFnFn?

public fun interface SslInitializeInterfaceFnFn {
    public operator fun invoke(pszprovidername: PCWSTR, pfunctiontable: Long, dwflags: UInt): HRESULT
}

public typealias SslInitializeInterfaceFn = SslInitializeInterfaceFnFn?

public fun interface SslLookupCipherLengthsFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT
}

public typealias SslLookupCipherLengthsFn = SslLookupCipherLengthsFnFn?

public fun interface SslLookupCipherSuiteInfoFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT
}

public typealias SslLookupCipherSuiteInfoFn = SslLookupCipherSuiteInfoFnFn?

public fun interface SslOpenPrivateKeyFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT
}

public typealias SslOpenPrivateKeyFn = SslOpenPrivateKeyFnFn?

public fun interface SslOpenProviderFnFn {
    public operator fun invoke(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT
}

public typealias SslOpenProviderFn = SslOpenProviderFnFn?

public fun interface SslSignHashFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT
}

public typealias SslSignHashFn = SslSignHashFnFn?

public fun interface SslVerifySignatureFnFn {
    public operator fun invoke(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT
}

public typealias SslVerifySignatureFn = SslVerifySignatureFnFn?
