package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.NCRYPT_DESCRIPTOR_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.NCRYPT_STREAM_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.system.registry.REG_VALUE_TYPE

public fun interface FnCallback {
    public operator fun invoke(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long, pvarg: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(pvsystemstore: Long, dwflags: CERT_SYSTEM_STORE_FLAGS, pstoreinfo: Long, pvreserved: Long, pvarg: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(pwszstorelocation: PCWSTR, dwflags: UInt, pvreserved: Long, pvarg: Long): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(pkeyidentifier: Long, dwflags: UInt, pvreserved: Long, pvarg: Long, cprop: UInt, rgdwpropid: Long, rgpvdata: Long, rgcbdata: Long): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, cvalue: UInt, rgdwvaluetype: Long, rgpwszvaluename: Long, rgpbvaluedata: Long, rgcbvaluedata: Long, pvarg: Long): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(pinfo: Long, pvarg: Long): BOOL
}

public fun interface FnCallback6 {
    public operator fun invoke(dwflags: UInt, pvarg: Long): BOOL
}

public fun interface FnCallback7 {
    public operator fun invoke(pszparamoid: PCSTR, pvparam: Long)
}

public fun interface FnCallback8 {
    public operator fun invoke(pvcallbackstate: Long, pbdata: Long, cbdata: UInt): HRESULT
}

public fun BCryptAddContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, dwposition: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptAddContextFunction", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, dwposition.toLong())).toInt()
}

public fun BCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwposition: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptAddContextFunctionProvider", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pszprovider, dwposition.toLong())).toInt()
}

public fun BCryptCloseAlgorithmProvider(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptCloseAlgorithmProvider", longArrayOf(halgorithm, dwflags.toLong())).toInt()
}

public fun BCryptConfigureContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptConfigureContext", longArrayOf(dwtable.toLong(), pszcontext, pconfig)).toInt()
}

public fun BCryptConfigureContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pconfig: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptConfigureContextFunction", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pconfig)).toInt()
}

public fun BCryptCreateContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptCreateContext", longArrayOf(dwtable.toLong(), pszcontext, pconfig)).toInt()
}

public fun BCryptCreateHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptCreateHash", longArrayOf(halgorithm, phhash, pbhashobject, cbhashobject.toLong(), pbsecret, cbsecret.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptCreateMultiHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptCreateMultiHash", longArrayOf(halgorithm, phhash, nhashes.toLong(), pbhashobject, cbhashobject.toLong(), pbsecret, cbsecret.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptDecrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDecrypt", longArrayOf(hkey, pbinput, cbinput.toLong(), ppaddinginfo, pbiv, cbiv.toLong(), pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptDeleteContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDeleteContext", longArrayOf(dwtable.toLong(), pszcontext)).toInt()
}

public fun BCryptDeriveKey(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDeriveKey", longArrayOf(hsharedsecret, pwszkdf, pparameterlist, pbderivedkey, cbderivedkey.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptDeriveKeyCapi(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDeriveKeyCapi", longArrayOf(hhash, htargetalg, pbderivedkey, cbderivedkey.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptDeriveKeyPBKDF2(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDeriveKeyPBKDF2", longArrayOf(hprf, pbpassword, cbpassword.toLong(), pbsalt, cbsalt.toLong(), citerations.toLong(), pbderivedkey, cbderivedkey.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptDestroyHash(hhash: BCRYPT_HASH_HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDestroyHash", longArrayOf(hhash)).toInt()
}

public fun BCryptDestroyKey(hkey: BCRYPT_KEY_HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDestroyKey", longArrayOf(hkey)).toInt()
}

public fun BCryptDestroySecret(hsecret: BCRYPT_SECRET_HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDestroySecret", longArrayOf(hsecret)).toInt()
}

public fun BCryptDuplicateHash(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDuplicateHash", longArrayOf(hhash, phnewhash, pbhashobject, cbhashobject.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptDuplicateKey(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptDuplicateKey", longArrayOf(hkey, phnewkey, pbkeyobject, cbkeyobject.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptEncrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEncrypt", longArrayOf(hkey, pbinput, cbinput.toLong(), ppaddinginfo, pbiv, cbiv.toLong(), pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptEnumAlgorithms(dwalgoperations: BCRYPT_OPERATION, palgcount: Long, ppalglist: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumAlgorithms", longArrayOf(dwalgoperations.toLong(), palgcount, ppalglist, dwflags.toLong())).toInt()
}

public fun BCryptEnumContextFunctionProviders(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumContextFunctionProviders", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptEnumContextFunctions(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumContextFunctions", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptEnumContexts(dwtable: BCRYPT_TABLE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumContexts", longArrayOf(dwtable.toLong(), pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptEnumProviders(pszalgid: PCWSTR, pimplcount: Long, ppimpllist: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumProviders", longArrayOf(pszalgid, pimplcount, ppimpllist, dwflags.toLong())).toInt()
}

public fun BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptEnumRegisteredProviders", longArrayOf(pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptExportKey(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptExportKey", longArrayOf(hkey, hexportkey, pszblobtype, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptFinalizeKeyPair(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptFinalizeKeyPair", longArrayOf(hkey, dwflags.toLong())).toInt()
}

public fun BCryptFinishHash(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptFinishHash", longArrayOf(hhash, pboutput, cboutput.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptFreeBuffer(pvbuffer: Long) {
    Win32DynamicFfi.invoke("bcrypt.dll", "BCryptFreeBuffer", longArrayOf(pvbuffer))
}

public fun BCryptGenRandom(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: BCRYPTGENRANDOM_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptGenRandom", longArrayOf(halgorithm, pbbuffer, cbbuffer.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptGenerateKeyPair(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptGenerateKeyPair", longArrayOf(halgorithm, phkey, dwlength.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptGenerateSymmetricKey(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptGenerateSymmetricKey", longArrayOf(halgorithm, phkey, pbkeyobject, cbkeyobject.toLong(), pbsecret, cbsecret.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptGetFipsAlgorithmMode(pfenabled: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptGetFipsAlgorithmMode", longArrayOf(pfenabled)).toInt()
}

public fun BCryptGetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptGetProperty", longArrayOf(hobject, pszproperty, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptHash(halgorithm: BCRYPT_ALG_HANDLE, pbsecret: Long, cbsecret: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptHash", longArrayOf(halgorithm, pbsecret, cbsecret.toLong(), pbinput, cbinput.toLong(), pboutput, cboutput.toLong())).toInt()
}

public fun BCryptHashData(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptHashData", longArrayOf(hhash, pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptImportKey(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptImportKey", longArrayOf(halgorithm, himportkey, pszblobtype, phkey, pbkeyobject, cbkeyobject.toLong(), pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptImportKeyPair(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptImportKeyPair", longArrayOf(halgorithm, himportkey, pszblobtype, phkey, pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptKeyDerivation(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptKeyDerivation", longArrayOf(hkey, pparameterlist, pbderivedkey, cbderivedkey.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: PCWSTR, pszimplementation: PCWSTR, dwflags: BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptOpenAlgorithmProvider", longArrayOf(phalgorithm, pszalgid, pszimplementation, dwflags.toLong())).toInt()
}

public fun BCryptProcessMultiOperations(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptProcessMultiOperations", longArrayOf(hobject, operationtype.toLong(), poperations, cboperations.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptQueryContextConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptQueryContextConfiguration", longArrayOf(dwtable.toLong(), pszcontext, pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptQueryContextFunctionConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptQueryContextFunctionConfiguration", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptQueryContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, pcbvalue: Long, ppbvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptQueryContextFunctionProperty", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pszproperty, pcbvalue, ppbvalue)).toInt()
}

public fun BCryptQueryProviderRegistration(pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptQueryProviderRegistration", longArrayOf(pszprovider, dwmode.toLong(), dwinterface.toLong(), pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptRegisterConfigChangeNotify(phevent: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptRegisterConfigChangeNotify", longArrayOf(phevent)).toInt()
}

public fun BCryptRegisterProvider(pszprovider: PCWSTR, dwflags: UInt, preg: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptRegisterProvider", longArrayOf(pszprovider, dwflags.toLong(), preg)).toInt()
}

public fun BCryptRemoveContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptRemoveContextFunction", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction)).toInt()
}

public fun BCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptRemoveContextFunctionProvider", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pszprovider)).toInt()
}

public fun BCryptResolveProviders(pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwflags: BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer: Long, ppbuffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptResolveProviders", longArrayOf(pszcontext, dwinterface.toLong(), pszfunction, pszprovider, dwmode.toLong(), dwflags.toLong(), pcbbuffer, ppbuffer)).toInt()
}

public fun BCryptSecretAgreement(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptSecretAgreement", longArrayOf(hprivkey, hpubkey, phagreedsecret, dwflags.toLong())).toInt()
}

public fun BCryptSetContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, cbvalue: UInt, pbvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptSetContextFunctionProperty", longArrayOf(dwtable.toLong(), pszcontext, dwinterface.toLong(), pszfunction, pszproperty, cbvalue.toLong(), pbvalue)).toInt()
}

public fun BCryptSetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptSetProperty", longArrayOf(hobject, pszproperty, pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun BCryptSignHash(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptSignHash", longArrayOf(hkey, ppaddinginfo, pbinput, cbinput.toLong(), pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun BCryptUnregisterConfigChangeNotify(hevent: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptUnregisterConfigChangeNotify", longArrayOf(hevent)).toInt()
}

public fun BCryptUnregisterProvider(pszprovider: PCWSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptUnregisterProvider", longArrayOf(pszprovider)).toInt()
}

public fun BCryptVerifySignature(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: BCRYPT_FLAGS): NTSTATUS {
    return Win32DynamicFfi.invoke("bcrypt.dll", "BCryptVerifySignature", longArrayOf(hkey, ppaddinginfo, pbhash, cbhash.toLong(), pbsignature, cbsignature.toLong(), dwflags.toLong())).toInt()
}

public fun CertAddCRLContextToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCRLContextToStore", longArrayOf(hcertstore, pcrlcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddCRLLinkToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCRLLinkToStore", longArrayOf(hcertstore, pcrlcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddCTLContextToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCTLContextToStore", longArrayOf(hcertstore, pctlcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddCTLLinkToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCTLLinkToStore", longArrayOf(hcertstore, pctlcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddCertificateContextToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCertificateContextToStore", longArrayOf(hcertstore, pcertcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddCertificateLinkToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddCertificateLinkToStore", longArrayOf(hcertstore, pcertcontext, dwadddisposition.toLong(), ppstorecontext)).toInt()
}

public fun CertAddEncodedCRLToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEncodedCRLToStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), pbcrlencoded, cbcrlencoded.toLong(), dwadddisposition.toLong(), ppcrlcontext)).toInt()
}

public fun CertAddEncodedCTLToStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbctlencoded: Long, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEncodedCTLToStore", longArrayOf(hcertstore, dwmsgandcertencodingtype.toLong(), pbctlencoded, cbctlencoded.toLong(), dwadddisposition.toLong(), ppctlcontext)).toInt()
}

public fun CertAddEncodedCertificateToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEncodedCertificateToStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), pbcertencoded, cbcertencoded.toLong(), dwadddisposition.toLong(), ppcertcontext)).toInt()
}

public fun CertAddEncodedCertificateToSystemStoreA(szcertstorename: PCSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEncodedCertificateToSystemStoreA", longArrayOf(szcertstorename, pbcertencoded, cbcertencoded.toLong())).toInt()
}

public fun CertAddEncodedCertificateToSystemStoreW(szcertstorename: PCWSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEncodedCertificateToSystemStoreW", longArrayOf(szcertstorename, pbcertencoded, cbcertencoded.toLong())).toInt()
}

public fun CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddEnhancedKeyUsageIdentifier", longArrayOf(pcertcontext, pszusageidentifier)).toInt()
}

public fun CertAddRefServerOcspResponse(hserverocspresponse: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertAddRefServerOcspResponse", longArrayOf(hserverocspresponse))
}

public fun CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertAddRefServerOcspResponseContext", longArrayOf(pserverocspresponsecontext))
}

