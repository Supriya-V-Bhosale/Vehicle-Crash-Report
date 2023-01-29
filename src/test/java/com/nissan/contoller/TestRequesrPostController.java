//package com.nissan.contoller;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.nissan.ib4.controllers.RequestController;
//import com.nissan.ib4.entities.Request;
//import com.nissan.ib4.services.RequestService;
//
//@RunWith(MockitoJUnitRunner.class)
//public class TestRequesrPostController {
//	@InjectMocks
//    private RequestController requestController;
//
//    @Mock
//    private RequestService requestService;
//    
//    @Test
//    public void testSendRequest() {
//        Request request = new Request();
//        request.setId(1);
//        
//
//        Mockito.doNothing().when(requestService).sendRequest(request);
//        Request result = requestController.sendRequest(request);
//
//        assertNotNull(result);
//        assertEquals(1, result.getId());
//       
//    }
//
//}
