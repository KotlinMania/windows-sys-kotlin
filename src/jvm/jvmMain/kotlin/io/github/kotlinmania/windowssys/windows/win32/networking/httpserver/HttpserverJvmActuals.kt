@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32NetworkingHttpserverJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkingHttpserverJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(requestqueuehandle: Long, urlprefix: Long, datachunk: Long, cachepolicy: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(requestqueuehandle: Long, fullyqualifiedurl: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, urlcontext: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(requestqueuehandle: Long, requestid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(requestqueuehandle: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(serversessionid: Long, purlgroupid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(requestqueuehandle: Long, requestid: Long, verb: Int, path: Long, query: Long, headers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(requestqueuehandle: Long, delegatequeuehandle: Long, requestid: Long, delegateurlgroupid: Long, propertyinfosetsize: Int, propertyinfoset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(fullyqualifiedurl: Long, requestqueuehandle: Long, urlgroupid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(requestqueuehandle: Long, urlprefix: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(reserved: Long, flags: Int, url: Long, preparedurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, returnlength: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(servicehandle: Long, configid: Int, pinput: Long, inputlength: Int, poutput: Long, outputlength: Int, preturnlength: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(requestqueuehandle: Long, urlprefix: Long, byterange: Long, buffer: Long, bufferlength: Int, bytesread: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(requestqueuehandle: Long, connectionid: Long, flags: Int, sslclientcertinfo: Long, sslclientcertinfosize: Int, bytesreceived: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(requestqueuehandle: Long, requestid: Long, flags: Int, requestbuffer: Long, requestbufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitybuffer: Long, entitybufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(requestqueuehandle: Long, fullyqualifiedurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(requestqueuehandle: Long, requestid: Long, flags: Int, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitychunkcount: Short, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(requestqueuehandle: Long, id: Long, propertyid: Int, input: Long, inputpropertysize: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpTerminate(flags: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(handle: Long, configid: Int, configinfo: Long, configinfolength: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(requestqueuehandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(requestqueuehandle: Long, connectionid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(requestqueuehandle: Long, connectionid: Long, reserved: Int, overlapped: Long): Int
}

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr<HttpDataChunk>, cachepolicy: ConstPtr<HttpCachePolicy>, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(requestqueuehandle.rawAddress, urlprefix.rawAddress, datachunk.rawAddress, cachepolicy.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(requestqueuehandle.rawAddress, fullyqualifiedurl.rawAddress, reserved.rawAddress).toUInt()

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(urlgroupid.toLong(), pfullyqualifiedurl.rawAddress, urlcontext.toLong(), reserved.toInt()).toUInt()

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(requestqueuehandle.rawAddress, requestid.toLong(), overlapped.rawAddress).toUInt()

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(requestqueuehandle.rawAddress).toUInt()

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid.toLong()).toUInt()

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid.toLong()).toUInt()

public actual fun httpCreateHttpHandle(requestqueuehandle: MutPtr<Handle>, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(requestqueuehandle.rawAddress, reserved.toInt()).toUInt()

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr<SecurityAttributes>, flags: UInt, requestqueuehandle: MutPtr<Handle>): UInt =
    0u

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr<ULong>, reserved: UInt): UInt =
    0u

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr<ULong>, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(serversessionid.toLong(), purlgroupid.rawAddress, reserved.toInt()).toUInt()

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr<HttpRequestHeaders>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(requestqueuehandle.rawAddress, requestid.toLong(), verb, path.rawAddress, query.rawAddress, headers.rawAddress).toUInt()

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr<HttpDelegateRequestPropertyInfo>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(requestqueuehandle.rawAddress, delegatequeuehandle.rawAddress, requestid.toLong(), delegateurlgroupid.toLong(), propertyinfosetsize.toInt(), propertyinfoset.rawAddress).toUInt()

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(servicehandle.rawAddress, configid, pconfiginformation.rawAddress, configinformationlength.toInt(), poverlapped.rawAddress).toUInt()

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr<ULong>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(fullyqualifiedurl.rawAddress, requestqueuehandle.rawAddress, urlgroupid.rawAddress).toUInt()

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(requestqueuehandle.rawAddress, urlprefix.rawAddress, flags.toInt(), overlapped.rawAddress).toUInt()

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr<CVoid>, buffersize: UInt): UInt =
    0u

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    0u

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid)

public actual fun httpPrepareUrl(reserved: ConstPtr<CVoid>, flags: UInt, url: Pcwstr, preparedurl: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(reserved.rawAddress, flags.toInt(), url.rawAddress, preparedurl.rawAddress).toUInt()

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr<UInt>, reserved2: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(requestqueuehandle.rawAddress, property, propertyinformation.rawAddress, propertyinformationlength.toInt(), reserved1.toInt(), returnlength.rawAddress, reserved2.rawAddress).toUInt()

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(serversessionid.toLong(), property, propertyinformation.rawAddress, propertyinformationlength.toInt(), returnlength.rawAddress).toUInt()

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr<CVoid>, inputlength: UInt, poutput: MutPtr<CVoid>, outputlength: UInt, preturnlength: MutPtr<UInt>, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(servicehandle.rawAddress, configid, pinput.rawAddress, inputlength.toInt(), poutput.rawAddress, outputlength.toInt(), preturnlength.rawAddress, poverlapped.rawAddress).toUInt()

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(urlgroupid.toLong(), property, propertyinformation.rawAddress, propertyinformationlength.toInt(), returnlength.rawAddress).toUInt()

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr<HttpByteRange>, buffer: MutPtr<CVoid>, bufferlength: UInt, bytesread: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(requestqueuehandle.rawAddress, urlprefix.rawAddress, byterange.rawAddress, buffer.rawAddress, bufferlength.toInt(), bytesread.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr<HttpSslClientCertInfo>, sslclientcertinfosize: UInt, bytesreceived: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(requestqueuehandle.rawAddress, connectionid.toLong(), flags.toInt(), sslclientcertinfo.rawAddress, sslclientcertinfosize.toInt(), bytesreceived.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr<HttpRequestV2>, requestbufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(requestqueuehandle.rawAddress, requestid.toLong(), flags.toInt(), requestbuffer.rawAddress, requestbufferlength.toInt(), bytesreturned.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr<CVoid>, entitybufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(requestqueuehandle.rawAddress, requestid.toLong(), flags.toInt(), entitybuffer.rawAddress, entitybufferlength.toInt(), bytesreturned.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(requestqueuehandle.rawAddress, fullyqualifiedurl.rawAddress).toUInt()

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(urlgroupid.toLong(), pfullyqualifiedurl.rawAddress, flags.toInt()).toUInt()

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr<HttpResponseV2>, cachepolicy: ConstPtr<HttpCachePolicy>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(requestqueuehandle.rawAddress, requestid.toLong(), flags.toInt(), httpresponse.rawAddress, cachepolicy.rawAddress, bytessent.rawAddress, reserved1.rawAddress, reserved2.toInt(), overlapped.rawAddress, logdata.rawAddress).toUInt()

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr<HttpDataChunk>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(requestqueuehandle.rawAddress, requestid.toLong(), flags.toInt(), entitychunkcount.toShort(), entitychunks.rawAddress, bytessent.rawAddress, reserved1.rawAddress, reserved2.toInt(), overlapped.rawAddress, logdata.rawAddress).toUInt()

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr<CVoid>, inputpropertysize: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(requestqueuehandle.rawAddress, id.toLong(), propertyid, input.rawAddress, inputpropertysize.toInt(), overlapped.rawAddress).toUInt()

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(requestqueuehandle.rawAddress, property, propertyinformation.rawAddress, propertyinformationlength.toInt(), reserved1.toInt(), reserved2.rawAddress).toUInt()

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(serversessionid.toLong(), property, propertyinformation.rawAddress, propertyinformationlength.toInt()).toUInt()

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(servicehandle.rawAddress, configid, pconfiginformation.rawAddress, configinformationlength.toInt(), poverlapped.rawAddress).toUInt()

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(urlgroupid.toLong(), property, propertyinformation.rawAddress, propertyinformationlength.toInt()).toUInt()

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(requestqueuehandle.rawAddress).toUInt()

public actual fun httpTerminate(flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpTerminate(flags.toInt(), preserved.rawAddress).toUInt()

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr<CVoid>, configinfolength: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(handle.rawAddress, configid, configinfo.rawAddress, configinfolength.toInt(), overlapped.rawAddress).toUInt()

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(requestqueuehandle.rawAddress, overlapped.rawAddress).toUInt()

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(requestqueuehandle.rawAddress, connectionid.toLong(), overlapped.rawAddress).toUInt()

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(requestqueuehandle.rawAddress, connectionid.toLong(), reserved.toInt(), overlapped.rawAddress).toUInt()