public fun CertAddSerializedElementToStore(hcertstore: HCERTSTORE, pbelement: Long, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: Long, ppvcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddSerializedElementToStore", longArrayOf(hcertstore, pbelement, cbelement.toLong(), dwadddisposition.toLong(), dwflags.toLong(), dwcontexttypeflags.toLong(), pdwcontexttype, ppvcontext)).toInt()
}

public fun CertAddStoreToCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE, dwupdateflags: UInt, dwpriority: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAddStoreToCollection", longArrayOf(hcollectionstore, hsiblingstore, dwupdateflags.toLong(), dwpriority.toLong())).toInt()
}

public fun CertAlgIdToOID(dwalgid: UInt): PCSTR {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertAlgIdToOID", longArrayOf(dwalgid.toLong()))
}

public fun CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: UInt) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertCloseServerOcspResponse", longArrayOf(hserverocspresponse, dwflags.toLong()))
}

public fun CertCloseStore(hcertstore: HCERTSTORE, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCloseStore", longArrayOf(hcertstore, dwflags.toLong())).toInt()
}

public fun CertCompareCertificate(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid1: Long, pcertid2: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCompareCertificate", longArrayOf(dwcertencodingtype.toLong(), pcertid1, pcertid2)).toInt()
}

public fun CertCompareCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertname1: Long, pcertname2: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCompareCertificateName", longArrayOf(dwcertencodingtype.toLong(), pcertname1, pcertname2)).toInt()
}

public fun CertCompareIntegerBlob(pint1: Long, pint2: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCompareIntegerBlob", longArrayOf(pint1, pint2)).toInt()
}

public fun CertComparePublicKeyInfo(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey1: Long, ppublickey2: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertComparePublicKeyInfo", longArrayOf(dwcertencodingtype.toLong(), ppublickey1, ppublickey2)).toInt()
}

public fun CertControlStore(hcertstore: HCERTSTORE, dwflags: CERT_CONTROL_STORE_FLAGS, dwctrltype: UInt, pvctrlpara: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertControlStore", longArrayOf(hcertstore, dwflags.toLong(), dwctrltype.toLong(), pvctrlpara)).toInt()
}

public fun CertCreateCRLContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateCRLContext", longArrayOf(dwcertencodingtype.toLong(), pbcrlencoded, cbcrlencoded.toLong()))
}

public fun CertCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: Long, cbctlencoded: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateCTLContext", longArrayOf(dwmsgandcertencodingtype.toLong(), pbctlencoded, cbctlencoded.toLong()))
}

public fun CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: UInt, rgoptattr: Long, dwflags: UInt, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateCTLEntryFromCertificateContextProperties", longArrayOf(pcertcontext, coptattr.toLong(), rgoptattr, dwflags.toLong(), pvreserved, pctlentry, pcbctlentry)).toInt()
}

public fun CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateCertificateChainEngine", longArrayOf(pconfig, phchainengine)).toInt()
}

public fun CertCreateCertificateContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateCertificateContext", longArrayOf(dwcertencodingtype.toLong(), pbcertencoded, cbcertencoded.toLong()))
}

public fun CertCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pcreatepara: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateContext", longArrayOf(dwcontexttype.toLong(), dwencodingtype.toLong(), pbencoded, cbencoded.toLong(), dwflags.toLong(), pcreatepara))
}

public fun CertCreateSelfSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob: Long, dwflags: CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertCreateSelfSignCertificate", longArrayOf(hcryptprovorncryptkey.toLong(), psubjectissuerblob, dwflags.toLong(), pkeyprovinfo, psignaturealgorithm, pstarttime, pendtime, pextensions))
}

public fun CertDeleteCRLFromStore(pcrlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDeleteCRLFromStore", longArrayOf(pcrlcontext)).toInt()
}

public fun CertDeleteCTLFromStore(pctlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDeleteCTLFromStore", longArrayOf(pctlcontext)).toInt()
}

public fun CertDeleteCertificateFromStore(pcertcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDeleteCertificateFromStore", longArrayOf(pcertcontext)).toInt()
}

public fun CertDuplicateCRLContext(pcrlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDuplicateCRLContext", longArrayOf(pcrlcontext))
}

public fun CertDuplicateCTLContext(pctlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDuplicateCTLContext", longArrayOf(pctlcontext))
}

public fun CertDuplicateCertificateChain(pchaincontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDuplicateCertificateChain", longArrayOf(pchaincontext))
}

public fun CertDuplicateCertificateContext(pcertcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDuplicateCertificateContext", longArrayOf(pcertcontext))
}

public fun CertDuplicateStore(hcertstore: HCERTSTORE): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertDuplicateStore", longArrayOf(hcertstore))
}

public fun CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCRLContextProperties", longArrayOf(pcrlcontext, dwpropid.toLong())).toUInt()
}

public fun CertEnumCRLsInStore(hcertstore: HCERTSTORE, pprevcrlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCRLsInStore", longArrayOf(hcertstore, pprevcrlcontext))
}

public fun CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCTLContextProperties", longArrayOf(pctlcontext, dwpropid.toLong())).toUInt()
}

public fun CertEnumCTLsInStore(hcertstore: HCERTSTORE, pprevctlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCTLsInStore", longArrayOf(hcertstore, pprevctlcontext))
}

public fun CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCertificateContextProperties", longArrayOf(pcertcontext, dwpropid.toLong())).toUInt()
}

public fun CertEnumCertificatesInStore(hcertstore: HCERTSTORE, pprevcertcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumCertificatesInStore", longArrayOf(hcertstore, pprevcertcontext))
}

public fun CertEnumPhysicalStore(pvsystemstore: Long, dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_PHYSICAL_STORE): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumPhysicalStore", longArrayOf(pvsystemstore, dwflags.toLong(), pvarg, Win32DynamicFfi.objectSlot(pfnenum))).toInt()
}

public fun CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumSubjectInSortedCTL", longArrayOf(pctlcontext, ppvnextsubject, psubjectidentifier, pencodedattributes)).toInt()
}

public fun CertEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumSystemStore", longArrayOf(dwflags.toLong(), pvsystemstorelocationpara, pvarg, Win32DynamicFfi.objectSlot(pfnenum))).toInt()
}

public fun CertEnumSystemStoreLocation(dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE_LOCATION): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertEnumSystemStoreLocation", longArrayOf(dwflags.toLong(), pvarg, Win32DynamicFfi.objectSlot(pfnenum))).toInt()
}

public fun CertFindAttribute(pszobjid: PCSTR, cattr: UInt, rgattr: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindAttribute", longArrayOf(pszobjid, cattr.toLong(), rgattr))
}

public fun CertFindCRLInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: Long, pprevcrlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindCRLInStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), dwfindflags.toLong(), dwfindtype.toLong(), pvfindpara, pprevcrlcontext))
}

public fun CertFindCTLInStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CERT_FIND_TYPE, pvfindpara: Long, pprevctlcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindCTLInStore", longArrayOf(hcertstore, dwmsgandcertencodingtype.toLong(), dwfindflags.toLong(), dwfindtype.toLong(), pvfindpara, pprevctlcontext))
}

public fun CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: UInt, pvreserved: Long, ppcrlentry: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindCertificateInCRL", longArrayOf(pcert, pcrlcontext, dwflags.toLong(), pvreserved, ppcrlentry)).toInt()
}

public fun CertFindCertificateInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: CERT_FIND_FLAGS, pvfindpara: Long, pprevcertcontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindCertificateInStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), dwfindflags.toLong(), dwfindtype.toLong(), pvfindpara, pprevcertcontext))
}

public fun CertFindChainInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype: UInt, pvfindpara: Long, pprevchaincontext: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindChainInStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), dwfindflags.toLong(), dwfindtype.toLong(), pvfindpara, pprevchaincontext))
}

public fun CertFindExtension(pszobjid: PCSTR, cextensions: UInt, rgextensions: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindExtension", longArrayOf(pszobjid, cextensions.toLong(), rgextensions))
}

public fun CertFindRDNAttr(pszobjid: PCSTR, pname: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindRDNAttr", longArrayOf(pszobjid, pname))
}

public fun CertFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, pctlcontext: Long, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindSubjectInCTL", longArrayOf(dwencodingtype.toLong(), dwsubjecttype.toLong(), pvsubject, pctlcontext, dwflags.toLong()))
}

public fun CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: UInt, pvreserved: Long, pencodedattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFindSubjectInSortedCTL", longArrayOf(psubjectidentifier, pctlcontext, dwflags.toLong(), pvreserved, pencodedattributes)).toInt()
}

public fun CertFreeCRLContext(pcrlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCRLContext", longArrayOf(pcrlcontext)).toInt()
}

public fun CertFreeCTLContext(pctlcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCTLContext", longArrayOf(pctlcontext)).toInt()
}

public fun CertFreeCertificateChain(pchaincontext: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCertificateChain", longArrayOf(pchaincontext))
}

public fun CertFreeCertificateChainEngine(hchainengine: HCERTCHAINENGINE) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCertificateChainEngine", longArrayOf(hchainengine))
}

public fun CertFreeCertificateChainList(prgpselection: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCertificateChainList", longArrayOf(prgpselection))
}

public fun CertFreeCertificateContext(pcertcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertFreeCertificateContext", longArrayOf(pcertcontext)).toInt()
}

public fun CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertFreeServerOcspResponseContext", longArrayOf(pserverocspresponsecontext))
}

public fun CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetCRLContextProperty", longArrayOf(pcrlcontext, dwpropid.toLong(), pvdata, pcbdata)).toInt()
}

public fun CertGetCRLFromStore(hcertstore: HCERTSTORE, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetCRLFromStore", longArrayOf(hcertstore, pissuercontext, pprevcrlcontext, pdwflags))
}

public fun CertGetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetCTLContextProperty", longArrayOf(pctlcontext, dwpropid.toLong(), pvdata, pcbdata)).toInt()
}

public fun CertGetCertificateChain(hchainengine: HCERTCHAINENGINE, pcertcontext: Long, ptime: Long, hadditionalstore: HCERTSTORE, pchainpara: Long, dwflags: UInt, pvreserved: Long, ppchaincontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetCertificateChain", longArrayOf(hchainengine, pcertcontext, ptime, hadditionalstore, pchainpara, dwflags.toLong(), pvreserved, ppchaincontext)).toInt()
}

public fun CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetCertificateContextProperty", longArrayOf(pcertcontext, dwpropid.toLong(), pvdata, pcbdata)).toInt()
}

public fun CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: UInt, pusage: Long, pcbusage: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetEnhancedKeyUsage", longArrayOf(pcertcontext, dwflags.toLong(), pusage, pcbusage)).toInt()
}

public fun CertGetIntendedKeyUsage(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetIntendedKeyUsage", longArrayOf(dwcertencodingtype.toLong(), pcertinfo, pbkeyusage, cbkeyusage.toLong())).toInt()
}

public fun CertGetIssuerCertificateFromStore(hcertstore: HCERTSTORE, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetIssuerCertificateFromStore", longArrayOf(hcertstore, psubjectcontext, pprevissuercontext, pdwflags))
}

public fun CertGetNameStringA(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PSTR, cchnamestring: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetNameStringA", longArrayOf(pcertcontext, dwtype.toLong(), dwflags.toLong(), pvtypepara, psznamestring, cchnamestring.toLong())).toUInt()
}

public fun CertGetNameStringW(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PWSTR, cchnamestring: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetNameStringW", longArrayOf(pcertcontext, dwtype.toLong(), dwflags.toLong(), pvtypepara, psznamestring, cchnamestring.toLong())).toUInt()
}

public fun CertGetPublicKeyLength(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey: Long): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetPublicKeyLength", longArrayOf(dwcertencodingtype.toLong(), ppublickey)).toUInt()
}

public fun CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: UInt, pvreserved: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetServerOcspResponseContext", longArrayOf(hserverocspresponse, dwflags.toLong(), pvreserved))
}

public fun CertGetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetStoreProperty", longArrayOf(hcertstore, dwpropid.toLong(), pvdata, pcbdata)).toInt()
}

public fun CertGetSubjectCertificateFromStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetSubjectCertificateFromStore", longArrayOf(hcertstore, dwcertencodingtype.toLong(), pcertid))
}

public fun CertGetValidUsages(ccerts: UInt, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertGetValidUsages", longArrayOf(ccerts.toLong(), rghcerts, cnumoids, rghoids, pcboids)).toInt()
}

public fun CertIsRDNAttrsInCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwflags: UInt, pcertname: Long, prdn: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertIsRDNAttrsInCertificateName", longArrayOf(dwcertencodingtype.toLong(), dwflags.toLong(), pcertname, prdn)).toInt()
}

