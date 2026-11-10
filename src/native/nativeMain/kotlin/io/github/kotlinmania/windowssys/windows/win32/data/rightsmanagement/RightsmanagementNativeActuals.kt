@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(hlicensestorage, wszlicense?.value?.toCPointer<ByteVar>(), wszurl?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: COpaquePointer?, ctemplates: UInt, pwsztemplateids: COpaquePointer?, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(hclient, uflags, pvreserved?.value?.toCPointer<ByteVar>(), ctemplates, pwsztemplateids?.value?.toCPointer<ByteVar>(), wszurl?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(hsession, uflags, wszgroupidentitycredential?.value?.toCPointer<ByteVar>(), wszrequestedrights?.value?.toCPointer<ByteVar>(), wszcustomdata?.value?.toCPointer<ByteVar>(), wszurl?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: COpaquePointer?, pvcontext: COpaquePointer?, hparentwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMActivate(hclient, uflags, ulangid, pactservinfo?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), hparentwnd?.value?.toCPointer<ByteVar>())

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(hlicensestorage, uflags, wszlicense?.value?.toCPointer<ByteVar>())

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(hissuancelicense, hright, huser)

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: COpaquePointer?, wszattestedblob: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMAttest(henablingprincipal, wszdata?.value?.toCPointer<ByteVar>(), etype, pcattestedblob?.value?.toCPointer<ByteVar>(), wszattestedblob?.value?.toCPointer<ByteVar>())

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(henv, clevel)

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(hissuancelicense)

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(henv)

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(handle)

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(hpub)

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(hquery)

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(hsession)

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: COpaquePointer?, pcchain: COpaquePointer?, wszchain: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(ccertificates, rgwszcertificates?.value?.toCPointer<ByteVar>(), pcchain?.value?.toCPointer<ByteVar>(), wszchain?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: COpaquePointer?, wszlicensechain: Pcwstr, phboundlicense: COpaquePointer?, pherrorlog: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(henv, pparams?.value?.toCPointer<ByteVar>(), wszlicensechain?.value?.toCPointer<ByteVar>(), phboundlicense?.value?.toCPointer<ByteVar>(), pherrorlog?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(0L.toCPointer<ByteVar>(), ucallbackversion, wszgroupidprovidertype?.value?.toCPointer<ByteVar>(), wszgroupid?.value?.toCPointer<ByteVar>(), phclient?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(hboundlicense, wszright?.value?.toCPointer<ByteVar>(), hauxlib, wszauxplug?.value?.toCPointer<ByteVar>(), phdecryptor?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(hboundlicense, wszright?.value?.toCPointer<ByteVar>(), hauxlib, wszauxplug?.value?.toCPointer<ByteVar>(), phencryptor?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: COpaquePointer?, wszcredentials: Pcwstr, phenablingprincipal: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(henv, hlibrary, wszobject?.value?.toCPointer<ByteVar>(), pidprincipal?.value?.toCPointer<ByteVar>(), wszcredentials?.value?.toCPointer<ByteVar>(), phenablingprincipal?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateIssuanceLicense(psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense(psttimefrom?.value?.toCPointer<ByteVar>(), psttimeuntil?.value?.toCPointer<ByteVar>(), wszreferralinfoname?.value?.toCPointer<ByteVar>(), wszreferralinfourl?.value?.toCPointer<ByteVar>(), howner, wszissuancelicense?.value?.toCPointer<ByteVar>(), hboundlicense, phissuancelicense?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(henv, hdefaultlibrary, hclient, uflags, wszissuancelicense?.value?.toCPointer<ByteVar>(), phlicensestorage?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?, cextendedinfo: UInt, pwszextendedinfoname: COpaquePointer?, pwszextendedinfovalue: COpaquePointer?, phright: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateRight(wszrightname?.value?.toCPointer<ByteVar>(), pstfrom?.value?.toCPointer<ByteVar>(), pstuntil?.value?.toCPointer<ByteVar>(), cextendedinfo, pwszextendedinfoname?.value?.toCPointer<ByteVar>(), pwszextendedinfovalue?.value?.toCPointer<ByteVar>(), phright?.value?.toCPointer<ByteVar>())

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMCreateUser(wszusername?.value?.toCPointer<ByteVar>(), wszuserid?.value?.toCPointer<ByteVar>(), wszuseridtype?.value?.toCPointer<ByteVar>(), phuser?.value?.toCPointer<ByteVar>())

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: COpaquePointer?, pbdecodeddata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDecode(wszalgid?.value?.toCPointer<ByteVar>(), wszencodedstring?.value?.toCPointer<ByteVar>(), pudecodeddatalen?.value?.toCPointer<ByteVar>(), pbdecodeddata?.value?.toCPointer<ByteVar>())

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: COpaquePointer?, wszcert: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain(wszchain?.value?.toCPointer<ByteVar>(), iwhich, pccert?.value?.toCPointer<ByteVar>(), wszcert?.value?.toCPointer<ByteVar>())

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(hcryptoprovider, iposition, cnuminbytes, pbindata?.value?.toCPointer<ByteVar>(), pcnumoutbytes?.value?.toCPointer<ByteVar>(), pboutdata?.value?.toCPointer<ByteVar>())

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(hsession, wszlicenseid?.value?.toCPointer<ByteVar>())

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(htocopy, phcopy?.value?.toCPointer<ByteVar>())

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(htocopy, phcopy?.value?.toCPointer<ByteVar>())

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(hpubin, phpubout?.value?.toCPointer<ByteVar>())

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(hsessionin, phsessionout?.value?.toCPointer<ByteVar>())

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: COpaquePointer?, puencodedstringlen: COpaquePointer?, wszencodedstring: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMEncode(wszalgid?.value?.toCPointer<ByteVar>(), udatalen, pbdecodeddata?.value?.toCPointer<ByteVar>(), puencodedstringlen?.value?.toCPointer<ByteVar>(), wszencodedstring?.value?.toCPointer<ByteVar>())

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(hcryptoprovider, iposition, cnuminbytes, pbindata?.value?.toCPointer<ByteVar>(), pcnumoutbytes?.value?.toCPointer<ByteVar>(), pboutdata?.value?.toCPointer<ByteVar>())

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: COpaquePointer?, pucertificatedatalen: COpaquePointer?, wszcertificatedata: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(hsession, uflags, uindex, pfsharedflag?.value?.toCPointer<ByteVar>(), pucertificatedatalen?.value?.toCPointer<ByteVar>(), wszcertificatedata?.value?.toCPointer<ByteVar>())

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: COpaquePointer?, wszname: Pwstr, puvaluelength: COpaquePointer?, wszvalue: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(hissuancelicense, uindex, punamelength?.value?.toCPointer<ByteVar>(), wszname?.value?.toCPointer<ByteVar>(), puvaluelength?.value?.toCPointer<ByteVar>(), wszvalue?.value?.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(hqueryroot, wszattribute?.value?.toCPointer<ByteVar>(), iwhich, peencoding?.value?.toCPointer<ByteVar>(), pcbuffer?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(hqueryroot, wszattribute?.value?.toCPointer<ByteVar>(), pcattributes?.value?.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(hqueryroot, wszsubobjecttype?.value?.toCPointer<ByteVar>(), iwhich, phsubobject?.value?.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(hqueryroot, wszsubobjecttype?.value?.toCPointer<ByteVar>(), pcsubobjects?.value?.toCPointer<ByteVar>())

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount(wszchain?.value?.toCPointer<ByteVar>(), pccertcount?.value?.toCPointer<ByteVar>())

public actual fun dRMGetClientVersion(pdrmclientversioninfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion(pdrmclientversioninfo?.value?.toCPointer<ByteVar>())

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(handle, wszattribute?.value?.toCPointer<ByteVar>(), peencoding?.value?.toCPointer<ByteVar>(), pcbuffer?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>())

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(handle, wszattribute?.value?.toCPointer<ByteVar>(), peencoding?.value?.toCPointer<ByteVar>(), pcbuffer?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>())

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(hissuancelicense, pcdays?.value?.toCPointer<ByteVar>())

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, uflags: UInt, pudistributionpointnamelength: COpaquePointer?, wszdistributionpointname: Pwstr, pudistributionpointurllength: COpaquePointer?, wszdistributionpointurl: Pwstr, phowner: COpaquePointer?, pfofficial: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(hissuancelicense, psttimefrom?.value?.toCPointer<ByteVar>(), psttimeuntil?.value?.toCPointer<ByteVar>(), uflags, pudistributionpointnamelength?.value?.toCPointer<ByteVar>(), wszdistributionpointname?.value?.toCPointer<ByteVar>(), pudistributionpointurllength?.value?.toCPointer<ByteVar>(), wszdistributionpointurl?.value?.toCPointer<ByteVar>(), phowner?.value?.toCPointer<ByteVar>(), pfofficial?.value?.toCPointer<ByteVar>())

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: COpaquePointer?, wszissuancelicensetemplate: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(hissuancelicense, puissuancelicensetemplatelength?.value?.toCPointer<ByteVar>(), wszissuancelicensetemplate?.value?.toCPointer<ByteVar>())

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: COpaquePointer?, wszcontentid: Pwstr, pucontentidtypelength: COpaquePointer?, wszcontentidtype: Pwstr, puskuidlength: COpaquePointer?, wszskuid: Pwstr, puskuidtypelength: COpaquePointer?, wszskuidtype: Pwstr, pucontenttypelength: COpaquePointer?, wszcontenttype: Pwstr, pucontentnamelength: COpaquePointer?, wszcontentname: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(hissuancelicense, pucontentidlength?.value?.toCPointer<ByteVar>(), wszcontentid?.value?.toCPointer<ByteVar>(), pucontentidtypelength?.value?.toCPointer<ByteVar>(), wszcontentidtype?.value?.toCPointer<ByteVar>(), puskuidlength?.value?.toCPointer<ByteVar>(), wszskuid?.value?.toCPointer<ByteVar>(), puskuidtypelength?.value?.toCPointer<ByteVar>(), wszskuidtype?.value?.toCPointer<ByteVar>(), pucontenttypelength?.value?.toCPointer<ByteVar>(), wszcontenttype?.value?.toCPointer<ByteVar>(), pucontentnamelength?.value?.toCPointer<ByteVar>(), wszcontentname?.value?.toCPointer<ByteVar>())

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pudescriptionlength: COpaquePointer?, wszdescription: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(hissuancelicense, uindex, pulcid?.value?.toCPointer<ByteVar>(), punamelength?.value?.toCPointer<ByteVar>(), wszname?.value?.toCPointer<ByteVar>(), pudescriptionlength?.value?.toCPointer<ByteVar>(), wszdescription?.value?.toCPointer<ByteVar>())

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: COpaquePointer?, wszownerlicense: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(hissuancelicense, puownerlicenselength?.value?.toCPointer<ByteVar>(), wszownerlicense?.value?.toCPointer<ByteVar>())

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(hlibrary, wszprocname?.value?.toCPointer<ByteVar>(), ppfnprocaddress?.value?.toCPointer<ByteVar>())

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: COpaquePointer?, wszid: Pwstr, puidtypelength: COpaquePointer?, wszidtype: Pwstr, puurllength: COpaquePointer?, wszrl: Pwstr, pstfrequency: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(hissuancelicense, puidlength?.value?.toCPointer<ByteVar>(), wszid?.value?.toCPointer<ByteVar>(), puidtypelength?.value?.toCPointer<ByteVar>(), wszidtype?.value?.toCPointer<ByteVar>(), puurllength?.value?.toCPointer<ByteVar>(), wszrl?.value?.toCPointer<ByteVar>(), pstfrequency?.value?.toCPointer<ByteVar>(), punamelength?.value?.toCPointer<ByteVar>(), wszname?.value?.toCPointer<ByteVar>(), pupublickeylength?.value?.toCPointer<ByteVar>(), wszpublickey?.value?.toCPointer<ByteVar>())

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: COpaquePointer?, wszextendedinfoname: Pwstr, puextendedinfovaluelength: COpaquePointer?, wszextendedinfovalue: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(hright, uindex, puextendedinfonamelength?.value?.toCPointer<ByteVar>(), wszextendedinfoname?.value?.toCPointer<ByteVar>(), puextendedinfovaluelength?.value?.toCPointer<ByteVar>(), wszextendedinfovalue?.value?.toCPointer<ByteVar>())

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: COpaquePointer?, wszrightname: Pwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(hright, purightnamelength?.value?.toCPointer<ByteVar>(), wszrightname?.value?.toCPointer<ByteVar>(), pstfrom?.value?.toCPointer<ByteVar>(), pstuntil?.value?.toCPointer<ByteVar>())

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: COpaquePointer?, wsztype: Pwstr, pupathlen: COpaquePointer?, wszpath: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uflags, putypelen?.value?.toCPointer<ByteVar>(), wsztype?.value?.toCPointer<ByteVar>(), pupathlen?.value?.toCPointer<ByteVar>(), wszpath?.value?.toCPointer<ByteVar>())

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: COpaquePointer?, wszserviceurl: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(hclient, uservicetype, uservicelocation, wszissuancelicense?.value?.toCPointer<ByteVar>(), puserviceurllength?.value?.toCPointer<ByteVar>(), wszserviceurl?.value?.toCPointer<ByteVar>())

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(henv, hissuancelicense, uflags, pbsymkey?.value?.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype?.value?.toCPointer<ByteVar>(), wszclientlicensorcertificate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), wszurl?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: COpaquePointer?, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(henv, hissuancelicense, uflags, pbsymkey?.value?.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>(), henablingprincipal, hboundlicenseclc, 0L.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetTime(henv, etimeridtype, potimeobject?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(hqueryroot, wszattributetype?.value?.toCPointer<ByteVar>(), iwhich, peencoding?.value?.toCPointer<ByteVar>(), pcbuffer?.value?.toCPointer<ByteVar>(), pbbuffer?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(hqueryroot, wszattributetype?.value?.toCPointer<ByteVar>(), pcattributes?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(hqueryroot, wszsubobjecttype?.value?.toCPointer<ByteVar>(), iindex, phsubquery?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(hqueryroot, wszsubobjecttype?.value?.toCPointer<ByteVar>(), pcsubobjects?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: COpaquePointer?, pfexclusion: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, puminversionlength: COpaquePointer?, wszminversion: Pwstr, pumaxversionlength: COpaquePointer?, wszmaxversion: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr, pudigestalgorithmlength: COpaquePointer?, wszdigestalgorithm: Pwstr, pcbdigest: COpaquePointer?, pbdigest: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(hissuancelicense, uindex, peusagepolicytype?.value?.toCPointer<ByteVar>(), pfexclusion?.value?.toCPointer<ByteVar>(), punamelength?.value?.toCPointer<ByteVar>(), wszname?.value?.toCPointer<ByteVar>(), puminversionlength?.value?.toCPointer<ByteVar>(), wszminversion?.value?.toCPointer<ByteVar>(), pumaxversionlength?.value?.toCPointer<ByteVar>(), wszmaxversion?.value?.toCPointer<ByteVar>(), pupublickeylength?.value?.toCPointer<ByteVar>(), wszpublickey?.value?.toCPointer<ByteVar>(), pudigestalgorithmlength?.value?.toCPointer<ByteVar>(), wszdigestalgorithm?.value?.toCPointer<ByteVar>(), pcbdigest?.value?.toCPointer<ByteVar>(), pbdigest?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: COpaquePointer?, wszusername: Pwstr, puuseridlength: COpaquePointer?, wszuserid: Pwstr, puuseridtypelength: COpaquePointer?, wszuseridtype: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(huser, puusernamelength?.value?.toCPointer<ByteVar>(), wszusername?.value?.toCPointer<ByteVar>(), puuseridlength?.value?.toCPointer<ByteVar>(), wszuserid?.value?.toCPointer<ByteVar>(), puuseridtypelength?.value?.toCPointer<ByteVar>(), wszuseridtype?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(hissuancelicense, huser, uindex, phright?.value?.toCPointer<ByteVar>())

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(hissuancelicense, uindex, phuser?.value?.toCPointer<ByteVar>())

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: COpaquePointer?, phdefaultlibrary: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider?.value?.toCPointer<ByteVar>(), wszmanifestcredentials?.value?.toCPointer<ByteVar>(), wszmachinecredentials?.value?.toCPointer<ByteVar>(), phenv?.value?.toCPointer<ByteVar>(), phdefaultlibrary?.value?.toCPointer<ByteVar>())

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(hclient, uflags, pactservinfo?.value?.toCPointer<ByteVar>())

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected(hwnd?.value?.toCPointer<ByteVar>(), pfprotected?.value?.toCPointer<ByteVar>())

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(henv, especification, wszlibraryprovider?.value?.toCPointer<ByteVar>(), wszcredentials?.value?.toCPointer<ByteVar>(), phlibrary?.value?.toCPointer<ByteVar>())

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense(wszcertificate?.value?.toCPointer<ByteVar>(), phqueryroot?.value?.toCPointer<ByteVar>())

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(fregister)

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(henv, hwnd?.value?.toCPointer<ByteVar>())

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(henv, wszrevocationlist?.value?.toCPointer<ByteVar>())

public actual fun dRMRepair(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMRepair()

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(hissuancelicense, fdelete, wszname?.value?.toCPointer<ByteVar>(), wszvalue?.value?.toCPointer<ByteVar>())

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: COpaquePointer?, dwlen: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(eglobaloptions, pvdata?.value?.toCPointer<ByteVar>(), dwlen)

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(hissuancelicense, cdays)

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(hissuancelicense, wszcontentid?.value?.toCPointer<ByteVar>(), wszcontentidtype?.value?.toCPointer<ByteVar>(), wszskuid?.value?.toCPointer<ByteVar>(), wszskuidtype?.value?.toCPointer<ByteVar>(), wszcontenttype?.value?.toCPointer<ByteVar>(), wszcontentname?.value?.toCPointer<ByteVar>())

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(hissuancelicense, fdelete, lcid, wszname?.value?.toCPointer<ByteVar>(), wszdescription?.value?.toCPointer<ByteVar>())

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: COpaquePointer?, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(hissuancelicense, fdelete, wszid?.value?.toCPointer<ByteVar>(), wszidtype?.value?.toCPointer<ByteVar>(), wszurl?.value?.toCPointer<ByteVar>(), pstfrequency?.value?.toCPointer<ByteVar>(), wszname?.value?.toCPointer<ByteVar>(), wszpublickey?.value?.toCPointer<ByteVar>())

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: COpaquePointer?, cbdigest: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(hissuancelicense, eusagepolicytype, fdelete, fexclusion, wszname?.value?.toCPointer<ByteVar>(), wszminversion?.value?.toCPointer<ByteVar>(), wszmaxversion?.value?.toCPointer<ByteVar>(), wszpublickey?.value?.toCPointer<ByteVar>(), wszdigestalgorithm?.value?.toCPointer<ByteVar>(), pbdigest?.value?.toCPointer<ByteVar>(), cbdigest)

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: COpaquePointer?, wszattesteddata: Pwstr, petype: COpaquePointer?, pcprincipal: COpaquePointer?, wszprincipal: Pwstr, pcmanifest: COpaquePointer?, wszmanifest: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssys_windows_win32_data_rightsmanagement_dRMVerify(wszdata?.value?.toCPointer<ByteVar>(), pcattesteddata?.value?.toCPointer<ByteVar>(), wszattesteddata?.value?.toCPointer<ByteVar>(), petype?.value?.toCPointer<ByteVar>(), pcprincipal?.value?.toCPointer<ByteVar>(), wszprincipal?.value?.toCPointer<ByteVar>(), pcmanifest?.value?.toCPointer<ByteVar>(), wszmanifest?.value?.toCPointer<ByteVar>())
