@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32DataRightsmanagementNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAcquireAdvisories(hlicensestorage.toInt(), wszlicense.toString(), wszurl.toString(), pvcontext.toString()) as Int) else 0

public actual fun DRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: Long, ctemplates: UInt, pwsztemplateids: Long, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), pvreserved.toString(), ctemplates.toInt(), pwsztemplateids.toString(), wszurl.toString(), pvcontext.toString()) as Int) else 0

public actual fun DRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: PCWSTR, wszrequestedrights: PCWSTR, wszcustomdata: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAcquireLicense(hsession.toInt(), uflags.toInt(), wszgroupidentitycredential.toString(), wszrequestedrights.toString(), wszcustomdata.toString(), wszurl.toString(), pvcontext.toString()) as Int) else 0

public actual fun DRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: Long, pvcontext: Long, hparentwnd: HWND): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), pactservinfo.toString(), pvcontext.toString(), hparentwnd.toString()) as Int) else 0

public actual fun DRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), wszlicense.toString()) as Int) else 0

public actual fun DRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt()) as Int) else 0

public actual fun DRMAttest(henablingprincipal: UInt, wszdata: PCWSTR, etype: DRMATTESTTYPE, pcattestedblob: Long, wszattestedblob: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMAttest(henablingprincipal.toInt(), wszdata.toString(), etype, pcattestedblob.toString(), wszattestedblob.toString()) as Int) else 0

public actual fun DRMCheckSecurity(henv: UInt, clevel: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCheckSecurity(henv.toInt(), clevel.toInt()) as Int) else 0

public actual fun DRMClearAllRights(hissuancelicense: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMClearAllRights(hissuancelicense.toInt()) as Int) else 0

public actual fun DRMCloseEnvironmentHandle(henv: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCloseEnvironmentHandle(henv.toInt()) as Int) else 0

public actual fun DRMCloseHandle(handle: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCloseHandle(handle.toInt()) as Int) else 0

public actual fun DRMClosePubHandle(hpub: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMClosePubHandle(hpub.toInt()) as Int) else 0

public actual fun DRMCloseQueryHandle(hquery: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCloseQueryHandle(hquery.toInt()) as Int) else 0

public actual fun DRMCloseSession(hsession: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCloseSession(hsession.toInt()) as Int) else 0

public actual fun DRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: Long, pcchain: Long, wszchain: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMConstructCertificateChain(ccertificates.toInt(), rgwszcertificates.toString(), pcchain.toString(), wszchain.toString()) as Int) else 0

public actual fun DRMCreateBoundLicense(henv: UInt, pparams: Long, wszlicensechain: PCWSTR, phboundlicense: Long, pherrorlog: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateBoundLicense(henv.toInt(), pparams.toString(), wszlicensechain.toString(), phboundlicense.toString(), pherrorlog.toString()) as Int) else 0

public actual fun DRMCreateClientSession(pfncallback: DRMCALLBACK, ucallbackversion: UInt, wszgroupidprovidertype: PCWSTR, wszgroupid: PCWSTR, phclient: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateClientSession(pfncallback.toLong().toString(), ucallbackversion.toInt(), wszgroupidprovidertype.toString(), wszgroupid.toString(), phclient.toString()) as Int) else 0

public actual fun DRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phdecryptor: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), wszright.toString(), hauxlib.toInt(), wszauxplug.toString(), phdecryptor.toString()) as Int) else 0

public actual fun DRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phencryptor: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), wszright.toString(), hauxlib.toInt(), wszauxplug.toString(), phencryptor.toString()) as Int) else 0

public actual fun DRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: PCWSTR, pidprincipal: Long, wszcredentials: PCWSTR, phenablingprincipal: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), wszobject.toString(), pidprincipal.toString(), wszcredentials.toString(), phenablingprincipal.toString()) as Int) else 0