public fun CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: PCWSTR, psigningcert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertIsStrongHashToSign", longArrayOf(pstrongsignpara, pwszcnghashalgid, psigningcert)).toInt()
}

public fun CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertIsValidCRLForCertificate", longArrayOf(pcert, pcrl, dwflags.toLong(), pvreserved)).toInt()
}

public fun CertIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertIsWeakHash", longArrayOf(dwhashusetype.toLong(), pwszcnghashalgid, dwchainflags.toLong(), psignerchaincontext, ptimestamp, pwszfilename)).toInt()
}

public fun CertNameToStrA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PSTR, csz: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertNameToStrA", longArrayOf(dwcertencodingtype.toLong(), pname, dwstrtype.toLong(), psz, csz.toLong())).toUInt()
}

public fun CertNameToStrW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PWSTR, csz: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertNameToStrW", longArrayOf(dwcertencodingtype.toLong(), pname, dwstrtype.toLong(), psz, csz.toLong())).toUInt()
}

public fun CertOIDToAlgId(pszobjid: PCSTR): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertOIDToAlgId", longArrayOf(pszobjid)).toUInt()
}

public fun CertOpenServerOcspResponse(pchaincontext: Long, dwflags: UInt, popenpara: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertOpenServerOcspResponse", longArrayOf(pchaincontext, dwflags.toLong(), popenpara))
}

public fun CertOpenStore(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertOpenStore", longArrayOf(lpszstoreprovider, dwencodingtype.toLong(), hcryptprov.toLong(), dwflags.toLong(), pvpara))
}

public fun CertOpenSystemStoreA(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCSTR): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertOpenSystemStoreA", longArrayOf(hprov.toLong(), szsubsystemprotocol))
}

public fun CertOpenSystemStoreW(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCWSTR): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertOpenSystemStoreW", longArrayOf(hprov.toLong(), szsubsystemprotocol))
}

public fun CertRDNValueToStrA(dwvaluetype: UInt, pvalue: Long, psz: PSTR, csz: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRDNValueToStrA", longArrayOf(dwvaluetype.toLong(), pvalue, psz, csz.toLong())).toUInt()
}

public fun CertRDNValueToStrW(dwvaluetype: UInt, pvalue: Long, psz: PWSTR, csz: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRDNValueToStrW", longArrayOf(dwvaluetype.toLong(), pvalue, psz, csz.toLong())).toUInt()
}

public fun CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRegisterPhysicalStore", longArrayOf(pvsystemstore, dwflags.toLong(), pwszstorename, pstoreinfo, pvreserved)).toInt()
}

public fun CertRegisterSystemStore(pvsystemstore: Long, dwflags: UInt, pstoreinfo: Long, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRegisterSystemStore", longArrayOf(pvsystemstore, dwflags.toLong(), pstoreinfo, pvreserved)).toInt()
}

public fun CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRemoveEnhancedKeyUsageIdentifier", longArrayOf(pcertcontext, pszusageidentifier)).toInt()
}

public fun CertRemoveStoreFromCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE) {
    Win32DynamicFfi.invoke("crypt32.dll", "CertRemoveStoreFromCollection", longArrayOf(hcollectionstore, hsiblingstore))
}

public fun CertResyncCertificateChainEngine(hchainengine: HCERTCHAINENGINE): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertResyncCertificateChainEngine", longArrayOf(hchainengine)).toInt()
}

public fun CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertRetrieveLogoOrBiometricInfo", longArrayOf(pcertcontext, lpszlogoorbiometrictype, dwretrievalflags.toLong(), dwtimeout.toLong(), dwflags.toLong(), pvreserved, ppbdata, pcbdata, ppwszmimetype)).toInt()
}

public fun CertSaveStore(hcertstore: HCERTSTORE, dwencodingtype: CERT_QUERY_ENCODING_TYPE, dwsaveas: CERT_STORE_SAVE_AS, dwsaveto: CERT_STORE_SAVE_TO, pvsavetopara: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSaveStore", longArrayOf(hcertstore, dwencodingtype.toLong(), dwsaveas.toLong(), dwsaveto.toLong(), pvsavetopara, dwflags.toLong())).toInt()
}

public fun CertSelectCertificateChains(pselectioncontext: Long, dwflags: UInt, pchainparameters: Long, ccriteria: UInt, rgpcriteria: Long, hstore: HCERTSTORE, pcselection: Long, pprgpselection: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSelectCertificateChains", longArrayOf(pselectioncontext, dwflags.toLong(), pchainparameters, ccriteria.toLong(), rgpcriteria, hstore, pcselection, pprgpselection)).toInt()
}

public fun CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSerializeCRLStoreElement", longArrayOf(pcrlcontext, dwflags.toLong(), pbelement, pcbelement)).toInt()
}

public fun CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSerializeCTLStoreElement", longArrayOf(pctlcontext, dwflags.toLong(), pbelement, pcbelement)).toInt()
}

public fun CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSerializeCertificateStoreElement", longArrayOf(pcertcontext, dwflags.toLong(), pbelement, pcbelement)).toInt()
}

public fun CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetCRLContextProperty", longArrayOf(pcrlcontext, dwpropid.toLong(), dwflags.toLong(), pvdata)).toInt()
}

public fun CertSetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetCTLContextProperty", longArrayOf(pctlcontext, dwpropid.toLong(), dwflags.toLong(), pvdata)).toInt()
}

public fun CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetCertificateContextPropertiesFromCTLEntry", longArrayOf(pcertcontext, pctlentry, dwflags.toLong())).toInt()
}

public fun CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetCertificateContextProperty", longArrayOf(pcertcontext, dwpropid.toLong(), dwflags.toLong(), pvdata)).toInt()
}

public fun CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetEnhancedKeyUsage", longArrayOf(pcertcontext, pusage)).toInt()
}

public fun CertSetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertSetStoreProperty", longArrayOf(hcertstore, dwpropid.toLong(), dwflags.toLong(), pvdata)).toInt()
}

public fun CertStrToNameA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertStrToNameA", longArrayOf(dwcertencodingtype.toLong(), pszx500, dwstrtype.toLong(), pvreserved, pbencoded, pcbencoded, ppszerror)).toInt()
}

public fun CertStrToNameW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCWSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertStrToNameW", longArrayOf(dwcertencodingtype.toLong(), pszx500, dwstrtype.toLong(), pvreserved, pbencoded, pcbencoded, ppszerror)).toInt()
}

public fun CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertUnregisterPhysicalStore", longArrayOf(pvsystemstore, dwflags.toLong(), pwszstorename)).toInt()
}

public fun CertUnregisterSystemStore(pvsystemstore: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertUnregisterSystemStore", longArrayOf(pvsystemstore, dwflags.toLong())).toInt()
}

public fun CertVerifyCRLRevocation(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long, ccrlinfo: UInt, rgpcrlinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyCRLRevocation", longArrayOf(dwcertencodingtype.toLong(), pcertid, ccrlinfo.toLong(), rgpcrlinfo)).toInt()
}

public fun CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyCRLTimeValidity", longArrayOf(ptimetoverify, pcrlinfo)).toInt()
}

public fun CertVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, psubjectusage: Long, dwflags: UInt, pverifyusagepara: Long, pverifyusagestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyCTLUsage", longArrayOf(dwencodingtype.toLong(), dwsubjecttype.toLong(), pvsubject, psubjectusage, dwflags.toLong(), pverifyusagepara, pverifyusagestatus)).toInt()
}

public fun CertVerifyCertificateChainPolicy(pszpolicyoid: PCSTR, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyCertificateChainPolicy", longArrayOf(pszpolicyoid, pchaincontext, ppolicypara, ppolicystatus)).toInt()
}

public fun CertVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: Long, dwflags: UInt, prevpara: Long, prevstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyRevocation", longArrayOf(dwencodingtype.toLong(), dwrevtype.toLong(), ccontext.toLong(), rgpvcontext, dwflags.toLong(), prevpara, prevstatus)).toInt()
}

public fun CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifySubjectCertificateContext", longArrayOf(psubject, pissuer, pdwflags)).toInt()
}

public fun CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyTimeValidity", longArrayOf(ptimetoverify, pcertinfo)).toInt()
}

public fun CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CertVerifyValidityNesting", longArrayOf(psubjectinfo, pissuerinfo)).toInt()
}

public fun CloseCryptoHandle(hcrypto: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "CloseCryptoHandle", longArrayOf(hcrypto)).toInt()
}

public fun CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: CRYPT_ACQUIRE_FLAGS, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptAcquireCertificatePrivateKey", longArrayOf(pcert, dwflags.toLong(), pvparameters, phcryptprovorncryptkey, pdwkeyspec, pfcallerfreeprovorncryptkey)).toInt()
}

public fun CryptAcquireContextA(phprov: Long, szcontainer: PCSTR, szprovider: PCSTR, dwprovtype: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptAcquireContextA", longArrayOf(phprov, szcontainer, szprovider, dwprovtype.toLong(), dwflags.toLong())).toInt()
}

public fun CryptAcquireContextW(phprov: Long, szcontainer: PCWSTR, szprovider: PCWSTR, dwprovtype: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptAcquireContextW", longArrayOf(phprov, szcontainer, szprovider, dwprovtype.toLong(), dwflags.toLong())).toInt()
}

public fun CryptBinaryToStringA(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PSTR, pcchstring: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptBinaryToStringA", longArrayOf(pbbinary, cbbinary.toLong(), dwflags.toLong(), pszstring, pcchstring)).toInt()
}

public fun CryptBinaryToStringW(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PWSTR, pcchstring: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptBinaryToStringW", longArrayOf(pbbinary, cbbinary.toLong(), dwflags.toLong(), pszstring, pcchstring)).toInt()
}

public fun CryptCloseAsyncHandle(hasync: HCRYPTASYNC): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptCloseAsyncHandle", longArrayOf(hasync)).toInt()
}

public fun CryptContextAddRef(hprov: ULong, pdwreserved: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptContextAddRef", longArrayOf(hprov.toLong(), pdwreserved, dwflags.toLong())).toInt()
}

public fun CryptCreateAsyncHandle(dwflags: UInt, phasync: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptCreateAsyncHandle", longArrayOf(dwflags.toLong(), phasync)).toInt()
}

public fun CryptCreateHash(hprov: ULong, algid: ALG_ID, hkey: ULong, dwflags: UInt, phhash: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptCreateHash", longArrayOf(hprov.toLong(), algid.toLong(), hkey.toLong(), dwflags.toLong(), phhash)).toInt()
}

public fun CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpubkeyoid: PCSTR, ppubkeystruc: Long, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: Long, pbhash: Long, pcbhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptCreateKeyIdentifierFromCSP", longArrayOf(dwcertencodingtype.toLong(), pszpubkeyoid, ppubkeystruc, cbpubkeystruc.toLong(), dwflags.toLong(), pvreserved, pbhash, pcbhash)).toInt()
}

public fun CryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencodedblob: Long, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptDecodeMessage", longArrayOf(dwmsgtypeflags.toLong(), pdecryptpara, pverifypara, dwsignerindex.toLong(), pbencodedblob, cbencodedblob.toLong(), dwprevinnercontenttype.toLong(), pdwmsgtype, pdwinnercontenttype, pbdecoded, pcbdecoded, ppxchgcert, ppsignercert)).toInt()
}

public fun CryptDecodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pvstructinfo: Long, pcbstructinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptDecodeObject", longArrayOf(dwcertencodingtype.toLong(), lpszstructtype, pbencoded, cbencoded.toLong(), dwflags.toLong(), pvstructinfo, pcbstructinfo)).toInt()
}

public fun CryptDecodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptDecodeObjectEx", longArrayOf(dwcertencodingtype.toLong(), lpszstructtype, pbencoded, cbencoded.toLong(), dwflags.toLong(), pdecodepara, pvstructinfo, pcbstructinfo)).toInt()
}

public fun CryptDecrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDecrypt", longArrayOf(hkey.toLong(), hhash.toLong(), final.toLong(), dwflags.toLong(), pbdata, pdwdatalen)).toInt()
}

public fun CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptDecryptAndVerifyMessageSignature", longArrayOf(pdecryptpara, pverifypara, dwsignerindex.toLong(), pbencryptedblob, cbencryptedblob.toLong(), pbdecrypted, pcbdecrypted, ppxchgcert, ppsignercert)).toInt()
}

