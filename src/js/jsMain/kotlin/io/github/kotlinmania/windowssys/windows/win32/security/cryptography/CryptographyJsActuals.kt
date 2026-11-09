@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SecurityCryptographyNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BCryptAddContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, dwposition: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptAddContextFunction(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), dwposition.toInt()) as Int) else 0

public actual fun BCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwposition: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptAddContextFunctionProvider(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pszprovider.toString(), dwposition.toInt()) as Int) else 0

public actual fun BCryptCloseAlgorithmProvider(halgorithm: BCRYPT_ALG_HANDLE, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptCloseAlgorithmProvider(halgorithm.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptConfigureContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptConfigureContext(dwtable.toInt(), pszcontext.toString(), pconfig.toString()) as Int) else 0

public actual fun BCryptConfigureContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pconfig: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptConfigureContextFunction(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pconfig.toString()) as Int) else 0

public actual fun BCryptCreateContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pconfig: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptCreateContext(dwtable.toInt(), pszcontext.toString(), pconfig.toString()) as Int) else 0

public actual fun BCryptCreateHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptCreateHash(halgorithm.toString(), phhash.toString(), pbhashobject.toString(), cbhashobject.toInt(), pbsecret.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptCreateMultiHash(halgorithm: BCRYPT_ALG_HANDLE, phhash: Long, nhashes: UInt, pbhashobject: Long, cbhashobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptCreateMultiHash(halgorithm.toString(), phhash.toString(), nhashes.toInt(), pbhashobject.toString(), cbhashobject.toInt(), pbsecret.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDecrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDecrypt(hkey.toString(), pbinput.toString(), cbinput.toInt(), ppaddinginfo.toString(), pbiv.toString(), cbiv.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDeleteContext(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDeleteContext(dwtable.toInt(), pszcontext.toString()) as Int) else 0

public actual fun BCryptDeriveKey(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDeriveKey(hsharedsecret.toString(), pwszkdf.toString(), pparameterlist.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDeriveKeyCapi(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyCapi(hhash.toString(), htargetalg.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDeriveKeyPBKDF2(hprf: BCRYPT_ALG_HANDLE, pbpassword: Long, cbpassword: UInt, pbsalt: Long, cbsalt: UInt, citerations: ULong, pbderivedkey: Long, cbderivedkey: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDeriveKeyPBKDF2(hprf.toString(), pbpassword.toString(), cbpassword.toInt(), pbsalt.toString(), cbsalt.toInt(), citerations.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDestroyHash(hhash: BCRYPT_HASH_HANDLE): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDestroyHash(hhash.toString()) as Int) else 0

public actual fun BCryptDestroyKey(hkey: BCRYPT_KEY_HANDLE): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDestroyKey(hkey.toString()) as Int) else 0

public actual fun BCryptDestroySecret(hsecret: BCRYPT_SECRET_HANDLE): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDestroySecret(hsecret.toString()) as Int) else 0

public actual fun BCryptDuplicateHash(hhash: BCRYPT_HASH_HANDLE, phnewhash: Long, pbhashobject: Long, cbhashobject: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDuplicateHash(hhash.toString(), phnewhash.toString(), pbhashobject.toString(), cbhashobject.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptDuplicateKey(hkey: BCRYPT_KEY_HANDLE, phnewkey: Long, pbkeyobject: Long, cbkeyobject: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptDuplicateKey(hkey.toString(), phnewkey.toString(), pbkeyobject.toString(), cbkeyobject.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptEncrypt(hkey: BCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pbiv: Long, cbiv: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEncrypt(hkey.toString(), pbinput.toString(), cbinput.toInt(), ppaddinginfo.toString(), pbiv.toString(), cbiv.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptEnumAlgorithms(dwalgoperations: BCRYPT_OPERATION, palgcount: Long, ppalglist: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumAlgorithms(dwalgoperations.toInt(), palgcount.toString(), ppalglist.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptEnumContextFunctionProviders(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctionProviders(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptEnumContextFunctions(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumContextFunctions(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptEnumContexts(dwtable: BCRYPT_TABLE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumContexts(dwtable.toInt(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptEnumProviders(pszalgid: PCWSTR, pimplcount: Long, ppimpllist: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumProviders(pszalgid.toString(), pimplcount.toString(), ppimpllist.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptEnumRegisteredProviders(pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptExportKey(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptExportKey(hkey.toString(), hexportkey.toString(), pszblobtype.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptFinalizeKeyPair(hkey: BCRYPT_KEY_HANDLE, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptFinalizeKeyPair(hkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptFinishHash(hhash: BCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptFinishHash(hhash.toString(), pboutput.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptFreeBuffer(pvbuffer: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptFreeBuffer(pvbuffer.toString())
    }
}

public actual fun BCryptGenRandom(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: Long, cbbuffer: UInt, dwflags: BCRYPTGENRANDOM_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptGenRandom(halgorithm.toString(), pbbuffer.toString(), cbbuffer.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptGenerateKeyPair(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, dwlength: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptGenerateKeyPair(halgorithm.toString(), phkey.toString(), dwlength.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptGenerateSymmetricKey(halgorithm: BCRYPT_ALG_HANDLE, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbsecret: Long, cbsecret: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptGenerateSymmetricKey(halgorithm.toString(), phkey.toString(), pbkeyobject.toString(), cbkeyobject.toInt(), pbsecret.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptGetFipsAlgorithmMode(pfenabled: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptGetFipsAlgorithmMode(pfenabled.toString()) as Int) else 0

public actual fun BCryptGetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptGetProperty(hobject.toString(), pszproperty.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptHash(halgorithm: BCRYPT_ALG_HANDLE, pbsecret: Long, cbsecret: UInt, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptHash(halgorithm.toString(), pbsecret.toString(), cbsecret.toInt(), pbinput.toString(), cbinput.toInt(), pboutput.toString(), cboutput.toInt()) as Int) else 0

public actual fun BCryptHashData(hhash: BCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptHashData(hhash.toString(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptImportKey(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbkeyobject: Long, cbkeyobject: UInt, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptImportKey(halgorithm.toString(), himportkey.toString(), pszblobtype.toString(), phkey.toString(), pbkeyobject.toString(), cbkeyobject.toInt(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptImportKeyPair(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, phkey: Long, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptImportKeyPair(halgorithm.toString(), himportkey.toString(), pszblobtype.toString(), phkey.toString(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptKeyDerivation(hkey: BCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptKeyDerivation(hkey.toString(), pparameterlist.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: PCWSTR, pszimplementation: PCWSTR, dwflags: BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptOpenAlgorithmProvider(phalgorithm.toString(), pszalgid.toString(), pszimplementation.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptProcessMultiOperations(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: Long, cboperations: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptProcessMultiOperations(hobject.toString(), operationtype, poperations.toString(), cboperations.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptQueryContextConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptQueryContextConfiguration(dwtable.toInt(), pszcontext.toString(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptQueryContextFunctionConfiguration(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionConfiguration(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptQueryContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, pcbvalue: Long, ppbvalue: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptQueryContextFunctionProperty(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pszproperty.toString(), pcbvalue.toString(), ppbvalue.toString()) as Int) else 0

public actual fun BCryptQueryProviderRegistration(pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwinterface: BCRYPT_INTERFACE, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptQueryProviderRegistration(pszprovider.toString(), dwmode.toInt(), dwinterface.toInt(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptRegisterConfigChangeNotify(phevent: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptRegisterConfigChangeNotify(phevent.toString()) as Int) else 0

public actual fun BCryptRegisterProvider(pszprovider: PCWSTR, dwflags: UInt, preg: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptRegisterProvider(pszprovider.toString(), dwflags.toInt(), preg.toString()) as Int) else 0

public actual fun BCryptRemoveContextFunction(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunction(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString()) as Int) else 0

public actual fun BCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptRemoveContextFunctionProvider(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pszprovider.toString()) as Int) else 0

public actual fun BCryptResolveProviders(pszcontext: PCWSTR, dwinterface: UInt, pszfunction: PCWSTR, pszprovider: PCWSTR, dwmode: BCRYPT_QUERY_PROVIDER_MODE, dwflags: BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer: Long, ppbuffer: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptResolveProviders(pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pszprovider.toString(), dwmode.toInt(), dwflags.toInt(), pcbbuffer.toString(), ppbuffer.toString()) as Int) else 0

public actual fun BCryptSecretAgreement(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptSecretAgreement(hprivkey.toString(), hpubkey.toString(), phagreedsecret.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptSetContextFunctionProperty(dwtable: BCRYPT_TABLE, pszcontext: PCWSTR, dwinterface: BCRYPT_INTERFACE, pszfunction: PCWSTR, pszproperty: PCWSTR, cbvalue: UInt, pbvalue: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptSetContextFunctionProperty(dwtable.toInt(), pszcontext.toString(), dwinterface.toInt(), pszfunction.toString(), pszproperty.toString(), cbvalue.toInt(), pbvalue.toString()) as Int) else 0

public actual fun BCryptSetProperty(hobject: BCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptSetProperty(hobject.toString(), pszproperty.toString(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun BCryptSignHash(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: BCRYPT_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptSignHash(hkey.toString(), ppaddinginfo.toString(), pbinput.toString(), cbinput.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun BCryptUnregisterConfigChangeNotify(hevent: HANDLE): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptUnregisterConfigChangeNotify(hevent.toString()) as Int) else 0

public actual fun BCryptUnregisterProvider(pszprovider: PCWSTR): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptUnregisterProvider(pszprovider.toString()) as Int) else 0

public actual fun BCryptVerifySignature(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhash: Long, cbhash: UInt, pbsignature: Long, cbsignature: UInt, dwflags: BCRYPT_FLAGS): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_BCryptVerifySignature(hkey.toString(), ppaddinginfo.toString(), pbhash.toString(), cbhash.toInt(), pbsignature.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CertAddCRLContextToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCRLContextToStore(hcertstore.toString(), pcrlcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddCRLLinkToStore(hcertstore: HCERTSTORE, pcrlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCRLLinkToStore(hcertstore.toString(), pcrlcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddCTLContextToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCTLContextToStore(hcertstore.toString(), pctlcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddCTLLinkToStore(hcertstore: HCERTSTORE, pctlcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCTLLinkToStore(hcertstore.toString(), pctlcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddCertificateContextToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCertificateContextToStore(hcertstore.toString(), pcertcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddCertificateLinkToStore(hcertstore: HCERTSTORE, pcertcontext: Long, dwadddisposition: UInt, ppstorecontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddCertificateLinkToStore(hcertstore.toString(), pcertcontext.toString(), dwadddisposition.toInt(), ppstorecontext.toString()) as Int) else 0

public actual fun CertAddEncodedCRLToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEncodedCRLToStore(hcertstore.toString(), dwcertencodingtype.toInt(), pbcrlencoded.toString(), cbcrlencoded.toInt(), dwadddisposition.toInt(), ppcrlcontext.toString()) as Int) else 0

public actual fun CertAddEncodedCTLToStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbctlencoded: Long, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEncodedCTLToStore(hcertstore.toString(), dwmsgandcertencodingtype.toInt(), pbctlencoded.toString(), cbctlencoded.toInt(), dwadddisposition.toInt(), ppctlcontext.toString()) as Int) else 0

public actual fun CertAddEncodedCertificateToStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToStore(hcertstore.toString(), dwcertencodingtype.toInt(), pbcertencoded.toString(), cbcertencoded.toInt(), dwadddisposition.toInt(), ppcertcontext.toString()) as Int) else 0

public actual fun CertAddEncodedCertificateToSystemStoreA(szcertstorename: PCSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreA(szcertstorename.toString(), pbcertencoded.toString(), cbcertencoded.toInt()) as Int) else 0

public actual fun CertAddEncodedCertificateToSystemStoreW(szcertstorename: PCWSTR, pbcertencoded: Long, cbcertencoded: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEncodedCertificateToSystemStoreW(szcertstorename.toString(), pbcertencoded.toString(), cbcertencoded.toInt()) as Int) else 0

public actual fun CertAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddEnhancedKeyUsageIdentifier(pcertcontext.toString(), pszusageidentifier.toString()) as Int) else 0

public actual fun CertAddRefServerOcspResponse(hserverocspresponse: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponse(hserverocspresponse.toString())
    }
}

public actual fun CertAddRefServerOcspResponseContext(pserverocspresponsecontext: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddRefServerOcspResponseContext(pserverocspresponsecontext.toString())
    }
}

public actual fun CertAddSerializedElementToStore(hcertstore: HCERTSTORE, pbelement: Long, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: Long, ppvcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddSerializedElementToStore(hcertstore.toString(), pbelement.toString(), cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), pdwcontexttype.toString(), ppvcontext.toString()) as Int) else 0

public actual fun CertAddStoreToCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE, dwupdateflags: UInt, dwpriority: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAddStoreToCollection(hcollectionstore.toString(), hsiblingstore.toString(), dwupdateflags.toInt(), dwpriority.toInt()) as Int) else 0

public actual fun CertAlgIdToOID(dwalgid: UInt): PCSTR =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertAlgIdToOID(dwalgid.toInt()) as String).toLong() else 0L

public actual fun CertCloseServerOcspResponse(hserverocspresponse: Long, dwflags: UInt) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCloseServerOcspResponse(hserverocspresponse.toString(), dwflags.toInt())
    }
}

public actual fun CertCloseStore(hcertstore: HCERTSTORE, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCloseStore(hcertstore.toString(), dwflags.toInt()) as Int) else 0

public actual fun CertCompareCertificate(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid1: Long, pcertid2: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCompareCertificate(dwcertencodingtype.toInt(), pcertid1.toString(), pcertid2.toString()) as Int) else 0

public actual fun CertCompareCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertname1: Long, pcertname2: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCompareCertificateName(dwcertencodingtype.toInt(), pcertname1.toString(), pcertname2.toString()) as Int) else 0

public actual fun CertCompareIntegerBlob(pint1: Long, pint2: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCompareIntegerBlob(pint1.toString(), pint2.toString()) as Int) else 0

public actual fun CertComparePublicKeyInfo(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey1: Long, ppublickey2: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertComparePublicKeyInfo(dwcertencodingtype.toInt(), ppublickey1.toString(), ppublickey2.toString()) as Int) else 0

public actual fun CertControlStore(hcertstore: HCERTSTORE, dwflags: CERT_CONTROL_STORE_FLAGS, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertControlStore(hcertstore.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.toString()) as Int) else 0

public actual fun CertCreateCRLContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcrlencoded: Long, cbcrlencoded: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateCRLContext(dwcertencodingtype.toInt(), pbcrlencoded.toString(), cbcrlencoded.toInt()) as String).toLong() else 0L

public actual fun CertCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: Long, cbctlencoded: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateCTLContext(dwmsgandcertencodingtype.toInt(), pbctlencoded.toString(), cbctlencoded.toInt()) as String).toLong() else 0L

public actual fun CertCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: UInt, rgoptattr: Long, dwflags: UInt, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateCTLEntryFromCertificateContextProperties(pcertcontext.toString(), coptattr.toInt(), rgoptattr.toString(), dwflags.toInt(), pvreserved.toString(), pctlentry.toString(), pcbctlentry.toString()) as Int) else 0

public actual fun CertCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateCertificateChainEngine(pconfig.toString(), phchainengine.toString()) as Int) else 0

public actual fun CertCreateCertificateContext(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbcertencoded: Long, cbcertencoded: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateCertificateContext(dwcertencodingtype.toInt(), pbcertencoded.toString(), cbcertencoded.toInt()) as String).toLong() else 0L

public actual fun CertCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pcreatepara: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), pbencoded.toString(), cbencoded.toInt(), dwflags.toInt(), pcreatepara.toString()) as String).toLong() else 0L

public actual fun CertCreateSelfSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob: Long, dwflags: CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertCreateSelfSignCertificate(hcryptprovorncryptkey.toString(), psubjectissuerblob.toString(), dwflags.toInt(), pkeyprovinfo.toString(), psignaturealgorithm.toString(), pstarttime.toString(), pendtime.toString(), pextensions.toString()) as String).toLong() else 0L

public actual fun CertDeleteCRLFromStore(pcrlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDeleteCRLFromStore(pcrlcontext.toString()) as Int) else 0

public actual fun CertDeleteCTLFromStore(pctlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDeleteCTLFromStore(pctlcontext.toString()) as Int) else 0

public actual fun CertDeleteCertificateFromStore(pcertcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDeleteCertificateFromStore(pcertcontext.toString()) as Int) else 0

public actual fun CertDuplicateCRLContext(pcrlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDuplicateCRLContext(pcrlcontext.toString()) as String).toLong() else 0L

public actual fun CertDuplicateCTLContext(pctlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDuplicateCTLContext(pctlcontext.toString()) as String).toLong() else 0L

public actual fun CertDuplicateCertificateChain(pchaincontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateChain(pchaincontext.toString()) as String).toLong() else 0L

public actual fun CertDuplicateCertificateContext(pcertcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDuplicateCertificateContext(pcertcontext.toString()) as String).toLong() else 0L

public actual fun CertDuplicateStore(hcertstore: HCERTSTORE): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertDuplicateStore(hcertstore.toString()) as String).toLong() else 0L

public actual fun CertEnumCRLContextProperties(pcrlcontext: Long, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCRLContextProperties(pcrlcontext.toString(), dwpropid.toInt()) as Int).toUInt() else 0u

public actual fun CertEnumCRLsInStore(hcertstore: HCERTSTORE, pprevcrlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCRLsInStore(hcertstore.toString(), pprevcrlcontext.toString()) as String).toLong() else 0L

public actual fun CertEnumCTLContextProperties(pctlcontext: Long, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCTLContextProperties(pctlcontext.toString(), dwpropid.toInt()) as Int).toUInt() else 0u

public actual fun CertEnumCTLsInStore(hcertstore: HCERTSTORE, pprevctlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCTLsInStore(hcertstore.toString(), pprevctlcontext.toString()) as String).toLong() else 0L

public actual fun CertEnumCertificateContextProperties(pcertcontext: Long, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCertificateContextProperties(pcertcontext.toString(), dwpropid.toInt()) as Int).toUInt() else 0u

public actual fun CertEnumCertificatesInStore(hcertstore: HCERTSTORE, pprevcertcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumCertificatesInStore(hcertstore.toString(), pprevcertcontext.toString()) as String).toLong() else 0L

public actual fun CertEnumPhysicalStore(pvsystemstore: Long, dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_PHYSICAL_STORE): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumPhysicalStore(pvsystemstore.toString(), dwflags.toInt(), pvarg.toString(), pfnenum.toLong().toString()) as Int) else 0

public actual fun CertEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumSubjectInSortedCTL(pctlcontext.toString(), ppvnextsubject.toString(), psubjectidentifier.toString(), pencodedattributes.toString()) as Int) else 0

public actual fun CertEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumSystemStore(dwflags.toInt(), pvsystemstorelocationpara.toString(), pvarg.toString(), pfnenum.toLong().toString()) as Int) else 0

public actual fun CertEnumSystemStoreLocation(dwflags: UInt, pvarg: Long, pfnenum: PFN_CERT_ENUM_SYSTEM_STORE_LOCATION): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertEnumSystemStoreLocation(dwflags.toInt(), pvarg.toString(), pfnenum.toLong().toString()) as Int) else 0

public actual fun CertFindAttribute(pszobjid: PCSTR, cattr: UInt, rgattr: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindAttribute(pszobjid.toString(), cattr.toInt(), rgattr.toString()) as String).toLong() else 0L

public actual fun CertFindCRLInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: Long, pprevcrlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindCRLInStore(hcertstore.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.toString(), pprevcrlcontext.toString()) as String).toLong() else 0L

public actual fun CertFindCTLInStore(hcertstore: HCERTSTORE, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CERT_FIND_TYPE, pvfindpara: Long, pprevctlcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindCTLInStore(hcertstore.toString(), dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.toString(), pprevctlcontext.toString()) as String).toLong() else 0L

public actual fun CertFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: UInt, pvreserved: Long, ppcrlentry: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindCertificateInCRL(pcert.toString(), pcrlcontext.toString(), dwflags.toInt(), pvreserved.toString(), ppcrlentry.toString()) as Int) else 0

public actual fun CertFindCertificateInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: UInt, dwfindtype: CERT_FIND_FLAGS, pvfindpara: Long, pprevcertcontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindCertificateInStore(hcertstore.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.toString(), pprevcertcontext.toString()) as String).toLong() else 0L

public actual fun CertFindChainInStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwfindflags: CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype: UInt, pvfindpara: Long, pprevchaincontext: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindChainInStore(hcertstore.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.toString(), pprevchaincontext.toString()) as String).toLong() else 0L

public actual fun CertFindExtension(pszobjid: PCSTR, cextensions: UInt, rgextensions: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindExtension(pszobjid.toString(), cextensions.toInt(), rgextensions.toString()) as String).toLong() else 0L

public actual fun CertFindRDNAttr(pszobjid: PCSTR, pname: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindRDNAttr(pszobjid.toString(), pname.toString()) as String).toLong() else 0L

public actual fun CertFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, pctlcontext: Long, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.toString(), pctlcontext.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CertFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: UInt, pvreserved: Long, pencodedattributes: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFindSubjectInSortedCTL(psubjectidentifier.toString(), pctlcontext.toString(), dwflags.toInt(), pvreserved.toString(), pencodedattributes.toString()) as Int) else 0

public actual fun CertFreeCRLContext(pcrlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCRLContext(pcrlcontext.toString()) as Int) else 0

public actual fun CertFreeCTLContext(pctlcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCTLContext(pctlcontext.toString()) as Int) else 0

public actual fun CertFreeCertificateChain(pchaincontext: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCertificateChain(pchaincontext.toString())
    }
}

public actual fun CertFreeCertificateChainEngine(hchainengine: HCERTCHAINENGINE) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainEngine(hchainengine.toString())
    }
}

public actual fun CertFreeCertificateChainList(prgpselection: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCertificateChainList(prgpselection.toString())
    }
}

public actual fun CertFreeCertificateContext(pcertcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeCertificateContext(pcertcontext.toString()) as Int) else 0

public actual fun CertFreeServerOcspResponseContext(pserverocspresponsecontext: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertFreeServerOcspResponseContext(pserverocspresponsecontext.toString())
    }
}

public actual fun CertGetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetCRLContextProperty(pcrlcontext.toString(), dwpropid.toInt(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CertGetCRLFromStore(hcertstore: HCERTSTORE, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetCRLFromStore(hcertstore.toString(), pissuercontext.toString(), pprevcrlcontext.toString(), pdwflags.toString()) as String).toLong() else 0L

public actual fun CertGetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetCTLContextProperty(pctlcontext.toString(), dwpropid.toInt(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CertGetCertificateChain(hchainengine: HCERTCHAINENGINE, pcertcontext: Long, ptime: Long, hadditionalstore: HCERTSTORE, pchainpara: Long, dwflags: UInt, pvreserved: Long, ppchaincontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetCertificateChain(hchainengine.toString(), pcertcontext.toString(), ptime.toString(), hadditionalstore.toString(), pchainpara.toString(), dwflags.toInt(), pvreserved.toString(), ppchaincontext.toString()) as Int) else 0

public actual fun CertGetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetCertificateContextProperty(pcertcontext.toString(), dwpropid.toInt(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CertGetEnhancedKeyUsage(pcertcontext: Long, dwflags: UInt, pusage: Long, pcbusage: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetEnhancedKeyUsage(pcertcontext.toString(), dwflags.toInt(), pusage.toString(), pcbusage.toString()) as Int) else 0

public actual fun CertGetIntendedKeyUsage(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetIntendedKeyUsage(dwcertencodingtype.toInt(), pcertinfo.toString(), pbkeyusage.toString(), cbkeyusage.toInt()) as Int) else 0

public actual fun CertGetIssuerCertificateFromStore(hcertstore: HCERTSTORE, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetIssuerCertificateFromStore(hcertstore.toString(), psubjectcontext.toString(), pprevissuercontext.toString(), pdwflags.toString()) as String).toLong() else 0L

public actual fun CertGetNameStringA(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PSTR, cchnamestring: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetNameStringA(pcertcontext.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.toString(), psznamestring.toString(), cchnamestring.toInt()) as Int).toUInt() else 0u

public actual fun CertGetNameStringW(pcertcontext: Long, dwtype: UInt, dwflags: UInt, pvtypepara: Long, psznamestring: PWSTR, cchnamestring: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetNameStringW(pcertcontext.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.toString(), psznamestring.toString(), cchnamestring.toInt()) as Int).toUInt() else 0u

public actual fun CertGetPublicKeyLength(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppublickey: Long): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetPublicKeyLength(dwcertencodingtype.toInt(), ppublickey.toString()) as Int).toUInt() else 0u

public actual fun CertGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: UInt, pvreserved: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetServerOcspResponseContext(hserverocspresponse.toString(), dwflags.toInt(), pvreserved.toString()) as String).toLong() else 0L

public actual fun CertGetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetStoreProperty(hcertstore.toString(), dwpropid.toInt(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CertGetSubjectCertificateFromStore(hcertstore: HCERTSTORE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetSubjectCertificateFromStore(hcertstore.toString(), dwcertencodingtype.toInt(), pcertid.toString()) as String).toLong() else 0L

public actual fun CertGetValidUsages(ccerts: UInt, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertGetValidUsages(ccerts.toInt(), rghcerts.toString(), cnumoids.toString(), rghoids.toString(), pcboids.toString()) as Int) else 0

public actual fun CertIsRDNAttrsInCertificateName(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwflags: UInt, pcertname: Long, prdn: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), pcertname.toString(), prdn.toString()) as Int) else 0

public actual fun CertIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: PCWSTR, psigningcert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertIsStrongHashToSign(pstrongsignpara.toString(), pwszcnghashalgid.toString(), psigningcert.toString()) as Int) else 0

public actual fun CertIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertIsValidCRLForCertificate(pcert.toString(), pcrl.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CertIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: PCWSTR, dwchainflags: UInt, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: PCWSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertIsWeakHash(dwhashusetype.toInt(), pwszcnghashalgid.toString(), dwchainflags.toInt(), psignerchaincontext.toString(), ptimestamp.toString(), pwszfilename.toString()) as Int) else 0

public actual fun CertNameToStrA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PSTR, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertNameToStrA(dwcertencodingtype.toInt(), pname.toString(), dwstrtype.toInt(), psz.toString(), csz.toInt()) as Int).toUInt() else 0u

public actual fun CertNameToStrW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pname: Long, dwstrtype: CERT_STRING_TYPE, psz: PWSTR, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertNameToStrW(dwcertencodingtype.toInt(), pname.toString(), dwstrtype.toInt(), psz.toString(), csz.toInt()) as Int).toUInt() else 0u

public actual fun CertOIDToAlgId(pszobjid: PCSTR): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertOIDToAlgId(pszobjid.toString()) as Int).toUInt() else 0u

public actual fun CertOpenServerOcspResponse(pchaincontext: Long, dwflags: UInt, popenpara: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertOpenServerOcspResponse(pchaincontext.toString(), dwflags.toInt(), popenpara.toString()) as String).toLong() else 0L

public actual fun CertOpenStore(lpszstoreprovider: PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: Long): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertOpenStore(lpszstoreprovider.toString(), dwencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pvpara.toString()) as String).toLong() else 0L

public actual fun CertOpenSystemStoreA(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCSTR): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreA(hprov.toString(), szsubsystemprotocol.toString()) as String).toLong() else 0L

public actual fun CertOpenSystemStoreW(hprov: HCRYPTPROV_LEGACY, szsubsystemprotocol: PCWSTR): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertOpenSystemStoreW(hprov.toString(), szsubsystemprotocol.toString()) as String).toLong() else 0L

public actual fun CertRDNValueToStrA(dwvaluetype: UInt, pvalue: Long, psz: PSTR, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRDNValueToStrA(dwvaluetype.toInt(), pvalue.toString(), psz.toString(), csz.toInt()) as Int).toUInt() else 0u

public actual fun CertRDNValueToStrW(dwvaluetype: UInt, pvalue: Long, psz: PWSTR, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRDNValueToStrW(dwvaluetype.toInt(), pvalue.toString(), psz.toString(), csz.toInt()) as Int).toUInt() else 0u

public actual fun CertRegisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR, pstoreinfo: Long, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRegisterPhysicalStore(pvsystemstore.toString(), dwflags.toInt(), pwszstorename.toString(), pstoreinfo.toString(), pvreserved.toString()) as Int) else 0

public actual fun CertRegisterSystemStore(pvsystemstore: Long, dwflags: UInt, pstoreinfo: Long, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRegisterSystemStore(pvsystemstore.toString(), dwflags.toInt(), pstoreinfo.toString(), pvreserved.toString()) as Int) else 0

public actual fun CertRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: PCSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRemoveEnhancedKeyUsageIdentifier(pcertcontext.toString(), pszusageidentifier.toString()) as Int) else 0

public actual fun CertRemoveStoreFromCollection(hcollectionstore: HCERTSTORE, hsiblingstore: HCERTSTORE) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRemoveStoreFromCollection(hcollectionstore.toString(), hsiblingstore.toString())
    }
}

public actual fun CertResyncCertificateChainEngine(hchainengine: HCERTCHAINENGINE): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertResyncCertificateChainEngine(hchainengine.toString()) as Int) else 0

public actual fun CertRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertRetrieveLogoOrBiometricInfo(pcertcontext.toString(), lpszlogoorbiometrictype.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), pvreserved.toString(), ppbdata.toString(), pcbdata.toString(), ppwszmimetype.toString()) as Int) else 0

public actual fun CertSaveStore(hcertstore: HCERTSTORE, dwencodingtype: CERT_QUERY_ENCODING_TYPE, dwsaveas: CERT_STORE_SAVE_AS, dwsaveto: CERT_STORE_SAVE_TO, pvsavetopara: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSaveStore(hcertstore.toString(), dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), pvsavetopara.toString(), dwflags.toInt()) as Int) else 0

public actual fun CertSelectCertificateChains(pselectioncontext: Long, dwflags: UInt, pchainparameters: Long, ccriteria: UInt, rgpcriteria: Long, hstore: HCERTSTORE, pcselection: Long, pprgpselection: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSelectCertificateChains(pselectioncontext.toString(), dwflags.toInt(), pchainparameters.toString(), ccriteria.toInt(), rgpcriteria.toString(), hstore.toString(), pcselection.toString(), pprgpselection.toString()) as Int) else 0

public actual fun CertSerializeCRLStoreElement(pcrlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSerializeCRLStoreElement(pcrlcontext.toString(), dwflags.toInt(), pbelement.toString(), pcbelement.toString()) as Int) else 0

public actual fun CertSerializeCTLStoreElement(pctlcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSerializeCTLStoreElement(pctlcontext.toString(), dwflags.toInt(), pbelement.toString(), pcbelement.toString()) as Int) else 0

public actual fun CertSerializeCertificateStoreElement(pcertcontext: Long, dwflags: UInt, pbelement: Long, pcbelement: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSerializeCertificateStoreElement(pcertcontext.toString(), dwflags.toInt(), pbelement.toString(), pcbelement.toString()) as Int) else 0

public actual fun CertSetCRLContextProperty(pcrlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetCRLContextProperty(pcrlcontext.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.toString()) as Int) else 0

public actual fun CertSetCTLContextProperty(pctlcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetCTLContextProperty(pctlcontext.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.toString()) as Int) else 0

public actual fun CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext.toString(), pctlentry.toString(), dwflags.toInt()) as Int) else 0

public actual fun CertSetCertificateContextProperty(pcertcontext: Long, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetCertificateContextProperty(pcertcontext.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.toString()) as Int) else 0

public actual fun CertSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetEnhancedKeyUsage(pcertcontext.toString(), pusage.toString()) as Int) else 0

public actual fun CertSetStoreProperty(hcertstore: HCERTSTORE, dwpropid: UInt, dwflags: UInt, pvdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertSetStoreProperty(hcertstore.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.toString()) as Int) else 0

public actual fun CertStrToNameA(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertStrToNameA(dwcertencodingtype.toInt(), pszx500.toString(), dwstrtype.toInt(), pvreserved.toString(), pbencoded.toString(), pcbencoded.toString(), ppszerror.toString()) as Int) else 0

public actual fun CertStrToNameW(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszx500: PCWSTR, dwstrtype: CERT_STRING_TYPE, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertStrToNameW(dwcertencodingtype.toInt(), pszx500.toString(), dwstrtype.toInt(), pvreserved.toString(), pbencoded.toString(), pcbencoded.toString(), ppszerror.toString()) as Int) else 0

public actual fun CertUnregisterPhysicalStore(pvsystemstore: Long, dwflags: UInt, pwszstorename: PCWSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertUnregisterPhysicalStore(pvsystemstore.toString(), dwflags.toInt(), pwszstorename.toString()) as Int) else 0

public actual fun CertUnregisterSystemStore(pvsystemstore: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertUnregisterSystemStore(pvsystemstore.toString(), dwflags.toInt()) as Int) else 0

public actual fun CertVerifyCRLRevocation(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pcertid: Long, ccrlinfo: UInt, rgpcrlinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyCRLRevocation(dwcertencodingtype.toInt(), pcertid.toString(), ccrlinfo.toInt(), rgpcrlinfo.toString()) as Int) else 0

public actual fun CertVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyCRLTimeValidity(ptimetoverify.toString(), pcrlinfo.toString()) as Int) else 0

public actual fun CertVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: Long, psubjectusage: Long, dwflags: UInt, pverifyusagepara: Long, pverifyusagestatus: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.toString(), psubjectusage.toString(), dwflags.toInt(), pverifyusagepara.toString(), pverifyusagestatus.toString()) as Int) else 0

public actual fun CertVerifyCertificateChainPolicy(pszpolicyoid: PCSTR, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyCertificateChainPolicy(pszpolicyoid.toString(), pchaincontext.toString(), ppolicypara.toString(), ppolicystatus.toString()) as Int) else 0

public actual fun CertVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: Long, dwflags: UInt, prevpara: Long, prevstatus: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), rgpvcontext.toString(), dwflags.toInt(), prevpara.toString(), prevstatus.toString()) as Int) else 0

public actual fun CertVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifySubjectCertificateContext(psubject.toString(), pissuer.toString(), pdwflags.toString()) as Int) else 0

public actual fun CertVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyTimeValidity(ptimetoverify.toString(), pcertinfo.toString()) as Int) else 0

public actual fun CertVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CertVerifyValidityNesting(psubjectinfo.toString(), pissuerinfo.toString()) as Int) else 0

public actual fun CloseCryptoHandle(hcrypto: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CloseCryptoHandle(hcrypto.toString()) as Int) else 0

public actual fun CryptAcquireCertificatePrivateKey(pcert: Long, dwflags: CRYPT_ACQUIRE_FLAGS, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptAcquireCertificatePrivateKey(pcert.toString(), dwflags.toInt(), pvparameters.toString(), phcryptprovorncryptkey.toString(), pdwkeyspec.toString(), pfcallerfreeprovorncryptkey.toString()) as Int) else 0

public actual fun CryptAcquireContextA(phprov: Long, szcontainer: PCSTR, szprovider: PCSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptAcquireContextA(phprov.toString(), szcontainer.toString(), szprovider.toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CryptAcquireContextW(phprov: Long, szcontainer: PCWSTR, szprovider: PCWSTR, dwprovtype: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptAcquireContextW(phprov.toString(), szcontainer.toString(), szprovider.toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CryptBinaryToStringA(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PSTR, pcchstring: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptBinaryToStringA(pbbinary.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.toString(), pcchstring.toString()) as Int) else 0

public actual fun CryptBinaryToStringW(pbbinary: Long, cbbinary: UInt, dwflags: CRYPT_STRING, pszstring: PWSTR, pcchstring: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptBinaryToStringW(pbbinary.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.toString(), pcchstring.toString()) as Int) else 0

public actual fun CryptCloseAsyncHandle(hasync: HCRYPTASYNC): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptCloseAsyncHandle(hasync.toString()) as Int) else 0

public actual fun CryptContextAddRef(hprov: ULong, pdwreserved: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptContextAddRef(hprov.toString(), pdwreserved.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptCreateAsyncHandle(dwflags: UInt, phasync: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptCreateAsyncHandle(dwflags.toInt(), phasync.toString()) as Int) else 0

public actual fun CryptCreateHash(hprov: ULong, algid: ALG_ID, hkey: ULong, dwflags: UInt, phhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptCreateHash(hprov.toString(), algid.toInt(), hkey.toString(), dwflags.toInt(), phhash.toString()) as Int) else 0

public actual fun CryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpubkeyoid: PCSTR, ppubkeystruc: Long, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: Long, pbhash: Long, pcbhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), pszpubkeyoid.toString(), ppubkeystruc.toString(), cbpubkeystruc.toInt(), dwflags.toInt(), pvreserved.toString(), pbhash.toString(), pcbhash.toString()) as Int) else 0

public actual fun CryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencodedblob: Long, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecodeMessage(dwmsgtypeflags.toInt(), pdecryptpara.toString(), pverifypara.toString(), dwsignerindex.toInt(), pbencodedblob.toString(), cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), pdwmsgtype.toString(), pdwinnercontenttype.toString(), pbdecoded.toString(), pcbdecoded.toString(), ppxchgcert.toString(), ppsignercert.toString()) as Int) else 0

public actual fun CryptDecodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecodeObject(dwcertencodingtype.toInt(), lpszstructtype.toString(), pbencoded.toString(), cbencoded.toInt(), dwflags.toInt(), pvstructinfo.toString(), pcbstructinfo.toString()) as Int) else 0

public actual fun CryptDecodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, dwflags: UInt, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.toString(), pbencoded.toString(), cbencoded.toInt(), dwflags.toInt(), pdecodepara.toString(), pvstructinfo.toString(), pcbstructinfo.toString()) as Int) else 0

public actual fun CryptDecrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.toString(), pdwdatalen.toString()) as Int) else 0

public actual fun CryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: UInt, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecryptAndVerifyMessageSignature(pdecryptpara.toString(), pverifypara.toString(), dwsignerindex.toInt(), pbencryptedblob.toString(), cbencryptedblob.toInt(), pbdecrypted.toString(), pcbdecrypted.toString(), ppxchgcert.toString(), ppsignercert.toString()) as Int) else 0

public actual fun CryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: UInt, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDecryptMessage(pdecryptpara.toString(), pbencryptedblob.toString(), cbencryptedblob.toInt(), pbdecrypted.toString(), pcbdecrypted.toString(), ppxchgcert.toString()) as Int) else 0

public actual fun CryptDeriveKey(hprov: ULong, algid: ALG_ID, hbasedata: ULong, dwflags: UInt, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDeriveKey(hprov.toString(), algid.toInt(), hbasedata.toString(), dwflags.toInt(), phkey.toString()) as Int) else 0

public actual fun CryptDestroyHash(hhash: ULong): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDestroyHash(hhash.toString()) as Int) else 0

public actual fun CryptDestroyKey(hkey: ULong): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDestroyKey(hkey.toString()) as Int) else 0

public actual fun CryptDuplicateHash(hhash: ULong, pdwreserved: Long, dwflags: UInt, phhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDuplicateHash(hhash.toString(), pdwreserved.toString(), dwflags.toInt(), phhash.toString()) as Int) else 0

public actual fun CryptDuplicateKey(hkey: ULong, pdwreserved: Long, dwflags: UInt, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptDuplicateKey(hkey.toString(), pdwreserved.toString(), dwflags.toInt(), phkey.toString()) as Int) else 0

public actual fun CryptEncodeObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEncodeObject(dwcertencodingtype.toInt(), lpszstructtype.toString(), pvstructinfo.toString(), pbencoded.toString(), pcbencoded.toString()) as Int) else 0

public actual fun CryptEncodeObjectEx(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, dwflags: CRYPT_ENCODE_OBJECT_FLAGS, pencodepara: Long, pvencoded: Long, pcbencoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEncodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.toString(), pvstructinfo.toString(), dwflags.toInt(), pencodepara.toString(), pvencoded.toString(), pcbencoded.toString()) as Int) else 0