public actual fun DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: PCWSTR, wszreferralinfourl: PCWSTR, howner: UInt, wszissuancelicense: PCWSTR, hboundlicense: UInt, phissuancelicense: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateIssuanceLicense(psttimefrom.toString(), psttimeuntil.toString(), wszreferralinfoname.toString(), wszreferralinfourl.toString(), howner.toInt(), wszissuancelicense.toString(), hboundlicense.toInt(), phissuancelicense.toString()) as Int) else 0

public actual fun DRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: PCWSTR, phlicensestorage: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), wszissuancelicense.toString(), phlicensestorage.toString()) as Int) else 0

public actual fun DRMCreateRight(wszrightname: PCWSTR, pstfrom: Long, pstuntil: Long, cextendedinfo: UInt, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateRight(wszrightname.toString(), pstfrom.toString(), pstuntil.toString(), cextendedinfo.toInt(), pwszextendedinfoname.toString(), pwszextendedinfovalue.toString(), phright.toString()) as Int) else 0

public actual fun DRMCreateUser(wszusername: PCWSTR, wszuserid: PCWSTR, wszuseridtype: PCWSTR, phuser: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMCreateUser(wszusername.toString(), wszuserid.toString(), wszuseridtype.toString(), phuser.toString()) as Int) else 0

public actual fun DRMDecode(wszalgid: PCWSTR, wszencodedstring: PCWSTR, pudecodeddatalen: Long, pbdecodeddata: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDecode(wszalgid.toString(), wszencodedstring.toString(), pudecodeddatalen.toString(), pbdecodeddata.toString()) as Int) else 0

public actual fun DRMDeconstructCertificateChain(wszchain: PCWSTR, iwhich: UInt, pccert: Long, wszcert: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDeconstructCertificateChain(wszchain.toString(), iwhich.toInt(), pccert.toString(), wszcert.toString()) as Int) else 0

public actual fun DRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.toString(), pcnumoutbytes.toString(), pboutdata.toString()) as Int) else 0

public actual fun DRMDeleteLicense(hsession: UInt, wszlicenseid: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDeleteLicense(hsession.toInt(), wszlicenseid.toString()) as Int) else 0

public actual fun DRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateEnvironmentHandle(htocopy.toInt(), phcopy.toString()) as Int) else 0

public actual fun DRMDuplicateHandle(htocopy: UInt, phcopy: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateHandle(htocopy.toInt(), phcopy.toString()) as Int) else 0

public actual fun DRMDuplicatePubHandle(hpubin: UInt, phpubout: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDuplicatePubHandle(hpubin.toInt(), phpubout.toString()) as Int) else 0

public actual fun DRMDuplicateSession(hsessionin: UInt, phsessionout: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateSession(hsessionin.toInt(), phsessionout.toString()) as Int) else 0

public actual fun DRMEncode(wszalgid: PCWSTR, udatalen: UInt, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMEncode(wszalgid.toString(), udatalen.toInt(), pbdecodeddata.toString(), puencodedstringlen.toString(), wszencodedstring.toString()) as Int) else 0

public actual fun DRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.toString(), pcnumoutbytes.toString(), pboutdata.toString()) as Int) else 0

public actual fun DRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), pfsharedflag.toString(), pucertificatedatalen.toString(), wszcertificatedata.toString()) as Int) else 0

public actual fun DRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: Long, wszname: PWSTR, puvaluelength: Long, wszvalue: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), punamelength.toString(), wszname.toString(), puvaluelength.toString(), wszvalue.toString()) as Int) else 0

public actual fun DRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttribute(hqueryroot.toInt(), wszattribute.toString(), iwhich.toInt(), peencoding.toString(), pcbuffer.toString(), pbbuffer.toString()) as Int) else 0

public actual fun DRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: PCWSTR, pcattributes: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), wszattribute.toString(), pcattributes.toString()) as Int) else 0

public actual fun DRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iwhich: UInt, phsubobject: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.toString(), iwhich.toInt(), phsubobject.toString()) as Int) else 0

public actual fun DRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.toString(), pcsubobjects.toString()) as Int) else 0

public actual fun DRMGetCertificateChainCount(wszchain: PCWSTR, pccertcount: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetCertificateChainCount(wszchain.toString(), pccertcount.toString()) as Int) else 0

