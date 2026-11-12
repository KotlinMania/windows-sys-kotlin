package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public fun interface WsAbandonMessageCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, message: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsAbandonMessageCallback = WsAbandonMessageCallbackFn?

public fun interface WsAbortChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsAbortChannelCallback = WsAbortChannelCallbackFn?

public fun interface WsAbortListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsAbortListenerCallback = WsAbortListenerCallbackFn?

public fun interface WsAcceptChannelCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, channelinstance: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsAcceptChannelCallback = WsAcceptChannelCallbackFn?

public typealias WsAddressingVersion = Int

public fun interface WsAsyncCallbackFn {
    public operator fun invoke(errorcode: Hresult, callbackmodel: WsCallbackModel, callbackstate: ConstPtr)
}

public typealias WsAsyncCallback = WsAsyncCallbackFn?

public fun interface WsAsyncFunctionFn {
    public operator fun invoke(hr: Hresult, callbackmodel: WsCallbackModel, callbackstate: ConstPtr, next: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsAsyncFunction = WsAsyncFunctionFn?

public typealias WsBindingTemplateType = Int

public typealias WsCallbackModel = Int

public typealias WsCallPropertyId = Int

public fun interface WsCertificateValidationCallbackFn {
    public operator fun invoke(certcontext: ConstPtr, state: ConstPtr): Hresult
}

public typealias WsCertificateValidationCallback = WsCertificateValidationCallbackFn?

public typealias WsCertCredentialType = Int

public fun interface WsCertIssuerListNotificationCallbackFn {
    public operator fun invoke(certissuerlistnotificationcallbackstate: ConstPtr, issuerlist: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsCertIssuerListNotificationCallback = WsCertIssuerListNotificationCallbackFn?

public typealias WsChannel = Long

public typealias WsChannelBinding = Int

public typealias WsChannelPropertyId = Int

public typealias WsChannelState = Int

public typealias WsChannelType = Int

public typealias WsCharset = Int

public fun interface WsCloseChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsCloseChannelCallback = WsCloseChannelCallbackFn?

public fun interface WsCloseListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsCloseListenerCallback = WsCloseListenerCallbackFn?

public typealias WsCookieMode = Int

public fun interface WsCreateChannelCallbackFn {
    public operator fun invoke(channeltype: WsChannelType, channelparameters: ConstPtr, channelparameterssize: UInt, channelinstance: MutPtr, error: ConstPtr): Hresult
}

public typealias WsCreateChannelCallback = WsCreateChannelCallbackFn?

public fun interface WsCreateChannelForListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, channelparameters: ConstPtr, channelparameterssize: UInt, channelinstance: MutPtr, error: ConstPtr): Hresult
}

public typealias WsCreateChannelForListenerCallback = WsCreateChannelForListenerCallbackFn?

public fun interface WsCreateDecoderCallbackFn {
    public operator fun invoke(createcontext: ConstPtr, readcallback: WsReadCallback, readcontext: ConstPtr, decodercontext: MutPtr, error: ConstPtr): Hresult
}

public typealias WsCreateDecoderCallback = WsCreateDecoderCallbackFn?

public fun interface WsCreateEncoderCallbackFn {
    public operator fun invoke(createcontext: ConstPtr, writecallback: WsWriteCallback, writecontext: ConstPtr, encodercontext: MutPtr, error: ConstPtr): Hresult
}

public typealias WsCreateEncoderCallback = WsCreateEncoderCallbackFn?

public fun interface WsCreateListenerCallbackFn {
    public operator fun invoke(channeltype: WsChannelType, listenerparameters: ConstPtr, listenerparameterssize: UInt, listenerinstance: MutPtr, error: ConstPtr): Hresult
}

public typealias WsCreateListenerCallback = WsCreateListenerCallbackFn?

public typealias WsDatetimeFormat = Int

public fun interface WsDecoderDecodeCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, buffer: MutPtr, maxlength: UInt, length: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsDecoderDecodeCallback = WsDecoderDecodeCallbackFn?

public fun interface WsDecoderEndCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsDecoderEndCallback = WsDecoderEndCallbackFn?

public fun interface WsDecoderGetContentTypeCallbackFn {
    public operator fun invoke(decodercontext: ConstPtr, contenttype: ConstPtr, contentencoding: ConstPtr, newcontenttype: MutPtr, error: ConstPtr): Hresult
}

public typealias WsDecoderGetContentTypeCallback = WsDecoderGetContentTypeCallbackFn?

public fun interface WsDecoderStartCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsDecoderStartCallback = WsDecoderStartCallbackFn?

public fun interface WsDurationComparisonCallbackFn {
    public operator fun invoke(duration1: ConstPtr, duration2: ConstPtr, result: MutPtr, error: ConstPtr): Hresult
}

public typealias WsDurationComparisonCallback = WsDurationComparisonCallbackFn?

public fun interface WsDynamicStringCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, string: ConstPtr, found: MutPtr, id: MutPtr, error: ConstPtr): Hresult
}