public actual fun CryptEncrypt(hkey: ULong, hhash: ULong, final: BOOL, dwflags: UInt, pbdata: Long, pdwdatalen: Long, dwbuflen: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEncrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.toString(), pdwdatalen.toString(), dwbuflen.toInt()) as Int) else 0

public actual fun CryptEncryptMessage(pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: UInt, pbencryptedblob: Long, pcbencryptedblob: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEncryptMessage(pencryptpara.toString(), crecipientcert.toInt(), rgprecipientcert.toString(), pbtobeencrypted.toString(), cbtobeencrypted.toInt(), pbencryptedblob.toString(), pcbencryptedblob.toString()) as Int) else 0

public actual fun CryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvarg: Long, pfnenum: PFN_CRYPT_ENUM_KEYID_PROP): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumKeyIdentifierProperties(pkeyidentifier.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.toString(), pvreserved.toString(), pvarg.toString(), pfnenum.toLong().toString()) as Int) else 0

public actual fun CryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, dwflags: UInt, pvarg: Long, pfnenumoidfunc: PFN_CRYPT_ENUM_OID_FUNC): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumOIDFunction(dwencodingtype.toInt(), pszfuncname.toString(), pszoid.toString(), dwflags.toInt(), pvarg.toString(), pfnenumoidfunc.toLong().toString()) as Int) else 0