public fun CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptDecryptMessage", longArrayOf(pdecryptpara, pbencryptedblob, cbencryptedblob.toLong(), pbdecrypted, pcbdecrypted, ppxchgcert)).toInt()
}

public fun CryptDeriveKey(hprov: ULong, algid: ALG_ID, hbasedata: ULong, dwflags: UInt, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDeriveKey", longArrayOf(hprov.toLong(), algid.toLong(), hbasedata.toLong(), dwflags.toLong(), phkey)).toInt()
}

public fun CryptDestroyHash(hhash: ULong): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDestroyHash", longArrayOf(hhash.toLong())).toInt()
}

public fun CryptDestroyKey(hkey: ULong): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDestroyKey", longArrayOf(hkey.toLong())).toInt()
}

public fun CryptDuplicateHash(hhash: ULong, pdwreserved: Long, dwflags: UInt, phhash: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDuplicateHash", longArrayOf(hhash.toLong(), pdwreserved, dwflags.toLong(), phhash)).toInt()
}

public fun CryptDuplicateKey(hkey: ULong, pdwreserved: Long, dwflags: UInt, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptDuplicateKey", longArrayOf(hkey.toLong(), pdwreserved, dwflags.toLong(), phkey)).toInt()
}

public fun CryptEncodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEncodeObject", longArrayOf(dwcertencodingtype.toLong(), lpszstructtype, pvstructinfo, pbencoded, pcbencoded)).toInt()
}

public fun CryptEncodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, dwflags: CRYPT_ENCODE_OBJECT_FLAGS, pencodepara: Long, pvencoded: Long, pcbencoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEncodeObjectEx", longArrayOf(dwcertencodingtype.toLong(), lpszstructtype, pvstructinfo, dwflags.toLong(), pencodepara, pvencoded, pcbencoded)).toInt()
}

public fun CryptEncrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long, dwbuflen: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptEncrypt", longArrayOf(hkey.toLong(), hhash.toLong(), final.toLong(), dwflags.toLong(), pbdata, pdwdatalen, dwbuflen.toLong())).toInt()
}

public fun CryptEncryptMessage(pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: UInt, pbencryptedblob: Long, pcbencryptedblob: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEncryptMessage", longArrayOf(pencryptpara, crecipientcert.toLong(), rgprecipientcert, pbtobeencrypted, cbtobeencrypted.toLong(), pbencryptedblob, pcbencryptedblob)).toInt()
}

public fun CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvarg: Long, pfnenum: PFN_CRYPT_ENUM_KEYID_PROP): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEnumKeyIdentifierProperties", longArrayOf(pkeyidentifier, dwpropid.toLong(), dwflags.toLong(), pwszcomputername, pvreserved, pvarg, Win32DynamicFfi.objectSlot(pfnenum))).toInt()
}

public fun CryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, dwflags: UInt, pvarg: Long, pfnenumoidfunc: PFN_CRYPT_ENUM_OID_FUNC): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEnumOIDFunction", longArrayOf(dwencodingtype.toLong(), pszfuncname, pszoid, dwflags.toLong(), pvarg, Win32DynamicFfi.objectSlot(pfnenumoidfunc))).toInt()
}

public fun CryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumoidinfo: PFN_CRYPT_ENUM_OID_INFO): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptEnumOIDInfo", longArrayOf(dwgroupid.toLong(), dwflags.toLong(), pvarg, Win32DynamicFfi.objectSlot(pfnenumoidinfo))).toInt()
}

public fun CryptEnumProviderTypesA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PSTR, pcbtypename: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptEnumProviderTypesA", longArrayOf(dwindex.toLong(), pdwreserved, dwflags.toLong(), pdwprovtype, sztypename, pcbtypename)).toInt()
}

public fun CryptEnumProviderTypesW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PWSTR, pcbtypename: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptEnumProviderTypesW", longArrayOf(dwindex.toLong(), pdwreserved, dwflags.toLong(), pdwprovtype, sztypename, pcbtypename)).toInt()
}

public fun CryptEnumProvidersA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PSTR, pcbprovname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptEnumProvidersA", longArrayOf(dwindex.toLong(), pdwreserved, dwflags.toLong(), pdwprovtype, szprovname, pcbprovname)).toInt()
}

public fun CryptEnumProvidersW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PWSTR, pcbprovname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptEnumProvidersW", longArrayOf(dwindex.toLong(), pdwreserved, dwflags.toLong(), pdwprovtype, szprovname, pcbprovname)).toInt()
}

public fun CryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CRYPT_KEY_FLAGS, pbdata: Long, pdwdatalen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptExportKey", longArrayOf(hkey.toLong(), hexpkey.toLong(), dwblobtype.toLong(), dwflags.toLong(), pbdata, pdwdatalen)).toInt()
}

public fun CryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptExportPKCS8", longArrayOf(hcryptprov.toLong(), dwkeyspec.toLong(), pszprivatekeyobjid, dwflags.toLong(), pvauxinfo, pbprivatekeyblob, pcbprivatekeyblob)).toInt()
}

public fun CryptExportPublicKeyInfo(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pcbinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptExportPublicKeyInfo", longArrayOf(hcryptprovorncryptkey.toLong(), dwkeyspec.toLong(), dwcertencodingtype.toLong(), pinfo, pcbinfo)).toInt()
}

public fun CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptExportPublicKeyInfoEx", longArrayOf(hcryptprovorncryptkey.toLong(), dwkeyspec.toLong(), dwcertencodingtype.toLong(), pszpublickeyobjid, dwflags.toLong(), pvauxinfo, pinfo, pcbinfo)).toInt()
}

public fun CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptExportPublicKeyInfoFromBCryptKeyHandle", longArrayOf(hbcryptkey, dwcertencodingtype.toLong(), pszpublickeyobjid, dwflags.toLong(), pvauxinfo, pinfo, pcbinfo)).toInt()
}

public fun CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: CRYPT_FIND_FLAGS, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptFindCertificateKeyProvInfo", longArrayOf(pcert, dwflags.toLong(), pvreserved)).toInt()
}

public fun CryptFindLocalizedName(pwszcryptname: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptFindLocalizedName", longArrayOf(pwszcryptname))
}

public fun CryptFindOIDInfo(dwkeytype: UInt, pvkey: Long, dwgroupid: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptFindOIDInfo", longArrayOf(dwkeytype.toLong(), pvkey, dwgroupid.toLong()))
}

public fun CryptFormatObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: Long, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, pbformat: Long, pcbformat: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptFormatObject", longArrayOf(dwcertencodingtype.toLong(), dwformattype.toLong(), dwformatstrtype.toLong(), pformatstruct, lpszstructtype, pbencoded, cbencoded.toLong(), pbformat, pcbformat)).toInt()
}

public fun CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptFreeOIDFunctionAddress", longArrayOf(hfuncaddr, dwflags.toLong())).toInt()
}

public fun CryptGenKey(hprov: ULong, algid: ALG_ID, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGenKey", longArrayOf(hprov.toLong(), algid.toLong(), dwflags.toLong(), phkey)).toInt()
}

public fun CryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGenRandom", longArrayOf(hprov.toLong(), dwlen.toLong(), pbbuffer)).toInt()
}

public fun CryptGetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, ppvparam: Long, ppfnfree: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetAsyncParam", longArrayOf(hasync, pszparamoid, ppvparam, ppfnfree)).toInt()
}

public fun CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: UInt, pwszdlllist: PWSTR, pcchdlllist: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetDefaultOIDDllList", longArrayOf(hfuncset, dwencodingtype.toLong(), pwszdlllist, pcchdlllist)).toInt()
}

public fun CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pwszdll: PCWSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetDefaultOIDFunctionAddress", longArrayOf(hfuncset, dwencodingtype.toLong(), pwszdll, dwflags.toLong(), ppvfuncaddr, phfuncaddr)).toInt()
}

public fun CryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PSTR, pcbprovname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetDefaultProviderA", longArrayOf(dwprovtype.toLong(), pdwreserved, dwflags.toLong(), pszprovname, pcbprovname)).toInt()
}

public fun CryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PWSTR, pcbprovname: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetDefaultProviderW", longArrayOf(dwprovtype.toLong(), pdwreserved, dwflags.toLong(), pszprovname, pcbprovname)).toInt()
}

public fun CryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetHashParam", longArrayOf(hhash.toLong(), dwparam.toLong(), pbdata, pdwdatalen, dwflags.toLong())).toInt()
}

public fun CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetKeyIdentifierProperty", longArrayOf(pkeyidentifier, dwpropid.toLong(), dwflags.toLong(), pwszcomputername, pvreserved, pvdata, pcbdata)).toInt()
}

public fun CryptGetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetKeyParam", longArrayOf(hkey.toLong(), dwparam.toLong(), pbdata, pdwdatalen, dwflags.toLong())).toInt()
}

public fun CryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, dwflags: UInt, pbsignedblob: Long, cbsignedblob: UInt): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetMessageCertificates", longArrayOf(dwmsgandcertencodingtype.toLong(), hcryptprov.toLong(), dwflags.toLong(), pbsignedblob, cbsignedblob.toLong()))
}

public fun CryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: Long, cbsignedblob: UInt): Int {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetMessageSignerCount", longArrayOf(dwmsgencodingtype.toLong(), pbsignedblob, cbsignedblob.toLong())).toInt()
}

public fun CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pszoid: PCSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetOIDFunctionAddress", longArrayOf(hfuncset, dwencodingtype.toLong(), pszoid, dwflags.toLong(), ppvfuncaddr, phfuncaddr)).toInt()
}

public fun CryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptGetOIDFunctionValue", longArrayOf(dwencodingtype.toLong(), pszfuncname, pszoid, pwszvaluename, pdwvaluetype, pbvaluedata, pcbvaluedata)).toInt()
}

public fun CryptGetObjectUrl(pszurloid: PCSTR, pvpara: Long, dwflags: CRYPT_GET_URL_FLAGS, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptnet.dll", "CryptGetObjectUrl", longArrayOf(pszurloid, pvpara, dwflags.toLong(), purlarray, pcburlarray, purlinfo, pcburlinfo, pvreserved)).toInt()
}

public fun CryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetProvParam", longArrayOf(hprov.toLong(), dwparam.toLong(), pbdata, pdwdatalen, dwflags.toLong())).toInt()
}

public fun CryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptGetUserKey", longArrayOf(hprov.toLong(), dwkeyspec.toLong(), phuserkey)).toInt()
}