public typealias WsDynamicStringCallback = WsDynamicStringCallbackFn?

public fun interface WsEncoderEncodeCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, buffers: ConstPtr, count: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsEncoderEncodeCallback = WsEncoderEncodeCallbackFn?

public fun interface WsEncoderEndCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsEncoderEndCallback = WsEncoderEndCallbackFn?

public fun interface WsEncoderGetContentTypeCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, contenttype: ConstPtr, newcontenttype: MutPtr, contentencoding: MutPtr, error: ConstPtr): Hresult
}

public typealias WsEncoderGetContentTypeCallback = WsEncoderGetContentTypeCallbackFn?

public fun interface WsEncoderStartCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsEncoderStartCallback = WsEncoderStartCallbackFn?

public typealias WsEncoding = Int

public typealias WsEndpointAddressExtensionType = Int

public typealias WsEndpointIdentityType = Int

public typealias WsEnvelopeVersion = Int

public typealias WsError = Long

public typealias WsErrorPropertyId = Int

public typealias WsExceptionCode = Int

public typealias WsExtendedProtectionPolicy = Int

public typealias WsExtendedProtectionScenario = Int

public typealias WsFaultDisclosure = Int

public typealias WsFaultErrorPropertyId = Int

public typealias WsFieldMapping = Int

public fun interface WsFreeChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr)
}

public typealias WsFreeChannelCallback = WsFreeChannelCallbackFn?

public fun interface WsFreeDecoderCallbackFn {
    public operator fun invoke(decodercontext: ConstPtr)
}

public typealias WsFreeDecoderCallback = WsFreeDecoderCallbackFn?

public fun interface WsFreeEncoderCallbackFn {
    public operator fun invoke(encodercontext: ConstPtr)
}

public typealias WsFreeEncoderCallback = WsFreeEncoderCallbackFn?

public fun interface WsFreeListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr)
}

public typealias WsFreeListenerCallback = WsFreeListenerCallbackFn?

public fun interface WsGetCertCallbackFn {
    public operator fun invoke(getcertcallbackstate: ConstPtr, targetaddress: ConstPtr, viauri: ConstPtr, cert: MutPtr, error: ConstPtr): Hresult
}

public typealias WsGetCertCallback = WsGetCertCallbackFn?

public fun interface WsGetChannelPropertyCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, id: WsChannelPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsGetChannelPropertyCallback = WsGetChannelPropertyCallbackFn?

public fun interface WsGetListenerPropertyCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, id: WsListenerPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsGetListenerPropertyCallback = WsGetListenerPropertyCallbackFn?

public typealias WsHeaderType = Int

public typealias WsHeap = Long

public typealias WsHeapPropertyId = Int

public typealias WsHttpHeaderAuthTarget = Int

public typealias WsHttpProxySettingMode = Int

public fun interface WsHttpRedirectCallbackFn {
    public operator fun invoke(state: ConstPtr, originalurl: ConstPtr, newurl: ConstPtr): Hresult
}

public typealias WsHttpRedirectCallback = WsHttpRedirectCallbackFn?

public typealias WsIpVersion = Int

public fun interface WsIsDefaultValueCallbackFn {
    public operator fun invoke(descriptiondata: ConstPtr, value: ConstPtr, defaultvalue: ConstPtr, valuesize: UInt, isdefault: MutPtr, error: ConstPtr): Hresult
}

public typealias WsIsDefaultValueCallback = WsIsDefaultValueCallbackFn?

public typealias WsListener = Long

public typealias WsListenerPropertyId = Int

public typealias WsListenerState = Int

public typealias WsMessage = Long