public actual fun CryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumoidinfo: PFN_CRYPT_ENUM_OID_INFO): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.toString(), pfnenumoidinfo.toLong().toString()) as Int) else 0

public actual fun CryptEnumProviderTypesA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PSTR, pcbtypename: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesA(dwindex.toInt(), pdwreserved.toString(), dwflags.toInt(), pdwprovtype.toString(), sztypename.toString(), pcbtypename.toString()) as Int) else 0

public actual fun CryptEnumProviderTypesW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, sztypename: PWSTR, pcbtypename: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumProviderTypesW(dwindex.toInt(), pdwreserved.toString(), dwflags.toInt(), pdwprovtype.toString(), sztypename.toString(), pcbtypename.toString()) as Int) else 0

public actual fun CryptEnumProvidersA(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PSTR, pcbprovname: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumProvidersA(dwindex.toInt(), pdwreserved.toString(), dwflags.toInt(), pdwprovtype.toString(), szprovname.toString(), pcbprovname.toString()) as Int) else 0

public actual fun CryptEnumProvidersW(dwindex: UInt, pdwreserved: Long, dwflags: UInt, pdwprovtype: Long, szprovname: PWSTR, pcbprovname: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptEnumProvidersW(dwindex.toInt(), pdwreserved.toString(), dwflags.toInt(), pdwprovtype.toString(), szprovname.toString(), pcbprovname.toString()) as Int) else 0