public actual fun DRMGetClientVersion(pdrmclientversioninfo: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetClientVersion(pdrmclientversioninfo.toString()) as Int) else 0

public actual fun DRMGetEnvironmentInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetEnvironmentInfo(handle.toInt(), wszattribute.toString(), peencoding.toString(), pcbuffer.toString(), pbbuffer.toString()) as Int) else 0

public actual fun DRMGetInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetInfo(handle.toInt(), wszattribute.toString(), peencoding.toString(), pcbuffer.toString(), pbbuffer.toString()) as Int) else 0

public actual fun DRMGetIntervalTime(hissuancelicense: UInt, pcdays: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetIntervalTime(hissuancelicense.toInt(), pcdays.toString()) as Int) else 0

public actual fun DRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: Long, psttimeuntil: Long, uflags: UInt, pudistributionpointnamelength: Long, wszdistributionpointname: PWSTR, pudistributionpointurllength: Long, wszdistributionpointurl: PWSTR, phowner: Long, pfofficial: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), psttimefrom.toString(), psttimeuntil.toString(), uflags.toInt(), pudistributionpointnamelength.toString(), wszdistributionpointname.toString(), pudistributionpointurllength.toString(), wszdistributionpointurl.toString(), phowner.toString(), pfofficial.toString()) as Int) else 0

public actual fun DRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), puissuancelicensetemplatelength.toString(), wszissuancelicensetemplate.toString()) as Int) else 0

public actual fun DRMGetMetaData(hissuancelicense: UInt, pucontentidlength: Long, wszcontentid: PWSTR, pucontentidtypelength: Long, wszcontentidtype: PWSTR, puskuidlength: Long, wszskuid: PWSTR, puskuidtypelength: Long, wszskuidtype: PWSTR, pucontenttypelength: Long, wszcontenttype: PWSTR, pucontentnamelength: Long, wszcontentname: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetMetaData(hissuancelicense.toInt(), pucontentidlength.toString(), wszcontentid.toString(), pucontentidtypelength.toString(), wszcontentidtype.toString(), puskuidlength.toString(), wszskuid.toString(), puskuidtypelength.toString(), wszskuidtype.toString(), pucontenttypelength.toString(), wszcontenttype.toString(), pucontentnamelength.toString(), wszcontentname.toString()) as Int) else 0

public actual fun DRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: Long, punamelength: Long, wszname: PWSTR, pudescriptionlength: Long, wszdescription: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), pulcid.toString(), punamelength.toString(), wszname.toString(), pudescriptionlength.toString(), wszdescription.toString()) as Int) else 0

public actual fun DRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: Long, wszownerlicense: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetOwnerLicense(hissuancelicense.toInt(), puownerlicenselength.toString(), wszownerlicense.toString()) as Int) else 0

public actual fun DRMGetProcAddress(hlibrary: UInt, wszprocname: PCWSTR, ppfnprocaddress: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetProcAddress(hlibrary.toInt(), wszprocname.toString(), ppfnprocaddress.toString()) as Int) else 0

public actual fun DRMGetRevocationPoint(hissuancelicense: UInt, puidlength: Long, wszid: PWSTR, puidtypelength: Long, wszidtype: PWSTR, puurllength: Long, wszrl: PWSTR, pstfrequency: Long, punamelength: Long, wszname: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetRevocationPoint(hissuancelicense.toInt(), puidlength.toString(), wszid.toString(), puidtypelength.toString(), wszidtype.toString(), puurllength.toString(), wszrl.toString(), pstfrequency.toString(), punamelength.toString(), wszname.toString(), pupublickeylength.toString(), wszpublickey.toString()) as Int) else 0

public actual fun DRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: Long, wszextendedinfoname: PWSTR, puextendedinfovaluelength: Long, wszextendedinfovalue: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), puextendedinfonamelength.toString(), wszextendedinfoname.toString(), puextendedinfovaluelength.toString(), wszextendedinfovalue.toString()) as Int) else 0