public fun interface WsMessageDoneCallbackFn {
    public operator fun invoke(donecallbackstate: ConstPtr)
}

public typealias WsMessageDoneCallback = WsMessageDoneCallbackFn?

public typealias WsMessageInitialization = Int

public typealias WsMessagePropertyId = Int

public typealias WsMessageSecurityUsage = Int

public typealias WsMessageState = Int

public typealias WsMetadata = Long

public typealias WsMetadataExchangeType = Int

public typealias WsMetadataPropertyId = Int

public typealias WsMetadataState = Int

public typealias WsMoveTo = Int

public fun interface WsOpenChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, endpointaddress: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsOpenChannelCallback = WsOpenChannelCallbackFn?

public fun interface WsOpenListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, url: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsOpenListenerCallback = WsOpenListenerCallbackFn?

public fun interface WsOperationCancelCallbackFn {
    public operator fun invoke(reason: WsServiceCancelReason, state: ConstPtr)
}

public typealias WsOperationCancelCallback = WsOperationCancelCallbackFn?

public typealias WsOperationContext = Long

public typealias WsOperationContextPropertyId = Int

public fun interface WsOperationFreeStateCallbackFn {
    public operator fun invoke(state: ConstPtr)
}

public typealias WsOperationFreeStateCallback = WsOperationFreeStateCallbackFn?

public typealias WsOperationStyle = Int

public typealias WsParameterType = Int

public typealias WsPolicy = Long

public typealias WsPolicyExtensionType = Int

public typealias WsPolicyPropertyId = Int

public typealias WsPolicyState = Int

public typealias WsProtectionLevel = Int