public actual fun CryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CRYPT_KEY_FLAGS, pbdata: Long, pdwdatalen: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptExportKey(hkey.toString(), hexpkey.toString(), dwblobtype.toInt(), dwflags.toInt(), pbdata.toString(), pdwdatalen.toString()) as Int) else 0

public actual fun CryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptExportPKCS8(hcryptprov.toString(), dwkeyspec.toInt(), pszprivatekeyobjid.toString(), dwflags.toInt(), pvauxinfo.toString(), pbprivatekeyblob.toString(), pcbprivatekeyblob.toString()) as Int) else 0

public actual fun CryptExportPublicKeyInfo(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pcbinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfo(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pinfo.toString(), pcbinfo.toString()) as Int) else 0

public actual fun CryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pszpublickeyobjid.toString(), dwflags.toInt(), pvauxinfo.toString(), pinfo.toString(), pcbinfo.toString()) as Int) else 0

public actual fun CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: PCSTR, dwflags: UInt, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey.toString(), dwcertencodingtype.toInt(), pszpublickeyobjid.toString(), dwflags.toInt(), pvauxinfo.toString(), pinfo.toString(), pcbinfo.toString()) as Int) else 0

public actual fun CryptFindCertificateKeyProvInfo(pcert: Long, dwflags: CRYPT_FIND_FLAGS, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptFindCertificateKeyProvInfo(pcert.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CryptFindLocalizedName(pwszcryptname: PCWSTR): PCWSTR =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptFindLocalizedName(pwszcryptname.toString()) as String).toLong() else 0L

public actual fun CryptFindOIDInfo(dwkeytype: UInt, pvkey: Long, dwgroupid: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptFindOIDInfo(dwkeytype.toInt(), pvkey.toString(), dwgroupid.toInt()) as String).toLong() else 0L

public actual fun CryptFormatObject(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: Long, lpszstructtype: PCSTR, pbencoded: Long, cbencoded: UInt, pbformat: Long, pcbformat: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), pformatstruct.toString(), lpszstructtype.toString(), pbencoded.toString(), cbencoded.toInt(), pbformat.toString(), pcbformat.toString()) as Int) else 0

public actual fun CryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptFreeOIDFunctionAddress(hfuncaddr.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptGenKey(hprov: ULong, algid: ALG_ID, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGenKey(hprov.toString(), algid.toInt(), dwflags.toInt(), phkey.toString()) as Int) else 0

public actual fun CryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGenRandom(hprov.toString(), dwlen.toInt(), pbbuffer.toString()) as Int) else 0

public actual fun CryptGetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, ppvparam: Long, ppfnfree: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetAsyncParam(hasync.toString(), pszparamoid.toString(), ppvparam.toString(), ppfnfree.toString()) as Int) else 0

public actual fun CryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: UInt, pwszdlllist: PWSTR, pcchdlllist: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDDllList(hfuncset.toString(), dwencodingtype.toInt(), pwszdlllist.toString(), pcchdlllist.toString()) as Int) else 0

public actual fun CryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pwszdll: PCWSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetDefaultOIDFunctionAddress(hfuncset.toString(), dwencodingtype.toInt(), pwszdll.toString(), dwflags.toInt(), ppvfuncaddr.toString(), phfuncaddr.toString()) as Int) else 0

public actual fun CryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PSTR, pcbprovname: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderA(dwprovtype.toInt(), pdwreserved.toString(), dwflags.toInt(), pszprovname.toString(), pcbprovname.toString()) as Int) else 0

public actual fun CryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: Long, dwflags: UInt, pszprovname: PWSTR, pcbprovname: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetDefaultProviderW(dwprovtype.toInt(), pdwreserved.toString(), dwflags.toInt(), pszprovname.toString(), pcbprovname.toString()) as Int) else 0

public actual fun CryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetHashParam(hhash.toString(), dwparam.toInt(), pbdata.toString(), pdwdatalen.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetKeyIdentifierProperty(pkeyidentifier.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.toString(), pvreserved.toString(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CryptGetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.toString(), pdwdatalen.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, dwflags: UInt, pbsignedblob: Long, cbsignedblob: UInt): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pbsignedblob.toString(), cbsignedblob.toInt()) as String).toLong() else 0L