public fun CryptHashCertificate(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptHashCertificate", longArrayOf(hcryptprov.toLong(), algid.toLong(), dwflags.toLong(), pbencoded, cbencoded.toLong(), pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptHashCertificate2(pwszcnghashalgid: PCWSTR, dwflags: UInt, pvreserved: Long, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptHashCertificate2", longArrayOf(pwszcnghashalgid, dwflags.toLong(), pvreserved, pbencoded, cbencoded.toLong(), pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptHashData(hhash: ULong, pbdata: Long, dwdatalen: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptHashData", longArrayOf(hhash.toLong(), pbdata, dwdatalen.toLong(), dwflags.toLong())).toInt()
}

public fun CryptHashMessage(phashpara: Long, fdetachedhash: BOOL, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptHashMessage", longArrayOf(phashpara, fdetachedhash.toLong(), ctobehashed.toLong(), rgpbtobehashed, rgcbtobehashed, pbhashedblob, pcbhashedblob, pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptHashPublicKeyInfo(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptHashPublicKeyInfo", longArrayOf(hcryptprov.toLong(), algid.toLong(), dwflags.toLong(), dwcertencodingtype.toLong(), pinfo, pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptHashSessionKey", longArrayOf(hhash.toLong(), hkey.toLong(), dwflags.toLong())).toInt()
}

public fun CryptHashToBeSigned(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptHashToBeSigned", longArrayOf(hcryptprov.toLong(), dwcertencodingtype.toLong(), pbencoded, cbencoded.toLong(), pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptImportKey(hprov: ULong, pbdata: Long, dwdatalen: UInt, hpubkey: ULong, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptImportKey", longArrayOf(hprov.toLong(), pbdata, dwdatalen.toLong(), hpubkey.toLong(), dwflags.toLong(), phkey)).toInt()
}

public fun CryptImportPKCS8(sprivatekeyandparams: CRYPT_PKCS8_IMPORT_PARAMS, dwflags: CRYPT_KEY_FLAGS, phcryptprov: Long, pvauxinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptImportPKCS8", longArrayOf(run { val buf = ByteArray(48); buf[0] = (sprivatekeyandparams.PrivateKey.cbData.toInt() and 0xFF).toByte(); buf[1] = ((sprivatekeyandparams.PrivateKey.cbData.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((sprivatekeyandparams.PrivateKey.cbData.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((sprivatekeyandparams.PrivateKey.cbData.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (sprivatekeyandparams.PrivateKey.pbData and 0xFF).toByte(); buf[9] = ((sprivatekeyandparams.PrivateKey.pbData ushr 8) and 0xFF).toByte(); buf[10] = ((sprivatekeyandparams.PrivateKey.pbData ushr 16) and 0xFF).toByte(); buf[11] = ((sprivatekeyandparams.PrivateKey.pbData ushr 24) and 0xFF).toByte(); buf[12] = ((sprivatekeyandparams.PrivateKey.pbData ushr 32) and 0xFF).toByte(); buf[13] = ((sprivatekeyandparams.PrivateKey.pbData ushr 40) and 0xFF).toByte(); buf[14] = ((sprivatekeyandparams.PrivateKey.pbData ushr 48) and 0xFF).toByte(); buf[15] = ((sprivatekeyandparams.PrivateKey.pbData ushr 56) and 0xFF).toByte(); buf[16] = (Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) and 0xFF).toByte(); buf[17] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 8) and 0xFF).toByte(); buf[18] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 16) and 0xFF).toByte(); buf[19] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 24) and 0xFF).toByte(); buf[20] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 32) and 0xFF).toByte(); buf[21] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 40) and 0xFF).toByte(); buf[22] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 48) and 0xFF).toByte(); buf[23] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pResolvehCryptProvFunc) ushr 56) and 0xFF).toByte(); buf[24] = (sprivatekeyandparams.pVoidResolveFunc and 0xFF).toByte(); buf[25] = ((sprivatekeyandparams.pVoidResolveFunc ushr 8) and 0xFF).toByte(); buf[26] = ((sprivatekeyandparams.pVoidResolveFunc ushr 16) and 0xFF).toByte(); buf[27] = ((sprivatekeyandparams.pVoidResolveFunc ushr 24) and 0xFF).toByte(); buf[28] = ((sprivatekeyandparams.pVoidResolveFunc ushr 32) and 0xFF).toByte(); buf[29] = ((sprivatekeyandparams.pVoidResolveFunc ushr 40) and 0xFF).toByte(); buf[30] = ((sprivatekeyandparams.pVoidResolveFunc ushr 48) and 0xFF).toByte(); buf[31] = ((sprivatekeyandparams.pVoidResolveFunc ushr 56) and 0xFF).toByte(); buf[32] = (Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) and 0xFF).toByte(); buf[33] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 8) and 0xFF).toByte(); buf[34] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 16) and 0xFF).toByte(); buf[35] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 24) and 0xFF).toByte(); buf[36] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 32) and 0xFF).toByte(); buf[37] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 40) and 0xFF).toByte(); buf[38] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 48) and 0xFF).toByte(); buf[39] = ((Win32DynamicFfi.objectSlot(sprivatekeyandparams.pDecryptPrivateKeyFunc) ushr 56) and 0xFF).toByte(); buf[40] = (sprivatekeyandparams.pVoidDecryptFunc and 0xFF).toByte(); buf[41] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 8) and 0xFF).toByte(); buf[42] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 16) and 0xFF).toByte(); buf[43] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 24) and 0xFF).toByte(); buf[44] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 32) and 0xFF).toByte(); buf[45] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 40) and 0xFF).toByte(); buf[46] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 48) and 0xFF).toByte(); buf[47] = ((sprivatekeyandparams.pVoidDecryptFunc ushr 56) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(48); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwflags.toLong(), phcryptprov, pvauxinfo)).toInt()
}

public fun CryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptImportPublicKeyInfo", longArrayOf(hcryptprov.toLong(), dwcertencodingtype.toLong(), pinfo, phkey)).toInt()
}

public fun CryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, aikeyalg: ALG_ID, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptImportPublicKeyInfoEx", longArrayOf(hcryptprov.toLong(), dwcertencodingtype.toLong(), pinfo, aikeyalg.toLong(), dwflags.toLong(), pvauxinfo, phkey)).toInt()
}

public fun CryptImportPublicKeyInfoEx2(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo: Long, phkey: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptImportPublicKeyInfoEx2", longArrayOf(dwcertencodingtype.toLong(), pinfo, dwflags.toLong(), pvauxinfo, phkey)).toInt()
}

public fun CryptInitOIDFunctionSet(pszfuncname: PCSTR, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptInitOIDFunctionSet", longArrayOf(pszfuncname, dwflags.toLong()))
}

public fun CryptInstallCancelRetrieval(pfncancel: PFN_CRYPT_CANCEL_RETRIEVAL, pvarg: Long, dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptnet.dll", "CryptInstallCancelRetrieval", longArrayOf(Win32DynamicFfi.objectSlot(pfncancel), pvarg, dwflags.toLong(), pvreserved)).toInt()
}

public fun CryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara: Long, dwflags: CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved: Long, phdefaultcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptInstallDefaultContext", longArrayOf(hcryptprov.toLong(), dwdefaulttype.toLong(), pvdefaultpara, dwflags.toLong(), pvreserved, phdefaultcontext)).toInt()
}

public fun CryptInstallOIDFunctionAddress(hmodule: HMODULE, dwencodingtype: UInt, pszfuncname: PCSTR, cfuncentry: UInt, rgfuncentry: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptInstallOIDFunctionAddress", longArrayOf(hmodule, dwencodingtype.toLong(), pszfuncname, cfuncentry.toLong(), rgfuncentry, dwflags.toLong())).toInt()
}

public fun CryptMemAlloc(cbsize: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMemAlloc", longArrayOf(cbsize.toLong()))
}

public fun CryptMemFree(pv: Long) {
    Win32DynamicFfi.invoke("crypt32.dll", "CryptMemFree", longArrayOf(pv))
}

public fun CryptMemRealloc(pv: Long, cbsize: UInt): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMemRealloc", longArrayOf(pv, cbsize.toLong()))
}

public fun CryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgCalculateEncodedLength", longArrayOf(dwmsgencodingtype.toLong(), dwflags.toLong(), dwmsgtype.toLong(), pvmsgencodeinfo, pszinnercontentobjid, cbdata.toLong())).toUInt()
}

public fun CryptMsgClose(hcryptmsg: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgClose", longArrayOf(hcryptmsg)).toInt()
}

public fun CryptMsgControl(hcryptmsg: Long, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgControl", longArrayOf(hcryptmsg, dwflags.toLong(), dwctrltype.toLong(), pvctrlpara)).toInt()
}

public fun CryptMsgCountersign(hcryptmsg: Long, dwindex: UInt, ccountersigners: UInt, rgcountersigners: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgCountersign", longArrayOf(hcryptmsg, dwindex.toLong(), ccountersigners.toLong(), rgcountersigners)).toInt()
}

public fun CryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgCountersignEncoded", longArrayOf(dwencodingtype.toLong(), pbsignerinfo, cbsignerinfo.toLong(), ccountersigners.toLong(), rgcountersigners, pbcountersignature, pcbcountersignature)).toInt()
}

public fun CryptMsgDuplicate(hcryptmsg: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgDuplicate", longArrayOf(hcryptmsg))
}

public fun CryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: Long, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgEncodeAndSignCTL", longArrayOf(dwmsgencodingtype.toLong(), pctlinfo, psigninfo, dwflags.toLong(), pbencoded, pcbencoded)).toInt()
}

public fun CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: UInt, rghsignerstore: Long, dwflags: UInt, ppsigner: Long, pdwsignerindex: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgGetAndVerifySigner", longArrayOf(hcryptmsg, csignerstore.toLong(), rghsignerstore, dwflags.toLong(), ppsigner, pdwsignerindex)).toInt()
}

public fun CryptMsgGetParam(hcryptmsg: Long, dwparamtype: UInt, dwindex: UInt, pvdata: Long, pcbdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgGetParam", longArrayOf(hcryptmsg, dwparamtype.toLong(), dwindex.toLong(), pvdata, pcbdata)).toInt()
}

public fun CryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, precipientinfo: Long, pstreaminfo: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgOpenToDecode", longArrayOf(dwmsgencodingtype.toLong(), dwflags.toLong(), dwmsgtype.toLong(), hcryptprov.toLong(), precipientinfo, pstreaminfo))
}

public fun CryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CRYPT_MSG_TYPE, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, pstreaminfo: Long): Long {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgOpenToEncode", longArrayOf(dwmsgencodingtype.toLong(), dwflags.toLong(), dwmsgtype.toLong(), pvmsgencodeinfo, pszinnercontentobjid, pstreaminfo))
}

public fun CryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: Long, cbctlcontent: UInt, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgSignCTL", longArrayOf(dwmsgencodingtype.toLong(), pbctlcontent, cbctlcontent.toLong(), psigninfo, dwflags.toLong(), pbencoded, pcbencoded)).toInt()
}

public fun CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgUpdate", longArrayOf(hcryptmsg, pbdata, cbdata.toLong(), ffinal.toLong())).toInt()
}

public fun CryptMsgVerifyCountersignatureEncoded(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, pcicountersigner: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgVerifyCountersignatureEncoded", longArrayOf(hcryptprov.toLong(), dwencodingtype.toLong(), pbsignerinfo, cbsignerinfo.toLong(), pbsignerinfocountersignature, cbsignerinfocountersignature.toLong(), pcicountersigner)).toInt()
}

public fun CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: Long, dwflags: UInt, pvextra: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptMsgVerifyCountersignatureEncodedEx", longArrayOf(hcryptprov.toLong(), dwencodingtype.toLong(), pbsignerinfo, cbsignerinfo.toLong(), pbsignerinfocountersignature, cbsignerinfocountersignature.toLong(), dwsignertype.toLong(), pvsigner, dwflags.toLong(), pvextra)).toInt()
}

public fun CryptProtectData(pdatain: Long, szdatadescr: PCWSTR, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptProtectData", longArrayOf(pdatain, szdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags.toLong(), pdataout)).toInt()
}

public fun CryptProtectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptProtectMemory", longArrayOf(pdatain, cbdatain.toLong(), dwflags.toLong())).toInt()
}

public fun CryptQueryObject(dwobjecttype: CERT_QUERY_OBJECT_TYPE, pvobject: Long, dwexpectedcontenttypeflags: CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags: CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags: UInt, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptQueryObject", longArrayOf(dwobjecttype.toLong(), pvobject, dwexpectedcontenttypeflags.toLong(), dwexpectedformattypeflags.toLong(), dwflags.toLong(), pdwmsgandcertencodingtype, pdwcontenttype, pdwformattype, phcertstore, phmsg, ppvcontext)).toInt()
}

public fun CryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, dwindex: UInt, pwszdll: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptRegisterDefaultOIDFunction", longArrayOf(dwencodingtype.toLong(), pszfuncname, dwindex.toLong(), pwszdll)).toInt()
}

public fun CryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszdll: PCWSTR, pszoverridefuncname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptRegisterOIDFunction", longArrayOf(dwencodingtype.toLong(), pszfuncname, pszoid, pwszdll, pszoverridefuncname)).toInt()
}

public fun CryptRegisterOIDInfo(pinfo: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptRegisterOIDInfo", longArrayOf(pinfo, dwflags.toLong())).toInt()
}

public fun CryptReleaseContext(hprov: ULong, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptReleaseContext", longArrayOf(hprov.toLong(), dwflags.toLong())).toInt()
}

public fun CryptRetrieveObjectByUrlA(pszurl: PCSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptnet.dll", "CryptRetrieveObjectByUrlA", longArrayOf(pszurl, pszobjectoid, dwretrievalflags.toLong(), dwtimeout.toLong(), ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo)).toInt()
}

public fun CryptRetrieveObjectByUrlW(pszurl: PCWSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptnet.dll", "CryptRetrieveObjectByUrlW", longArrayOf(pszurl, pszobjectoid, dwretrievalflags.toLong(), dwtimeout.toLong(), ppvobject, hasyncretrieve, pcredentials, pvverify, pauxinfo)).toInt()
}

