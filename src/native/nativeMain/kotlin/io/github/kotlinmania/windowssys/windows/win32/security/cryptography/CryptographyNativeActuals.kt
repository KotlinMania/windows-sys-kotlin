@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BCryptAddContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, dwposition: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptAddContextFunction(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), dwposition)

public actual fun BCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwposition: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pszprovider.toCPointer<ByteVar>(), dwposition)

public actual fun BCryptCloseAlgorithmProvider(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider(halgorithm.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptConfigureContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptConfigureContext(dwtable, pszcontext.toCPointer<ByteVar>(), pconfig.toCPointer<ByteVar>())

public actual fun BCryptConfigureContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pconfig: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pconfig.toCPointer<ByteVar>())

public actual fun BCryptCreateContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptCreateContext(dwtable, pszcontext.toCPointer<ByteVar>(), pconfig.toCPointer<ByteVar>())

public actual fun BCryptCreateHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptCreateHash(halgorithm.toCPointer<ByteVar>(), phhash.toCPointer<ByteVar>(), pbhashobject.toCPointer<ByteVar>(), cbhashobject, pbsecret.toCPointer<ByteVar>(), cbsecret, dwflags)

public actual fun BCryptCreateMultiHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash(halgorithm.toCPointer<ByteVar>(), phhash.toCPointer<ByteVar>(), nhashes, pbhashobject.toCPointer<ByteVar>(), cbhashobject, pbsecret.toCPointer<ByteVar>(), cbsecret, dwflags)

public actual fun BCryptDecrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDecrypt(hkey.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, ppaddinginfo.toCPointer<ByteVar>(), pbiv.toCPointer<ByteVar>(), cbiv, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptDeleteContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDeleteContext(dwtable, pszcontext.toCPointer<ByteVar>())

public actual fun BCryptDeriveKey(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDeriveKey(hsharedsecret.toCPointer<ByteVar>(), pwszkdf.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptDeriveKeyCapi(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi(hhash.toCPointer<ByteVar>(), htargetalg.toCPointer<ByteVar>(), pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, dwflags)

public actual fun BCryptDeriveKeyPBKDF2(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2(hprf.toCPointer<ByteVar>(), pbpassword.toCPointer<ByteVar>(), cbpassword, pbsalt.toCPointer<ByteVar>(), cbsalt, citerations, pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, dwflags)

public actual fun BCryptDestroyHash(hhash: BCRYPT_HASH_HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDestroyHash(hhash.toCPointer<ByteVar>())

public actual fun BCryptDestroyKey(hkey: BCRYPT_KEY_HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDestroyKey(hkey.toCPointer<ByteVar>())

public actual fun BCryptDestroySecret(hsecret: BCRYPT_SECRET_HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDestroySecret(hsecret.toCPointer<ByteVar>())

public actual fun BCryptDuplicateHash(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDuplicateHash(hhash.toCPointer<ByteVar>(), phnewhash.toCPointer<ByteVar>(), pbhashobject.toCPointer<ByteVar>(), cbhashobject, dwflags)

public actual fun BCryptDuplicateKey(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptDuplicateKey(hkey.toCPointer<ByteVar>(), phnewkey.toCPointer<ByteVar>(), pbkeyobject.toCPointer<ByteVar>(), cbkeyobject, dwflags)

public actual fun BCryptEncrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEncrypt(hkey.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, ppaddinginfo.toCPointer<ByteVar>(), pbiv.toCPointer<ByteVar>(), cbiv, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptEnumAlgorithms(dwalgoperations: BCRYPT_OPERATION, palgcount: Long, ppalglist: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms(dwalgoperations, palgcount.toCPointer<ByteVar>(), ppalglist.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptEnumContextFunctionProviders(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptEnumContextFunctions(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptEnumContexts(dwtable: BCRYPT_TABLE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumContexts(dwtable, pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptEnumProviders(pszalgid: PCWSTR, pimplcount: Long, ppimpllist: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumProviders(pszalgid.toCPointer<ByteVar>(), pimplcount.toCPointer<ByteVar>(), ppimpllist.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders(pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptExportKey(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptExportKey(hkey.toCPointer<ByteVar>(), hexportkey.toCPointer<ByteVar>(), pszblobtype.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptFinalizeKeyPair(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair(hkey.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptFinishHash(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptFinishHash(hhash.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, dwflags)

public actual fun BCryptFreeBuffer(pvbuffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptFreeBuffer(pvbuffer.toCPointer<ByteVar>())
}

public actual fun BCryptGenRandom(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: BCRYPTGENRANDOM_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptGenRandom(halgorithm.toCPointer<ByteVar>(), pbbuffer.toCPointer<ByteVar>(), cbbuffer, dwflags)

public actual fun BCryptGenerateKeyPair(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair(halgorithm.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), dwlength, dwflags)

public actual fun BCryptGenerateSymmetricKey(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey(halgorithm.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), pbkeyobject.toCPointer<ByteVar>(), cbkeyobject, pbsecret.toCPointer<ByteVar>(), cbsecret, dwflags)

public actual fun BCryptGetFipsAlgorithmMode(pfenabled: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode(pfenabled.toCPointer<ByteVar>())

public actual fun BCryptGetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptGetProperty(hobject.toCPointer<ByteVar>(), pszproperty.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptHash(halgorithm: BCRYPT_ALG_HANDLE, pbsecret: Long, cbsecret: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptHash(halgorithm.toCPointer<ByteVar>(), pbsecret.toCPointer<ByteVar>(), cbsecret, pbinput.toCPointer<ByteVar>(), cbinput, pboutput.toCPointer<ByteVar>(), cboutput)

public actual fun BCryptHashData(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptHashData(hhash.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun BCryptImportKey(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptImportKey(halgorithm.toCPointer<ByteVar>(), himportkey.toCPointer<ByteVar>(), pszblobtype.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), pbkeyobject.toCPointer<ByteVar>(), cbkeyobject, pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun BCryptImportKeyPair(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptImportKeyPair(halgorithm.toCPointer<ByteVar>(), himportkey.toCPointer<ByteVar>(), pszblobtype.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun BCryptKeyDerivation(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptKeyDerivation(hkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: PCWSTR, pszimplementation: PCWSTR, dwflags: BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider(phalgorithm.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), pszimplementation.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptProcessMultiOperations(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations(hobject.toCPointer<ByteVar>(), operationtype, poperations.toCPointer<ByteVar>(), cboperations, dwflags)

public actual fun BCryptQueryContextConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration(dwtable, pszcontext.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptQueryContextFunctionConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptQueryContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, pcbvalue: Long, ppbvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pszproperty.toCPointer<ByteVar>(), pcbvalue.toCPointer<ByteVar>(), ppbvalue.toCPointer<ByteVar>())

public actual fun BCryptQueryProviderRegistration(pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration(pszprovider.toCPointer<ByteVar>(), dwmode, dwinterface, pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptRegisterConfigChangeNotify(phevent: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify(phevent.toCPointer<ByteVar>())

public actual fun BCryptRegisterProvider(pszprovider: PCWSTR, dwflags: UInt, preg: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptRegisterProvider(pszprovider.toCPointer<ByteVar>(), dwflags, preg.toCPointer<ByteVar>())

public actual fun BCryptRemoveContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>())

public actual fun BCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pszprovider.toCPointer<ByteVar>())

public actual fun BCryptResolveProviders(pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwflags: BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptResolveProviders(pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pszprovider.toCPointer<ByteVar>(), dwmode, dwflags, pcbbuffer.toCPointer<ByteVar>(), ppbuffer.toCPointer<ByteVar>())

public actual fun BCryptSecretAgreement(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptSecretAgreement(hprivkey.toCPointer<ByteVar>(), hpubkey.toCPointer<ByteVar>(), phagreedsecret.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptSetContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, cbvalue: UInt, pbvalue: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty(dwtable, pszcontext.toCPointer<ByteVar>(), dwinterface, pszfunction.toCPointer<ByteVar>(), pszproperty.toCPointer<ByteVar>(), cbvalue, pbvalue.toCPointer<ByteVar>())

public actual fun BCryptSetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptSetProperty(hobject.toCPointer<ByteVar>(), pszproperty.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun BCryptSignHash(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptSignHash(hkey.toCPointer<ByteVar>(), ppaddinginfo.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun BCryptUnregisterConfigChangeNotify(hevent: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify(hevent.toCPointer<ByteVar>())

public actual fun BCryptUnregisterProvider(pszprovider: PCWSTR): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider(pszprovider.toCPointer<ByteVar>())

public actual fun BCryptVerifySignature(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: BCRYPT_FLAGS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_BCryptVerifySignature(hkey.toCPointer<ByteVar>(), ppaddinginfo.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), cbhash, pbsignature.toCPointer<ByteVar>(), cbsignature, dwflags)

public actual fun CertAddCRLContextToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore(hcertstore.toCPointer<ByteVar>(), pcrlcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddCRLLinkToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore(hcertstore.toCPointer<ByteVar>(), pcrlcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddCTLContextToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore(hcertstore.toCPointer<ByteVar>(), pctlcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddCTLLinkToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore(hcertstore.toCPointer<ByteVar>(), pctlcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddCertificateContextToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore(hcertstore.toCPointer<ByteVar>(), pcertcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddCertificateLinkToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore(hcertstore.toCPointer<ByteVar>(), pcertcontext.toCPointer<ByteVar>(), dwadddisposition, ppstorecontext.toCPointer<ByteVar>())

public actual fun CertAddEncodedCRLToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, pbcrlencoded.toCPointer<ByteVar>(), cbcrlencoded, dwadddisposition, ppcrlcontext.toCPointer<ByteVar>())

public actual fun CertAddEncodedCTLToStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbctlencoded: Long, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore(hcertstore.toCPointer<ByteVar>(), dwmsgandcertencodingtype, pbctlencoded.toCPointer<ByteVar>(), cbctlencoded, dwadddisposition, ppctlcontext.toCPointer<ByteVar>())

public actual fun CertAddEncodedCertificateToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, pbcertencoded.toCPointer<ByteVar>(), cbcertencoded, dwadddisposition, ppcertcontext.toCPointer<ByteVar>())

public actual fun CertAddEncodedCertificateToSystemStoreA(szcertstorename: PCSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA(szcertstorename.toCPointer<ByteVar>(), pbcertencoded.toCPointer<ByteVar>(), cbcertencoded)

public actual fun CertAddEncodedCertificateToSystemStoreW(szcertstorename: PCWSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW(szcertstorename.toCPointer<ByteVar>(), pbcertencoded.toCPointer<ByteVar>(), cbcertencoded)

public actual fun CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier(pcertcontext.toCPointer<ByteVar>(), pszusageidentifier.toCPointer<ByteVar>())

public actual fun CertAddRefServerOcspResponse(hserverocspresponse: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse(hserverocspresponse.toCPointer<ByteVar>())
}

public actual fun CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext(pserverocspresponsecontext.toCPointer<ByteVar>())
}

public actual fun CertAddSerializedElementToStore(hcertstore: HCERTSTORE, pbelement: Long, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: Long, ppvcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore(hcertstore.toCPointer<ByteVar>(), pbelement.toCPointer<ByteVar>(), cbelement, dwadddisposition, dwflags, dwcontexttypeflags, pdwcontexttype.toCPointer<ByteVar>(), ppvcontext.toCPointer<ByteVar>())

public actual fun CertAddStoreToCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE, dwupdateflags: UInt, dwpriority: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAddStoreToCollection(hcollectionstore.toCPointer<ByteVar>(), hsiblingstore.toCPointer<ByteVar>(), dwupdateflags, dwpriority)

public actual fun CertAlgIdToOID(dwalgid: UInt): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertAlgIdToOID(dwalgid)?.toLong() ?: 0L

public actual fun CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse(hserverocspresponse.toCPointer<ByteVar>(), dwflags)
}

public actual fun CertCloseStore(hcertstore: HCERTSTORE, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCloseStore(hcertstore.toCPointer<ByteVar>(), dwflags)

public actual fun CertCompareCertificate(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid1: Long, pcertid2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCompareCertificate(dwcertencodingtype, pcertid1.toCPointer<ByteVar>(), pcertid2.toCPointer<ByteVar>())

public actual fun CertCompareCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertname1: Long, pcertname2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCompareCertificateName(dwcertencodingtype, pcertname1.toCPointer<ByteVar>(), pcertname2.toCPointer<ByteVar>())

public actual fun CertCompareIntegerBlob(pint1: Long, pint2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob(pint1.toCPointer<ByteVar>(), pint2.toCPointer<ByteVar>())

public actual fun CertComparePublicKeyInfo(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey1: Long, ppublickey2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo(dwcertencodingtype, ppublickey1.toCPointer<ByteVar>(), ppublickey2.toCPointer<ByteVar>())

public actual fun CertControlStore(hcertstore: HCERTSTORE, dwflags: CERT_CONTROL_STORE_FLAGS, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertControlStore(hcertstore.toCPointer<ByteVar>(), dwflags, dwctrltype, pvctrlpara.toCPointer<ByteVar>())

public actual fun CertCreateCRLContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateCRLContext(dwcertencodingtype, pbcrlencoded.toCPointer<ByteVar>(), cbcrlencoded)?.toLong() ?: 0L

public actual fun CertCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: Long, cbctlencoded: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateCTLContext(dwmsgandcertencodingtype, pbctlencoded.toCPointer<ByteVar>(), cbctlencoded)?.toLong() ?: 0L

public actual fun CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: UInt, rgoptattr: Long, dwflags: UInt, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties(pcertcontext.toCPointer<ByteVar>(), coptattr, rgoptattr.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), pctlentry.toCPointer<ByteVar>(), pcbctlentry.toCPointer<ByteVar>())

public actual fun CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine(pconfig.toCPointer<ByteVar>(), phchainengine.toCPointer<ByteVar>())

public actual fun CertCreateCertificateContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateCertificateContext(dwcertencodingtype, pbcertencoded.toCPointer<ByteVar>(), cbcertencoded)?.toLong() ?: 0L

public actual fun CertCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pcreatepara: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateContext(dwcontexttype, dwencodingtype, pbencoded.toCPointer<ByteVar>(), cbencoded, dwflags, pcreatepara.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertCreateSelfSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob: Long, dwflags: CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate(hcryptprovorncryptkey, psubjectissuerblob.toCPointer<ByteVar>(), dwflags, pkeyprovinfo.toCPointer<ByteVar>(), psignaturealgorithm.toCPointer<ByteVar>(), pstarttime.toCPointer<ByteVar>(), pendtime.toCPointer<ByteVar>(), pextensions.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertDeleteCRLFromStore(pcrlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore(pcrlcontext.toCPointer<ByteVar>())

public actual fun CertDeleteCTLFromStore(pctlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore(pctlcontext.toCPointer<ByteVar>())

public actual fun CertDeleteCertificateFromStore(pcertcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore(pcertcontext.toCPointer<ByteVar>())

public actual fun CertDuplicateCRLContext(pcrlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext(pcrlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertDuplicateCTLContext(pctlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext(pctlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertDuplicateCertificateChain(pchaincontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain(pchaincontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertDuplicateCertificateContext(pcertcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext(pcertcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertDuplicateStore(hcertstore: HCERTSTORE): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertDuplicateStore(hcertstore.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties(pcrlcontext.toCPointer<ByteVar>(), dwpropid)

public actual fun CertEnumCRLsInStore(hcertstore: HCERTSTORE, pprevcrlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore(hcertstore.toCPointer<ByteVar>(), pprevcrlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties(pctlcontext.toCPointer<ByteVar>(), dwpropid)

public actual fun CertEnumCTLsInStore(hcertstore: HCERTSTORE, pprevctlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore(hcertstore.toCPointer<ByteVar>(), pprevctlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties(pcertcontext.toCPointer<ByteVar>(), dwpropid)

public actual fun CertEnumCertificatesInStore(hcertstore: HCERTSTORE, pprevcertcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore(hcertstore.toCPointer<ByteVar>(), pprevcertcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertEnumPhysicalStore(pvsystemstore: Long, dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_PHYSICAL_STORE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore(pvsystemstore.toCPointer<ByteVar>(), dwflags, pvarg.toCPointer<ByteVar>(), pfnenum.toLong().toCPointer<ByteVar>())

public actual fun CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL(pctlcontext.toCPointer<ByteVar>(), ppvnextsubject.toCPointer<ByteVar>(), psubjectidentifier.toCPointer<ByteVar>(), pencodedattributes.toCPointer<ByteVar>())

public actual fun CertEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumSystemStore(dwflags, pvsystemstorelocationpara.toCPointer<ByteVar>(), pvarg.toCPointer<ByteVar>(), pfnenum.toLong().toCPointer<ByteVar>())

public actual fun CertEnumSystemStoreLocation(dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE_LOCATION): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation(dwflags, pvarg.toCPointer<ByteVar>(), pfnenum.toLong().toCPointer<ByteVar>())

public actual fun CertFindAttribute(pszobjid: PCSTR, cattr: UInt, rgattr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindAttribute(pszobjid.toCPointer<ByteVar>(), cattr, rgattr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindCRLInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: Long, pprevcrlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindCRLInStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara.toCPointer<ByteVar>(), pprevcrlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindCTLInStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CERT_FIND_TYPE, pvfindpara: Long, pprevctlcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindCTLInStore(hcertstore.toCPointer<ByteVar>(), dwmsgandcertencodingtype, dwfindflags, dwfindtype, pvfindpara.toCPointer<ByteVar>(), pprevctlcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: UInt, pvreserved: Long, ppcrlentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL(pcert.toCPointer<ByteVar>(), pcrlcontext.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), ppcrlentry.toCPointer<ByteVar>())

public actual fun CertFindCertificateInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: CERT_FIND_FLAGS, pvfindpara: Long, pprevcertcontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindCertificateInStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara.toCPointer<ByteVar>(), pprevcertcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindChainInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype: UInt, pvfindpara: Long, pprevchaincontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindChainInStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, dwfindflags, dwfindtype, pvfindpara.toCPointer<ByteVar>(), pprevchaincontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindExtension(pszobjid: PCSTR, cextensions: UInt, rgextensions: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindExtension(pszobjid.toCPointer<ByteVar>(), cextensions, rgextensions.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindRDNAttr(pszobjid: PCSTR, pname: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindRDNAttr(pszobjid.toCPointer<ByteVar>(), pname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, pctlcontext: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL(dwencodingtype, dwsubjecttype, pvsubject.toCPointer<ByteVar>(), pctlcontext.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: UInt, pvreserved: Long, pencodedattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL(psubjectidentifier.toCPointer<ByteVar>(), pctlcontext.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), pencodedattributes.toCPointer<ByteVar>())

public actual fun CertFreeCRLContext(pcrlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCRLContext(pcrlcontext.toCPointer<ByteVar>())

public actual fun CertFreeCTLContext(pctlcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCTLContext(pctlcontext.toCPointer<ByteVar>())

public actual fun CertFreeCertificateChain(pchaincontext: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCertificateChain(pchaincontext.toCPointer<ByteVar>())
}

public actual fun CertFreeCertificateChainEngine(hchainengine: HCERTCHAINENGINE) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine(hchainengine.toCPointer<ByteVar>())
}

public actual fun CertFreeCertificateChainList(prgpselection: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList(prgpselection.toCPointer<ByteVar>())
}

public actual fun CertFreeCertificateContext(pcertcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeCertificateContext(pcertcontext.toCPointer<ByteVar>())

public actual fun CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext(pserverocspresponsecontext.toCPointer<ByteVar>())
}

public actual fun CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty(pcrlcontext.toCPointer<ByteVar>(), dwpropid, pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CertGetCRLFromStore(hcertstore: HCERTSTORE, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetCRLFromStore(hcertstore.toCPointer<ByteVar>(), pissuercontext.toCPointer<ByteVar>(), pprevcrlcontext.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertGetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty(pctlcontext.toCPointer<ByteVar>(), dwpropid, pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CertGetCertificateChain(hchainengine: HCERTCHAINENGINE, pcertcontext: Long, ptime: Long, hadditionalstore: HCERTSTORE, pchainpara: Long, dwflags: UInt, pvreserved: Long, ppchaincontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetCertificateChain(hchainengine.toCPointer<ByteVar>(), pcertcontext.toCPointer<ByteVar>(), ptime.toCPointer<ByteVar>(), hadditionalstore.toCPointer<ByteVar>(), pchainpara.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), ppchaincontext.toCPointer<ByteVar>())

public actual fun CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty(pcertcontext.toCPointer<ByteVar>(), dwpropid, pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: UInt, pusage: Long, pcbusage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage(pcertcontext.toCPointer<ByteVar>(), dwflags, pusage.toCPointer<ByteVar>(), pcbusage.toCPointer<ByteVar>())

public actual fun CertGetIntendedKeyUsage(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage(dwcertencodingtype, pcertinfo.toCPointer<ByteVar>(), pbkeyusage.toCPointer<ByteVar>(), cbkeyusage)

public actual fun CertGetIssuerCertificateFromStore(hcertstore: HCERTSTORE, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore(hcertstore.toCPointer<ByteVar>(), psubjectcontext.toCPointer<ByteVar>(), pprevissuercontext.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertGetNameStringA(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PSTR, cchnamestring: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetNameStringA(pcertcontext.toCPointer<ByteVar>(), dwtype, dwflags, pvtypepara.toCPointer<ByteVar>(), psznamestring.toCPointer<ByteVar>(), cchnamestring)

public actual fun CertGetNameStringW(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PWSTR, cchnamestring: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetNameStringW(pcertcontext.toCPointer<ByteVar>(), dwtype, dwflags, pvtypepara.toCPointer<ByteVar>(), psznamestring.toCPointer<ByteVar>(), cchnamestring)

public actual fun CertGetPublicKeyLength(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength(dwcertencodingtype, ppublickey.toCPointer<ByteVar>())

public actual fun CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: UInt, pvreserved: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext(hserverocspresponse.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertGetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetStoreProperty(hcertstore.toCPointer<ByteVar>(), dwpropid, pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CertGetSubjectCertificateFromStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore(hcertstore.toCPointer<ByteVar>(), dwcertencodingtype, pcertid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertGetValidUsages(ccerts: UInt, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertGetValidUsages(ccerts, rghcerts.toCPointer<ByteVar>(), cnumoids.toCPointer<ByteVar>(), rghoids.toCPointer<ByteVar>(), pcboids.toCPointer<ByteVar>())

public actual fun CertIsRDNAttrsInCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwflags: UInt, pcertname: Long, prdn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName(dwcertencodingtype, dwflags, pcertname.toCPointer<ByteVar>(), prdn.toCPointer<ByteVar>())

public actual fun CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: PCWSTR, psigningcert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign(pstrongsignpara.toCPointer<ByteVar>(), pwszcnghashalgid.toCPointer<ByteVar>(), psigningcert.toCPointer<ByteVar>())

public actual fun CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate(pcert.toCPointer<ByteVar>(), pcrl.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CertIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertIsWeakHash(dwhashusetype, pwszcnghashalgid.toCPointer<ByteVar>(), dwchainflags, psignerchaincontext.toCPointer<ByteVar>(), ptimestamp.toCPointer<ByteVar>(), pwszfilename.toCPointer<ByteVar>())

public actual fun CertNameToStrA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PSTR, csz: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertNameToStrA(dwcertencodingtype, pname.toCPointer<ByteVar>(), dwstrtype, psz.toCPointer<ByteVar>(), csz)

public actual fun CertNameToStrW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PWSTR, csz: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertNameToStrW(dwcertencodingtype, pname.toCPointer<ByteVar>(), dwstrtype, psz.toCPointer<ByteVar>(), csz)

public actual fun CertOIDToAlgId(pszobjid: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertOIDToAlgId(pszobjid.toCPointer<ByteVar>())

public actual fun CertOpenServerOcspResponse(pchaincontext: Long, dwflags: UInt, popenpara: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse(pchaincontext.toCPointer<ByteVar>(), dwflags, popenpara.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertOpenStore(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertOpenStore(lpszstoreprovider.toCPointer<ByteVar>(), dwencodingtype, hcryptprov, dwflags, pvpara.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertOpenSystemStoreA(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCSTR): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA(hprov, szsubsystemprotocol.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertOpenSystemStoreW(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCWSTR): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW(hprov, szsubsystemprotocol.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CertRDNValueToStrA(dwvaluetype: UInt, pvalue: Long, psz: PSTR, csz: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRDNValueToStrA(dwvaluetype, pvalue.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), csz)

public actual fun CertRDNValueToStrW(dwvaluetype: UInt, pvalue: Long, psz: PWSTR, csz: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRDNValueToStrW(dwvaluetype, pvalue.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), csz)

public actual fun CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore(pvsystemstore.toCPointer<ByteVar>(), dwflags, pwszstorename.toCPointer<ByteVar>(), pstoreinfo.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun CertRegisterSystemStore(pvsystemstore: Long, dwflags: UInt, pstoreinfo: Long, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRegisterSystemStore(pvsystemstore.toCPointer<ByteVar>(), dwflags, pstoreinfo.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier(pcertcontext.toCPointer<ByteVar>(), pszusageidentifier.toCPointer<ByteVar>())

public actual fun CertRemoveStoreFromCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection(hcollectionstore.toCPointer<ByteVar>(), hsiblingstore.toCPointer<ByteVar>())
}

public actual fun CertResyncCertificateChainEngine(hchainengine: HCERTCHAINENGINE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine(hchainengine.toCPointer<ByteVar>())

public actual fun CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo(pcertcontext.toCPointer<ByteVar>(), lpszlogoorbiometrictype.toCPointer<ByteVar>(), dwretrievalflags, dwtimeout, dwflags, pvreserved.toCPointer<ByteVar>(), ppbdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), ppwszmimetype.toCPointer<ByteVar>())

public actual fun CertSaveStore(hcertstore: HCERTSTORE, dwencodingtype: CERT_QUERY_ENCODING_TYPE, dwsaveas: CERT_STORE_SAVE_AS, dwsaveto: CERT_STORE_SAVE_TO, pvsavetopara: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSaveStore(hcertstore.toCPointer<ByteVar>(), dwencodingtype, dwsaveas, dwsaveto, pvsavetopara.toCPointer<ByteVar>(), dwflags)

public actual fun CertSelectCertificateChains(pselectioncontext: Long, dwflags: UInt, pchainparameters: Long, ccriteria: UInt, rgpcriteria: Long, hstore: HCERTSTORE, pcselection: Long, pprgpselection: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSelectCertificateChains(pselectioncontext.toCPointer<ByteVar>(), dwflags, pchainparameters.toCPointer<ByteVar>(), ccriteria, rgpcriteria.toCPointer<ByteVar>(), hstore.toCPointer<ByteVar>(), pcselection.toCPointer<ByteVar>(), pprgpselection.toCPointer<ByteVar>())

public actual fun CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement(pcrlcontext.toCPointer<ByteVar>(), dwflags, pbelement.toCPointer<ByteVar>(), pcbelement.toCPointer<ByteVar>())

public actual fun CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement(pctlcontext.toCPointer<ByteVar>(), dwflags, pbelement.toCPointer<ByteVar>(), pcbelement.toCPointer<ByteVar>())

public actual fun CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement(pcertcontext.toCPointer<ByteVar>(), dwflags, pbelement.toCPointer<ByteVar>(), pcbelement.toCPointer<ByteVar>())

public actual fun CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty(pcrlcontext.toCPointer<ByteVar>(), dwpropid, dwflags, pvdata.toCPointer<ByteVar>())

public actual fun CertSetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty(pctlcontext.toCPointer<ByteVar>(), dwpropid, dwflags, pvdata.toCPointer<ByteVar>())

public actual fun CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext.toCPointer<ByteVar>(), pctlentry.toCPointer<ByteVar>(), dwflags)

public actual fun CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty(pcertcontext.toCPointer<ByteVar>(), dwpropid, dwflags, pvdata.toCPointer<ByteVar>())

public actual fun CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage(pcertcontext.toCPointer<ByteVar>(), pusage.toCPointer<ByteVar>())

public actual fun CertSetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertSetStoreProperty(hcertstore.toCPointer<ByteVar>(), dwpropid, dwflags, pvdata.toCPointer<ByteVar>())

public actual fun CertStrToNameA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertStrToNameA(dwcertencodingtype, pszx500.toCPointer<ByteVar>(), dwstrtype, pvreserved.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>(), ppszerror.toCPointer<ByteVar>())

public actual fun CertStrToNameW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCWSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertStrToNameW(dwcertencodingtype, pszx500.toCPointer<ByteVar>(), dwstrtype, pvreserved.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>(), ppszerror.toCPointer<ByteVar>())

public actual fun CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore(pvsystemstore.toCPointer<ByteVar>(), dwflags, pwszstorename.toCPointer<ByteVar>())

public actual fun CertUnregisterSystemStore(pvsystemstore: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore(pvsystemstore.toCPointer<ByteVar>(), dwflags)

public actual fun CertVerifyCRLRevocation(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long, ccrlinfo: UInt, rgpcrlinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation(dwcertencodingtype, pcertid.toCPointer<ByteVar>(), ccrlinfo, rgpcrlinfo.toCPointer<ByteVar>())

public actual fun CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity(ptimetoverify.toCPointer<ByteVar>(), pcrlinfo.toCPointer<ByteVar>())

public actual fun CertVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, psubjectusage: Long, dwflags: UInt, pverifyusagepara: Long, pverifyusagestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage(dwencodingtype, dwsubjecttype, pvsubject.toCPointer<ByteVar>(), psubjectusage.toCPointer<ByteVar>(), dwflags, pverifyusagepara.toCPointer<ByteVar>(), pverifyusagestatus.toCPointer<ByteVar>())

public actual fun CertVerifyCertificateChainPolicy(pszpolicyoid: PCSTR, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy(pszpolicyoid.toCPointer<ByteVar>(), pchaincontext.toCPointer<ByteVar>(), ppolicypara.toCPointer<ByteVar>(), ppolicystatus.toCPointer<ByteVar>())

public actual fun CertVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: Long, dwflags: UInt, prevpara: Long, prevstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyRevocation(dwencodingtype, dwrevtype, ccontext, rgpvcontext.toCPointer<ByteVar>(), dwflags, prevpara.toCPointer<ByteVar>(), prevstatus.toCPointer<ByteVar>())

public actual fun CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext(psubject.toCPointer<ByteVar>(), pissuer.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity(ptimetoverify.toCPointer<ByteVar>(), pcertinfo.toCPointer<ByteVar>())

public actual fun CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting(psubjectinfo.toCPointer<ByteVar>(), pissuerinfo.toCPointer<ByteVar>())

public actual fun CloseCryptoHandle(hcrypto: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CloseCryptoHandle(hcrypto.toCPointer<ByteVar>())

public actual fun CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: CRYPT_ACQUIRE_FLAGS, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey(pcert.toCPointer<ByteVar>(), dwflags, pvparameters.toCPointer<ByteVar>(), phcryptprovorncryptkey.toCPointer<ByteVar>(), pdwkeyspec.toCPointer<ByteVar>(), pfcallerfreeprovorncryptkey.toCPointer<ByteVar>())

public actual fun CryptAcquireContextA(phprov: Long, szcontainer: PCSTR, szprovider: PCSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptAcquireContextA(phprov.toCPointer<ByteVar>(), szcontainer.toCPointer<ByteVar>(), szprovider.toCPointer<ByteVar>(), dwprovtype, dwflags)

public actual fun CryptAcquireContextW(phprov: Long, szcontainer: PCWSTR, szprovider: PCWSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptAcquireContextW(phprov.toCPointer<ByteVar>(), szcontainer.toCPointer<ByteVar>(), szprovider.toCPointer<ByteVar>(), dwprovtype, dwflags)

public actual fun CryptBinaryToStringA(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PSTR, pcchstring: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptBinaryToStringA(pbbinary.toCPointer<ByteVar>(), cbbinary, dwflags, pszstring.toCPointer<ByteVar>(), pcchstring.toCPointer<ByteVar>())

public actual fun CryptBinaryToStringW(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PWSTR, pcchstring: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptBinaryToStringW(pbbinary.toCPointer<ByteVar>(), cbbinary, dwflags, pszstring.toCPointer<ByteVar>(), pcchstring.toCPointer<ByteVar>())

public actual fun CryptCloseAsyncHandle(hasync: HCRYPTASYNC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle(hasync)

public actual fun CryptContextAddRef(hprov: ULong, pdwreserved: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptContextAddRef(hprov, pdwreserved.toCPointer<ByteVar>(), dwflags)

public actual fun CryptCreateAsyncHandle(dwflags: UInt, phasync: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle(dwflags, phasync.toCPointer<ByteVar>())

public actual fun CryptCreateHash(hprov: ULong, algid: ALG_ID, hkey: ULong, dwflags: UInt, phhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptCreateHash(hprov, algid, hkey, dwflags, phhash.toCPointer<ByteVar>())

public actual fun CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpubkeyoid: PCSTR, ppubkeystruc: Long, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: Long, pbhash: Long, pcbhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP(dwcertencodingtype, pszpubkeyoid.toCPointer<ByteVar>(), ppubkeystruc.toCPointer<ByteVar>(), cbpubkeystruc, dwflags, pvreserved.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), pcbhash.toCPointer<ByteVar>())

public actual fun CryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencodedblob: Long, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecodeMessage(dwmsgtypeflags, pdecryptpara.toCPointer<ByteVar>(), pverifypara.toCPointer<ByteVar>(), dwsignerindex, pbencodedblob.toCPointer<ByteVar>(), cbencodedblob, dwprevinnercontenttype, pdwmsgtype.toCPointer<ByteVar>(), pdwinnercontenttype.toCPointer<ByteVar>(), pbdecoded.toCPointer<ByteVar>(), pcbdecoded.toCPointer<ByteVar>(), ppxchgcert.toCPointer<ByteVar>(), ppsignercert.toCPointer<ByteVar>())

public actual fun CryptDecodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecodeObject(dwcertencodingtype, lpszstructtype.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), cbencoded, dwflags, pvstructinfo.toCPointer<ByteVar>(), pcbstructinfo.toCPointer<ByteVar>())

public actual fun CryptDecodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx(dwcertencodingtype, lpszstructtype.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), cbencoded, dwflags, pdecodepara.toCPointer<ByteVar>(), pvstructinfo.toCPointer<ByteVar>(), pcbstructinfo.toCPointer<ByteVar>())

public actual fun CryptDecrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecrypt(hkey, hhash, final, dwflags, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>())

public actual fun CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature(pdecryptpara.toCPointer<ByteVar>(), pverifypara.toCPointer<ByteVar>(), dwsignerindex, pbencryptedblob.toCPointer<ByteVar>(), cbencryptedblob, pbdecrypted.toCPointer<ByteVar>(), pcbdecrypted.toCPointer<ByteVar>(), ppxchgcert.toCPointer<ByteVar>(), ppsignercert.toCPointer<ByteVar>())

public actual fun CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDecryptMessage(pdecryptpara.toCPointer<ByteVar>(), pbencryptedblob.toCPointer<ByteVar>(), cbencryptedblob, pbdecrypted.toCPointer<ByteVar>(), pcbdecrypted.toCPointer<ByteVar>(), ppxchgcert.toCPointer<ByteVar>())

public actual fun CryptDeriveKey(hprov: ULong, algid: ALG_ID, hbasedata: ULong, dwflags: UInt, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDeriveKey(hprov, algid, hbasedata, dwflags, phkey.toCPointer<ByteVar>())

public actual fun CryptDestroyHash(hhash: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDestroyHash(hhash)

public actual fun CryptDestroyKey(hkey: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDestroyKey(hkey)

public actual fun CryptDuplicateHash(hhash: ULong, pdwreserved: Long, dwflags: UInt, phhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDuplicateHash(hhash, pdwreserved.toCPointer<ByteVar>(), dwflags, phhash.toCPointer<ByteVar>())

public actual fun CryptDuplicateKey(hkey: ULong, pdwreserved: Long, dwflags: UInt, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptDuplicateKey(hkey, pdwreserved.toCPointer<ByteVar>(), dwflags, phkey.toCPointer<ByteVar>())

public actual fun CryptEncodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEncodeObject(dwcertencodingtype, lpszstructtype.toCPointer<ByteVar>(), pvstructinfo.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>())

public actual fun CryptEncodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, dwflags: CRYPT_ENCODE_OBJECT_FLAGS, pencodepara: Long, pvencoded: Long, pcbencoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx(dwcertencodingtype, lpszstructtype.toCPointer<ByteVar>(), pvstructinfo.toCPointer<ByteVar>(), dwflags, pencodepara.toCPointer<ByteVar>(), pvencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>())

public actual fun CryptEncrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long, dwbuflen: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEncrypt(hkey, hhash, final, dwflags, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>(), dwbuflen)

public actual fun CryptEncryptMessage(pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: UInt, pbencryptedblob: Long, pcbencryptedblob: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEncryptMessage(pencryptpara.toCPointer<ByteVar>(), crecipientcert, rgprecipientcert.toCPointer<ByteVar>(), pbtobeencrypted.toCPointer<ByteVar>(), cbtobeencrypted, pbencryptedblob.toCPointer<ByteVar>(), pcbencryptedblob.toCPointer<ByteVar>())

public actual fun CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvarg: Long, pfnenum: PFN_CRYPT_ENUM_KEYID_PROP): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties(pkeyidentifier.toCPointer<ByteVar>(), dwpropid, dwflags, pwszcomputername.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), pvarg.toCPointer<ByteVar>(), pfnenum.toLong().toCPointer<ByteVar>())

public actual fun CryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, dwflags: UInt, pvarg: Long, pfnenumoidfunc: PFN_CRYPT_ENUM_OID_FUNC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pszoid.toCPointer<ByteVar>(), dwflags, pvarg.toCPointer<ByteVar>(), pfnenumoidfunc.toLong().toCPointer<ByteVar>())

public actual fun CryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumoidinfo: PFN_CRYPT_ENUM_OID_INFO): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo(dwgroupid, dwflags, pvarg.toCPointer<ByteVar>(), pfnenumoidinfo.toLong().toCPointer<ByteVar>())

public actual fun CryptEnumProviderTypesA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PSTR, pcbtypename: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA(dwindex, pdwreserved.toCPointer<ByteVar>(), dwflags, pdwprovtype.toCPointer<ByteVar>(), sztypename.toCPointer<ByteVar>(), pcbtypename.toCPointer<ByteVar>())

public actual fun CryptEnumProviderTypesW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PWSTR, pcbtypename: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW(dwindex, pdwreserved.toCPointer<ByteVar>(), dwflags, pdwprovtype.toCPointer<ByteVar>(), sztypename.toCPointer<ByteVar>(), pcbtypename.toCPointer<ByteVar>())

public actual fun CryptEnumProvidersA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PSTR, pcbprovname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumProvidersA(dwindex, pdwreserved.toCPointer<ByteVar>(), dwflags, pdwprovtype.toCPointer<ByteVar>(), szprovname.toCPointer<ByteVar>(), pcbprovname.toCPointer<ByteVar>())

public actual fun CryptEnumProvidersW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PWSTR, pcbprovname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptEnumProvidersW(dwindex, pdwreserved.toCPointer<ByteVar>(), dwflags, pdwprovtype.toCPointer<ByteVar>(), szprovname.toCPointer<ByteVar>(), pcbprovname.toCPointer<ByteVar>())

public actual fun CryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CRYPT_KEY_FLAGS, pbdata: Long, pdwdatalen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptExportKey(hkey, hexpkey, dwblobtype, dwflags, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>())

public actual fun CryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptExportPKCS8(hcryptprov, dwkeyspec, pszprivatekeyobjid.toCPointer<ByteVar>(), dwflags, pvauxinfo.toCPointer<ByteVar>(), pbprivatekeyblob.toCPointer<ByteVar>(), pcbprivatekeyblob.toCPointer<ByteVar>())

public actual fun CryptExportPublicKeyInfo(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pcbinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pinfo.toCPointer<ByteVar>(), pcbinfo.toCPointer<ByteVar>())

public actual fun CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pszpublickeyobjid.toCPointer<ByteVar>(), dwflags, pvauxinfo.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), pcbinfo.toCPointer<ByteVar>())

public actual fun CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey.toCPointer<ByteVar>(), dwcertencodingtype, pszpublickeyobjid.toCPointer<ByteVar>(), dwflags, pvauxinfo.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), pcbinfo.toCPointer<ByteVar>())

public actual fun CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: CRYPT_FIND_FLAGS, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo(pcert.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CryptFindLocalizedName(pwszcryptname: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptFindLocalizedName(pwszcryptname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptFindOIDInfo(dwkeytype: UInt, pvkey: Long, dwgroupid: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptFindOIDInfo(dwkeytype, pvkey.toCPointer<ByteVar>(), dwgroupid)?.toLong() ?: 0L

public actual fun CryptFormatObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: Long, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, pbformat: Long, pcbformat: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptFormatObject(dwcertencodingtype, dwformattype, dwformatstrtype, pformatstruct.toCPointer<ByteVar>(), lpszstructtype.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), cbencoded, pbformat.toCPointer<ByteVar>(), pcbformat.toCPointer<ByteVar>())

public actual fun CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress(hfuncaddr.toCPointer<ByteVar>(), dwflags)

public actual fun CryptGenKey(hprov: ULong, algid: ALG_ID, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGenKey(hprov, algid, dwflags, phkey.toCPointer<ByteVar>())

public actual fun CryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGenRandom(hprov, dwlen, pbbuffer.toCPointer<ByteVar>())

public actual fun CryptGetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, ppvparam: Long, ppfnfree: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetAsyncParam(hasync, pszparamoid.toCPointer<ByteVar>(), ppvparam.toCPointer<ByteVar>(), ppfnfree.toCPointer<ByteVar>())

public actual fun CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: UInt, pwszdlllist: PWSTR, pcchdlllist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList(hfuncset.toCPointer<ByteVar>(), dwencodingtype, pwszdlllist.toCPointer<ByteVar>(), pcchdlllist.toCPointer<ByteVar>())

public actual fun CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pwszdll: PCWSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress(hfuncset.toCPointer<ByteVar>(), dwencodingtype, pwszdll.toCPointer<ByteVar>(), dwflags, ppvfuncaddr.toCPointer<ByteVar>(), phfuncaddr.toCPointer<ByteVar>())

public actual fun CryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PSTR, pcbprovname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA(dwprovtype, pdwreserved.toCPointer<ByteVar>(), dwflags, pszprovname.toCPointer<ByteVar>(), pcbprovname.toCPointer<ByteVar>())

public actual fun CryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PWSTR, pcbprovname: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW(dwprovtype, pdwreserved.toCPointer<ByteVar>(), dwflags, pszprovname.toCPointer<ByteVar>(), pcbprovname.toCPointer<ByteVar>())

public actual fun CryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetHashParam(hhash, dwparam, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>(), dwflags)

public actual fun CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty(pkeyidentifier.toCPointer<ByteVar>(), dwpropid, dwflags, pwszcomputername.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CryptGetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetKeyParam(hkey, dwparam, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>(), dwflags)

public actual fun CryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, dwflags: UInt, pbsignedblob: Long, cbsignedblob: UInt): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates(dwmsgandcertencodingtype, hcryptprov, dwflags, pbsignedblob.toCPointer<ByteVar>(), cbsignedblob)?.toLong() ?: 0L

public actual fun CryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: Long, cbsignedblob: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount(dwmsgencodingtype, pbsignedblob.toCPointer<ByteVar>(), cbsignedblob)

public actual fun CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pszoid: PCSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress(hfuncset.toCPointer<ByteVar>(), dwencodingtype, pszoid.toCPointer<ByteVar>(), dwflags, ppvfuncaddr.toCPointer<ByteVar>(), phfuncaddr.toCPointer<ByteVar>())

public actual fun CryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pszoid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), pdwvaluetype.toCPointer<ByteVar>(), pbvaluedata.toCPointer<ByteVar>(), pcbvaluedata.toCPointer<ByteVar>())

public actual fun CryptGetObjectUrl(pszurloid: PCSTR, pvpara: Long, dwflags: CRYPT_GET_URL_FLAGS, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetObjectUrl(pszurloid.toCPointer<ByteVar>(), pvpara.toCPointer<ByteVar>(), dwflags, purlarray.toCPointer<ByteVar>(), pcburlarray.toCPointer<ByteVar>(), purlinfo.toCPointer<ByteVar>(), pcburlinfo.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun CryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetProvParam(hprov, dwparam, pbdata.toCPointer<ByteVar>(), pdwdatalen.toCPointer<ByteVar>(), dwflags)

public actual fun CryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptGetUserKey(hprov, dwkeyspec, phuserkey.toCPointer<ByteVar>())

public actual fun CryptHashCertificate(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashCertificate(hcryptprov, algid, dwflags, pbencoded.toCPointer<ByteVar>(), cbencoded, pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptHashCertificate2(pwszcnghashalgid: PCWSTR, dwflags: UInt, pvreserved: Long, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashCertificate2(pwszcnghashalgid.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), cbencoded, pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptHashData(hhash: ULong, pbdata: Long, dwdatalen: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashData(hhash, pbdata.toCPointer<ByteVar>(), dwdatalen, dwflags)

public actual fun CryptHashMessage(phashpara: Long, fdetachedhash: BOOL, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashMessage(phashpara.toCPointer<ByteVar>(), fdetachedhash, ctobehashed, rgpbtobehashed.toCPointer<ByteVar>(), rgcbtobehashed.toCPointer<ByteVar>(), pbhashedblob.toCPointer<ByteVar>(), pcbhashedblob.toCPointer<ByteVar>(), pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptHashPublicKeyInfo(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo(hcryptprov, algid, dwflags, dwcertencodingtype, pinfo.toCPointer<ByteVar>(), pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashSessionKey(hhash, hkey, dwflags)

public actual fun CryptHashToBeSigned(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptHashToBeSigned(hcryptprov, dwcertencodingtype, pbencoded.toCPointer<ByteVar>(), cbencoded, pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptImportKey(hprov: ULong, pbdata: Long, dwdatalen: UInt, hpubkey: ULong, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptImportKey(hprov, pbdata.toCPointer<ByteVar>(), dwdatalen, hpubkey, dwflags, phkey.toCPointer<ByteVar>())

public actual fun CryptImportPKCS8(sprivatekeyandparams: CRYPT_PKCS8_IMPORT_PARAMS, dwflags: CRYPT_KEY_FLAGS, phcryptprov: Long, pvauxinfo: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo(hcryptprov, dwcertencodingtype, pinfo.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>())

public actual fun CryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, aikeyalg: ALG_ID, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx(hcryptprov, dwcertencodingtype, pinfo.toCPointer<ByteVar>(), aikeyalg, dwflags, pvauxinfo.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>())

public actual fun CryptImportPublicKeyInfoEx2(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo: Long, phkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2(dwcertencodingtype, pinfo.toCPointer<ByteVar>(), dwflags, pvauxinfo.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>())

public actual fun CryptInitOIDFunctionSet(pszfuncname: PCSTR, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet(pszfuncname.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun CryptInstallCancelRetrieval(pfncancel: PFN_CRYPT_CANCEL_RETRIEVAL, pvarg: Long, dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval(pfncancel.toLong().toCPointer<ByteVar>(), pvarg.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara: Long, dwflags: CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved: Long, phdefaultcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext(hcryptprov, dwdefaulttype, pvdefaultpara.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>(), phdefaultcontext.toCPointer<ByteVar>())

public actual fun CryptInstallOIDFunctionAddress(hmodule: HMODULE, dwencodingtype: UInt, pszfuncname: PCSTR, cfuncentry: UInt, rgfuncentry: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress(hmodule.toCPointer<ByteVar>(), dwencodingtype, pszfuncname.toCPointer<ByteVar>(), cfuncentry, rgfuncentry.toCPointer<ByteVar>(), dwflags)

public actual fun CryptMemAlloc(cbsize: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMemAlloc(cbsize)?.toLong() ?: 0L

public actual fun CryptMemFree(pv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMemFree(pv.toCPointer<ByteVar>())
}

public actual fun CryptMemRealloc(pv: Long, cbsize: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMemRealloc(pv.toCPointer<ByteVar>(), cbsize)?.toLong() ?: 0L

public actual fun CryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, cbdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo.toCPointer<ByteVar>(), pszinnercontentobjid.toCPointer<ByteVar>(), cbdata)

public actual fun CryptMsgClose(hcryptmsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgClose(hcryptmsg.toCPointer<ByteVar>())

public actual fun CryptMsgControl(hcryptmsg: Long, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgControl(hcryptmsg.toCPointer<ByteVar>(), dwflags, dwctrltype, pvctrlpara.toCPointer<ByteVar>())

public actual fun CryptMsgCountersign(hcryptmsg: Long, dwindex: UInt, ccountersigners: UInt, rgcountersigners: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgCountersign(hcryptmsg.toCPointer<ByteVar>(), dwindex, ccountersigners, rgcountersigners.toCPointer<ByteVar>())

public actual fun CryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded(dwencodingtype, pbsignerinfo.toCPointer<ByteVar>(), cbsignerinfo, ccountersigners, rgcountersigners.toCPointer<ByteVar>(), pbcountersignature.toCPointer<ByteVar>(), pcbcountersignature.toCPointer<ByteVar>())

public actual fun CryptMsgDuplicate(hcryptmsg: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgDuplicate(hcryptmsg.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: Long, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL(dwmsgencodingtype, pctlinfo.toCPointer<ByteVar>(), psigninfo.toCPointer<ByteVar>(), dwflags, pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>())

public actual fun CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: UInt, rghsignerstore: Long, dwflags: UInt, ppsigner: Long, pdwsignerindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner(hcryptmsg.toCPointer<ByteVar>(), csignerstore, rghsignerstore.toCPointer<ByteVar>(), dwflags, ppsigner.toCPointer<ByteVar>(), pdwsignerindex.toCPointer<ByteVar>())

public actual fun CryptMsgGetParam(hcryptmsg: Long, dwparamtype: UInt, dwindex: UInt, pvdata: Long, pcbdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgGetParam(hcryptmsg.toCPointer<ByteVar>(), dwparamtype, dwindex, pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun CryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, precipientinfo: Long, pstreaminfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode(dwmsgencodingtype, dwflags, dwmsgtype, hcryptprov, precipientinfo.toCPointer<ByteVar>(), pstreaminfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CRYPT_MSG_TYPE, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, pstreaminfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode(dwmsgencodingtype, dwflags, dwmsgtype, pvmsgencodeinfo.toCPointer<ByteVar>(), pszinnercontentobjid.toCPointer<ByteVar>(), pstreaminfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: Long, cbctlcontent: UInt, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgSignCTL(dwmsgencodingtype, pbctlcontent.toCPointer<ByteVar>(), cbctlcontent, psigninfo.toCPointer<ByteVar>(), dwflags, pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>())

public actual fun CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgUpdate(hcryptmsg.toCPointer<ByteVar>(), pbdata.toCPointer<ByteVar>(), cbdata, ffinal)

public actual fun CryptMsgVerifyCountersignatureEncoded(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, pcicountersigner: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded(hcryptprov, dwencodingtype, pbsignerinfo.toCPointer<ByteVar>(), cbsignerinfo, pbsignerinfocountersignature.toCPointer<ByteVar>(), cbsignerinfocountersignature, pcicountersigner.toCPointer<ByteVar>())

public actual fun CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: Long, dwflags: UInt, pvextra: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx(hcryptprov, dwencodingtype, pbsignerinfo.toCPointer<ByteVar>(), cbsignerinfo, pbsignerinfocountersignature.toCPointer<ByteVar>(), cbsignerinfocountersignature, dwsignertype, pvsigner.toCPointer<ByteVar>(), dwflags, pvextra.toCPointer<ByteVar>())

public actual fun CryptProtectData(pdatain: Long, szdatadescr: PCWSTR, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptProtectData(pdatain.toCPointer<ByteVar>(), szdatadescr.toCPointer<ByteVar>(), poptionalentropy.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), ppromptstruct.toCPointer<ByteVar>(), dwflags, pdataout.toCPointer<ByteVar>())

public actual fun CryptProtectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptProtectMemory(pdatain.toCPointer<ByteVar>(), cbdatain, dwflags)

public actual fun CryptQueryObject(dwobjecttype: CERT_QUERY_OBJECT_TYPE, pvobject: Long, dwexpectedcontenttypeflags: CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags: CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags: UInt, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptQueryObject(dwobjecttype, pvobject.toCPointer<ByteVar>(), dwexpectedcontenttypeflags, dwexpectedformattypeflags, dwflags, pdwmsgandcertencodingtype.toCPointer<ByteVar>(), pdwcontenttype.toCPointer<ByteVar>(), pdwformattype.toCPointer<ByteVar>(), phcertstore.toCPointer<ByteVar>(), phmsg.toCPointer<ByteVar>(), ppvcontext.toCPointer<ByteVar>())

public actual fun CryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, dwindex: UInt, pwszdll: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), dwindex, pwszdll.toCPointer<ByteVar>())

public actual fun CryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszdll: PCWSTR, pszoverridefuncname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pszoid.toCPointer<ByteVar>(), pwszdll.toCPointer<ByteVar>(), pszoverridefuncname.toCPointer<ByteVar>())

public actual fun CryptRegisterOIDInfo(pinfo: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo(pinfo.toCPointer<ByteVar>(), dwflags)

public actual fun CryptReleaseContext(hprov: ULong, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptReleaseContext(hprov, dwflags)

public actual fun CryptRetrieveObjectByUrlA(pszurl: PCSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA(pszurl.toCPointer<ByteVar>(), pszobjectoid.toCPointer<ByteVar>(), dwretrievalflags, dwtimeout, ppvobject.toCPointer<ByteVar>(), hasyncretrieve, pcredentials.toCPointer<ByteVar>(), pvverify.toCPointer<ByteVar>(), pauxinfo.toCPointer<ByteVar>())

public actual fun CryptRetrieveObjectByUrlW(pszurl: PCWSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW(pszurl.toCPointer<ByteVar>(), pszobjectoid.toCPointer<ByteVar>(), dwretrievalflags, dwtimeout, ppvobject.toCPointer<ByteVar>(), hasyncretrieve, pcredentials.toCPointer<ByteVar>(), pvverify.toCPointer<ByteVar>(), pauxinfo.toCPointer<ByteVar>())

public actual fun CryptRetrieveTimeStamp(wszurl: PCWSTR, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: PCSTR, ppara: Long, pbdata: Long, cbdata: UInt, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp(wszurl.toCPointer<ByteVar>(), dwretrievalflags, dwtimeout, pszhashid.toCPointer<ByteVar>(), ppara.toCPointer<ByteVar>(), pbdata.toCPointer<ByteVar>(), cbdata, pptscontext.toCPointer<ByteVar>(), pptssigner.toCPointer<ByteVar>(), phstore.toCPointer<ByteVar>())

public actual fun CryptSetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, pvparam: Long, pfnfree: PFN_CRYPT_ASYNC_PARAM_FREE_FUNC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetAsyncParam(hasync, pszparamoid.toCPointer<ByteVar>(), pvparam.toCPointer<ByteVar>(), pfnfree.toLong().toCPointer<ByteVar>())

public actual fun CryptSetHashParam(hhash: ULong, dwparam: CRYPT_SET_HASH_PARAM, pbdata: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetHashParam(hhash, dwparam, pbdata.toCPointer<ByteVar>(), dwflags)

public actual fun CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty(pkeyidentifier.toCPointer<ByteVar>(), dwpropid, dwflags, pwszcomputername.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>())

public actual fun CryptSetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetKeyParam(hkey, dwparam, pbdata.toCPointer<ByteVar>(), dwflags)

public actual fun CryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, dwvaluetype: REG_VALUE_TYPE, pbvaluedata: Long, cbvaluedata: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pszoid.toCPointer<ByteVar>(), pwszvaluename.toCPointer<ByteVar>(), dwvaluetype, pbvaluedata.toCPointer<ByteVar>(), cbvaluedata)

public actual fun CryptSetProvParam(hprov: ULong, dwparam: CRYPT_SET_PROV_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetProvParam(hprov, dwparam, pbdata.toCPointer<ByteVar>(), dwflags)

public actual fun CryptSetProviderA(pszprovname: PCSTR, dwprovtype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetProviderA(pszprovname.toCPointer<ByteVar>(), dwprovtype)

public actual fun CryptSetProviderExA(pszprovname: PCSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetProviderExA(pszprovname.toCPointer<ByteVar>(), dwprovtype, pdwreserved.toCPointer<ByteVar>(), dwflags)

public actual fun CryptSetProviderExW(pszprovname: PCWSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetProviderExW(pszprovname.toCPointer<ByteVar>(), dwprovtype, pdwreserved.toCPointer<ByteVar>(), dwflags)

public actual fun CryptSetProviderW(pszprovname: PCWSTR, dwprovtype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSetProviderW(pszprovname.toCPointer<ByteVar>(), dwprovtype)

public actual fun CryptSignAndEncodeCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, lpszstructtype.toCPointer<ByteVar>(), pvstructinfo.toCPointer<ByteVar>(), psignaturealgorithm.toCPointer<ByteVar>(), pvhashauxinfo.toCPointer<ByteVar>(), pbencoded.toCPointer<ByteVar>(), pcbencoded.toCPointer<ByteVar>())

public actual fun CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage(psignpara.toCPointer<ByteVar>(), pencryptpara.toCPointer<ByteVar>(), crecipientcert, rgprecipientcert.toCPointer<ByteVar>(), pbtobesignedandencrypted.toCPointer<ByteVar>(), cbtobesignedandencrypted, pbsignedandencryptedblob.toCPointer<ByteVar>(), pcbsignedandencryptedblob.toCPointer<ByteVar>())

public actual fun CryptSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned: Long, cbencodedtobesigned: UInt, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignCertificate(hcryptprovorncryptkey, dwkeyspec, dwcertencodingtype, pbencodedtobesigned.toCPointer<ByteVar>(), cbencodedtobesigned, psignaturealgorithm.toCPointer<ByteVar>(), pvhashauxinfo.toCPointer<ByteVar>(), pbsignature.toCPointer<ByteVar>(), pcbsignature.toCPointer<ByteVar>())

public actual fun CryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: PCSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignHashA(hhash, dwkeyspec, szdescription.toCPointer<ByteVar>(), dwflags, pbsignature.toCPointer<ByteVar>(), pdwsiglen.toCPointer<ByteVar>())

public actual fun CryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: PCWSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignHashW(hhash, dwkeyspec, szdescription.toCPointer<ByteVar>(), dwflags, pbsignature.toCPointer<ByteVar>(), pdwsiglen.toCPointer<ByteVar>())

public actual fun CryptSignMessage(psignpara: Long, fdetachedsignature: BOOL, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignMessage(psignpara.toCPointer<ByteVar>(), fdetachedsignature, ctobesigned, rgpbtobesigned.toCPointer<ByteVar>(), rgcbtobesigned.toCPointer<ByteVar>(), pbsignedblob.toCPointer<ByteVar>(), pcbsignedblob.toCPointer<ByteVar>())

public actual fun CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: UInt, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey(psignpara.toCPointer<ByteVar>(), pbtobesigned.toCPointer<ByteVar>(), cbtobesigned, pbsignedblob.toCPointer<ByteVar>(), pcbsignedblob.toCPointer<ByteVar>())

public actual fun CryptStringToBinaryA(pszstring: PCSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptStringToBinaryA(pszstring.toCPointer<ByteVar>(), cchstring, dwflags, pbbinary.toCPointer<ByteVar>(), pcbbinary.toCPointer<ByteVar>(), pdwskip.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun CryptStringToBinaryW(pszstring: PCWSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptStringToBinaryW(pszstring.toCPointer<ByteVar>(), cchstring, dwflags, pbbinary.toCPointer<ByteVar>(), pcbbinary.toCPointer<ByteVar>(), pdwskip.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun CryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval(dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: UInt, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext(hdefaultcontext.toCPointer<ByteVar>(), dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUnprotectData(pdatain.toCPointer<ByteVar>(), ppszdatadescr.toCPointer<ByteVar>(), poptionalentropy.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), ppromptstruct.toCPointer<ByteVar>(), dwflags, pdataout.toCPointer<ByteVar>())

public actual fun CryptUnprotectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUnprotectMemory(pdatain.toCPointer<ByteVar>(), cbdatain, dwflags)

public actual fun CryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pwszdll: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pwszdll.toCPointer<ByteVar>())

public actual fun CryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction(dwencodingtype, pszfuncname.toCPointer<ByteVar>(), pszoid.toCPointer<ByteVar>())

public actual fun CryptUnregisterOIDInfo(pinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo(pinfo.toCPointer<ByteVar>())

public actual fun CryptUpdateProtectedState(poldsid: PSID, pwszoldpassword: PCWSTR, dwflags: UInt, pdwsuccesscount: Long, pdwfailurecount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState(poldsid.toCPointer<ByteVar>(), pwszoldpassword.toCPointer<ByteVar>(), dwflags, pdwsuccesscount.toCPointer<ByteVar>(), pdwfailurecount.toCPointer<ByteVar>())

public actual fun CryptVerifyCertificateSignature(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, ppublickey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature(hcryptprov, dwcertencodingtype, pbencoded.toCPointer<ByteVar>(), cbencoded, ppublickey.toCPointer<ByteVar>())

public actual fun CryptVerifyCertificateSignatureEx(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwsubjecttype: UInt, pvsubject: Long, dwissuertype: UInt, pvissuer: Long, dwflags: CRYPT_VERIFY_CERT_FLAGS, pvextra: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx(hcryptprov, dwcertencodingtype, dwsubjecttype, pvsubject.toCPointer<ByteVar>(), dwissuertype, pvissuer.toCPointer<ByteVar>(), dwflags, pvextra.toCPointer<ByteVar>())

public actual fun CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash(phashpara.toCPointer<ByteVar>(), pbdetachedhashblob.toCPointer<ByteVar>(), cbdetachedhashblob, ctobehashed, rgpbtobehashed.toCPointer<ByteVar>(), rgcbtobehashed.toCPointer<ByteVar>(), pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbdetachedsignblob: Long, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature(pverifypara.toCPointer<ByteVar>(), dwsignerindex, pbdetachedsignblob.toCPointer<ByteVar>(), cbdetachedsignblob, ctobesigned, rgpbtobesigned.toCPointer<ByteVar>(), rgcbtobesigned.toCPointer<ByteVar>(), ppsignercert.toCPointer<ByteVar>())

public actual fun CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: UInt, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash(phashpara.toCPointer<ByteVar>(), pbhashedblob.toCPointer<ByteVar>(), cbhashedblob, pbtobehashed.toCPointer<ByteVar>(), pcbtobehashed.toCPointer<ByteVar>(), pbcomputedhash.toCPointer<ByteVar>(), pcbcomputedhash.toCPointer<ByteVar>())

public actual fun CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature(pverifypara.toCPointer<ByteVar>(), dwsignerindex, pbsignedblob.toCPointer<ByteVar>(), cbsignedblob, pbdecoded.toCPointer<ByteVar>(), pcbdecoded.toCPointer<ByteVar>(), ppsignercert.toCPointer<ByteVar>())

public actual fun CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey(pverifypara.toCPointer<ByteVar>(), ppublickeyinfo.toCPointer<ByteVar>(), pbsignedblob.toCPointer<ByteVar>(), cbsignedblob, pbdecoded.toCPointer<ByteVar>(), pcbdecoded.toCPointer<ByteVar>())

public actual fun CryptVerifySignatureA(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifySignatureA(hhash, pbsignature.toCPointer<ByteVar>(), dwsiglen, hpubkey, szdescription.toCPointer<ByteVar>(), dwflags)

public actual fun CryptVerifySignatureW(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifySignatureW(hhash, pbsignature.toCPointer<ByteVar>(), dwsiglen, hpubkey, szdescription.toCPointer<ByteVar>(), dwflags)

public actual fun CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: UInt, pbdata: Long, cbdata: UInt, hadditionalstore: HCERTSTORE, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature(pbtscontentinfo.toCPointer<ByteVar>(), cbtscontentinfo, pbdata.toCPointer<ByteVar>(), cbdata, hadditionalstore.toCPointer<ByteVar>(), pptscontext.toCPointer<ByteVar>(), pptssigner.toCPointer<ByteVar>(), phstore.toCPointer<ByteVar>())

public actual fun CryptXmlAddObject(hsignatureorobject: Long, dwflags: UInt, rgproperty: Long, cproperty: UInt, pencoded: Long, ppobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlAddObject(hsignatureorobject.toCPointer<ByteVar>(), dwflags, rgproperty.toCPointer<ByteVar>(), cproperty, pencoded.toCPointer<ByteVar>(), ppobject.toCPointer<ByteVar>())

public actual fun CryptXmlClose(hcryptxml: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlClose(hcryptxml.toCPointer<ByteVar>())

public actual fun CryptXmlCreateReference(hcryptxml: Long, dwflags: UInt, wszid: PCWSTR, wszuri: PCWSTR, wsztype: PCWSTR, pdigestmethod: Long, ctransform: UInt, rgtransform: Long, phreference: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlCreateReference(hcryptxml.toCPointer<ByteVar>(), dwflags, wszid.toCPointer<ByteVar>(), wszuri.toCPointer<ByteVar>(), wsztype.toCPointer<ByteVar>(), pdigestmethod.toCPointer<ByteVar>(), ctransform, rgtransform.toCPointer<ByteVar>(), phreference.toCPointer<ByteVar>())

public actual fun CryptXmlDigestReference(hreference: Long, dwflags: UInt, pdataproviderin: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlDigestReference(hreference.toCPointer<ByteVar>(), dwflags, pdataproviderin.toCPointer<ByteVar>())

public actual fun CryptXmlEncode(hcryptxml: Long, dwcharset: CRYPT_XML_CHARSET, rgproperty: Long, cproperty: UInt, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlEncode(hcryptxml.toCPointer<ByteVar>(), dwcharset, rgproperty.toCPointer<ByteVar>(), cproperty, pvcallbackstate.toCPointer<ByteVar>(), pfnwrite.toLong().toCPointer<ByteVar>())

public actual fun CryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumalginfo: PFN_CRYPT_XML_ENUM_ALG_INFO): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo(dwgroupid, dwflags, pvarg.toCPointer<ByteVar>(), pfnenumalginfo.toLong().toCPointer<ByteVar>())

public actual fun CryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: Long, dwgroupid: UInt, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo(dwfindbytype, pvfindby.toCPointer<ByteVar>(), dwgroupid, dwflags)?.toLong() ?: 0L

public actual fun CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: CRYPT_XML_FLAGS, ppalginfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo(pxmlalgorithm.toCPointer<ByteVar>(), dwflags, ppalginfo.toCPointer<ByteVar>())

public actual fun CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext(hcryptxml.toCPointer<ByteVar>(), ppstruct.toCPointer<ByteVar>())

public actual fun CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetReference(hcryptxml.toCPointer<ByteVar>(), ppstruct.toCPointer<ByteVar>())

public actual fun CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetSignature(hcryptxml.toCPointer<ByteVar>(), ppstruct.toCPointer<ByteVar>())

public actual fun CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetStatus(hcryptxml.toCPointer<ByteVar>(), pstatus.toCPointer<ByteVar>())

public actual fun CryptXmlGetTransforms(ppconfig: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms(ppconfig.toCPointer<ByteVar>())

public actual fun CryptXmlImportPublicKey(dwflags: CRYPT_XML_FLAGS, pkeyvalue: Long, phkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey(dwflags, pkeyvalue.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>())

public actual fun CryptXmlOpenToDecode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, rgproperty: Long, cproperty: UInt, pencoded: Long, phcryptxml: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode(pconfig.toCPointer<ByteVar>(), dwflags, rgproperty.toCPointer<ByteVar>(), cproperty, pencoded.toCPointer<ByteVar>(), phcryptxml.toCPointer<ByteVar>())

public actual fun CryptXmlOpenToEncode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, wszid: PCWSTR, rgproperty: Long, cproperty: UInt, pencoded: Long, phsignature: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode(pconfig.toCPointer<ByteVar>(), dwflags, wszid.toCPointer<ByteVar>(), rgproperty.toCPointer<ByteVar>(), cproperty, pencoded.toCPointer<ByteVar>(), phsignature.toCPointer<ByteVar>())

public actual fun CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret(hsignature.toCPointer<ByteVar>(), pbsecret.toCPointer<ByteVar>(), cbsecret)

public actual fun CryptXmlSign(hsignature: Long, hkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwflags: CRYPT_XML_FLAGS, dwkeyinfospec: CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlSign(hsignature.toCPointer<ByteVar>(), hkey, dwkeyspec, dwflags, dwkeyinfospec, pvkeyinfospec.toCPointer<ByteVar>(), psignaturemethod.toCPointer<ByteVar>(), pcanonicalization.toCPointer<ByteVar>())

public actual fun CryptXmlVerifySignature(hsignature: Long, hkey: BCRYPT_KEY_HANDLE, dwflags: CRYPT_XML_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature(hsignature.toCPointer<ByteVar>(), hkey.toCPointer<ByteVar>(), dwflags)

public actual fun Decrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_Decrypt(hcrypto.toCPointer<ByteVar>(), foaep, cbindata, pindata.toCPointer<ByteVar>(), pcboutdata.toCPointer<ByteVar>(), ppoutdata.toCPointer<ByteVar>())

public actual fun Encrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_Encrypt(hcrypto.toCPointer<ByteVar>(), foaep, cbindata, pindata.toCPointer<ByteVar>(), pcboutdata.toCPointer<ByteVar>(), ppoutdata.toCPointer<ByteVar>())

public actual fun FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: UInt, pwszpurpose: PCWSTR, dwkeyspec: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_FindCertsByIssuer(pcertchains.toCPointer<ByteVar>(), pcbcertchains.toCPointer<ByteVar>(), pccertchains.toCPointer<ByteVar>(), pbencodedissuername.toCPointer<ByteVar>(), cbencodedissuername, pwszpurpose.toCPointer<ByteVar>(), dwkeyspec)

public actual fun FreeToken(pallocmemory: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_FreeToken(pallocmemory.toCPointer<ByteVar>())

public actual fun GenerateDerivedKey(hcrypto: Long, cblabel: UInt, plabel: Long, cbnonce: UInt, pnonce: Long, derivedkeylength: UInt, offset: UInt, algid: PCWSTR, pcbkey: Long, ppkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GenerateDerivedKey(hcrypto.toCPointer<ByteVar>(), cblabel, plabel.toCPointer<ByteVar>(), cbnonce, pnonce.toCPointer<ByteVar>(), derivedkeylength, offset, algid.toCPointer<ByteVar>(), pcbkey.toCPointer<ByteVar>(), ppkey.toCPointer<ByteVar>())

public actual fun GetAsymmetricEncryptionInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetBrowserToken(dwparamtype: UInt, pparam: Long, pcbtoken: Long, pptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetBrowserToken(dwparamtype, pparam.toCPointer<ByteVar>(), pcbtoken.toCPointer<ByteVar>(), pptoken.toCPointer<ByteVar>())

public actual fun GetCipherInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetCipherInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetCryptoTransform(hsymmetriccrypto: Long, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: Long, pphtransform: Long): HRESULT =
    0

public actual fun GetHashInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetHashInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetKeyDerivationInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetKeyStorageInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetKeyStorageInterface(pszprovidername.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetKeyedHash(hsymmetriccrypto.toCPointer<ByteVar>(), pphhash.toCPointer<ByteVar>())

public actual fun GetRngInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetRngInterface(pszprovidername.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetSChannelInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetSChannelInterface(pszprovidername.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetSecretAgreementInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetSignatureInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetSignatureInterface(pszprovidername.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), ppfunctiontable.toCPointer<ByteVar>(), dwflags)

public actual fun GetToken(cpolicychain: UInt, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_GetToken(cpolicychain, ppolicychain.toCPointer<ByteVar>(), securitytoken.toCPointer<ByteVar>(), phprooftokencrypto.toCPointer<ByteVar>())

public actual fun HashCore(hcrypto: Long, cbindata: UInt, pindata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_HashCore(hcrypto.toCPointer<ByteVar>(), cbindata, pindata.toCPointer<ByteVar>())

public actual fun HashFinal(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_HashFinal(hcrypto.toCPointer<ByteVar>(), cbindata, pindata.toCPointer<ByteVar>(), pcboutdata.toCPointer<ByteVar>(), ppoutdata.toCPointer<ByteVar>())

public actual fun ImportInformationCard(filename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_ImportInformationCard(filename.toCPointer<ByteVar>())

public actual fun ManageCardSpace(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_ManageCardSpace()

public actual fun NCryptCloseProtectionDescriptor(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor(hdescriptor.toCPointer<ByteVar>())

public actual fun NCryptCreateClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptCreateClaim(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist.toCPointer<ByteVar>(), pbclaimblob.toCPointer<ByteVar>(), cbclaimblob, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptCreatePersistedKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey(hprovider, phkey.toCPointer<ByteVar>(), pszalgid.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), dwlegacykeyspec, dwflags)

public actual fun NCryptCreateProtectionDescriptor(pwszdescriptorstring: PCWSTR, dwflags: UInt, phdescriptor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor(pwszdescriptorstring.toCPointer<ByteVar>(), dwflags, phdescriptor.toCPointer<ByteVar>())

public actual fun NCryptDecrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptDecrypt(hkey, pbinput.toCPointer<ByteVar>(), cbinput, ppaddinginfo.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptDeleteKey(hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptDeleteKey(hkey, dwflags)

public actual fun NCryptDeriveKey(hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptDeriveKey(hsharedsecret, pwszkdf.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptEncrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptEncrypt(hkey, pbinput.toCPointer<ByteVar>(), cbinput, ppaddinginfo.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptEnumAlgorithms(hprovider: NCRYPT_PROV_HANDLE, dwalgoperations: NCRYPT_OPERATION, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms(hprovider, dwalgoperations, pdwalgcount.toCPointer<ByteVar>(), ppalglist.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptEnumKeys(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptEnumKeys(hprovider, pszscope.toCPointer<ByteVar>(), ppkeyname.toCPointer<ByteVar>(), ppenumstate.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders(pdwprovidercount.toCPointer<ByteVar>(), ppproviderlist.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptExportKey(hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptExportKey(hkey, hexportkey, pszblobtype.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptFinalizeKey(hkey: NCRYPT_KEY_HANDLE, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptFinalizeKey(hkey, dwflags)

public actual fun NCryptFreeBuffer(pvinput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptFreeBuffer(pvinput.toCPointer<ByteVar>())

public actual fun NCryptFreeObject(hobject: NCRYPT_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptFreeObject(hobject)

public actual fun NCryptGetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: OBJECT_SECURITY_INFORMATION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptGetProperty(hobject, pszproperty.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptGetProtectionDescriptorInfo(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, pmempara: Long, dwinfotype: UInt, ppvinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo(hdescriptor.toCPointer<ByteVar>(), pmempara.toCPointer<ByteVar>(), dwinfotype, ppvinfo.toCPointer<ByteVar>())

public actual fun NCryptImportKey(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptImportKey(hprovider, himportkey, pszblobtype.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), pbdata.toCPointer<ByteVar>(), cbdata, dwflags)

public actual fun NCryptIsAlgSupported(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported(hprovider, pszalgid.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptIsKeyHandle(hkey: NCRYPT_KEY_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle(hkey)

public actual fun NCryptKeyDerivation(hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptKeyDerivation(hkey, pparameterlist.toCPointer<ByteVar>(), pbderivedkey.toCPointer<ByteVar>(), cbderivedkey, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptNotifyChangeKey(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey(hprovider, phevent.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptOpenKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptOpenKey(hprovider, phkey.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), dwlegacykeyspec, dwflags)

public actual fun NCryptOpenStorageProvider(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider(phprovider.toCPointer<ByteVar>(), pszprovidername.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptProtectSecret(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, pbdata: Long, cbdata: UInt, pmempara: Long, hwnd: HWND, ppbprotectedblob: Long, pcbprotectedblob: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptProtectSecret(hdescriptor.toCPointer<ByteVar>(), dwflags, pbdata.toCPointer<ByteVar>(), cbdata, pmempara.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), ppbprotectedblob.toCPointer<ByteVar>(), pcbprotectedblob.toCPointer<ByteVar>())

public actual fun NCryptQueryProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PWSTR, pcdescriptorstring: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName(pwszname.toCPointer<ByteVar>(), pwszdescriptorstring.toCPointer<ByteVar>(), pcdescriptorstring.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptRegisterProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName(pwszname.toCPointer<ByteVar>(), pwszdescriptorstring.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptSecretAgreement(hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptSecretAgreement(hprivkey, hpubkey, phagreedsecret.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptSetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptSetProperty(hobject, pszproperty.toCPointer<ByteVar>(), pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun NCryptSignHash(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptSignHash(hkey, ppaddinginfo.toCPointer<ByteVar>(), pbhashvalue.toCPointer<ByteVar>(), cbhashvalue, pbsignature.toCPointer<ByteVar>(), cbsignature, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptStreamClose(hstream: NCRYPT_STREAM_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptStreamClose(hstream.toCPointer<ByteVar>())

public actual fun NCryptStreamOpenToProtect(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, hwnd: HWND, pstreaminfo: Long, phstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect(hdescriptor.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), pstreaminfo.toCPointer<ByteVar>(), phstream.toCPointer<ByteVar>())

public actual fun NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect(pstreaminfo.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), phstream.toCPointer<ByteVar>())

public actual fun NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx(pstreaminfo.toCPointer<ByteVar>(), dwflags, hwnd.toCPointer<ByteVar>(), phstream.toCPointer<ByteVar>())

public actual fun NCryptStreamUpdate(hstream: NCRYPT_STREAM_HANDLE, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptStreamUpdate(hstream.toCPointer<ByteVar>(), pbdata.toCPointer<ByteVar>(), cbdata, ffinal)

public actual fun NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptTranslateHandle(phprovider.toCPointer<ByteVar>(), phkey.toCPointer<ByteVar>(), hlegacyprov, hlegacykey, dwlegacykeyspec, dwflags)

public actual fun NCryptUnprotectSecret(phdescriptor: Long, dwflags: NCRYPT_FLAGS, pbprotectedblob: Long, cbprotectedblob: UInt, pmempara: Long, hwnd: HWND, ppbdata: Long, pcbdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret(phdescriptor.toCPointer<ByteVar>(), dwflags, pbprotectedblob.toCPointer<ByteVar>(), cbprotectedblob, pmempara.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), ppbdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun NCryptVerifyClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptVerifyClaim(hsubjectkey, hauthoritykey, dwclaimtype, pparameterlist.toCPointer<ByteVar>(), pbclaimblob.toCPointer<ByteVar>(), cbclaimblob, poutput.toCPointer<ByteVar>(), dwflags)

public actual fun NCryptVerifySignature(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_NCryptVerifySignature(hkey, ppaddinginfo.toCPointer<ByteVar>(), pbhashvalue.toCPointer<ByteVar>(), cbhashvalue, pbsignature.toCPointer<ByteVar>(), cbsignature, dwflags)

public actual fun PFXExportCertStore(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_PFXExportCertStore(hstore.toCPointer<ByteVar>(), ppfx.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>(), dwflags)

public actual fun PFXExportCertStoreEx(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, pvpara: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx(hstore.toCPointer<ByteVar>(), ppfx.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>(), pvpara.toCPointer<ByteVar>(), dwflags)

public actual fun PFXImportCertStore(ppfx: Long, szpassword: PCWSTR, dwflags: CRYPT_KEY_FLAGS): HCERTSTORE =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_PFXImportCertStore(ppfx.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun PFXIsPFXBlob(ppfx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_PFXIsPFXBlob(ppfx.toCPointer<ByteVar>())

public actual fun PFXVerifyPassword(ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_PFXVerifyPassword(ppfx.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>(), dwflags)

public actual fun ProcessPrng(pbdata: Long, cbdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_ProcessPrng(pbdata.toCPointer<ByteVar>(), cbdata)

public actual fun SignError(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignError()

public actual fun SignHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, pcbsig: Long, ppsig: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignHash(hcrypto.toCPointer<ByteVar>(), cbhash, phash.toCPointer<ByteVar>(), hashalgoid.toCPointer<ByteVar>(), pcbsig.toCPointer<ByteVar>(), ppsig.toCPointer<ByteVar>())

public actual fun SignerFreeSignerContext(psignercontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerFreeSignerContext(psignercontext.toCPointer<ByteVar>())

public actual fun SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerSign(psubjectinfo.toCPointer<ByteVar>(), psignercert.toCPointer<ByteVar>(), psignatureinfo.toCPointer<ByteVar>(), pproviderinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>())

public actual fun SignerSignEx(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerSignEx(dwflags, psubjectinfo.toCPointer<ByteVar>(), psignercert.toCPointer<ByteVar>(), psignatureinfo.toCPointer<ByteVar>(), pproviderinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>())

public actual fun SignerSignEx2(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerSignEx2(dwflags, psubjectinfo.toCPointer<ByteVar>(), psignercert.toCPointer<ByteVar>(), psignatureinfo.toCPointer<ByteVar>(), pproviderinfo.toCPointer<ByteVar>(), dwtimestampflags, psztimestampalgorithmoid.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>(), pcryptopolicy.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun SignerSignEx3(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerSignEx3(dwflags, psubjectinfo.toCPointer<ByteVar>(), psignercert.toCPointer<ByteVar>(), psignatureinfo.toCPointer<ByteVar>(), pproviderinfo.toCPointer<ByteVar>(), dwtimestampflags, psztimestampalgorithmoid.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>(), pcryptopolicy.toCPointer<ByteVar>(), pdigestsigninfo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerTimeStamp(psubjectinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>())

public actual fun SignerTimeStampEx(dwflags: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerTimeStampEx(dwflags, psubjectinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>())

public actual fun SignerTimeStampEx2(dwflags: SIGNER_TIMESTAMP_FLAGS, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, dwalgid: ALG_ID, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerTimeStampEx2(dwflags, psubjectinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), dwalgid, psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>())

public actual fun SignerTimeStampEx3(dwflags: SIGNER_TIMESTAMP_FLAGS, dwindex: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, pszalgorithmoid: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SignerTimeStampEx3(dwflags, dwindex, psubjectinfo.toCPointer<ByteVar>(), pwszhttptimestamp.toCPointer<ByteVar>(), pszalgorithmoid.toCPointer<ByteVar>(), psrequest.toCPointer<ByteVar>(), psipdata.toCPointer<ByteVar>(), ppsignercontext.toCPointer<ByteVar>(), pcryptopolicy.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun SslChangeNotify(hevent: HANDLE, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslChangeNotify(hevent.toCPointer<ByteVar>(), dwflags)

public actual fun SslComputeClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash(hsslprovider, hmasterkey, hhandshakehash, pszalgid.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslComputeEapKeyBlock(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock(hsslprovider, hmasterkey, pbrandoms.toCPointer<ByteVar>(), cbrandoms, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslComputeFinishedHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslComputeFinishedHash(hsslprovider, hmasterkey, hhandshakehash, pboutput.toCPointer<ByteVar>(), cboutput, dwflags)

public actual fun SslComputeSessionHash(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslComputeSessionHash(hsslprovider, hhandshakehash, dwprotocol, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslCreateClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash(hsslprovider, phhandshakehash.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, pszhashalgid.toCPointer<ByteVar>(), dwflags)

public actual fun SslCreateEphemeralKey(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey(hsslprovider, phephemeralkey.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, dwkeytype, dwkeybitlen, pbparams.toCPointer<ByteVar>(), cbparams, dwflags)

public actual fun SslCreateHandshakeHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash(hsslprovider, phhandshakehash.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, dwflags)

public actual fun SslDecrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount(hsslprovider)

public actual fun SslDecryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslDecryptPacket(hsslprovider, hkey, pbinput.toCPointer<ByteVar>(), cbinput, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), sequencenumber, dwflags)

public actual fun SslDuplicateTranscriptHash(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phtranscripthash: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash(hsslprovider, htranscripthash, phtranscripthash.toCPointer<ByteVar>(), dwflags)

public actual fun SslEncryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslEncryptPacket(hsslprovider, hkey, pbinput.toCPointer<ByteVar>(), cbinput, pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), sequencenumber, dwcontenttype, dwflags)

public actual fun SslEnumCipherSuites(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslEnumCipherSuites(hsslprovider, hprivatekey, ppciphersuite.toCPointer<ByteVar>(), ppenumstate.toCPointer<ByteVar>(), dwflags)

public actual fun SslEnumCipherSuitesEx(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx(hsslprovider, hprivatekey, ppciphersuite.toCPointer<ByteVar>(), ppenumstate.toCPointer<ByteVar>(), dwflags)

public actual fun SslEnumEccCurves(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslEnumEccCurves(hsslprovider, pecccurvecount.toCPointer<ByteVar>(), ppecccurve.toCPointer<ByteVar>(), dwflags)

public actual fun SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders(pdwprovidercount.toCPointer<ByteVar>(), ppproviderlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandBinderKey(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandBinderKey(hsslprovider, hearlykey, phbinderkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandExporterMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey(hsslprovider, hbasekey, hhashvalue, phexportermasterkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandPreSharedKey(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey(hsslprovider, hresumptionmasterkey, pbticketnonce.toCPointer<ByteVar>(), cbticketnonce, phpresharedkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandResumptionMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey(hsslprovider, hmasterkey, hhashvalue, phresumptionmasterkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandTrafficKeys(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys(hsslprovider, hbasekey, hhashvalue, phclienttraffickey.toCPointer<ByteVar>(), phservertraffickey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExpandWriteKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExpandWriteKey(hsslprovider, hbasetraffickey, phwritekey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExportKey(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExportKey(hsslprovider, hkey, pszblobtype.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslExportKeyingMaterial(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial(hsslprovider, hmasterkey, slabel.toCPointer<ByteVar>(), pbrandoms.toCPointer<ByteVar>(), cbrandoms, pbcontextvalue.toCPointer<ByteVar>(), cbcontextvalue, pboutput.toCPointer<ByteVar>(), cboutput, dwflags)

public actual fun SslExtractEarlyKey(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExtractEarlyKey(hsslprovider, hpresharedkey, phearlykey.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExtractHandshakeKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey(hsslprovider, hprivatekey, hpublickey, hearlykey, phhandshakekey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslExtractMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslExtractMasterKey(hsslprovider, hhandshakekey, phmasterkey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslFreeBuffer(pvinput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslFreeBuffer(pvinput.toCPointer<ByteVar>())

public actual fun SslFreeObject(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslFreeObject(hobject, dwflags)

public actual fun SslGenerateMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGenerateMasterKey(hsslprovider, hprivatekey, hpublickey, phmasterkey.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, pparameterlist.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslGeneratePreMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey(hsslprovider, hpublickey, phpremasterkey.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, pparameterlist.toCPointer<ByteVar>(), pboutput.toCPointer<ByteVar>(), cboutput, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslGenerateSessionKeys(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys(hsslprovider, hmasterkey, phreadkey.toCPointer<ByteVar>(), phwritekey.toCPointer<ByteVar>(), pparameterlist.toCPointer<ByteVar>(), dwflags)

public actual fun SslGetCipherSuitePRFHashAlgorithm(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, szprfhash.toCPointer<ByteVar>(), dwflags)

public actual fun SslGetKeyProperty(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGetKeyProperty(hkey, pszproperty.toCPointer<ByteVar>(), ppboutput.toCPointer<ByteVar>(), pcboutput.toCPointer<ByteVar>(), dwflags)

public actual fun SslGetProviderProperty(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslGetProviderProperty(hsslprovider, pszproperty.toCPointer<ByteVar>(), ppboutput.toCPointer<ByteVar>(), pcboutput.toCPointer<ByteVar>(), ppenumstate.toCPointer<ByteVar>(), dwflags)

public actual fun SslHashHandshake(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslHashHandshake(hsslprovider, hhandshakehash, pbinput.toCPointer<ByteVar>(), cbinput, dwflags)

public actual fun SslImportKey(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslImportKey(hsslprovider, phkey.toCPointer<ByteVar>(), pszblobtype.toCPointer<ByteVar>(), pbkeyblob.toCPointer<ByteVar>(), cbkeyblob, dwflags)

public actual fun SslImportMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslImportMasterKey(hsslprovider, hprivatekey, phmasterkey.toCPointer<ByteVar>(), dwprotocol, dwciphersuite, pparameterlist.toCPointer<ByteVar>(), pbencryptedkey.toCPointer<ByteVar>(), cbencryptedkey, dwflags)

public actual fun SslIncrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount(hsslprovider)

public actual fun SslLookupCipherLengths(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslLookupCipherLengths(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pcipherlengths.toCPointer<ByteVar>(), cbcipherlengths, dwflags)

public actual fun SslLookupCipherSuiteInfo(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo(hsslprovider, dwprotocol, dwciphersuite, dwkeytype, pciphersuite.toCPointer<ByteVar>(), dwflags)

public actual fun SslOpenPrivateKey(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslOpenPrivateKey(hsslprovider, phprivatekey.toCPointer<ByteVar>(), pcertcontext.toCPointer<ByteVar>(), dwflags)

public actual fun SslOpenProvider(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslOpenProvider(phsslprovider.toCPointer<ByteVar>(), pszprovidername.toCPointer<ByteVar>(), dwflags)

public actual fun SslSignHash(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslSignHash(hsslprovider, hprivatekey, pbhashvalue.toCPointer<ByteVar>(), cbhashvalue, pbsignature.toCPointer<ByteVar>(), cbsignature, pcbresult.toCPointer<ByteVar>(), dwflags)

public actual fun SslVerifySignature(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SslVerifySignature(hsslprovider, hpublickey, pbhashvalue.toCPointer<ByteVar>(), cbhashvalue, pbsignature.toCPointer<ByteVar>(), cbsignature, dwflags)

public actual fun SystemPrng(pbrandomdata: Long, cbrandomdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_SystemPrng(pbrandomdata.toCPointer<ByteVar>(), cbrandomdata)

public actual fun TransformBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_TransformBlock(hcrypto.toCPointer<ByteVar>(), cbindata, pindata.toCPointer<ByteVar>(), pcboutdata.toCPointer<ByteVar>(), ppoutdata.toCPointer<ByteVar>())

public actual fun TransformFinalBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_TransformFinalBlock(hcrypto.toCPointer<ByteVar>(), cbindata, pindata.toCPointer<ByteVar>(), pcboutdata.toCPointer<ByteVar>(), ppoutdata.toCPointer<ByteVar>())

public actual fun VerifyHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, cbsig: UInt, psig: Long, pfverified: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.cinterop.windowssys_windows_win32_security_cryptography_VerifyHash(hcrypto.toCPointer<ByteVar>(), cbhash, phash.toCPointer<ByteVar>(), hashalgoid.toCPointer<ByteVar>(), cbsig, psig.toCPointer<ByteVar>(), pfverified.toCPointer<ByteVar>())