public actual fun CryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: Long, cbsignedblob: UInt): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetMessageSignerCount(dwmsgencodingtype.toInt(), pbsignedblob.toString(), cbsignedblob.toInt()) as Int) else 0

public actual fun CryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: UInt, pszoid: PCSTR, dwflags: UInt, ppvfuncaddr: Long, phfuncaddr: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionAddress(hfuncset.toString(), dwencodingtype.toInt(), pszoid.toString(), dwflags.toInt(), ppvfuncaddr.toString(), phfuncaddr.toString()) as Int) else 0

public actual fun CryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.toString(), pszoid.toString(), pwszvaluename.toString(), pdwvaluetype.toString(), pbvaluedata.toString(), pcbvaluedata.toString()) as Int) else 0

public actual fun CryptGetObjectUrl(pszurloid: PCSTR, pvpara: Long, dwflags: CRYPT_GET_URL_FLAGS, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetObjectUrl(pszurloid.toString(), pvpara.toString(), dwflags.toInt(), purlarray.toString(), pcburlarray.toString(), purlinfo.toString(), pcburlinfo.toString(), pvreserved.toString()) as Int) else 0

public actual fun CryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: Long, pdwdatalen: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetProvParam(hprov.toString(), dwparam.toInt(), pbdata.toString(), pdwdatalen.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptGetUserKey(hprov.toString(), dwkeyspec.toInt(), phuserkey.toString()) as Int) else 0

public actual fun CryptHashCertificate(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashCertificate(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), pbencoded.toString(), cbencoded.toInt(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptHashCertificate2(pwszcnghashalgid: PCWSTR, dwflags: UInt, pvreserved: Long, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashCertificate2(pwszcnghashalgid.toString(), dwflags.toInt(), pvreserved.toString(), pbencoded.toString(), cbencoded.toInt(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptHashData(hhash: ULong, pbdata: Long, dwdatalen: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashData(hhash.toString(), pbdata.toString(), dwdatalen.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CryptHashMessage(phashpara: Long, fdetachedhash: BOOL, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashMessage(phashpara.toString(), fdetachedhash, ctobehashed.toInt(), rgpbtobehashed.toString(), rgcbtobehashed.toString(), pbhashedblob.toString(), pcbhashedblob.toString(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptHashPublicKeyInfo(hcryptprov: HCRYPTPROV_LEGACY, algid: ALG_ID, dwflags: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashPublicKeyInfo(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), pinfo.toString(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashSessionKey(hhash.toString(), hkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptHashToBeSigned(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptHashToBeSigned(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.toString(), cbencoded.toInt(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptImportKey(hprov: ULong, pbdata: Long, dwdatalen: UInt, hpubkey: ULong, dwflags: CRYPT_KEY_FLAGS, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptImportKey(hprov.toString(), pbdata.toString(), dwdatalen.toInt(), hpubkey.toString(), dwflags.toInt(), phkey.toString()) as Int) else 0

public actual fun CryptImportPKCS8(sprivatekeyandparams: CRYPT_PKCS8_IMPORT_PARAMS, dwflags: CRYPT_KEY_FLAGS, phcryptprov: Long, pvauxinfo: Long): BOOL =
    0

public actual fun CryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfo(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.toString(), phkey.toString()) as Int) else 0

public actual fun CryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, aikeyalg: ALG_ID, dwflags: UInt, pvauxinfo: Long, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.toString(), aikeyalg.toInt(), dwflags.toInt(), pvauxinfo.toString(), phkey.toString()) as Int) else 0

public actual fun CryptImportPublicKeyInfoEx2(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: Long, dwflags: CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo: Long, phkey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), pinfo.toString(), dwflags.toInt(), pvauxinfo.toString(), phkey.toString()) as Int) else 0

public actual fun CryptInitOIDFunctionSet(pszfuncname: PCSTR, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptInitOIDFunctionSet(pszfuncname.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CryptInstallCancelRetrieval(pfncancel: PFN_CRYPT_CANCEL_RETRIEVAL, pvarg: Long, dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptInstallCancelRetrieval(pfncancel.toLong().toString(), pvarg.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara: Long, dwflags: CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved: Long, phdefaultcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptInstallDefaultContext(hcryptprov.toString(), dwdefaulttype.toInt(), pvdefaultpara.toString(), dwflags.toInt(), pvreserved.toString(), phdefaultcontext.toString()) as Int) else 0

public actual fun CryptInstallOIDFunctionAddress(hmodule: HMODULE, dwencodingtype: UInt, pszfuncname: PCSTR, cfuncentry: UInt, rgfuncentry: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptInstallOIDFunctionAddress(hmodule.toString(), dwencodingtype.toInt(), pszfuncname.toString(), cfuncentry.toInt(), rgfuncentry.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptMemAlloc(cbsize: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMemAlloc(cbsize.toInt()) as String).toLong() else 0L

public actual fun CryptMemFree(pv: Long) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMemFree(pv.toString())
    }
}

public actual fun CryptMemRealloc(pv: Long, cbsize: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMemRealloc(pv.toString(), cbsize.toInt()) as String).toLong() else 0L

public actual fun CryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, cbdata: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.toString(), pszinnercontentobjid.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun CryptMsgClose(hcryptmsg: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgClose(hcryptmsg.toString()) as Int) else 0

public actual fun CryptMsgControl(hcryptmsg: Long, dwflags: UInt, dwctrltype: UInt, pvctrlpara: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgControl(hcryptmsg.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.toString()) as Int) else 0

public actual fun CryptMsgCountersign(hcryptmsg: Long, dwindex: UInt, ccountersigners: UInt, rgcountersigners: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgCountersign(hcryptmsg.toString(), dwindex.toInt(), ccountersigners.toInt(), rgcountersigners.toString()) as Int) else 0

public actual fun CryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgCountersignEncoded(dwencodingtype.toInt(), pbsignerinfo.toString(), cbsignerinfo.toInt(), ccountersigners.toInt(), rgcountersigners.toString(), pbcountersignature.toString(), pcbcountersignature.toString()) as Int) else 0

public actual fun CryptMsgDuplicate(hcryptmsg: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgDuplicate(hcryptmsg.toString()) as String).toLong() else 0L

public actual fun CryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: Long, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), pctlinfo.toString(), psigninfo.toString(), dwflags.toInt(), pbencoded.toString(), pcbencoded.toString()) as Int) else 0

public actual fun CryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: UInt, rghsignerstore: Long, dwflags: UInt, ppsigner: Long, pdwsignerindex: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgGetAndVerifySigner(hcryptmsg.toString(), csignerstore.toInt(), rghsignerstore.toString(), dwflags.toInt(), ppsigner.toString(), pdwsignerindex.toString()) as Int) else 0

public actual fun CryptMsgGetParam(hcryptmsg: Long, dwparamtype: UInt, dwindex: UInt, pvdata: Long, pcbdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgGetParam(hcryptmsg.toString(), dwparamtype.toInt(), dwindex.toInt(), pvdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun CryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HCRYPTPROV_LEGACY, precipientinfo: Long, pstreaminfo: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toString(), precipientinfo.toString(), pstreaminfo.toString()) as String).toLong() else 0L

public actual fun CryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CRYPT_MSG_TYPE, pvmsgencodeinfo: Long, pszinnercontentobjid: PCSTR, pstreaminfo: Long): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.toString(), pszinnercontentobjid.toString(), pstreaminfo.toString()) as String).toLong() else 0L

public actual fun CryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: Long, cbctlcontent: UInt, psigninfo: Long, dwflags: UInt, pbencoded: Long, pcbencoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgSignCTL(dwmsgencodingtype.toInt(), pbctlcontent.toString(), cbctlcontent.toInt(), psigninfo.toString(), dwflags.toInt(), pbencoded.toString(), pcbencoded.toString()) as Int) else 0

public actual fun CryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: UInt, ffinal: BOOL): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgUpdate(hcryptmsg.toString(), pbdata.toString(), cbdata.toInt(), ffinal) as Int) else 0

public actual fun CryptMsgVerifyCountersignatureEncoded(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, pcicountersigner: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncoded(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.toString(), cbsignerinfocountersignature.toInt(), pcicountersigner.toString()) as Int) else 0

public actual fun CryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HCRYPTPROV_LEGACY, dwencodingtype: UInt, pbsignerinfo: Long, cbsignerinfo: UInt, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: Long, dwflags: UInt, pvextra: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.toString(), cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), pvsigner.toString(), dwflags.toInt(), pvextra.toString()) as Int) else 0

public actual fun CryptProtectData(pdatain: Long, szdatadescr: PCWSTR, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptProtectData(pdatain.toString(), szdatadescr.toString(), poptionalentropy.toString(), pvreserved.toString(), ppromptstruct.toString(), dwflags.toInt(), pdataout.toString()) as Int) else 0

public actual fun CryptProtectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptProtectMemory(pdatain.toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CryptQueryObject(dwobjecttype: CERT_QUERY_OBJECT_TYPE, pvobject: Long, dwexpectedcontenttypeflags: CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags: CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags: UInt, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptQueryObject(dwobjecttype.toInt(), pvobject.toString(), dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), pdwmsgandcertencodingtype.toString(), pdwcontenttype.toString(), pdwformattype.toString(), phcertstore.toString(), phmsg.toString(), ppvcontext.toString()) as Int) else 0

public actual fun CryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, dwindex: UInt, pwszdll: PCWSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.toString(), dwindex.toInt(), pwszdll.toString()) as Int) else 0

public actual fun CryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszdll: PCWSTR, pszoverridefuncname: PCSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRegisterOIDFunction(dwencodingtype.toInt(), pszfuncname.toString(), pszoid.toString(), pwszdll.toString(), pszoverridefuncname.toString()) as Int) else 0

