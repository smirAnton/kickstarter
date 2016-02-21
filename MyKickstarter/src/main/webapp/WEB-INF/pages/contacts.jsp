<jsp:include page="header.jsp">
	<jsp:param value="Contacts" name="title" />
</jsp:include>

	<div class="container">
        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Contact
                        <strong>Smirnov Anton</strong>
                    </h2>
                    <hr>
                </div>
                <div class="col-md-8">
                	<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2542.7200715579997!2d30.6269914152635!3d50.40905429822854!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40d4c5a85c54c947%3A0xa75106f5dc7abcff!2z0LLRg9C7LiDQkNC90L3QuCDQkNGF0LzQsNGC0L7QstC-0ZcsINCa0LjRl9CyLCDQo9C60YDQsNC40L3QsA!5e0!3m2!1sru!2sru!4v1455219683650" width="700" height="400" style="border:0" ></iframe>
                </div>
                <div class="col-md-4">
                    <p>Phone:
                        <strong>(063)109-38-08</strong>
                    </p>
                    <p>Email:
                        <strong><a href="mailto:smiranton.kiev@gmail.com">smiranton.kiev@gmail.com</a></strong>
                    </p>
                    <p>Address:
                        <strong>33 Anna Akhmatova street
                            <br>Kiev, Ukraine 02068</strong>
                    </p>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Contact
                        <strong>form</strong>
                    </h2>
                    <hr>
                    <p>Please contact me in any convenient to you time.</p>
                    <form method="post" action="./email">
                        <div class="row">
                            <div class="form-group col-lg-4">
                                <label>Name</label>
                                <input type="text" class="form-control" name="name">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Email Address</label>
                                <input type="email" class="form-control" name="emailAddress">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Phone Number</label>
                                <input type="tel" class="form-control" name="phoneNumber">
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group col-lg-12">
                                <label>Message</label>
                                <textarea class="form-control" rows="6" name="messageText"></textarea>
                            </div>
                            <div class="form-group col-lg-12">
                                <input type="hidden" name="save" value="contact">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <footer>
	    <script src="<c:url value="/resources/js/jquery.js" />"></script>
	    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </footer>
    
<jsp:include page="footer.jsp"></jsp:include>