public actual fun DRMGetRightInfo(hright: UInt, purightnamelength: Long, wszrightname: PWSTR, pstfrom: Long, pstuntil: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetRightInfo(hright.toInt(), purightnamelength.toString(), wszrightname.toString(), pstfrom.toString(), pstuntil.toString()) as Int) else 0

public actual fun DRMGetSecurityProvider(uflags: UInt, putypelen: Long, wsztype: PWSTR, pupathlen: Long, wszpath: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetSecurityProvider(uflags.toInt(), putypelen.toString(), wsztype.toString(), pupathlen.toString(), wszpath.toString()) as Int) else 0

public actual fun DRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: PCWSTR, puserviceurllength: Long, wszserviceurl: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), wszissuancelicense.toString(), puserviceurllength.toString(), wszserviceurl.toString()) as Int) else 0

public actual fun DRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, wszclientlicensorcertificate: PCWSTR, pfncallback: DRMCALLBACK, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.toString(), cbsymkey.toInt(), wszsymkeytype.toString(), wszclientlicensorcertificate.toString(), pfncallback.toLong().toString(), wszurl.toString(), pvcontext.toString()) as Int) else 0

public actual fun DRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, pvreserved: Long, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: DRMCALLBACK, pvcontext: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.toString(), cbsymkey.toInt(), wszsymkeytype.toString(), pvreserved.toString(), henablingprincipal.toInt(), hboundlicenseclc.toInt(), pfncallback.toLong().toString(), pvcontext.toString()) as Int) else 0

public actual fun DRMGetTime(henv: UInt, etimeridtype: DRMTIMETYPE, potimeobject: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetTime(henv.toInt(), etimeridtype, potimeobject.toString()) as Int) else 0

public actual fun DRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttribute(hqueryroot.toInt(), wszattributetype.toString(), iwhich.toInt(), peencoding.toString(), pcbuffer.toString(), pbbuffer.toString()) as Int) else 0

public actual fun DRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: PCWSTR, pcattributes: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), wszattributetype.toString(), pcattributes.toString()) as Int) else 0

public actual fun DRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iindex: UInt, phsubquery: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.toString(), iindex.toInt(), phsubquery.toString()) as Int) else 0

public actual fun DRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.toString(), pcsubobjects.toString()) as Int) else 0

public actual fun DRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: PWSTR, puminversionlength: Long, wszminversion: PWSTR, pumaxversionlength: Long, wszmaxversion: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR, pudigestalgorithmlength: Long, wszdigestalgorithm: PWSTR, pcbdigest: Long, pbdigest: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), peusagepolicytype.toString(), pfexclusion.toString(), punamelength.toString(), wszname.toString(), puminversionlength.toString(), wszminversion.toString(), pumaxversionlength.toString(), wszmaxversion.toString(), pupublickeylength.toString(), wszpublickey.toString(), pudigestalgorithmlength.toString(), wszdigestalgorithm.toString(), pcbdigest.toString(), pbdigest.toString()) as Int) else 0

public actual fun DRMGetUserInfo(huser: UInt, puusernamelength: Long, wszusername: PWSTR, puuseridlength: Long, wszuserid: PWSTR, puuseridtypelength: Long, wszuseridtype: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUserInfo(huser.toInt(), puusernamelength.toString(), wszusername.toString(), puuseridlength.toString(), wszuserid.toString(), puuseridtypelength.toString(), wszuseridtype.toString()) as Int) else 0

public actual fun DRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), phright.toString()) as Int) else 0

public actual fun DRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), phuser.toString()) as Int) else 0

public actual fun DRMInitEnvironment(esecurityprovidertype: DRMSECURITYPROVIDERTYPE, especification: DRMSPECTYPE, wszsecurityprovider: PCWSTR, wszmanifestcredentials: PCWSTR, wszmachinecredentials: PCWSTR, phenv: Long, phdefaultlibrary: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.toString(), wszmanifestcredentials.toString(), wszmachinecredentials.toString(), phenv.toString(), phdefaultlibrary.toString()) as Int) else 0

public actual fun DRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMIsActivated(hclient.toInt(), uflags.toInt(), pactservinfo.toString()) as Int) else 0