public actual fun CryptRegisterOIDInfo(pinfo: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRegisterOIDInfo(pinfo.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptReleaseContext(hprov: ULong, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptReleaseContext(hprov.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptRetrieveObjectByUrlA(pszurl: PCSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlA(pszurl.toString(), pszobjectoid.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.toString(), hasyncretrieve.toString(), pcredentials.toString(), pvverify.toString(), pauxinfo.toString()) as Int) else 0

public actual fun CryptRetrieveObjectByUrlW(pszurl: PCWSTR, pszobjectoid: PCSTR, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: Long, hasyncretrieve: HCRYPTASYNC, pcredentials: Long, pvverify: Long, pauxinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRetrieveObjectByUrlW(pszurl.toString(), pszobjectoid.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.toString(), hasyncretrieve.toString(), pcredentials.toString(), pvverify.toString(), pauxinfo.toString()) as Int) else 0

public actual fun CryptRetrieveTimeStamp(wszurl: PCWSTR, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: PCSTR, ppara: Long, pbdata: Long, cbdata: UInt, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptRetrieveTimeStamp(wszurl.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), pszhashid.toString(), ppara.toString(), pbdata.toString(), cbdata.toInt(), pptscontext.toString(), pptssigner.toString(), phstore.toString()) as Int) else 0

public actual fun CryptSetAsyncParam(hasync: HCRYPTASYNC, pszparamoid: PCSTR, pvparam: Long, pfnfree: PFN_CRYPT_ASYNC_PARAM_FREE_FUNC): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetAsyncParam(hasync.toString(), pszparamoid.toString(), pvparam.toString(), pfnfree.toLong().toString()) as Int) else 0

public actual fun CryptSetHashParam(hhash: ULong, dwparam: CRYPT_SET_HASH_PARAM, pbdata: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetHashParam(hhash.toString(), dwparam.toInt(), pbdata.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: UInt, dwflags: UInt, pwszcomputername: PCWSTR, pvreserved: Long, pvdata: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetKeyIdentifierProperty(pkeyidentifier.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.toString(), pvreserved.toString(), pvdata.toString()) as Int) else 0

public actual fun CryptSetKeyParam(hkey: ULong, dwparam: CRYPT_KEY_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR, pwszvaluename: PCWSTR, dwvaluetype: REG_VALUE_TYPE, pbvaluedata: Long, cbvaluedata: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.toString(), pszoid.toString(), pwszvaluename.toString(), dwvaluetype.toInt(), pbvaluedata.toString(), cbvaluedata.toInt()) as Int) else 0

public actual fun CryptSetProvParam(hprov: ULong, dwparam: CRYPT_SET_PROV_PARAM_ID, pbdata: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetProvParam(hprov.toString(), dwparam.toInt(), pbdata.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptSetProviderA(pszprovname: PCSTR, dwprovtype: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetProviderA(pszprovname.toString(), dwprovtype.toInt()) as Int) else 0

public actual fun CryptSetProviderExA(pszprovname: PCSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetProviderExA(pszprovname.toString(), dwprovtype.toInt(), pdwreserved.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptSetProviderExW(pszprovname: PCWSTR, dwprovtype: UInt, pdwreserved: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetProviderExW(pszprovname.toString(), dwprovtype.toInt(), pdwreserved.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptSetProviderW(pszprovname: PCWSTR, dwprovtype: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSetProviderW(pszprovname.toString(), dwprovtype.toInt()) as Int) else 0

public actual fun CryptSignAndEncodeCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, lpszstructtype: PCSTR, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignAndEncodeCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), lpszstructtype.toString(), pvstructinfo.toString(), psignaturealgorithm.toString(), pvhashauxinfo.toString(), pbencoded.toString(), pcbencoded.toString()) as Int) else 0

public actual fun CryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: UInt, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignAndEncryptMessage(psignpara.toString(), pencryptpara.toString(), crecipientcert.toInt(), rgprecipientcert.toString(), pbtobesignedandencrypted.toString(), cbtobesignedandencrypted.toInt(), pbsignedandencryptedblob.toString(), pcbsignedandencryptedblob.toString()) as Int) else 0

public actual fun CryptSignCertificate(hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: UInt, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned: Long, cbencodedtobesigned: UInt, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pbencodedtobesigned.toString(), cbencodedtobesigned.toInt(), psignaturealgorithm.toString(), pvhashauxinfo.toString(), pbsignature.toString(), pcbsignature.toString()) as Int) else 0

public actual fun CryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: PCSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignHashA(hhash.toString(), dwkeyspec.toInt(), szdescription.toString(), dwflags.toInt(), pbsignature.toString(), pdwsiglen.toString()) as Int) else 0

public actual fun CryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: PCWSTR, dwflags: UInt, pbsignature: Long, pdwsiglen: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignHashW(hhash.toString(), dwkeyspec.toInt(), szdescription.toString(), dwflags.toInt(), pbsignature.toString(), pdwsiglen.toString()) as Int) else 0

public actual fun CryptSignMessage(psignpara: Long, fdetachedsignature: BOOL, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignMessage(psignpara.toString(), fdetachedsignature, ctobesigned.toInt(), rgpbtobesigned.toString(), rgcbtobesigned.toString(), pbsignedblob.toString(), pcbsignedblob.toString()) as Int) else 0

public actual fun CryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: UInt, pbsignedblob: Long, pcbsignedblob: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptSignMessageWithKey(psignpara.toString(), pbtobesigned.toString(), cbtobesigned.toInt(), pbsignedblob.toString(), pcbsignedblob.toString()) as Int) else 0

public actual fun CryptStringToBinaryA(pszstring: PCSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptStringToBinaryA(pszstring.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.toString(), pcbbinary.toString(), pdwskip.toString(), pdwflags.toString()) as Int) else 0

public actual fun CryptStringToBinaryW(pszstring: PCWSTR, cchstring: UInt, dwflags: CRYPT_STRING, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptStringToBinaryW(pszstring.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.toString(), pcbbinary.toString(), pdwskip.toString(), pdwflags.toString()) as Int) else 0

public actual fun CryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUninstallCancelRetrieval(dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: UInt, pvreserved: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUninstallDefaultContext(hdefaultcontext.toString(), dwflags.toInt(), pvreserved.toString()) as Int) else 0

public actual fun CryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: UInt, pdataout: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUnprotectData(pdatain.toString(), ppszdatadescr.toString(), poptionalentropy.toString(), pvreserved.toString(), ppromptstruct.toString(), dwflags.toInt(), pdataout.toString()) as Int) else 0

public actual fun CryptUnprotectMemory(pdatain: Long, cbdatain: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUnprotectMemory(pdatain.toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else 0

public actual fun CryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pwszdll: PCWSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.toString(), pwszdll.toString()) as Int) else 0

public actual fun CryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: PCSTR, pszoid: PCSTR): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDFunction(dwencodingtype.toInt(), pszfuncname.toString(), pszoid.toString()) as Int) else 0

public actual fun CryptUnregisterOIDInfo(pinfo: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUnregisterOIDInfo(pinfo.toString()) as Int) else 0

public actual fun CryptUpdateProtectedState(poldsid: PSID, pwszoldpassword: PCWSTR, dwflags: UInt, pdwsuccesscount: Long, pdwfailurecount: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptUpdateProtectedState(poldsid.toString(), pwszoldpassword.toString(), dwflags.toInt(), pdwsuccesscount.toString(), pdwfailurecount.toString()) as Int) else 0

public actual fun CryptVerifyCertificateSignature(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pbencoded: Long, cbencoded: UInt, ppublickey: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignature(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.toString(), cbencoded.toInt(), ppublickey.toString()) as Int) else 0

public actual fun CryptVerifyCertificateSignatureEx(hcryptprov: HCRYPTPROV_LEGACY, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, dwsubjecttype: UInt, pvsubject: Long, dwissuertype: UInt, pvissuer: Long, dwflags: CRYPT_VERIFY_CERT_FLAGS, pvextra: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyCertificateSignatureEx(hcryptprov.toString(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.toString(), dwissuertype.toInt(), pvissuer.toString(), dwflags.toInt(), pvextra.toString()) as Int) else 0

public actual fun CryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageHash(phashpara.toString(), pbdetachedhashblob.toString(), cbdetachedhashblob.toInt(), ctobehashed.toInt(), rgpbtobehashed.toString(), rgcbtobehashed.toString(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbdetachedsignblob: Long, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyDetachedMessageSignature(pverifypara.toString(), dwsignerindex.toInt(), pbdetachedsignblob.toString(), cbdetachedsignblob.toInt(), ctobesigned.toInt(), rgpbtobesigned.toString(), rgcbtobesigned.toString(), ppsignercert.toString()) as Int) else 0

public actual fun CryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: UInt, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyMessageHash(phashpara.toString(), pbhashedblob.toString(), cbhashedblob.toInt(), pbtobehashed.toString(), pcbtobehashed.toString(), pbcomputedhash.toString(), pcbcomputedhash.toString()) as Int) else 0

public actual fun CryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: UInt, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignature(pverifypara.toString(), dwsignerindex.toInt(), pbsignedblob.toString(), cbsignedblob.toInt(), pbdecoded.toString(), pcbdecoded.toString(), ppsignercert.toString()) as Int) else 0

public actual fun CryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: UInt, pbdecoded: Long, pcbdecoded: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyMessageSignatureWithKey(pverifypara.toString(), ppublickeyinfo.toString(), pbsignedblob.toString(), cbsignedblob.toInt(), pbdecoded.toString(), pcbdecoded.toString()) as Int) else 0

public actual fun CryptVerifySignatureA(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifySignatureA(hhash.toString(), pbsignature.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptVerifySignatureW(hhash: ULong, pbsignature: Long, dwsiglen: UInt, hpubkey: ULong, szdescription: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifySignatureW(hhash.toString(), pbsignature.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.toString(), dwflags.toInt()) as Int) else 0

public actual fun CryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: UInt, pbdata: Long, cbdata: UInt, hadditionalstore: HCERTSTORE, pptscontext: Long, pptssigner: Long, phstore: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptVerifyTimeStampSignature(pbtscontentinfo.toString(), cbtscontentinfo.toInt(), pbdata.toString(), cbdata.toInt(), hadditionalstore.toString(), pptscontext.toString(), pptssigner.toString(), phstore.toString()) as Int) else 0

public actual fun CryptXmlAddObject(hsignatureorobject: Long, dwflags: UInt, rgproperty: Long, cproperty: UInt, pencoded: Long, ppobject: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlAddObject(hsignatureorobject.toString(), dwflags.toInt(), rgproperty.toString(), cproperty.toInt(), pencoded.toString(), ppobject.toString()) as Int) else 0

public actual fun CryptXmlClose(hcryptxml: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlClose(hcryptxml.toString()) as Int) else 0

public actual fun CryptXmlCreateReference(hcryptxml: Long, dwflags: UInt, wszid: PCWSTR, wszuri: PCWSTR, wsztype: PCWSTR, pdigestmethod: Long, ctransform: UInt, rgtransform: Long, phreference: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlCreateReference(hcryptxml.toString(), dwflags.toInt(), wszid.toString(), wszuri.toString(), wsztype.toString(), pdigestmethod.toString(), ctransform.toInt(), rgtransform.toString(), phreference.toString()) as Int) else 0

public actual fun CryptXmlDigestReference(hreference: Long, dwflags: UInt, pdataproviderin: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlDigestReference(hreference.toString(), dwflags.toInt(), pdataproviderin.toString()) as Int) else 0

public actual fun CryptXmlEncode(hcryptxml: Long, dwcharset: CRYPT_XML_CHARSET, rgproperty: Long, cproperty: UInt, pvcallbackstate: Long, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlEncode(hcryptxml.toString(), dwcharset, rgproperty.toString(), cproperty.toInt(), pvcallbackstate.toString(), pfnwrite.toLong().toString()) as Int) else 0

public actual fun CryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: Long, pfnenumalginfo: PFN_CRYPT_XML_ENUM_ALG_INFO): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.toString(), pfnenumalginfo.toLong().toString()) as Int) else 0

public actual fun CryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: Long, dwgroupid: UInt, dwflags: UInt): Long =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), pvfindby.toString(), dwgroupid.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: CRYPT_XML_FLAGS, ppalginfo: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetAlgorithmInfo(pxmlalgorithm.toString(), dwflags.toInt(), ppalginfo.toString()) as Int) else 0

public actual fun CryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetDocContext(hcryptxml.toString(), ppstruct.toString()) as Int) else 0

public actual fun CryptXmlGetReference(hcryptxml: Long, ppstruct: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetReference(hcryptxml.toString(), ppstruct.toString()) as Int) else 0

public actual fun CryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetSignature(hcryptxml.toString(), ppstruct.toString()) as Int) else 0

public actual fun CryptXmlGetStatus(hcryptxml: Long, pstatus: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetStatus(hcryptxml.toString(), pstatus.toString()) as Int) else 0

public actual fun CryptXmlGetTransforms(ppconfig: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlGetTransforms(ppconfig.toString()) as Int) else 0

public actual fun CryptXmlImportPublicKey(dwflags: CRYPT_XML_FLAGS, pkeyvalue: Long, phkey: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlImportPublicKey(dwflags.toInt(), pkeyvalue.toString(), phkey.toString()) as Int) else 0

public actual fun CryptXmlOpenToDecode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, rgproperty: Long, cproperty: UInt, pencoded: Long, phcryptxml: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlOpenToDecode(pconfig.toString(), dwflags.toInt(), rgproperty.toString(), cproperty.toInt(), pencoded.toString(), phcryptxml.toString()) as Int) else 0