public fun CryptRetrieveTimeStamp(wszurl: PCWSTR, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: PCSTR, ppara: Long, pbdata: Long, cbdata: UInt, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptRetrieveTimeStamp", longArrayOf(wszurl, dwretrievalflags.toLong(), dwtimeout.toLong(), pszhashid, ppara, pbdata, cbdata.toLong(), pptscontext, pptssigner, phstore)).toInt()
}

public fun CryptSetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, pvparam: Long, pfnfree: PFN_CRYPT_ASYNC_PARAM_FREE_FUNC): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSetAsyncParam", longArrayOf(hasync, pszparamoid, pvparam, Win32DynamicFfi.objectSlot(pfnfree))).toInt()
}

public fun CryptSetHashParam(hhash: ULong, dwparam: CRYPT_SET_HASH_PARAM, pbdata: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetHashParam", longArrayOf(hhash.toLong(), dwparam.toLong(), pbdata, dwflags.toLong())).toInt()
}

public fun CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSetKeyIdentifierProperty", longArrayOf(pkeyidentifier, dwpropid.toLong(), dwflags.toLong(), pwszcomputername, pvreserved, pvdata)).toInt()
}

public fun CryptSetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetKeyParam", longArrayOf(hkey.toLong(), dwparam.toLong(), pbdata, dwflags.toLong())).toInt()
}

public fun CryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, dwvaluetype: REG_VALUE_TYPE, pbvaluedata: Long, cbvaluedata: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSetOIDFunctionValue", longArrayOf(dwencodingtype.toLong(), pszfuncname, pszoid, pwszvaluename, dwvaluetype.toLong(), pbvaluedata, cbvaluedata.toLong())).toInt()
}

public fun CryptSetProvParam(hprov: ULong, dwparam: CRYPT_SET_PROV_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetProvParam", longArrayOf(hprov.toLong(), dwparam.toLong(), pbdata, dwflags.toLong())).toInt()
}

public fun CryptSetProviderA(pszprovname: PCSTR, dwprovtype: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetProviderA", longArrayOf(pszprovname, dwprovtype.toLong())).toInt()
}

public fun CryptSetProviderExA(pszprovname: PCSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetProviderExA", longArrayOf(pszprovname, dwprovtype.toLong(), pdwreserved, dwflags.toLong())).toInt()
}

public fun CryptSetProviderExW(pszprovname: PCWSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetProviderExW", longArrayOf(pszprovname, dwprovtype.toLong(), pdwreserved, dwflags.toLong())).toInt()
}

public fun CryptSetProviderW(pszprovname: PCWSTR, dwprovtype: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSetProviderW", longArrayOf(pszprovname, dwprovtype.toLong())).toInt()
}

public fun CryptSignAndEncodeCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSignAndEncodeCertificate", longArrayOf(hcryptprovorncryptkey.toLong(), dwkeyspec.toLong(), dwcertencodingtype.toLong(), lpszstructtype, pvstructinfo, psignaturealgorithm, pvhashauxinfo, pbencoded, pcbencoded)).toInt()
}

public fun CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSignAndEncryptMessage", longArrayOf(psignpara, pencryptpara, crecipientcert.toLong(), rgprecipientcert, pbtobesignedandencrypted, cbtobesignedandencrypted.toLong(), pbsignedandencryptedblob, pcbsignedandencryptedblob)).toInt()
}

public fun CryptSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned: Long, cbencodedtobesigned: UInt, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSignCertificate", longArrayOf(hcryptprovorncryptkey.toLong(), dwkeyspec.toLong(), dwcertencodingtype.toLong(), pbencodedtobesigned, cbencodedtobesigned.toLong(), psignaturealgorithm, pvhashauxinfo, pbsignature, pcbsignature)).toInt()
}

public fun CryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: PCSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSignHashA", longArrayOf(hhash.toLong(), dwkeyspec.toLong(), szdescription, dwflags.toLong(), pbsignature, pdwsiglen)).toInt()
}

public fun CryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: PCWSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptSignHashW", longArrayOf(hhash.toLong(), dwkeyspec.toLong(), szdescription, dwflags.toLong(), pbsignature, pdwsiglen)).toInt()
}

public fun CryptSignMessage(psignpara: Long, fdetachedsignature: BOOL, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSignMessage", longArrayOf(psignpara, fdetachedsignature.toLong(), ctobesigned.toLong(), rgpbtobesigned, rgcbtobesigned, pbsignedblob, pcbsignedblob)).toInt()
}

public fun CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: UInt, pbsignedblob: Long, pcbsignedblob: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptSignMessageWithKey", longArrayOf(psignpara, pbtobesigned, cbtobesigned.toLong(), pbsignedblob, pcbsignedblob)).toInt()
}

public fun CryptStringToBinaryA(pszstring: PCSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptStringToBinaryA", longArrayOf(pszstring, cchstring.toLong(), dwflags.toLong(), pbbinary, pcbbinary, pdwskip, pdwflags)).toInt()
}

public fun CryptStringToBinaryW(pszstring: PCWSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptStringToBinaryW", longArrayOf(pszstring, cchstring.toLong(), dwflags.toLong(), pbbinary, pcbbinary, pdwskip, pdwflags)).toInt()
}

public fun CryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("cryptnet.dll", "CryptUninstallCancelRetrieval", longArrayOf(dwflags.toLong(), pvreserved)).toInt()
}

public fun CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: UInt, pvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUninstallDefaultContext", longArrayOf(hdefaultcontext, dwflags.toLong(), pvreserved)).toInt()
}

public fun CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUnprotectData", longArrayOf(pdatain, ppszdatadescr, poptionalentropy, pvreserved, ppromptstruct, dwflags.toLong(), pdataout)).toInt()
}

public fun CryptUnprotectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUnprotectMemory", longArrayOf(pdatain, cbdatain.toLong(), dwflags.toLong())).toInt()
}

public fun CryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pwszdll: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUnregisterDefaultOIDFunction", longArrayOf(dwencodingtype.toLong(), pszfuncname, pwszdll)).toInt()
}

public fun CryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUnregisterOIDFunction", longArrayOf(dwencodingtype.toLong(), pszfuncname, pszoid)).toInt()
}

public fun CryptUnregisterOIDInfo(pinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUnregisterOIDInfo", longArrayOf(pinfo)).toInt()
}

public fun CryptUpdateProtectedState(poldsid: PSID, pwszoldpassword: PCWSTR, dwflags: UInt, pdwsuccesscount: Long, pdwfailurecount: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptUpdateProtectedState", longArrayOf(poldsid, pwszoldpassword, dwflags.toLong(), pdwsuccesscount, pdwfailurecount)).toInt()
}

public fun CryptVerifyCertificateSignature(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, ppublickey: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyCertificateSignature", longArrayOf(hcryptprov.toLong(), dwcertencodingtype.toLong(), pbencoded, cbencoded.toLong(), ppublickey)).toInt()
}

public fun CryptVerifyCertificateSignatureEx(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwsubjecttype: UInt, pvsubject: Long, dwissuertype: UInt, pvissuer: Long, dwflags: CRYPT_VERIFY_CERT_FLAGS, pvextra: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyCertificateSignatureEx", longArrayOf(hcryptprov.toLong(), dwcertencodingtype.toLong(), dwsubjecttype.toLong(), pvsubject, dwissuertype.toLong(), pvissuer, dwflags.toLong(), pvextra)).toInt()
}

public fun CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyDetachedMessageHash", longArrayOf(phashpara, pbdetachedhashblob, cbdetachedhashblob.toLong(), ctobehashed.toLong(), rgpbtobehashed, rgcbtobehashed, pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbdetachedsignblob: Long, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyDetachedMessageSignature", longArrayOf(pverifypara, dwsignerindex.toLong(), pbdetachedsignblob, cbdetachedsignblob.toLong(), ctobesigned.toLong(), rgpbtobesigned, rgcbtobesigned, ppsignercert)).toInt()
}

public fun CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: UInt, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyMessageHash", longArrayOf(phashpara, pbhashedblob, cbhashedblob.toLong(), pbtobehashed, pcbtobehashed, pbcomputedhash, pcbcomputedhash)).toInt()
}

public fun CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyMessageSignature", longArrayOf(pverifypara, dwsignerindex.toLong(), pbsignedblob, cbsignedblob.toLong(), pbdecoded, pcbdecoded, ppsignercert)).toInt()
}

public fun CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyMessageSignatureWithKey", longArrayOf(pverifypara, ppublickeyinfo, pbsignedblob, cbsignedblob.toLong(), pbdecoded, pcbdecoded)).toInt()
}

public fun CryptVerifySignatureA(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptVerifySignatureA", longArrayOf(hhash.toLong(), pbsignature, dwsiglen.toLong(), hpubkey.toLong(), szdescription, dwflags.toLong())).toInt()
}

public fun CryptVerifySignatureW(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CryptVerifySignatureW", longArrayOf(hhash.toLong(), pbsignature, dwsiglen.toLong(), hpubkey.toLong(), szdescription, dwflags.toLong())).toInt()
}

public fun CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: UInt, pbdata: Long, cbdata: UInt, hadditionalstore: HCERTSTORE, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "CryptVerifyTimeStampSignature", longArrayOf(pbtscontentinfo, cbtscontentinfo.toLong(), pbdata, cbdata.toLong(), hadditionalstore, pptscontext, pptssigner, phstore)).toInt()
}

public fun CryptXmlAddObject(hsignatureorobject: Long, dwflags: UInt, rgproperty: Long, cproperty: UInt, pencoded: Long, ppobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlAddObject", longArrayOf(hsignatureorobject, dwflags.toLong(), rgproperty, cproperty.toLong(), pencoded, ppobject)).toInt()
}

public fun CryptXmlClose(hcryptxml: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlClose", longArrayOf(hcryptxml)).toInt()
}

public fun CryptXmlCreateReference(hcryptxml: Long, dwflags: UInt, wszid: PCWSTR, wszuri: PCWSTR, wsztype: PCWSTR, pdigestmethod: Long, ctransform: UInt, rgtransform: Long, phreference: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlCreateReference", longArrayOf(hcryptxml, dwflags.toLong(), wszid, wszuri, wsztype, pdigestmethod, ctransform.toLong(), rgtransform, phreference)).toInt()
}

public fun CryptXmlDigestReference(hreference: Long, dwflags: UInt, pdataproviderin: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlDigestReference", longArrayOf(hreference, dwflags.toLong(), pdataproviderin)).toInt()
}

public fun CryptXmlEncode(hcryptxml: Long, dwcharset: CRYPT_XML_CHARSET, rgproperty: Long, cproperty: UInt, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlEncode", longArrayOf(hcryptxml, dwcharset.toLong(), rgproperty, cproperty.toLong(), pvcallbackstate, Win32DynamicFfi.objectSlot(pfnwrite))).toInt()
}

public fun CryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumalginfo: PFN_CRYPT_XML_ENUM_ALG_INFO): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlEnumAlgorithmInfo", longArrayOf(dwgroupid.toLong(), dwflags.toLong(), pvarg, Win32DynamicFfi.objectSlot(pfnenumalginfo))).toInt()
}

public fun CryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: Long, dwgroupid: UInt, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlFindAlgorithmInfo", longArrayOf(dwfindbytype.toLong(), pvfindby, dwgroupid.toLong(), dwflags.toLong()))
}

public fun CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: CRYPT_XML_FLAGS, ppalginfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetAlgorithmInfo", longArrayOf(pxmlalgorithm, dwflags.toLong(), ppalginfo)).toInt()
}

public fun CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetDocContext", longArrayOf(hcryptxml, ppstruct)).toInt()
}

public fun CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetReference", longArrayOf(hcryptxml, ppstruct)).toInt()
}

public fun CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetSignature", longArrayOf(hcryptxml, ppstruct)).toInt()
}

public fun CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetStatus", longArrayOf(hcryptxml, pstatus)).toInt()
}

public fun CryptXmlGetTransforms(ppconfig: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlGetTransforms", longArrayOf(ppconfig)).toInt()
}

public fun CryptXmlImportPublicKey(dwflags: CRYPT_XML_FLAGS, pkeyvalue: Long, phkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlImportPublicKey", longArrayOf(dwflags.toLong(), pkeyvalue, phkey)).toInt()
}

public fun CryptXmlOpenToDecode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, rgproperty: Long, cproperty: UInt, pencoded: Long, phcryptxml: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlOpenToDecode", longArrayOf(pconfig, dwflags.toLong(), rgproperty, cproperty.toLong(), pencoded, phcryptxml)).toInt()
}