public actual fun DRMIsWindowProtected(hwnd: HWND, pfprotected: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMIsWindowProtected(hwnd.toString(), pfprotected.toString()) as Int) else 0

public actual fun DRMLoadLibrary(henv: UInt, especification: DRMSPECTYPE, wszlibraryprovider: PCWSTR, wszcredentials: PCWSTR, phlibrary: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMLoadLibrary(henv.toInt(), especification, wszlibraryprovider.toString(), wszcredentials.toString(), phlibrary.toString()) as Int) else 0

public actual fun DRMParseUnboundLicense(wszcertificate: PCWSTR, phqueryroot: Long): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMParseUnboundLicense(wszcertificate.toString(), phqueryroot.toString()) as Int) else 0

public actual fun DRMRegisterContent(fregister: BOOL): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMRegisterContent(fregister) as Int) else 0

public actual fun DRMRegisterProtectedWindow(henv: UInt, hwnd: HWND): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMRegisterProtectedWindow(henv.toInt(), hwnd.toString()) as Int) else 0

public actual fun DRMRegisterRevocationList(henv: UInt, wszrevocationlist: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMRegisterRevocationList(henv.toInt(), wszrevocationlist.toString()) as Int) else 0

public actual fun DRMRepair(): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMRepair() as Int) else 0

public actual fun DRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: BOOL, wszname: PCWSTR, wszvalue: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, wszname.toString(), wszvalue.toString()) as Int) else 0

public actual fun DRMSetGlobalOptions(eglobaloptions: DRMGLOBALOPTIONS, pvdata: Long, dwlen: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetGlobalOptions(eglobaloptions, pvdata.toString(), dwlen.toInt()) as Int) else 0

public actual fun DRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt()) as Int) else 0

public actual fun DRMSetMetaData(hissuancelicense: UInt, wszcontentid: PCWSTR, wszcontentidtype: PCWSTR, wszskuid: PCWSTR, wszskuidtype: PCWSTR, wszcontenttype: PCWSTR, wszcontentname: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetMetaData(hissuancelicense.toInt(), wszcontentid.toString(), wszcontentidtype.toString(), wszskuid.toString(), wszskuidtype.toString(), wszcontenttype.toString(), wszcontentname.toString()) as Int) else 0

public actual fun DRMSetNameAndDescription(hissuancelicense: UInt, fdelete: BOOL, lcid: UInt, wszname: PCWSTR, wszdescription: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), wszname.toString(), wszdescription.toString()) as Int) else 0

public actual fun DRMSetRevocationPoint(hissuancelicense: UInt, fdelete: BOOL, wszid: PCWSTR, wszidtype: PCWSTR, wszurl: PCWSTR, pstfrequency: Long, wszname: PCWSTR, wszpublickey: PCWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, wszid.toString(), wszidtype.toString(), wszurl.toString(), pstfrequency.toString(), wszname.toString(), wszpublickey.toString()) as Int) else 0

public actual fun DRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DRM_USAGEPOLICY_TYPE, fdelete: BOOL, fexclusion: BOOL, wszname: PCWSTR, wszminversion: PCWSTR, wszmaxversion: PCWSTR, wszpublickey: PCWSTR, wszdigestalgorithm: PCWSTR, pbdigest: Long, cbdigest: UInt): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, wszname.toString(), wszminversion.toString(), wszmaxversion.toString(), wszpublickey.toString(), wszdigestalgorithm.toString(), pbdigest.toString(), cbdigest.toInt()) as Int) else 0

public actual fun DRMVerify(wszdata: PCWSTR, pcattesteddata: Long, wszattesteddata: PWSTR, petype: Long, pcprincipal: Long, wszprincipal: PWSTR, pcmanifest: Long, wszmanifest: PWSTR): HRESULT =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_DRMVerify(wszdata.toString(), pcattesteddata.toString(), wszattesteddata.toString(), petype.toString(), pcprincipal.toString(), wszprincipal.toString(), pcmanifest.toString(), wszmanifest.toString()) as Int) else 0