public actual fun CryptXmlOpenToEncode(pconfig: Long, dwflags: CRYPT_XML_FLAGS, wszid: PCWSTR, rgproperty: Long, cproperty: UInt, pencoded: Long, phsignature: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlOpenToEncode(pconfig.toString(), dwflags.toInt(), wszid.toString(), rgproperty.toString(), cproperty.toInt(), pencoded.toString(), phsignature.toString()) as Int) else 0

public actual fun CryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlSetHMACSecret(hsignature.toString(), pbsecret.toString(), cbsecret.toInt()) as Int) else 0

public actual fun CryptXmlSign(hsignature: Long, hkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: CERT_KEY_SPEC, dwflags: CRYPT_XML_FLAGS, dwkeyinfospec: CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlSign(hsignature.toString(), hkey.toString(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, pvkeyinfospec.toString(), psignaturemethod.toString(), pcanonicalization.toString()) as Int) else 0

public actual fun CryptXmlVerifySignature(hsignature: Long, hkey: BCRYPT_KEY_HANDLE, dwflags: CRYPT_XML_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_CryptXmlVerifySignature(hsignature.toString(), hkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun Decrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_Decrypt(hcrypto.toString(), foaep, cbindata.toInt(), pindata.toString(), pcboutdata.toString(), ppoutdata.toString()) as Int) else 0

public actual fun Encrypt(hcrypto: Long, foaep: BOOL, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_Encrypt(hcrypto.toString(), foaep, cbindata.toInt(), pindata.toString(), pcboutdata.toString(), ppoutdata.toString()) as Int) else 0

public actual fun FindCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: UInt, pwszpurpose: PCWSTR, dwkeyspec: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_FindCertsByIssuer(pcertchains.toString(), pcbcertchains.toString(), pccertchains.toString(), pbencodedissuername.toString(), cbencodedissuername.toInt(), pwszpurpose.toString(), dwkeyspec.toInt()) as Int) else 0

public actual fun FreeToken(pallocmemory: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_FreeToken(pallocmemory.toString()) as Int) else 0

public actual fun GenerateDerivedKey(hcrypto: Long, cblabel: UInt, plabel: Long, cbnonce: UInt, pnonce: Long, derivedkeylength: UInt, offset: UInt, algid: PCWSTR, pcbkey: Long, ppkey: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GenerateDerivedKey(hcrypto.toString(), cblabel.toInt(), plabel.toString(), cbnonce.toInt(), pnonce.toString(), derivedkeylength.toInt(), offset.toInt(), algid.toString(), pcbkey.toString(), ppkey.toString()) as Int) else 0

public actual fun GetAsymmetricEncryptionInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetAsymmetricEncryptionInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetBrowserToken(dwparamtype: UInt, pparam: Long, pcbtoken: Long, pptoken: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetBrowserToken(dwparamtype.toInt(), pparam.toString(), pcbtoken.toString(), pptoken.toString()) as Int) else 0

public actual fun GetCipherInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetCipherInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetCryptoTransform(hsymmetriccrypto: Long, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: Long, pphtransform: Long): HRESULT =
    0

public actual fun GetHashInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetHashInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetKeyDerivationInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetKeyDerivationInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetKeyStorageInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetKeyStorageInterface(pszprovidername.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetKeyedHash(hsymmetriccrypto: Long, pphhash: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetKeyedHash(hsymmetriccrypto.toString(), pphhash.toString()) as Int) else 0

public actual fun GetRngInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetRngInterface(pszprovidername.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetSChannelInterface(pszprovidername: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetSChannelInterface(pszprovidername.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetSecretAgreementInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetSecretAgreementInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetSignatureInterface(pszprovidername: PCWSTR, pszalgid: PCWSTR, ppfunctiontable: Long, dwflags: UInt): NTSTATUS =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetSignatureInterface(pszprovidername.toString(), pszalgid.toString(), ppfunctiontable.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetToken(cpolicychain: UInt, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_GetToken(cpolicychain.toInt(), ppolicychain.toString(), securitytoken.toString(), phprooftokencrypto.toString()) as Int) else 0

public actual fun HashCore(hcrypto: Long, cbindata: UInt, pindata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_HashCore(hcrypto.toString(), cbindata.toInt(), pindata.toString()) as Int) else 0

public actual fun HashFinal(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_HashFinal(hcrypto.toString(), cbindata.toInt(), pindata.toString(), pcboutdata.toString(), ppoutdata.toString()) as Int) else 0

public actual fun ImportInformationCard(filename: PCWSTR): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_ImportInformationCard(filename.toString()) as Int) else 0

public actual fun ManageCardSpace(): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_ManageCardSpace() as Int) else 0

public actual fun NCryptCloseProtectionDescriptor(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptCloseProtectionDescriptor(hdescriptor.toString()) as Int) else 0

public actual fun NCryptCreateClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptCreateClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.toString(), pbclaimblob.toString(), cbclaimblob.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptCreatePersistedKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszalgid: PCWSTR, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptCreatePersistedKey(hprovider.toString(), phkey.toString(), pszalgid.toString(), pszkeyname.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NCryptCreateProtectionDescriptor(pwszdescriptorstring: PCWSTR, dwflags: UInt, phdescriptor: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptCreateProtectionDescriptor(pwszdescriptorstring.toString(), dwflags.toInt(), phdescriptor.toString()) as Int) else 0

public actual fun NCryptDecrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptDecrypt(hkey.toString(), pbinput.toString(), cbinput.toInt(), ppaddinginfo.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptDeleteKey(hkey: NCRYPT_KEY_HANDLE, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptDeleteKey(hkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptDeriveKey(hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: PCWSTR, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptDeriveKey(hsharedsecret.toString(), pwszkdf.toString(), pparameterlist.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptEncrypt(hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, ppaddinginfo: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptEncrypt(hkey.toString(), pbinput.toString(), cbinput.toInt(), ppaddinginfo.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptEnumAlgorithms(hprovider: NCRYPT_PROV_HANDLE, dwalgoperations: NCRYPT_OPERATION, pdwalgcount: Long, ppalglist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptEnumAlgorithms(hprovider.toString(), dwalgoperations.toInt(), pdwalgcount.toString(), ppalglist.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptEnumKeys(hprovider: NCRYPT_PROV_HANDLE, pszscope: PCWSTR, ppkeyname: Long, ppenumstate: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptEnumKeys(hprovider.toString(), pszscope.toString(), ppkeyname.toString(), ppenumstate.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptEnumStorageProviders(pdwprovidercount.toString(), ppproviderlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptExportKey(hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptExportKey(hkey.toString(), hexportkey.toString(), pszblobtype.toString(), pparameterlist.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptFinalizeKey(hkey: NCRYPT_KEY_HANDLE, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptFinalizeKey(hkey.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptFreeBuffer(pvinput: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptFreeBuffer(pvinput.toString()) as Int) else 0

public actual fun NCryptFreeObject(hobject: NCRYPT_HANDLE): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptFreeObject(hobject.toString()) as Int) else 0

public actual fun NCryptGetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: OBJECT_SECURITY_INFORMATION): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptGetProperty(hobject.toString(), pszproperty.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptGetProtectionDescriptorInfo(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, pmempara: Long, dwinfotype: UInt, ppvinfo: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptGetProtectionDescriptorInfo(hdescriptor.toString(), pmempara.toString(), dwinfotype.toInt(), ppvinfo.toString()) as Int) else 0

public actual fun NCryptImportKey(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptImportKey(hprovider.toString(), himportkey.toString(), pszblobtype.toString(), pparameterlist.toString(), phkey.toString(), pbdata.toString(), cbdata.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NCryptIsAlgSupported(hprovider: NCRYPT_PROV_HANDLE, pszalgid: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptIsAlgSupported(hprovider.toString(), pszalgid.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptIsKeyHandle(hkey: NCRYPT_KEY_HANDLE): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptIsKeyHandle(hkey.toString()) as Int) else 0

public actual fun NCryptKeyDerivation(hkey: NCRYPT_KEY_HANDLE, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptKeyDerivation(hkey.toString(), pparameterlist.toString(), pbderivedkey.toString(), cbderivedkey.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptNotifyChangeKey(hprovider: NCRYPT_PROV_HANDLE, phevent: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptNotifyChangeKey(hprovider.toString(), phevent.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptOpenKey(hprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszkeyname: PCWSTR, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptOpenKey(hprovider.toString(), phkey.toString(), pszkeyname.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NCryptOpenStorageProvider(phprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptOpenStorageProvider(phprovider.toString(), pszprovidername.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptProtectSecret(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, pbdata: Long, cbdata: UInt, pmempara: Long, hwnd: HWND, ppbprotectedblob: Long, pcbprotectedblob: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptProtectSecret(hdescriptor.toString(), dwflags.toInt(), pbdata.toString(), cbdata.toInt(), pmempara.toString(), hwnd.toString(), ppbprotectedblob.toString(), pcbprotectedblob.toString()) as Int) else 0

public actual fun NCryptQueryProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PWSTR, pcdescriptorstring: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptQueryProtectionDescriptorName(pwszname.toString(), pwszdescriptorstring.toString(), pcdescriptorstring.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptRegisterProtectionDescriptorName(pwszname: PCWSTR, pwszdescriptorstring: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptRegisterProtectionDescriptorName(pwszname.toString(), pwszdescriptorstring.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptSecretAgreement(hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptSecretAgreement(hprivkey.toString(), hpubkey.toString(), phagreedsecret.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptSetProperty(hobject: NCRYPT_HANDLE, pszproperty: PCWSTR, pbinput: Long, cbinput: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptSetProperty(hobject.toString(), pszproperty.toString(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NCryptSignHash(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptSignHash(hkey.toString(), ppaddinginfo.toString(), pbhashvalue.toString(), cbhashvalue.toInt(), pbsignature.toString(), cbsignature.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptStreamClose(hstream: NCRYPT_STREAM_HANDLE): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptStreamClose(hstream.toString()) as Int) else 0

public actual fun NCryptStreamOpenToProtect(hdescriptor: NCRYPT_DESCRIPTOR_HANDLE, dwflags: UInt, hwnd: HWND, pstreaminfo: Long, phstream: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToProtect(hdescriptor.toString(), dwflags.toInt(), hwnd.toString(), pstreaminfo.toString(), phstream.toString()) as Int) else 0

public actual fun NCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotect(pstreaminfo.toString(), dwflags.toInt(), hwnd.toString(), phstream.toString()) as Int) else 0

public actual fun NCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: UInt, hwnd: HWND, phstream: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptStreamOpenToUnprotectEx(pstreaminfo.toString(), dwflags.toInt(), hwnd.toString(), phstream.toString()) as Int) else 0

public actual fun NCryptStreamUpdate(hstream: NCRYPT_STREAM_HANDLE, pbdata: Long, cbdata: ULong, ffinal: BOOL): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptStreamUpdate(hstream.toString(), pbdata.toString(), cbdata.toString(), ffinal) as Int) else 0

public actual fun NCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CERT_KEY_SPEC, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptTranslateHandle(phprovider.toString(), phkey.toString(), hlegacyprov.toString(), hlegacykey.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NCryptUnprotectSecret(phdescriptor: Long, dwflags: NCRYPT_FLAGS, pbprotectedblob: Long, cbprotectedblob: UInt, pmempara: Long, hwnd: HWND, ppbdata: Long, pcbdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptUnprotectSecret(phdescriptor.toString(), dwflags.toInt(), pbprotectedblob.toString(), cbprotectedblob.toInt(), pmempara.toString(), hwnd.toString(), ppbdata.toString(), pcbdata.toString()) as Int) else 0

public actual fun NCryptVerifyClaim(hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: UInt, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: UInt, poutput: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptVerifyClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.toString(), pbclaimblob.toString(), cbclaimblob.toInt(), poutput.toString(), dwflags.toInt()) as Int) else 0

public actual fun NCryptVerifySignature(hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: NCRYPT_FLAGS): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_NCryptVerifySignature(hkey.toString(), ppaddinginfo.toString(), pbhashvalue.toString(), cbhashvalue.toInt(), pbsignature.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else 0

public actual fun PFXExportCertStore(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_PFXExportCertStore(hstore.toString(), ppfx.toString(), szpassword.toString(), dwflags.toInt()) as Int) else 0

public actual fun PFXExportCertStoreEx(hstore: HCERTSTORE, ppfx: Long, szpassword: PCWSTR, pvpara: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_PFXExportCertStoreEx(hstore.toString(), ppfx.toString(), szpassword.toString(), pvpara.toString(), dwflags.toInt()) as Int) else 0

public actual fun PFXImportCertStore(ppfx: Long, szpassword: PCWSTR, dwflags: CRYPT_KEY_FLAGS): HCERTSTORE =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_PFXImportCertStore(ppfx.toString(), szpassword.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun PFXIsPFXBlob(ppfx: Long): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_PFXIsPFXBlob(ppfx.toString()) as Int) else 0

public actual fun PFXVerifyPassword(ppfx: Long, szpassword: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_PFXVerifyPassword(ppfx.toString(), szpassword.toString(), dwflags.toInt()) as Int) else 0

public actual fun ProcessPrng(pbdata: Long, cbdata: ULong): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_ProcessPrng(pbdata.toString(), cbdata.toString()) as Int) else 0

public actual fun SignError(): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignError() as Int) else 0

public actual fun SignHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, pcbsig: Long, ppsig: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignHash(hcrypto.toString(), cbhash.toInt(), phash.toString(), hashalgoid.toString(), pcbsig.toString(), ppsig.toString()) as Int) else 0

public actual fun SignerFreeSignerContext(psignercontext: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerFreeSignerContext(psignercontext.toString()) as Int) else 0

public actual fun SignerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerSign(psubjectinfo.toString(), psignercert.toString(), psignatureinfo.toString(), pproviderinfo.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString()) as Int) else 0

public actual fun SignerSignEx(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerSignEx(dwflags.toInt(), psubjectinfo.toString(), psignercert.toString(), psignatureinfo.toString(), pproviderinfo.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString()) as Int) else 0

public actual fun SignerSignEx2(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerSignEx2(dwflags.toInt(), psubjectinfo.toString(), psignercert.toString(), psignatureinfo.toString(), pproviderinfo.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString(), pcryptopolicy.toString(), preserved.toString()) as Int) else 0

public actual fun SignerSignEx3(dwflags: SIGNER_SIGN_FLAGS, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid: PCSTR, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerSignEx3(dwflags.toInt(), psubjectinfo.toString(), psignercert.toString(), psignatureinfo.toString(), pproviderinfo.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString(), pcryptopolicy.toString(), pdigestsigninfo.toString(), preserved.toString()) as Int) else 0

public actual fun SignerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerTimeStamp(psubjectinfo.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString()) as Int) else 0

public actual fun SignerTimeStampEx(dwflags: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerTimeStampEx(dwflags.toInt(), psubjectinfo.toString(), pwszhttptimestamp.toString(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString()) as Int) else 0

public actual fun SignerTimeStampEx2(dwflags: SIGNER_TIMESTAMP_FLAGS, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, dwalgid: ALG_ID, psrequest: Long, psipdata: Long, ppsignercontext: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerTimeStampEx2(dwflags.toInt(), psubjectinfo.toString(), pwszhttptimestamp.toString(), dwalgid.toInt(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString()) as Int) else 0

public actual fun SignerTimeStampEx3(dwflags: SIGNER_TIMESTAMP_FLAGS, dwindex: UInt, psubjectinfo: Long, pwszhttptimestamp: PCWSTR, pszalgorithmoid: PCWSTR, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SignerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), psubjectinfo.toString(), pwszhttptimestamp.toString(), pszalgorithmoid.toString(), psrequest.toString(), psipdata.toString(), ppsignercontext.toString(), pcryptopolicy.toString(), preserved.toString()) as Int) else 0

public actual fun SslChangeNotify(hevent: HANDLE, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslChangeNotify(hevent.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslComputeClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslComputeClientAuthHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pszalgid.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslComputeEapKeyBlock(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: Long, cbrandoms: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslComputeEapKeyBlock(hsslprovider.toString(), hmasterkey.toString(), pbrandoms.toString(), cbrandoms.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslComputeFinishedHash(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslComputeFinishedHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pboutput.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslComputeSessionHash(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslComputeSessionHash(hsslprovider.toString(), hhandshakehash.toString(), dwprotocol.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslCreateClientAuthHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslCreateClientAuthHash(hsslprovider.toString(), phhandshakehash.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pszhashalgid.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslCreateEphemeralKey(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: Long, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: Long, cbparams: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslCreateEphemeralKey(hsslprovider.toString(), phephemeralkey.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), pbparams.toString(), cbparams.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslCreateHandshakeHash(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: Long, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslCreateHandshakeHash(hsslprovider.toString(), phhandshakehash.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslDecrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslDecrementProviderReferenceCount(hsslprovider.toString()) as Int) else 0

public actual fun SslDecryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslDecryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.toString(), cbinput.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), sequencenumber.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslDuplicateTranscriptHash(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phtranscripthash: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslDuplicateTranscriptHash(hsslprovider.toString(), htranscripthash.toString(), phtranscripthash.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslEncryptPacket(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: Long, cbinput: UInt, pboutput: Long, cboutput: UInt, pcbresult: Long, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslEncryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.toString(), cbinput.toInt(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), sequencenumber.toString(), dwcontenttype.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslEnumCipherSuites(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslEnumCipherSuites(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.toString(), ppenumstate.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslEnumCipherSuitesEx(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslEnumCipherSuitesEx(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.toString(), ppenumstate.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslEnumEccCurves(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: Long, ppecccurve: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslEnumEccCurves(hsslprovider.toString(), pecccurvecount.toString(), ppecccurve.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslEnumProtocolProviders(pdwprovidercount.toString(), ppproviderlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandBinderKey(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandBinderKey(hsslprovider.toString(), hearlykey.toString(), phbinderkey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandExporterMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandExporterMasterKey(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phexportermasterkey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandPreSharedKey(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: Long, cbticketnonce: UInt, phpresharedkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandPreSharedKey(hsslprovider.toString(), hresumptionmasterkey.toString(), pbticketnonce.toString(), cbticketnonce.toInt(), phpresharedkey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandResumptionMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandResumptionMasterKey(hsslprovider.toString(), hmasterkey.toString(), hhashvalue.toString(), phresumptionmasterkey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandTrafficKeys(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandTrafficKeys(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phclienttraffickey.toString(), phservertraffickey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExpandWriteKey(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExpandWriteKey(hsslprovider.toString(), hbasetraffickey.toString(), phwritekey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExportKey(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: PCWSTR, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExportKey(hsslprovider.toString(), hkey.toString(), pszblobtype.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExportKeyingMaterial(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: PCSTR, pbrandoms: Long, cbrandoms: UInt, pbcontextvalue: Long, cbcontextvalue: UShort, pboutput: Long, cboutput: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExportKeyingMaterial(hsslprovider.toString(), hmasterkey.toString(), slabel.toString(), pbrandoms.toString(), cbrandoms.toInt(), pbcontextvalue.toString(), cbcontextvalue.toInt(), pboutput.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslExtractEarlyKey(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExtractEarlyKey(hsslprovider.toString(), hpresharedkey.toString(), phearlykey.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExtractHandshakeKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExtractHandshakeKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), hearlykey.toString(), phhandshakekey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslExtractMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslExtractMasterKey(hsslprovider.toString(), hhandshakekey.toString(), phmasterkey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslFreeBuffer(pvinput: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslFreeBuffer(pvinput.toString()) as Int) else 0

public actual fun SslFreeObject(hobject: NCRYPT_HANDLE, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslFreeObject(hobject.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGenerateMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGenerateMasterKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), phmasterkey.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGeneratePreMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pboutput: Long, cboutput: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGeneratePreMasterKey(hsslprovider.toString(), hpublickey.toString(), phpremasterkey.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.toString(), pboutput.toString(), cboutput.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGenerateSessionKeys(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGenerateSessionKeys(hsslprovider.toString(), hmasterkey.toString(), phreadkey.toString(), phwritekey.toString(), pparameterlist.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGetCipherSuitePRFHashAlgorithm(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: PWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGetCipherSuitePRFHashAlgorithm(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), szprfhash.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGetKeyProperty(hkey: NCRYPT_KEY_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGetKeyProperty(hkey.toString(), pszproperty.toString(), ppboutput.toString(), pcboutput.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslGetProviderProperty(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: PCWSTR, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslGetProviderProperty(hsslprovider.toString(), pszproperty.toString(), ppboutput.toString(), pcboutput.toString(), ppenumstate.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslHashHandshake(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: Long, cbinput: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslHashHandshake(hsslprovider.toString(), hhandshakehash.toString(), pbinput.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslImportKey(hsslprovider: NCRYPT_PROV_HANDLE, phkey: Long, pszblobtype: PCWSTR, pbkeyblob: Long, cbkeyblob: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslImportKey(hsslprovider.toString(), phkey.toString(), pszblobtype.toString(), pbkeyblob.toString(), cbkeyblob.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslImportMasterKey(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: Long, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslImportMasterKey(hsslprovider.toString(), hprivatekey.toString(), phmasterkey.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.toString(), pbencryptedkey.toString(), cbencryptedkey.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslIncrementProviderReferenceCount(hsslprovider: NCRYPT_PROV_HANDLE): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslIncrementProviderReferenceCount(hsslprovider.toString()) as Int) else 0

public actual fun SslLookupCipherLengths(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: Long, cbcipherlengths: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslLookupCipherLengths(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pcipherlengths.toString(), cbcipherlengths.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SslLookupCipherSuiteInfo(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslLookupCipherSuiteInfo(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pciphersuite.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslOpenPrivateKey(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: Long, pcertcontext: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslOpenPrivateKey(hsslprovider.toString(), phprivatekey.toString(), pcertcontext.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslOpenProvider(phsslprovider: Long, pszprovidername: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslOpenProvider(phsslprovider.toString(), pszprovidername.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslSignHash(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, pcbresult: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslSignHash(hsslprovider.toString(), hprivatekey.toString(), pbhashvalue.toString(), cbhashvalue.toInt(), pbsignature.toString(), cbsignature.toInt(), pcbresult.toString(), dwflags.toInt()) as Int) else 0

public actual fun SslVerifySignature(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: Long, cbhashvalue: UInt, pbsignature: Long, cbsignature: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SslVerifySignature(hsslprovider.toString(), hpublickey.toString(), pbhashvalue.toString(), cbhashvalue.toInt(), pbsignature.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SystemPrng(pbrandomdata: Long, cbrandomdata: ULong): BOOL =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_SystemPrng(pbrandomdata.toString(), cbrandomdata.toString()) as Int) else 0

public actual fun TransformBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_TransformBlock(hcrypto.toString(), cbindata.toInt(), pindata.toString(), pcboutdata.toString(), ppoutdata.toString()) as Int) else 0

public actual fun TransformFinalBlock(hcrypto: Long, cbindata: UInt, pindata: Long, pcboutdata: Long, ppoutdata: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_TransformFinalBlock(hcrypto.toString(), cbindata.toInt(), pindata.toString(), pcboutdata.toString(), ppoutdata.toString()) as Int) else 0

public actual fun VerifyHash(hcrypto: Long, cbhash: UInt, phash: Long, hashalgoid: PCWSTR, cbsig: UInt, psig: Long, pfverified: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_VerifyHash(hcrypto.toString(), cbhash.toInt(), phash.toString(), hashalgoid.toString(), cbsig.toInt(), psig.toString(), pfverified.toString()) as Int) else 0