public fun CryptXmlOpenToEncode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, wszid: PCWSTR, rgproperty: Long, cproperty: UInt, pencoded: Long, phsignature: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlOpenToEncode", longArrayOf(pconfig, dwflags.toLong(), wszid, rgproperty, cproperty.toLong(), pencoded, phsignature)).toInt()
}

public fun CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: UInt): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlSetHMACSecret", longArrayOf(hsignature, pbsecret, cbsecret.toLong())).toInt()
}

public fun CryptXmlSign(hsignature: Long, hkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwflags: CRYPT_XML_FLAGS, dwkeyinfospec: CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlSign", longArrayOf(hsignature, hkey.toLong(), dwkeyspec.toLong(), dwflags.toLong(), dwkeyinfospec.toLong(), pvkeyinfospec, psignaturemethod, pcanonicalization)).toInt()
}

public fun CryptXmlVerifySignature(hsignature: Long, hkey: BCRYPT_KEY_HANDLE, dwflags: CRYPT_XML_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("cryptxml.dll", "CryptXmlVerifySignature", longArrayOf(hsignature, hkey, dwflags.toLong())).toInt()
}

public fun Decrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "Decrypt", longArrayOf(hcrypto, foaep.toLong(), cbindata.toLong(), pindata, pcboutdata, ppoutdata)).toInt()
}

public fun Encrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "Encrypt", longArrayOf(hcrypto, foaep.toLong(), cbindata.toLong(), pindata, pcboutdata, ppoutdata)).toInt()
}

public fun FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: UInt, pwszpurpose: PCWSTR, dwkeyspec: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wintrust.dll", "FindCertsByIssuer", longArrayOf(pcertchains, pcbcertchains, pccertchains, pbencodedissuername, cbencodedissuername.toLong(), pwszpurpose, dwkeyspec.toLong())).toInt()
}

public fun FreeToken(pallocmemory: Long): BOOL {
    return Win32DynamicFfi.invoke("infocardapi.dll", "FreeToken", longArrayOf(pallocmemory)).toInt()
}

public fun GenerateDerivedKey(hcrypto: Long, cblabel: UInt, plabel: Long, cbnonce: UInt, pnonce: Long, derivedkeylength: UInt, offset: UInt, algid: PCWSTR, pcbkey: Long, ppkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "GenerateDerivedKey", longArrayOf(hcrypto, cblabel.toLong(), plabel, cbnonce.toLong(), pnonce, derivedkeylength.toLong(), offset.toLong(), algid, pcbkey, ppkey)).toInt()
}

public fun GetAsymmetricEncryptionInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetAsymmetricEncryptionInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetBrowserToken(dwparamtype: UInt, pparam: Long, pcbtoken: Long, pptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "GetBrowserToken", longArrayOf(dwparamtype.toLong(), pparam, pcbtoken, pptoken)).toInt()
}

public fun GetCipherInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetCipherInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetCryptoTransform(hsymmetriccrypto: Long, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: Long, pphtransform: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "GetCryptoTransform", longArrayOf(hsymmetriccrypto, mode.toLong(), (padding.value.toLong() and 0xFFFF_FFFFL), feedbacksize.toLong(), direction.toLong(), cbiv.toLong(), piv, pphtransform)).toInt()
}

public fun GetHashInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetHashInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetKeyDerivationInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetKeyDerivationInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetKeyStorageInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ncrypt.dll", "GetKeyStorageInterface", longArrayOf(pszprovidername, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "GetKeyedHash", longArrayOf(hsymmetriccrypto, pphhash)).toInt()
}

public fun GetRngInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetRngInterface", longArrayOf(pszprovidername, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetSChannelInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ncrypt.dll", "GetSChannelInterface", longArrayOf(pszprovidername, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetSecretAgreementInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetSecretAgreementInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetSignatureInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "GetSignatureInterface", longArrayOf(pszprovidername, pszalgid, ppfunctiontable, dwflags.toLong())).toInt()
}

public fun GetToken(cpolicychain: UInt, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "GetToken", longArrayOf(cpolicychain.toLong(), ppolicychain, securitytoken, phprooftokencrypto)).toInt()
}

public fun HashCore(hcrypto: Long, cbindata: UInt, pindata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "HashCore", longArrayOf(hcrypto, cbindata.toLong(), pindata)).toInt()
}

public fun HashFinal(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "HashFinal", longArrayOf(hcrypto, cbindata.toLong(), pindata, pcboutdata, ppoutdata)).toInt()
}

public fun ImportInformationCard(filename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "ImportInformationCard", longArrayOf(filename)).toInt()
}

public fun ManageCardSpace(): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "ManageCardSpace", longArrayOf()).toInt()
}

public fun NCryptCloseProtectionDescriptor(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptCloseProtectionDescriptor", longArrayOf(hdescriptor)).toInt()
}

public fun NCryptCreateClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptCreateClaim", longArrayOf(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toLong(), pparameterlist, pbclaimblob, cbclaimblob.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptCreatePersistedKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptCreatePersistedKey", longArrayOf(hprovider.toLong(), phkey, pszalgid, pszkeyname, dwlegacykeyspec.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptCreateProtectionDescriptor(pwszdescriptorstring: PCWSTR, dwflags: UInt, phdescriptor: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptCreateProtectionDescriptor", longArrayOf(pwszdescriptorstring, dwflags.toLong(), phdescriptor)).toInt()
}

public fun NCryptDecrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptDecrypt", longArrayOf(hkey.toLong(), pbinput, cbinput.toLong(), ppaddinginfo, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptDeleteKey(hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptDeleteKey", longArrayOf(hkey.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptDeriveKey(hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptDeriveKey", longArrayOf(hsharedsecret.toLong(), pwszkdf, pparameterlist, pbderivedkey, cbderivedkey.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptEncrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptEncrypt", longArrayOf(hkey.toLong(), pbinput, cbinput.toLong(), ppaddinginfo, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptEnumAlgorithms(hprovider: NCRYPT_PROV_HANDLE, dwalgoperations: NCRYPT_OPERATION, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptEnumAlgorithms", longArrayOf(hprovider.toLong(), dwalgoperations.toLong(), pdwalgcount, ppalglist, dwflags.toLong())).toInt()
}

public fun NCryptEnumKeys(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptEnumKeys", longArrayOf(hprovider.toLong(), pszscope, ppkeyname, ppenumstate, dwflags.toLong())).toInt()
}

public fun NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptEnumStorageProviders", longArrayOf(pdwprovidercount, ppproviderlist, dwflags.toLong())).toInt()
}

public fun NCryptExportKey(hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptExportKey", longArrayOf(hkey.toLong(), hexportkey.toLong(), pszblobtype, pparameterlist, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptFinalizeKey(hkey: NCRYPT_KEY_HANDLE, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptFinalizeKey", longArrayOf(hkey.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptFreeBuffer(pvinput: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptFreeBuffer", longArrayOf(pvinput)).toInt()
}

public fun NCryptFreeObject(hobject: NCRYPT_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptFreeObject", longArrayOf(hobject.toLong())).toInt()
}

public fun NCryptGetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: OBJECT_SECURITY_INFORMATION): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptGetProperty", longArrayOf(hobject.toLong(), pszproperty, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptGetProtectionDescriptorInfo(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, pmempara: Long, dwinfotype: UInt, ppvinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptGetProtectionDescriptorInfo", longArrayOf(hdescriptor, pmempara, dwinfotype.toLong(), ppvinfo)).toInt()
}

public fun NCryptImportKey(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptImportKey", longArrayOf(hprovider.toLong(), himportkey.toLong(), pszblobtype, pparameterlist, phkey, pbdata, cbdata.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptIsAlgSupported(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptIsAlgSupported", longArrayOf(hprovider.toLong(), pszalgid, dwflags.toLong())).toInt()
}

public fun NCryptIsKeyHandle(hkey: NCRYPT_KEY_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptIsKeyHandle", longArrayOf(hkey.toLong())).toInt()
}

public fun NCryptKeyDerivation(hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptKeyDerivation", longArrayOf(hkey.toLong(), pparameterlist, pbderivedkey, cbderivedkey.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptNotifyChangeKey(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptNotifyChangeKey", longArrayOf(hprovider.toLong(), phevent, dwflags.toLong())).toInt()
}

public fun NCryptOpenKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptOpenKey", longArrayOf(hprovider.toLong(), phkey, pszkeyname, dwlegacykeyspec.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptOpenStorageProvider(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptOpenStorageProvider", longArrayOf(phprovider, pszprovidername, dwflags.toLong())).toInt()
}

public fun NCryptProtectSecret(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, pbdata: Long, cbdata: UInt, pmempara: Long, hwnd: HWND, ppbprotectedblob: Long, pcbprotectedblob: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptProtectSecret", longArrayOf(hdescriptor, dwflags.toLong(), pbdata, cbdata.toLong(), pmempara, hwnd, ppbprotectedblob, pcbprotectedblob)).toInt()
}

public fun NCryptQueryProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PWSTR, pcdescriptorstring: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptQueryProtectionDescriptorName", longArrayOf(pwszname, pwszdescriptorstring, pcdescriptorstring, dwflags.toLong())).toInt()
}

public fun NCryptRegisterProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptRegisterProtectionDescriptorName", longArrayOf(pwszname, pwszdescriptorstring, dwflags.toLong())).toInt()
}

public fun NCryptSecretAgreement(hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptSecretAgreement", longArrayOf(hprivkey.toLong(), hpubkey.toLong(), phagreedsecret, dwflags.toLong())).toInt()
}

public fun NCryptSetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptSetProperty", longArrayOf(hobject.toLong(), pszproperty, pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptSignHash(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptSignHash", longArrayOf(hkey.toLong(), ppaddinginfo, pbhashvalue, cbhashvalue.toLong(), pbsignature, cbsignature.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun NCryptStreamClose(hstream: NCRYPT_STREAM_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptStreamClose", longArrayOf(hstream)).toInt()
}

public fun NCryptStreamOpenToProtect(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, hwnd: HWND, pstreaminfo: Long, phstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptStreamOpenToProtect", longArrayOf(hdescriptor, dwflags.toLong(), hwnd, pstreaminfo, phstream)).toInt()
}

public fun NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptStreamOpenToUnprotect", longArrayOf(pstreaminfo, dwflags.toLong(), hwnd, phstream)).toInt()
}

public fun NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptStreamOpenToUnprotectEx", longArrayOf(pstreaminfo, dwflags.toLong(), hwnd, phstream)).toInt()
}

public fun NCryptStreamUpdate(hstream: NCRYPT_STREAM_HANDLE, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptStreamUpdate", longArrayOf(hstream, pbdata, cbdata.toLong(), ffinal.toLong())).toInt()
}

public fun NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptTranslateHandle", longArrayOf(phprovider, phkey, hlegacyprov.toLong(), hlegacykey.toLong(), dwlegacykeyspec.toLong(), dwflags.toLong())).toInt()
}

public fun NCryptUnprotectSecret(phdescriptor: Long, dwflags: NCRYPT_FLAGS, pbprotectedblob: Long, cbprotectedblob: UInt, pmempara: Long, hwnd: HWND, ppbdata: Long, pcbdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptUnprotectSecret", longArrayOf(phdescriptor, dwflags.toLong(), pbprotectedblob, cbprotectedblob.toLong(), pmempara, hwnd, ppbdata, pcbdata)).toInt()
}

public fun NCryptVerifyClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptVerifyClaim", longArrayOf(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toLong(), pparameterlist, pbclaimblob, cbclaimblob.toLong(), poutput, dwflags.toLong())).toInt()
}

public fun NCryptVerifySignature(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: NCRYPT_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "NCryptVerifySignature", longArrayOf(hkey.toLong(), ppaddinginfo, pbhashvalue, cbhashvalue.toLong(), pbsignature, cbsignature.toLong(), dwflags.toLong())).toInt()
}

public fun PFXExportCertStore(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "PFXExportCertStore", longArrayOf(hstore, ppfx, szpassword, dwflags.toLong())).toInt()
}

public fun PFXExportCertStoreEx(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, pvpara: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "PFXExportCertStoreEx", longArrayOf(hstore, ppfx, szpassword, pvpara, dwflags.toLong())).toInt()
}