public fun interface WsProxyMessageCallbackFn {
    public operator fun invoke(message: ConstPtr, heap: ConstPtr, state: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsProxyMessageCallback = WsProxyMessageCallbackFn?

public typealias WsProxyPropertyId = Int

public fun interface WsPullBytesCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, bytes: MutPtr, maxsize: UInt, actualsize: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsPullBytesCallback = WsPullBytesCallbackFn?

public fun interface WsPushBytesCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsPushBytesCallback = WsPushBytesCallbackFn?

public fun interface WsReadCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, bytes: MutPtr, maxsize: UInt, actualsize: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsReadCallback = WsReadCallbackFn?

public fun interface WsReadMessageEndCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsReadMessageEndCallback = WsReadMessageEndCallbackFn?

public fun interface WsReadMessageStartCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsReadMessageStartCallback = WsReadMessageStartCallbackFn?

public typealias WsReadOption = Int

public fun interface WsReadTypeCallbackFn {
    public operator fun invoke(reader: ConstPtr, typemapping: WsTypeMapping, descriptiondata: ConstPtr, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsReadTypeCallback = WsReadTypeCallbackFn?

public typealias WsReceiveOption = Int

public typealias WsRepeatingHeaderOption = Int

public typealias WsRequestSecurityTokenAction = Int

public typealias WsRequestSecurityTokenPropertyId = Int

public fun interface WsResetChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsResetChannelCallback = WsResetChannelCallbackFn?

public fun interface WsResetListenerCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsResetListenerCallback = WsResetListenerCallbackFn?

public typealias WsSamlAuthenticatorType = Int

public typealias WsSecureConversationVersion = Int

public typealias WsSecureProtocol = Int

public typealias WsSecurityAlgorithmId = Int

public typealias WsSecurityAlgorithmPropertyId = Int

public typealias WsSecurityAlgorithmSuiteName = Int

public typealias WsSecurityBearerKeyTypeVersion = Int

public typealias WsSecurityBindingConstraintType = Int

public typealias WsSecurityBindingPropertyId = Int

public typealias WsSecurityBindingType = Int

public typealias WsSecurityContext = Long

public typealias WsSecurityContextPropertyId = Int

public typealias WsSecurityHeaderLayout = Int

public typealias WsSecurityHeaderVersion = Int

public typealias WsSecurityKeyEntropyMode = Int

public typealias WsSecurityKeyHandleType = Int

public typealias WsSecurityKeyType = Int

public typealias WsSecurityPropertyId = Int

public typealias WsSecurityTimestampUsage = Int

public typealias WsSecurityToken = Long

public typealias WsSecurityTokenPropertyId = Int

public typealias WsSecurityTokenReferenceMode = Int

public fun interface WsServiceAcceptChannelCallbackFn {
    public operator fun invoke(context: ConstPtr, channelstate: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsServiceAcceptChannelCallback = WsServiceAcceptChannelCallbackFn?

public typealias WsServiceCancelReason = Int

public fun interface WsServiceCloseChannelCallbackFn {
    public operator fun invoke(context: ConstPtr, asynccontext: ConstPtr): Hresult
}

public typealias WsServiceCloseChannelCallback = WsServiceCloseChannelCallbackFn?

public typealias WsServiceEndpointPropertyId = Int

public typealias WsServiceHost = Long

public typealias WsServiceHostState = Int

public fun interface WsServiceMessageReceiveCallbackFn {
    public operator fun invoke(context: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsServiceMessageReceiveCallback = WsServiceMessageReceiveCallbackFn?

public typealias WsServicePropertyId = Int

public typealias WsServiceProxy = Long

public typealias WsServiceProxyState = Int

public fun interface WsServiceSecurityCallbackFn {
    public operator fun invoke(context: ConstPtr, authorized: MutPtr, error: ConstPtr): Hresult
}

public typealias WsServiceSecurityCallback = WsServiceSecurityCallbackFn?

public fun interface WsServiceStubCallbackFn {
    public operator fun invoke(context: ConstPtr, frame: ConstPtr, callback: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsServiceStubCallback = WsServiceStubCallbackFn?

public fun interface WsSetChannelPropertyCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, id: WsChannelPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsSetChannelPropertyCallback = WsSetChannelPropertyCallbackFn?

public fun interface WsSetListenerPropertyCallbackFn {
    public operator fun invoke(listenerinstance: ConstPtr, id: WsListenerPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsSetListenerPropertyCallback = WsSetListenerPropertyCallbackFn?

public fun interface WsShutdownSessionChannelCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsShutdownSessionChannelCallback = WsShutdownSessionChannelCallbackFn?

public typealias WsTraceApi = Int

public typealias WsTransferMode = Int

public typealias WsTrustVersion = Int

public typealias WsType = Int

public typealias WsTypeMapping = Int

public typealias WsUrlSchemeType = Int

public typealias WsUsernameCredentialType = Int

public fun interface WsValidatePasswordCallbackFn {
    public operator fun invoke(passwordvalidatorcallbackstate: ConstPtr, username: ConstPtr, password: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsValidatePasswordCallback = WsValidatePasswordCallbackFn?

public fun interface WsValidateSamlCallbackFn {
    public operator fun invoke(samlvalidatorcallbackstate: ConstPtr, samlassertion: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsValidateSamlCallback = WsValidateSamlCallbackFn?

public typealias WsValueType = Int

public typealias WsWindowsIntegratedAuthCredentialType = Int

public typealias WsWindowsIntegratedAuthPackage = Int

public fun interface WsWriteCallbackFn {
    public operator fun invoke(callbackstate: ConstPtr, buffers: ConstPtr, count: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsWriteCallback = WsWriteCallbackFn?

public fun interface WsWriteMessageEndCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsWriteMessageEndCallback = WsWriteMessageEndCallbackFn?

public fun interface WsWriteMessageStartCallbackFn {
    public operator fun invoke(channelinstance: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult
}

public typealias WsWriteMessageStartCallback = WsWriteMessageStartCallbackFn?

public typealias WsWriteOption = Int

public fun interface WsWriteTypeCallbackFn {
    public operator fun invoke(writer: ConstPtr, typemapping: WsTypeMapping, descriptiondata: ConstPtr, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult
}

public typealias WsWriteTypeCallback = WsWriteTypeCallbackFn?

public typealias WsXmlBuffer = Long

public typealias WsXmlBufferPropertyId = Int

public typealias WsXmlCanonicalizationAlgorithm = Int

public typealias WsXmlCanonicalizationPropertyId = Int

public typealias WsXmlNodeType = Int

public typealias WsXmlReader = Long

public typealias WsXmlReaderEncodingType = Int

public typealias WsXmlReaderInputType = Int

public typealias WsXmlReaderPropertyId = Int

public typealias WsXmlSecurityTokenPropertyId = Int

public typealias WsXmlTextType = Int

public typealias WsXmlWriter = Long

public typealias WsXmlWriterEncodingType = Int

public typealias WsXmlWriterOutputType = Int

public typealias WsXmlWriterPropertyId = Int
