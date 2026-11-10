@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

private object WindowsWin32SecurityCryptographyJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptAddContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptAddContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptCloseAlgorithmProvider(halgorithm: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptConfigureContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptConfigureContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptCreateContext(dwtable: Int, pszcontext: Long, pconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptCreateHash(halgorithm: Long, phhash: Long, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptCreateMultiHash(halgorithm: Long, phhash: Long, nhashes: Int, pbhashobject: Long, cbhashobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDeleteContext(dwtable: Int, pszcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDeriveKeyCapi(hhash: Long, htargetalg: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDeriveKeyPBKDF2(hprf: Long, pbpassword: Long, cbpassword: Int, pbsalt: Long, cbsalt: Int, citerations: Long, pbderivedkey: Long, cbderivedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDestroySecret(hsecret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDuplicateHash(hhash: Long, phnewhash: Long, pbhashobject: Long, cbhashobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptDuplicateKey(hkey: Long, phnewkey: Long, pbkeyobject: Long, cbkeyobject: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pbiv: Long, cbiv: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumAlgorithms(dwalgoperations: Int, palgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctionProviders(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctions(dwtable: Int, pszcontext: Long, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumContexts(dwtable: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumProviders(pszalgid: Long, pimplcount: Long, ppimpllist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptEnumRegisteredProviders(pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptFinalizeKeyPair(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptFinishHash(hhash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptFreeBuffer(pvbuffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptGenRandom(halgorithm: Long, pbbuffer: Long, cbbuffer: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptGenerateKeyPair(halgorithm: Long, phkey: Long, dwlength: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptGenerateSymmetricKey(halgorithm: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbsecret: Long, cbsecret: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptGetFipsAlgorithmMode(pfenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptHash(halgorithm: Long, pbsecret: Long, cbsecret: Int, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptHashData(hhash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptImportKey(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbkeyobject: Long, cbkeyobject: Int, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptImportKeyPair(halgorithm: Long, himportkey: Long, pszblobtype: Long, phkey: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptOpenAlgorithmProvider(phalgorithm: Long, pszalgid: Long, pszimplementation: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptProcessMultiOperations(hobject: Long, operationtype: Int, poperations: Long, cboperations: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptQueryContextConfiguration(dwtable: Int, pszcontext: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionConfiguration(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, pcbvalue: Long, ppbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptQueryProviderRegistration(pszprovider: Long, dwmode: Int, dwinterface: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptRegisterConfigChangeNotify(phevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptRegisterProvider(pszprovider: Long, dwflags: Int, preg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunction(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunctionProvider(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptResolveProviders(pszcontext: Long, dwinterface: Int, pszfunction: Long, pszprovider: Long, dwmode: Int, dwflags: Int, pcbbuffer: Long, ppbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptSetContextFunctionProperty(dwtable: Int, pszcontext: Long, dwinterface: Int, pszfunction: Long, pszproperty: Long, cbvalue: Int, pbvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptSignHash(hkey: Long, ppaddinginfo: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptUnregisterConfigChangeNotify(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptUnregisterProvider(pszprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_bCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhash: Long, cbhash: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCRLContextToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCRLLinkToStore(hcertstore: Long, pcrlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCTLContextToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCTLLinkToStore(hcertstore: Long, pctlcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCertificateContextToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddCertificateLinkToStore(hcertstore: Long, pcertcontext: Long, dwadddisposition: Int, ppstorecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEncodedCRLToStore(hcertstore: Long, dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int, dwadddisposition: Int, ppcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEncodedCTLToStore(hcertstore: Long, dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int, dwadddisposition: Int, ppctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToStore(hcertstore: Long, dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int, dwadddisposition: Int, ppcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreA(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreW(szcertstorename: Long, pbcertencoded: Long, cbcertencoded: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponse(hserverocspresponse: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddSerializedElementToStore(hcertstore: Long, pbelement: Long, cbelement: Int, dwadddisposition: Int, dwflags: Int, dwcontexttypeflags: Int, pdwcontexttype: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAddStoreToCollection(hcollectionstore: Long, hsiblingstore: Long, dwupdateflags: Int, dwpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certAlgIdToOID(dwalgid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCloseServerOcspResponse(hserverocspresponse: Long, dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCloseStore(hcertstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCompareCertificate(dwcertencodingtype: Int, pcertid1: Long, pcertid2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCompareCertificateName(dwcertencodingtype: Int, pcertname1: Long, pcertname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCompareIntegerBlob(pint1: Long, pint2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certComparePublicKeyInfo(dwcertencodingtype: Int, ppublickey1: Long, ppublickey2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certControlStore(hcertstore: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateCRLContext(dwcertencodingtype: Int, pbcrlencoded: Long, cbcrlencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateCTLContext(dwmsgandcertencodingtype: Int, pbctlencoded: Long, cbctlencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateCTLEntryFromCertificateContextProperties(pcertcontext: Long, coptattr: Int, rgoptattr: Long, dwflags: Int, pvreserved: Long, pctlentry: Long, pcbctlentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateCertificateChainEngine(pconfig: Long, phchainengine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateCertificateContext(dwcertencodingtype: Int, pbcertencoded: Long, cbcertencoded: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateContext(dwcontexttype: Int, dwencodingtype: Int, pbencoded: Long, cbencoded: Int, dwflags: Int, pcreatepara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certCreateSelfSignCertificate(hcryptprovorncryptkey: Long, psubjectissuerblob: Long, dwflags: Int, pkeyprovinfo: Long, psignaturealgorithm: Long, pstarttime: Long, pendtime: Long, pextensions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDeleteCRLFromStore(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDeleteCTLFromStore(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDeleteCertificateFromStore(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDuplicateCRLContext(pcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDuplicateCTLContext(pctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDuplicateCertificateChain(pchaincontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDuplicateCertificateContext(pcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certDuplicateStore(hcertstore: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCRLContextProperties(pcrlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCRLsInStore(hcertstore: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCTLContextProperties(pctlcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCTLsInStore(hcertstore: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCertificateContextProperties(pcertcontext: Long, dwpropid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumCertificatesInStore(hcertstore: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumPhysicalStore(pvsystemstore: Long, dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumSubjectInSortedCTL(pctlcontext: Long, ppvnextsubject: Long, psubjectidentifier: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumSystemStore(dwflags: Int, pvsystemstorelocationpara: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certEnumSystemStoreLocation(dwflags: Int, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindAttribute(pszobjid: Long, cattr: Int, rgattr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindCRLInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcrlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindCTLInStore(hcertstore: Long, dwmsgandcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevctlcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindCertificateInCRL(pcert: Long, pcrlcontext: Long, dwflags: Int, pvreserved: Long, ppcrlentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindCertificateInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevcertcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindChainInStore(hcertstore: Long, dwcertencodingtype: Int, dwfindflags: Int, dwfindtype: Int, pvfindpara: Long, pprevchaincontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindExtension(pszobjid: Long, cextensions: Int, rgextensions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindRDNAttr(pszobjid: Long, pname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindSubjectInCTL(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, pctlcontext: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFindSubjectInSortedCTL(psubjectidentifier: Long, pctlcontext: Long, dwflags: Int, pvreserved: Long, pencodedattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCRLContext(pcrlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCTLContext(pctlcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCertificateChain(pchaincontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCertificateChainEngine(hchainengine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCertificateChainList(prgpselection: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeCertificateContext(pcertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certFreeServerOcspResponseContext(pserverocspresponsecontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetCRLFromStore(hcertstore: Long, pissuercontext: Long, pprevcrlcontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetCTLContextProperty(pctlcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetCertificateChain(hchainengine: Long, pcertcontext: Long, ptime: Long, hadditionalstore: Long, pchainpara: Long, dwflags: Int, pvreserved: Long, ppchaincontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetEnhancedKeyUsage(pcertcontext: Long, dwflags: Int, pusage: Long, pcbusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetIntendedKeyUsage(dwcertencodingtype: Int, pcertinfo: Long, pbkeyusage: Long, cbkeyusage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetIssuerCertificateFromStore(hcertstore: Long, psubjectcontext: Long, pprevissuercontext: Long, pdwflags: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetNameStringA(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetNameStringW(pcertcontext: Long, dwtype: Int, dwflags: Int, pvtypepara: Long, psznamestring: Long, cchnamestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetPublicKeyLength(dwcertencodingtype: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetServerOcspResponseContext(hserverocspresponse: Long, dwflags: Int, pvreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetStoreProperty(hcertstore: Long, dwpropid: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetSubjectCertificateFromStore(hcertstore: Long, dwcertencodingtype: Int, pcertid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certGetValidUsages(ccerts: Int, rghcerts: Long, cnumoids: Long, rghoids: Long, pcboids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certIsRDNAttrsInCertificateName(dwcertencodingtype: Int, dwflags: Int, pcertname: Long, prdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certIsStrongHashToSign(pstrongsignpara: Long, pwszcnghashalgid: Long, psigningcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certIsValidCRLForCertificate(pcert: Long, pcrl: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certIsWeakHash(dwhashusetype: Int, pwszcnghashalgid: Long, dwchainflags: Int, psignerchaincontext: Long, ptimestamp: Long, pwszfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certNameToStrA(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certNameToStrW(dwcertencodingtype: Int, pname: Long, dwstrtype: Int, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certOIDToAlgId(pszobjid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certOpenServerOcspResponse(pchaincontext: Long, dwflags: Int, popenpara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certOpenStore(lpszstoreprovider: Long, dwencodingtype: Int, hcryptprov: Long, dwflags: Int, pvpara: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certOpenSystemStoreA(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certOpenSystemStoreW(hprov: Long, szsubsystemprotocol: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRDNValueToStrA(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRDNValueToStrW(dwvaluetype: Int, pvalue: Long, psz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRegisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRegisterSystemStore(pvsystemstore: Long, dwflags: Int, pstoreinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRemoveEnhancedKeyUsageIdentifier(pcertcontext: Long, pszusageidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRemoveStoreFromCollection(hcollectionstore: Long, hsiblingstore: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certResyncCertificateChainEngine(hchainengine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certRetrieveLogoOrBiometricInfo(pcertcontext: Long, lpszlogoorbiometrictype: Long, dwretrievalflags: Int, dwtimeout: Int, dwflags: Int, pvreserved: Long, ppbdata: Long, pcbdata: Long, ppwszmimetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSaveStore(hcertstore: Long, dwencodingtype: Int, dwsaveas: Int, dwsaveto: Int, pvsavetopara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSelectCertificateChains(pselectioncontext: Long, dwflags: Int, pchainparameters: Long, ccriteria: Int, rgpcriteria: Long, hstore: Long, pcselection: Long, pprgpselection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSerializeCRLStoreElement(pcrlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSerializeCTLStoreElement(pctlcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSerializeCertificateStoreElement(pcertcontext: Long, dwflags: Int, pbelement: Long, pcbelement: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetCRLContextProperty(pcrlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetCTLContextProperty(pctlcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: Long, pctlentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetCertificateContextProperty(pcertcontext: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetEnhancedKeyUsage(pcertcontext: Long, pusage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certSetStoreProperty(hcertstore: Long, dwpropid: Int, dwflags: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certStrToNameA(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certStrToNameW(dwcertencodingtype: Int, pszx500: Long, dwstrtype: Int, pvreserved: Long, pbencoded: Long, pcbencoded: Long, ppszerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certUnregisterPhysicalStore(pvsystemstore: Long, dwflags: Int, pwszstorename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certUnregisterSystemStore(pvsystemstore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyCRLRevocation(dwcertencodingtype: Int, pcertid: Long, ccrlinfo: Int, rgpcrlinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyCRLTimeValidity(ptimetoverify: Long, pcrlinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyCTLUsage(dwencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, psubjectusage: Long, dwflags: Int, pverifyusagepara: Long, pverifyusagestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyCertificateChainPolicy(pszpolicyoid: Long, pchaincontext: Long, ppolicypara: Long, ppolicystatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyRevocation(dwencodingtype: Int, dwrevtype: Int, ccontext: Int, rgpvcontext: Long, dwflags: Int, prevpara: Long, prevstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifySubjectCertificateContext(psubject: Long, pissuer: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyTimeValidity(ptimetoverify: Long, pcertinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certVerifyValidityNesting(psubjectinfo: Long, pissuerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_closeCryptoHandle(hcrypto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptAcquireCertificatePrivateKey(pcert: Long, dwflags: Int, pvparameters: Long, phcryptprovorncryptkey: Long, pdwkeyspec: Long, pfcallerfreeprovorncryptkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptAcquireContextA(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptAcquireContextW(phprov: Long, szcontainer: Long, szprovider: Long, dwprovtype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptBinaryToStringA(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptBinaryToStringW(pbbinary: Long, cbbinary: Int, dwflags: Int, pszstring: Long, pcchstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptCloseAsyncHandle(hasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptContextAddRef(hprov: Long, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptCreateAsyncHandle(dwflags: Int, phasync: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptCreateHash(hprov: Long, algid: Int, hkey: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: Int, pszpubkeyoid: Long, ppubkeystruc: Long, cbpubkeystruc: Int, dwflags: Int, pvreserved: Long, pbhash: Long, pcbhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecodeMessage(dwmsgtypeflags: Int, pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencodedblob: Long, cbencodedblob: Int, dwprevinnercontenttype: Int, pdwmsgtype: Long, pdwinnercontenttype: Long, pbdecoded: Long, pcbdecoded: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, dwflags: Int, pdecodepara: Long, pvstructinfo: Long, pcbstructinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecryptAndVerifyMessageSignature(pdecryptpara: Long, pverifypara: Long, dwsignerindex: Int, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDecryptMessage(pdecryptpara: Long, pbencryptedblob: Long, cbencryptedblob: Int, pbdecrypted: Long, pcbdecrypted: Long, ppxchgcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDeriveKey(hprov: Long, algid: Int, hbasedata: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDestroyHash(hhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDestroyKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDuplicateHash(hhash: Long, pdwreserved: Long, dwflags: Int, phhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptDuplicateKey(hkey: Long, pdwreserved: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEncodeObject(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEncodeObjectEx(dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, dwflags: Int, pencodepara: Long, pvencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEncrypt(hkey: Long, hhash: Long, final: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long, dwbuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEncryptMessage(pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobeencrypted: Long, cbtobeencrypted: Int, pbencryptedblob: Long, pcbencryptedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumKeyIdentifierProperties(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvarg: Long, pfnenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, dwflags: Int, pvarg: Long, pfnenumoidfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumOIDInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumoidinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, sztypename: Long, pcbtypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumProvidersA(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptEnumProvidersW(dwindex: Int, pdwreserved: Long, dwflags: Int, pdwprovtype: Long, szprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptExportKey(hkey: Long, hexpkey: Long, dwblobtype: Int, dwflags: Int, pbdata: Long, pdwdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptExportPKCS8(hcryptprov: Long, dwkeyspec: Int, pszprivatekeyobjid: Long, dwflags: Int, pvauxinfo: Long, pbprivatekeyblob: Long, pcbprivatekeyblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfo(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: Long, dwcertencodingtype: Int, pszpublickeyobjid: Long, dwflags: Int, pvauxinfo: Long, pinfo: Long, pcbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptFindCertificateKeyProvInfo(pcert: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptFindLocalizedName(pwszcryptname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptFindOIDInfo(dwkeytype: Int, pvkey: Long, dwgroupid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptFormatObject(dwcertencodingtype: Int, dwformattype: Int, dwformatstrtype: Int, pformatstruct: Long, lpszstructtype: Long, pbencoded: Long, cbencoded: Int, pbformat: Long, pcbformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptFreeOIDFunctionAddress(hfuncaddr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGenKey(hprov: Long, algid: Int, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGenRandom(hprov: Long, dwlen: Int, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetAsyncParam(hasync: Long, pszparamoid: Long, ppvparam: Long, ppfnfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDDllList(hfuncset: Long, dwencodingtype: Int, pwszdlllist: Long, pcchdlllist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pwszdll: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderA(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderW(dwprovtype: Int, pdwreserved: Long, dwflags: Int, pszprovname: Long, pcbprovname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetHashParam(hhash: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetMessageCertificates(dwmsgandcertencodingtype: Int, hcryptprov: Long, dwflags: Int, pbsignedblob: Long, cbsignedblob: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetMessageSignerCount(dwmsgencodingtype: Int, pbsignedblob: Long, cbsignedblob: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionAddress(hfuncset: Long, dwencodingtype: Int, pszoid: Long, dwflags: Int, ppvfuncaddr: Long, phfuncaddr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, pdwvaluetype: Long, pbvaluedata: Long, pcbvaluedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetObjectUrl(pszurloid: Long, pvpara: Long, dwflags: Int, purlarray: Long, pcburlarray: Long, purlinfo: Long, pcburlinfo: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetProvParam(hprov: Long, dwparam: Int, pbdata: Long, pdwdatalen: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptGetUserKey(hprov: Long, dwkeyspec: Int, phuserkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashCertificate(hcryptprov: Long, algid: Int, dwflags: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashCertificate2(pwszcnghashalgid: Long, dwflags: Int, pvreserved: Long, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashData(hhash: Long, pbdata: Long, dwdatalen: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashMessage(phashpara: Long, fdetachedhash: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbhashedblob: Long, pcbhashedblob: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashPublicKeyInfo(hcryptprov: Long, algid: Int, dwflags: Int, dwcertencodingtype: Int, pinfo: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashSessionKey(hhash: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptHashToBeSigned(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptImportKey(hprov: Long, pbdata: Long, dwdatalen: Int, hpubkey: Long, dwflags: Int, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfo(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx(hcryptprov: Long, dwcertencodingtype: Int, pinfo: Long, aikeyalg: Int, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx2(dwcertencodingtype: Int, pinfo: Long, dwflags: Int, pvauxinfo: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptInitOIDFunctionSet(pszfuncname: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptInstallCancelRetrieval(pfncancel: Long, pvarg: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptInstallDefaultContext(hcryptprov: Long, dwdefaulttype: Int, pvdefaultpara: Long, dwflags: Int, pvreserved: Long, phdefaultcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptInstallOIDFunctionAddress(hmodule: Long, dwencodingtype: Int, pszfuncname: Long, cfuncentry: Int, rgfuncentry: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMemAlloc(cbsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMemFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMemRealloc(pv: Long, cbsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgCalculateEncodedLength(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgClose(hcryptmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgControl(hcryptmsg: Long, dwflags: Int, dwctrltype: Int, pvctrlpara: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgCountersign(hcryptmsg: Long, dwindex: Int, ccountersigners: Int, rgcountersigners: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgCountersignEncoded(dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, ccountersigners: Int, rgcountersigners: Long, pbcountersignature: Long, pcbcountersignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgDuplicate(hcryptmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgEncodeAndSignCTL(dwmsgencodingtype: Int, pctlinfo: Long, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgGetAndVerifySigner(hcryptmsg: Long, csignerstore: Int, rghsignerstore: Long, dwflags: Int, ppsigner: Long, pdwsignerindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgGetParam(hcryptmsg: Long, dwparamtype: Int, dwindex: Int, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgOpenToDecode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, hcryptprov: Long, precipientinfo: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgOpenToEncode(dwmsgencodingtype: Int, dwflags: Int, dwmsgtype: Int, pvmsgencodeinfo: Long, pszinnercontentobjid: Long, pstreaminfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgSignCTL(dwmsgencodingtype: Int, pbctlcontent: Long, cbctlcontent: Int, psigninfo: Long, dwflags: Int, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgUpdate(hcryptmsg: Long, pbdata: Long, cbdata: Int, ffinal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncoded(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, pcicountersigner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: Long, dwencodingtype: Int, pbsignerinfo: Long, cbsignerinfo: Int, pbsignerinfocountersignature: Long, cbsignerinfocountersignature: Int, dwsignertype: Int, pvsigner: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptProtectData(pdatain: Long, szdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptProtectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptQueryObject(dwobjecttype: Int, pvobject: Long, dwexpectedcontenttypeflags: Int, dwexpectedformattypeflags: Int, dwflags: Int, pdwmsgandcertencodingtype: Long, pdwcontenttype: Long, pdwformattype: Long, phcertstore: Long, phmsg: Long, ppvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRegisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, dwindex: Int, pwszdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRegisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszdll: Long, pszoverridefuncname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRegisterOIDInfo(pinfo: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptReleaseContext(hprov: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlA(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlW(pszurl: Long, pszobjectoid: Long, dwretrievalflags: Int, dwtimeout: Int, ppvobject: Long, hasyncretrieve: Long, pcredentials: Long, pvverify: Long, pauxinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptRetrieveTimeStamp(wszurl: Long, dwretrievalflags: Int, dwtimeout: Int, pszhashid: Long, ppara: Long, pbdata: Long, cbdata: Int, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetAsyncParam(hasync: Long, pszparamoid: Long, pvparam: Long, pfnfree: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetHashParam(hhash: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetKeyIdentifierProperty(pkeyidentifier: Long, dwpropid: Int, dwflags: Int, pwszcomputername: Long, pvreserved: Long, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetKeyParam(hkey: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetOIDFunctionValue(dwencodingtype: Int, pszfuncname: Long, pszoid: Long, pwszvaluename: Long, dwvaluetype: Int, pbvaluedata: Long, cbvaluedata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetProvParam(hprov: Long, dwparam: Int, pbdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetProviderA(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetProviderExA(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetProviderExW(pszprovname: Long, dwprovtype: Int, pdwreserved: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSetProviderW(pszprovname: Long, dwprovtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignAndEncodeCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, lpszstructtype: Long, pvstructinfo: Long, psignaturealgorithm: Long, pvhashauxinfo: Long, pbencoded: Long, pcbencoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignAndEncryptMessage(psignpara: Long, pencryptpara: Long, crecipientcert: Int, rgprecipientcert: Long, pbtobesignedandencrypted: Long, cbtobesignedandencrypted: Int, pbsignedandencryptedblob: Long, pcbsignedandencryptedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignCertificate(hcryptprovorncryptkey: Long, dwkeyspec: Int, dwcertencodingtype: Int, pbencodedtobesigned: Long, cbencodedtobesigned: Int, psignaturealgorithm: Long, pvhashauxinfo: Long, pbsignature: Long, pcbsignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignHashA(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignHashW(hhash: Long, dwkeyspec: Int, szdescription: Long, dwflags: Int, pbsignature: Long, pdwsiglen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignMessage(psignpara: Long, fdetachedsignature: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptSignMessageWithKey(psignpara: Long, pbtobesigned: Long, cbtobesigned: Int, pbsignedblob: Long, pcbsignedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptStringToBinaryA(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptStringToBinaryW(pszstring: Long, cchstring: Int, dwflags: Int, pbbinary: Long, pcbbinary: Long, pdwskip: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUninstallCancelRetrieval(dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUninstallDefaultContext(hdefaultcontext: Long, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUnprotectData(pdatain: Long, ppszdatadescr: Long, poptionalentropy: Long, pvreserved: Long, ppromptstruct: Long, dwflags: Int, pdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUnprotectMemory(pdatain: Long, cbdatain: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUnregisterDefaultOIDFunction(dwencodingtype: Int, pszfuncname: Long, pwszdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUnregisterOIDFunction(dwencodingtype: Int, pszfuncname: Long, pszoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUnregisterOIDInfo(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptUpdateProtectedState(poldsid: Long, pwszoldpassword: Long, dwflags: Int, pdwsuccesscount: Long, pdwfailurecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignature(hcryptprov: Long, dwcertencodingtype: Int, pbencoded: Long, cbencoded: Int, ppublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignatureEx(hcryptprov: Long, dwcertencodingtype: Int, dwsubjecttype: Int, pvsubject: Long, dwissuertype: Int, pvissuer: Long, dwflags: Int, pvextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageHash(phashpara: Long, pbdetachedhashblob: Long, cbdetachedhashblob: Int, ctobehashed: Int, rgpbtobehashed: Long, rgcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageSignature(pverifypara: Long, dwsignerindex: Int, pbdetachedsignblob: Long, cbdetachedsignblob: Int, ctobesigned: Int, rgpbtobesigned: Long, rgcbtobesigned: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyMessageHash(phashpara: Long, pbhashedblob: Long, cbhashedblob: Int, pbtobehashed: Long, pcbtobehashed: Long, pbcomputedhash: Long, pcbcomputedhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignature(pverifypara: Long, dwsignerindex: Int, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long, ppsignercert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignatureWithKey(pverifypara: Long, ppublickeyinfo: Long, pbsignedblob: Long, cbsignedblob: Int, pbdecoded: Long, pcbdecoded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifySignatureA(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifySignatureW(hhash: Long, pbsignature: Long, dwsiglen: Int, hpubkey: Long, szdescription: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptVerifyTimeStampSignature(pbtscontentinfo: Long, cbtscontentinfo: Int, pbdata: Long, cbdata: Int, hadditionalstore: Long, pptscontext: Long, pptssigner: Long, phstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlAddObject(hsignatureorobject: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlClose(hcryptxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlCreateReference(hcryptxml: Long, dwflags: Int, wszid: Long, wszuri: Long, wsztype: Long, pdigestmethod: Long, ctransform: Int, rgtransform: Long, phreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlDigestReference(hreference: Long, dwflags: Int, pdataproviderin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlEncode(hcryptxml: Long, dwcharset: Int, rgproperty: Long, cproperty: Int, pvcallbackstate: Long, pfnwrite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlEnumAlgorithmInfo(dwgroupid: Int, dwflags: Int, pvarg: Long, pfnenumalginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlFindAlgorithmInfo(dwfindbytype: Int, pvfindby: Long, dwgroupid: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetAlgorithmInfo(pxmlalgorithm: Long, dwflags: Int, ppalginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetDocContext(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetReference(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetSignature(hcryptxml: Long, ppstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetStatus(hcryptxml: Long, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlGetTransforms(ppconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlImportPublicKey(dwflags: Int, pkeyvalue: Long, phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlOpenToDecode(pconfig: Long, dwflags: Int, rgproperty: Long, cproperty: Int, pencoded: Long, phcryptxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlOpenToEncode(pconfig: Long, dwflags: Int, wszid: Long, rgproperty: Long, cproperty: Int, pencoded: Long, phsignature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlSetHMACSecret(hsignature: Long, pbsecret: Long, cbsecret: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlSign(hsignature: Long, hkey: Long, dwkeyspec: Int, dwflags: Int, dwkeyinfospec: Int, pvkeyinfospec: Long, psignaturemethod: Long, pcanonicalization: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_cryptXmlVerifySignature(hsignature: Long, hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_decrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_encrypt(hcrypto: Long, foaep: Int, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_findCertsByIssuer(pcertchains: Long, pcbcertchains: Long, pccertchains: Long, pbencodedissuername: Long, cbencodedissuername: Int, pwszpurpose: Long, dwkeyspec: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_freeToken(pallocmemory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_generateDerivedKey(hcrypto: Long, cblabel: Int, plabel: Long, cbnonce: Int, pnonce: Long, derivedkeylength: Int, offset: Int, algid: Long, pcbkey: Long, ppkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getAsymmetricEncryptionInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getBrowserToken(dwparamtype: Int, pparam: Long, pcbtoken: Long, pptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getCipherInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getHashInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getKeyDerivationInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getKeyStorageInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getKeyedHash(hsymmetriccrypto: Long, pphhash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getRngInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getSChannelInterface(pszprovidername: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getSecretAgreementInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getSignatureInterface(pszprovidername: Long, pszalgid: Long, ppfunctiontable: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_getToken(cpolicychain: Int, ppolicychain: Long, securitytoken: Long, phprooftokencrypto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_hashCore(hcrypto: Long, cbindata: Int, pindata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_hashFinal(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_importInformationCard(filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_manageCardSpace(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptCloseProtectionDescriptor(hdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptCreateClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptCreatePersistedKey(hprovider: Long, phkey: Long, pszalgid: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptCreateProtectionDescriptor(pwszdescriptorstring: Long, dwflags: Int, phdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptDecrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptDeleteKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptDeriveKey(hsharedsecret: Long, pwszkdf: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptEncrypt(hkey: Long, pbinput: Long, cbinput: Int, ppaddinginfo: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptEnumAlgorithms(hprovider: Long, dwalgoperations: Int, pdwalgcount: Long, ppalglist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptEnumKeys(hprovider: Long, pszscope: Long, ppkeyname: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptEnumStorageProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptExportKey(hkey: Long, hexportkey: Long, pszblobtype: Long, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptFinalizeKey(hkey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptFreeObject(hobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptGetProperty(hobject: Long, pszproperty: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptGetProtectionDescriptorInfo(hdescriptor: Long, pmempara: Long, dwinfotype: Int, ppvinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptImportKey(hprovider: Long, himportkey: Long, pszblobtype: Long, pparameterlist: Long, phkey: Long, pbdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptIsAlgSupported(hprovider: Long, pszalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptIsKeyHandle(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptKeyDerivation(hkey: Long, pparameterlist: Long, pbderivedkey: Long, cbderivedkey: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptNotifyChangeKey(hprovider: Long, phevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptOpenKey(hprovider: Long, phkey: Long, pszkeyname: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptOpenStorageProvider(phprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptProtectSecret(hdescriptor: Long, dwflags: Int, pbdata: Long, cbdata: Int, pmempara: Long, hwnd: Long, ppbprotectedblob: Long, pcbprotectedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptQueryProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, pcdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptRegisterProtectionDescriptorName(pwszname: Long, pwszdescriptorstring: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptSecretAgreement(hprivkey: Long, hpubkey: Long, phagreedsecret: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptSetProperty(hobject: Long, pszproperty: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptSignHash(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptStreamClose(hstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptStreamOpenToProtect(hdescriptor: Long, dwflags: Int, hwnd: Long, pstreaminfo: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotect(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotectEx(pstreaminfo: Long, dwflags: Int, hwnd: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptStreamUpdate(hstream: Long, pbdata: Long, cbdata: Long, ffinal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptTranslateHandle(phprovider: Long, phkey: Long, hlegacyprov: Long, hlegacykey: Long, dwlegacykeyspec: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptUnprotectSecret(phdescriptor: Long, dwflags: Int, pbprotectedblob: Long, cbprotectedblob: Int, pmempara: Long, hwnd: Long, ppbdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptVerifyClaim(hsubjectkey: Long, hauthoritykey: Long, dwclaimtype: Int, pparameterlist: Long, pbclaimblob: Long, cbclaimblob: Int, poutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_nCryptVerifySignature(hkey: Long, ppaddinginfo: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_pFXExportCertStore(hstore: Long, ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_pFXExportCertStoreEx(hstore: Long, ppfx: Long, szpassword: Long, pvpara: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_pFXImportCertStore(ppfx: Long, szpassword: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_pFXIsPFXBlob(ppfx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_pFXVerifyPassword(ppfx: Long, szpassword: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_processPrng(pbdata: Long, cbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, pcbsig: Long, ppsig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerFreeSignerContext(psignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerSign(psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerSignEx(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerSignEx2(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerSignEx3(dwflags: Int, psubjectinfo: Long, psignercert: Long, psignatureinfo: Long, pproviderinfo: Long, dwtimestampflags: Int, psztimestampalgorithmoid: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, pdigestsigninfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerTimeStamp(psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerTimeStampEx(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerTimeStampEx2(dwflags: Int, psubjectinfo: Long, pwszhttptimestamp: Long, dwalgid: Int, psrequest: Long, psipdata: Long, ppsignercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_signerTimeStampEx3(dwflags: Int, dwindex: Int, psubjectinfo: Long, pwszhttptimestamp: Long, pszalgorithmoid: Long, psrequest: Long, psipdata: Long, ppsignercontext: Long, pcryptopolicy: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslChangeNotify(hevent: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslComputeClientAuthHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pszalgid: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslComputeEapKeyBlock(hsslprovider: Long, hmasterkey: Long, pbrandoms: Long, cbrandoms: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslComputeFinishedHash(hsslprovider: Long, hmasterkey: Long, hhandshakehash: Long, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslComputeSessionHash(hsslprovider: Long, hhandshakehash: Long, dwprotocol: Int, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslCreateClientAuthHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, pszhashalgid: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslCreateEphemeralKey(hsslprovider: Long, phephemeralkey: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, dwkeybitlen: Int, pbparams: Long, cbparams: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslCreateHandshakeHash(hsslprovider: Long, phhandshakehash: Long, dwprotocol: Int, dwciphersuite: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslDecrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslDecryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslDuplicateTranscriptHash(hsslprovider: Long, htranscripthash: Long, phtranscripthash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslEncryptPacket(hsslprovider: Long, hkey: Long, pbinput: Long, cbinput: Int, pboutput: Long, cboutput: Int, pcbresult: Long, sequencenumber: Long, dwcontenttype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslEnumCipherSuites(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslEnumCipherSuitesEx(hsslprovider: Long, hprivatekey: Long, ppciphersuite: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslEnumEccCurves(hsslprovider: Long, pecccurvecount: Long, ppecccurve: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslEnumProtocolProviders(pdwprovidercount: Long, ppproviderlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandBinderKey(hsslprovider: Long, hearlykey: Long, phbinderkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandExporterMasterKey(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phexportermasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandPreSharedKey(hsslprovider: Long, hresumptionmasterkey: Long, pbticketnonce: Long, cbticketnonce: Int, phpresharedkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandResumptionMasterKey(hsslprovider: Long, hmasterkey: Long, hhashvalue: Long, phresumptionmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandTrafficKeys(hsslprovider: Long, hbasekey: Long, hhashvalue: Long, phclienttraffickey: Long, phservertraffickey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExpandWriteKey(hsslprovider: Long, hbasetraffickey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExportKey(hsslprovider: Long, hkey: Long, pszblobtype: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExportKeyingMaterial(hsslprovider: Long, hmasterkey: Long, slabel: Long, pbrandoms: Long, cbrandoms: Int, pbcontextvalue: Long, cbcontextvalue: Short, pboutput: Long, cboutput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExtractEarlyKey(hsslprovider: Long, hpresharedkey: Long, phearlykey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExtractHandshakeKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, hearlykey: Long, phhandshakekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslExtractMasterKey(hsslprovider: Long, hhandshakekey: Long, phmasterkey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslFreeBuffer(pvinput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslFreeObject(hobject: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGenerateMasterKey(hsslprovider: Long, hprivatekey: Long, hpublickey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGeneratePreMasterKey(hsslprovider: Long, hpublickey: Long, phpremasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pboutput: Long, cboutput: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGenerateSessionKeys(hsslprovider: Long, hmasterkey: Long, phreadkey: Long, phwritekey: Long, pparameterlist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGetCipherSuitePRFHashAlgorithm(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, szprfhash: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGetKeyProperty(hkey: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslGetProviderProperty(hsslprovider: Long, pszproperty: Long, ppboutput: Long, pcboutput: Long, ppenumstate: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslHashHandshake(hsslprovider: Long, hhandshakehash: Long, pbinput: Long, cbinput: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslImportKey(hsslprovider: Long, phkey: Long, pszblobtype: Long, pbkeyblob: Long, cbkeyblob: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslImportMasterKey(hsslprovider: Long, hprivatekey: Long, phmasterkey: Long, dwprotocol: Int, dwciphersuite: Int, pparameterlist: Long, pbencryptedkey: Long, cbencryptedkey: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslIncrementProviderReferenceCount(hsslprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslLookupCipherLengths(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pcipherlengths: Long, cbcipherlengths: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslLookupCipherSuiteInfo(hsslprovider: Long, dwprotocol: Int, dwciphersuite: Int, dwkeytype: Int, pciphersuite: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslOpenPrivateKey(hsslprovider: Long, phprivatekey: Long, pcertcontext: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslOpenProvider(phsslprovider: Long, pszprovidername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslSignHash(hsslprovider: Long, hprivatekey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, pcbresult: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_sslVerifySignature(hsslprovider: Long, hpublickey: Long, pbhashvalue: Long, cbhashvalue: Int, pbsignature: Long, cbsignature: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_systemPrng(pbrandomdata: Long, cbrandomdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_transformBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_transformFinalBlock(hcrypto: Long, cbindata: Int, pindata: Long, pcboutdata: Long, ppoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_verifyHash(hcrypto: Long, cbhash: Int, phash: Long, hashalgoid: Long, cbsig: Int, psig: Long, pfverified: Long): Int
}

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptAddContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), dwposition.toInt())

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptAddContextFunctionProvider(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pszprovider?.value ?: 0L), dwposition.toInt())

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptCloseAlgorithmProvider((halgorithm?.value ?: 0L), dwflags.toInt())

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptConfigureContext(dwtable.toInt(), (pszcontext?.value ?: 0L), (pconfig?.value ?: 0L))

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptConfigureContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pconfig?.value ?: 0L))

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptCreateContext(dwtable.toInt(), (pszcontext?.value ?: 0L), (pconfig?.value ?: 0L))

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptCreateHash((halgorithm?.value ?: 0L), (phhash?.value ?: 0L), (pbhashobject?.value ?: 0L), cbhashobject.toInt(), (pbsecret?.value ?: 0L), cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, nhashes: UInt, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptCreateMultiHash((halgorithm?.value ?: 0L), (phhash?.value ?: 0L), nhashes.toInt(), (pbhashobject?.value ?: 0L), cbhashobject.toInt(), (pbsecret?.value ?: 0L), cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDecrypt((hkey?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), (ppaddinginfo?.value ?: 0L), (pbiv?.value ?: 0L), cbiv.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDeleteContext(dwtable.toInt(), (pszcontext?.value ?: 0L))

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDeriveKey((hsharedsecret?.value ?: 0L), (pwszkdf?.value ?: 0L), (pparameterlist?.value ?: 0L), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDeriveKeyCapi((hhash?.value ?: 0L), (htargetalg?.value ?: 0L), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), dwflags.toInt())

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: COpaquePointer?, cbpassword: UInt, pbsalt: COpaquePointer?, cbsalt: UInt, citerations: ULong, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDeriveKeyPBKDF2((hprf?.value ?: 0L), (pbpassword?.value ?: 0L), cbpassword.toInt(), (pbsalt?.value ?: 0L), cbsalt.toInt(), citerations.toLong(), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), dwflags.toInt())

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDestroyHash((hhash?.value ?: 0L))

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDestroyKey((hkey?.value ?: 0L))

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDestroySecret((hsecret?.value ?: 0L))

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDuplicateHash((hhash?.value ?: 0L), (phnewhash?.value ?: 0L), (pbhashobject?.value ?: 0L), cbhashobject.toInt(), dwflags.toInt())

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptDuplicateKey((hkey?.value ?: 0L), (phnewkey?.value ?: 0L), (pbkeyobject?.value ?: 0L), cbkeyobject.toInt(), dwflags.toInt())

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEncrypt((hkey?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), (ppaddinginfo?.value ?: 0L), (pbiv?.value ?: 0L), cbiv.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumAlgorithms(dwalgoperations.toInt(), (palgcount?.value ?: 0L), (ppalglist?.value ?: 0L), dwflags.toInt())

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctionProviders(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctions(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumContexts(dwtable.toInt(), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: COpaquePointer?, ppimpllist: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumProviders((pszalgid?.value ?: 0L), (pimplcount?.value ?: 0L), (ppimpllist?.value ?: 0L), dwflags.toInt())

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptEnumRegisteredProviders((pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptExportKey((hkey?.value ?: 0L), (hexportkey?.value ?: 0L), (pszblobtype?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptFinalizeKeyPair((hkey?.value ?: 0L), dwflags.toInt())

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptFinishHash((hhash?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), dwflags.toInt())

public actual fun bCryptFreeBuffer(pvbuffer: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptFreeBuffer((pvbuffer?.value ?: 0L))
}

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: COpaquePointer?, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptGenRandom((halgorithm?.value ?: 0L), (pbbuffer?.value ?: 0L), cbbuffer.toInt(), dwflags.toInt())

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, dwlength: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptGenerateKeyPair((halgorithm?.value ?: 0L), (phkey?.value ?: 0L), dwlength.toInt(), dwflags.toInt())

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptGenerateSymmetricKey((halgorithm?.value ?: 0L), (phkey?.value ?: 0L), (pbkeyobject?.value ?: 0L), cbkeyobject.toInt(), (pbsecret?.value ?: 0L), cbsecret.toInt(), dwflags.toInt())

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptGetFipsAlgorithmMode((pfenabled?.value ?: 0L))

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptGetProperty((hobject?.value ?: 0L), (pszproperty?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: COpaquePointer?, cbsecret: UInt, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptHash((halgorithm?.value ?: 0L), (pbsecret?.value ?: 0L), cbsecret.toInt(), (pbinput?.value ?: 0L), cbinput.toInt(), (pboutput?.value ?: 0L), cboutput.toInt())

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptHashData((hhash?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptImportKey((halgorithm?.value ?: 0L), (himportkey?.value ?: 0L), (pszblobtype?.value ?: 0L), (phkey?.value ?: 0L), (pbkeyobject?.value ?: 0L), cbkeyobject.toInt(), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptImportKeyPair((halgorithm?.value ?: 0L), (himportkey?.value ?: 0L), (pszblobtype?.value ?: 0L), (phkey?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptKeyDerivation((hkey?.value ?: 0L), (pparameterlist?.value ?: 0L), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: COpaquePointer?, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptOpenAlgorithmProvider((phalgorithm?.value ?: 0L), (pszalgid?.value ?: 0L), (pszimplementation?.value ?: 0L), dwflags.toInt())

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: COpaquePointer?, cboperations: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptProcessMultiOperations((hobject?.value ?: 0L), operationtype, (poperations?.value ?: 0L), cboperations.toInt(), dwflags.toInt())

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptQueryContextConfiguration(dwtable.toInt(), (pszcontext?.value ?: 0L), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionConfiguration(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionProperty(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pszproperty?.value ?: 0L), (pcbvalue?.value ?: 0L), (ppbvalue?.value ?: 0L))

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptQueryProviderRegistration((pszprovider?.value ?: 0L), dwmode.toInt(), dwinterface.toInt(), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptRegisterConfigChangeNotify(phevent: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptRegisterConfigChangeNotify((phevent?.value ?: 0L))

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptRegisterProvider((pszprovider?.value ?: 0L), dwflags.toInt(), (preg?.value ?: 0L))

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L))

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunctionProvider(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pszprovider?.value ?: 0L))

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptResolveProviders((pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pszprovider?.value ?: 0L), dwmode.toInt(), dwflags.toInt(), (pcbbuffer?.value ?: 0L), (ppbuffer?.value ?: 0L))

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptSecretAgreement((hprivkey?.value ?: 0L), (hpubkey?.value ?: 0L), (phagreedsecret?.value ?: 0L), dwflags.toInt())

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptSetContextFunctionProperty(dwtable.toInt(), (pszcontext?.value ?: 0L), dwinterface.toInt(), (pszfunction?.value ?: 0L), (pszproperty?.value ?: 0L), cbvalue.toInt(), (pbvalue?.value ?: 0L))

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptSetProperty((hobject?.value ?: 0L), (pszproperty?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptSignHash((hkey?.value ?: 0L), (ppaddinginfo?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptUnregisterConfigChangeNotify((hevent?.value ?: 0L))

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptUnregisterProvider((pszprovider?.value ?: 0L))

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhash: COpaquePointer?, cbhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_bCryptVerifySignature((hkey?.value ?: 0L), (ppaddinginfo?.value ?: 0L), (pbhash?.value ?: 0L), cbhash.toInt(), (pbsignature?.value ?: 0L), cbsignature.toInt(), dwflags.toInt())

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCRLContextToStore((hcertstore?.value ?: 0L), (pcrlcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCRLLinkToStore((hcertstore?.value ?: 0L), (pcrlcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCTLContextToStore((hcertstore?.value ?: 0L), (pctlcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCTLLinkToStore((hcertstore?.value ?: 0L), (pctlcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCertificateContextToStore((hcertstore?.value ?: 0L), (pcertcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddCertificateLinkToStore((hcertstore?.value ?: 0L), (pcertcontext?.value ?: 0L), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L))

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEncodedCRLToStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), (pbcrlencoded?.value ?: 0L), cbcrlencoded.toInt(), dwadddisposition.toInt(), (ppcrlcontext?.value ?: 0L))

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: COpaquePointer?, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEncodedCTLToStore((hcertstore?.value ?: 0L), dwmsgandcertencodingtype.toInt(), (pbctlencoded?.value ?: 0L), cbctlencoded.toInt(), dwadddisposition.toInt(), (ppctlcontext?.value ?: 0L))

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), (pbcertencoded?.value ?: 0L), cbcertencoded.toInt(), dwadddisposition.toInt(), (ppcertcontext?.value ?: 0L))

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreA((szcertstorename?.value ?: 0L), (pbcertencoded?.value ?: 0L), cbcertencoded.toInt())

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreW((szcertstorename?.value ?: 0L), (pbcertencoded?.value ?: 0L), cbcertencoded.toInt())

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddEnhancedKeyUsageIdentifier((pcertcontext?.value ?: 0L), (pszusageidentifier?.value ?: 0L))

public actual fun certAddRefServerOcspResponse(hserverocspresponse: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponse((hserverocspresponse?.value ?: 0L))
}

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponseContext((pserverocspresponsecontext?.value ?: 0L))
}

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: COpaquePointer?, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddSerializedElementToStore((hcertstore?.value ?: 0L), (pbelement?.value ?: 0L), cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), (pdwcontexttype?.value ?: 0L), (ppvcontext?.value ?: 0L))

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAddStoreToCollection((hcollectionstore?.value ?: 0L), (hsiblingstore?.value ?: 0L), dwupdateflags.toInt(), dwpriority.toInt())

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certAlgIdToOID(dwalgid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certCloseServerOcspResponse(hserverocspresponse: COpaquePointer?, dwflags: UInt) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCloseServerOcspResponse((hserverocspresponse?.value ?: 0L), dwflags.toInt())
}

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCloseStore((hcertstore?.value ?: 0L), dwflags.toInt())

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: COpaquePointer?, pcertid2: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCompareCertificate(dwcertencodingtype.toInt(), (pcertid1?.value ?: 0L), (pcertid2?.value ?: 0L))

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: COpaquePointer?, pcertname2: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCompareCertificateName(dwcertencodingtype.toInt(), (pcertname1?.value ?: 0L), (pcertname2?.value ?: 0L))

public actual fun certCompareIntegerBlob(pint1: COpaquePointer?, pint2: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCompareIntegerBlob((pint1?.value ?: 0L), (pint2?.value ?: 0L))

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: COpaquePointer?, ppublickey2: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certComparePublicKeyInfo(dwcertencodingtype.toInt(), (ppublickey1?.value ?: 0L), (ppublickey2?.value ?: 0L))

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certControlStore((hcertstore?.value ?: 0L), dwflags.toInt(), dwctrltype.toInt(), (pvctrlpara?.value ?: 0L))

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateCRLContext(dwcertencodingtype.toInt(), (pbcrlencoded?.value ?: 0L), cbcrlencoded.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: COpaquePointer?, cbctlencoded: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateCTLContext(dwmsgandcertencodingtype.toInt(), (pbctlencoded?.value ?: 0L), cbctlencoded.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: COpaquePointer?, coptattr: UInt, rgoptattr: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pctlentry: COpaquePointer?, pcbctlentry: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateCTLEntryFromCertificateContextProperties((pcertcontext?.value ?: 0L), coptattr.toInt(), (rgoptattr?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (pctlentry?.value ?: 0L), (pcbctlentry?.value ?: 0L))

public actual fun certCreateCertificateChainEngine(pconfig: COpaquePointer?, phchainengine: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateCertificateChainEngine((pconfig?.value ?: 0L), (phchainengine?.value ?: 0L))

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateCertificateContext(dwcertencodingtype.toInt(), (pbcertencoded?.value ?: 0L), cbcertencoded.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pcreatepara: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), (pbencoded?.value ?: 0L), cbencoded.toInt(), dwflags.toInt(), (pcreatepara?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: COpaquePointer?, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pstarttime: COpaquePointer?, pendtime: COpaquePointer?, pextensions: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certCreateSelfSignCertificate(hcryptprovorncryptkey.toLong(), (psubjectissuerblob?.value ?: 0L), dwflags.toInt(), (pkeyprovinfo?.value ?: 0L), (psignaturealgorithm?.value ?: 0L), (pstarttime?.value ?: 0L), (pendtime?.value ?: 0L), (pextensions?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certDeleteCRLFromStore(pcrlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDeleteCRLFromStore((pcrlcontext?.value ?: 0L))

public actual fun certDeleteCTLFromStore(pctlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDeleteCTLFromStore((pctlcontext?.value ?: 0L))

public actual fun certDeleteCertificateFromStore(pcertcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDeleteCertificateFromStore((pcertcontext?.value ?: 0L))

public actual fun certDuplicateCRLContext(pcrlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDuplicateCRLContext((pcrlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certDuplicateCTLContext(pctlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDuplicateCTLContext((pctlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certDuplicateCertificateChain(pchaincontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDuplicateCertificateChain((pchaincontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certDuplicateCertificateContext(pcertcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDuplicateCertificateContext((pcertcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certDuplicateStore((hcertstore?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certEnumCRLContextProperties(pcrlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCRLContextProperties((pcrlcontext?.value ?: 0L), dwpropid.toInt()).toUInt()

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCRLsInStore((hcertstore?.value ?: 0L), (pprevcrlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certEnumCTLContextProperties(pctlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCTLContextProperties((pctlcontext?.value ?: 0L), dwpropid.toInt()).toUInt()

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCTLsInStore((hcertstore?.value ?: 0L), (pprevctlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certEnumCertificateContextProperties(pcertcontext: COpaquePointer?, dwpropid: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCertificateContextProperties((pcertcontext?.value ?: 0L), dwpropid.toInt()).toUInt()

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumCertificatesInStore((hcertstore?.value ?: 0L), (pprevcertcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certEnumPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumPhysicalStore): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumPhysicalStore((pvsystemstore?.value ?: 0L), dwflags.toInt(), (pvarg?.value ?: 0L), 0L)

public actual fun certEnumSubjectInSortedCTL(pctlcontext: COpaquePointer?, ppvnextsubject: COpaquePointer?, psubjectidentifier: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumSubjectInSortedCTL((pctlcontext?.value ?: 0L), (ppvnextsubject?.value ?: 0L), (psubjectidentifier?.value ?: 0L), (pencodedattributes?.value ?: 0L))

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStore): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumSystemStore(dwflags.toInt(), (pvsystemstorelocationpara?.value ?: 0L), (pvarg?.value ?: 0L), 0L)

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certEnumSystemStoreLocation(dwflags.toInt(), (pvarg?.value ?: 0L), 0L)

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindAttribute((pszobjid?.value ?: 0L), cattr.toInt(), (rgattr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindCRLInStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L), (pprevcrlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: COpaquePointer?, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindCTLInStore((hcertstore?.value ?: 0L), dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L), (pprevctlcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindCertificateInCRL(pcert: COpaquePointer?, pcrlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppcrlentry: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindCertificateInCRL((pcert?.value ?: 0L), (pcrlcontext?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (ppcrlentry?.value ?: 0L))

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: COpaquePointer?, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindCertificateInStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L), (pprevcertcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevchaincontext: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindChainInStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L), (pprevchaincontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindExtension((pszobjid?.value ?: 0L), cextensions.toInt(), (rgextensions?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindRDNAttr((pszobjid?.value ?: 0L), (pname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L), (pctlcontext?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFindSubjectInSortedCTL((psubjectidentifier?.value ?: 0L), (pctlcontext?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (pencodedattributes?.value ?: 0L))

public actual fun certFreeCRLContext(pcrlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCRLContext((pcrlcontext?.value ?: 0L))

public actual fun certFreeCTLContext(pctlcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCTLContext((pctlcontext?.value ?: 0L))

public actual fun certFreeCertificateChain(pchaincontext: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCertificateChain((pchaincontext?.value ?: 0L))
}

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCertificateChainEngine((hchainengine?.value ?: 0L))
}

public actual fun certFreeCertificateChainList(prgpselection: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCertificateChainList((prgpselection?.value ?: 0L))
}

public actual fun certFreeCertificateContext(pcertcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeCertificateContext((pcertcontext?.value ?: 0L))

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certFreeServerOcspResponseContext((pserverocspresponsecontext?.value ?: 0L))
}

public actual fun certGetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetCRLContextProperty((pcrlcontext?.value ?: 0L), dwpropid.toInt(), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: COpaquePointer?, pprevcrlcontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetCRLFromStore((hcertstore?.value ?: 0L), (pissuercontext?.value ?: 0L), (pprevcrlcontext?.value ?: 0L), (pdwflags?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certGetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetCTLContextProperty((pctlcontext?.value ?: 0L), dwpropid.toInt(), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: COpaquePointer?, ptime: COpaquePointer?, hadditionalstore: Hcertstore, pchainpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppchaincontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetCertificateChain((hchainengine?.value ?: 0L), (pcertcontext?.value ?: 0L), (ptime?.value ?: 0L), (hadditionalstore?.value ?: 0L), (pchainpara?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (ppchaincontext?.value ?: 0L))

public actual fun certGetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetCertificateContextProperty((pcertcontext?.value ?: 0L), dwpropid.toInt(), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun certGetEnhancedKeyUsage(pcertcontext: COpaquePointer?, dwflags: UInt, pusage: COpaquePointer?, pcbusage: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetEnhancedKeyUsage((pcertcontext?.value ?: 0L), dwflags.toInt(), (pusage?.value ?: 0L), (pcbusage?.value ?: 0L))

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: COpaquePointer?, pbkeyusage: COpaquePointer?, cbkeyusage: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetIntendedKeyUsage(dwcertencodingtype.toInt(), (pcertinfo?.value ?: 0L), (pbkeyusage?.value ?: 0L), cbkeyusage.toInt())

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: COpaquePointer?, pprevissuercontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetIssuerCertificateFromStore((hcertstore?.value ?: 0L), (psubjectcontext?.value ?: 0L), (pprevissuercontext?.value ?: 0L), (pdwflags?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certGetNameStringA(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pstr, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetNameStringA((pcertcontext?.value ?: 0L), dwtype.toInt(), dwflags.toInt(), (pvtypepara?.value ?: 0L), (psznamestring?.value ?: 0L), cchnamestring.toInt()).toUInt()

public actual fun certGetNameStringW(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetNameStringW((pcertcontext?.value ?: 0L), dwtype.toInt(), dwflags.toInt(), (pvtypepara?.value ?: 0L), (psznamestring?.value ?: 0L), cchnamestring.toInt()).toUInt()

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: COpaquePointer?): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetPublicKeyLength(dwcertencodingtype.toInt(), (ppublickey?.value ?: 0L)).toUInt()

public actual fun certGetServerOcspResponseContext(hserverocspresponse: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetServerOcspResponseContext((hserverocspresponse?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetStoreProperty((hcertstore?.value ?: 0L), dwpropid.toInt(), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetSubjectCertificateFromStore((hcertstore?.value ?: 0L), dwcertencodingtype.toInt(), (pcertid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: COpaquePointer?, cnumoids: COpaquePointer?, rghoids: COpaquePointer?, pcboids: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certGetValidUsages(ccerts.toInt(), (rghcerts?.value ?: 0L), (cnumoids?.value ?: 0L), (rghoids?.value ?: 0L), (pcboids?.value ?: 0L))

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: COpaquePointer?, prdn: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), (pcertname?.value ?: 0L), (prdn?.value ?: 0L))

public actual fun certIsStrongHashToSign(pstrongsignpara: COpaquePointer?, pwszcnghashalgid: Pcwstr, psigningcert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certIsStrongHashToSign((pstrongsignpara?.value ?: 0L), (pwszcnghashalgid?.value ?: 0L), (psigningcert?.value ?: 0L))

public actual fun certIsValidCRLForCertificate(pcert: COpaquePointer?, pcrl: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certIsValidCRLForCertificate((pcert?.value ?: 0L), (pcrl?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: COpaquePointer?, ptimestamp: COpaquePointer?, pwszfilename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certIsWeakHash(dwhashusetype.toInt(), (pwszcnghashalgid?.value ?: 0L), dwchainflags.toInt(), (psignerchaincontext?.value ?: 0L), (ptimestamp?.value ?: 0L), (pwszfilename?.value ?: 0L))

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certNameToStrA(dwcertencodingtype.toInt(), (pname?.value ?: 0L), dwstrtype.toInt(), (psz?.value ?: 0L), csz.toInt()).toUInt()

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certNameToStrW(dwcertencodingtype.toInt(), (pname?.value ?: 0L), dwstrtype.toInt(), (psz?.value ?: 0L), csz.toInt()).toUInt()

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certOIDToAlgId((pszobjid?.value ?: 0L)).toUInt()

public actual fun certOpenServerOcspResponse(pchaincontext: COpaquePointer?, dwflags: UInt, popenpara: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certOpenServerOcspResponse((pchaincontext?.value ?: 0L), dwflags.toInt(), (popenpara?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: COpaquePointer?): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certOpenStore((lpszstoreprovider?.value ?: 0L), dwencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), (pvpara?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certOpenSystemStoreA(hprov.toLong(), (szsubsystemprotocol?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certOpenSystemStoreW(hprov.toLong(), (szsubsystemprotocol?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRDNValueToStrA(dwvaluetype.toInt(), (pvalue?.value ?: 0L), (psz?.value ?: 0L), csz.toInt()).toUInt()

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pwstr, csz: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRDNValueToStrW(dwvaluetype.toInt(), (pvalue?.value ?: 0L), (psz?.value ?: 0L), csz.toInt()).toUInt()

public actual fun certRegisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRegisterPhysicalStore((pvsystemstore?.value ?: 0L), dwflags.toInt(), (pwszstorename?.value ?: 0L), (pstoreinfo?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun certRegisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRegisterSystemStore((pvsystemstore?.value ?: 0L), dwflags.toInt(), (pstoreinfo?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRemoveEnhancedKeyUsageIdentifier((pcertcontext?.value ?: 0L), (pszusageidentifier?.value ?: 0L))

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRemoveStoreFromCollection((hcollectionstore?.value ?: 0L), (hsiblingstore?.value ?: 0L))
}

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certResyncCertificateChainEngine((hchainengine?.value ?: 0L))

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: COpaquePointer?, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: COpaquePointer?, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?, ppwszmimetype: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certRetrieveLogoOrBiometricInfo((pcertcontext?.value ?: 0L), (lpszlogoorbiometrictype?.value ?: 0L), dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L), (ppbdata?.value ?: 0L), (pcbdata?.value ?: 0L), (ppwszmimetype?.value ?: 0L))

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSaveStore((hcertstore?.value ?: 0L), dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), (pvsavetopara?.value ?: 0L), dwflags.toInt())

public actual fun certSelectCertificateChains(pselectioncontext: COpaquePointer?, dwflags: UInt, pchainparameters: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, hstore: Hcertstore, pcselection: COpaquePointer?, pprgpselection: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSelectCertificateChains((pselectioncontext?.value ?: 0L), dwflags.toInt(), (pchainparameters?.value ?: 0L), ccriteria.toInt(), (rgpcriteria?.value ?: 0L), (hstore?.value ?: 0L), (pcselection?.value ?: 0L), (pprgpselection?.value ?: 0L))

public actual fun certSerializeCRLStoreElement(pcrlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSerializeCRLStoreElement((pcrlcontext?.value ?: 0L), dwflags.toInt(), (pbelement?.value ?: 0L), (pcbelement?.value ?: 0L))

public actual fun certSerializeCTLStoreElement(pctlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSerializeCTLStoreElement((pctlcontext?.value ?: 0L), dwflags.toInt(), (pbelement?.value ?: 0L), (pcbelement?.value ?: 0L))

public actual fun certSerializeCertificateStoreElement(pcertcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSerializeCertificateStoreElement((pcertcontext?.value ?: 0L), dwflags.toInt(), (pbelement?.value ?: 0L), (pcbelement?.value ?: 0L))

public actual fun certSetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetCRLContextProperty((pcrlcontext?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L))

public actual fun certSetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetCTLContextProperty((pctlcontext?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L))

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: COpaquePointer?, pctlentry: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetCertificateContextPropertiesFromCTLEntry((pcertcontext?.value ?: 0L), (pctlentry?.value ?: 0L), dwflags.toInt())

public actual fun certSetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetCertificateContextProperty((pcertcontext?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L))

public actual fun certSetEnhancedKeyUsage(pcertcontext: COpaquePointer?, pusage: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetEnhancedKeyUsage((pcertcontext?.value ?: 0L), (pusage?.value ?: 0L))

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certSetStoreProperty((hcertstore?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L))

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certStrToNameA(dwcertencodingtype.toInt(), (pszx500?.value ?: 0L), dwstrtype.toInt(), (pvreserved?.value ?: 0L), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L), (ppszerror?.value ?: 0L))

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certStrToNameW(dwcertencodingtype.toInt(), (pszx500?.value ?: 0L), dwstrtype.toInt(), (pvreserved?.value ?: 0L), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L), (ppszerror?.value ?: 0L))

public actual fun certUnregisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certUnregisterPhysicalStore((pvsystemstore?.value ?: 0L), dwflags.toInt(), (pwszstorename?.value ?: 0L))

public actual fun certUnregisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certUnregisterSystemStore((pvsystemstore?.value ?: 0L), dwflags.toInt())

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?, ccrlinfo: UInt, rgpcrlinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyCRLRevocation(dwcertencodingtype.toInt(), (pcertid?.value ?: 0L), ccrlinfo.toInt(), (rgpcrlinfo?.value ?: 0L))

public actual fun certVerifyCRLTimeValidity(ptimetoverify: COpaquePointer?, pcrlinfo: COpaquePointer?): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyCRLTimeValidity((ptimetoverify?.value ?: 0L), (pcrlinfo?.value ?: 0L))

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, psubjectusage: COpaquePointer?, dwflags: UInt, pverifyusagepara: COpaquePointer?, pverifyusagestatus: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L), (psubjectusage?.value ?: 0L), dwflags.toInt(), (pverifyusagepara?.value ?: 0L), (pverifyusagestatus?.value ?: 0L))

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: COpaquePointer?, ppolicypara: COpaquePointer?, ppolicystatus: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyCertificateChainPolicy((pszpolicyoid?.value ?: 0L), (pchaincontext?.value ?: 0L), (ppolicypara?.value ?: 0L), (ppolicystatus?.value ?: 0L))

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: COpaquePointer?, dwflags: UInt, prevpara: COpaquePointer?, prevstatus: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), (rgpvcontext?.value ?: 0L), dwflags.toInt(), (prevpara?.value ?: 0L), (prevstatus?.value ?: 0L))

public actual fun certVerifySubjectCertificateContext(psubject: COpaquePointer?, pissuer: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifySubjectCertificateContext((psubject?.value ?: 0L), (pissuer?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun certVerifyTimeValidity(ptimetoverify: COpaquePointer?, pcertinfo: COpaquePointer?): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyTimeValidity((ptimetoverify?.value ?: 0L), (pcertinfo?.value ?: 0L))

public actual fun certVerifyValidityNesting(psubjectinfo: COpaquePointer?, pissuerinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_certVerifyValidityNesting((psubjectinfo?.value ?: 0L), (pissuerinfo?.value ?: 0L))

public actual fun closeCryptoHandle(hcrypto: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_closeCryptoHandle((hcrypto?.value ?: 0L))

public actual fun cryptAcquireCertificatePrivateKey(pcert: COpaquePointer?, dwflags: CryptAcquireFlags, pvparameters: COpaquePointer?, phcryptprovorncryptkey: COpaquePointer?, pdwkeyspec: COpaquePointer?, pfcallerfreeprovorncryptkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptAcquireCertificatePrivateKey((pcert?.value ?: 0L), dwflags.toInt(), (pvparameters?.value ?: 0L), (phcryptprovorncryptkey?.value ?: 0L), (pdwkeyspec?.value ?: 0L), (pfcallerfreeprovorncryptkey?.value ?: 0L))

public actual fun cryptAcquireContextA(phprov: COpaquePointer?, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptAcquireContextA((phprov?.value ?: 0L), (szcontainer?.value ?: 0L), (szprovider?.value ?: 0L), dwprovtype.toInt(), dwflags.toInt())

public actual fun cryptAcquireContextW(phprov: COpaquePointer?, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptAcquireContextW((phprov?.value ?: 0L), (szcontainer?.value ?: 0L), (szprovider?.value ?: 0L), dwprovtype.toInt(), dwflags.toInt())

public actual fun cryptBinaryToStringA(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptBinaryToStringA((pbbinary?.value ?: 0L), cbbinary.toInt(), dwflags.toInt(), (pszstring?.value ?: 0L), (pcchstring?.value ?: 0L))

public actual fun cryptBinaryToStringW(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptBinaryToStringW((pbbinary?.value ?: 0L), cbbinary.toInt(), dwflags.toInt(), (pszstring?.value ?: 0L), (pcchstring?.value ?: 0L))

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptCloseAsyncHandle(hasync)

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptContextAddRef(hprov.toLong(), (pdwreserved?.value ?: 0L), dwflags.toInt())

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptCreateAsyncHandle(dwflags.toInt(), (phasync?.value ?: 0L))

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptCreateHash(hprov.toLong(), algid.toInt(), hkey.toLong(), dwflags.toInt(), (phhash?.value ?: 0L))

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: COpaquePointer?, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: COpaquePointer?, pbhash: COpaquePointer?, pcbhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), (pszpubkeyoid?.value ?: 0L), (ppubkeystruc?.value ?: 0L), cbpubkeystruc.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L), (pbhash?.value ?: 0L), (pcbhash?.value ?: 0L))

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencodedblob: COpaquePointer?, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: COpaquePointer?, pdwinnercontenttype: COpaquePointer?, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecodeMessage(dwmsgtypeflags.toInt(), (pdecryptpara?.value ?: 0L), (pverifypara?.value ?: 0L), dwsignerindex.toInt(), (pbencodedblob?.value ?: 0L), cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), (pdwmsgtype?.value ?: 0L), (pdwinnercontenttype?.value ?: 0L), (pbdecoded?.value ?: 0L), (pcbdecoded?.value ?: 0L), (ppxchgcert?.value ?: 0L), (ppsignercert?.value ?: 0L))

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecodeObject(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L), (pbencoded?.value ?: 0L), cbencoded.toInt(), dwflags.toInt(), (pvstructinfo?.value ?: 0L), (pcbstructinfo?.value ?: 0L))

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pdecodepara: COpaquePointer?, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecodeObjectEx(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L), (pbencoded?.value ?: 0L), cbencoded.toInt(), dwflags.toInt(), (pdecodepara?.value ?: 0L), (pvstructinfo?.value ?: 0L), (pcbstructinfo?.value ?: 0L))

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L))

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecryptAndVerifyMessageSignature((pdecryptpara?.value ?: 0L), (pverifypara?.value ?: 0L), dwsignerindex.toInt(), (pbencryptedblob?.value ?: 0L), cbencryptedblob.toInt(), (pbdecrypted?.value ?: 0L), (pcbdecrypted?.value ?: 0L), (ppxchgcert?.value ?: 0L), (ppsignercert?.value ?: 0L))

public actual fun cryptDecryptMessage(pdecryptpara: COpaquePointer?, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDecryptMessage((pdecryptpara?.value ?: 0L), (pbencryptedblob?.value ?: 0L), cbencryptedblob.toInt(), (pbdecrypted?.value ?: 0L), (pcbdecrypted?.value ?: 0L), (ppxchgcert?.value ?: 0L))

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDeriveKey(hprov.toLong(), algid.toInt(), hbasedata.toLong(), dwflags.toInt(), (phkey?.value ?: 0L))

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDestroyHash(hhash.toLong())

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDestroyKey(hkey.toLong())

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDuplicateHash(hhash.toLong(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (phhash?.value ?: 0L))

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptDuplicateKey(hkey.toLong(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (phkey?.value ?: 0L))

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEncodeObject(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L), (pvstructinfo?.value ?: 0L), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L))

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, dwflags: CryptEncodeObjectFlags, pencodepara: COpaquePointer?, pvencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEncodeObjectEx(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L), (pvstructinfo?.value ?: 0L), dwflags.toInt(), (pencodepara?.value ?: 0L), (pvencoded?.value ?: 0L), (pcbencoded?.value ?: 0L))

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwbuflen: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEncrypt(hkey.toLong(), hhash.toLong(), final, dwflags.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L), dwbuflen.toInt())

public actual fun cryptEncryptMessage(pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobeencrypted: COpaquePointer?, cbtobeencrypted: UInt, pbencryptedblob: COpaquePointer?, pcbencryptedblob: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEncryptMessage((pencryptpara?.value ?: 0L), crecipientcert.toInt(), (rgprecipientcert?.value ?: 0L), (pbtobeencrypted?.value ?: 0L), cbtobeencrypted.toInt(), (pbencryptedblob?.value ?: 0L), (pcbencryptedblob?.value ?: 0L))

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCryptEnumKeyidProp): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumKeyIdentifierProperties((pkeyidentifier?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L), (pvreserved?.value ?: 0L), (pvarg?.value ?: 0L), 0L)

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pszoid?.value ?: 0L), dwflags.toInt(), (pvarg?.value ?: 0L), 0L)

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), (pvarg?.value ?: 0L), 0L)

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pstr, pcbtypename: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesA(dwindex.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pdwprovtype?.value ?: 0L), (sztypename?.value ?: 0L), (pcbtypename?.value ?: 0L))

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pwstr, pcbtypename: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesW(dwindex.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pdwprovtype?.value ?: 0L), (sztypename?.value ?: 0L), (pcbtypename?.value ?: 0L))

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumProvidersA(dwindex.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pdwprovtype?.value ?: 0L), (szprovname?.value ?: 0L), (pcbprovname?.value ?: 0L))

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptEnumProvidersW(dwindex.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pdwprovtype?.value ?: 0L), (szprovname?.value ?: 0L), (pcbprovname?.value ?: 0L))

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptExportKey(hkey.toLong(), hexpkey.toLong(), dwblobtype.toInt(), dwflags.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L))

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pbprivatekeyblob: COpaquePointer?, pcbprivatekeyblob: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptExportPKCS8(hcryptprov.toLong(), dwkeyspec.toInt(), (pszprivatekeyobjid?.value ?: 0L), dwflags.toInt(), (pvauxinfo?.value ?: 0L), (pbprivatekeyblob?.value ?: 0L), (pcbprivatekeyblob?.value ?: 0L))

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfo(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L), (pcbinfo?.value ?: 0L))

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pszpublickeyobjid?.value ?: 0L), dwflags.toInt(), (pvauxinfo?.value ?: 0L), (pinfo?.value ?: 0L), (pcbinfo?.value ?: 0L))

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoFromBCryptKeyHandle((hbcryptkey?.value ?: 0L), dwcertencodingtype.toInt(), (pszpublickeyobjid?.value ?: 0L), dwflags.toInt(), (pvauxinfo?.value ?: 0L), (pinfo?.value ?: 0L), (pcbinfo?.value ?: 0L))

public actual fun cryptFindCertificateKeyProvInfo(pcert: COpaquePointer?, dwflags: CryptFindFlags, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptFindCertificateKeyProvInfo((pcert?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptFindLocalizedName((pwszcryptname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: COpaquePointer?, dwgroupid: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptFindOIDInfo(dwkeytype.toInt(), (pvkey?.value ?: 0L), dwgroupid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: COpaquePointer?, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, pbformat: COpaquePointer?, pcbformat: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), (pformatstruct?.value ?: 0L), (lpszstructtype?.value ?: 0L), (pbencoded?.value ?: 0L), cbencoded.toInt(), (pbformat?.value ?: 0L), (pcbformat?.value ?: 0L))

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptFreeOIDFunctionAddress((hfuncaddr?.value ?: 0L), dwflags.toInt())

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGenKey(hprov.toLong(), algid.toInt(), dwflags.toInt(), (phkey?.value ?: 0L))

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGenRandom(hprov.toLong(), dwlen.toInt(), (pbbuffer?.value ?: 0L))

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: COpaquePointer?, ppfnfree: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetAsyncParam(hasync, (pszparamoid?.value ?: 0L), (ppvparam?.value ?: 0L), (ppfnfree?.value ?: 0L))

public actual fun cryptGetDefaultOIDDllList(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDDllList((hfuncset?.value ?: 0L), dwencodingtype.toInt(), (pwszdlllist?.value ?: 0L), (pcchdlllist?.value ?: 0L))

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDFunctionAddress((hfuncset?.value ?: 0L), dwencodingtype.toInt(), (pwszdll?.value ?: 0L), dwflags.toInt(), (ppvfuncaddr?.value ?: 0L), (phfuncaddr?.value ?: 0L))

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderA(dwprovtype.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pszprovname?.value ?: 0L), (pcbprovname?.value ?: 0L))

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderW(dwprovtype.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt(), (pszprovname?.value ?: 0L), (pcbprovname?.value ?: 0L))

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetHashParam(hhash.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L), dwflags.toInt())

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetKeyIdentifierProperty((pkeyidentifier?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L), (pvreserved?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetKeyParam(hkey.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L), dwflags.toInt())

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toLong(), dwflags.toInt(), (pbsignedblob?.value ?: 0L), cbsignedblob.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Int =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetMessageSignerCount(dwmsgencodingtype.toInt(), (pbsignedblob?.value ?: 0L), cbsignedblob.toInt())

public actual fun cryptGetOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionAddress((hfuncset?.value ?: 0L), dwencodingtype.toInt(), (pszoid?.value ?: 0L), dwflags.toInt(), (ppvfuncaddr?.value ?: 0L), (phfuncaddr?.value ?: 0L))

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: COpaquePointer?, pbvaluedata: COpaquePointer?, pcbvaluedata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionValue(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pszoid?.value ?: 0L), (pwszvaluename?.value ?: 0L), (pdwvaluetype?.value ?: 0L), (pbvaluedata?.value ?: 0L), (pcbvaluedata?.value ?: 0L))

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: COpaquePointer?, dwflags: CryptGetUrlFlags, purlarray: COpaquePointer?, pcburlarray: COpaquePointer?, purlinfo: COpaquePointer?, pcburlinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetObjectUrl((pszurloid?.value ?: 0L), (pvpara?.value ?: 0L), dwflags.toInt(), (purlarray?.value ?: 0L), (pcburlarray?.value ?: 0L), (purlinfo?.value ?: 0L), (pcburlinfo?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetProvParam(hprov.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), (pdwdatalen?.value ?: 0L), dwflags.toInt())

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptGetUserKey(hprov.toLong(), dwkeyspec.toInt(), (phuserkey?.value ?: 0L))

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashCertificate(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), (pbencoded?.value ?: 0L), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashCertificate2((pwszcnghashalgid?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (pbencoded?.value ?: 0L), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptHashData(hhash: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashData(hhash.toLong(), (pbdata?.value ?: 0L), dwdatalen.toInt(), dwflags.toInt())

public actual fun cryptHashMessage(phashpara: COpaquePointer?, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbhashedblob: COpaquePointer?, pcbhashedblob: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashMessage((phashpara?.value ?: 0L), fdetachedhash, ctobehashed.toInt(), (rgpbtobehashed?.value ?: 0L), (rgcbtobehashed?.value ?: 0L), (pbhashedblob?.value ?: 0L), (pcbhashedblob?.value ?: 0L), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashPublicKeyInfo(hcryptprov.toLong(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashSessionKey(hhash.toLong(), hkey.toLong(), dwflags.toInt())

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptHashToBeSigned(hcryptprov.toLong(), dwcertencodingtype.toInt(), (pbencoded?.value ?: 0L), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptImportKey(hprov: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptImportKey(hprov.toLong(), (pbdata?.value ?: 0L), dwdatalen.toInt(), hpubkey.toLong(), dwflags.toInt(), (phkey?.value ?: 0L))

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: COpaquePointer?, pvauxinfo: COpaquePointer?): Bool =
    0

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfo(hcryptprov.toLong(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L), (phkey?.value ?: 0L))

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L), aikeyalg.toInt(), dwflags.toInt(), (pvauxinfo?.value ?: 0L), (phkey?.value ?: 0L))

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, dwflags: CryptImportPublicKeyFlags, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), (pinfo?.value ?: 0L), dwflags.toInt(), (pvauxinfo?.value ?: 0L), (phkey?.value ?: 0L))

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptInitOIDFunctionSet((pszfuncname?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptInstallCancelRetrieval(0L, (pvarg?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: COpaquePointer?, dwflags: CryptDefaultContextFlags, pvreserved: COpaquePointer?, phdefaultcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptInstallDefaultContext(hcryptprov.toLong(), dwdefaulttype.toInt(), (pvdefaultpara?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L), (phdefaultcontext?.value ?: 0L))

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptInstallOIDFunctionAddress((hmodule?.value ?: 0L), dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), cfuncentry.toInt(), (rgfuncentry?.value ?: 0L), dwflags.toInt())

public actual fun cryptMemAlloc(cbsize: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMemAlloc(cbsize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptMemFree(pv: COpaquePointer?) {
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMemFree((pv?.value ?: 0L))
}

public actual fun cryptMemRealloc(pv: COpaquePointer?, cbsize: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMemRealloc((pv?.value ?: 0L), cbsize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), (pvmsgencodeinfo?.value ?: 0L), (pszinnercontentobjid?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun cryptMsgClose(hcryptmsg: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgClose((hcryptmsg?.value ?: 0L))

public actual fun cryptMsgControl(hcryptmsg: COpaquePointer?, dwflags: UInt, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgControl((hcryptmsg?.value ?: 0L), dwflags.toInt(), dwctrltype.toInt(), (pvctrlpara?.value ?: 0L))

public actual fun cryptMsgCountersign(hcryptmsg: COpaquePointer?, dwindex: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgCountersign((hcryptmsg?.value ?: 0L), dwindex.toInt(), ccountersigners.toInt(), (rgcountersigners?.value ?: 0L))

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?, pbcountersignature: COpaquePointer?, pcbcountersignature: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgCountersignEncoded(dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L), cbsignerinfo.toInt(), ccountersigners.toInt(), (rgcountersigners?.value ?: 0L), (pbcountersignature?.value ?: 0L), (pcbcountersignature?.value ?: 0L))

public actual fun cryptMsgDuplicate(hcryptmsg: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgDuplicate((hcryptmsg?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: COpaquePointer?, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), (pctlinfo?.value ?: 0L), (psigninfo?.value ?: 0L), dwflags.toInt(), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L))

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: COpaquePointer?, csignerstore: UInt, rghsignerstore: COpaquePointer?, dwflags: UInt, ppsigner: COpaquePointer?, pdwsignerindex: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgGetAndVerifySigner((hcryptmsg?.value ?: 0L), csignerstore.toInt(), (rghsignerstore?.value ?: 0L), dwflags.toInt(), (ppsigner?.value ?: 0L), (pdwsignerindex?.value ?: 0L))

public actual fun cryptMsgGetParam(hcryptmsg: COpaquePointer?, dwparamtype: UInt, dwindex: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgGetParam((hcryptmsg?.value ?: 0L), dwparamtype.toInt(), dwindex.toInt(), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: COpaquePointer?, pstreaminfo: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toLong(), (precipientinfo?.value ?: 0L), (pstreaminfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, pstreaminfo: COpaquePointer?): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), (pvmsgencodeinfo?.value ?: 0L), (pszinnercontentobjid?.value ?: 0L), (pstreaminfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: COpaquePointer?, cbctlcontent: UInt, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgSignCTL(dwmsgencodingtype.toInt(), (pbctlcontent?.value ?: 0L), cbctlcontent.toInt(), (psigninfo?.value ?: 0L), dwflags.toInt(), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L))

public actual fun cryptMsgUpdate(hcryptmsg: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, ffinal: Bool): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgUpdate((hcryptmsg?.value ?: 0L), (pbdata?.value ?: 0L), cbdata.toInt(), ffinal)

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, pcicountersigner: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncoded(hcryptprov.toLong(), dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L), cbsignerinfo.toInt(), (pbsignerinfocountersignature?.value ?: 0L), cbsignerinfocountersignature.toInt(), (pcicountersigner?.value ?: 0L))

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: COpaquePointer?, dwflags: UInt, pvextra: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toLong(), dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L), cbsignerinfo.toInt(), (pbsignerinfocountersignature?.value ?: 0L), cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), (pvsigner?.value ?: 0L), dwflags.toInt(), (pvextra?.value ?: 0L))

public actual fun cryptProtectData(pdatain: COpaquePointer?, szdatadescr: Pcwstr, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptProtectData((pdatain?.value ?: 0L), (szdatadescr?.value ?: 0L), (poptionalentropy?.value ?: 0L), (pvreserved?.value ?: 0L), (ppromptstruct?.value ?: 0L), dwflags.toInt(), (pdataout?.value ?: 0L))

public actual fun cryptProtectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptProtectMemory((pdatain?.value ?: 0L), cbdatain.toInt(), dwflags.toInt())

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: COpaquePointer?, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: COpaquePointer?, pdwcontenttype: COpaquePointer?, pdwformattype: COpaquePointer?, phcertstore: COpaquePointer?, phmsg: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptQueryObject(dwobjecttype.toInt(), (pvobject?.value ?: 0L), dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), (pdwmsgandcertencodingtype?.value ?: 0L), (pdwcontenttype?.value ?: 0L), (pdwformattype?.value ?: 0L), (phcertstore?.value ?: 0L), (phmsg?.value ?: 0L), (ppvcontext?.value ?: 0L))

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), dwindex.toInt(), (pwszdll?.value ?: 0L))

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRegisterOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pszoid?.value ?: 0L), (pwszdll?.value ?: 0L), (pszoverridefuncname?.value ?: 0L))

public actual fun cryptRegisterOIDInfo(pinfo: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRegisterOIDInfo((pinfo?.value ?: 0L), dwflags.toInt())

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptReleaseContext(hprov.toLong(), dwflags.toInt())

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlA((pszurl?.value ?: 0L), (pszobjectoid?.value ?: 0L), dwretrievalflags.toInt(), dwtimeout.toInt(), (ppvobject?.value ?: 0L), hasyncretrieve, (pcredentials?.value ?: 0L), (pvverify?.value ?: 0L), (pauxinfo?.value ?: 0L))

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlW((pszurl?.value ?: 0L), (pszobjectoid?.value ?: 0L), dwretrievalflags.toInt(), dwtimeout.toInt(), (ppvobject?.value ?: 0L), hasyncretrieve, (pcredentials?.value ?: 0L), (pvverify?.value ?: 0L), (pauxinfo?.value ?: 0L))

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptRetrieveTimeStamp((wszurl?.value ?: 0L), dwretrievalflags.toInt(), dwtimeout.toInt(), (pszhashid?.value ?: 0L), (ppara?.value ?: 0L), (pbdata?.value ?: 0L), cbdata.toInt(), (pptscontext?.value ?: 0L), (pptssigner?.value ?: 0L), (phstore?.value ?: 0L))

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: COpaquePointer?, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetAsyncParam(hasync, (pszparamoid?.value ?: 0L), (pvparam?.value ?: 0L), 0L)

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetHashParam(hhash.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), dwflags.toInt())

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetKeyIdentifierProperty((pkeyidentifier?.value ?: 0L), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L), (pvreserved?.value ?: 0L), (pvdata?.value ?: 0L))

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetKeyParam(hkey.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), dwflags.toInt())

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: COpaquePointer?, cbvaluedata: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetOIDFunctionValue(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pszoid?.value ?: 0L), (pwszvaluename?.value ?: 0L), dwvaluetype.toInt(), (pbvaluedata?.value ?: 0L), cbvaluedata.toInt())

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetProvParam(hprov.toLong(), dwparam.toInt(), (pbdata?.value ?: 0L), dwflags.toInt())

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetProviderA((pszprovname?.value ?: 0L), dwprovtype.toInt())

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetProviderExA((pszprovname?.value ?: 0L), dwprovtype.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt())

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetProviderExW((pszprovname?.value ?: 0L), dwprovtype.toInt(), (pdwreserved?.value ?: 0L), dwflags.toInt())

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSetProviderW((pszprovname?.value ?: 0L), dwprovtype.toInt())

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignAndEncodeCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L), (pvstructinfo?.value ?: 0L), (psignaturealgorithm?.value ?: 0L), (pvhashauxinfo?.value ?: 0L), (pbencoded?.value ?: 0L), (pcbencoded?.value ?: 0L))

public actual fun cryptSignAndEncryptMessage(psignpara: COpaquePointer?, pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobesignedandencrypted: COpaquePointer?, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: COpaquePointer?, pcbsignedandencryptedblob: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignAndEncryptMessage((psignpara?.value ?: 0L), (pencryptpara?.value ?: 0L), crecipientcert.toInt(), (rgprecipientcert?.value ?: 0L), (pbtobesignedandencrypted?.value ?: 0L), cbtobesignedandencrypted.toInt(), (pbsignedandencryptedblob?.value ?: 0L), (pcbsignedandencryptedblob?.value ?: 0L))

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: COpaquePointer?, cbencodedtobesigned: UInt, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbsignature: COpaquePointer?, pcbsignature: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignCertificate(hcryptprovorncryptkey.toLong(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pbencodedtobesigned?.value ?: 0L), cbencodedtobesigned.toInt(), (psignaturealgorithm?.value ?: 0L), (pvhashauxinfo?.value ?: 0L), (pbsignature?.value ?: 0L), (pcbsignature?.value ?: 0L))

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignHashA(hhash.toLong(), dwkeyspec.toInt(), (szdescription?.value ?: 0L), dwflags.toInt(), (pbsignature?.value ?: 0L), (pdwsiglen?.value ?: 0L))

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignHashW(hhash.toLong(), dwkeyspec.toInt(), (szdescription?.value ?: 0L), dwflags.toInt(), (pbsignature?.value ?: 0L), (pdwsiglen?.value ?: 0L))

public actual fun cryptSignMessage(psignpara: COpaquePointer?, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignMessage((psignpara?.value ?: 0L), fdetachedsignature, ctobesigned.toInt(), (rgpbtobesigned?.value ?: 0L), (rgcbtobesigned?.value ?: 0L), (pbsignedblob?.value ?: 0L), (pcbsignedblob?.value ?: 0L))

public actual fun cryptSignMessageWithKey(psignpara: COpaquePointer?, pbtobesigned: COpaquePointer?, cbtobesigned: UInt, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptSignMessageWithKey((psignpara?.value ?: 0L), (pbtobesigned?.value ?: 0L), cbtobesigned.toInt(), (pbsignedblob?.value ?: 0L), (pcbsignedblob?.value ?: 0L))

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptStringToBinaryA((pszstring?.value ?: 0L), cchstring.toInt(), dwflags.toInt(), (pbbinary?.value ?: 0L), (pcbbinary?.value ?: 0L), (pdwskip?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptStringToBinaryW((pszstring?.value ?: 0L), cchstring.toInt(), dwflags.toInt(), (pbbinary?.value ?: 0L), (pcbbinary?.value ?: 0L), (pdwskip?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUninstallCancelRetrieval(dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun cryptUninstallDefaultContext(hdefaultcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUninstallDefaultContext((hdefaultcontext?.value ?: 0L), dwflags.toInt(), (pvreserved?.value ?: 0L))

public actual fun cryptUnprotectData(pdatain: COpaquePointer?, ppszdatadescr: COpaquePointer?, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUnprotectData((pdatain?.value ?: 0L), (ppszdatadescr?.value ?: 0L), (poptionalentropy?.value ?: 0L), (pvreserved?.value ?: 0L), (ppromptstruct?.value ?: 0L), dwflags.toInt(), (pdataout?.value ?: 0L))

public actual fun cryptUnprotectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUnprotectMemory((pdatain?.value ?: 0L), cbdatain.toInt(), dwflags.toInt())

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pwszdll?.value ?: 0L))

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUnregisterOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L), (pszoid?.value ?: 0L))

public actual fun cryptUnregisterOIDInfo(pinfo: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUnregisterOIDInfo((pinfo?.value ?: 0L))

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: COpaquePointer?, pdwfailurecount: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptUpdateProtectedState((poldsid?.value ?: 0L), (pwszoldpassword?.value ?: 0L), dwflags.toInt(), (pdwsuccesscount?.value ?: 0L), (pdwfailurecount?.value ?: 0L))

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, ppublickey: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignature(hcryptprov.toLong(), dwcertencodingtype.toInt(), (pbencoded?.value ?: 0L), cbencoded.toInt(), (ppublickey?.value ?: 0L))

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: COpaquePointer?, dwissuertype: UInt, pvissuer: COpaquePointer?, dwflags: CryptVerifyCertFlags, pvextra: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignatureEx(hcryptprov.toLong(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L), dwissuertype.toInt(), (pvissuer?.value ?: 0L), dwflags.toInt(), (pvextra?.value ?: 0L))

public actual fun cryptVerifyDetachedMessageHash(phashpara: COpaquePointer?, pbdetachedhashblob: COpaquePointer?, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageHash((phashpara?.value ?: 0L), (pbdetachedhashblob?.value ?: 0L), cbdetachedhashblob.toInt(), ctobehashed.toInt(), (rgpbtobehashed?.value ?: 0L), (rgcbtobehashed?.value ?: 0L), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbdetachedsignblob: COpaquePointer?, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageSignature((pverifypara?.value ?: 0L), dwsignerindex.toInt(), (pbdetachedsignblob?.value ?: 0L), cbdetachedsignblob.toInt(), ctobesigned.toInt(), (rgpbtobesigned?.value ?: 0L), (rgcbtobesigned?.value ?: 0L), (ppsignercert?.value ?: 0L))

public actual fun cryptVerifyMessageHash(phashpara: COpaquePointer?, pbhashedblob: COpaquePointer?, cbhashedblob: UInt, pbtobehashed: COpaquePointer?, pcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyMessageHash((phashpara?.value ?: 0L), (pbhashedblob?.value ?: 0L), cbhashedblob.toInt(), (pbtobehashed?.value ?: 0L), (pcbtobehashed?.value ?: 0L), (pbcomputedhash?.value ?: 0L), (pcbcomputedhash?.value ?: 0L))

public actual fun cryptVerifyMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignature((pverifypara?.value ?: 0L), dwsignerindex.toInt(), (pbsignedblob?.value ?: 0L), cbsignedblob.toInt(), (pbdecoded?.value ?: 0L), (pcbdecoded?.value ?: 0L), (ppsignercert?.value ?: 0L))

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: COpaquePointer?, ppublickeyinfo: COpaquePointer?, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignatureWithKey((pverifypara?.value ?: 0L), (ppublickeyinfo?.value ?: 0L), (pbsignedblob?.value ?: 0L), cbsignedblob.toInt(), (pbdecoded?.value ?: 0L), (pcbdecoded?.value ?: 0L))

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifySignatureA(hhash.toLong(), (pbsignature?.value ?: 0L), dwsiglen.toInt(), hpubkey.toLong(), (szdescription?.value ?: 0L), dwflags.toInt())

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifySignatureW(hhash.toLong(), (pbsignature?.value ?: 0L), dwsiglen.toInt(), hpubkey.toLong(), (szdescription?.value ?: 0L), dwflags.toInt())

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: COpaquePointer?, cbtscontentinfo: UInt, pbdata: COpaquePointer?, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptVerifyTimeStampSignature((pbtscontentinfo?.value ?: 0L), cbtscontentinfo.toInt(), (pbdata?.value ?: 0L), cbdata.toInt(), (hadditionalstore?.value ?: 0L), (pptscontext?.value ?: 0L), (pptssigner?.value ?: 0L), (phstore?.value ?: 0L))

public actual fun cryptXmlAddObject(hsignatureorobject: COpaquePointer?, dwflags: UInt, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlAddObject((hsignatureorobject?.value ?: 0L), dwflags.toInt(), (rgproperty?.value ?: 0L), cproperty.toInt(), (pencoded?.value ?: 0L), (ppobject?.value ?: 0L))

public actual fun cryptXmlClose(hcryptxml: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlClose((hcryptxml?.value ?: 0L))

public actual fun cryptXmlCreateReference(hcryptxml: COpaquePointer?, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: COpaquePointer?, ctransform: UInt, rgtransform: COpaquePointer?, phreference: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlCreateReference((hcryptxml?.value ?: 0L), dwflags.toInt(), (wszid?.value ?: 0L), (wszuri?.value ?: 0L), (wsztype?.value ?: 0L), (pdigestmethod?.value ?: 0L), ctransform.toInt(), (rgtransform?.value ?: 0L), (phreference?.value ?: 0L))

public actual fun cryptXmlDigestReference(hreference: COpaquePointer?, dwflags: UInt, pdataproviderin: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlDigestReference((hreference?.value ?: 0L), dwflags.toInt(), (pdataproviderin?.value ?: 0L))

public actual fun cryptXmlEncode(hcryptxml: COpaquePointer?, dwcharset: CryptXmlCharset, rgproperty: COpaquePointer?, cproperty: UInt, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlEncode((hcryptxml?.value ?: 0L), dwcharset, (rgproperty?.value ?: 0L), cproperty.toInt(), (pvcallbackstate?.value ?: 0L), 0L)

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), (pvarg?.value ?: 0L), 0L)

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: COpaquePointer?, dwgroupid: UInt, dwflags: UInt): COpaquePointer? =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), (pvfindby?.value ?: 0L), dwgroupid.toInt(), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: COpaquePointer?, dwflags: CryptXmlFlags, ppalginfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetAlgorithmInfo((pxmlalgorithm?.value ?: 0L), dwflags.toInt(), (ppalginfo?.value ?: 0L))

public actual fun cryptXmlGetDocContext(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetDocContext((hcryptxml?.value ?: 0L), (ppstruct?.value ?: 0L))

public actual fun cryptXmlGetReference(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetReference((hcryptxml?.value ?: 0L), (ppstruct?.value ?: 0L))

public actual fun cryptXmlGetSignature(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetSignature((hcryptxml?.value ?: 0L), (ppstruct?.value ?: 0L))

public actual fun cryptXmlGetStatus(hcryptxml: COpaquePointer?, pstatus: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetStatus((hcryptxml?.value ?: 0L), (pstatus?.value ?: 0L))

public actual fun cryptXmlGetTransforms(ppconfig: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlGetTransforms((ppconfig?.value ?: 0L))

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: COpaquePointer?, phkey: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlImportPublicKey(dwflags.toInt(), (pkeyvalue?.value ?: 0L), (phkey?.value ?: 0L))

public actual fun cryptXmlOpenToDecode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phcryptxml: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlOpenToDecode((pconfig?.value ?: 0L), dwflags.toInt(), (rgproperty?.value ?: 0L), cproperty.toInt(), (pencoded?.value ?: 0L), (phcryptxml?.value ?: 0L))

public actual fun cryptXmlOpenToEncode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phsignature: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlOpenToEncode((pconfig?.value ?: 0L), dwflags.toInt(), (wszid?.value ?: 0L), (rgproperty?.value ?: 0L), cproperty.toInt(), (pencoded?.value ?: 0L), (phsignature?.value ?: 0L))

public actual fun cryptXmlSetHMACSecret(hsignature: COpaquePointer?, pbsecret: COpaquePointer?, cbsecret: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlSetHMACSecret((hsignature?.value ?: 0L), (pbsecret?.value ?: 0L), cbsecret.toInt())

public actual fun cryptXmlSign(hsignature: COpaquePointer?, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: COpaquePointer?, psignaturemethod: COpaquePointer?, pcanonicalization: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlSign((hsignature?.value ?: 0L), hkey.toLong(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, (pvkeyinfospec?.value ?: 0L), (psignaturemethod?.value ?: 0L), (pcanonicalization?.value ?: 0L))

public actual fun cryptXmlVerifySignature(hsignature: COpaquePointer?, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_cryptXmlVerifySignature((hsignature?.value ?: 0L), (hkey?.value ?: 0L), dwflags.toInt())

public actual fun decrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_decrypt((hcrypto?.value ?: 0L), foaep, cbindata.toInt(), (pindata?.value ?: 0L), (pcboutdata?.value ?: 0L), (ppoutdata?.value ?: 0L))

public actual fun encrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_encrypt((hcrypto?.value ?: 0L), foaep, cbindata.toInt(), (pindata?.value ?: 0L), (pcboutdata?.value ?: 0L), (ppoutdata?.value ?: 0L))

public actual fun findCertsByIssuer(pcertchains: COpaquePointer?, pcbcertchains: COpaquePointer?, pccertchains: COpaquePointer?, pbencodedissuername: COpaquePointer?, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_findCertsByIssuer((pcertchains?.value ?: 0L), (pcbcertchains?.value ?: 0L), (pccertchains?.value ?: 0L), (pbencodedissuername?.value ?: 0L), cbencodedissuername.toInt(), (pwszpurpose?.value ?: 0L), dwkeyspec.toInt())

public actual fun freeToken(pallocmemory: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_freeToken((pallocmemory?.value ?: 0L))

public actual fun generateDerivedKey(hcrypto: COpaquePointer?, cblabel: UInt, plabel: COpaquePointer?, cbnonce: UInt, pnonce: COpaquePointer?, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: COpaquePointer?, ppkey: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_generateDerivedKey((hcrypto?.value ?: 0L), cblabel.toInt(), (plabel?.value ?: 0L), cbnonce.toInt(), (pnonce?.value ?: 0L), derivedkeylength.toInt(), offset.toInt(), (algid?.value ?: 0L), (pcbkey?.value ?: 0L), (ppkey?.value ?: 0L))

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getAsymmetricEncryptionInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getBrowserToken(dwparamtype: UInt, pparam: COpaquePointer?, pcbtoken: COpaquePointer?, pptoken: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getBrowserToken(dwparamtype.toInt(), (pparam?.value ?: 0L), (pcbtoken?.value ?: 0L), (pptoken?.value ?: 0L))

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getCipherInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getCryptoTransform(hsymmetriccrypto: COpaquePointer?, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: COpaquePointer?, pphtransform: COpaquePointer?): Hresult =
    0

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getHashInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getKeyDerivationInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getKeyStorageInterface((pszprovidername?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getKeyedHash(hsymmetriccrypto: COpaquePointer?, pphhash: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getKeyedHash((hsymmetriccrypto?.value ?: 0L), (pphhash?.value ?: 0L))

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getRngInterface((pszprovidername?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getSChannelInterface((pszprovidername?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getSecretAgreementInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getSignatureInterface((pszprovidername?.value ?: 0L), (pszalgid?.value ?: 0L), (ppfunctiontable?.value ?: 0L), dwflags.toInt())

public actual fun getToken(cpolicychain: UInt, ppolicychain: COpaquePointer?, securitytoken: COpaquePointer?, phprooftokencrypto: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_getToken(cpolicychain.toInt(), (ppolicychain?.value ?: 0L), (securitytoken?.value ?: 0L), (phprooftokencrypto?.value ?: 0L))

public actual fun hashCore(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_hashCore((hcrypto?.value ?: 0L), cbindata.toInt(), (pindata?.value ?: 0L))

public actual fun hashFinal(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_hashFinal((hcrypto?.value ?: 0L), cbindata.toInt(), (pindata?.value ?: 0L), (pcboutdata?.value ?: 0L), (ppoutdata?.value ?: 0L))

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_importInformationCard((filename?.value ?: 0L))

public actual fun manageCardSpace(): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_manageCardSpace()

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptCloseProtectionDescriptor((hdescriptor?.value ?: 0L))

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptCreateClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), (pparameterlist?.value ?: 0L), (pbclaimblob?.value ?: 0L), cbclaimblob.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptCreatePersistedKey(hprovider.toLong(), (phkey?.value ?: 0L), (pszalgid?.value ?: 0L), (pszkeyname?.value ?: 0L), dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptCreateProtectionDescriptor((pwszdescriptorstring?.value ?: 0L), dwflags.toInt(), (phdescriptor?.value ?: 0L))

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptDecrypt(hkey.toLong(), (pbinput?.value ?: 0L), cbinput.toInt(), (ppaddinginfo?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptDeleteKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptDeriveKey(hsharedsecret.toLong(), (pwszkdf?.value ?: 0L), (pparameterlist?.value ?: 0L), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptEncrypt(hkey.toLong(), (pbinput?.value ?: 0L), cbinput.toInt(), (ppaddinginfo?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptEnumAlgorithms(hprovider.toLong(), dwalgoperations.toInt(), (pdwalgcount?.value ?: 0L), (ppalglist?.value ?: 0L), dwflags.toInt())

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptEnumKeys(hprovider.toLong(), (pszscope?.value ?: 0L), (ppkeyname?.value ?: 0L), (ppenumstate?.value ?: 0L), dwflags.toInt())

public actual fun nCryptEnumStorageProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptEnumStorageProviders((pdwprovidercount?.value ?: 0L), (ppproviderlist?.value ?: 0L), dwflags.toInt())

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptExportKey(hkey.toLong(), hexportkey.toLong(), (pszblobtype?.value ?: 0L), (pparameterlist?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptFinalizeKey(hkey.toLong(), dwflags.toInt())

public actual fun nCryptFreeBuffer(pvinput: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptFreeBuffer((pvinput?.value ?: 0L))

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptFreeObject(hobject.toLong())

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: ObjectSecurityInformation): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptGetProperty(hobject.toLong(), (pszproperty?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: COpaquePointer?, dwinfotype: UInt, ppvinfo: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptGetProtectionDescriptorInfo((hdescriptor?.value ?: 0L), (pmempara?.value ?: 0L), dwinfotype.toInt(), (ppvinfo?.value ?: 0L))

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, phkey: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptImportKey(hprovider.toLong(), himportkey.toLong(), (pszblobtype?.value ?: 0L), (pparameterlist?.value ?: 0L), (phkey?.value ?: 0L), (pbdata?.value ?: 0L), cbdata.toInt(), dwflags.toInt())

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptIsAlgSupported(hprovider.toLong(), (pszalgid?.value ?: 0L), dwflags.toInt())

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptIsKeyHandle(hkey.toLong())

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptKeyDerivation(hkey.toLong(), (pparameterlist?.value ?: 0L), (pbderivedkey?.value ?: 0L), cbderivedkey.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptNotifyChangeKey(hprovider.toLong(), (phevent?.value ?: 0L), dwflags.toInt())

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptOpenKey(hprovider.toLong(), (phkey?.value ?: 0L), (pszkeyname?.value ?: 0L), dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptOpenStorageProvider(phprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptOpenStorageProvider((phprovider?.value ?: 0L), (pszprovidername?.value ?: 0L), dwflags.toInt())

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbprotectedblob: COpaquePointer?, pcbprotectedblob: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptProtectSecret((hdescriptor?.value ?: 0L), dwflags.toInt(), (pbdata?.value ?: 0L), cbdata.toInt(), (pmempara?.value ?: 0L), (hwnd?.value ?: 0L), (ppbprotectedblob?.value ?: 0L), (pcbprotectedblob?.value ?: 0L))

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptQueryProtectionDescriptorName((pwszname?.value ?: 0L), (pwszdescriptorstring?.value ?: 0L), (pcdescriptorstring?.value ?: 0L), dwflags.toInt())

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptRegisterProtectionDescriptorName((pwszname?.value ?: 0L), (pwszdescriptorstring?.value ?: 0L), dwflags.toInt())

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptSecretAgreement(hprivkey.toLong(), hpubkey.toLong(), (phagreedsecret?.value ?: 0L), dwflags.toInt())

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptSetProperty(hobject.toLong(), (pszproperty?.value ?: 0L), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptSignHash(hkey.toLong(), (ppaddinginfo?.value ?: 0L), (pbhashvalue?.value ?: 0L), cbhashvalue.toInt(), (pbsignature?.value ?: 0L), cbsignature.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptStreamClose((hstream?.value ?: 0L))

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: COpaquePointer?, phstream: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToProtect((hdescriptor?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (pstreaminfo?.value ?: 0L), (phstream?.value ?: 0L))

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotect((pstreaminfo?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (phstream?.value ?: 0L))

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotectEx((pstreaminfo?.value ?: 0L), dwflags.toInt(), (hwnd?.value ?: 0L), (phstream?.value ?: 0L))

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: COpaquePointer?, cbdata: ULong, ffinal: Bool): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptStreamUpdate((hstream?.value ?: 0L), (pbdata?.value ?: 0L), cbdata.toLong(), ffinal)

public actual fun nCryptTranslateHandle(phprovider: COpaquePointer?, phkey: COpaquePointer?, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptTranslateHandle((phprovider?.value ?: 0L), (phkey?.value ?: 0L), hlegacyprov.toLong(), hlegacykey.toLong(), dwlegacykeyspec.toInt(), dwflags.toInt())

public actual fun nCryptUnprotectSecret(phdescriptor: COpaquePointer?, dwflags: NcryptFlags, pbprotectedblob: COpaquePointer?, cbprotectedblob: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptUnprotectSecret((phdescriptor?.value ?: 0L), dwflags.toInt(), (pbprotectedblob?.value ?: 0L), cbprotectedblob.toInt(), (pmempara?.value ?: 0L), (hwnd?.value ?: 0L), (ppbdata?.value ?: 0L), (pcbdata?.value ?: 0L))

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, poutput: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptVerifyClaim(hsubjectkey.toLong(), hauthoritykey.toLong(), dwclaimtype.toInt(), (pparameterlist?.value ?: 0L), (pbclaimblob?.value ?: 0L), cbclaimblob.toInt(), (poutput?.value ?: 0L), dwflags.toInt())

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_nCryptVerifySignature(hkey.toLong(), (ppaddinginfo?.value ?: 0L), (pbhashvalue?.value ?: 0L), cbhashvalue.toInt(), (pbsignature?.value ?: 0L), cbsignature.toInt(), dwflags.toInt())

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_pFXExportCertStore((hstore?.value ?: 0L), (ppfx?.value ?: 0L), (szpassword?.value ?: 0L), dwflags.toInt())

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, pvpara: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_pFXExportCertStoreEx((hstore?.value ?: 0L), (ppfx?.value ?: 0L), (szpassword?.value ?: 0L), (pvpara?.value ?: 0L), dwflags.toInt())

public actual fun pFXImportCertStore(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_pFXImportCertStore((ppfx?.value ?: 0L), (szpassword?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pFXIsPFXBlob(ppfx: COpaquePointer?): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_pFXIsPFXBlob((ppfx?.value ?: 0L))

public actual fun pFXVerifyPassword(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_pFXVerifyPassword((ppfx?.value ?: 0L), (szpassword?.value ?: 0L), dwflags.toInt())

public actual fun processPrng(pbdata: COpaquePointer?, cbdata: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_processPrng((pbdata?.value ?: 0L), cbdata.toLong())

public actual fun signError(): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signError()

public actual fun signHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, pcbsig: COpaquePointer?, ppsig: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signHash((hcrypto?.value ?: 0L), cbhash.toInt(), (phash?.value ?: 0L), (hashalgoid?.value ?: 0L), (pcbsig?.value ?: 0L), (ppsig?.value ?: 0L))

public actual fun signerFreeSignerContext(psignercontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerFreeSignerContext((psignercontext?.value ?: 0L))

public actual fun signerSign(psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerSign((psubjectinfo?.value ?: 0L), (psignercert?.value ?: 0L), (psignatureinfo?.value ?: 0L), (pproviderinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L))

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerSignEx(dwflags.toInt(), (psubjectinfo?.value ?: 0L), (psignercert?.value ?: 0L), (psignatureinfo?.value ?: 0L), (pproviderinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L))

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerSignEx2(dwflags.toInt(), (psubjectinfo?.value ?: 0L), (psignercert?.value ?: 0L), (psignatureinfo?.value ?: 0L), (pproviderinfo?.value ?: 0L), dwtimestampflags.toInt(), (psztimestampalgorithmoid?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L), (pcryptopolicy?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, pdigestsigninfo: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerSignEx3(dwflags.toInt(), (psubjectinfo?.value ?: 0L), (psignercert?.value ?: 0L), (psignatureinfo?.value ?: 0L), (pproviderinfo?.value ?: 0L), dwtimestampflags.toInt(), (psztimestampalgorithmoid?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L), (pcryptopolicy?.value ?: 0L), (pdigestsigninfo?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun signerTimeStamp(psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerTimeStamp((psubjectinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L))

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerTimeStampEx(dwflags.toInt(), (psubjectinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L))

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerTimeStampEx2(dwflags.toInt(), (psubjectinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), dwalgid.toInt(), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L))

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_signerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), (psubjectinfo?.value ?: 0L), (pwszhttptimestamp?.value ?: 0L), (pszalgorithmoid?.value ?: 0L), (psrequest?.value ?: 0L), (psipdata?.value ?: 0L), (ppsignercontext?.value ?: 0L), (pcryptopolicy?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslChangeNotify((hevent?.value ?: 0L), dwflags.toInt())

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslComputeClientAuthHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), (pszalgid?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: COpaquePointer?, cbrandoms: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslComputeEapKeyBlock(hsslprovider.toLong(), hmasterkey.toLong(), (pbrandoms?.value ?: 0L), cbrandoms.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslComputeFinishedHash(hsslprovider.toLong(), hmasterkey.toLong(), hhandshakehash.toLong(), (pboutput?.value ?: 0L), cboutput.toInt(), dwflags.toInt())

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslComputeSessionHash(hsslprovider.toLong(), hhandshakehash.toLong(), dwprotocol.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslCreateClientAuthHash(hsslprovider.toLong(), (phhandshakehash?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), (pszhashalgid?.value ?: 0L), dwflags.toInt())

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: COpaquePointer?, cbparams: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslCreateEphemeralKey(hsslprovider.toLong(), (phephemeralkey?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), (pbparams?.value ?: 0L), cbparams.toInt(), dwflags.toInt())

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslCreateHandshakeHash(hsslprovider.toLong(), (phhandshakehash?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt())

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslDecrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslDecryptPacket(hsslprovider.toLong(), hkey.toLong(), (pbinput?.value ?: 0L), cbinput.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), sequencenumber.toLong(), dwflags.toInt())

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslDuplicateTranscriptHash(hsslprovider.toLong(), htranscripthash.toLong(), (phtranscripthash?.value ?: 0L), dwflags.toInt())

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslEncryptPacket(hsslprovider.toLong(), hkey.toLong(), (pbinput?.value ?: 0L), cbinput.toInt(), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), sequencenumber.toLong(), dwcontenttype.toInt(), dwflags.toInt())

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslEnumCipherSuites(hsslprovider.toLong(), hprivatekey.toLong(), (ppciphersuite?.value ?: 0L), (ppenumstate?.value ?: 0L), dwflags.toInt())

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslEnumCipherSuitesEx(hsslprovider.toLong(), hprivatekey.toLong(), (ppciphersuite?.value ?: 0L), (ppenumstate?.value ?: 0L), dwflags.toInt())

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: COpaquePointer?, ppecccurve: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslEnumEccCurves(hsslprovider.toLong(), (pecccurvecount?.value ?: 0L), (ppecccurve?.value ?: 0L), dwflags.toInt())

public actual fun sslEnumProtocolProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslEnumProtocolProviders((pdwprovidercount?.value ?: 0L), (ppproviderlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandBinderKey(hsslprovider.toLong(), hearlykey.toLong(), (phbinderkey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandExporterMasterKey(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), (phexportermasterkey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: COpaquePointer?, cbticketnonce: UInt, phpresharedkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandPreSharedKey(hsslprovider.toLong(), hresumptionmasterkey.toLong(), (pbticketnonce?.value ?: 0L), cbticketnonce.toInt(), (phpresharedkey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandResumptionMasterKey(hsslprovider.toLong(), hmasterkey.toLong(), hhashvalue.toLong(), (phresumptionmasterkey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: COpaquePointer?, phservertraffickey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandTrafficKeys(hsslprovider.toLong(), hbasekey.toLong(), hhashvalue.toLong(), (phclienttraffickey?.value ?: 0L), (phservertraffickey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExpandWriteKey(hsslprovider.toLong(), hbasetraffickey.toLong(), (phwritekey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExportKey(hsslprovider.toLong(), hkey.toLong(), (pszblobtype?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: COpaquePointer?, cbrandoms: UInt, pbcontextvalue: COpaquePointer?, cbcontextvalue: UShort, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExportKeyingMaterial(hsslprovider.toLong(), hmasterkey.toLong(), (slabel?.value ?: 0L), (pbrandoms?.value ?: 0L), cbrandoms.toInt(), (pbcontextvalue?.value ?: 0L), cbcontextvalue.toShort(), (pboutput?.value ?: 0L), cboutput.toInt(), dwflags.toInt())

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExtractEarlyKey(hsslprovider.toLong(), hpresharedkey.toLong(), (phearlykey?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExtractHandshakeKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), hearlykey.toLong(), (phhandshakekey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslExtractMasterKey(hsslprovider.toLong(), hhandshakekey.toLong(), (phmasterkey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslFreeBuffer(pvinput: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslFreeBuffer((pvinput?.value ?: 0L))

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslFreeObject(hobject.toLong(), dwflags.toInt())

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGenerateMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), hpublickey.toLong(), (phmasterkey?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGeneratePreMasterKey(hsslprovider.toLong(), hpublickey.toLong(), (phpremasterkey?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L), (pboutput?.value ?: 0L), cboutput.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: COpaquePointer?, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGenerateSessionKeys(hsslprovider.toLong(), hmasterkey.toLong(), (phreadkey?.value ?: 0L), (phwritekey?.value ?: 0L), (pparameterlist?.value ?: 0L), dwflags.toInt())

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGetCipherSuitePRFHashAlgorithm(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (szprfhash?.value ?: 0L), dwflags.toInt())

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGetKeyProperty(hkey.toLong(), (pszproperty?.value ?: 0L), (ppboutput?.value ?: 0L), (pcboutput?.value ?: 0L), dwflags.toInt())

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslGetProviderProperty(hsslprovider.toLong(), (pszproperty?.value ?: 0L), (ppboutput?.value ?: 0L), (pcboutput?.value ?: 0L), (ppenumstate?.value ?: 0L), dwflags.toInt())

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslHashHandshake(hsslprovider.toLong(), hhandshakehash.toLong(), (pbinput?.value ?: 0L), cbinput.toInt(), dwflags.toInt())

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: COpaquePointer?, pszblobtype: Pcwstr, pbkeyblob: COpaquePointer?, cbkeyblob: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslImportKey(hsslprovider.toLong(), (phkey?.value ?: 0L), (pszblobtype?.value ?: 0L), (pbkeyblob?.value ?: 0L), cbkeyblob.toInt(), dwflags.toInt())

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pbencryptedkey: COpaquePointer?, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslImportMasterKey(hsslprovider.toLong(), hprivatekey.toLong(), (phmasterkey?.value ?: 0L), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L), (pbencryptedkey?.value ?: 0L), cbencryptedkey.toInt(), dwflags.toInt())

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslIncrementProviderReferenceCount(hsslprovider.toLong())

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: COpaquePointer?, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslLookupCipherLengths(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (pcipherlengths?.value ?: 0L), cbcipherlengths.toInt(), dwflags.toInt())

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslLookupCipherSuiteInfo(hsslprovider.toLong(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (pciphersuite?.value ?: 0L), dwflags.toInt())

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: COpaquePointer?, pcertcontext: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslOpenPrivateKey(hsslprovider.toLong(), (phprivatekey?.value ?: 0L), (pcertcontext?.value ?: 0L), dwflags.toInt())

public actual fun sslOpenProvider(phsslprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslOpenProvider((phsslprovider?.value ?: 0L), (pszprovidername?.value ?: 0L), dwflags.toInt())

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslSignHash(hsslprovider.toLong(), hprivatekey.toLong(), (pbhashvalue?.value ?: 0L), cbhashvalue.toInt(), (pbsignature?.value ?: 0L), cbsignature.toInt(), (pcbresult?.value ?: 0L), dwflags.toInt())

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_sslVerifySignature(hsslprovider.toLong(), hpublickey.toLong(), (pbhashvalue?.value ?: 0L), cbhashvalue.toInt(), (pbsignature?.value ?: 0L), cbsignature.toInt(), dwflags.toInt())

public actual fun systemPrng(pbrandomdata: COpaquePointer?, cbrandomdata: ULong): Bool =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_systemPrng((pbrandomdata?.value ?: 0L), cbrandomdata.toLong())

public actual fun transformBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_transformBlock((hcrypto?.value ?: 0L), cbindata.toInt(), (pindata?.value ?: 0L), (pcboutdata?.value ?: 0L), (ppoutdata?.value ?: 0L))

public actual fun transformFinalBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_transformFinalBlock((hcrypto?.value ?: 0L), cbindata.toInt(), (pindata?.value ?: 0L), (pcboutdata?.value ?: 0L), (ppoutdata?.value ?: 0L))

public actual fun verifyHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, cbsig: UInt, psig: COpaquePointer?, pfverified: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyJniBridge.windowssys_windows_win32_security_cryptography_verifyHash((hcrypto?.value ?: 0L), cbhash.toInt(), (phash?.value ?: 0L), (hashalgoid?.value ?: 0L), cbsig.toInt(), (psig?.value ?: 0L), (pfverified?.value ?: 0L))