public fun PFXImportCertStore(ppfx: Long, szpassword: PCWSTR, dwflags: CRYPT_KEY_FLAGS): HCERTSTORE {
    return Win32DynamicFfi.invoke("crypt32.dll", "PFXImportCertStore", longArrayOf(ppfx, szpassword, dwflags.toLong()))
}

public fun PFXIsPFXBlob(ppfx: Long): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "PFXIsPFXBlob", longArrayOf(ppfx)).toInt()
}

public fun PFXVerifyPassword(ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("crypt32.dll", "PFXVerifyPassword", longArrayOf(ppfx, szpassword, dwflags.toLong())).toInt()
}

public fun ProcessPrng(pbdata: Long, cbdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "ProcessPrng", longArrayOf(pbdata, cbdata.toLong())).toInt()
}

public fun SignError(): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignError", longArrayOf()).toInt()
}

public fun SignHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, pcbsig: Long, ppsig: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "SignHash", longArrayOf(hcrypto, cbhash.toLong(), phash, hashalgoid, pcbsig, ppsig)).toInt()
}

public fun SignerFreeSignerContext(psignercontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerFreeSignerContext", longArrayOf(psignercontext)).toInt()
}

public fun SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerSign", longArrayOf(psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata)).toInt()
}

public fun SignerSignEx(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerSignEx", longArrayOf(dwflags.toLong(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext)).toInt()
}

public fun SignerSignEx2(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerSignEx2", longArrayOf(dwflags.toLong(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags.toLong(), psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved)).toInt()
}

public fun SignerSignEx3(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerSignEx3", longArrayOf(dwflags.toLong(), psubjectinfo, psignercert, psignatureinfo, pproviderinfo, dwtimestampflags.toLong(), psztimestampalgorithmoid, pwszhttptimestamp, psrequest, psipdata, ppsignercontext, pcryptopolicy, pdigestsigninfo, preserved)).toInt()
}

public fun SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerTimeStamp", longArrayOf(psubjectinfo, pwszhttptimestamp, psrequest, psipdata)).toInt()
}

public fun SignerTimeStampEx(dwflags: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerTimeStampEx", longArrayOf(dwflags.toLong(), psubjectinfo, pwszhttptimestamp, psrequest, psipdata, ppsignercontext)).toInt()
}

public fun SignerTimeStampEx2(dwflags: SIGNER_TIMESTAMP_FLAGS, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, dwalgid: ALG_ID, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerTimeStampEx2", longArrayOf(dwflags.toLong(), psubjectinfo, pwszhttptimestamp, dwalgid.toLong(), psrequest, psipdata, ppsignercontext)).toInt()
}

public fun SignerTimeStampEx3(dwflags: SIGNER_TIMESTAMP_FLAGS, dwindex: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, pszalgorithmoid: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("mssign32.dll", "SignerTimeStampEx3", longArrayOf(dwflags.toLong(), dwindex.toLong(), psubjectinfo, pwszhttptimestamp, pszalgorithmoid, psrequest, psipdata, ppsignercontext, pcryptopolicy, preserved)).toInt()
}

public fun SslChangeNotify(hevent: HANDLE, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslChangeNotify", longArrayOf(hevent, dwflags.toLong())).toInt()
}

public fun SslComputeClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslComputeClientAuthHash", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pszalgid, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslComputeEapKeyBlock(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslComputeEapKeyBlock", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), pbrandoms, cbrandoms.toLong(), pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslComputeFinishedHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslComputeFinishedHash", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), pboutput, cboutput.toLong(), dwflags.toLong())).toInt()
}

public fun SslComputeSessionHash(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslComputeSessionHash", longArrayOf(hsslprovider.toLong(), hhandshakehash.toLong(), dwprotocol.toLong(), pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslCreateClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslCreateClientAuthHash", longArrayOf(hsslprovider.toLong(), phhandshakehash, dwprotocol.toLong(), dwciphersuite.toLong(), pszhashalgid, dwflags.toLong())).toInt()
}

public fun SslCreateEphemeralKey(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslCreateEphemeralKey", longArrayOf(hsslprovider.toLong(), phephemeralkey, dwprotocol.toLong(), dwciphersuite.toLong(), dwkeytype.toLong(), dwkeybitlen.toLong(), pbparams, cbparams.toLong(), dwflags.toLong())).toInt()
}

public fun SslCreateHandshakeHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslCreateHandshakeHash", longArrayOf(hsslprovider.toLong(), phhandshakehash, dwprotocol.toLong(), dwciphersuite.toLong(), dwflags.toLong())).toInt()
}

public fun SslDecrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslDecrementProviderReferenceCount", longArrayOf(hsslprovider.toLong())).toInt()
}

public fun SslDecryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslDecryptPacket", longArrayOf(hsslprovider.toLong(), hkey.toLong(), pbinput, cbinput.toLong(), pboutput, cboutput.toLong(), pcbresult, sequencenumber.toLong(), dwflags.toLong())).toInt()
}

public fun SslDuplicateTranscriptHash(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phtranscripthash: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslDuplicateTranscriptHash", longArrayOf(hsslprovider.toLong(), htranscripthash.toLong(), phtranscripthash, dwflags.toLong())).toInt()
}

public fun SslEncryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslEncryptPacket", longArrayOf(hsslprovider.toLong(), hkey.toLong(), pbinput, cbinput.toLong(), pboutput, cboutput.toLong(), pcbresult, sequencenumber.toLong(), dwcontenttype.toLong(), dwflags.toLong())).toInt()
}

public fun SslEnumCipherSuites(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslEnumCipherSuites", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite, ppenumstate, dwflags.toLong())).toInt()
}

public fun SslEnumCipherSuitesEx(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslEnumCipherSuitesEx", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), ppciphersuite, ppenumstate, dwflags.toLong())).toInt()
}

public fun SslEnumEccCurves(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslEnumEccCurves", longArrayOf(hsslprovider.toLong(), pecccurvecount, ppecccurve, dwflags.toLong())).toInt()
}

public fun SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslEnumProtocolProviders", longArrayOf(pdwprovidercount, ppproviderlist, dwflags.toLong())).toInt()
}

public fun SslExpandBinderKey(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandBinderKey", longArrayOf(hsslprovider.toLong(), hearlykey.toLong(), phbinderkey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExpandExporterMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandExporterMasterKey", longArrayOf(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phexportermasterkey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExpandPreSharedKey(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandPreSharedKey", longArrayOf(hsslprovider.toLong(), hresumptionmasterkey.toLong(), pbticketnonce, cbticketnonce.toLong(), phpresharedkey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExpandResumptionMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandResumptionMasterKey", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), hhashvalue.toLong(), phresumptionmasterkey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExpandTrafficKeys(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandTrafficKeys", longArrayOf(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), phclienttraffickey, phservertraffickey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExpandWriteKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExpandWriteKey", longArrayOf(hsslprovider.toLong(), hbasetraffickey.toLong(), phwritekey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExportKey(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExportKey", longArrayOf(hsslprovider.toLong(), hkey.toLong(), pszblobtype, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslExportKeyingMaterial(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExportKeyingMaterial", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), slabel, pbrandoms, cbrandoms.toLong(), pbcontextvalue, cbcontextvalue.toLong(), pboutput, cboutput.toLong(), dwflags.toLong())).toInt()
}

public fun SslExtractEarlyKey(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExtractEarlyKey", longArrayOf(hsslprovider.toLong(), hpresharedkey.toLong(), phearlykey, dwprotocol.toLong(), dwciphersuite.toLong(), pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExtractHandshakeKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExtractHandshakeKey", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), hearlykey.toLong(), phhandshakekey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslExtractMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslExtractMasterKey", longArrayOf(hsslprovider.toLong(), hhandshakekey.toLong(), phmasterkey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslFreeBuffer(pvinput: Long): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslFreeBuffer", longArrayOf(pvinput)).toInt()
}

public fun SslFreeObject(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslFreeObject", longArrayOf(hobject.toLong(), dwflags.toLong())).toInt()
}

public fun SslGenerateMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGenerateMasterKey", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), phmasterkey, dwprotocol.toLong(), dwciphersuite.toLong(), pparameterlist, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslGeneratePreMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGeneratePreMasterKey", longArrayOf(hsslprovider.toLong(), hpublickey.toLong(), phpremasterkey, dwprotocol.toLong(), dwciphersuite.toLong(), pparameterlist, pboutput, cboutput.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslGenerateSessionKeys(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGenerateSessionKeys", longArrayOf(hsslprovider.toLong(), hmasterkey.toLong(), phreadkey, phwritekey, pparameterlist, dwflags.toLong())).toInt()
}

public fun SslGetCipherSuitePRFHashAlgorithm(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGetCipherSuitePRFHashAlgorithm", longArrayOf(hsslprovider.toLong(), dwprotocol.toLong(), dwciphersuite.toLong(), dwkeytype.toLong(), szprfhash, dwflags.toLong())).toInt()
}

public fun SslGetKeyProperty(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGetKeyProperty", longArrayOf(hkey.toLong(), pszproperty, ppboutput, pcboutput, dwflags.toLong())).toInt()
}

public fun SslGetProviderProperty(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslGetProviderProperty", longArrayOf(hsslprovider.toLong(), pszproperty, ppboutput, pcboutput, ppenumstate, dwflags.toLong())).toInt()
}

public fun SslHashHandshake(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslHashHandshake", longArrayOf(hsslprovider.toLong(), hhandshakehash.toLong(), pbinput, cbinput.toLong(), dwflags.toLong())).toInt()
}

public fun SslImportKey(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslImportKey", longArrayOf(hsslprovider.toLong(), phkey, pszblobtype, pbkeyblob, cbkeyblob.toLong(), dwflags.toLong())).toInt()
}

public fun SslImportMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslImportMasterKey", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), phmasterkey, dwprotocol.toLong(), dwciphersuite.toLong(), pparameterlist, pbencryptedkey, cbencryptedkey.toLong(), dwflags.toLong())).toInt()
}

public fun SslIncrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslIncrementProviderReferenceCount", longArrayOf(hsslprovider.toLong())).toInt()
}

public fun SslLookupCipherLengths(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslLookupCipherLengths", longArrayOf(hsslprovider.toLong(), dwprotocol.toLong(), dwciphersuite.toLong(), dwkeytype.toLong(), pcipherlengths, cbcipherlengths.toLong(), dwflags.toLong())).toInt()
}

public fun SslLookupCipherSuiteInfo(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslLookupCipherSuiteInfo", longArrayOf(hsslprovider.toLong(), dwprotocol.toLong(), dwciphersuite.toLong(), dwkeytype.toLong(), pciphersuite, dwflags.toLong())).toInt()
}

public fun SslOpenPrivateKey(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslOpenPrivateKey", longArrayOf(hsslprovider.toLong(), phprivatekey, pcertcontext, dwflags.toLong())).toInt()
}

public fun SslOpenProvider(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslOpenProvider", longArrayOf(phsslprovider, pszprovidername, dwflags.toLong())).toInt()
}

public fun SslSignHash(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslSignHash", longArrayOf(hsslprovider.toLong(), hprivatekey.toLong(), pbhashvalue, cbhashvalue.toLong(), pbsignature, cbsignature.toLong(), pcbresult, dwflags.toLong())).toInt()
}

public fun SslVerifySignature(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ncrypt.dll", "SslVerifySignature", longArrayOf(hsslprovider.toLong(), hpublickey.toLong(), pbhashvalue, cbhashvalue.toLong(), pbsignature, cbsignature.toLong(), dwflags.toLong())).toInt()
}

public fun SystemPrng(pbrandomdata: Long, cbrandomdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("bcryptprimitives.dll", "SystemPrng", longArrayOf(pbrandomdata, cbrandomdata.toLong())).toInt()
}

public fun TransformBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "TransformBlock", longArrayOf(hcrypto, cbindata.toLong(), pindata, pcboutdata, ppoutdata)).toInt()
}

public fun TransformFinalBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "TransformFinalBlock", longArrayOf(hcrypto, cbindata.toLong(), pindata, pcboutdata, ppoutdata)).toInt()
}

public fun VerifyHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, cbsig: UInt, psig: Long, pfverified: Long): HRESULT {
    return Win32DynamicFfi.invoke("infocardapi.dll", "VerifyHash", longArrayOf(hcrypto, cbhash.toLong(), phash, hashalgoid, cbsig.toLong(), psig, pfverified)).toInt()
}
